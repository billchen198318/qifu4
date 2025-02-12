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
package org.qifu.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.qifu.base.Constants;
import org.qifu.base.exception.ControllerException;
import org.qifu.base.exception.ServiceException;
import org.qifu.base.model.ControllerMethodAuthority;
import org.qifu.base.support.TokenStoreValidateBuilder;
import org.qifu.base.util.TokenBuilderUtils;
import org.qifu.core.util.JReportUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.auth0.jwt.interfaces.Claim;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class CommonJasperReportController {
	
	private final DataSource dataSource;	
	
	public CommonJasperReportController(DataSource dataSource) {
		super();
		this.dataSource = dataSource;
	}
	
	@ControllerMethodAuthority(check = false, programId = "CORE_PROGCOMM")
	@RequestMapping(value = "/commonOpenJasperReport")
	public String processReport(ModelMap mm, HttpServletRequest request, HttpServletResponse response, 
			@RequestParam("jreportId") String jreportId) throws IOException {
		try {
			String qifutoken = StringUtils.defaultString(request.getParameter("qifutoken"));
			TokenStoreValidateBuilder tsv = TokenStoreValidateBuilder.build(this.dataSource);
			Map<String, Claim> claimToken = TokenBuilderUtils.verifyToken(qifutoken.replaceFirst(Constants.TOKEN_PREFIX, "").replace(" ", ""), tsv);
			if (!TokenBuilderUtils.existsInfo(claimToken)) {
				byte[] blankPdfData;
				try (InputStream is = CommonJasperReportController.class.getClassLoader().getResource( "qifu4blank.pdf" ).openStream()) {
					blankPdfData = IOUtils.toByteArray(is);
				}
				response.setContentType("application/pdf");
				response.getOutputStream().write(blankPdfData);
				response.flushBuffer();
				return null;
			}
			JReportUtils.fillReportToResponse(
					jreportId, 
					request, 
					response);
		} catch (ServiceException | ControllerException e) {
			e.printStackTrace();
		} 
		return null;
	}
	
}
