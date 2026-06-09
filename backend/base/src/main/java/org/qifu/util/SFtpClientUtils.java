/* 
 * Copyright 2012-2016 bambooCORE, greenstep of copyright Chen Xin Nien
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.util;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Vector;

import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.ChannelSftp.LsEntry;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;

public class SFtpClientUtils {
	protected static final Logger logger = LoggerFactory.getLogger(SFtpClientUtils.class);
	private static final JSch jsch = new JSch();

	protected SFtpClientUtils() {
		throw new IllegalStateException("Utils class: SFtpClientUtils");
	}

	@FunctionalInterface
	private interface SftpAction<T> {
		T execute(ChannelSftp sftp) throws SftpException, IOException;
	}

	private static <T> T execute(String user, String password, String addr, int port, SftpAction<T> action)
			throws JSchException, SftpException, IOException {
		Session session = null;
		Channel channel = null;
		ChannelSftp sftp = null;
		try {
			session = jsch.getSession(user, addr, port);
			session.setConfig("StrictHostKeyChecking", "no");
			session.setPassword(password.getBytes());
			session.connect();

			channel = session.openChannel("sftp");
			channel.connect();
			sftp = (ChannelSftp) channel;

			return action.execute(sftp);
		} catch (JSchException | SftpException | IOException e) {
			logger.error("SFTP error: {}", e.getMessage(), e);
			throw e;
		} finally {
			if (sftp != null) {
				sftp.exit();
			}
			if (channel != null) {
				channel.disconnect();
			}
			if (session != null) {
				session.disconnect();
			}
		}
	}

	/**
	 * 登入的目錄夾下的檔案清單
	 * 
	 * @param user
	 * @param password
	 * @param addr
	 * @param port
	 * @return
	 * @throws JSchException
	 * @throws SftpException
	 */
	public static Vector<LsEntry> getRemoteFileList(String user, String password, String addr, int port)
			throws JSchException, SftpException {
		try {
			return getRemoteFileList(user, password, addr, port, ".");
		} catch (IOException e) {
			// This shouldn't happen for ls "."
			return new Vector<>();
		}
	}
	
	public static Vector<LsEntry> getRemoteFileList(String user, String password, String addr, int port, String cwd)
			throws JSchException, SftpException, IOException {
		return execute(user, password, addr, port, sftp -> (Vector<LsEntry>) sftp.ls(cwd));
	}

	/**
	 * 抓遠端檔案然後存到本機 , 單筆
	 * 
	 * @param user
	 * @param password
	 * @param addr
	 * @param port
	 * @param remoteFile
	 * @param localFile
	 * @throws JSchException
	 * @throws SftpException
	 * @throws IOException
	 */
	public static void get(String user, String password, String addr, int port, String remoteFile, String localFile)
			throws JSchException, SftpException, IOException {

		execute(user, password, addr, port, sftp -> {
			logger.info("get remote file: {} write to: {}", remoteFile, localFile);
			sftp.get(remoteFile, localFile);
			File f = new File(localFile);
			if (!f.exists()) {
				logger.error("get remote file: {} fail!", remoteFile);
				throw new IOException("Failed to download remote file: " + remoteFile);
			}
			logger.info("success write: {}", localFile);
			return null;
		});
	}

	/**
	 * 抓遠端檔案然後存到本機 , 多筆
	 * 
	 * @param user
	 * @param password
	 * @param addr
	 * @param port
	 * @param remoteFile
	 * @param localFile
	 * @throws JSchException
	 * @throws SftpException
	 * @throws IOException
	 */
	public static void get(String user, String password, String addr, int port, List<String> remoteFile,
			List<String> localFile) throws JSchException, SftpException, IOException {

		if (CollectionUtils.isEmpty(remoteFile) || CollectionUtils.isEmpty(localFile)
				|| remoteFile.size() != localFile.size()) {
			throw new IllegalArgumentException("Invalid file lists.");
		}

		execute(user, password, addr, port, sftp -> {
			for (int i = 0; i < remoteFile.size(); i++) {
				String rf = remoteFile.get(i);
				String lf = localFile.get(i);
				logger.info("get remote file: {} write to: {}", rf, lf);
				sftp.get(rf, lf);
				File f = new File(lf);
				if (!f.exists()) {
					logger.error("get remote file: {} fail!", rf);
					throw new IOException("Failed to download remote file: " + rf);
				}
				logger.info("success write: {}", lf);
			}
			return null;
		});
	}

	/**
	 * 本地檔案放到遠端SFTP上
	 * 
	 * @param user
	 * @param password
	 * @param addr
	 * @param port
	 * @param localFile
	 * @param remoteFile
	 * @throws JSchException
	 * @throws SftpException
	 */
	public static void put(String user, String password, String addr, int port, List<String> localFile,
			List<String> remoteFile) throws JSchException, SftpException {

		if (CollectionUtils.isEmpty(localFile) || CollectionUtils.isEmpty(remoteFile)
				|| localFile.size() != remoteFile.size()) {
			logger.warn("Invalid file lists for put operation.");
			return;
		}
		try {
			execute(user, password, addr, port, sftp -> {
				for (int i = 0; i < localFile.size(); i++) {
					String rf = remoteFile.get(i);
					String lf = localFile.get(i);
					logger.info("put local file: {} write to {} : {}", lf, addr, rf);
					sftp.put(lf, rf);
					logger.info("success write to {} : {}", addr, rf);
				}
				return null;
			});
		} catch (IOException e) {
			// put doesn't throw IOException in original but execute might, wrap it if
			// needed
			throw new SftpException(ChannelSftp.SSH_FX_FAILURE, e.getMessage(), e);
		}
	}

	public static void rm(String user, String password, String addr, int port, List<String> fileName)
			throws JSchException, SftpException {

		if (CollectionUtils.isEmpty(fileName)) {
			return;
		}

		try {
			execute(user, password, addr, port, sftp -> {
				for (String f : fileName) {
					sftp.rm(f);
					logger.warn("success remove file from {} : {}", addr, f);
				}
				return null;
			});
		} catch (IOException e) {
			throw new SftpException(ChannelSftp.SSH_FX_FAILURE, e.getMessage(), e);
		}
	}

}
