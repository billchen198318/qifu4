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
package org.qifu.base.util;

import org.qifu.base.exception.ControllerException;
import org.qifu.base.message.BaseSystemMessage;
import org.qifu.base.model.DefaultControllerJsonResultObj;
import org.qifu.base.model.QueryParamBuilder;
import org.qifu.base.model.QueryResult;
import org.qifu.base.model.SearchBody;
import org.qifu.base.model.YesNo;

public class BaseApiSupport extends YesNo {
	
	private static final long serialVersionUID = -3934810030443337825L;

//	@Autowired
//	TokenFlagCheckConfigProperties tokenFlagCheckConfigProperties;

	protected QueryParamBuilder queryParameter() {
		return QueryParamBuilder.build();
	}
	
	protected QueryParamBuilder queryParameter(SearchBody searchBody) {
		return QueryParamBuilder.build(searchBody);
	}	
	
	/*
	protected Map<String, Claim> getTokenClaim(String token) {
		TokenValidateFlagCheck flagCheck = null;
		try {
			flagCheck = ((TokenValidateFlagCheck) Class.forName(tokenFlagCheckConfigProperties.getClassName()).newInstance());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null == flagCheck) {
				Map<String, Claim> claimToken = new HashMap<String, Claim>();
				return claimToken;
			}
		}
		Map<String, Claim> claimToken = TokenBuilderUtil.verifyToken(token, flagCheck);		
		return claimToken;
	}
	*/
	
	protected <T> DefaultControllerJsonResultObj<T> initDefaultJsonResult() {
		DefaultControllerJsonResultObj<T> r = new DefaultControllerJsonResultObj<T>();
		if (UserLocalUtils.getUserInfo() != null) {
			r.setIsAuth(YES);
			r.setLogin(YES);
		}
		return r;
	}
	
	protected <T> QueryResult<T> initResult() {
		QueryResult<T> result = new QueryResult<T>();
		this.initResult(result);
		return result;
	}
	
	protected <T> void initResult(QueryResult<T> result) {
		if (result == null) {
			return;
		}
		result.setIsAuth(NO);
		// FIXME: 要改 UserLocalUtils 為 Apache-shiro 或別的登入session管理元件
		if (UserLocalUtils.getUserInfo() != null) {
			result.setIsAuth(YES);
		}
		result.setSuccess(NO);
	}
	
	protected <T> void successResult(DefaultControllerJsonResultObj<T> result) {
		if (result == null) {
			return;
		}
		result.setSuccess(YES);
	}	
	
	protected <T> void successResult(QueryResult<T> result) {
		if (result == null) {
			return;
		}
		result.setSuccess(YES);
	}
	
	protected <T> void successResult(QueryResult<T> result, T value) {
		if (result == null) {
			return;
		}
		result.setSuccess(YES);
		result.setValue(value);
	}
	
	protected <T> void noSuccessResult(QueryResult<T> result) {
		if (result == null) {
			return;
		}
		result.setSuccess(NO);
	}
	
	protected <T> void noSuccessResult(QueryResult<T> result, String message) {
		if (result == null) {
			return;
		}
		result.setSuccess(NO);
		result.setMessage(message);
	}	
	
	protected <T> void noSuccessResult(QueryResult<T> result, Exception e) {
		this.noSuccessResult(result, ( (e != null && e.getMessage() !=null) ? e.getMessage().toString() : BaseSystemMessage.objectNull() ));		
	}	
	
	protected void exceptionResult(DefaultControllerJsonResultObj<?> result, Exception e) {
		e.printStackTrace();
		if (e == null || e.getMessage() == null) {
			result.setMessage( BaseSystemMessage.objectNull() );
		} else {
			result.setMessage( e.getMessage().toString() );
		}
		result.setSuccess( ControllerException.PAGE_EXCEPTION_CODE );
	}
	
}

