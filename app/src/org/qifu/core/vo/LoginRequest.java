package org.qifu.core.vo;

public class LoginRequest implements java.io.Serializable {
	private static final long serialVersionUID = -1619501251369763324L;
	
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
}
