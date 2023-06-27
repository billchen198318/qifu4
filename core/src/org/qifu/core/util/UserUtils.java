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

import org.apache.commons.lang3.StringUtils;
import org.qifu.base.Constants;
import org.qifu.base.model.BaseUserInfo;
import org.qifu.base.model.UserRoleAndPermission;
import org.qifu.base.model.YesNo;
import org.qifu.base.model.ZeroKeyProvide;
import org.qifu.base.util.UserLocalUtils;
import org.qifu.core.model.User;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public class UserUtils {
	
	private static List<UserRoleAndPermission> backgroundRoleList = new ArrayList<UserRoleAndPermission>(); 
	
	private static User backgroundUser = null;
	
	static {
		UserRoleAndPermission backgroundUserRole1 = new UserRoleAndPermission();
		backgroundUserRole1.setRole(Constants.SUPER_ROLE_ADMIN);
		UserRoleAndPermission backgroundUserRole2 = new UserRoleAndPermission();
		backgroundUserRole2.setRole(Constants.SUPER_ROLE_ALL);
		backgroundRoleList.add(backgroundUserRole1);
		backgroundRoleList.add(backgroundUserRole2);
		backgroundUser = new User(ZeroKeyProvide.OID_KEY, Constants.SYSTEM_BACKGROUND_USER, "", YesNo.YES, backgroundRoleList);
	}
	
	public static BaseUserInfo setUserInfoForUserLocalUtils() {
		User user = getCurrentUser();
		if (user == null) {
			return null;
		}
		return setUserInfoForUserLocalUtils(user.getUsername());
	}
	
	public static BaseUserInfo setUserInfoForUserLocalUtils(String accountId) {
		BaseUserInfo userInfo = new BaseUserInfo();
		userInfo.setUserId(accountId);
		UserLocalUtils.setUserInfo(userInfo);
		return userInfo;
	}	
	
	public static BaseUserInfo setUserInfoForUserLocalUtils(String accountId, String roleIds) {
		BaseUserInfo userInfo = new BaseUserInfo();
		userInfo.setUserId(accountId);
		//userInfo.setRoleIds(roleIds);
		UserLocalUtils.setUserInfo(userInfo);
		return userInfo;
	}		
	
	public static BaseUserInfo setUserInfoForUserLocalUtilsBackgroundMode() {
		return setUserInfoForUserLocalUtils( Constants.SYSTEM_BACKGROUND_USER );
	}		
	
	public static void removeForUserLocalUtils() {
		UserLocalUtils.remove();
	}
	
	public static User getCurrentUser() {
		// 2021-08-26 rem , for META-INF/resource/create-user-data-ldap-mode.groovy and some background job.
		/*
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null && auth.getPrincipal() != null && (auth.getPrincipal() instanceof User)) {
			return (User) auth.getPrincipal();
		}
		*/
		if ( UserLocalUtils.getUserInfo() != null && Constants.SYSTEM_BACKGROUND_USER.equals(UserLocalUtils.getUserInfo().getUserId()) ) {
			if (backgroundUser != null) {
				return backgroundUser;
			}
			return new User(ZeroKeyProvide.OID_KEY, Constants.SYSTEM_BACKGROUND_USER, "", YesNo.YES, backgroundRoleList);
		}
		// 2021-08-26 move , for META-INF/resource/create-user-data-ldap-mode.groovy and some background job.
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null && auth.getPrincipal() != null && (auth.getPrincipal() instanceof User)) {
			return (User) auth.getPrincipal();
		}		
		
		// 2021-10-31 add , for JWT token USER_ID info
		if ( UserLocalUtils.getUserInfo() != null ) {
			if ( UserLocalUtils.getUserInfo() instanceof BaseUserInfo ) {
				BaseUserInfo userInfo = (BaseUserInfo) UserLocalUtils.getUserInfo();
				
				//String roles[] = StringUtils.defaultString( userInfo.getRoleIds() ).split(Constants.DEFAULT_SPLIT_DELIMITER);
				List<UserRoleAndPermission> currentRoleList = new ArrayList<UserRoleAndPermission>();
				String isAdmin = YesNo.NO;
				
				/*
				for (int i = 0; roles != null && i < roles.length; i++) {
					if (Constants.SUPER_ROLE_ADMIN.equals(roles[i]) || Constants.SUPER_ROLE_ALL.equals(roles[i])) {
						isAdmin = YesNo.YES;
					}
					TbUserRole ur = new TbUserRole();
					ur.setOid(ZeroKeyProvide.OID_KEY);
					ur.setAccount( userInfo.getUserId() );
					ur.setRole( roles[i] );
					ur.setDescription("");
					currentRoleList.add(ur);
				}
				*/
				return new User(ZeroKeyProvide.OID_KEY, userInfo.getUserId(), "", isAdmin, currentRoleList);				
			}
		}
		
		return null;
	}
	
	public static boolean isAdmin() {
		User user = getCurrentUser();
		boolean isAdm = false;
		if (user != null && user.getRoles() != null) {
			for (int i = 0; i < user.getRoles().size() && !isAdm; i++) {
				if (Constants.SUPER_ROLE_ADMIN.equals(user.getRoles().get(i).getRole()) || Constants.SUPER_ROLE_ALL.equals(user.getRoles().get(i).getRole())) {
					isAdm = true;
				}
			}
		}
		return isAdm;
	}
	
	public static boolean hasRole(String roleId) {
		if (isAdmin()) {
			return true;
		}
		if (StringUtils.isBlank(roleId)) {
			return false;
		}
		User user = getCurrentUser();
		boolean hasRole = false;
		if (user != null && user.getRoles() != null) {
			for (int i = 0; i < user.getRoles().size() && !hasRole; i++) {
				if (roleId.equals(user.getRoles().get(i).getRole())) {
					hasRole = true;
				}
			}
		}
		return hasRole;		
	}
	
	public static boolean isPermitted(String perm) {
		if (isAdmin()) {
			return true;
		}
		if (StringUtils.isBlank(perm)) {
			return false;
		}
		User user = getCurrentUser();
		boolean isPrem = false;
		if (user != null && user.getRoles() != null) {
			for (int i = 0; i < user.getRoles().size() && !isPrem; i++) {
				UserRoleAndPermission userRole = user.getRoles().get(i);
				if (userRole.getRolePermission() != null) {
					for (String rp : userRole.getRolePermission()) {
						if (perm.equals(rp)) {
							isPrem = true;
						}
					}
				}
			}
		}
		return isPrem;
	}
	
}
