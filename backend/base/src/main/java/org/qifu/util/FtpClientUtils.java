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
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FtpClientUtils implements AutoCloseable {
	/*
	 * RFC-1123 A Server-FTP process SHOULD have an idle timeout, which will
	 * terminate the process and close the control connection if the server is
	 * inactive (i.e., no command or data transfer in progress) for a long period of
	 * time. The idle timeout time SHOULD be configurable, and the default should be
	 * at least 5 minutes.
	 */
	public static final int TIME_OUT = 30000; // 30秒
	private static final Logger logger = LoggerFactory.getLogger(FtpClientUtils.class);

	protected FTPClient ftpClient;
	private String ftpserver = "";
	private String ftpuser = "";
	private String ftppass = "";
	private File storeDir;

	public FtpClientUtils() {
		ftpClient = new FTPClient();
		ftpClient.setBufferSize(1024 * 100); // 100KB
	}

	public String getFtpserver() {
		return ftpserver;
	}

	public void setFtpserver(String ftpserver) {
		this.ftpserver = ftpserver;
	}

	public String getFtpuser() {
		return ftpuser;
	}

	public void setFtpuser(String ftpuser) {
		this.ftpuser = ftpuser;
	}

	public String getFtppass() {
		return ftppass;
	}

	public void setFtppass(String ftppass) {
		this.ftppass = ftppass;
	}

	public File getStoreDir() {
		return storeDir;
	}

	public void setStoreDir(File storeDir) {
		this.storeDir = storeDir;
	}

	private void ensureConnected() throws IOException {
		if (ftpClient == null || !ftpClient.isConnected()) {
			restConnection();
		}
	}

	public void restConnection() throws IOException {
		if (StringUtils.isBlank(this.ftpserver)) {
			throw new IOException("FTP server address is blank.");
		}
		this.ftpClient.connect(this.ftpserver);
		this.ftpClient.setConnectTimeout(TIME_OUT);
		this.ftpClient.login(this.ftpuser, this.ftppass);
		this.ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
	}

	public void get() throws IOException {
		this.get(ftpserver, ftpuser, ftppass, "", storeDir, false);
	}

	/**
	 * 把目錄下的檔案抓下來,如果有權限
	 * 
	 * @param ftpserver     FTP domain-name 或 IP
	 * @param ftpuser       FTP user
	 * @param ftppass       FTP 密碼
	 * @param cwdDirectory  cd 目錄
	 * @param storeDir      本地端目錄
	 * @param deleteFtpFile 是否刪除 FTP 上檔案(取完後刪除)
	 * 
	 * @throws IOException
	 */
	public void get(String ftpserver, String ftpuser, String ftppass, String cwdDirectory, File storeDir,
			boolean deleteFtpFile) throws IOException {

		this.ftpserver = ftpserver;
		this.ftpuser = ftpuser;
		this.ftppass = ftppass;
		ensureConnected();
		this.get(cwdDirectory, storeDir, null, deleteFtpFile);
	}

	/**
	 * 把目錄下的檔案抓下來,如果有權限
	 * 
	 * @param cwdDirectory cd 目錄
	 * @param storeDir     本地端目錄
	 * @param head         檔案開頭 代null或 空白 忽略
	 * 
	 * @throws IOException
	 */
	public void get(String cwdDirectory, File storeDir, String head) throws IOException {
		this.get(cwdDirectory, storeDir, head, false);
	}

	/**
	 * 給無法用 get(String cwdDirectory, File storeDir, String head, boolean
	 * deleteFtpFile) 的版本用, 一般正常的 FTPd 不要用這個method , 把目錄下的檔案抓下來, 如果有權限
	 * 
	 * @param cwdDirectory cd 目錄
	 * @param storeDir     本地端目錄
	 * @param head         檔案開頭 代null或 空白 忽略
	 * 
	 * @throws IOException
	 */
	public void getByName(String cwdDirectory, File storeDir, String head) throws IOException {
		ensureConnected();
		if (StringUtils.isNotEmpty(cwdDirectory)) {
			this.ftpClient.cwd(cwdDirectory);
		}
		String[] names = this.ftpClient.listNames();
		if (names == null) {
			return;
		}
		for (String name : names) {
			if (StringUtils.isNotEmpty(head) && !name.startsWith(head)) {
				logger.info("not get : {}", name);
				continue;
			}
			logger.info("ftp file name: {}", name);
			if (name.contains(".")) {
				File downloadFile = new File(storeDir, name);
				try (FileOutputStream fos = new FileOutputStream(downloadFile)) {
					if (this.ftpClient.retrieveFile(name, fos)) {
						logger.info("ftp GET (save to) : {}", downloadFile.getAbsolutePath());
					}
				}
			}
		}
	}

	/**
	 * 把目錄下的檔案抓下來,如果有權限
	 * 
	 * @param cwdDirectory  cd 目錄
	 * @param storeDir      本地端目錄
	 * @param head          檔案開頭 代null或 空白 忽略
	 * @param deleteFtpFile 是否刪除 FTP 上檔案(取完後刪除)
	 * 
	 * @throws IOException
	 */
	public void get(String cwdDirectory, File storeDir, String head, boolean deleteFtpFile) throws IOException {

		ensureConnected();
		if (StringUtils.isNotEmpty(cwdDirectory)) {
			this.ftpClient.cwd(cwdDirectory);
		}
		FTPFile[] ftpFiles = this.ftpClient.listFiles();
		if (ftpFiles == null) {
			return;
		}
		for (FTPFile ftpFile : ftpFiles) {
			if (StringUtils.isNotEmpty(head) && !ftpFile.getName().startsWith(head)) {
				logger.info("not get : {}", ftpFile.getName());
				continue;
			}
			logger.info("ftp file name: {}", ftpFile.getName());
			this.getProcess(ftpFile, storeDir, deleteFtpFile);
		}
	}

	private void getProcess(FTPFile ftpFile, File storeDir, boolean deleteFtpFile) throws IOException {
		if (!ftpFile.isFile()) {
			return;
		}
		File downloadFile = new File(storeDir, ftpFile.getName());
		try (FileOutputStream fos = new FileOutputStream(downloadFile)) {
			if (this.ftpClient.retrieveFile(ftpFile.getName(), fos)) {
				logger.info("ftp GET (save to) : {}", downloadFile.getAbsolutePath());
				if (deleteFtpFile) {
					this.delete(ftpFile.getName());
				}
			}
		}
	}

	/**
	 * 刪除FTP檔案,如果有權限
	 * 
	 * @param remoteFileName FTP上的檔案
	 * 
	 * @return boolean
	 * @throws IOException
	 */
	public boolean delete(String remoteFileName) throws IOException {
		ensureConnected();
		boolean delStatus = this.ftpClient.deleteFile(remoteFileName);
		logger.warn("ftp DELETE : {} del-status : {}", remoteFileName, delStatus);
		return delStatus;
	}

	/**
	 * 刪除時重新連線 , 提供給某些跑很久的Job用, 等刪除檔案時就timeout了, 所以重新建連線
	 * 
	 * @param remoteFileName
	 * @return boolean
	 * @throws IOException
	 */
	public boolean deleteRestConnection(String cwdDirectory, String remoteFileName) throws IOException {

		this.restConnection();
		this.cwd(cwdDirectory);
		return delete(remoteFileName);
	}

	/**
	 * 把本地上的檔案put上去,如果有權限
	 * 
	 * @param cwdDirectory   cd 目錄
	 * @param remoteFileName 放到FTP上的檔名
	 * @param localFile      本機上的檔案
	 * 
	 * @throws IOException
	 */
	public void put(String cwdDirectory, String remoteFileName, File localFile) throws IOException {
		ensureConnected();
		try (FileInputStream fis = new FileInputStream(localFile)) {
			if (StringUtils.isNotEmpty(cwdDirectory)) {
				this.ftpClient.cwd(cwdDirectory);
			}
			this.ftpClient.storeFile(remoteFileName, fis);
			logger.warn("ftp PUT : {}/{}", cwdDirectory, remoteFileName);
		}
	}

	/**
	 * 登入, 如果有權限
	 * 
	 * @param ftpserver FTP domain-name 或 IP
	 * @param ftpuser   FTP user
	 * @param ftppass   FTP 密碼
	 * 
	 * @throws IOException
	 */
	public void login(String ftpserver, String ftpuser, String ftppass) throws IOException {
		this.ftpserver = ftpserver;
		this.ftpuser = ftpuser;
		this.ftppass = ftppass;
		this.restConnection();
	}

	public void cwd(String cwdDirectory) throws IOException {
		ensureConnected();
		this.ftpClient.cwd(cwdDirectory);
	}

	/**
	 * 關閉連ftp
	 */
	public void close() {
		if (this.ftpClient != null) {
			try {
				if (this.ftpClient.isConnected()) {
					this.ftpClient.logout();
				}
			} catch (IOException e) {
				logger.error("FTP logout error: {}", e.getMessage());
			}
			try {
				if (this.ftpClient.isConnected()) {
					this.ftpClient.disconnect();
				}
			} catch (IOException e) {
				logger.error("FTP disconnect error: {}", e.getMessage());
			}
		}
	}

}
