package org.qifu.base.support;

public interface TokenStoreValidate {
	
	public boolean refreshValidate(String refreshTokenOrOID);
	
	public boolean accessValidate(String accessToken);
	
}
