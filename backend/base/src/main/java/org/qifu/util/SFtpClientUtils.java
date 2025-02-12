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
	protected static Logger logger = LoggerFactory.getLogger(SFtpClientUtils.class);
	private static JSch jsch=new JSch();
	
	protected SFtpClientUtils() {
		throw new IllegalStateException("Utils class: SFtpClientUtils");
	}
	
	private static Session getSession(String user, String password, String addr, int port) throws JSchException {
		Session session = jsch.getSession(user, addr, port);
		session.setConfig("StrictHostKeyChecking", "no");
		session.setPassword(password);
		session.connect();
		return session;
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
	 * @throws Exception
	 */
	public static Vector<LsEntry> getRemoteFileList(String user, String password, String addr, int port) throws JSchException, SftpException {		
		return getRemoteFileList(user, password, addr, port, ".");
	}
	
	@SuppressWarnings("unchecked")
	public static Vector<LsEntry> getRemoteFileList(String user, String password, String addr, int port, String cwd) throws JSchException, SftpException {
		Session session = getSession(user, password, addr, port);	
		Vector<LsEntry> lsVec=null;
		Channel channel = session.openChannel("sftp");
		channel.connect();
		ChannelSftp sftpChannel = (ChannelSftp) channel;
		try {
			lsVec = sftpChannel.ls(cwd); //sftpChannel.lpwd()
		} catch (SftpException e) {
			e.printStackTrace();
			throw e;
		} finally {
			sftpChannel.exit();
			channel.disconnect();
			session.disconnect();			
		}	
		return lsVec;		
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
	 * @throws Exception
	 */
	public static void get(String user, String password, String addr, int port, 
			String remoteFile, String localFile) throws JSchException, SftpException, IOException {
				
		Session session = getSession(user, password, addr, port);
		Channel channel = session.openChannel("sftp");
		channel.connect();
		ChannelSftp sftpChannel = (ChannelSftp) channel;		
		logger.info("get remote file: {} write to: {}", remoteFile , localFile );	
		try {
			sftpChannel.get(remoteFile, localFile);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			sftpChannel.exit();
			channel.disconnect();
			session.disconnect();			
		}
		File f=new File(localFile);
		if (!f.exists()) {
			f=null;
			logger.error("get remote file: {} fail!", remoteFile);
			throw new IOException("no remote file:" + remoteFile);
		}
		f=null;
		logger.info("success write: {}", localFile);
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
	 * @throws Exception
	 */
	public static void get(String user, String password, String addr, int port, 
			List<String> remoteFile, List<String> localFile) throws JSchException, SftpException, IOException {
				
		Session session = getSession(user, password, addr, port);	
		Channel channel = session.openChannel("sftp");
		channel.connect();
		ChannelSftp sftpChannel = (ChannelSftp) channel;		
		try {
			for (int i=0; i<remoteFile.size(); i++) {
				String rf=remoteFile.get(i);
				String lf=localFile.get(i);
				logger.info("get remote file: {} write to: {}", rf, lf );
				sftpChannel.get(rf, lf);
				File f=new File(lf);
				if (!f.exists()) {
					f=null;
					logger.error("get remote file: {} fail!", rf);
					throw new IOException("no remote file:" + rf);
				}
				f=null;
				logger.info("success write: {}", lf);
			}
		} catch (SftpException e) {
			e.printStackTrace();
			throw e;
		} finally {
			sftpChannel.exit();
			channel.disconnect();
			session.disconnect();				
		}
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
	 * @throws Exception
	 */
	public static void put(String user, String password, String addr, int port,
			List<String> localFile, List<String> remoteFile) throws JSchException, SftpException {
		
		Session session = getSession(user, password, addr, port);	
		Channel channel = session.openChannel("sftp");
		channel.connect();
		ChannelSftp sftpChannel = (ChannelSftp) channel;		
		try {
			for (int i=0; i<localFile.size(); i++) {
				String rf=remoteFile.get(i);
				String lf=localFile.get(i);
				logger.info("put local file: {} write to {} : {}", lf, addr, rf );
				sftpChannel.put(lf, rf);
				logger.info("success write to {} : {}", addr, rf);
			}
		} catch (SftpException e) {
			e.printStackTrace();
			throw e;
		} finally {
			sftpChannel.exit();
			channel.disconnect();
			session.disconnect();				
		}		
	}
	
	public static void rm(String user, String password, String addr, int port, List<String> fileName) throws JSchException, SftpException {
		
		if (CollectionUtils.isEmpty(fileName)) {
			return;
		}
		Session session = getSession(user, password, addr, port);				
		Channel channel = session.openChannel("sftp");
		channel.connect();
		ChannelSftp sftpChannel = (ChannelSftp) channel;		
		try {
			for (String f : fileName) {
				sftpChannel.rm(f);				
				logger.warn("success remove file from {} : {}", addr , fileName);				
			}
		} catch (SftpException e) {
			e.printStackTrace();
			throw e;
		} finally {
			sftpChannel.exit();
			channel.disconnect();
			session.disconnect();				
		}		
	}
	
}
