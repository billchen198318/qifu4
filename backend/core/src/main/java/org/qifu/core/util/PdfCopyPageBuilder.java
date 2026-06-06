/* 
 * Copyright 2012-2018 qifu, qifu2 of copyright Chen Xin Nien
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
package org.qifu.core.util;

import java.awt.Color;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.qifu.base.exception.ServiceException;
import org.qifu.core.model.UploadTypes;
import org.qifu.util.SimpleUtils;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.PDPageContentStream.AppendMode;
import org.apache.pdfbox.pdmodel.encryption.AccessPermission;
import org.apache.pdfbox.pdmodel.encryption.StandardProtectionPolicy;
import org.apache.pdfbox.pdmodel.font.PDType0Font;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.util.Matrix;

public class PdfCopyPageBuilder {
	private byte[] sourceReportData = null;
	private List<String> findWords = new ArrayList<>();
	private String readPassword = "";
	private boolean modeByFindFound = true;
	private boolean forcePutAllPage = false;
	private boolean enableWatermark = false;
	private String watermarkText = "";
	private String fontPath = "fonts/fireflysung.ttf";
	private String owner = "owner";
	private String userPass = "user";

	public static PdfCopyPageBuilder build() {
		return new PdfCopyPageBuilder();
	}

	public PdfCopyPageBuilder setSourceReportData(byte[] content) {
		if (content == null) {
			throw new IllegalArgumentException("null data.");
		}
		this.sourceReportData = content;
		return this;
	}

	public PdfCopyPageBuilder setSourcePdfFile(File file) throws IOException {
		if (file == null || !file.exists() || !file.isFile()) {
			throw new IllegalArgumentException("file args error.");
		}
		this.sourceReportData = FileUtils.readFileToByteArray(file);
		return this;
	}

	public PdfCopyPageBuilder addFindWord(String word) {
		if (StringUtils.isBlank(word)) {
			return this;
		}
		if (!this.findWords.contains(word)) {
			this.findWords.add(word);
		}
		return this;
	}

	public PdfCopyPageBuilder setReadPassword(String password) {
		this.readPassword = password;
		return this;
	}

	public PdfCopyPageBuilder setModeByFindFound(boolean mode) {
		this.modeByFindFound = mode;
		return this;
	}

	public PdfCopyPageBuilder setForcePutAllPage(boolean forcePutAllPage) {
		this.forcePutAllPage = forcePutAllPage;
		return this;
	}

	public PdfCopyPageBuilder enableWatermark(String text, String fontPath) {
		this.enableWatermark = true;
		this.watermarkText = text;
		if (StringUtils.isNotBlank(fontPath)) {
			this.fontPath = fontPath;
		}
		return this;
	}

	public PdfCopyPageBuilder setEncryption(String owner, String user) {
		this.owner = owner;
		this.userPass = user;
		return this;
	}
	
	public String toUpload(String system) throws ServiceException, IOException {
		return this.toUpload(system, UploadTypes.IS_TEMP);
	}
	
	public String toUpload(String system, String uploadType) throws ServiceException, IOException {
		byte[] newPdfByte = this.getContent();
		return UploadSupportUtils.create(system, uploadType, false, newPdfByte, SimpleUtils.getUUIDStr() + ".pdf");
	}

	public byte[] getContent() throws IOException {
		try (PDDocument sourceDoc = loadSourceDocument();
				PDDocument resultDoc = new PDDocument();
				ByteArrayOutputStream os = new ByteArrayOutputStream()) {
			PDFTextStripper stripper = new PDFTextStripper();
			int totalPages = sourceDoc.getNumberOfPages();
			boolean hasPage = false;
			PDType0Font font = null;

			if (enableWatermark && StringUtils.isNotBlank(watermarkText)) {
				File fontFile = new File(fontPath);
				if (!fontFile.exists()) {
					throw new IOException("Font not found: " + fontPath);
				}
				font = PDType0Font.load(resultDoc, fontFile);
			}

			for (int i = 1; i <= totalPages; i++) {
				stripper.setStartPage(i);
				stripper.setEndPage(i);
				String text = stripper.getText(sourceDoc);
				if (!shouldIncludePage(text)) {
					continue;
				}

				// =========================
				// ✔ DEEP COPY PAGE (SAFE)
				// =========================
				PDPage newPage = resultDoc.importPage(sourceDoc.getPage(i - 1));
				resultDoc.addPage(newPage);
				hasPage = true;

				// =========================
				// ✔ WATERMARK
				// =========================
				if (enableWatermark && font != null) {
					addWatermark(resultDoc, newPage, font, watermarkText);
				}
			}

			if (!hasPage) {
				resultDoc.addPage(new PDPage());
			}
			
			// =========================
			// ✔ ENCRYPT
			// =========================
			AccessPermission ap = new AccessPermission();
			ap.setCanPrint(true);
			StandardProtectionPolicy policy = new StandardProtectionPolicy(owner, userPass, ap);
			policy.setEncryptionKeyLength(128);
			resultDoc.protect(policy);
			resultDoc.save(os);
			return os.toByteArray();
		}
	}

	// =========================
	// WATERMARK (PER PAGE SAFE)
	// =========================
	private void addWatermark(PDDocument doc, PDPage page, PDType0Font font, String text) throws IOException {
		float fontSize = 60f;
		float width = page.getMediaBox().getWidth();
		float height = page.getMediaBox().getHeight();
		float centerX = width / 2;
		float centerY = height / 2;
		float textWidth = font.getStringWidth(text) / 1000f * fontSize;
		try (PDPageContentStream cs = new PDPageContentStream(doc, page, AppendMode.APPEND, true, true)) {
			cs.setNonStrokingColor(Color.RED);
			cs.beginText();
			cs.setFont(font, fontSize);
			Matrix m = Matrix.getRotateInstance(Math.toRadians(45), centerX - textWidth / 2, centerY);
			cs.setTextMatrix(m);
			cs.showText(text);
			cs.endText();
		}
	}

	private PDDocument loadSourceDocument() throws IOException {
		File temp = File.createTempFile("pdfbox_", ".pdf");
		FileUtils.writeByteArrayToFile(temp, sourceReportData);
		if (StringUtils.isBlank(readPassword)) {
			return Loader.loadPDF(temp);
		} else {
			return Loader.loadPDF(temp, readPassword);
		}
	}

	private boolean shouldIncludePage(String text) {
		if (forcePutAllPage) {
			return true;
		}
		for (String word : findWords) {
			boolean found = text != null && text.contains(word);
			if ((modeByFindFound && found) || (!modeByFindFound && !found)) {
				return true;
			}
		}
		return false;
	}
	
}
