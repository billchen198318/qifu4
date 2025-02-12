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
package org.qifu.core.logic.impl;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.codec.binary.Base64;
import org.qifu.base.exception.ServiceException;
import org.qifu.base.message.BaseSystemMessage;
import org.qifu.base.model.DefaultResult;
import org.qifu.base.model.ServiceAuthority;
import org.qifu.base.model.ServiceMethodAuthority;
import org.qifu.base.model.ServiceMethodType;
import org.qifu.base.model.YesNoKeyProvide;
import org.qifu.base.service.BaseLogicService;
import org.qifu.core.entity.TbSysJreport;
import org.qifu.core.entity.TbSysJreportParam;
import org.qifu.core.logic.ISystemJreportLogicService;
import org.qifu.core.service.ISysJreportParamService;
import org.qifu.core.service.ISysJreportService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@ServiceAuthority(check = true)
@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
public class SystemJreportLogicServiceImpl extends BaseLogicService implements ISystemJreportLogicService {
	protected static Logger logger = LoggerFactory.getLogger(SystemJreportLogicServiceImpl.class);
	private static final int MAX_DESCRIPTION_LENGTH = 500;
	private static final String SUB_FILE_NAME_JRXML = ".jrxml";
	private static final String SUB_FILE_NANME_JASPER = ".jasper";
	
	private final ISysJreportService<TbSysJreport, String> sysJreportService;
	
	private final ISysJreportParamService<TbSysJreportParam, String> sysJreportParamService;
	
	public SystemJreportLogicServiceImpl(ISysJreportService<TbSysJreport, String> sysJreportService,
			ISysJreportParamService<TbSysJreportParam, String> sysJreportParamService) {
		super();
		this.sysJreportService = sysJreportService;
		this.sysJreportParamService = sysJreportParamService;
	}

	@ServiceMethodAuthority(type = ServiceMethodType.INSERT)
	@Transactional(
			propagation=Propagation.REQUIRED, 
			readOnly=false,
			rollbackFor={RuntimeException.class, IOException.class, Exception.class} )			
	@Override
	public DefaultResult<TbSysJreport> create(TbSysJreport report) throws ServiceException {
		if (report==null) {
			throw new ServiceException(BaseSystemMessage.parameterBlank());
		}
		if (!this.isBlank(report.getUploadBase64())) {
			report.setContent( Base64.decodeBase64(report.getUploadBase64()) );
		}
		this.setStringValueMaxLength(report, "description", MAX_DESCRIPTION_LENGTH);
		if (YesNoKeyProvide.YES.equals(report.getIsCompile())) {
			report.setFile( report.getReportId() + SUB_FILE_NAME_JRXML);
		} else {
			report.setFile( report.getReportId() + SUB_FILE_NANME_JASPER);
		}
		return this.sysJreportService.insert(report);
	}
	
	@ServiceMethodAuthority(type = ServiceMethodType.UPDATE)
	@Transactional(
			propagation=Propagation.REQUIRED, 
			readOnly=false,
			rollbackFor={RuntimeException.class, IOException.class, Exception.class} )			
	@Override
	public DefaultResult<TbSysJreport> update(TbSysJreport report) throws ServiceException {
		if (report==null || super.isBlank(report.getOid())) {
			throw new ServiceException(BaseSystemMessage.parameterBlank());
		}
		DefaultResult<TbSysJreport> oldResult = this.sysJreportService.selectByEntityPrimaryKey(report);
		if (oldResult.getValue()==null) {
			throw new ServiceException(oldResult.getMessage());
		}		
		report.setReportId( oldResult.getValue().getReportId() );		
		byte[] content = oldResult.getValue().getContent();
		this.setStringValueMaxLength(report, "description", MAX_DESCRIPTION_LENGTH);
		if (!this.isBlank(report.getUploadBase64())) {
			report.setContent( Base64.decodeBase64(report.getUploadBase64()) );
		}		
		if (report.getContent()==null) { // 沒有上傳新的jasper,jrxml檔案
			report.setContent( content );			
		}		
		if (YesNoKeyProvide.YES.equals(report.getIsCompile())) {
			report.setFile( report.getReportId() + SUB_FILE_NAME_JRXML);
		} else {
			report.setFile( report.getReportId() + SUB_FILE_NANME_JASPER);
		}		
		return this.sysJreportService.update(report);
	}
	
	@ServiceMethodAuthority(type = ServiceMethodType.DELETE)
	@Transactional(
			propagation=Propagation.REQUIRED, 
			readOnly=false,
			rollbackFor={RuntimeException.class, IOException.class, Exception.class} )			
	@Override
	public DefaultResult<Boolean> delete(TbSysJreport report) throws ServiceException {
		if (report==null || super.isBlank(report.getOid())) {
			throw new ServiceException(BaseSystemMessage.parameterBlank());
		}		
		DefaultResult<TbSysJreport> mResult = this.sysJreportService.selectByPrimaryKeySimple(report.getOid());
		if (mResult.getValue()==null) {
			throw new ServiceException(mResult.getMessage());
		}
		report = mResult.getValue();
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("reportId", report.getReportId());
		DefaultResult<List<TbSysJreportParam>> searchListResult = this.sysJreportParamService.selectListByParams(paramMap);
		for (int i=0; searchListResult.getValue() !=null && i < searchListResult.getValue().size(); i++) {
			sysJreportParamService.delete(searchListResult.getValue().get(i));
		}
		return sysJreportService.delete(report);
	}
	
	@ServiceMethodAuthority(type = ServiceMethodType.INSERT)
	@Transactional(
			propagation=Propagation.REQUIRED, 
			readOnly=false,
			rollbackFor={RuntimeException.class, IOException.class, Exception.class} )	
	@Override
	public DefaultResult<TbSysJreportParam> createParam(TbSysJreportParam reportParam, String reportOid)
			throws ServiceException {
		if (reportParam==null || super.isBlank(reportOid)) {
			throw new ServiceException(BaseSystemMessage.parameterBlank());
		}
		DefaultResult<TbSysJreport> mResult = this.sysJreportService.selectByPrimaryKeySimple(reportOid);
		if (mResult.getValue()==null) {
			throw new ServiceException(mResult.getMessage());
		}
		TbSysJreport report = mResult.getValue();
		reportParam.setReportId(report.getReportId());
		return this.sysJreportParamService.insert(reportParam);
	}
	
	@ServiceMethodAuthority(type = ServiceMethodType.DELETE)
	@Transactional(
			propagation=Propagation.REQUIRED, 
			readOnly=false,
			rollbackFor={RuntimeException.class, IOException.class, Exception.class} )		
	@Override
	public DefaultResult<Boolean> deleteParam(TbSysJreportParam reportParam) throws ServiceException {
		if (reportParam==null || super.isBlank(reportParam.getOid())) {
			throw new ServiceException(BaseSystemMessage.parameterBlank());
		}
		return this.sysJreportParamService.delete(reportParam);
	}
	
}
