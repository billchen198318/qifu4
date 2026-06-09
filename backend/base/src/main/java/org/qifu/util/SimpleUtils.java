/* 
 * Copyright 2012-2017 qifu of copyright Chen Xin Nien
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
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.imageio.ImageIO;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Strings;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.poifs.filesystem.FileMagic;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFClientAnchor;
import org.apache.poi.xssf.usermodel.XSSFDrawing;
import org.apache.poi.xssf.usermodel.XSSFPicture;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.uuid.Generators;

import jakarta.servlet.http.HttpServletRequest;

public class SimpleUtils {
	private static final Logger logger = LoggerFactory.getLogger(SimpleUtils.class);

	public static final int IS_YEAR = 1;
	public static final int IS_MONTH = 2;
	public static final int IS_DAY = 3;
	private static final Random rnd = new Random();
	private static final String SOURCE_STR = "abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final char[] SOURCE_STR_ARRAY = SOURCE_STR.toCharArray();

	private static final DateTimeFormatter dtfOfyyyyMMddHHmmss = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

	protected SimpleUtils() {
		throw new IllegalStateException("Utils class: SimpleUtils");
	}

	public static boolean checkBeTrueOfAZaz09(final int minLength, final int maxLength, final String sourceValue) {
		if (sourceValue == null || minLength < 0 || sourceValue.length() < minLength
				|| sourceValue.length() > maxLength) {
			return false;
		}
		return checkBeTrueOfAZaz09(sourceValue);
	}

	public static boolean checkBeTrueOf09(final String sourceValue) {
		return StringUtils.isNotEmpty(sourceValue) && StringUtils.isNumeric(sourceValue);
	}

	public static boolean checkBeTrueOfAZaz09(final String sourceValue) {
		return StringUtils.isNotEmpty(sourceValue) && StringUtils.isAlphanumeric(sourceValue);
	}

	/**
	 * 支持 Id 類型的 check 如: AA-01 AA_01
	 * 
	 * @param sourceValue
	 * @return
	 */
	public static boolean checkBeTrueOfAZaz09Id(final String sourceValue) {
		if (StringUtils.isEmpty(sourceValue)) {
			return false;
		}
		// Allows alphanumeric, dash, underscore and dot
		return sourceValue.matches("^[a-zA-Z0-9\\-_.]+$");
	}

	public static boolean checkBeTrueOfNumber(final String sourceValue) {
		return NumberUtils.isCreatable(sourceValue);
	}

	public static String createRandomString(final int length) {
		if (length < 1) {
			return "";
		}
		StringBuilder retValue = new StringBuilder();
		for (int ix = 0; ix < length; ix++) {
			retValue.append(SOURCE_STR_ARRAY[rnd.nextInt(SOURCE_STR_ARRAY.length)]);
		}
		return retValue.toString();
	}

	public static String getStr(String value) {
		return StringUtils.defaultString(value);
	}

	public static int getInt(final String value, final int defaultValue) {
		return NumberUtils.toInt(value, defaultValue);
	}

	public static long getLong(final String value, final long defaultValue) {
		return NumberUtils.toLong(value, defaultValue);
	}

	public static float getFloat(final String value, final float defaultValue) {
		return NumberUtils.toFloat(value, defaultValue);
	}

	public static final String getStrYMD(final int type) {
		LocalDate now = LocalDate.now();
		if (type == IS_YEAR) {
			return String.valueOf(now.getYear());
		}
		if (type == IS_MONTH) {
			return StringUtils.leftPad(String.valueOf(now.getMonthValue()), 2, "0");
		}
		if (type == IS_DAY) {
			return StringUtils.leftPad(String.valueOf(now.getDayOfMonth()), 2, "0");
		}
		return String.valueOf(now.getYear());
	}

	public static boolean isDate(final String yyyymmdd) {
		if (yyyymmdd == null) {
			return false;
		}
		int y = 0, m = 0, d = 0;
		if (yyyymmdd.contains("/")) {
			String[] tmp = yyyymmdd.split("/");
			if (tmp.length == 3) {
				y = getInt(tmp[0], 0);
				m = getInt(tmp[1], 0);
				d = getInt(tmp[2], 0);
			}
		} else if (yyyymmdd.contains("-")) {
			String[] tmp = yyyymmdd.split("-");
			if (tmp.length == 3) {
				y = getInt(tmp[0], 0);
				m = getInt(tmp[1], 0);
				d = getInt(tmp[2], 0);
			}
		} else if (yyyymmdd.length() == 8) {
			y = getInt(yyyymmdd.substring(0, 4), 0);
			m = getInt(yyyymmdd.substring(4, 6), 0);
			d = getInt(yyyymmdd.substring(6, 8), 0);
		}

		if (y >= 1900 && y <= 9999 && m >= 1 && m <= 12 && d >= 1) {
			try {
				LocalDate.of(y, m, d);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		return false;
	}

	private static LocalDate parseLocalDate(String dateStr) {
		String cleanDate = getStrYMD(Strings.CS.replace(dateStr, "/", "-"), "-");
		if (cleanDate.length() == 4) {
			cleanDate += "-01-01";
		}
		return LocalDate.parse(cleanDate);
	}

	public static int getDaysBetween(String startDate, String endDate) {
		return (int) ChronoUnit.DAYS.between(parseLocalDate(startDate), parseLocalDate(endDate));
	}

	public static int getDaysBetween(Date startDate, Date endDate) {
		return getDaysBetween(getStrYMD(startDate, "-"), getStrYMD(endDate, "-"));
	}

	public static int getYearsBetween(String startDate, String endDate) {
		return (int) ChronoUnit.YEARS.between(parseLocalDate(startDate), parseLocalDate(endDate));
	}

	public static int getYearsBetween(Date startDate, Date endDate) {
		return (int) ChronoUnit.YEARS.between(startDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),
				endDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
	}

	public static int getMonthsBetween(String startDate, String endDate) {
		return (int) ChronoUnit.MONTHS.between(parseLocalDate(startDate), parseLocalDate(endDate));
	}

	public static int getMonthsBetween(Date startDate, Date endDate) {
		return getMonthsBetween(getStrYMD(startDate, "-"), getStrYMD(endDate, "-"));
	}

	public static final String getStrYMD(String splitStr) {
		return LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy" + splitStr + "MM" + splitStr + "dd"));
	}

	public static final String getStrYMD(Date date, String splitStr) {
		if (date == null)
			return "";
		return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate()
				.format(DateTimeFormatter.ofPattern("yyyy" + splitStr + "MM" + splitStr + "dd"));
	}

	public static final String getStrYMD(String yyyymmdd, String splitStr) {
		if (StringUtils.isBlank(splitStr) || !isDate(yyyymmdd) || yyyymmdd.length() != 8) {
			return yyyymmdd;
		}
		return yyyymmdd.substring(0, 4) + splitStr + yyyymmdd.substring(4, 6) + splitStr + yyyymmdd.substring(6, 8);
	}

	public static int getMaxDayOfMonth(final int year, final int month) {
		int y = (year >= 1900 && year <= 3000) ? year : 1900;
		int m = (month >= 1 && month <= 12) ? month : 1;
		return LocalDate.of(y, m, 1).lengthOfMonth();
	}

	public static int getDayOfWeek(final int year, final int month) {
		int y = (year >= 1900 && year <= 3000) ? year : 1900;
		int m = (month >= 1 && month <= 12) ? month : 1;
		// java.time DayOfWeek is 1 (Monday) to 7 (Sunday).
		// Calendar.DAY_OF_WEEK is 1 (Sunday) to 7 (Saturday).
		int dow = LocalDate.of(y, m, 1).getDayOfWeek().getValue();
		return (dow % 7) + 1;
	}

	/**
	 * yyyyMMdd 2013/01/01 20130101
	 * 
	 * @param yyyyMMdd
	 * @return
	 * @throws Exception
	 */
	public static Map<String, String> getQuarterlyStartEnd(String yyyyMMdd) throws IllegalArgumentException {
		String eMsg = "parameter error.";
		if (yyyyMMdd == null) {
			throw new IllegalArgumentException(eMsg);
		}
		String cleanDate = Strings.CS.replace(yyyyMMdd, "/", "");
		if (cleanDate.length() != 8 || !NumberUtils.isDigits(cleanDate)) {
			throw new IllegalArgumentException(eMsg);
		}
		int yyyy = Integer.parseInt(cleanDate.substring(0, 4));
		int mm = Integer.parseInt(cleanDate.substring(4, 6));
		String start, end;
		if (mm >= 1 && mm <= 3) {
			start = yyyy + "/01/01";
			end = yyyy + "/03/" + getMaxDayOfMonth(yyyy, 3);
		} else if (mm >= 4 && mm <= 6) {
			start = yyyy + "/04/01";
			end = yyyy + "/06/" + getMaxDayOfMonth(yyyy, 6);
		} else if (mm >= 7 && mm <= 9) {
			start = yyyy + "/07/01";
			end = yyyy + "/09/" + getMaxDayOfMonth(yyyy, 9);
		} else if (mm >= 10 && mm <= 12) {
			start = yyyy + "/10/01";
			end = yyyy + "/12/" + getMaxDayOfMonth(yyyy, 12);
		} else {
			throw new IllegalArgumentException(eMsg);
		}
		Map<String, String> dateMap = new HashMap<>();
		dateMap.put("date1", start);
		dateMap.put("date2", end);
		return dateMap;
	}

	public static String toHex(final String sourceValue) {
		return org.apache.commons.codec.binary.Hex.encodeHexString(getStr(sourceValue).getBytes());
	}

	public static String deHex(final String sourceValue) {
		try {
			return new String(org.apache.commons.codec.binary.Hex.decodeHex(getStr(sourceValue).toCharArray()));
		} catch (DecoderException e) {
			logger.error(e.getMessage(), e);
		}
		return "";
	}

	public static String toB64(final String sourceValue) {
		return Base64.getEncoder().encodeToString(getStr(sourceValue).getBytes());
	}

	public static String deB64(final String sourceValue) {
		return new String(Base64.getDecoder().decode(getStr(sourceValue)));
	}

	public static String getUUIDStr() {
		return Generators.timeBasedGenerator().generate().toString();
	}

	public static String getRandomUUIDStr() {
		return Generators.randomBasedGenerator().generate().toString();
	}

	public static byte[] toMD5(final String sourceValue) {
		return org.apache.commons.codec.digest.DigestUtils.md5(getStr(sourceValue));
	}

	public static String toMD5Hex(final String sourceValue) {
		return org.apache.commons.codec.digest.DigestUtils.md5Hex(getStr(sourceValue));
	}

	public static String joinString(Object... values) {
		if (values == null) {
			return "";
		}
		StringBuilder sb = new StringBuilder();
		for (Object o : values) {
			if (o != null) {
				sb.append(o);
			}
		}
		return sb.toString();
	}

	public static String toUnicode(String strValue) {
		if (strValue == null) {
			return "";
		}
		StringBuilder sb = new StringBuilder();
		for (char c : strValue.toCharArray()) {
			sb.append("&#").append((int) c).append(";");
		}
		return sb.toString();
	}

	public static <T extends java.io.Serializable> List<T> getListHashSet(List<T> list) {
		if (list == null) {
			return null;
		}
		return new ArrayList<>(new HashSet<>(list));
	}

	/**
	 * Decode string to image
	 * 
	 * @param imageString The string to decode
	 * @return decoded image
	 */
	public static BufferedImage decodeToImage(String imageString) {
		try (ByteArrayInputStream bis = new ByteArrayInputStream(Base64.getDecoder().decode(imageString))) {
			return ImageIO.read(bis);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
		return null;
	}

	/**
	 * Encode image to string
	 * 
	 * @param image The image to encode
	 * @param type  jpeg, bmp, ...
	 * @return encoded string
	 */
	public static String encodeToString(BufferedImage image, String type) {
		try (ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
			ImageIO.write(image, type, bos);
			return Base64.getEncoder().encodeToString(bos.toByteArray());
		} catch (IOException e) {
			logger.error(e.getMessage(), e);
		}
		return null;
	}

	public static String getPNGBase64Content(String imgStr) throws IOException {
		if (!isPNGBase64Content(imgStr)) {
			try (InputStream is = SimpleUtils.class.getClassLoader().getResource("resource/nofound-icon.html")
					.openStream()) {
				imgStr = new String(IOUtils.toByteArray(is));
			}
		}
		imgStr = Strings.CS.replaceOnce(imgStr, "<img src=\"data:image/png;base64,", "");
		imgStr = Strings.CS.replaceOnce(imgStr, "\">", "");
		imgStr = Strings.CS.replaceOnce(imgStr, "data:image/png;base64,", "");
		return imgStr;
	}

	public static boolean isPNGBase64Content(String imgStr) {
		if (imgStr == null || !imgStr.contains("image/png;base64,")) {
			return false;
		}
		return imgStr.length() >= 35;
	}

	/**
	 * http://stackoverflow.com/questions/12593752/why-do-i-failed-to-read-excel-2007-using-poi
	 * 
	 * @param inp
	 * @return
	 * @throws IOException
	 * @throws InvalidFormatException
	 */
	public static Workbook createPOIWorkbook(InputStream inp) throws IOException, InvalidFormatException {
		if (!inp.markSupported()) {
			inp = new PushbackInputStream(inp, 8);
		}
		if (FileMagic.valueOf(inp) == FileMagic.OLE2) {
			return new HSSFWorkbook(inp);
		}
		if (FileMagic.valueOf(inp) == FileMagic.OOXML) {
			return new XSSFWorkbook(OPCPackage.open(inp));
		}
		throw new IllegalArgumentException("Your InputStream was neither an OLE2 stream, nor an OOXML stream");
	}

	public static void setCellPicture(XSSFWorkbook wb, XSSFSheet sh, byte[] iconBytes, int row, int col) {
		int myPictureId = wb.addPicture(iconBytes, Workbook.PICTURE_TYPE_PNG);
		XSSFDrawing drawing = sh.createDrawingPatriarch();
		XSSFClientAnchor myAnchor = new XSSFClientAnchor();
		myAnchor.setCol1(col);
		myAnchor.setRow1(row);
		XSSFPicture myPicture = drawing.createPicture(myAnchor, myPictureId);
		myPicture.resize();
	}

	public static byte[] getColorRGB(String rgb) {
		if (StringUtils.isEmpty(rgb) || rgb.length() != 6) {
			return new byte[] { (byte) 0, (byte) 0, (byte) 0 };
		}
		int red = Integer.parseInt(rgb.substring(0, 2), 16);
		int green = Integer.parseInt(rgb.substring(2, 4), 16);
		int blue = Integer.parseInt(rgb.substring(4, 6), 16);
		return new byte[] { (byte) red, (byte) green, (byte) blue };
	}

	public static byte[] getColorRGB4POIColor(String srcRGB) {
		if (StringUtils.isEmpty(srcRGB) || (srcRGB.length() != 6 && srcRGB.length() != 7)) {
			return new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 0 };
		}
		String rgb = srcRGB.startsWith("#") ? srcRGB.substring(1) : srcRGB;
		int red = Integer.parseInt(rgb.substring(0, 2), 16);
		int green = Integer.parseInt(rgb.substring(2, 4), 16);
		int blue = Integer.parseInt(rgb.substring(4, 6), 16);
		return new byte[] { (byte) -1, (byte) red, (byte) green, (byte) blue };
	}

	public static int[] getColorRGB2(String color) {
		if (StringUtils.isEmpty(color) || color.length() != 7) {
			return new int[] { 0, 0, 0 };
		}
		Color c = Color.decode(color);
		return new int[] { c.getRed(), c.getGreen(), c.getBlue() };
	}

	public static String getHttpRequestUrl(HttpServletRequest request) {
		StringBuilder url = new StringBuilder();
		url.append(request.getRequestURL());
		Enumeration<String> paramNames = request.getParameterNames();
		for (int i = 0; paramNames.hasMoreElements(); i++) {
			String paramName = paramNames.nextElement();
			url.append(i == 0 ? "?" : "&").append(paramName).append("=").append(request.getParameter(paramName));
		}
		return url.toString();
	}

	public static int getAvailableProcessors(int maxSize) {
		int processors = Runtime.getRuntime().availableProcessors() - 1;
		if (processors > maxSize) {
			processors = maxSize;
		}
		return Math.max(processors, 1);
	}

	public static String getDateFormatOfyyyyMMddHHmmss(Date date) {
		if (null == date) {
			return "";
		}
		return dtfOfyyyyMMddHHmmss.format(date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime());
	}

	public static <T extends Comparable<T>> boolean isBetween(T value, T start, T end) {
		return value.compareTo(start) >= 0 && value.compareTo(end) <= 0;
	}

}
