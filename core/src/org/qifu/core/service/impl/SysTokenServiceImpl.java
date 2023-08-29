package org.qifu.core.service.impl;

import org.qifu.base.mapper.IBaseMapper;
import org.qifu.base.service.BaseService;
import org.qifu.core.entity.TbSysToken;
import org.qifu.core.mapper.TbSysTokenMapper;
import org.qifu.core.service.ISysTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
@Service
@Transactional(propagation=Propagation.REQUIRED, timeout=300, readOnly=true)
public class SysTokenServiceImpl extends BaseService<TbSysToken, String> implements ISysTokenService<TbSysToken, String> {
	
	@Autowired
	TbSysTokenMapper sysTokenMapper;
	
	@Override
	protected IBaseMapper<TbSysToken, String> getBaseMapper() {
		return this.sysTokenMapper;
	}
	
}
