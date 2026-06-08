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
package org.qifu.core.service.impl;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.qifu.base.exception.ServiceException;
import org.qifu.base.mapper.IBaseMapper;
import org.qifu.base.message.BaseSystemMessage;
import org.qifu.base.service.BaseService;
import org.qifu.core.entity.TbSysLoginLog;
import org.qifu.core.mapper.TbSysLoginLogMapper;
import org.qifu.core.service.ISysLoginLogService;
import org.qifu.util.SimpleUtils;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
@Service
@Transactional(propagation=Propagation.REQUIRED, timeout=300, readOnly=true)
public class SysLoginLogServiceImpl extends BaseService<TbSysLoginLog, String> implements ISysLoginLogService<TbSysLoginLog, String> {
	
	private final TbSysLoginLogMapper tbSysLoginLogMapper;
	
	public SysLoginLogServiceImpl(TbSysLoginLogMapper tbSysLoginLogMapper) {
		super();
		this.tbSysLoginLogMapper = tbSysLoginLogMapper;
	}
	
	@Override
	protected IBaseMapper<TbSysLoginLog, String> getBaseMapper() {
		return this.tbSysLoginLogMapper;
	}

	@Transactional(
			propagation=Propagation.REQUIRED, 
			readOnly=false,
			rollbackFor={RuntimeException.class, IOException.class, Exception.class} )		
	@Override
	public Boolean deleteAll() throws ServiceException {
		return this.tbSysLoginLogMapper.deleteAll(null);
	}
	
	@Transactional(
			propagation=Propagation.REQUIRED, 
			readOnly=false,
			rollbackFor={RuntimeException.class, IOException.class, Exception.class} )		
	@Override
	public Boolean deleteByDate() throws ServiceException {
		DateTime dt = new DateTime();
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("cdate", dt.plusDays(-14).toDate());
		return this.tbSysLoginLogMapper.deleteByDate(paramMap);
	}

	@Transactional(
			propagation=Propagation.REQUIRED, 
			readOnly=false,
			rollbackFor={RuntimeException.class, IOException.class, Exception.class} )		
	@Override
	public void insertLoginFailLog(TbSysLoginLog log) throws ServiceException {
		if (StringUtils.isBlank(log.getOid())) {
			log.setOid(SimpleUtils.getUUIDStr());
		}
		
		log.setCuserid("sys");
		log.setFailFlag("Y");
		if (log.getCdate() == null) {
			log.setCdate(new Date());
		}
		
		if (this.tbSysLoginLogMapper.insert(log) < 1) {
			throw new ServiceException(BaseSystemMessage.insertFail());
		}
	}
	
}
