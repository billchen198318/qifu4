/* 
 * Copyright 2012-2019 qifu, qifu2 of copyright Chen Xin Nien
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

import java.awt.Color;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.qifu.base.Constants;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.encryption.AccessPermission;
import org.apache.pdfbox.pdmodel.encryption.StandardProtectionPolicy;
import org.apache.pdfbox.pdmodel.font.PDType0Font;

public class PdfOwnerUserBuilder {

	private String pdfFileFullPath = "";
	private String destEncryptionPdfPath = "";
	private String owner = "PdfOwnerUserBuilder";
	private String user = "PdfOwnerUserBuilder";
	private String watermarkText = "";
	private String fontPath = "fonts/fireflysung.ttf";
	
	public static PdfOwnerUserBuilder build() {
		return new PdfOwnerUserBuilder();
	}
	
	public PdfOwnerUserBuilder watermarkText(String watermarkText) {
		if (!StringUtils.isBlank(watermarkText)) {
			this.watermarkText = watermarkText;
		}
		return this;
	}
	
	public PdfOwnerUserBuilder owner(String owner) {
		if (!StringUtils.isBlank(owner)) {
			this.owner = owner;
		}
		return this;
	}
	
	public PdfOwnerUserBuilder user(String user) {
		if (!StringUtils.isBlank(user)) {
			this.user = user;
		}
		return this;
	}
	
	public PdfOwnerUserBuilder fontPath(String fontPath) {
		if (!StringUtils.isBlank(fontPath)) {
			this.fontPath = fontPath;
		}
		return this;
	}

	public PdfOwnerUserBuilder destFile(String fullPath) {
		this.destEncryptionPdfPath = fullPath;
		return this;
	}

	public PdfOwnerUserBuilder destFileToTmpdir() {
		String fullPath = System.getProperty("java.io.tmpdir") + Constants.FORWARD_SLASH
				+ PdfOwnerUserBuilder.class.getSimpleName() + Constants.FORWARD_SLASH + System.currentTimeMillis()
				+ Constants.FORWARD_SLASH + System.currentTimeMillis() + ".pdf";
		this.destFile(fullPath);
		return this;
	}

	public PdfOwnerUserBuilder sourceFile(String fullPath) throws IOException {
		File file = new File(fullPath);
		if (!file.exists()) {
			throw new IOException("no exists file : " + fullPath);
		}
		this.pdfFileFullPath = fullPath;
		return this;
	}

	public PdfOwnerUserBuilder process() throws IOException {
		if (StringUtils.isBlank(this.destEncryptionPdfPath) || StringUtils.isBlank(this.pdfFileFullPath)) {
			throw new IOException("no exists dest file : " + this.destEncryptionPdfPath + " or source file : "
					+ this.pdfFileFullPath);
		}
		File destFile = new File(this.destEncryptionPdfPath);
		if (destFile.getParentFile() != null && !destFile.getParentFile().exists()) {
			FileUtils.forceMkdir(destFile.getParentFile());
		}
		try (PDDocument document = Loader.loadPDF(new File(this.pdfFileFullPath))) {
			if (StringUtils.isNotBlank(this.watermarkText)) {
				File fontFile = new File(this.fontPath);
				if (!fontFile.exists()) {
					throw new IOException("Font file not found : " + this.fontPath);
				}
				PDType0Font font = PDType0Font.load(document, fontFile);
				PdfWatermarkUtils.addWatermark(document, font, Color.RED, this.watermarkText);
			}
			AccessPermission permission = new AccessPermission();
			permission.setCanPrint(true);
			StandardProtectionPolicy policy = new StandardProtectionPolicy(this.owner, this.user, permission);
			policy.setEncryptionKeyLength(128);
			document.protect(policy);
			document.save(this.destEncryptionPdfPath);
		}
		return this;
	}
	
	public String destFileFullPath() {
		return this.destEncryptionPdfPath;
	}
	
}
