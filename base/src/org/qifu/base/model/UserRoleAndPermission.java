package org.qifu.base.model;

import java.util.List;

public class UserRoleAndPermission implements java.io.Serializable {
	private static final long serialVersionUID = -7811595650387118293L;
	
	private String role;
	
	private List<String> rolePermission;
	
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}

	public List<String> getRolePermission() {
		return rolePermission;
	}

	public void setRolePermission(List<String> rolePermission) {
		this.rolePermission = rolePermission;
	}
	
}
