/* 
 * Copyright 2019-2021 qifu of copyright Chen Xin Nien
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

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.qifu.base.AppContext;
import org.qifu.base.Constants;
import org.qifu.base.exception.ServiceException;
import org.qifu.base.model.DefaultResult;
import org.qifu.base.model.YesNoKeyProvide;
import org.qifu.base.properties.JasperreportConfigProperties;
import org.qifu.core.entity.TbSysJreport;
import org.qifu.core.entity.TbSysJreportParam;
import org.qifu.core.service.ISysJreportParamService;
import org.qifu.core.service.ISysJreportService;
import org.qifu.util.DataUtils;
import org.qifu.util.SimpleUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import net.lingala.zip4j.ZipFile;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import net.sf.jasperreports.pdf.JRPdfExporter;
import net.sf.jasperreports.pdf.SimplePdfExporterConfiguration;

public class JReportUtils {
	protected static Logger logger = LoggerFactory.getLogger(JReportUtils.class);
	
	private static JasperreportConfigProperties jasperreportConfigProperties;
	
	private static ISysJreportService<TbSysJreport, String> sysJreportService;
	
	private static ISysJreportParamService<TbSysJreportParam, String> sysJreportParamService;
	
	private static final String JASPER_SUB_NAME = ".jasper";
	private static final String JRXML_SUB_NAME = ".jrxml";
	
	protected JReportUtils() {
		throw new IllegalStateException("Utils class: JReportUtils");
	}
	
	static {
		jasperreportConfigProperties = AppContext.getContext().getBean(JasperreportConfigProperties.class);
		sysJreportService = AppContext.getContext().getBean(ISysJreportService.class);
		sysJreportParamService = AppContext.getContext().getBean(ISysJreportParamService.class);
	}
	
	private static String getDataSourceIdByReportId(String reportId) {
		if ("TEST".equals(reportId)) {
			return "dataSourceTest";
		}
		return "dataSource";
	}
	
	private static Connection getConnectionByReportId(String reportId) {
		return DataUtils.getConnection(getDataSourceIdByReportId(reportId));
	}
	
	// =========================
	// export to response
	// =========================
	public static void fillReportToResponse(String reportId, HttpServletRequest request, HttpServletResponse response)
			throws ServiceException, IOException {
		Map<String, Object> paramMap = getParameter(reportId, request);
		fillReportToResponse(reportId, paramMap, response);
	}
	
	public static void fillReportToResponse(String reportId, Map<String, Object> paramMap, HttpServletResponse response)
			throws ServiceException, IOException {
		if (StringUtils.isBlank(reportId)) {
			throw new IllegalArgumentException("reportId is blank");
		}
		response.setContentType("application/pdf");
		String jasperFile = jasperreportConfigProperties.getSource() + File.separator + reportId + File.separator
				+ reportId + JASPER_SUB_NAME;
		try (InputStream reportSource = new FileInputStream(jasperFile)) {
			fillReport(reportId, reportSource, paramMap, response.getOutputStream());
		}
	}
	
	public static void fillReportToByteArray(String reportId, Map<String, Object> paramMap,
			ByteArrayOutputStream outputStream) throws ServiceException, IOException {
		String jasperFile = jasperreportConfigProperties.getSource() + File.separator + reportId + File.separator
				+ reportId + JASPER_SUB_NAME;
		try (InputStream reportSource = new FileInputStream(jasperFile)) {
			fillReport(reportId, reportSource, paramMap, outputStream);
		}
	}
	
	// =========================
	// core fill report
	// =========================
	private static void fillReport(String reportId, InputStream reportSource, Map<String, Object> paramMap,
			OutputStream outputStream) {
		Connection conn = null;
		try {
			conn = getConnectionByReportId(reportId);
			JasperPrint jasperPrint = JasperFillManager.fillReport(reportSource, paramMap, conn);
			JRPdfExporter exporter = new JRPdfExporter();
			exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
			exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(outputStream));
			SimplePdfExporterConfiguration config = new SimplePdfExporterConfiguration();
			if (!StringUtils.isBlank(jasperreportConfigProperties.getOwner())) {
				config.setOwnerPassword(jasperreportConfigProperties.getOwner());
			}
			exporter.setConfiguration(config);
			exporter.exportReport();
			outputStream.flush();
		} catch (Exception e) {
			logger.error("fillReport error", e);
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					logger.error(e.getMessage(), e);
				}
			}
			IOUtils.closeQuietly(reportSource);
			IOUtils.closeQuietly(outputStream);
		}
	}
	
	// =========================
	// deploy report
	// =========================
	public static void deployReport(TbSysJreport report) throws ServiceException, IOException, JRException {
		String baseDir = jasperreportConfigProperties.getSource() + File.separator;
		File root = new File(baseDir);
		if (!root.exists()) {
			FileUtils.forceMkdir(root);
		}
		String zipPath = baseDir + report.getReportId() + ".zip";
		File zipFile = new File(zipPath);
		if (zipFile.exists()) {
			FileUtils.forceDelete(zipFile);
		}		
		try (FileOutputStream fos = new FileOutputStream(zipFile)) {
			fos.write(report.getContent());
			fos.flush();
			try (ZipFile zip = new ZipFile(zipPath)) {
				zip.extractAll(baseDir);
				String folder = baseDir + report.getReportId() + File.separator;
				File dir = new File(folder);
				if (YesNoKeyProvide.YES.equals(report.getIsCompile()) && report.getFile().endsWith(JRXML_SUB_NAME)) {
					compileReportToJasperFile(dir.listFiles());
				}
			}
		}
	}
	
	public static void deploy() throws ServiceException, JRException {
		logger.info("begin deploy...");
		DefaultResult<List<TbSysJreport>> result = sysJreportService.selectList();
		String baseDir = jasperreportConfigProperties.getSource() + File.separator;
		File dir = new File(baseDir);
		try {
			if (dir.exists()) {
				FileUtils.forceDelete(dir);
			}
			FileUtils.forceMkdir(dir);
			for (TbSysJreport r : result.getValue()) {
				deployReport(r);
			}
		} catch (IOException e) {
			logger.error("deploy error", e);
		}
		logger.info("end deploy...");
	}
	
	// =========================
	// compile jrxml
	// =========================
	public static String compileReportToJasperFile(File[] sourceFile) throws JRException {
		String first = "";
		for (File f : sourceFile) {
			if (!f.exists() || !f.getName().endsWith(JRXML_SUB_NAME)) {
				continue;
			}
			String out = f.getPath().replaceAll(JRXML_SUB_NAME, JASPER_SUB_NAME);
			if (first.isEmpty()) {
				first = out;
			}
			JasperCompileManager.compileReportToFile(f.getPath(), out);
			logger.info("compiled {}", out);
		}
		return first;
	}

	public static String compileReportToJasperFile(String[] files) throws JRException {
		String first = "";
		for (String path : files) {
			File f = new File(path);
			if (!f.exists() || !f.getName().endsWith(JRXML_SUB_NAME)) {
				continue;
			}
			String out = f.getPath().replaceAll(JRXML_SUB_NAME, JASPER_SUB_NAME);
			if (first.isEmpty()) {
				first = out;
			}
			JasperCompileManager.compileReportToFile(f.getPath(), out);
			logger.info("compiled {}", out);
		}
		return first;
	}

	// =========================
	// upload decompress test
	// =========================
	public static String selfTestDecompress4Upload(String uploadOid) throws ServiceException, IOException {
		String extractDir = Constants.getWorkTmpDir() + File.separator + JReportUtils.class.getSimpleName()
				+ File.separator + SimpleUtils.getUUIDStr() + File.separator;
		File realFile = UploadSupportUtils.getRealFile(uploadOid);
		try (ZipFile zip = new ZipFile(realFile)) {
			zip.extractAll(extractDir);
		}
		return extractDir;
	}

	// =========================
	// parameters
	// =========================
	public static Map<String, Object> getParameter(String reportId, HttpServletRequest request)
			throws ServiceException {
		Map<String, Object> paramMap = new HashMap<>();
		if (StringUtils.isBlank(reportId)) {
			return paramMap;
		}
		paramMap.put("reportId", reportId);
		DefaultResult<List<TbSysJreportParam>> result = sysJreportParamService.selectListByParams(paramMap);
		paramMap.clear();
		for (TbSysJreportParam p : result.getValue()) {
			Enumeration<String> names = request.getParameterNames();
			while (names.hasMoreElements()) {
				String key = names.nextElement();
				if (key.equals(p.getUrlParam())) {
					paramMap.put(p.getRptParam(), request.getParameter(key));
				}
			}
		}
		String folder = jasperreportConfigProperties.getSource() + File.separator + reportId + File.separator;
		paramMap.put("REPORT_FOLDER", folder);
		paramMap.put("SUBREPORT_DIR", folder);
		return paramMap;
	}
}
