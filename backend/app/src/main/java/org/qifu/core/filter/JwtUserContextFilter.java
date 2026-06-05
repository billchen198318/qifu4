package org.qifu.core.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.qifu.base.Constants;
import org.qifu.base.exception.ServiceException;
import org.qifu.base.model.RolePermissionAttr;
import org.qifu.core.entity.TbRolePermission;
import org.qifu.core.entity.TbUserRole;
import org.qifu.core.service.IRolePermissionService;
import org.qifu.core.service.IUserRoleService;
import org.qifu.core.util.UserUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JwtUserContextFilter extends OncePerRequestFilter {
	private static final Logger logger = LoggerFactory.getLogger(JwtUserContextFilter.class);
	private static final String USERID_KEY_NAME = "userId";
	
	private final IUserRoleService<TbUserRole, String> userRoleService;
	
	private final IRolePermissionService<TbRolePermission, String> rolePermissionService;
	
	public JwtUserContextFilter(IUserRoleService<TbUserRole, String> userRoleService,
			IRolePermissionService<TbRolePermission, String> rolePermissionService) {
		this.userRoleService = userRoleService;
		this.rolePermissionService = rolePermissionService;
	}

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		try {
			this.buildUserContext();
			filterChain.doFilter(request, response);
		} finally {
			UserUtils.removeForUserLocalUtils();
			MDC.remove(USERID_KEY_NAME);
		}
	}
	
	private void buildUserContext() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (!(authentication instanceof JwtAuthenticationToken jwtAuthentication)) {
			return;
		}
		Jwt jwt = jwtAuthentication.getToken();
		String userId = StringUtils.defaultString(jwt.getClaimAsString(Constants.TOKEN_USER_PARAM_NAME));
		if (StringUtils.isBlank(userId)) {
			logger.warn(">>> JWT authenticated, but no user claim: {}", Constants.TOKEN_USER_PARAM_NAME);
			return;
		}
		List<String> roleIds = new ArrayList<>();
		Map<String, List<RolePermissionAttr>> rolePermissionMap = new HashMap<>();
		this.fillUserRoleData(userId, roleIds, rolePermissionMap);
		UserUtils.setUserInfoForUserLocalUtils(userId, roleIds, rolePermissionMap);
		MDC.put(USERID_KEY_NAME, userId);
		logger.info("User context builder from Resource Server JWT : {} , role: {}", userId, roleIds);
	}
	
	private void fillUserRoleData(String userId, List<String> roleIds, Map<String, List<RolePermissionAttr>> rolePermissionMap) {
		try {
			if (StringUtils.isBlank(userId)) {
				return;
			}
			Map<String, Object> param = new HashMap<>();
			param.put("account", userId);
			List<TbUserRole> urList = this.userRoleService.selectListByParams(param).getValue();
			for (int j = 0; urList != null && j < urList.size(); j++) {
				TbUserRole ur = urList.get(j);
				roleIds.add(ur.getRole());
				param.clear();
				param.put("role", ur.getRole());
				List<TbRolePermission> rpList = this.rolePermissionService.selectListByParams(param).getValue();
				rolePermissionMap.put(ur.getRole(), new ArrayList<>());
				List<RolePermissionAttr> permList = rolePermissionMap.get(ur.getRole());
				for (int x = 0; rpList != null && x < rpList.size(); x++) {
					TbRolePermission rp = rpList.get(x);
					RolePermissionAttr rpa = new RolePermissionAttr();
					rpa.setPermission(rp.getPermission());
					rpa.setType(rp.getPermType());
					permList.add(rpa);
				}
			}
		} catch (ServiceException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
