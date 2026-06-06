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
package org.qifu.util;

import java.awt.Color;
import java.io.IOException;

import org.apache.commons.lang3.StringUtils;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.PDPageContentStream.AppendMode;
import org.apache.pdfbox.pdmodel.font.PDType0Font;
import org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState;
import org.apache.pdfbox.util.Matrix;

public class PdfWatermarkUtils {

	protected PdfWatermarkUtils() {
		throw new IllegalStateException("Utils class: PdfWatermarkUtils");
	}

	public static void addWatermark(PDDocument document, PDType0Font font, Color fontColor, String waterMarkString)
			throws IOException {
		if (document == null || font == null) {
			throw new IllegalArgumentException("PDDocument or PDType0Font is null.");
		}
		if (StringUtils.isBlank(waterMarkString)) {
			return;
		}
		PDExtendedGraphicsState gs = new PDExtendedGraphicsState();
		gs.setNonStrokingAlphaConstant(0.4f);
		gs.setStrokingAlphaConstant(0.4f);
		for (PDPage page : document.getPages()) {
			float width = page.getMediaBox().getWidth();
			float height = page.getMediaBox().getHeight();
			float centerX = width / 2;
			float centerY = height / 2;
			try (PDPageContentStream cs = new PDPageContentStream(document, page, AppendMode.APPEND, true, true)) {
				cs.setGraphicsStateParameters(gs);
				cs.beginText();
				cs.setNonStrokingColor(fontColor);
				cs.setFont(font, 60);
				Matrix matrix = Matrix.getRotateInstance(Math.toRadians(45), centerX, centerY);
				cs.setTextMatrix(matrix);
				cs.showText(waterMarkString);
				cs.endText();
			}
		}
	}
	
}