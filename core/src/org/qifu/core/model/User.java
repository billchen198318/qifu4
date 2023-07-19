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
package org.qifu.core.model;

import org.apache.commons.collections.CollectionUtils;
import org.qifu.base.CoreAppConstants;
import org.qifu.base.model.BaseUserInfo;
import org.qifu.base.model.RolePermissionAttr;
import org.qifu.base.model.UserRoleAndPermission;
import org.qifu.base.model.YesNo;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.List;

public class User extends BaseUserInfo implements UserDetails {
	private static final long serialVersionUID = 8145283038236989680L;
	
	//private String oid;
    private String username;
    private String password;
    private List<UserRoleAndPermission> roles;
    private String onJob;
    private String byLdap = YesNo.NO;

    public User(/*String oid,*/ String username, String password, String onJob, List<UserRoleAndPermission> roles) {
    	//this.oid = oid;
        this.username = username;
        this.password = password;
        this.onJob = onJob;
        this.roles = roles;
        this.setUserId( this.username );
    }
    
    public User(/*String oid,*/ String username, String password, String onJob) {
    	//this.oid = oid;
        this.username = username;
        this.password = password;
        this.onJob = onJob;
        this.setUserId( this.username );    	
    }
    
    @Override
    public List<GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> auths = new ArrayList<GrantedAuthority>();
        if (CollectionUtils.isEmpty(this.roles)) {
        	auths.add( new SimpleGrantedAuthority("ROLE_" + CoreAppConstants.SYS_BLANK_ROLE) );
        	return auths;
        }
        for (UserRoleAndPermission userRoleAndPerm : this.roles) {
            auths.add( new SimpleGrantedAuthority("ROLE_" + userRoleAndPerm.getRole()) );
            if (userRoleAndPerm.getRolePermission() != null) {
            	for (RolePermissionAttr perm : userRoleAndPerm.getRolePermission()) {
            		auths.add( new SimpleGrantedAuthority(perm.getPermission()) );
            	}
            }            
        }
        return auths;
    }

    @Override
    public String getPassword() {
        return this.password;
    }
    
    public void blankPassword() {
    	this.password = "";
    }
    
    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return (YesNo.YES.equals(this.onJob) ? true : false);
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return (YesNo.YES.equals(this.onJob) ? true : false);
    }
    
    /*
	public String getOid() {
		return oid;
	}
	
	public void setOid(String oid) {
		this.oid = oid;
	}	
	*/
	
	public List<UserRoleAndPermission> getRoles() {
		return roles;
	}
	
	public void setRoles(List<UserRoleAndPermission> roles) {
		this.roles = roles;
	}	
	
	public String getOnJob() {
		return onJob;
	}

	public String getByLdap() {
		return byLdap;
	}

	public void setByLdap(String byLdap) {
		this.byLdap = byLdap;
	}
    
}
