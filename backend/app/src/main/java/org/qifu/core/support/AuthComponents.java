package org.qifu.core.support;

import org.qifu.core.entity.TbAccount;
import org.qifu.core.entity.TbRolePermission;
import org.qifu.core.entity.TbSysLoginLog;
import org.qifu.core.entity.TbUserRole;
import org.qifu.core.service.IAccountService;
import org.qifu.core.service.IRolePermissionService;
import org.qifu.core.service.ISysLoginLogService;
import org.qifu.core.service.IUserRoleService;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.stereotype.Component;

@Component
public class AuthComponents {
	private final AuthenticationManager authenticationManager;	
	
	private final JwtAuthLoginedUserRoleService jwtAuthLoginedUserRoleService;
	
	private final IUserRoleService<TbUserRole, String> userRoleService; 
	
	private final IRolePermissionService<TbRolePermission, String> rolePermissionService;	
	
	private final IAccountService<TbAccount, String> accountService;

	private final ISysLoginLogService<TbSysLoginLog, String> sysLoginLogService;
	
	public AuthComponents(AuthenticationManager authenticationManager, 
			JwtAuthLoginedUserRoleService jwtAuthLoginedUserRoleService,
			IUserRoleService<TbUserRole, String> userRoleService,
			IRolePermissionService<TbRolePermission, String> rolePermissionService,
			IAccountService<TbAccount, String> accountService,
			ISysLoginLogService<TbSysLoginLog, String> sysLoginLogService) {
		super();
		this.authenticationManager = authenticationManager;
		this.jwtAuthLoginedUserRoleService = jwtAuthLoginedUserRoleService;
		this.userRoleService = userRoleService;
		this.rolePermissionService = rolePermissionService;
		this.accountService = accountService;
		this.sysLoginLogService = sysLoginLogService;
	}

	public AuthenticationManager getAuthenticationManager() {
		return authenticationManager;
	}

	public JwtAuthLoginedUserRoleService getJwtAuthLoginedUserRoleService() {
		return jwtAuthLoginedUserRoleService;
	}

	public IUserRoleService<TbUserRole, String> getUserRoleService() {
		return userRoleService;
	}

	public IRolePermissionService<TbRolePermission, String> getRolePermissionService() {
		return rolePermissionService;
	}

	public IAccountService<TbAccount, String> getAccountService() {
		return accountService;
	}

	public ISysLoginLogService<TbSysLoginLog, String> getSysLoginLogService() {
		return sysLoginLogService;
	}
	
}
