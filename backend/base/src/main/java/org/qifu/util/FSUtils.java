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
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.javamail.ConfigurableMimeFileTypeMap;

public class FSUtils {
	private static final Logger logger = LoggerFactory.getLogger(FSUtils.class);

	protected FSUtils() {
		throw new IllegalStateException("Utils class: FSUtils");
	}

	public static void mv(final String sourceFile, final String destFile) throws IOException {
		Files.move(Paths.get(sourceFile), Paths.get(destFile), StandardCopyOption.REPLACE_EXISTING);
	}

	public static void cp(final String sourceFile, final String destFile) throws IOException {
		Files.copy(Paths.get(sourceFile), Paths.get(destFile), StandardCopyOption.REPLACE_EXISTING);
	}

	public static void rm(final String removeFile) throws IOException {
		FileUtils.forceDelete(new File(removeFile));
	}

	public static String[] getList(final String dir) {
		File directory = new File(dir);
		return directory.list();
	}

	public static String readStr(final String fileFullPath) {
		Path path = Paths.get(fileFullPath);
		try {
			if (Files.exists(path)) {
				return new String(Files.readAllBytes(path), StandardCharsets.UTF_8);
			}
		} catch (IOException e) {
			logger.error("Read file error: {}", e.getMessage(), e);
		}
		return "";
	}

	/**
	 * Write content to file. If file exists, overwrite it.
	 * 
	 * @param fileFullPath
	 * @param content
	 * @return boolean
	 */
	public static boolean writeStr(final String fileFullPath, final String content) {
		try {
			Files.write(Paths.get(fileFullPath), StringUtils.defaultString(content).getBytes(StandardCharsets.UTF_8));
			return true;
		} catch (IOException e) {
			logger.error("Write file error: {}", e.getMessage(), e);
		}
		return false;
	}

	/**
	 * Same as writeStr, kept for compatibility if needed.
	 * 
	 * @param fileFullPath
	 * @param content
	 * @return boolean
	 */
	public static boolean writeStr2(final String fileFullPath, final String content) {
		return writeStr(fileFullPath, content);
	}

	public static List<String> findFileListByCondition(final String directory, final String[] subName,
			final String content) {
		List<String> result = new ArrayList<>();
		Path start = Paths.get(directory);
		if (!Files.isDirectory(start)) {
			return result;
		}

		try (Stream<Path> stream = Files.walk(start)) {
			List<Path> files = stream.filter(Files::isRegularFile).collect(Collectors.toList());
			for (Path file : files) {
				String fileName = file.getFileName().toString().toUpperCase();
				boolean matchExtension = false;
				for (String sub : subName) {
					if (fileName.contains(sub.toUpperCase())) {
						matchExtension = true;
						break;
					}
				}

				if (matchExtension) {
					String fileContent = readStr(file.toAbsolutePath().toString());
					if (fileContent.contains(content)) {
						result.add(file.toAbsolutePath().toString());
					}
				}
			}
		} catch (IOException e) {
			logger.error("Find files error: {}", e.getMessage(), e);
		}

		return result;
	}

	/**
	 * get MIME-TYPE
	 * 
	 * @param file
	 * @return String
	 * @throws IOException
	 */
	public static String getMimeType(File file) throws IOException {
		if (file == null || !file.exists() || file.isDirectory()) {
			return "";
		}
		String type = Files.probeContentType(file.toPath());
		return type != null ? type : "";
	}

	public static String getMimeType(String filename) {
		ConfigurableMimeFileTypeMap mfm = new ConfigurableMimeFileTypeMap();
		return mfm.getContentType(filename);
	}

	/**
	 * get MIME-TYPE Using URLConnection.guessContentTypeFromName
	 * 
	 * @param file
	 * @return String
	 */
	public static String getMimeType4URL(File file) {
		if (file == null || !file.exists() || file.isDirectory()) {
			return "";
		}
		return URLConnection.guessContentTypeFromName(file.getName());
	}

}
