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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.qifu.base.Constants;
import org.qifu.base.model.BaseUserInfo;
import org.qifu.base.model.IUserInfoProvide;
import org.qifu.base.model.RolePermissionAttr;
import org.qifu.base.model.UserRoleAndPermission;
import org.qifu.base.model.YesNoKeyProvide;
import org.qifu.base.util.UserLocalUtils;
import org.qifu.core.model.PermissionType;
import org.qifu.core.model.User;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public class UserUtils {
	
	private static final List<UserRoleAndPermission> backgroundRoleList = new ArrayList<>(); 
	private static final User backgroundUser;
	
	protected UserUtils() {
		throw new IllegalStateException("Utils class: UserUtils");
	}
	
	static {
		UserRoleAndPermission backgroundUserRole1 = new UserRoleAndPermission();
		backgroundUserRole1.setRole(Constants.SUPER_ROLE_ADMIN);
		UserRoleAndPermission backgroundUserRole2 = new UserRoleAndPermission();
		backgroundUserRole2.setRole(Constants.SUPER_ROLE_ALL);
		backgroundRoleList.add(backgroundUserRole1);
		backgroundRoleList.add(backgroundUserRole2);
		backgroundUser = new User(Constants.SYSTEM_BACKGROUND_USER, "", YesNoKeyProvide.YES, backgroundRoleList);
	}
	
	public static User setUserInfoForUserLocalUtils() {
		User user = getCurrentUser();
		if (user == null) {
			return null;
		}
		return setUserInfoForUserLocalUtils(user.getUsername());
	}
	
	public static User setUserInfoForUserLocalUtils(String accountId) {
		User userInfo = new User(accountId, "", YesNoKeyProvide.YES);
		userInfo.setUserId(accountId);
		UserLocalUtils.setUserInfo(userInfo);
		return userInfo;
	}	
	
	public static User setUserInfoForUserLocalUtils(String accountId, List<String> roleIds) {
		User userInfo = new User(accountId, "", YesNoKeyProvide.YES);
		userInfo.setUserId(accountId);
		
		if (CollectionUtils.isNotEmpty(roleIds)) {
			List<UserRoleAndPermission> roles = roleIds.stream()
					.filter(StringUtils::isNotBlank)
					.map(roleId -> {
						UserRoleAndPermission ur = new UserRoleAndPermission();
						ur.setRole(roleId);
						return ur;
					})
					.collect(Collectors.toList());
			userInfo.setRoles(roles);
		} else {
			userInfo.setRoles(new ArrayList<>());
		}
		
		UserLocalUtils.setUserInfo(userInfo);
		return userInfo;
	}		
	
	public static User setUserInfoForUserLocalUtils(String accountId, List<String> roleIds, Map<String, List<RolePermissionAttr>> rolePermissionMap) {
		User u = setUserInfoForUserLocalUtils(accountId, roleIds);
		if (u.getRoles() != null && rolePermissionMap != null) {
			for (UserRoleAndPermission urap : u.getRoles()) {
				List<RolePermissionAttr> permList = rolePermissionMap.get(urap.getRole());
				if (permList != null) {
					urap.setRolePermission(permList);
				}
			}
		}
		return u;
	}	
	
	public static User setUserInfoForUserLocalUtilsBackgroundMode() {
		return setUserInfoForUserLocalUtils(Constants.SYSTEM_BACKGROUND_USER);
	}		
	
	public static void removeForUserLocalUtils() {
		UserLocalUtils.remove();
	}
	
	public static User getCurrentUser() {
		IUserInfoProvide localUserInfo = UserLocalUtils.getUserInfo();
		
		if (localUserInfo != null && Constants.SYSTEM_BACKGROUND_USER.equals(localUserInfo.getUserId())) {
			return backgroundUser;
		}
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null && auth.getPrincipal() instanceof User user) {
			return user;
		}		
		
		if (localUserInfo instanceof User user) {
			return user;
		}
		
		if (localUserInfo instanceof BaseUserInfo userInfo) {
			return new User(userInfo.getUserId(), "", YesNoKeyProvide.NO, new ArrayList<>());
		}
		
		return null;
	}
	
	public static boolean isAdmin() {
		User user = getCurrentUser();
		if (user == null || CollectionUtils.isEmpty(user.getRoles())) {
			return false;
		}
		return user.getRoles().stream()
				.anyMatch(ur -> Constants.SUPER_ROLE_ADMIN.equals(ur.getRole()) || 
						        Constants.SUPER_ROLE_ALL.equals(ur.getRole()));
	}
	
	public static boolean hasRole(String roleId) {
		if (isAdmin()) {
			return true;
		}
		if (StringUtils.isBlank(roleId)) {
			return false;
		}
		User user = getCurrentUser();
		if (user == null || CollectionUtils.isEmpty(user.getRoles())) {
			return false;
		}
		return user.getRoles().stream()
				.anyMatch(ur -> roleId.equals(ur.getRole()));
	}
	
	public static boolean isPermitted(String perm) {
		return isPermitted(perm, PermissionType.SERVICE.name()) 
				|| isPermitted(perm, PermissionType.CONTROLLER.name()) 
				|| isPermitted(perm, PermissionType.VIEW.name());
	}
	
	public static boolean isPermitted(String perm, String permissionType) {
		if (isAdmin()) {
			return true;
		}
		if (StringUtils.isBlank(perm)) {
			return false;
		}
		User user = getCurrentUser();
		if (user == null || CollectionUtils.isEmpty(user.getRoles())) {
			return false;
		}
		return checkPermitted(user, perm, permissionType);
	}
	
	private static boolean checkPermitted(User user, String perm, String permissionType) {
		return user.getRoles().stream()
				.filter(ur -> ur != null && CollectionUtils.isNotEmpty(ur.getRolePermission()))
				.flatMap(ur -> ur.getRolePermission().stream())
				.anyMatch(rp -> rp != null && 
						        permissionType.equals(rp.getType()) && 
						        perm.equals(rp.getPermission()));
	}
	
}
