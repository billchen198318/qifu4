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

import org.apache.commons.lang3.StringUtils;

import com.lowagie.text.Element;
import com.lowagie.text.Rectangle;
import com.lowagie.text.pdf.BaseFont;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfGState;
import com.lowagie.text.pdf.PdfStamper;

public class PdfWatermarkUtils {
	
	protected PdfWatermarkUtils() {
		throw new IllegalStateException("Utils class: PdfWatermarkUtils");
	}
	
	public static void addWatermark(PdfStamper pdfStamper, BaseFont baseFont, Color fontColor, String waterMarkString) throws IllegalArgumentException {
		if (null == pdfStamper || null == baseFont) {
			throw new IllegalArgumentException("PdfStamper or BaseFont is null.");
		}
		if (StringUtils.isBlank(waterMarkString)) {
			return;
		}
		PdfContentByte pdfContentByte = null;
		Rectangle pageRect = null;
		PdfGState pdfGState = new PdfGState();
		// 设置透明度为0.4
		pdfGState.setFillOpacity(0.4f);
		pdfGState.setStrokeOpacity(0.4f);
        int pageNum = pdfStamper.getReader().getNumberOfPages();
        try {
            for (int i = 1; i <= pageNum; i++) {
            	pageRect = pdfStamper.getReader().getPageSizeWithRotation(i);
            	// 计算水印X,Y坐标
            	float x = pageRect.getWidth() / 2;
            	float y = pageRect.getHeight() / 2;
            	//获得PDF最顶层
            	pdfContentByte = pdfStamper.getOverContent(i);
            	pdfContentByte.saveState();
            	// set Transparency
            	pdfContentByte.setGState(pdfGState);
            	pdfContentByte.beginText();
            	pdfContentByte.setColorFill(fontColor);
            	pdfContentByte.setFontAndSize(baseFont, 60);
            	// 水印文字成45度角倾斜
            	pdfContentByte.showTextAligned(Element.ALIGN_CENTER, waterMarkString, x, y, 45);
            	pdfContentByte.endText();             	
            }
        } catch (Exception e) {
        	e.printStackTrace();
        }
	}
	
}