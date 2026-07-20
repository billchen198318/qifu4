# Qifu4 Backend Base Module Java / Resource Analysis

Scope: `C:\home\qifu4\backend\base\**`.

## Summary

| Type | Count |
| --- | ---: |
| Java | 81 |
| Properties | 9 |
| JSON | 9 |

## Java Index

| File | Role | Type | Endpoints | Methods | Local Dependencies |
| --- | --- | --- | ---: | ---: | ---: |
| `backend/base/src/main/java/org/qifu/base/AppContext.java` | Java class | class AppContext | 0 | 4 | 0 |
| `backend/base/src/main/java/org/qifu/base/Constants.java` | Java class | class Constants | 0 | 2 | 2 |
| `backend/base/src/main/java/org/qifu/base/exception/AuthorityException.java` | Java class | class AuthorityException | 0 | 0 | 0 |
| `backend/base/src/main/java/org/qifu/base/exception/BaseSysException.java` | Java class | class BaseSysException | 0 | 0 | 0 |
| `backend/base/src/main/java/org/qifu/base/exception/ControllerException.java` | Java class | class ControllerException | 0 | 0 | 0 |
| `backend/base/src/main/java/org/qifu/base/exception/ServiceException.java` | Java class | class ServiceException | 0 | 0 | 0 |
| `backend/base/src/main/java/org/qifu/base/interceptor/MDCInterceptor.java` | Java class | class MDCInterceptor | 0 | 2 | 0 |
| `backend/base/src/main/java/org/qifu/base/mapper/IBaseMapper.java` | MyBatis mapper or DAO | interface IBaseMapper | 0 | 0 | 0 |
| `backend/base/src/main/java/org/qifu/base/message/BaseSystemMessage.java` | Java class | class BaseSystemMessage | 0 | 22 | 2 |
| `backend/base/src/main/java/org/qifu/base/model/BaseTemplateEntity.java` | DTO/VO/model | interface BaseTemplateEntity | 0 | 0 | 0 |
| `backend/base/src/main/java/org/qifu/base/model/BaseUserInfo.java` | DTO/VO/model | class BaseUserInfo | 0 | 6 | 0 |
| `backend/base/src/main/java/org/qifu/base/model/BaseValueObj.java` | DTO/VO/model | class BaseValueObj | 0 | 2 | 1 |
| `backend/base/src/main/java/org/qifu/base/model/CheckControllerFieldHandler.java` | DTO/VO/model | class CheckControllerFieldHandler | 0 | 11 | 2 |
| `backend/base/src/main/java/org/qifu/base/model/ControllerMethodAuthority.java` | DTO/VO/model |  | 0 | 0 | 0 |
| `backend/base/src/main/java/org/qifu/base/model/CreateDateField.java` | DTO/VO/model |  | 0 | 0 | 0 |
| `backend/base/src/main/java/org/qifu/base/model/CreateField.java` | DTO/VO/model | class CreateField | 0 | 4 | 0 |
| `backend/base/src/main/java/org/qifu/base/model/CreateUserField.java` | DTO/VO/model |  | 0 | 0 | 0 |
| `backend/base/src/main/java/org/qifu/base/model/DefaultControllerJsonResultObj.java` | DTO/VO/model | class DefaultControllerJsonResultObj | 0 | 13 | 0 |
| `backend/base/src/main/java/org/qifu/base/model/DefaultResult.java` | DTO/VO/model | class DefaultResult | 0 | 9 | 1 |
| `backend/base/src/main/java/org/qifu/base/model/EntityPK.java` | DTO/VO/model |  | 0 | 0 | 0 |
| `backend/base/src/main/java/org/qifu/base/model/EntityUK.java` | DTO/VO/model |  | 0 | 0 | 0 |
| `backend/base/src/main/java/org/qifu/base/model/IUserInfoProvide.java` | DTO/VO/model | interface IUserInfoProvide | 0 | 0 | 0 |
| `backend/base/src/main/java/org/qifu/base/model/PageOf.java` | DTO/VO/model | class PageOf | 0 | 22 | 1 |
| `backend/base/src/main/java/org/qifu/base/model/PleaseSelect.java` | DTO/VO/model | class PleaseSelect | 0 | 6 | 1 |
| `backend/base/src/main/java/org/qifu/base/model/QueryControllerJsonResultObj.java` | DTO/VO/model | class QueryControllerJsonResultObj | 0 | 9 | 0 |
| `backend/base/src/main/java/org/qifu/base/model/QueryParamBuilder.java` | DTO/VO/model | class QueryParamBuilder | 0 | 26 | 1 |
| `backend/base/src/main/java/org/qifu/base/model/QueryResult.java` | DTO/VO/model | class QueryResult | 0 | 10 | 0 |
| `backend/base/src/main/java/org/qifu/base/model/RolePermissionAttr.java` | DTO/VO/model | class RolePermissionAttr | 0 | 4 | 0 |
| `backend/base/src/main/java/org/qifu/base/model/ScriptTypeCode.java` | DTO/VO/model | class ScriptTypeCode | 0 | 2 | 0 |
| `backend/base/src/main/java/org/qifu/base/model/SearchBody.java` | DTO/VO/model | class SearchBody | 0 | 4 | 0 |
| `backend/base/src/main/java/org/qifu/base/model/SearchValue.java` | DTO/VO/model | class SearchValue | 0 | 2 | 0 |
| `backend/base/src/main/java/org/qifu/base/model/ServiceAuthority.java` | DTO/VO/model |  | 0 | 0 | 0 |
| `backend/base/src/main/java/org/qifu/base/model/ServiceMethodAuthority.java` | DTO/VO/model |  | 0 | 0 | 0 |
| `backend/base/src/main/java/org/qifu/base/model/ServiceMethodType.java` | DTO/VO/model | enum ServiceMethodType | 0 | 0 | 0 |
| `backend/base/src/main/java/org/qifu/base/model/SortType.java` | DTO/VO/model | class SortType | 0 | 1 | 0 |
| `backend/base/src/main/java/org/qifu/base/model/TableMetadataModel.java` | DTO/VO/model | class TableMetadataModel | 0 | 6 | 0 |
| `backend/base/src/main/java/org/qifu/base/model/TemplateResult.java` | DTO/VO/model | class TemplateResult | 0 | 4 | 0 |
| `backend/base/src/main/java/org/qifu/base/model/TokenBuilderVariable.java` | DTO/VO/model | class TokenBuilderVariable | 0 | 5 | 0 |
| `backend/base/src/main/java/org/qifu/base/model/UpdateDateField.java` | DTO/VO/model |  | 0 | 0 | 0 |
| `backend/base/src/main/java/org/qifu/base/model/UpdateField.java` | DTO/VO/model | class UpdateField | 0 | 4 | 0 |
| `backend/base/src/main/java/org/qifu/base/model/UpdateUserField.java` | DTO/VO/model |  | 0 | 0 | 0 |
| `backend/base/src/main/java/org/qifu/base/model/UserRoleAndPermission.java` | DTO/VO/model | class UserRoleAndPermission | 0 | 4 | 0 |
| `backend/base/src/main/java/org/qifu/base/model/YesNo.java` | DTO/VO/model | class YesNo | 0 | 3 | 0 |
| `backend/base/src/main/java/org/qifu/base/model/YesNoKeyProvide.java` | DTO/VO/model | interface YesNoKeyProvide | 0 | 0 | 0 |
| `backend/base/src/main/java/org/qifu/base/model/YesNoTinyKeyProvide.java` | DTO/VO/model | interface YesNoTinyKeyProvide | 0 | 0 | 0 |
| `backend/base/src/main/java/org/qifu/base/model/ZeroKeyProvide.java` | DTO/VO/model | class ZeroKeyProvide | 0 | 0 | 0 |
| `backend/base/src/main/java/org/qifu/base/properties/BaseInfoConfigProperties.java` | Spring configuration | class BaseInfoConfigProperties | 0 | 20 | 0 |
| `backend/base/src/main/java/org/qifu/base/properties/JasperreportConfigProperties.java` | Spring configuration | class JasperreportConfigProperties | 0 | 4 | 0 |
| `backend/base/src/main/java/org/qifu/base/properties/LdapLoginConfigProperties.java` | Spring configuration | class LdapLoginConfigProperties | 0 | 20 | 0 |
| `backend/base/src/main/java/org/qifu/base/properties/MqttConfigProperties.java` | Spring configuration | class MqttConfigProperties | 0 | 18 | 0 |
| `backend/base/src/main/java/org/qifu/base/properties/PageVariableConfigProperties.java` | Spring configuration | class PageVariableConfigProperties | 0 | 5 | 1 |
| `backend/base/src/main/java/org/qifu/base/properties/SpringMailSessionConfigProperties.java` | Spring configuration | class SpringMailSessionConfigProperties | 0 | 3 | 1 |
| `backend/base/src/main/java/org/qifu/base/scheduled/BaseScheduledTasksProvide.java` | Java class | class BaseScheduledTasksProvide | 0 | 3 | 3 |
| `backend/base/src/main/java/org/qifu/base/service/BaseLogicService.java` | Service interface | class BaseLogicService | 0 | 8 | 3 |
| `backend/base/src/main/java/org/qifu/base/service/BaseService.java` | Service interface | class BaseService | 0 | 21 | 15 |
| `backend/base/src/main/java/org/qifu/base/service/IBaseService.java` | Service interface | interface IBaseService | 0 | 14 | 4 |
| `backend/base/src/main/java/org/qifu/base/service/IBaseServiceCustomPrimaryKeyProvide.java` | Service interface | interface IBaseServiceCustomPrimaryKeyProvide | 0 | 0 | 0 |
| `backend/base/src/main/java/org/qifu/base/support/TokenStore.java` | Java class | interface TokenStore | 0 | 0 | 0 |
| `backend/base/src/main/java/org/qifu/base/support/TokenStoreBuilder.java` | Java class | class TokenStoreBuilder | 0 | 2 | 0 |
| `backend/base/src/main/java/org/qifu/base/support/TokenStoreConfig.java` | Java class | class TokenStoreConfig | 0 | 1 | 1 |
| `backend/base/src/main/java/org/qifu/base/support/TokenStoreValidate.java` | Java class | interface TokenStoreValidate | 0 | 0 | 0 |
| `backend/base/src/main/java/org/qifu/base/support/TokenStoreValidateBuilder.java` | Java class | class TokenStoreValidateBuilder | 0 | 6 | 0 |
| `backend/base/src/main/java/org/qifu/base/SysMsgConstants.java` | Java class | class SysMsgConstants | 0 | 0 | 0 |
| `backend/base/src/main/java/org/qifu/base/util/BaseApiSupport.java` | Utility | class BaseApiSupport | 0 | 12 | 7 |
| `backend/base/src/main/java/org/qifu/base/util/EntityParameterGenerateUtil.java` | Utility | class EntityParameterGenerateUtil | 0 | 9 | 8 |
| `backend/base/src/main/java/org/qifu/base/util/TokenBuilderUtils.java` | Utility | class TokenBuilderUtils | 0 | 4 | 5 |
| `backend/base/src/main/java/org/qifu/base/util/UserLocalUtils.java` | Utility | class UserLocalUtils | 0 | 3 | 1 |
| `backend/base/src/main/java/org/qifu/util/DataUtils.java` | Utility | class DataUtils | 0 | 10 | 2 |
| `backend/base/src/main/java/org/qifu/util/EncryptorUtils.java` | Utility | class EncryptorUtils | 0 | 6 | 1 |
| `backend/base/src/main/java/org/qifu/util/FSUtils.java` | Utility | class FSUtils | 0 | 10 | 0 |
| `backend/base/src/main/java/org/qifu/util/FtpClientUtils.java` | Utility | class FtpClientUtils | 0 | 21 | 0 |
| `backend/base/src/main/java/org/qifu/util/GenericsUtils.java` | Utility | class GenericsUtils | 0 | 2 | 0 |
| `backend/base/src/main/java/org/qifu/util/LoadResources.java` | Utility | class LoadResources | 0 | 4 | 1 |
| `backend/base/src/main/java/org/qifu/util/ManualDataSourceFactory.java` | Utility | class ManualDataSourceFactory | 0 | 2 | 0 |
| `backend/base/src/main/java/org/qifu/util/PdfOwnerUserBuilder.java` | Utility | class PdfOwnerUserBuilder | 0 | 10 | 1 |
| `backend/base/src/main/java/org/qifu/util/PdfWatermarkUtils.java` | Utility | class PdfWatermarkUtils | 0 | 1 | 0 |
| `backend/base/src/main/java/org/qifu/util/ScriptExpressionUtils.java` | Utility | class ScriptExpressionUtils | 0 | 2 | 1 |
| `backend/base/src/main/java/org/qifu/util/SFtpClientUtils.java` | Utility | class SFtpClientUtils, interface SftpAction | 0 | 5 | 0 |
| `backend/base/src/main/java/org/qifu/util/SimpleUtils.java` | Utility | class SimpleUtils | 0 | 49 | 0 |
| `backend/base/src/main/java/org/qifu/util/TableMetadataModelUtils.java` | Utility | class TableMetadataModelUtils | 0 | 1 | 1 |
| `backend/base/src/test/java/org/qifu/util/EncryptorUtilsTest.java` | Utility | class EncryptorUtilsTest | 0 | 1 | 0 |

## Java Files Detailed Analysis

### `backend/base/src/main/java/org/qifu/base/AppContext.java`

- Purpose: Java class; declares class AppContext; has 4 detected methods
- Package: `org.qifu.base`
- Role: Java class
- Main types: `class AppContext`
- Spring dependencies: `org.springframework.beans.BeansException`, `org.springframework.context.ApplicationContext`
- Main methods:
  - L35 `public void init(ApplicationContext applicationContext)`
  - L39 `public ApplicationContext getContext()`
  - L43 `public Object getBean(String beanId)`
  - L50 `public Object getBean(Class<?> requiredType)`
- Main fields:
  - L29 `ApplicationContext context`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\AppContext.java`
- Size: 1707 bytes

#### Source

````java
/* 
 * Copyright 2012-2017 qifu of copyright Chen Xin Nien
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
package org.qifu.base;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;

public class AppContext {
	
	private static ApplicationContext context = null;
	
	private AppContext() {
		throw new IllegalStateException("Context class");
	}
	
	public static void init(ApplicationContext applicationContext) {
		context = applicationContext;
	}
	
	public static ApplicationContext getContext() {
		return context;
	}
	
	public static Object getBean(String beanId) throws BeansException {
		if (null == context) {
			throw new IllegalArgumentException("context is null.");
		}		
		return context.getBean(beanId);
	}
	
	public static Object getBean(Class<?> requiredType) throws BeansException {
		if (null == context) {
			throw new IllegalArgumentException("context is null.");
		}
		return context.getBean(requiredType);
	}
	
}
````

### `backend/base/src/main/java/org/qifu/base/Constants.java`

- Purpose: Java class; declares class Constants; has 2 detected methods; depends on 2 org.qifu local types
- Package: `org.qifu.base`
- Role: Java class
- Main types: `class Constants`
- Local dependencies: `org.qifu.base.model.YesNoKeyProvide`, `org.qifu.util.SimpleUtils`
- Third-party dependencies: `org.apache.commons.io.FileUtils`, `org.apache.commons.lang3.StringUtils`
- Config keys referenced: `java.io.tmpdir`
- Main methods:
  - L100 `public String getTmpDir()`
  - L104 `public String getWorkTmpDir()`
- Main fields:
  - L42 `String BASE_ENCODING`
  - L47 `String RESERVED_PARAM_NAME_QUERY_SORT_TYPE`
  - L52 `String RESERVED_PARAM_NAME_QUERY_ORDER_BY`
  - L57 `String SUPER_ROLE_ALL`
  - L58 `String SUPER_ROLE_ADMIN`
  - L59 `String SUPER_PERMISSION`
  - L66 `String SESS_LANG`
  - L67 `String SESS_SYSCURRENT_ID`
  - L71 `String QIFU_PAGE_IN_TAB_IFRAME`
  - L72 `String QIFU_PAGE_PROG_PARAM`
  - L77 `String NO_LOGIN_JSON_DATA`
  - L81 `String NO_AUTHZ_JSON_DATA`
  - L83 `String PAGE_MESSAGE`
  - L85 `String HTML_SELECT_NO_SELECT_ID`
  - L86 `String HTML_SELECT_NO_SELECT_NAME`
  - L92 `String DEFAULT_SPLIT_DELIMITER`
  - L94 `String TMP_SUB_DIR_NAME`
  - L96 `String HTML_BR`
  - L98 `String FORWARD_SLASH`
  - L117 `int MAX_SYS_DESCRIPTION_LENGTH`
  - L122 `String TOKEN_USER_PARAM_NAME`
  - L123 `String TOKEN_ISSUER`
  - L124 `String TOKEN_SECRET`
  - L125 `String TOKEN_CHECK_URL_PATH`
  - L126 `String TOKEN_AUTH`
  - L127 `String TOKEN_PREFIX`
  - L128 `String TOKEN_ACCESS_COOKIE_NAME`
  - L129 `String TOKEN_REFRESH_COOKIE_NAME`
  - L131 `String HTTP_REQUEST_PASSWORD_AUTH`
  - L132 `String SYSCODE_TOKEN_CODE`
  - L133 `String SYSCODE_TOKEN_TYPE`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\Constants.java`
- Size: 5754 bytes

#### Source

````java
/* 
 * Copyright 2012-2017 qifu of copyright Chen Xin Nien
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
package org.qifu.base;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.qifu.base.model.YesNoKeyProvide;
import org.qifu.util.SimpleUtils;

public class Constants {
	
	private Constants() {
		throw new IllegalStateException("Constants");
	}
	
	/**
	 * 不要更改這個設定
	 */
	public static final String BASE_ENCODING = StandardCharsets.UTF_8.name();
	
	/**
	 * 保留查詢參數名稱 for PageOf , BaseDAO
	 */
	public static final String RESERVED_PARAM_NAME_QUERY_SORT_TYPE = "sortType";
	
	/**
	 * 保留查詢參數名稱 for PageOf , BaseDAO
	 */
	public static final String RESERVED_PARAM_NAME_QUERY_ORDER_BY = "orderBy";	
	
	public static final String QUERY_TYPE_OF_SELECT="select"; // BaseService 查詢 grid 要用
	public static final String QUERY_TYPE_OF_COUNT="count"; // BaseService 查詢 grid 要用	
	
	public static final String SUPER_ROLE_ALL = "*";
	public static final String SUPER_ROLE_ADMIN = "admin";
	public static final String SUPER_PERMISSION = "*";
	public static final String SYSTEM_BACKGROUND_USER = "system"; // 背景程式要用 , 配 SubjectBuilderForBackground.java 與 shiro.ini
	public static final String SYSTEM_BACKGROUND_PASSWORD = "password99"; // 背景程式要用 , 配 SubjectBuilderForBackground.java 與 shiro.ini
	
	public static final String SERVICE_ID_TYPE_DISTINGUISH_SYMBOL = ":"; // logic service 用來組 service id 與 ServiceMethodType 成字串, 查有沒有權限
	
	public static final String SESS_ACCOUNT="SESSION_QIFU4_ACCOUNT"; // 登入 account id 放到 session 變數名
	public static final String SESS_LANG = "SESSION_QIFU4_LANG";
	public static final String SESS_SYSCURRENT_ID = "SESSION_QIFU4_SYSCURRENT_ID";
	
	public static final String APP_SITE_CURRENTID_COOKIE_NAME = "QIFU4_SYSCURRENT_ID"; // 跨站 cookie 要用的名稱
	
	public static final String QIFU_PAGE_IN_TAB_IFRAME = "qifuIframePage";
	public static final String QIFU_PAGE_PROG_PARAM = "qifuProgId";
	
	/**
	 * GreenStepBaseFormAuthenticationFilter 要用的
	 */
	public static final String NO_LOGIN_JSON_DATA = "{ \"success\":\"" + YesNoKeyProvide.NO + "\",\"message\":\"Please login!\",\"login\":\"" + YesNoKeyProvide.NO + "\",\"isAuthorize\":\"" + YesNoKeyProvide.NO + "\" }";
	/**
	 * GreenStepBaseFormAuthenticationFilter 要用的
	 */	
	public static final String NO_AUTHZ_JSON_DATA = "{ \"success\":\"" + YesNoKeyProvide.NO + "\",\"message\":\"no authorize!\",\"login\":\"" + YesNoKeyProvide.YES + "\",\"isAuthorize\":\"" + YesNoKeyProvide.NO + "\" }";
	
	public static final String PAGE_MESSAGE="pageMessage";
	
	public static final String HTML_SELECT_NO_SELECT_ID="all";
	public static final String HTML_SELECT_NO_SELECT_NAME=" - please select - ";	
	
	public static final String ID_DELIMITER = ";"; // 有時要將多筆 OID 或 key 組成一組字串 , 這是就用這個符號來區分	
	
	public static final String INPUT_NAME_DELIMITER = ":"; // 有時輸入欄位id或名稱,想要有區分一些有意義的資料時用
	
	public static final String DEFAULT_SPLIT_DELIMITER = ";|,";
	
	public static final String TMP_SUB_DIR_NAME = "QIFU4";
	
	public static final String HTML_BR = "<br>";
	
	public static final String FORWARD_SLASH = "/";
	
	public static String getTmpDir() {
		return System.getProperty("java.io.tmpdir");
	}
	
	public static String getWorkTmpDir() {
		String dirPath = getTmpDir() + FORWARD_SLASH + TMP_SUB_DIR_NAME + FORWARD_SLASH;
		File file = new File(dirPath);
		if (!file.exists() || !file.isDirectory()) {
			try {
				FileUtils.forceMkdir(file);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return dirPath;
	}
	
	public static final int MAX_SYS_DESCRIPTION_LENGTH = 500;
	
	// JWT config
	public static final int TOKEN_ACCESS_EXPIRED_INTERVAL = 25; // 25 minute
	public static final int TOKEN_REFRESH_EXPIRED_INTERVAL = 40; // 40 minute
	public static final String TOKEN_USER_PARAM_NAME = "USER_ID";
	public static final String TOKEN_ISSUER = "QIFU4Application";
	public static final String TOKEN_SECRET = StringUtils.defaultIfBlank(System.getenv("QIFU_JWT_SECRET"), "qifu4_default_secret_key_1234567890");
	public static final String TOKEN_CHECK_URL_PATH = FORWARD_SLASH + "api" + FORWARD_SLASH;
	public static final String TOKEN_AUTH = "Authorization";
	public static final String TOKEN_PREFIX = "Bearer";
	public static final String TOKEN_ACCESS_COOKIE_NAME = "QIFU4VNX__uat";
	public static final String TOKEN_REFRESH_COOKIE_NAME = "QIFU4VNX__urt";
	
	public static final String HTTP_REQUEST_PASSWORD_AUTH = "_qifu4_userLoginPassword_" + SimpleUtils.createRandomString(5);
	public static final String SYSCODE_TOKEN_CODE = "TOKEN";
	public static final String SYSCODE_TOKEN_TYPE = "AUTH";
	
}
````

### `backend/base/src/main/java/org/qifu/base/exception/AuthorityException.java`

- Purpose: Java class; declares class AuthorityException
- Package: `org.qifu.base.exception`
- Role: Java class
- Main types: `class AuthorityException extends BaseSysException`
- Main fields:
  - L25 `long serialVersionUID`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\exception\AuthorityException.java`
- Size: 1074 bytes

#### Source

````java
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
package org.qifu.base.exception;

public class AuthorityException extends BaseSysException {
	private static final long serialVersionUID = -993634954037242003L;
	
	public AuthorityException() {
		
	}
	
	public AuthorityException(String msg) {
		super(msg);
	}	
	
}
````

### `backend/base/src/main/java/org/qifu/base/exception/BaseSysException.java`

- Purpose: Java class; declares class BaseSysException
- Package: `org.qifu.base.exception`
- Role: Java class
- Main types: `class BaseSysException extends RuntimeException`
- Main fields:
  - L25 `long serialVersionUID`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\exception\BaseSysException.java`
- Size: 1086 bytes

#### Source

````java
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
package org.qifu.base.exception;

public class BaseSysException extends RuntimeException {
	private static final long serialVersionUID = 3799827669096819441L;
	
	public BaseSysException() {
		super();
	}
	
	public BaseSysException(String message) {
		super(message);
	}
	
	
}
````

### `backend/base/src/main/java/org/qifu/base/exception/ControllerException.java`

- Purpose: Java class; declares class ControllerException
- Package: `org.qifu.base.exception`
- Role: Java class
- Main types: `class ControllerException extends BaseSysException`
- Main fields:
  - L25 `long serialVersionUID`
  - L27 `String PAGE_EXCEPTION_CODE`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\exception\ControllerException.java`
- Size: 1136 bytes

#### Source

````java
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
package org.qifu.base.exception;

public class ControllerException extends BaseSysException {
	private static final long serialVersionUID = -767925711525514382L;
	
	public static final String PAGE_EXCEPTION_CODE = "E";
	
	public ControllerException() {
		
	}
	
	public ControllerException(String msg) {
		super(msg);
	}	
	
}
````

### `backend/base/src/main/java/org/qifu/base/exception/ServiceException.java`

- Purpose: Java class; declares class ServiceException
- Package: `org.qifu.base.exception`
- Role: Java class
- Main types: `class ServiceException extends BaseSysException`
- Main fields:
  - L25 `long serialVersionUID`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\exception\ServiceException.java`
- Size: 1067 bytes

#### Source

````java
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
package org.qifu.base.exception;

public class ServiceException extends BaseSysException {
	private static final long serialVersionUID = 8986003473341314573L;
	
	public ServiceException() {
		
	}
	
	public ServiceException(String msg) {
		super(msg);
	}
	
}
````

### `backend/base/src/main/java/org/qifu/base/interceptor/MDCInterceptor.java`

- Purpose: Java class; declares class MDCInterceptor; has 2 detected methods
- Package: `org.qifu.base.interceptor`
- Role: Java class
- Main types: `class MDCInterceptor implements HandlerInterceptor`
- Key annotations: `Override`
- Spring dependencies: `org.springframework.security.core.Authentication`, `org.springframework.security.core.context.SecurityContextHolder`, `org.springframework.security.core.userdetails.UserDetails`, `org.springframework.web.servlet.HandlerInterceptor`
- Main methods:
  - L37 `public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)`
  - L48 `public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)`
- Main fields:
  - L34 `String USERID_KEY_NAME`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\interceptor\MDCInterceptor.java`
- Size: 2029 bytes

#### Source

````java
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
package org.qifu.base.interceptor;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MDCInterceptor implements HandlerInterceptor {
	
	protected static final String USERID_KEY_NAME = "userId";
	
	@Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		String logUserId = "";
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null && (auth.getPrincipal() instanceof @SuppressWarnings("unused") UserDetails ud)) {
			logUserId = ( (UserDetails) auth.getPrincipal() ).getUsername();
		}
		org.slf4j.MDC.put(USERID_KEY_NAME, logUserId);
		return true;
	}
	
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
    	org.slf4j.MDC.remove(USERID_KEY_NAME);
    }	
    
}
````

### `backend/base/src/main/java/org/qifu/base/mapper/IBaseMapper.java`

- Purpose: MyBatis mapper or DAO; declares interface IBaseMapper
- Package: `org.qifu.base.mapper`
- Role: MyBatis mapper or DAO
- Main types: `interface IBaseMapper <T, K>`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\mapper\IBaseMapper.java`
- Size: 1341 bytes

#### Source

````java
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
package org.qifu.base.mapper;

import java.util.List;
import java.util.Map;

/**
 * 
 *
 * @param <T>	MyBatis Entity
 * @param <K>	PK屬性
 */
public interface IBaseMapper<T, K> {
	
	public T selectByPrimaryKey(K oid);
	
	public List<T> selectListByParams(Map<String, Object> paramMap);
	
	public int insert(T mapperObj);	
	
	public int update(T mapperObj);
	
	public Boolean delete(T mapperObj);
	
	public Long count(Map<String, Object> paramMap);	
	
	public List<Object> findPage(Map<String, Object> paramMap);
	
}
````

### `backend/base/src/main/java/org/qifu/base/message/BaseSystemMessage.java`

- Purpose: Java class; declares class BaseSystemMessage; has 22 detected methods; depends on 2 org.qifu local types
- Package: `org.qifu.base.message`
- Role: Java class
- Main types: `class BaseSystemMessage implements java.io.Serializable`
- Local dependencies: `org.qifu.base.SysMsgConstants`, `org.qifu.util.LoadResources`
- Third-party dependencies: `org.apache.commons.lang3.StringUtils`
- Main methods:
  - L50 `private String getMessage(String code)`
  - L58 `public String noPermission()`
  - L62 `public String noLoginAccessDenied()`
  - L66 `public String parameterBlank()`
  - L70 `public String parameterIncorrect()`
  - L74 `public String objectNull()`
  - L78 `public String controllerTryAgain()`
  - L82 `public String dataNoExist()`
  - L86 `public String dataIsExist()`
  - L90 `public String updateSuccess()`
  - L94 `public String updateFail()`
  - L98 `public String insertSuccess()`
  - L102 `public String insertFail()`
  - L106 `public String deleteSuccess()`
  - L110 `public String deleteFail()`
  - L114 `public String searchNoData()`
  - L118 `public String dataCannotDelete()`
  - L122 `public String loginFail()`
  - L126 `public String updateFileTypeError()`
  - L130 `public String uploadFileNoSelect()`
  - L134 `public String uploadFileOnlyImage()`
  - L138 `public String dataErrors()`
- Main fields:
  - L32 `long serialVersionUID`
  - L34 `String CONFIG`
  - L36 `Map<String, Object> messageMap`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\message\BaseSystemMessage.java`
- Size: 3911 bytes

#### Source

````java
/* 
 * Copyright 2012-2017 qifu of copyright Chen Xin Nien
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
package org.qifu.base.message;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.qifu.base.SysMsgConstants;
import org.qifu.util.LoadResources;

public class BaseSystemMessage implements java.io.Serializable {
	private static final long serialVersionUID = -4317284943704877962L;

	private static final String CONFIG = "org/qifu/base/message/BaseSystemMessage.json";
	
	private static Map<String, Object> messageMap = null;
	
	static {
		try {
			messageMap = LoadResources.objectMapperReadValue(CONFIG, HashMap.class, BaseSystemMessage.class);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null==messageMap) {
				messageMap = new HashMap<>();
			}
		}
	}
	
	private static String getMessage(String code) {
		String msg = (String) messageMap.get(code);
		if (StringUtils.isBlank(msg)) {
			return code;
		}
		return msg;
	}
	
	public static String noPermission() {
		return getMessage(SysMsgConstants.NO_PERMISSION);
	}
	
	public static String noLoginAccessDenied() {
		return getMessage(SysMsgConstants.NO_LOGIN_ACCESS_DENIED);
	}
	
	public static String parameterBlank() {
		return getMessage(SysMsgConstants.PARAMS_BLANK);
	}
	
	public static String parameterIncorrect() {
		return getMessage(SysMsgConstants.PARAMS_INCORRECT);
	}
	
	public static String objectNull() {
		return getMessage(SysMsgConstants.OBJ_NULL);
	}
	
	public static String controllerTryAgain() {
		return getMessage(SysMsgConstants.CONTROLLER_TRY_AGAIN);
	}
	
	public static String dataNoExist() {
		return getMessage(SysMsgConstants.DATA_NO_EXIST);
	}
	
	public static String dataIsExist() {
		return getMessage(SysMsgConstants.DATA_IS_EXIST);
	}
	
	public static String updateSuccess() {
		return getMessage(SysMsgConstants.UPDATE_SUCCESS);
	}
	
	public static String updateFail() {
		return getMessage(SysMsgConstants.UPDATE_FAIL);
	}
	
	public static String insertSuccess() {
		return getMessage(SysMsgConstants.INSERT_SUCCESS);
	}
	
	public static String insertFail() {
		return getMessage(SysMsgConstants.INSERT_FAIL);
	}
	
	public static String deleteSuccess() {
		return getMessage(SysMsgConstants.DELETE_SUCCESS);
	}
	
	public static String deleteFail() {
		return getMessage(SysMsgConstants.DELETE_FAIL);
	}
	
	public static String searchNoData() {
		return getMessage(SysMsgConstants.SEARCH_NO_DATA);
	}
	
	public static String dataCannotDelete() {
		return getMessage(SysMsgConstants.DATA_CANNOT_DELETE);
	}
	
	public static String loginFail() {
		return getMessage(SysMsgConstants.LOGIN_FAIL);
	}
	
	public static String updateFileTypeError() {
		return getMessage(SysMsgConstants.UPLOAD_FILE_TYPE_ERROR);
	}
	
	public static String uploadFileNoSelect() {
		return getMessage(SysMsgConstants.UPLOAD_FILE_NO_SELECT);
	}
	
	public static String uploadFileOnlyImage() {
		return getMessage(SysMsgConstants.UPLOAD_FILE_ONLY_IMAGE);
	}
	
	public static String dataErrors() {
		return getMessage(SysMsgConstants.DATA_ERRORS);
	}
	
}
````

### `backend/base/src/main/java/org/qifu/base/model/BaseTemplateEntity.java`

- Purpose: DTO/VO/model; declares interface BaseTemplateEntity
- Package: `org.qifu.base.model`
- Role: DTO/VO/model
- Main types: `interface BaseTemplateEntity extends java.io.Serializable`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\model\BaseTemplateEntity.java`
- Size: 1155 bytes

#### Source

````java
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
package org.qifu.base.model;

public interface BaseTemplateEntity extends java.io.Serializable {
	
	public String getTemplateId();
	
	public String getSubject();
	
	public String getContentText();
	
	public void setTemplateId(String templateId);
	
	public void setSubject(String subject);
	
	public void setContentText(String contentText);

}
````

### `backend/base/src/main/java/org/qifu/base/model/BaseUserInfo.java`

- Purpose: DTO/VO/model; declares class BaseUserInfo; has 6 detected methods
- Package: `org.qifu.base.model`
- Role: DTO/VO/model
- Main types: `class BaseUserInfo implements IUserInfoProvide`
- Key annotations: `Override`
- Main methods:
  - L34 `public String getUserId()`
  - L39 `public void setUserId(String userId)`
  - L43 `public String getAccessToken()`
  - L47 `public void setAccessToken(String accessToken)`
  - L51 `public String getRefreshToken()`
  - L55 `public void setRefreshToken(String refreshToken)`
- Main fields:
  - L25 `long serialVersionUID`
  - L27 `String userId`
  - L29 `String accessToken`
  - L31 `String refreshToken`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\model\BaseUserInfo.java`
- Size: 1545 bytes

#### Source

````java
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
package org.qifu.base.model;

public class BaseUserInfo implements IUserInfoProvide {	
	private static final long serialVersionUID = -2353426031473585007L;
	
	private String userId = "";
	
	private String accessToken = "";
	
	private String refreshToken = "";
	
	@Override
	public String getUserId() {
		return this.userId;
	}

	@Override
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}
	
}
````

### `backend/base/src/main/java/org/qifu/base/model/BaseValueObj.java`

- Purpose: DTO/VO/model; declares class BaseValueObj; has 2 detected methods; depends on 1 org.qifu local types
- Package: `org.qifu.base.model`
- Role: DTO/VO/model
- Main types: `class BaseValueObj`
- Local dependencies: `org.qifu.util.SimpleUtils`
- Main methods:
  - L31 `protected String getDateDisplayValue(Date date, String split)`
  - L38 `protected String getDateDisplayValue(String yyyymmdd, String split)`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\model\BaseValueObj.java`
- Size: 1308 bytes

#### Source

````java
/* 
 * Copyright 2012-2017 qifu of copyright Chen Xin Nien
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
package org.qifu.base.model;

import java.util.Date;

import org.qifu.util.SimpleUtils;

public abstract class BaseValueObj {
	public abstract String getOid();	
	
	protected String getDateDisplayValue(Date date, String split) {
		if (null == date) {
			return "";
		}
		return SimpleUtils.getStrYMD(date, split);
	}
	
	protected String getDateDisplayValue(String yyyymmdd, String split) {
		if (null == yyyymmdd) {
			return "";
		}
		return SimpleUtils.getStrYMD(yyyymmdd, split);
	}
	
}
````

### `backend/base/src/main/java/org/qifu/base/model/CheckControllerFieldHandler.java`

- Purpose: DTO/VO/model; declares class CheckControllerFieldHandler; has 11 detected methods; depends on 2 org.qifu local types
- Package: `org.qifu.base.model`
- Role: DTO/VO/model
- Main types: `class CheckControllerFieldHandler <T>`
- Local dependencies: `org.qifu.base.Constants`, `org.qifu.base.exception.ControllerException`
- Third-party dependencies: `ognl.Ognl`, `ognl.OgnlException`
- Main methods:
  - L36 `public <T> CheckControllerFieldHandler<T> build(DefaultControllerJsonResultObj<T> result)`
  - L42 `public DefaultControllerJsonResultObj<T> getResult()`
  - L46 `public void setResult(DefaultControllerJsonResultObj<T> result)`
  - L50 `public String getCheckFieldsMessage()`
  - L58 `public String getHtmlCheckFieldsMessage()`
  - L66 `public CheckControllerFieldHandler<T> testField(String id, boolean checkStatus, String message)`
  - L76 `public CheckControllerFieldHandler<T> testField(String id, Object paramObj, String expression, String message)`
  - L91 `public void throwMessage()`
  - L97 `public void throwMessage(String id, String message)`
  - L102 `public void throwHtmlMessage()`
  - L108 `public void throwHtmlMessage(String id, String message)`
- Main fields:
  - L33 `DefaultControllerJsonResultObj<T> result`
  - L34 `StringBuilder msg`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\model\CheckControllerFieldHandler.java`
- Size: 3477 bytes

#### Source

````java
/* 
 * Copyright 2012-2017 qifu of copyright Chen Xin Nien
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
package org.qifu.base.model;

import java.util.Map;

import org.qifu.base.Constants;
import org.qifu.base.exception.ControllerException;

import ognl.Ognl;
import ognl.OgnlException;

public class CheckControllerFieldHandler<T> {
	private DefaultControllerJsonResultObj<T> result = null;
	private StringBuilder msg = new StringBuilder();
	
	public static <T> CheckControllerFieldHandler<T> build(DefaultControllerJsonResultObj<T> result) {
		CheckControllerFieldHandler<T> handler = new CheckControllerFieldHandler<>();
		handler.setResult(result);
		return handler;
	}
	
	public DefaultControllerJsonResultObj<T> getResult() {
		return result;
	}

	public void setResult(DefaultControllerJsonResultObj<T> result) {
		this.result = result;
	}
	
	public String getCheckFieldsMessage() {
		msg.setLength(0);
		for (Map.Entry<String, String> entry : this.result.getCheckFields().entrySet()) {
			msg.append( entry.getValue() ).append("\n");
		}
		return msg.toString();
	}
	
	public String getHtmlCheckFieldsMessage() {
		msg.setLength(0);
		for (Map.Entry<String, String> entry : this.result.getCheckFields().entrySet()) {
			msg.append( entry.getValue() ).append(Constants.HTML_BR);
		}
		return msg.toString();
	}	
	
	public CheckControllerFieldHandler<T> testField(String id, boolean checkStatus, String message) {
		if (this.result.getCheckFields().get(id) != null) {
			return this;
		}
		if (checkStatus) {
			this.result.getCheckFields().put(id, message);
		}
		return this;
	}
	
	public CheckControllerFieldHandler<T> testField(String id, Object paramObj, String expression, String message) {
		if (this.result.getCheckFields().get(id) != null) {
			return this;
		}
		try {
			Object val = Ognl.getValue(expression, paramObj);
			if ( Boolean.TRUE.equals(val) ) { 
				this.result.getCheckFields().put(id, message); 
			}
		} catch (OgnlException e) {
			e.printStackTrace();
		}
		return this;
	}	
	
	public void throwMessage() throws ControllerException {
		if (this.getCheckFieldsMessage().length() > 0) {
			throw new ControllerException(this.msg.toString());
		}
	}
	
	public void throwMessage(String id, String message) throws ControllerException {
		this.result.getCheckFields().put(id, message);
		this.throwMessage();
	}
	
	public void throwHtmlMessage() throws ControllerException {
		if (this.getHtmlCheckFieldsMessage().length() > 0) {
			throw new ControllerException(this.msg.toString());
		}
	}	
	
	public void throwHtmlMessage(String id, String message) throws ControllerException {
		this.result.getCheckFields().put(id, message);
		this.throwHtmlMessage();
	}	
	
}
````

### `backend/base/src/main/java/org/qifu/base/model/ControllerMethodAuthority.java`

- Purpose: DTO/VO/model
- Package: `org.qifu.base.model`
- Role: DTO/VO/model
- Key annotations: `Target`, `Retention`, `Inherited`, `Documented`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\model\ControllerMethodAuthority.java`
- Size: 1315 bytes

#### Source

````java
/* 
 * Copyright 2012-2017 qifu of copyright Chen Xin Nien
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
package org.qifu.base.model;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface ControllerMethodAuthority {
	public String programId() default "";
	public boolean check() default true;
}
````

### `backend/base/src/main/java/org/qifu/base/model/CreateDateField.java`

- Purpose: DTO/VO/model
- Package: `org.qifu.base.model`
- Role: DTO/VO/model
- Key annotations: `Retention`, `Target`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\model\CreateDateField.java`
- Size: 1124 bytes

#### Source

````java
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
package org.qifu.base.model;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface CreateDateField {
	public String name();
}
````

### `backend/base/src/main/java/org/qifu/base/model/CreateField.java`

- Purpose: DTO/VO/model; declares class CreateField; has 4 detected methods
- Package: `org.qifu.base.model`
- Role: DTO/VO/model
- Main types: `class CreateField`
- Main methods:
  - L33 `public CreateUserField getCreateUserField()`
  - L37 `public void setCreateUserField(CreateUserField createUserField)`
  - L41 `public CreateDateField getCreateDateField()`
  - L45 `public void setCreateDateField(CreateDateField createDateField)`
- Main fields:
  - L29 `CreateUserField createUserField`
  - L31 `CreateDateField createDateField`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\model\CreateField.java`
- Size: 1422 bytes

#### Source

````java
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
package org.qifu.base.model;

/**
 * return value for EntityParameterGenerateUtil
 */
public class CreateField {
	
	private CreateUserField createUserField = null;
	
	private CreateDateField createDateField = null;

	public CreateUserField getCreateUserField() {
		return createUserField;
	}

	public void setCreateUserField(CreateUserField createUserField) {
		this.createUserField = createUserField;
	}

	public CreateDateField getCreateDateField() {
		return createDateField;
	}

	public void setCreateDateField(CreateDateField createDateField) {
		this.createDateField = createDateField;
	}
	
}
````

### `backend/base/src/main/java/org/qifu/base/model/CreateUserField.java`

- Purpose: DTO/VO/model
- Package: `org.qifu.base.model`
- Role: DTO/VO/model
- Key annotations: `Retention`, `Target`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\model\CreateUserField.java`
- Size: 1124 bytes

#### Source

````java
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
package org.qifu.base.model;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface CreateUserField {
	public String name();
}
````

### `backend/base/src/main/java/org/qifu/base/model/DefaultControllerJsonResultObj.java`

- Purpose: DTO/VO/model; declares class DefaultControllerJsonResultObj; has 13 detected methods
- Package: `org.qifu.base.model`
- Role: DTO/VO/model
- Main types: `class DefaultControllerJsonResultObj <T> implements java.io.Serializable`
- Main methods:
  - L37 `public <T> DefaultControllerJsonResultObj<T> build()`
  - L41 `public T getValue()`
  - L45 `public void setValue(T value)`
  - L49 `public String getSuccess()`
  - L53 `public void setSuccess(String success)`
  - L57 `public String getMessage()`
  - L61 `public void setMessage(String message)`
  - L65 `public String getLogin()`
  - L69 `public void setLogin(String login)`
  - L73 `public String getIsAuth()`
  - L77 `public void setIsAuth(String isAuth)`
  - L81 `public Map<String, String> getCheckFields()`
  - L85 `public void setCheckFields(Map<String, String> checkFields)`
- Main fields:
  - L28 `long serialVersionUID`
  - L30 `transient T value`
  - L31 `String success`
  - L32 `String message`
  - L33 `String login`
  - L34 `String isAuth`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\model\DefaultControllerJsonResultObj.java`
- Size: 2283 bytes

#### Source

````java
/* 
 * Copyright 2012-2017 qifu of copyright Chen Xin Nien
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
package org.qifu.base.model;

import java.util.LinkedHashMap;
import java.util.Map;

public class DefaultControllerJsonResultObj<T> implements java.io.Serializable {
	private static final long serialVersionUID = 3754125684960027639L;
	
	private transient T value = null;
	private String success = YesNoKeyProvide.NO;
	private String message = "";
	private String login = YesNoKeyProvide.NO;
	private String isAuth = YesNoKeyProvide.NO;
	private Map<String, String> checkFields = new LinkedHashMap<>(); // 不符合條件的輸入欄位
	
	public static <T> DefaultControllerJsonResultObj<T> build() {
		return new DefaultControllerJsonResultObj<>();
	}
	
	public T getValue() {
		return value;
	}
	
	public void setValue(T value) {
		this.value = value;
	}
	
	public String getSuccess() {
		return success;
	}
	
	public void setSuccess(String success) {
		this.success = success;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getIsAuth() {
		return isAuth;
	}

	public void setIsAuth(String isAuth) {
		this.isAuth = isAuth;
	}

	public Map<String, String> getCheckFields() {
		return checkFields;
	}

	public void setCheckFields(Map<String, String> checkFields) {
		this.checkFields = checkFields;
	}
	
}
````

### `backend/base/src/main/java/org/qifu/base/model/DefaultResult.java`

- Purpose: DTO/VO/model; declares class DefaultResult; has 9 detected methods; depends on 1 org.qifu local types
- Package: `org.qifu.base.model`
- Role: DTO/VO/model
- Main types: `class DefaultResult <T> implements java.io.Serializable`
- Local dependencies: `org.qifu.base.exception.ServiceException`
- Third-party dependencies: `org.apache.commons.collections.CollectionUtils`, `org.apache.commons.collections.MapUtils`
- Main methods:
  - L42 `public String getIsAuth()`
  - L46 `public void setIsAuth(String isAuth)`
  - L50 `public String getSuccess()`
  - L54 `public void setSuccess(String success)`
  - L58 `public String getMessage()`
  - L62 `public void setMessage(String message)`
  - L66 `public T getValue()`
  - L70 `public void setValue(T value)`
  - L74 `public T getValueEmptyThrowMessage()`
- Main fields:
  - L32 `long serialVersionUID`
  - L34 `String isAuth`
  - L36 `String success`
  - L38 `String message`
  - L40 `transient T value`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\model\DefaultResult.java`
- Size: 2301 bytes

#### Source

````java
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
package org.qifu.base.model;

import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MapUtils;
import org.qifu.base.exception.ServiceException;

public class DefaultResult<T> implements java.io.Serializable {
	private static final long serialVersionUID = 738672416927503320L;
	
	private String isAuth = YesNoKeyProvide.NO;
	
	private String success = YesNoKeyProvide.NO;
	
	private String message = "";
	
	private transient T value = null;

	public String getIsAuth() {
		return isAuth;
	}

	public void setIsAuth(String isAuth) {
		this.isAuth = isAuth;
	}

	public String getSuccess() {
		return success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	public T getValueEmptyThrowMessage() throws ServiceException {
		if (null == this.value) {
			throw new ServiceException(this.message);
		}
		if (this.value instanceof List &&  ( CollectionUtils.isEmpty( ((List<?>)this.value) ) )) {
			throw new ServiceException(this.message);
		}
		if (this.value instanceof Map &&  ( MapUtils.isEmpty( ((Map<?,?>)this.value) ) )) {
			throw new ServiceException(this.message);
		}
		return this.value;
	}
	
}
````

### `backend/base/src/main/java/org/qifu/base/model/EntityPK.java`

- Purpose: DTO/VO/model
- Package: `org.qifu.base.model`
- Role: DTO/VO/model
- Key annotations: `Retention`, `Target`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\model\EntityPK.java`
- Size: 1296 bytes

#### Source

````java
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
package org.qifu.base.model;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 再 PO pk的getter加入 位至於@Id 的下方, 加入 @EntityPK 如 @EntityPK(name="oid")
 * BaseService 與 BaseDao 需要使用到
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface EntityPK {
	public String name();
	public boolean autoUUID();
}
````

### `backend/base/src/main/java/org/qifu/base/model/EntityUK.java`

- Purpose: DTO/VO/model
- Package: `org.qifu.base.model`
- Role: DTO/VO/model
- Key annotations: `Retention`, `Target`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\model\EntityUK.java`
- Size: 1251 bytes

#### Source

````java
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
package org.qifu.base.model;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 再 PO uk欄位getter method 加入 @EntityUK 如 @EntityUK(name="account")
 * BaseService 與 BaseDao 需要使用到
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface EntityUK {
	public String name();
}
````

### `backend/base/src/main/java/org/qifu/base/model/IUserInfoProvide.java`

- Purpose: DTO/VO/model; declares interface IUserInfoProvide
- Package: `org.qifu.base.model`
- Role: DTO/VO/model
- Main types: `interface IUserInfoProvide extends java.io.Serializable`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\model\IUserInfoProvide.java`
- Size: 1019 bytes

#### Source

````java
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
package org.qifu.base.model;

/**
 * 給User ThreadLocal 使用
 *
 */
public interface IUserInfoProvide extends java.io.Serializable {
	
	public String getUserId();
	
	public void setUserId(String userId);
	
}
````

### `backend/base/src/main/java/org/qifu/base/model/PageOf.java`

- Purpose: DTO/VO/model; declares class PageOf; has 22 detected methods; depends on 1 org.qifu local types
- Package: `org.qifu.base.model`
- Role: DTO/VO/model
- Main types: `class PageOf implements java.io.Serializable`
- Key annotations: `Parameter`
- Local dependencies: `org.qifu.base.Constants`
- Third-party dependencies: `org.apache.commons.lang3.StringUtils`, `org.apache.commons.lang3.math.NumberUtils`, `io.swagger.v3.oas.annotations.Parameter`
- Main methods:
  - L58 `public String getCountSize()`
  - L62 `public void setCountSize(String countSize)`
  - L66 `public String getShowRow()`
  - L77 `public void setShowRow(String showRow)`
  - L81 `public String getSize()`
  - L85 `public void setSize(String size)`
  - L89 `public String getSelect()`
  - L96 `public void setSelect(String select)`
  - L100 `public String getOrderBy()`
  - L114 `public void setOrderBy(String orderBy)`
  - L118 `public String getSortType()`
  - L128 `public void setSortType(String sortType)`
  - L132 `public int getIntegerValue(final String str)`
  - L138 `public long getLongValue(final String str)`
  - L145 `public void toCalculateSize()`
  - L167 `public void toCalculateSize(int currentStartRow)`
  - L194 `public Map<String, Object> setQueryOrderSortParameter(Map<String, Object> queryParam)`
  - L208 `public PageOf orderBy(String orderBy)`
  - L213 `public PageOf sortBy(String sortBy)`
  - L219 `public PageOf sortTypeAsc()`
  - L225 `public PageOf sortTypeDesc()`
  - L232 `public PageOf andFieldWrap()`
- Main fields:
  - L33 `long serialVersionUID`
  - L38 `int DEFAULT_ROW`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\model\PageOf.java`
- Size: 7483 bytes

#### Source

````java
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
package org.qifu.base.model;

import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.qifu.base.Constants;

import io.swagger.v3.oas.annotations.Parameter;

public class PageOf implements java.io.Serializable {
	private static final long serialVersionUID = -3060749245195776228L;
	
	@Parameter(hidden = true)
	protected static final int[] Rows={10, 30, 50, 100}; // 要配合 ui.grid.htm.flt
	
	public static final int DEFAULT_ROW = Rows[0];
	
	private String countSize="0"; // count record 頁面grid資料count的筆數
	private String showRow=DEFAULT_ROW+""; // a page show size 頁面要顯示grid row比數
	private String size="1"; // page size 總共有幾頁
	private String select="1"; // select page of 目前所在的頁面 , 下拉選到的頁數
	private String orderBy = ""; // 欄位
	private String sortType = ""; // ASC , DESC
	
	public PageOf() {
		
	}
	
	public PageOf(String select, String size, String showRow, String countSize) {
		this.select=select;
		this.size=size;
		this.showRow=showRow;
		this.countSize=countSize;
	}

	public String getCountSize() {
		return countSize;
	}

	public void setCountSize(String countSize) {
		this.countSize = countSize;
	}

	public String getShowRow() {
		boolean c = false;
		int r = NumberUtils.toInt(this.showRow, 0);
		for (int i=0; !c && i<Rows.length; i++) { // 在 bambooCORE 中只允許這幾個Row數
			if (r == Rows[i]) {
				c = true;
			}
		}
		return ( c ? showRow : String.valueOf(DEFAULT_ROW) );
	}

	public void setShowRow(String showRow) {
		this.showRow = showRow;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getSelect() {
		if (NumberUtils.toInt(this.select, 0) < 1 || NumberUtils.toInt(this.select, 0) > 1000000) { // 在 bambooCORE 中不允許
			return "1";
		}
		return select;
	}

	public void setSelect(String select) {
		this.select = select;
	}
	
	public String getOrderBy() {
		if (null == orderBy) {
			orderBy = "";
		}
		orderBy = StringUtils.replace(orderBy, " ", "");
		orderBy = StringUtils.replace(orderBy, "\r", "");
		orderBy = StringUtils.replace(orderBy, "\t", "");
		orderBy = StringUtils.replace(orderBy, "\n", "");
		orderBy = StringUtils.replace(orderBy, ";", "");
		orderBy = StringUtils.replace(orderBy, "'", "");
		orderBy = StringUtils.replace(orderBy, "-", "");
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	
	public String getSortType() {
		if (!StringUtils.isBlank(sortType)) {
			sortType = sortType.toUpperCase().trim();
			if (!SortType.isAllow(sortType)) {
				sortType = SortType.ASC;
			}
		}
		return sortType;
	}

	public void setSortType(String sortType) {
		this.sortType = sortType;
	}

	public int getIntegerValue(final String str) {
		if (str==null )
			return 0;		
		return org.apache.commons.lang3.math.NumberUtils.toInt(str, 0);
	}
	
	public long getLongValue(final String str) {
		if (str==null )
			return 0;		
		return org.apache.commons.lang3.math.NumberUtils.toLong(str, 0L);
	}	
	
	@Parameter(hidden = true)
	public void toCalculateSize() {		
		int mySize=1;
		int myShowRow=this.getIntegerValue(this.getShowRow() );
		int myCountSize=this.getIntegerValue(this.getCountSize() );
		if (myCountSize>0 && myShowRow>0 ) {
			mySize=myCountSize/myShowRow;
			if (myCountSize%myShowRow>0 ) {
				mySize+=1;
			}
		}
		this.setSize(mySize+"");	
		if ( NumberUtils.toInt(this.select, 0) > mySize ) { // 2017-06-30 bug fix add
			this.select = mySize + "";
		}		
	}
	
	/**
	 * 2019-09-10
	 * 
	 * @param currentStartRow
	 */
	@Parameter(hidden = true)
	public void toCalculateSize(int currentStartRow) {
		int mySize=1;
		int myShowRow=this.getIntegerValue(this.getShowRow() );
		int myCountSize=this.getIntegerValue(this.getCountSize() );
		if (myCountSize>0 && myShowRow>0 ) {
			mySize=myCountSize/myShowRow;
			if (myCountSize%myShowRow>0 ) {
				mySize+=1;
			}
		}
		this.setSize(mySize+"");	
		if ( NumberUtils.toInt(this.select, 0) > mySize ) { // 2017-06-30 bug fix add
			if (currentStartRow == 0) {
				this.select = "1";
			} else {
				this.select = mySize + "";
			}
		}
	}
	
	/**
	 * 把要代入查grid的 hql 的 map 參數加上 order by 條件
	 * orderBy		如 kpi.id, kpi.name
	 * sortType		如 ASC 或 DESC
	 * @param queryParam
	 */
	@Parameter(hidden = true)
	public Map<String, Object> setQueryOrderSortParameter(Map<String, Object> queryParam) {
		if (queryParam == null) {
			return queryParam;
		}
		if (queryParam.get(Constants.RESERVED_PARAM_NAME_QUERY_ORDER_BY) == null &&  (!StringUtils.isBlank(this.getOrderBy()))) {
			queryParam.put(Constants.RESERVED_PARAM_NAME_QUERY_ORDER_BY, this.getOrderBy());
		}
		if (queryParam.get(Constants.RESERVED_PARAM_NAME_QUERY_SORT_TYPE) == null &&  (!StringUtils.isBlank(this.getSortType()))) {
			queryParam.put(Constants.RESERVED_PARAM_NAME_QUERY_SORT_TYPE, this.getSortType());	
		}
		return queryParam;
	}
	
	@Parameter(hidden = true)
	public PageOf orderBy(String orderBy) {
		this.setOrderBy(orderBy);
		return this;
	}
	
	public PageOf sortBy(String sortBy) {
		this.setSortType(sortBy);
		return this;
	}
	
	@Parameter(hidden = true)
	public PageOf sortTypeAsc() {
		this.sortBy( SortType.ASC );
		return this;
	}
	
	@Parameter(hidden = true)
	public PageOf sortTypeDesc() {
		this.sortBy( SortType.DESC );
		return this;
	}	
	
	// for postgresql, ex: SELECT * FROM "tb_prog" ORDER BY "PROG_ID", "NAME" ASC
	@Parameter(hidden = true)
	public PageOf andFieldWrap() {
		if (StringUtils.isBlank(this.orderBy)) {
			return this;
		}
		this.orderBy = StringUtils.deleteWhitespace(this.orderBy);
		this.orderBy = StringUtils.replace(this.orderBy, ",,", ",");
		if (this.orderBy.endsWith(",")) {
			this.orderBy = this.orderBy.substring(0, this.orderBy.length()-1);
		}
		if (this.orderBy.indexOf(",") == -1) {
			if (!(this.orderBy.startsWith("\"") && this.orderBy.endsWith("\""))) {
				this.orderBy = "\"" + this.orderBy + "\"";
			}
			return this;
		}
		String[] tmp = this.orderBy.split(",");
		StringBuilder newOrderBy = new StringBuilder();
		for (int i = 0; i < tmp.length; i++) {
			if (!(tmp[i].startsWith("\"") && tmp[i].endsWith("\""))) {
				tmp[i] = "\"" + tmp[i] + "\"";
			}
			newOrderBy.append(tmp[i]);
			if ((i+1) < tmp.length) {
				newOrderBy.append(",");
			}
		}
		this.orderBy = newOrderBy.toString();
		return this;
	}
	
}
````

### `backend/base/src/main/java/org/qifu/base/model/PleaseSelect.java`

- Purpose: DTO/VO/model; declares class PleaseSelect; has 6 detected methods; depends on 1 org.qifu local types
- Package: `org.qifu.base.model`
- Role: DTO/VO/model
- Main types: `class PleaseSelect`
- Key annotations: `SuppressWarnings`
- Local dependencies: `org.qifu.base.Constants`
- Third-party dependencies: `org.apache.commons.io.IOUtils`, `org.apache.commons.lang3.StringUtils`
- Main methods:
  - L55 `public boolean isAllOption(String value)`
  - L59 `public boolean noSelect(String value)`
  - L64 `public Map<String, Object> loadDatas()`
  - L74 `public Map<String, Object> getDataMap()`
  - L78 `public String getLabel(String localeLang)`
  - L83 `public Map<String, String> pageSelectMap(boolean pleaseSelect)`
- Main fields:
  - L35 `String pleaseSelectDatas`
  - L36 `Map<String, Object> pleaseSelectMap`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\model\PleaseSelect.java`
- Size: 2954 bytes

#### Source

````java
/* 
 * Copyright 2012-2017 qifu of copyright Chen Xin Nien
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
package org.qifu.base.model;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.qifu.base.Constants;

public class PleaseSelect {
	private static String pleaseSelectDatas = " { } ";
	private static Map<String, Object> pleaseSelectMap;
	
	protected PleaseSelect() {
		throw new IllegalStateException("Utility class: PleaseSelect");
	}
	
	static {
		try (InputStream is = Constants.class.getClassLoader().getResource( "please-select-label-name.json" ).openStream()) {
			pleaseSelectDatas = IOUtils.toString(is, Constants.BASE_ENCODING);
			pleaseSelectMap = loadDatas();	
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (null==pleaseSelectMap) {
				pleaseSelectMap = new HashMap<>();
			}	
		}
	}
	
	public static boolean isAllOption(String value) {
		return Constants.HTML_SELECT_NO_SELECT_ID.equals(value) ? Boolean.TRUE : Boolean.FALSE;
	}
	
	public static boolean noSelect(String value) {
		return (StringUtils.isBlank(value) || Constants.HTML_SELECT_NO_SELECT_ID.equals(value)) ? Boolean.TRUE : Boolean.FALSE;
	}	
	
	@SuppressWarnings("unchecked")
	public static Map<String, Object> loadDatas() {
		Map<String, Object> datas = null;
		try {
			datas = org.qifu.util.LoadResources.getObjectMapper().readValue( pleaseSelectDatas, LinkedHashMap.class );
		} catch (Exception e) {
			e.printStackTrace();
		}
		return datas;
	}
	
	public static Map<String, Object> getDataMap() {
		return pleaseSelectMap;
	}		

	public static String getLabel(String localeLang) {
		String label = (String) pleaseSelectMap.get(localeLang);
		return (StringUtils.isBlank(label)) ? Constants.HTML_SELECT_NO_SELECT_NAME : label;
	}
	
	public static Map<String, String> pageSelectMap(boolean pleaseSelect) {
		Map<String, String> dataMap = new LinkedHashMap<>();
		if (pleaseSelect) {
			dataMap.put(Constants.HTML_SELECT_NO_SELECT_ID, Constants.HTML_SELECT_NO_SELECT_NAME);
		}
		return dataMap;
	}
	
}
````

### `backend/base/src/main/java/org/qifu/base/model/QueryControllerJsonResultObj.java`

- Purpose: DTO/VO/model; declares class QueryControllerJsonResultObj; has 9 detected methods
- Package: `org.qifu.base.model`
- Role: DTO/VO/model
- Main types: `class QueryControllerJsonResultObj <T> extends DefaultControllerJsonResultObj<T>`
- Main methods:
  - L32 `public <T> QueryControllerJsonResultObj<T> build()`
  - L36 `public int getPageOfShowRow()`
  - L40 `public void setPageOfShowRow(int pageOfShowRow)`
  - L44 `public int getPageOfSelect()`
  - L48 `public void setPageOfSelect(int pageOfSelect)`
  - L52 `public long getPageOfCountSize()`
  - L56 `public void setPageOfCountSize(long pageOfCountSize)`
  - L60 `public int getPageOfSize()`
  - L64 `public void setPageOfSize(int pageOfSize)`
- Main fields:
  - L25 `long serialVersionUID`
  - L27 `int pageOfShowRow`
  - L28 `int pageOfSelect`
  - L29 `long pageOfCountSize`
  - L30 `int pageOfSize`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\model\QueryControllerJsonResultObj.java`
- Size: 1894 bytes

#### Source

````java
/* 
 * Copyright 2012-2017 qifu of copyright Chen Xin Nien
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
package org.qifu.base.model;

public class QueryControllerJsonResultObj<T> extends DefaultControllerJsonResultObj<T> {
	private static final long serialVersionUID = 3754125684960027639L;
	
	private int pageOfShowRow = PageOf.Rows[0];
	private int pageOfSelect = 1;
	private long pageOfCountSize = 0;
	private int pageOfSize = 1;
	
	public static <T> QueryControllerJsonResultObj<T> build() {
		return new QueryControllerJsonResultObj<>();
	}

	public int getPageOfShowRow() {
		return pageOfShowRow;
	}

	public void setPageOfShowRow(int pageOfShowRow) {
		this.pageOfShowRow = pageOfShowRow;
	}

	public int getPageOfSelect() {
		return pageOfSelect;
	}

	public void setPageOfSelect(int pageOfSelect) {
		this.pageOfSelect = pageOfSelect;
	}

	public long getPageOfCountSize() {
		return pageOfCountSize;
	}

	public void setPageOfCountSize(long pageOfCountSize) {
		this.pageOfCountSize = pageOfCountSize;
	}

	public int getPageOfSize() {
		return pageOfSize;
	}

	public void setPageOfSize(int pageOfSize) {
		this.pageOfSize = pageOfSize;
	}
	
}
````

### `backend/base/src/main/java/org/qifu/base/model/QueryParamBuilder.java`

- Purpose: DTO/VO/model; declares class QueryParamBuilder; has 26 detected methods; depends on 1 org.qifu local types
- Package: `org.qifu.base.model`
- Role: DTO/VO/model
- Main types: `class QueryParamBuilder`
- Local dependencies: `org.qifu.base.Constants`
- Third-party dependencies: `org.apache.commons.lang3.StringUtils`, `org.apache.commons.lang3.math.NumberUtils`, `ognl.Ognl`, `ognl.OgnlException`
- Main methods:
  - L44 `public QueryParamBuilder build(SearchBody searchBody)`
  - L50 `public QueryParamBuilder build()`
  - L54 `private Object doExpression(String expression)`
  - L64 `public QueryParamBuilder selectOption(String paramName)`
  - L75 `public QueryParamBuilder fullEquals(String paramName, String value)`
  - L82 `public QueryParamBuilder fullLink(String paramName, String value)`
  - L89 `public QueryParamBuilder beginningLike(String paramName, String value)`
  - L96 `public QueryParamBuilder endingLike(String paramName, String value)`
  - L103 `public QueryParamBuilder isNumber(String paramName, String value)`
  - L110 `public QueryParamBuilder fullEqualsNotNull(String paramName, Object value)`
  - L117 `public QueryParamBuilder fullEquals(String paramName)`
  - L128 `public QueryParamBuilder fullLink(String paramName)`
  - L139 `public QueryParamBuilder beginningLike(String paramName)`
  - L150 `public QueryParamBuilder endingLike(String paramName)`
  - L161 `public QueryParamBuilder isNumber(String paramName)`
  - L172 `public QueryParamBuilder fullEqualsNotNull(String paramName)`
  - L183 `public QueryParamBuilder addField(String paramName, String expression)`
  - L196 `public QueryParamBuilder addField(String paramName, boolean flag)`
  - L207 `public QueryParamBuilder addFieldByExpression(String paramName, String expression)`
  - L213 `public Map<String, Object> value()`
  - L217 `public String asString(String paramName)`
  - L221 `public BigDecimal asDecimal(String paramName)`
  - L229 `public long asLong(String paramName)`
  - L233 `public int asInt(String paramName)`
  - L237 `public String[] asDefaultSplitDelimiter(String paramName)`
  - L244 `public List<String> asDefaultSplitDelimiterList(String paramName)`
- Main fields:
  - L40 `Map<String, Object> paramMap`
  - L42 `SearchBody searchBody`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\model\QueryParamBuilder.java`
- Size: 7335 bytes

#### Source

````java
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
package org.qifu.base.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.qifu.base.Constants;

import ognl.Ognl;
import ognl.OgnlException;

public class QueryParamBuilder {
	
	private Map<String, Object> paramMap = new HashMap<>();
	
	private SearchBody searchBody = null;
	
	public static QueryParamBuilder build(SearchBody searchBody) {
		QueryParamBuilder paramBuilder = new QueryParamBuilder();
		paramBuilder.searchBody = searchBody;
		return paramBuilder;
	}
	
	public static QueryParamBuilder build() {
		return new QueryParamBuilder();
	}	
	
	private Object doExpression(String expression) {
		Object val = null;
		try {
			val = Ognl.getValue(expression, this.searchBody.getField());
		} catch (OgnlException e) {
			e.printStackTrace();
		}
		return val;
	}
	
	public QueryParamBuilder selectOption(String paramName) {
		if (null == this.searchBody || null == this.searchBody.getField()) {
			return this;
		}		
		String value = this.searchBody.getField().get(paramName);		
		if (!StringUtils.isBlank(value) && !PleaseSelect.isAllOption(value)) {
			this.paramMap.put(paramName, value);
		}
		return this;
	}	
	
	public QueryParamBuilder fullEquals(String paramName, String value) {
		if (!StringUtils.isBlank(value)) {
			this.paramMap.put(paramName, value);
		}
		return this;
	}
	
	public QueryParamBuilder fullLink(String paramName, String value) {
		if (!StringUtils.isBlank(value)) {
			this.paramMap.put(paramName, "%"+value+"%");
		}
		return this;
	}
	
	public QueryParamBuilder beginningLike(String paramName, String value) {
		if (!StringUtils.isBlank(value)) {
			this.paramMap.put(paramName, "%"+value);
		}
		return this;		
	}
	
	public QueryParamBuilder endingLike(String paramName, String value) {
		if (!StringUtils.isBlank(value)) {
			this.paramMap.put(paramName, value+"%");
		}
		return this;		
	}	
	
	public QueryParamBuilder isNumber(String paramName, String value) {
		if (NumberUtils.isCreatable(value)) {
			this.paramMap.put(paramName, value);
		}
		return this;
	}
	
	public QueryParamBuilder fullEqualsNotNull(String paramName, Object value) {
		if (null != value) {
			this.paramMap.put(paramName, value);
		}
		return this;
	}
	
	public QueryParamBuilder fullEquals(String paramName) {
		if (null == this.searchBody || null == this.searchBody.getField()) {
			return this;
		}		
		String value = this.searchBody.getField().get(paramName);		
		if (!StringUtils.isBlank(value)) {
			this.paramMap.put(paramName, value);
		}
		return this;
	}
	
	public QueryParamBuilder fullLink(String paramName) {
		if (null == this.searchBody || null == this.searchBody.getField()) {
			return this;
		}		
		String value = this.searchBody.getField().get(paramName);		
		if (!StringUtils.isBlank(value)) {
			this.paramMap.put(paramName, "%"+value+"%");
		}
		return this;
	}
	
	public QueryParamBuilder beginningLike(String paramName) {
		if (null == this.searchBody || null == this.searchBody.getField()) {
			return this;
		}		
		String value = this.searchBody.getField().get(paramName);		
		if (!StringUtils.isBlank(value)) {
			this.paramMap.put(paramName, "%"+value);
		}
		return this;		
	}
	
	public QueryParamBuilder endingLike(String paramName) {
		if (null == this.searchBody || null == this.searchBody.getField()) {
			return this;
		}		
		String value = this.searchBody.getField().get(paramName);		
		if (!StringUtils.isBlank(value)) {
			this.paramMap.put(paramName, value+"%");
		}
		return this;		
	}	
	
	public QueryParamBuilder isNumber(String paramName) {
		if (null == this.searchBody || null == this.searchBody.getField()) {
			return this;
		}		
		String value = this.searchBody.getField().get(paramName);		
		if (NumberUtils.isCreatable(value)) {
			this.paramMap.put(paramName, value);
		}
		return this;
	}
	
	public QueryParamBuilder fullEqualsNotNull(String paramName) {
		if (null == this.searchBody || null == this.searchBody.getField()) {
			return this;
		}
		String value = this.searchBody.getField().get(paramName);
		if (null != value) {
			this.paramMap.put(paramName, value);
		}
		return this;
	}	
	
	public QueryParamBuilder addField(String paramName, String expression) {
		Object obj = this.doExpression(expression);
		boolean test = false;
		if (obj != null && obj instanceof @SuppressWarnings("unused") Boolean bl) {
			test = (Boolean) obj;
		}
		if (test) {
			String value = this.searchBody.getField().get(paramName);
			this.paramMap.put(paramName, value);
		}
		return this;
	}
	
	public QueryParamBuilder addField(String paramName, boolean flag) {
		if (null == this.searchBody || null == this.searchBody.getField()) {
			return this;
		}			
		String value = this.searchBody.getField().get(paramName);
		if (flag) {
			this.paramMap.put(paramName, value);
		}
		return this;
	}
	
	public QueryParamBuilder addFieldByExpression(String paramName, String expression) {
		Object obj = this.doExpression(expression);
		this.paramMap.put(paramName, obj);
		return this;
	}
	
	public Map<String, Object> value() {
		return this.paramMap;
	}
	
	public String asString(String paramName) {
		return this.searchBody.getField().get(paramName);
	}
	
	public BigDecimal asDecimal(String paramName) {
		BigDecimal value = null;
		if ( this.searchBody.getField().get(paramName) != null ) {
			value = new BigDecimal( this.searchBody.getField().get(paramName) );
		}
		return value;
	}
	
	public long asLong(String paramName) {
		return NumberUtils.toLong(this.searchBody.getField().get(paramName), -1);
	}
	
	public int asInt(String paramName) {
		return NumberUtils.toInt(this.searchBody.getField().get(paramName), -1);
	}
	
	public String[] asDefaultSplitDelimiter(String paramName) {
		if (null == this.searchBody || null == this.searchBody.getField()) {
			return new String[0];
		}
		return StringUtils.defaultString(this.searchBody.getField().get(paramName)).split(Constants.DEFAULT_SPLIT_DELIMITER);
	}
	
	public List<String> asDefaultSplitDelimiterList(String paramName) {
		String[] value = this.asDefaultSplitDelimiter(paramName);
		if (null == value) {
			return new ArrayList<>();
		}
		return Arrays.asList(value);
	}
	
}
````

### `backend/base/src/main/java/org/qifu/base/model/QueryResult.java`

- Purpose: DTO/VO/model; declares class QueryResult; has 10 detected methods
- Package: `org.qifu.base.model`
- Role: DTO/VO/model
- Main types: `class QueryResult <T> implements java.io.Serializable`
- Main methods:
  - L37 `public String getIsAuth()`
  - L41 `public void setIsAuth(String isAuth)`
  - L45 `public String getSuccess()`
  - L49 `public void setSuccess(String success)`
  - L53 `public String getMessage()`
  - L57 `public void setMessage(String message)`
  - L61 `public T getValue()`
  - L65 `public void setValue(T value)`
  - L69 `public PageOf getPageOf()`
  - L73 `public void setPageOf(PageOf pageOf)`
- Main fields:
  - L25 `long serialVersionUID`
  - L27 `PageOf pageOf`
  - L29 `String isAuth`
  - L31 `String success`
  - L33 `String message`
  - L35 `transient T value`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\model\QueryResult.java`
- Size: 1792 bytes

#### Source

````java
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
package org.qifu.base.model;

public class QueryResult<T> implements java.io.Serializable {
	private static final long serialVersionUID = 6153648506077402779L;
	
	private PageOf pageOf;
	
	private String isAuth = YesNoKeyProvide.NO;
	
	private String success = YesNoKeyProvide.NO;
	
	private String message = "";
	
	private transient T value = null;

	public String getIsAuth() {
		return isAuth;
	}

	public void setIsAuth(String isAuth) {
		this.isAuth = isAuth;
	}

	public String getSuccess() {
		return success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}	

	public PageOf getPageOf() {
		return pageOf;
	}

	public void setPageOf(PageOf pageOf) {
		this.pageOf = pageOf;
	}
	
}
````

### `backend/base/src/main/java/org/qifu/base/model/RolePermissionAttr.java`

- Purpose: DTO/VO/model; declares class RolePermissionAttr; has 4 detected methods
- Package: `org.qifu.base.model`
- Role: DTO/VO/model
- Main types: `class RolePermissionAttr implements java.io.Serializable`
- Main methods:
  - L9 `public String getPermission()`
  - L13 `public void setPermission(String permission)`
  - L17 `public String getType()`
  - L21 `public void setType(String type)`
- Main fields:
  - L4 `long serialVersionUID`
  - L6 `String permission`
  - L7 `String type`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\model\RolePermissionAttr.java`
- Size: 498 bytes

#### Source

````java
package org.qifu.base.model;

public class RolePermissionAttr implements java.io.Serializable {
	private static final long serialVersionUID = -8176999846345129588L;
	
	private String permission;
	private String type;
	
	public String getPermission() {
		return permission;
	}
	
	public void setPermission(String permission) {
		this.permission = permission;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
}
````

### `backend/base/src/main/java/org/qifu/base/model/ScriptTypeCode.java`

- Purpose: DTO/VO/model; declares class ScriptTypeCode; has 2 detected methods
- Package: `org.qifu.base.model`
- Role: DTO/VO/model
- Main types: `class ScriptTypeCode`
- Main methods:
  - L33 `public boolean isTypeCode(String type)`
  - L37 `public Map<String, String> getTypeMap(boolean pleaseSelect)`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\model\ScriptTypeCode.java`
- Size: 1385 bytes

#### Source

````java
/* 
 * Copyright 2012-2017 qifu of copyright Chen Xin Nien
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
package org.qifu.base.model;

import java.util.Map;

public class ScriptTypeCode {
	public static final String GROOVY = "GROOVY"; // groovy
	
	protected ScriptTypeCode() {
		throw new IllegalStateException("static model class: ScriptTypeCode");
	}
	
	public static boolean isTypeCode(String type) {
		return GROOVY.equals(type) ? Boolean.TRUE : Boolean.FALSE;
	}
	
	public static Map<String, String> getTypeMap(boolean pleaseSelect) {
		Map<String, String> dataMap = PleaseSelect.pageSelectMap(pleaseSelect);
		dataMap.put(GROOVY, "groovy");
		return dataMap;
	}	
	
}
````

### `backend/base/src/main/java/org/qifu/base/model/SearchBody.java`

- Purpose: DTO/VO/model; declares class SearchBody; has 4 detected methods
- Package: `org.qifu.base.model`
- Role: DTO/VO/model
- Main types: `class SearchBody implements java.io.Serializable`
- Main methods:
  - L48 `public Map<String, String> getField()`
  - L52 `public void setField(Map<String, String> field)`
  - L56 `public PageOf getPageOf()`
  - L60 `public void setPageOf(PageOf pageOf)`
- Main fields:
  - L28 `long serialVersionUID`
  - L30 `Map<String, String> field`
  - L32 `PageOf pageOf`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\model\SearchBody.java`
- Size: 1663 bytes

#### Source

````java
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
package org.qifu.base.model;

import java.util.HashMap;
import java.util.Map;

public class SearchBody implements java.io.Serializable {
	private static final long serialVersionUID = -8184870209865241457L;
	
	private Map<String, String> field = null;
	
	private PageOf pageOf = null;
	
	public SearchBody() {
		this.pageOf = new PageOf();
		this.field = new HashMap<>();
	}
	
	public SearchBody(Map<String, String> field) {
		this.field = field;
	}
	
	public SearchBody(PageOf pageOf, Map<String, String> field) {
		this.pageOf = pageOf;
		this.field = field;
	}	
	
	public Map<String, String> getField() {
		return field;
	}

	public void setField(Map<String, String> field) {
		this.field = field;
	}

	public PageOf getPageOf() {
		return pageOf;
	}

	public void setPageOf(PageOf pageOf) {
		this.pageOf = pageOf;
	}
	
}
````

### `backend/base/src/main/java/org/qifu/base/model/SearchValue.java`

- Purpose: DTO/VO/model; declares class SearchValue; has 2 detected methods
- Package: `org.qifu.base.model`
- Role: DTO/VO/model
- Main types: `class SearchValue implements java.io.Serializable`
- Main methods:
  - L31 `public Map<String, String> getParameter()`
  - L35 `public void setParameter(Map<String, String> parameter)`
- Main fields:
  - L28 `long serialVersionUID`
  - L29 `Map<String, String> parameter`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\model\SearchValue.java`
- Size: 1242 bytes

#### Source

````java
/* 
 * Copyright 2012-2017 qifu of copyright Chen Xin Nien
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
package org.qifu.base.model;

import java.util.HashMap;
import java.util.Map;

public class SearchValue implements java.io.Serializable {
	private static final long serialVersionUID = 8848320628029045810L;
	private Map<String, String> parameter=new HashMap<>();
	
	public Map<String, String> getParameter() {
		return parameter;
	}

	public void setParameter(Map<String, String> parameter) {
		this.parameter = parameter;
	}
	
}
````

### `backend/base/src/main/java/org/qifu/base/model/ServiceAuthority.java`

- Purpose: DTO/VO/model
- Package: `org.qifu.base.model`
- Role: DTO/VO/model
- Key annotations: `Retention`, `Target`, `Inherited`, `Documented`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\model\ServiceAuthority.java`
- Size: 1246 bytes

#### Source

````java
/* 
 * Copyright 2012-2017 qifu of copyright Chen Xin Nien
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
package org.qifu.base.model;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
@Documented
public @interface ServiceAuthority {
	public boolean check() default false;	
}
````

### `backend/base/src/main/java/org/qifu/base/model/ServiceMethodAuthority.java`

- Purpose: DTO/VO/model
- Package: `org.qifu.base.model`
- Role: DTO/VO/model
- Key annotations: `Target`, `Retention`, `Inherited`, `Documented`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\model\ServiceMethodAuthority.java`
- Size: 1307 bytes

#### Source

````java
/* 
 * Copyright 2012-2017 qifu of copyright Chen Xin Nien
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
package org.qifu.base.model;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface ServiceMethodAuthority {
	public ServiceMethodType[] type() default { ServiceMethodType.SELECT };
}
````

### `backend/base/src/main/java/org/qifu/base/model/ServiceMethodType.java`

- Purpose: DTO/VO/model; declares enum ServiceMethodType
- Package: `org.qifu.base.model`
- Role: DTO/VO/model
- Main types: `enum ServiceMethodType`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\model\ServiceMethodType.java`
- Size: 897 bytes

#### Source

````java
/* 
 * Copyright 2012-2017 qifu of copyright Chen Xin Nien
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
package org.qifu.base.model;

public enum ServiceMethodType {
	SELECT, INSERT, UPDATE, DELETE;
}
````

### `backend/base/src/main/java/org/qifu/base/model/SortType.java`

- Purpose: DTO/VO/model; declares class SortType; has 1 detected methods
- Package: `org.qifu.base.model`
- Role: DTO/VO/model
- Main types: `class SortType`
- Third-party dependencies: `org.apache.commons.lang3.StringUtils`
- Main methods:
  - L36 `public boolean isAllow(String type)`
- Main fields:
  - L28 `String ASC`
  - L30 `String DESC`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\model\SortType.java`
- Size: 1308 bytes

#### Source

````java
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
package org.qifu.base.model;

import org.apache.commons.lang3.StringUtils;

public class SortType {
	
	public static final String ASC = "ASC";
	
	public static final String DESC = "DESC";
	
	protected SortType() {
		throw new IllegalStateException("static model class: SortType");
	}
	
	public static boolean isAllow(String type) {
		return (ASC.equalsIgnoreCase(StringUtils.defaultString(type)) || DESC.equalsIgnoreCase(StringUtils.defaultString(type))) ? Boolean.TRUE : Boolean.FALSE;
	}
	
}
````

### `backend/base/src/main/java/org/qifu/base/model/TableMetadataModel.java`

- Purpose: DTO/VO/model; declares class TableMetadataModel; has 6 detected methods
- Package: `org.qifu.base.model`
- Role: DTO/VO/model
- Main types: `class TableMetadataModel implements java.io.Serializable`
- Main methods:
  - L21 `public String getColumnName()`
  - L24 `public void setColumnName(String columnName)`
  - L27 `public String getTypeName()`
  - L30 `public void setTypeName(String typeName)`
  - L33 `public int getColumnSize()`
  - L36 `public void setColumnSize(int columnSize)`
- Main fields:
  - L4 `long serialVersionUID`
  - L6 `String columnName`
  - L7 `String typeName`
  - L8 `int columnSize`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\model\TableMetadataModel.java`
- Size: 921 bytes

#### Source

````java
package org.qifu.base.model;

public class TableMetadataModel implements java.io.Serializable {
	private static final long serialVersionUID = -9149192240295226124L;
	
	private String columnName;
	private String typeName;
	private int columnSize;
	
	public TableMetadataModel() {
		
	}
	
	public TableMetadataModel(String columnName, String typeName, int columnSize) {
		super();
		this.columnName = columnName;
		this.typeName = typeName;
		this.columnSize = columnSize;
	}
	
	public String getColumnName() {
		return columnName;
	}
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public int getColumnSize() {
		return columnSize;
	}
	public void setColumnSize(int columnSize) {
		this.columnSize = columnSize;
	}

}
````

### `backend/base/src/main/java/org/qifu/base/model/TemplateResult.java`

- Purpose: DTO/VO/model; declares class TemplateResult; has 4 detected methods
- Package: `org.qifu.base.model`
- Role: DTO/VO/model
- Main types: `class TemplateResult implements java.io.Serializable`
- Main methods:
  - L32 `public String getSubject()`
  - L36 `public void setSubject(String subject)`
  - L40 `public String getContent()`
  - L44 `public void setContent(String content)`
- Main fields:
  - L26 `long serialVersionUID`
  - L28 `String subject`
  - L30 `String content`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\model\TemplateResult.java`
- Size: 1301 bytes

#### Source

````java
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
package org.qifu.base.model;

public class TemplateResult implements java.io.Serializable {
	
	private static final long serialVersionUID = -5215778026703579466L;
	
	private String subject = "";
	
	private String content = "";

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}
````

### `backend/base/src/main/java/org/qifu/base/model/TokenBuilderVariable.java`

- Purpose: DTO/VO/model; declares class TokenBuilderVariable; has 5 detected methods
- Package: `org.qifu.base.model`
- Role: DTO/VO/model
- Main types: `class TokenBuilderVariable implements java.io.Serializable`
- Key annotations: `Override`
- Main methods:
  - L10 `public String getRefresh()`
  - L14 `public void setRefresh(String refresh)`
  - L18 `public String getAccess()`
  - L22 `public void setAccess(String access)`
  - L27 `public String toString()`
- Main fields:
  - L4 `long serialVersionUID`
  - L6 `String refresh`
  - L8 `String access`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\model\TokenBuilderVariable.java`
- Size: 621 bytes

#### Source

````java
package org.qifu.base.model;

public class TokenBuilderVariable implements java.io.Serializable {
	private static final long serialVersionUID = 7337476628786779101L;
	
	private String refresh;
	
	private String access;

	public String getRefresh() {
		return refresh;
	}

	public void setRefresh(String refresh) {
		this.refresh = refresh;
	}

	public String getAccess() {
		return access;
	}

	public void setAccess(String access) {
		this.access = access;
	}

	@Override
	public String toString() {
		return "TokenBuilderVariable [refresh=" + refresh + ", access=" + access + "]";
	}
	
}
````

### `backend/base/src/main/java/org/qifu/base/model/UpdateDateField.java`

- Purpose: DTO/VO/model
- Package: `org.qifu.base.model`
- Role: DTO/VO/model
- Key annotations: `Retention`, `Target`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\model\UpdateDateField.java`
- Size: 1124 bytes

#### Source

````java
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
package org.qifu.base.model;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface UpdateDateField {
	public String name();
}
````

### `backend/base/src/main/java/org/qifu/base/model/UpdateField.java`

- Purpose: DTO/VO/model; declares class UpdateField; has 4 detected methods
- Package: `org.qifu.base.model`
- Role: DTO/VO/model
- Main types: `class UpdateField`
- Main methods:
  - L33 `public UpdateUserField getUpdateUserField()`
  - L37 `public void setUpdateUserField(UpdateUserField updateUserField)`
  - L41 `public UpdateDateField getUpdateDateField()`
  - L45 `public void setUpdateDateField(UpdateDateField updateDateField)`
- Main fields:
  - L29 `UpdateUserField updateUserField`
  - L31 `UpdateDateField updateDateField`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\model\UpdateField.java`
- Size: 1422 bytes

#### Source

````java
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
package org.qifu.base.model;

/**
 * return value for EntityParameterGenerateUtil
 */
public class UpdateField {
	
	private UpdateUserField updateUserField = null;
	
	private UpdateDateField updateDateField = null;

	public UpdateUserField getUpdateUserField() {
		return updateUserField;
	}

	public void setUpdateUserField(UpdateUserField updateUserField) {
		this.updateUserField = updateUserField;
	}

	public UpdateDateField getUpdateDateField() {
		return updateDateField;
	}

	public void setUpdateDateField(UpdateDateField updateDateField) {
		this.updateDateField = updateDateField;
	}
	
}
````

### `backend/base/src/main/java/org/qifu/base/model/UpdateUserField.java`

- Purpose: DTO/VO/model
- Package: `org.qifu.base.model`
- Role: DTO/VO/model
- Key annotations: `Retention`, `Target`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\model\UpdateUserField.java`
- Size: 1124 bytes

#### Source

````java
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
package org.qifu.base.model;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface UpdateUserField {
	public String name();
}
````

### `backend/base/src/main/java/org/qifu/base/model/UserRoleAndPermission.java`

- Purpose: DTO/VO/model; declares class UserRoleAndPermission; has 4 detected methods
- Package: `org.qifu.base.model`
- Role: DTO/VO/model
- Main types: `class UserRoleAndPermission implements java.io.Serializable`
- Main methods:
  - L12 `public String getRole()`
  - L16 `public void setRole(String role)`
  - L20 `public List<RolePermissionAttr> getRolePermission()`
  - L24 `public void setRolePermission(List<RolePermissionAttr> rolePermission)`
- Main fields:
  - L6 `long serialVersionUID`
  - L8 `String role`
  - L10 `List<RolePermissionAttr> rolePermission`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\model\UserRoleAndPermission.java`
- Size: 610 bytes

#### Source

````java
package org.qifu.base.model;

import java.util.List;

public class UserRoleAndPermission implements java.io.Serializable {
	private static final long serialVersionUID = -7811595650387118293L;
	
	private String role;
	
	private List<RolePermissionAttr> rolePermission;
	
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}

	public List<RolePermissionAttr> getRolePermission() {
		return rolePermission;
	}

	public void setRolePermission(List<RolePermissionAttr> rolePermission) {
		this.rolePermission = rolePermission;
	}
	
}
````

### `backend/base/src/main/java/org/qifu/base/model/YesNo.java`

- Purpose: DTO/VO/model; declares class YesNo; has 3 detected methods
- Package: `org.qifu.base.model`
- Role: DTO/VO/model
- Main types: `class YesNo implements YesNoKeyProvide`
- Key annotations: `Override`
- Main methods:
  - L30 `public void setKey(String key)`
  - L35 `public String getKey()`
  - L40 `public boolean isYes()`
- Main fields:
  - L25 `long serialVersionUID`
  - L27 `String key`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\model\YesNo.java`
- Size: 1222 bytes

#### Source

````java
/* 
 * Copyright 2012-2017 qifu of copyright Chen Xin Nien
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
package org.qifu.base.model;

public class YesNo implements YesNoKeyProvide {
	private static final long serialVersionUID = -6243933633323014763L;
	
	private String key = YES;
	
	@Override
	public void setKey(String key) {
		this.key=key;
	}	

	@Override
	public String getKey() {
		return this.key;
	}

	@Override
	public boolean isYes() {
		return YES.equals(key) ? Boolean.TRUE : Boolean.FALSE;
	}

}
````

### `backend/base/src/main/java/org/qifu/base/model/YesNoKeyProvide.java`

- Purpose: DTO/VO/model; declares interface YesNoKeyProvide
- Package: `org.qifu.base.model`
- Role: DTO/VO/model
- Main types: `interface YesNoKeyProvide extends java.io.Serializable`
- Main fields:
  - L25 `String YES`
  - L26 `String NO`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\model\YesNoKeyProvide.java`
- Size: 1060 bytes

#### Source

````java
/* 
 * Copyright 2012-2017 qifu of copyright Chen Xin Nien
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
package org.qifu.base.model;

public interface YesNoKeyProvide extends java.io.Serializable {
	public static final String YES = "Y";
	public static final String NO = "N";
	public void setKey(String key);
	public String getKey();
	public boolean isYes();
}
````

### `backend/base/src/main/java/org/qifu/base/model/YesNoTinyKeyProvide.java`

- Purpose: DTO/VO/model; declares interface YesNoTinyKeyProvide
- Package: `org.qifu.base.model`
- Role: DTO/VO/model
- Main types: `interface YesNoTinyKeyProvide`
- Main fields:
  - L25 `int YES`
  - L26 `int NO`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\model\YesNoTinyKeyProvide.java`
- Size: 965 bytes

#### Source

````java
/* 
 * Copyright 2012-2017 qifu of copyright Chen Xin Nien
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
package org.qifu.base.model;

public interface YesNoTinyKeyProvide {
	public static final int YES = 1;
	public static final int NO = 0;
	public String getKey();
}
````

### `backend/base/src/main/java/org/qifu/base/model/ZeroKeyProvide.java`

- Purpose: DTO/VO/model; declares class ZeroKeyProvide
- Package: `org.qifu.base.model`
- Role: DTO/VO/model
- Main types: `class ZeroKeyProvide`
- Main fields:
  - L27 `String STR_KEY`
  - L28 `int INTEGER_KEY`
  - L29 `long LONG_KEY`
  - L30 `BigDecimal BIG_DECIMAL_KEY`
  - L31 `String OID_KEY`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\model\ZeroKeyProvide.java`
- Size: 1277 bytes

#### Source

````java
/* 
 * Copyright 2012-2017 qifu of copyright Chen Xin Nien
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
package org.qifu.base.model;

import java.math.BigDecimal;

public class ZeroKeyProvide {
	public static final String STR_KEY = " ";
	public static final int INTEGER_KEY = 0;
	public static final long LONG_KEY = 0L;
	public static final BigDecimal BIG_DECIMAL_KEY = BigDecimal.ZERO;
	public static final String OID_KEY="00000000-0000-0000-0000-000000000000";
	
	private ZeroKeyProvide() {
		throw new IllegalStateException("static model class: ZeroKeyProvide");
	}
}
````

### `backend/base/src/main/java/org/qifu/base/properties/BaseInfoConfigProperties.java`

- Purpose: Spring configuration; declares class BaseInfoConfigProperties; has 20 detected methods
- Package: `org.qifu.base.properties`
- Role: Spring configuration
- Main types: `class BaseInfoConfigProperties`
- Key annotations: `Configuration`, `PropertySource`, `ConfigurationProperties`
- Spring dependencies: `org.springframework.boot.context.properties.ConfigurationProperties`, `org.springframework.context.annotation.Configuration`, `org.springframework.context.annotation.PropertySource`
- Main methods:
  - L53 `public String getErrorContact()`
  - L57 `public void setErrorContact(String errorContact)`
  - L61 `public String getVerMsg()`
  - L65 `public void setVerMsg(String verMsg)`
  - L69 `public String getJsVerBuild()`
  - L73 `public void setJsVerBuild(String jsVerBuild)`
  - L77 `public String getLoginCaptchaCodeEnable()`
  - L81 `public void setLoginCaptchaCodeEnable(String loginCaptchaCodeEnable)`
  - L85 `public String getMainSystem()`
  - L89 `public void setMainSystem(String mainSystem)`
  - L93 `public String getSystem()`
  - L97 `public void setSystem(String system)`
  - L101 `public String getUploadDir()`
  - L105 `public void setUploadDir(String uploadDir)`
  - L109 `public String getEnableControllerAuthCheckLog()`
  - L113 `public void setEnableControllerAuthCheckLog(String enableControllerAuthCheckLog)`
  - L117 `public String getEnableServiceAuthChecLog()`
  - L121 `public void setEnableServiceAuthChecLog(String enableServiceAuthChecLog)`
  - L125 `public String getEnableAlwaysRememberMe()`
  - L129 `public void setEnableAlwaysRememberMe(String enableAlwaysRememberMe)`
- Main fields:
  - L33 `String errorContact`
  - L35 `String verMsg`
  - L37 `String jsVerBuild`
  - L39 `String loginCaptchaCodeEnable`
  - L41 `String mainSystem`
  - L43 `String system`
  - L45 `String uploadDir`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\properties\BaseInfoConfigProperties.java`
- Size: 3542 bytes

#### Source

````java
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
package org.qifu.base.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:appConfig.properties")
@ConfigurationProperties(prefix = "base")
public class BaseInfoConfigProperties {
	
	private String errorContact;
	
	private String verMsg;
	
	private String jsVerBuild;
	
	private String loginCaptchaCodeEnable;
	
	private String mainSystem;
	
	private String system;
	
	private String uploadDir;
	
	private String enableControllerAuthCheckLog; // 是否開啟 ControllerAuthorityCheckInterceptor 的 log 至 TB_SYS_EVENT_LOG
	
	private String enableServiceAuthChecLog; // 是否開啟 ServiceAuthorityCheckAspect 的 log 至 TB_SYS_EVENT_LOG
	
	private String enableAlwaysRememberMe; // 是否啟用 alwaysRemember
	
	public String getErrorContact() {
		return errorContact;
	}

	public void setErrorContact(String errorContact) {
		this.errorContact = errorContact;
	}

	public String getVerMsg() {
		return verMsg;
	}

	public void setVerMsg(String verMsg) {
		this.verMsg = verMsg;
	}

	public String getJsVerBuild() {
		return jsVerBuild;
	}

	public void setJsVerBuild(String jsVerBuild) {
		this.jsVerBuild = jsVerBuild;
	}

	public String getLoginCaptchaCodeEnable() {
		return loginCaptchaCodeEnable;
	}

	public void setLoginCaptchaCodeEnable(String loginCaptchaCodeEnable) {
		this.loginCaptchaCodeEnable = loginCaptchaCodeEnable;
	}

	public String getMainSystem() {
		return mainSystem;
	}

	public void setMainSystem(String mainSystem) {
		this.mainSystem = mainSystem;
	}

	public String getSystem() {
		return system;
	}

	public void setSystem(String system) {
		this.system = system;
	}

	public String getUploadDir() {
		return uploadDir;
	}

	public void setUploadDir(String uploadDir) {
		this.uploadDir = uploadDir;
	}

	public String getEnableControllerAuthCheckLog() {
		return enableControllerAuthCheckLog;
	}

	public void setEnableControllerAuthCheckLog(String enableControllerAuthCheckLog) {
		this.enableControllerAuthCheckLog = enableControllerAuthCheckLog;
	}

	public String getEnableServiceAuthChecLog() {
		return enableServiceAuthChecLog;
	}

	public void setEnableServiceAuthChecLog(String enableServiceAuthChecLog) {
		this.enableServiceAuthChecLog = enableServiceAuthChecLog;
	}

	public String getEnableAlwaysRememberMe() {
		return enableAlwaysRememberMe;
	}

	public void setEnableAlwaysRememberMe(String enableAlwaysRememberMe) {
		this.enableAlwaysRememberMe = enableAlwaysRememberMe;
	}
	
}
````

### `backend/base/src/main/java/org/qifu/base/properties/JasperreportConfigProperties.java`

- Purpose: Spring configuration; declares class JasperreportConfigProperties; has 4 detected methods
- Package: `org.qifu.base.properties`
- Role: Spring configuration
- Main types: `class JasperreportConfigProperties`
- Key annotations: `Configuration`, `PropertySource`, `ConfigurationProperties`
- Spring dependencies: `org.springframework.boot.context.properties.ConfigurationProperties`, `org.springframework.context.annotation.Configuration`, `org.springframework.context.annotation.PropertySource`
- Main methods:
  - L37 `public String getSource()`
  - L41 `public void setSource(String source)`
  - L45 `public String getOwner()`
  - L49 `public void setOwner(String owner)`
- Main fields:
  - L33 `String source`
  - L35 `String owner`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\properties\JasperreportConfigProperties.java`
- Size: 1506 bytes

#### Source

````java
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
package org.qifu.base.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:appConfig.properties")
@ConfigurationProperties(prefix = "jasperreport")
public class JasperreportConfigProperties {
	
	private String source;
	
	private String owner;

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
}
````

### `backend/base/src/main/java/org/qifu/base/properties/LdapLoginConfigProperties.java`

- Purpose: Spring configuration; declares class LdapLoginConfigProperties; has 20 detected methods
- Package: `org.qifu.base.properties`
- Role: Spring configuration
- Main types: `class LdapLoginConfigProperties`
- Key annotations: `Configuration`, `PropertySource`, `ConfigurationProperties`
- Spring dependencies: `org.springframework.boot.context.properties.ConfigurationProperties`, `org.springframework.context.annotation.Configuration`, `org.springframework.context.annotation.PropertySource`
- Main methods:
  - L53 `public String getLoginEnable()`
  - L57 `public void setLoginEnable(String loginEnable)`
  - L61 `public String getContextUrl()`
  - L65 `public void setContextUrl(String contextUrl)`
  - L69 `public String getContextBase()`
  - L73 `public void setContextBase(String contextBase)`
  - L77 `public String getContextUserDn()`
  - L81 `public void setContextUserDn(String contextUserDn)`
  - L85 `public String getContextPassword()`
  - L89 `public void setContextPassword(String contextPassword)`
  - L93 `public String getSearchFilter()`
  - L97 `public void setSearchFilter(String searchFilter)`
  - L101 `public String getAuthSearchBase()`
  - L105 `public void setAuthSearchBase(String authSearchBase)`
  - L109 `public String getJavaNamingReferral()`
  - L113 `public void setJavaNamingReferral(String javaNamingReferral)`
  - L117 `public String getPooled()`
  - L121 `public void setPooled(String pooled)`
  - L125 `public String getIgnorePartialResultException()`
  - L129 `public void setIgnorePartialResultException(String ignorePartialResultException)`
- Main fields:
  - L33 `String loginEnable`
  - L35 `String contextUrl`
  - L37 `String contextBase`
  - L39 `String contextUserDn`
  - L41 `String contextPassword`
  - L43 `String searchFilter`
  - L45 `String authSearchBase`
  - L47 `String javaNamingReferral`
  - L49 `String pooled`
  - L51 `String ignorePartialResultException`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\properties\LdapLoginConfigProperties.java`
- Size: 3280 bytes

#### Source

````java
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
package org.qifu.base.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:appConfig.properties")
@ConfigurationProperties(prefix = "ldap")
public class LdapLoginConfigProperties {
	
	private String loginEnable;
	
	private String contextUrl;
	
	private String contextBase;
	
	private String contextUserDn;
	
	private String contextPassword;
	
	private String searchFilter;
	
	private String authSearchBase;
	
	private String javaNamingReferral;
	
	private String pooled;
	
	private String ignorePartialResultException;

	public String getLoginEnable() {
		return loginEnable;
	}

	public void setLoginEnable(String loginEnable) {
		this.loginEnable = loginEnable;
	}

	public String getContextUrl() {
		return contextUrl;
	}

	public void setContextUrl(String contextUrl) {
		this.contextUrl = contextUrl;
	}

	public String getContextBase() {
		return contextBase;
	}

	public void setContextBase(String contextBase) {
		this.contextBase = contextBase;
	}

	public String getContextUserDn() {
		return contextUserDn;
	}

	public void setContextUserDn(String contextUserDn) {
		this.contextUserDn = contextUserDn;
	}

	public String getContextPassword() {
		return contextPassword;
	}

	public void setContextPassword(String contextPassword) {
		this.contextPassword = contextPassword;
	}

	public String getSearchFilter() {
		return searchFilter;
	}

	public void setSearchFilter(String searchFilter) {
		this.searchFilter = searchFilter;
	}

	public String getAuthSearchBase() {
		return authSearchBase;
	}

	public void setAuthSearchBase(String authSearchBase) {
		this.authSearchBase = authSearchBase;
	}

	public String getJavaNamingReferral() {
		return javaNamingReferral;
	}

	public void setJavaNamingReferral(String javaNamingReferral) {
		this.javaNamingReferral = javaNamingReferral;
	}

	public String getPooled() {
		return pooled;
	}

	public void setPooled(String pooled) {
		this.pooled = pooled;
	}

	public String getIgnorePartialResultException() {
		return ignorePartialResultException;
	}

	public void setIgnorePartialResultException(String ignorePartialResultException) {
		this.ignorePartialResultException = ignorePartialResultException;
	}
	
}
````

### `backend/base/src/main/java/org/qifu/base/properties/MqttConfigProperties.java`

- Purpose: Spring configuration; declares class MqttConfigProperties; has 18 detected methods
- Package: `org.qifu.base.properties`
- Role: Spring configuration
- Main types: `class MqttConfigProperties`
- Key annotations: `Configuration`, `PropertySource`, `ConfigurationProperties`
- Spring dependencies: `org.springframework.boot.context.properties.ConfigurationProperties`, `org.springframework.context.annotation.Configuration`, `org.springframework.context.annotation.PropertySource`
- Main methods:
  - L22 `public boolean isEnable()`
  - L26 `public void setEnable(boolean enable)`
  - L30 `public String getHost()`
  - L34 `public void setHost(String host)`
  - L38 `public String getPort()`
  - L42 `public void setPort(String port)`
  - L46 `public boolean isEnablePersistence()`
  - L50 `public void setEnablePersistence(boolean enablePersistence)`
  - L54 `public boolean isAllowAnonymous()`
  - L58 `public void setAllowAnonymous(boolean allowAnonymous)`
  - L62 `public boolean isTelemetryEnabled()`
  - L66 `public void setTelemetryEnabled(boolean telemetryEnabled)`
  - L70 `public String getStorePath()`
  - L74 `public void setStorePath(String storePath)`
  - L78 `public String getTempPasswordFile()`
  - L82 `public void setTempPasswordFile(String tempPasswordFile)`
  - L86 `public int getMonitoringInterceptorPerTopic()`
  - L90 `public void setMonitoringInterceptorPerTopic(int monitoringInterceptorPerTopic)`
- Main fields:
  - L12 `boolean enable`
  - L13 `String host`
  - L14 `String port`
  - L15 `boolean enablePersistence`
  - L16 `boolean allowAnonymous`
  - L17 `boolean telemetryEnabled`
  - L18 `String storePath`
  - L19 `String tempPasswordFile`
  - L20 `int monitoringInterceptorPerTopic`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\properties\MqttConfigProperties.java`
- Size: 2185 bytes

#### Source

````java
package org.qifu.base.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:appConfig.properties")
@ConfigurationProperties(prefix = "mqttbroker")
public class MqttConfigProperties {

	private boolean enable;
	private String host;
	private String port;
	private boolean enablePersistence;
	private boolean allowAnonymous;
	private boolean telemetryEnabled;
	private String storePath;
	private String tempPasswordFile;
	private int monitoringInterceptorPerTopic;

	public boolean isEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}
	
	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public boolean isEnablePersistence() {
		return enablePersistence;
	}

	public void setEnablePersistence(boolean enablePersistence) {
		this.enablePersistence = enablePersistence;
	}

	public boolean isAllowAnonymous() {
		return allowAnonymous;
	}

	public void setAllowAnonymous(boolean allowAnonymous) {
		this.allowAnonymous = allowAnonymous;
	}

	public boolean isTelemetryEnabled() {
		return telemetryEnabled;
	}

	public void setTelemetryEnabled(boolean telemetryEnabled) {
		this.telemetryEnabled = telemetryEnabled;
	}

	public String getStorePath() {
		return storePath;
	}

	public void setStorePath(String storePath) {
		this.storePath = storePath;
	}

	public String getTempPasswordFile() {
		return tempPasswordFile;
	}

	public void setTempPasswordFile(String tempPasswordFile) {
		this.tempPasswordFile = tempPasswordFile;
	}

	public int getMonitoringInterceptorPerTopic() {
		return monitoringInterceptorPerTopic;
	}

	public void setMonitoringInterceptorPerTopic(int monitoringInterceptorPerTopic) {
		this.monitoringInterceptorPerTopic = monitoringInterceptorPerTopic;
	}

}
````

### `backend/base/src/main/java/org/qifu/base/properties/PageVariableConfigProperties.java`

- Purpose: Spring configuration; declares class PageVariableConfigProperties; has 5 detected methods; depends on 1 org.qifu local types
- Package: `org.qifu.base.properties`
- Role: Spring configuration
- Main types: `class PageVariableConfigProperties`
- Key annotations: `Configuration`, `PropertySource`, `ConfigurationProperties`
- Local dependencies: `org.qifu.base.Constants`
- Spring dependencies: `org.springframework.boot.context.properties.ConfigurationProperties`, `org.springframework.context.annotation.Configuration`, `org.springframework.context.annotation.PropertySource`
- Third-party dependencies: `org.apache.commons.lang3.StringUtils`, `org.apache.commons.lang3.math.NumberUtils`
- Main methods:
  - L39 `public String getMaxUploadSize()`
  - L46 `public void setMaxUploadSize(String maxUploadSize)`
  - L50 `public String[] getAllowedOriginVals()`
  - L54 `public String getAllowedOrigin()`
  - L58 `public void setAllowedOrigin(String allowedOrigin)`
- Main fields:
  - L36 `String maxUploadSize`
  - L37 `String allowedOrigin`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\properties\PageVariableConfigProperties.java`
- Size: 1961 bytes

#### Source

````java
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
package org.qifu.base.properties;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.qifu.base.Constants;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:appConfig.properties")
@ConfigurationProperties(prefix = "page")
public class PageVariableConfigProperties {
	
	private String maxUploadSize;
	private String allowedOrigin;

	public String getMaxUploadSize() {
		if (NumberUtils.toInt(this.maxUploadSize, 0) < 1048576) {
			return "1048576";
		}
		return maxUploadSize;
	}

	public void setMaxUploadSize(String maxUploadSize) {
		this.maxUploadSize = maxUploadSize;
	}
	
	public String[] getAllowedOriginVals() {
		return StringUtils.defaultString(allowedOrigin).split(Constants.DEFAULT_SPLIT_DELIMITER);
	}

	public String getAllowedOrigin() {
		return allowedOrigin;
	}

	public void setAllowedOrigin(String allowedOrigin) {
		this.allowedOrigin = allowedOrigin;
	}
	
}
````

### `backend/base/src/main/java/org/qifu/base/properties/SpringMailSessionConfigProperties.java`

- Purpose: Spring configuration; declares class SpringMailSessionConfigProperties; has 3 detected methods; depends on 1 org.qifu local types
- Package: `org.qifu.base.properties`
- Role: Spring configuration
- Main types: `class SpringMailSessionConfigProperties`
- Key annotations: `Configuration`, `PropertySource`, `ConfigurationProperties`
- Local dependencies: `org.qifu.base.model.YesNoKeyProvide`
- Spring dependencies: `org.springframework.boot.context.properties.ConfigurationProperties`, `org.springframework.context.annotation.Configuration`, `org.springframework.context.annotation.PropertySource`
- Main methods:
  - L36 `public String getDebug()`
  - L40 `public void setDebug(String debug)`
  - L44 `public boolean enableDebug()`
- Main fields:
  - L34 `String debug`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\properties\SpringMailSessionConfigProperties.java`
- Size: 1504 bytes

#### Source

````java
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
package org.qifu.base.properties;

import org.qifu.base.model.YesNoKeyProvide;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:appConfig.properties")
@ConfigurationProperties(prefix = "spring-mail-session")
public class SpringMailSessionConfigProperties {
	
	private String debug = "";

	public String getDebug() {
		return debug;
	}

	public void setDebug(String debug) {
		this.debug = debug;
	}
	
	public boolean enableDebug() {
		return YesNoKeyProvide.YES.equals(this.debug);
	}
	
}
````

### `backend/base/src/main/java/org/qifu/base/scheduled/BaseScheduledTasksProvide.java`

- Purpose: Java class; declares class BaseScheduledTasksProvide; has 3 detected methods; depends on 3 org.qifu local types
- Package: `org.qifu.base.scheduled`
- Role: Java class
- Main types: `class BaseScheduledTasksProvide`
- Local dependencies: `org.qifu.base.Constants`, `org.qifu.base.model.BaseUserInfo`, `org.qifu.base.util.UserLocalUtils`
- Main methods:
  - L32 `private BaseUserInfo buildUser()`
  - L39 `public BaseUserInfo login()`
  - L43 `public void logout()`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\scheduled\BaseScheduledTasksProvide.java`
- Size: 1423 bytes

#### Source

````java
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
package org.qifu.base.scheduled;

import org.qifu.base.Constants;
import org.qifu.base.model.BaseUserInfo;
import org.qifu.base.util.UserLocalUtils;

public abstract class BaseScheduledTasksProvide {	
	
	public abstract void execute();
	
	private BaseUserInfo buildUser() {
		BaseUserInfo userInfo = new BaseUserInfo();
		userInfo.setUserId( Constants.SYSTEM_BACKGROUND_USER );
		UserLocalUtils.setUserInfo(userInfo);
		return userInfo;
	}
	
	public BaseUserInfo login() {
		return this.buildUser();
	}
	
	public void logout() {
		UserLocalUtils.setUserInfo( null );
		UserLocalUtils.remove();
	}
	
}
````

### `backend/base/src/main/java/org/qifu/base/service/BaseLogicService.java`

- Purpose: Service interface; declares class BaseLogicService; has 8 detected methods; depends on 3 org.qifu local types
- Package: `org.qifu.base.service`
- Role: Service interface
- Main types: `class BaseLogicService`
- Local dependencies: `org.qifu.base.model.PleaseSelect`, `org.qifu.base.util.UserLocalUtils`, `org.qifu.util.SimpleUtils`
- Spring dependencies: `org.springframework.security.core.Authentication`, `org.springframework.security.core.context.SecurityContextHolder`, `org.springframework.security.core.userdetails.UserDetails`
- Third-party dependencies: `org.apache.commons.lang3.RegExUtils`, `org.apache.commons.lang3.StringUtils`, `ognl.Ognl`, `ognl.OgnlException`
- Main methods:
  - L40 `public String getAccountId()`
  - L52 `public String generateOid()`
  - L56 `public String defaultString(String source)`
  - L60 `public boolean isBlank(String source)`
  - L64 `protected Map<String, String> providedSelectZeroDataMap(boolean pleaseSelectItem)`
  - L68 `public <T> T setStringValueMaxLength(T obj, String fieldName, int maxLength)`
  - L88 `public <T> T replaceSplit2Blank(T obj, String fieldName, String split)`
  - L108 `protected void replaceAll(Object obj, String variableName, String regex, String replacement)`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\service\BaseLogicService.java`
- Size: 3596 bytes

#### Source

````java
/* 
 * Copyright 2012-2017 qifu of copyright Chen Xin Nien
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
package org.qifu.base.service;

import java.util.Map;

import org.apache.commons.lang3.RegExUtils;
import org.apache.commons.lang3.StringUtils;
import org.qifu.base.model.PleaseSelect;
import org.qifu.base.util.UserLocalUtils;
import org.qifu.util.SimpleUtils;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

import ognl.Ognl;
import ognl.OgnlException;

public abstract class BaseLogicService {
	
	public String getAccountId() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		Object u = auth.getPrincipal();
		if (u instanceof @SuppressWarnings("unused") UserDetails ud) {
			return ( (UserDetails) u ).getUsername();
		}
		if (UserLocalUtils.getUserInfo() != null) { // for JOB service
			return UserLocalUtils.getUserInfo().getUserId();
		}		
		return null;
	}
	
	public String generateOid() {
		return SimpleUtils.getUUIDStr();
	}	
	
	public String defaultString(String source) {
		return SimpleUtils.getStr(source);
	}	
	
	public boolean isBlank(String source) {
		return StringUtils.isBlank(source);
	}
	
	protected Map<String, String> providedSelectZeroDataMap(boolean pleaseSelectItem) {
		return PleaseSelect.pageSelectMap(pleaseSelectItem);
	}	
	
	public <T> T setStringValueMaxLength(T obj, String fieldName, int maxLength) {
		if (obj == null) {
			return obj;
		}
		try {
			Object value = Ognl.getValue(fieldName, obj);
			if ( !(value instanceof String) ) {
				return obj;
			}
			if ( this.isBlank((String)value) || ((String)value).length() <= maxLength ) {
				return obj;
			}
			value = ((String)value).substring(0, maxLength);
			Ognl.setValue(fieldName, obj, value);
		} catch (OgnlException e) {
			e.printStackTrace();
		}
		return obj;
	}
	
	public <T> T replaceSplit2Blank(T obj, String fieldName, String split) {
		if (obj == null) {
			return obj;
		}
		try {
			Object value = Ognl.getValue(fieldName, obj);
			if ( !(value instanceof String) ) {
				return obj;
			}
			if ( this.isBlank((String)value) ) {
				return obj;
			}
			value = ((String)value).replaceAll(split, "");
			Ognl.setValue(fieldName, obj, value);
		} catch (OgnlException e) {
			e.printStackTrace();
		}
		return obj;
	}	
	
	protected void replaceAll(Object obj, String variableName, String regex, String replacement) {
		try {
			Object val = Ognl.getValue(variableName, obj);
			if (val == null) {
				return;
			}
			String  str = (String) val;
			str = RegExUtils.replaceAll(str, regex, replacement);
			Ognl.setValue(variableName, obj, str);
		} catch (OgnlException e) {
			e.printStackTrace();
		} 
	}	
	
}
````

### `backend/base/src/main/java/org/qifu/base/service/BaseService.java`

- Purpose: Service interface; declares class BaseService; has 21 detected methods; depends on 15 org.qifu local types
- Package: `org.qifu.base.service`
- Role: Service interface
- Main types: `class BaseService <T extends java.io.Serializable, K extends java.io.Serializable> implements IBaseService<T, K>`
- Key annotations: `SuppressWarnings`
- Local dependencies: `org.qifu.base.Constants`, `org.qifu.base.exception.ServiceException`, `org.qifu.base.mapper.IBaseMapper`, `org.qifu.base.message.BaseSystemMessage`, `org.qifu.base.model.CreateField`, `org.qifu.base.model.DefaultResult`, `org.qifu.base.model.EntityPK`, `org.qifu.base.model.PageOf`, `org.qifu.base.model.QueryResult`, `org.qifu.base.model.SortType`, `org.qifu.base.model.UpdateField`, `org.qifu.base.model.YesNoKeyProvide`, `org.qifu.base.util.EntityParameterGenerateUtil`, `org.qifu.base.util.UserLocalUtils`, `org.qifu.util.SimpleUtils`
- Spring dependencies: `org.springframework.security.core.Authentication`, `org.springframework.security.core.context.SecurityContextHolder`, `org.springframework.security.core.userdetails.UserDetails`
- Third-party dependencies: `org.apache.commons.collections.MapUtils`, `org.apache.commons.lang3.StringUtils`, `org.slf4j.Logger`, `org.slf4j.LoggerFactory`, `ognl.Ognl`, `ognl.OgnlContext`, `ognl.OgnlException`
- Main methods:
  - L75 `public String getAccountId()`
  - L90 `private void setEntityPrimaryKey(T entity)`
  - L112 `private void setEntityCreateUserField(T entity)`
  - L133 `private void setEntityUpdateField(T entity)`
  - L154 `public String defaultString(String source)`
  - L158 `public DefaultResult<T> selectByPrimaryKey(K pk)`
  - L172 `public DefaultResult<T> selectByEntityPrimaryKey(T mapperObj)`
  - L183 `public DefaultResult<List<T>> selectList()`
  - L194 `public DefaultResult<List<T>> selectListByParams(Map<String, Object> paramMap)`
  - L208 `private void setReservedParamOrderBy(Map<String, Object> paramMap, String orderBy, String sortType)`
  - L224 `public DefaultResult<List<T>> selectList(String orderBy, String sortType)`
  - L230 `public DefaultResult<List<T>> selectListByParams(Map<String, Object> paramMap, String orderBy, String sortType)`
  - L238 `public DefaultResult<T> selectByUniqueKey(T mapperObj)`
  - L263 `public DefaultResult<T> insert(T mapperObj)`
  - L282 `public DefaultResult<T> update(T mapperObj)`
  - L297 `public DefaultResult<Boolean> delete(T mapperObj)`
  - L310 `public Long count(Map<String, Object> paramMap)`
  - L314 `public Long countByUK(T mapperObj)`
  - L325 `public <V> QueryResult<List<V>> findPage(Map<String, Object> paramMap, PageOf pageOf)`
  - L343 `public <V> QueryResult<List<V>> findPage(String mapperCountMethodName, String mapperQueryMethodName, Map<String, Object> paramMap, PageOf pageOf)`
  - L369 `private void fillPageOfAndfindPageParam(Map<String, Object> paramMap, PageOf pageOf, Long countSize)`
- Main fields:
  - L62 `Logger logger`
  - L66 `boolean foundCustomPrimaryKeyProvide`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\service\BaseService.java`
- Size: 15282 bytes

#### Source

````java
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
package org.qifu.base.service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.qifu.base.Constants;
import org.qifu.base.exception.ServiceException;
import org.qifu.base.mapper.IBaseMapper;
import org.qifu.base.message.BaseSystemMessage;
import org.qifu.base.model.CreateField;
import org.qifu.base.model.DefaultResult;
import org.qifu.base.model.EntityPK;
import org.qifu.base.model.PageOf;
import org.qifu.base.model.QueryResult;
import org.qifu.base.model.SortType;
import org.qifu.base.model.UpdateField;
import org.qifu.base.model.YesNoKeyProvide;
import org.qifu.base.util.EntityParameterGenerateUtil;
import org.qifu.base.util.UserLocalUtils;
import org.qifu.util.SimpleUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;

/**
 * @param <T>	MyBatis entity
 * @param <K>	PK屬性
 */
public abstract class BaseService<T extends java.io.Serializable, K extends java.io.Serializable> implements IBaseService<T, K> {
	
	protected Logger logger = LoggerFactory.getLogger(getClass()); 
	
	protected abstract IBaseMapper<T, K> getBaseMapper();
	
	private boolean foundCustomPrimaryKeyProvide = false;
	
	protected BaseService() {
		super();
		if ( this instanceof IBaseServiceCustomPrimaryKeyProvide ) { // check實作類是否有 implements IBaseServiceCustomPrimaryKeyProvide, 自定義 PK生成method.
			foundCustomPrimaryKeyProvide = true;
		}
	}	
	
	public String getAccountId() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null) {
			Object o = auth.getPrincipal();
			if (o instanceof @SuppressWarnings("unused") UserDetails ud) {
				return ( (UserDetails) o ).getUsername();
			}
		}
		if (UserLocalUtils.getUserInfo() != null) { // for JOB service
			return UserLocalUtils.getUserInfo().getUserId();
		}		
		return null;
	}
	
	@SuppressWarnings("unchecked")
	private void setEntityPrimaryKey(T entity) {
		EntityPK primaryKeyField = EntityParameterGenerateUtil.getPrimaryKeyField(entity);
		if ( null == primaryKeyField || StringUtils.isBlank(primaryKeyField.name()) ) {
			return;
		}
		Object value = null;
		if (primaryKeyField.autoUUID()) {
			value = SimpleUtils.getUUIDStr();
		} 
		if (foundCustomPrimaryKeyProvide) {
			value = ( (IBaseServiceCustomPrimaryKeyProvide<T, K>) this ).generateCustomPrimaryKey();
		}
		if (null == value) {
			return;
		}		
		try {
			Ognl.setValue(primaryKeyField.name(), entity, value);
		} catch (OgnlException e) {
			e.printStackTrace();
		}
	}
	
	private void setEntityCreateUserField(T entity) {
		CreateField field = EntityParameterGenerateUtil.getCreateField(entity);
		if (null == field) {
			return;
		}
		if ( field.getCreateUserField() != null && !StringUtils.isBlank(field.getCreateUserField().name()) ) {
			try {
				Ognl.setValue(field.getCreateUserField().name(), entity, this.getAccountId());
			} catch (OgnlException oe) {
				oe.printStackTrace();
			}			
		}
		if ( field.getCreateDateField() != null && !StringUtils.isBlank(field.getCreateDateField().name()) ) {
			try {
				Ognl.setValue(field.getCreateDateField().name(), entity, new Date());
			} catch (OgnlException oe) {
				oe.printStackTrace();
			}
		}		
	}
	
	private void setEntityUpdateField(T entity) {
		UpdateField field = EntityParameterGenerateUtil.getUpdateField(entity);
		if (null == field) {
			return;
		}
		if ( field.getUpdateUserField() != null && !StringUtils.isBlank(field.getUpdateUserField().name()) ) {
			try {
				Ognl.setValue(field.getUpdateUserField().name(), entity, this.getAccountId());
			} catch (OgnlException oe) {
				oe.printStackTrace();
			}
		}
		if ( field.getUpdateDateField() != null && !StringUtils.isBlank(field.getUpdateDateField().name()) ) {
			try {
				Ognl.setValue(field.getUpdateDateField().name(), entity, new Date());
			} catch (OgnlException oe) {
				oe.printStackTrace();
			}
		}		
	}
	
	public String defaultString(String source) {
		return StringUtils.defaultString(source);
	}
	
	public DefaultResult<T> selectByPrimaryKey(K pk) throws ServiceException {
		if (null == pk || StringUtils.isBlank(String.valueOf(pk))) {
			throw new ServiceException(BaseSystemMessage.parameterBlank());
		}
		DefaultResult<T> result = new DefaultResult<>();
		T value = this.getBaseMapper().selectByPrimaryKey(pk);
		if (value != null) {
			result.setValue(value);
		} else {
			result.setMessage(BaseSystemMessage.searchNoData());
		}
		return result;
	}
	
	public DefaultResult<T> selectByEntityPrimaryKey(T mapperObj) throws ServiceException {
		Map<String, Object> paramMap = EntityParameterGenerateUtil.getPKParameter(mapperObj);
		if (MapUtils.isEmpty(paramMap)) {
			throw new ServiceException(BaseSystemMessage.parameterBlank());
		}
		String key = paramMap.keySet().stream()
			    .findFirst()
			    .orElse(null); 
		return this.selectByPrimaryKey( (K) paramMap.get(key) );
	}
	
	public DefaultResult<List<T>> selectList() throws ServiceException {
		DefaultResult<List<T>> result = new DefaultResult<>();
		List<T> value = this.getBaseMapper().selectListByParams(null);
		if (value != null) {
			result.setValue(value);
		} else {
			result.setMessage(BaseSystemMessage.searchNoData());
		}
		return result;		
	}
	
	public DefaultResult<List<T>> selectListByParams(Map<String, Object> paramMap) throws ServiceException {
		if (MapUtils.isEmpty(paramMap)) {
			throw new ServiceException(BaseSystemMessage.parameterIncorrect());
		}
		DefaultResult<List<T>> result = new DefaultResult<>();
		List<T> value = this.getBaseMapper().selectListByParams(paramMap);
		if (value != null) {
			result.setValue(value);
		} else {
			result.setMessage(BaseSystemMessage.searchNoData());
		}
		return result;
	}
	
	private void setReservedParamOrderBy(Map<String, Object> paramMap, String orderBy, String sortType) throws ServiceException {
		if (!StringUtils.isBlank(sortType) && !StringUtils.isBlank(orderBy)) {
			if (!SortType.isAllow(sortType)) {
				throw new ServiceException( BaseSystemMessage.parameterIncorrect() + " sort type error!");
			}			
			if (paramMap.get(Constants.RESERVED_PARAM_NAME_QUERY_ORDER_BY) != null) {
				logger.warn("has found orderBy value: {} , replace to: {}", paramMap.get(Constants.RESERVED_PARAM_NAME_QUERY_ORDER_BY), orderBy);
			}
			if (paramMap.get(Constants.RESERVED_PARAM_NAME_QUERY_SORT_TYPE) != null) {
				logger.warn("has found sortType value: {} , replace to: {}", paramMap.get(Constants.RESERVED_PARAM_NAME_QUERY_SORT_TYPE), sortType);
			}
			paramMap.put(Constants.RESERVED_PARAM_NAME_QUERY_ORDER_BY, orderBy);
			paramMap.put(Constants.RESERVED_PARAM_NAME_QUERY_SORT_TYPE, sortType);
		}		
	}
	
	public DefaultResult<List<T>> selectList(String orderBy, String sortType) throws ServiceException {
		Map<String, Object> paramMap = new HashMap<>();
		this.setReservedParamOrderBy(paramMap, orderBy, sortType);
		return this.selectListByParams(paramMap);
	}	
	
	public DefaultResult<List<T>> selectListByParams(Map<String, Object> paramMap, String orderBy, String sortType) throws ServiceException {
		if (MapUtils.isEmpty(paramMap)) {
			throw new ServiceException(BaseSystemMessage.parameterIncorrect());
		}
		this.setReservedParamOrderBy(paramMap, orderBy, sortType);
		return this.selectListByParams(paramMap);
	}
	
	public DefaultResult<T> selectByUniqueKey(T mapperObj) throws ServiceException {
		if (null == mapperObj) {
			throw new ServiceException(BaseSystemMessage.objectNull());
		}
		Map<String, Object> paramMap = EntityParameterGenerateUtil.getUKParameter(mapperObj);
		if (MapUtils.isEmpty(paramMap)) {
			throw new ServiceException(BaseSystemMessage.parameterIncorrect() + " , please set @EntityUK.");
		}
		List<T> searchList = this.getBaseMapper().selectListByParams(paramMap);
		if (null != searchList && searchList.size() > 1) {
			throw new ServiceException(BaseSystemMessage.dataErrors());
		}
		T value = null;
		if (searchList != null && searchList.size() == 1) {
			value = searchList.get(0);
		}
		DefaultResult<T> result = new DefaultResult<>();
		if (value != null) {
			result.setValue(value);
		} else {
			result.setMessage(BaseSystemMessage.searchNoData());
		}
		return result;
	}
	
	public DefaultResult<T> insert(T mapperObj) throws ServiceException {
		if (null == mapperObj) {
			throw new ServiceException(BaseSystemMessage.objectNull());
		}
		DefaultResult<T> result = new DefaultResult<>();
		if (EntityParameterGenerateUtil.foundUniqueKey(mapperObj) && (this.countByUK(mapperObj) > 0)) {
			throw new ServiceException(BaseSystemMessage.dataIsExist());
		}
		this.setEntityPrimaryKey(mapperObj);
		this.setEntityCreateUserField(mapperObj);
		if (this.getBaseMapper().insert(mapperObj) < 1) {
			throw new ServiceException(BaseSystemMessage.insertFail());
		}
		result.setSuccess( YesNoKeyProvide.YES );
		result.setValue(mapperObj);
		result.setMessage(BaseSystemMessage.insertSuccess());
		return result;
	}
	
	public DefaultResult<T> update(T mapperObj) throws ServiceException {
		if (null == mapperObj) {
			throw new ServiceException(BaseSystemMessage.objectNull());
		}
		DefaultResult<T> result = new DefaultResult<>();
		this.setEntityUpdateField(mapperObj);
		if (this.getBaseMapper().update(mapperObj) < 1) {
			throw new ServiceException(BaseSystemMessage.updateFail());
		}
		result.setSuccess( YesNoKeyProvide.YES );
		result.setValue(mapperObj);
		result.setMessage(BaseSystemMessage.updateSuccess());
		return result;
	}
	
	public DefaultResult<Boolean> delete(T mapperObj) throws ServiceException {
		if (null == mapperObj) {
			throw new ServiceException(BaseSystemMessage.objectNull());
		}
		DefaultResult<Boolean> result = new DefaultResult<>();
		if (Boolean.FALSE.equals(this.getBaseMapper().delete(mapperObj))) {
			throw new ServiceException(BaseSystemMessage.deleteFail());
		}
		result.setValue(true);
		result.setMessage(BaseSystemMessage.deleteSuccess());
		return result;
	}
	
	public Long count(Map<String, Object> paramMap) throws ServiceException {
		return this.getBaseMapper().count(paramMap);
	}
	
	public Long countByUK(T mapperObj) throws ServiceException {
		if (null == mapperObj) {
			throw new ServiceException(BaseSystemMessage.objectNull());
		}
		Map<String, Object> paramMap = EntityParameterGenerateUtil.getUKParameter(mapperObj);
		if (MapUtils.isEmpty(paramMap)) {
			throw new ServiceException(BaseSystemMessage.parameterIncorrect() + " , please set @EntityUK.");
		}
		return this.getBaseMapper().count(paramMap);
	}	
	
	public <V> QueryResult<List<V>> findPage(Map<String, Object> paramMap, PageOf pageOf) throws ServiceException {
		if (null == paramMap || null == pageOf) {
			throw new ServiceException(BaseSystemMessage.objectNull());
		}
		pageOf.setQueryOrderSortParameter(paramMap);
		QueryResult<List<V>> result = new QueryResult<>();
		Long countSize = this.getBaseMapper().count(paramMap);
		if (countSize > 0) {
			this.fillPageOfAndfindPageParam(paramMap, pageOf, countSize);
			List<V> searchList = (List<V>) this.getBaseMapper().findPage(paramMap);
			result.setValue(searchList);
		} else {
			result.setMessage(BaseSystemMessage.searchNoData());
		}
		return result;
	}
	
	@SuppressWarnings("unchecked")
	public <V> QueryResult<List<V>> findPage(String mapperCountMethodName, String mapperQueryMethodName, Map<String, Object> paramMap, PageOf pageOf) throws ServiceException, OgnlException {
		if (null == paramMap || null == pageOf) {
			throw new ServiceException(BaseSystemMessage.objectNull());
		}
		pageOf.setQueryOrderSortParameter(paramMap);	
		QueryResult<List<V>> result = new QueryResult<>();
		OgnlContext ognlContext = Ognl.createDefaultContext(null);
		ognlContext.put("paramMap", paramMap);
		Object countSizeObj = Ognl.getValue(mapperCountMethodName+"(#paramMap)", ognlContext, this.getBaseMapper());
		if (!(countSizeObj instanceof Long)) {
			throw new ServiceException("count method:" + mapperCountMethodName + " return value not accept!");
		}
		Long countSize = Long.parseLong( String.valueOf(countSizeObj) );
		if (countSize > 0) {
			this.fillPageOfAndfindPageParam(paramMap, pageOf, countSize);
			Object searchListObj = Ognl.getValue(mapperQueryMethodName+"(#paramMap)", ognlContext, this.getBaseMapper());
			if (!(searchListObj instanceof List)) {
				throw new IllegalArgumentException("findPage method:" + mapperQueryMethodName + " return value not accept!");
			}
			result.setValue( (List<V>) searchListObj );
		} else {
			result.setMessage(BaseSystemMessage.searchNoData());
		}
		return result;
	}	
	
	private void fillPageOfAndfindPageParam(Map<String, Object> paramMap, PageOf pageOf, Long countSize) {
		long startRow = (pageOf.getIntegerValue( pageOf.getSelect() )-1) * pageOf.getLongValue( pageOf.getShowRow() );
		long endRow = pageOf.getIntegerValue( pageOf.getSelect() ) * pageOf.getLongValue( pageOf.getShowRow() );
		long offset = startRow;
		long showRow = pageOf.getIntegerValue( pageOf.getShowRow() );
		if (startRow < 0) {
			startRow = 0;
		}
		if (startRow > 0) {
			startRow = startRow + 1;
		}
		if (endRow <= startRow) {
			endRow = startRow + pageOf.getIntegerValue( pageOf.getShowRow() );
		}
		if (startRow > countSize) {
			startRow = 0;
			endRow = 1L * pageOf.getLongValue( pageOf.getShowRow() );
			offset = 0;
			showRow = 1L * pageOf.getLongValue( pageOf.getShowRow() );
		}			
		if (endRow > countSize) {
			endRow = countSize;
		}
		paramMap.put("startRow", startRow); // 資料庫要放 Long (以前qifu2用的) Oracle
		paramMap.put("endRow", endRow); // 資料庫要放 Long (以前qifu2用的) Oracle
		paramMap.put("offsetRow", offset); // for MySQL or MariaDB
		paramMap.put("showRow", showRow); // for MySQL or MariaDB
		
		pageOf.setCountSize(String.valueOf(countSize));
		pageOf.toCalculateSize((int)startRow);
	}
	
}
````

### `backend/base/src/main/java/org/qifu/base/service/IBaseService.java`

- Purpose: Service interface; declares interface IBaseService; has 14 detected methods; depends on 4 org.qifu local types
- Package: `org.qifu.base.service`
- Role: Service interface
- Main types: `interface IBaseService <T extends java.io.Serializable, K extends java.io.Serializable>`
- Local dependencies: `org.qifu.base.exception.ServiceException`, `org.qifu.base.model.DefaultResult`, `org.qifu.base.model.PageOf`, `org.qifu.base.model.QueryResult`
- Third-party dependencies: `ognl.OgnlException`
- Main methods:
  - L42 `public DefaultResult<T> selectByPrimaryKey(K pk)`
  - L44 `public DefaultResult<T> selectByEntityPrimaryKey(T mapperObj)`
  - L46 `public DefaultResult<List<T>> selectList()`
  - L48 `public DefaultResult<List<T>> selectListByParams(Map<String, Object> paramMap)`
  - L50 `public DefaultResult<List<T>> selectList(String orderBy, String sortType)`
  - L52 `public DefaultResult<List<T>> selectListByParams(Map<String, Object> paramMap, String orderBy, String sortType)`
  - L54 `public DefaultResult<T> selectByUniqueKey(T mapperObj)`
  - L56 `public DefaultResult<T> insert(T mapperObj)`
  - L58 `public DefaultResult<T> update(T mapperObj)`
  - L60 `public DefaultResult<Boolean> delete(T mapperObj)`
  - L62 `public Long count(Map<String, Object> paramMap)`
  - L64 `public Long countByUK(T mapperObj)`
  - L66 `public <V> QueryResult<List<V>> findPage(Map<String, Object> paramMap, PageOf pageOf)`
  - L68 `public <V> QueryResult<List<V>> findPage(String mapperCountMethodName, String mapperQueryMethodName, Map<String, Object> paramMap, PageOf pageOf)`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\service\IBaseService.java`
- Size: 2660 bytes

#### Source

````java
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
package org.qifu.base.service;

import java.util.List;
import java.util.Map;

import org.qifu.base.exception.ServiceException;
import org.qifu.base.model.DefaultResult;
import org.qifu.base.model.PageOf;
import org.qifu.base.model.QueryResult;

import ognl.OgnlException;

/**
 * @param <T>	MyBatis Entity
 * @param <K>	PK屬性
 */
public interface IBaseService<T extends java.io.Serializable, K extends java.io.Serializable> {	
	
	public String defaultString(String source);
	
	public DefaultResult<T> selectByPrimaryKey(K pk) throws ServiceException;
	
	public DefaultResult<T> selectByEntityPrimaryKey(T mapperObj) throws ServiceException;
	
	public DefaultResult<List<T>> selectList() throws ServiceException;
	
	public DefaultResult<List<T>> selectListByParams(Map<String, Object> paramMap) throws ServiceException;
	
	public DefaultResult<List<T>> selectList(String orderBy, String sortType) throws ServiceException;
	
	public DefaultResult<List<T>> selectListByParams(Map<String, Object> paramMap, String orderBy, String sortType) throws ServiceException;
	
	public DefaultResult<T> selectByUniqueKey(T mapperObj) throws ServiceException;
	
	public DefaultResult<T> insert(T mapperObj) throws ServiceException;
	
	public DefaultResult<T> update(T mapperObj) throws ServiceException;
	
	public DefaultResult<Boolean> delete(T mapperObj) throws ServiceException;
	
	public Long count(Map<String, Object> paramMap) throws ServiceException;
	
	public Long countByUK(T mapperObj) throws ServiceException;	
	
	public <V> QueryResult<List<V>> findPage(Map<String, Object> paramMap, PageOf pageOf) throws ServiceException;
	
	public <V> QueryResult<List<V>> findPage(String mapperCountMethodName, String mapperQueryMethodName, Map<String, Object> paramMap, PageOf pageOf) throws ServiceException, OgnlException;
	
}
````

### `backend/base/src/main/java/org/qifu/base/service/IBaseServiceCustomPrimaryKeyProvide.java`

- Purpose: Service interface; declares interface IBaseServiceCustomPrimaryKeyProvide
- Package: `org.qifu.base.service`
- Role: Service interface
- Main types: `interface IBaseServiceCustomPrimaryKeyProvide <T extends java.io.Serializable, K extends java.io.Serializable>`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\service\IBaseServiceCustomPrimaryKeyProvide.java`
- Size: 1122 bytes

#### Source

````java
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
package org.qifu.base.service;

/**
 * @param <T>	MyBatis Entity
 * @param <K>	PK屬性
 */
public interface IBaseServiceCustomPrimaryKeyProvide<T extends java.io.Serializable, K extends java.io.Serializable> {
	
	// 自訂義主鍵值生成方法, 給 BaseService 呼叫.
	public K generateCustomPrimaryKey();
	
}
````

### `backend/base/src/main/java/org/qifu/base/support/TokenStore.java`

- Purpose: Java class; declares interface TokenStore
- Package: `org.qifu.base.support`
- Role: Java class
- Main types: `interface TokenStore`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\support\TokenStore.java`
- Size: 219 bytes

#### Source

````java
package org.qifu.base.support;

import java.util.Date;

public interface TokenStore {
	
	public void save(String refreshToken, String accessToken, String userId, Date expiresDate, Date refreshExpiresDate);
	
}
````

### `backend/base/src/main/java/org/qifu/base/support/TokenStoreBuilder.java`

- Purpose: Java class; declares class TokenStoreBuilder; has 2 detected methods
- Package: `org.qifu.base.support`
- Role: Java class
- Main types: `class TokenStoreBuilder implements TokenStore`
- Key annotations: `Override`
- Spring dependencies: `org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate`
- Main methods:
  - L17 `public TokenStoreBuilder build(DataSource dataSource)`
  - L26 `public void save(String refreshToken, String accessToken, String userId, Date expiresDate, Date refreshExpiresDate)`
- Main fields:
  - L13 `DataSource dataSource`
  - L15 `String insertSql`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\support\TokenStoreBuilder.java`
- Size: 1333 bytes

#### Source

````java
package org.qifu.base.support;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class TokenStoreBuilder implements TokenStore {
	
	private DataSource dataSource;
	
	private static String insertSql = "insert into " + TokenStoreConfig.getTableName() + "(OID, USER_ID, TOKEN, EXPIRES_DATE, RF_EXPIRES_DATE, CDATE) values(:refreshToken, :userId, :accessToken, :expiresDate, :rfExpiresDate, :cdate)";
	
	public static TokenStoreBuilder build(DataSource dataSource) {
		return new TokenStoreBuilder(dataSource);
	}
	
	public TokenStoreBuilder(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	@Override
	public void save(String refreshToken, String accessToken, String userId, Date expiresDate, Date refreshExpiresDate) {
		NamedParameterJdbcTemplate jdbcTemplate = new NamedParameterJdbcTemplate(this.dataSource);
		Map<String, Object> param = new HashMap<>();
		param.put("refreshToken", refreshToken);
		param.put("userId", userId);
		param.put("accessToken", accessToken);
		param.put("expiresDate", expiresDate);
		param.put("rfExpiresDate", refreshExpiresDate);
		param.put("cdate", new Date());
		jdbcTemplate.update(insertSql, param);
	}
	
}
````

### `backend/base/src/main/java/org/qifu/base/support/TokenStoreConfig.java`

- Purpose: Java class; declares class TokenStoreConfig; has 1 detected methods; depends on 1 org.qifu local types
- Package: `org.qifu.base.support`
- Role: Java class
- Main types: `class TokenStoreConfig`
- Local dependencies: `org.qifu.util.LoadResources`
- Main methods:
  - L24 `public String getTableName()`
- Main fields:
  - L10 `Map<String, String> configMap`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\support\TokenStoreConfig.java`
- Size: 615 bytes

#### Source

````java
package org.qifu.base.support;

import java.util.HashMap;
import java.util.Map;

import org.qifu.util.LoadResources;

public class TokenStoreConfig {
	
	private static Map<String, String> configMap;
	
	protected TokenStoreConfig() {
		throw new IllegalStateException("static model class: TokenStoreConfig");
	}
	
	static {
		try {
			configMap = LoadResources.objectMapperReadValue("token-store-config.json", HashMap.class, TokenStoreConfig.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String getTableName() {
		return configMap.get("table");
	}
	
}
````

### `backend/base/src/main/java/org/qifu/base/support/TokenStoreValidate.java`

- Purpose: Java class; declares interface TokenStoreValidate
- Package: `org.qifu.base.support`
- Role: Java class
- Main types: `interface TokenStoreValidate`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\support\TokenStoreValidate.java`
- Size: 417 bytes

#### Source

````java
package org.qifu.base.support;

public interface TokenStoreValidate {
	
	public boolean refreshValidate(String refreshTokenOrOID);
	
	public String getUserIdByRefreshToken(String refreshTokenOrOID);
	
	public boolean accessValidate(String accessToken);
	
	public boolean refreshValidate(String refreshTokenOrOID, String userId);
	
	public boolean accessValidate(String accessToken, String userId);
	
}
````

### `backend/base/src/main/java/org/qifu/base/support/TokenStoreValidateBuilder.java`

- Purpose: Java class; declares class TokenStoreValidateBuilder; has 6 detected methods
- Package: `org.qifu.base.support`
- Role: Java class
- Main types: `class TokenStoreValidateBuilder implements TokenStoreValidate`
- Key annotations: `Override`
- Spring dependencies: `org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate`
- Main methods:
  - L30 `public TokenStoreValidateBuilder build(DataSource dataSource)`
  - L39 `public boolean refreshValidate(String refreshTokenOrOID)`
  - L49 `public String getUserIdByRefreshToken(String refreshTokenOrOID)`
  - L60 `public boolean accessValidate(String accessToken)`
  - L70 `public boolean refreshValidate(String refreshTokenOrOID, String userId)`
  - L81 `public boolean accessValidate(String accessToken, String userId)`
- Main fields:
  - L14 `DataSource dataSource`
  - L16 `String CURRENT_DATE_PARAM`
  - L18 `String HEAD_COUNT_COMMAND`
  - L20 `String refreshValidateSql`
  - L22 `String findUserIdByRefreshSql`
  - L24 `String accessValidateSql`
  - L26 `String refreshValidateWithUserIdSql`
  - L28 `String accessValidateWithUserIdSql`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\support\TokenStoreValidateBuilder.java`
- Size: 3970 bytes

#### Source

````java
package org.qifu.base.support;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class TokenStoreValidateBuilder implements TokenStoreValidate {
	
	private DataSource dataSource;
	
	private static final String CURRENT_DATE_PARAM = "currDate";
	
	private static final String HEAD_COUNT_COMMAND = "select count(*) from ";
	
	private final String refreshValidateSql = HEAD_COUNT_COMMAND + TokenStoreConfig.getTableName() + " where OID = :refreshTokenOrOID and RF_EXPIRES_DATE > :currDate ";
	
	private final String findUserIdByRefreshSql = "select USER_ID from " + TokenStoreConfig.getTableName() + " where OID = :refreshTokenOrOID and RF_EXPIRES_DATE > :currDate ";
	
	private final String accessValidateSql = HEAD_COUNT_COMMAND + TokenStoreConfig.getTableName() + " where TOKEN = :accessToken and EXPIRES_DATE > :currDate ";
	
	private final String refreshValidateWithUserIdSql = HEAD_COUNT_COMMAND + TokenStoreConfig.getTableName() + " where OID = :refreshTokenOrOID and USER_ID = :userId and RF_EXPIRES_DATE > :currDate ";
	
	private final String accessValidateWithUserIdSql = HEAD_COUNT_COMMAND + TokenStoreConfig.getTableName() + " where TOKEN = :accessToken and USER_ID = :userId and EXPIRES_DATE > :currDate ";	
	
	public static TokenStoreValidateBuilder build(DataSource dataSource) {
		return new TokenStoreValidateBuilder(dataSource);
	}
	
	public TokenStoreValidateBuilder(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	@Override
	public boolean refreshValidate(String refreshTokenOrOID) {
		Date currDate = new Date();
		Map<String, Object> param = new HashMap<>();
		param.put("refreshTokenOrOID", refreshTokenOrOID);
		param.put(CURRENT_DATE_PARAM, currDate);
		NamedParameterJdbcTemplate jdbcTemplate = new NamedParameterJdbcTemplate(this.dataSource);
		return (jdbcTemplate.queryForObject(refreshValidateSql, param, Integer.class) > 0);
	}
	
	@Override
	public String getUserIdByRefreshToken(String refreshTokenOrOID) {
		Date currDate = new Date();
		Map<String, Object> param = new HashMap<>();
		param.put("refreshTokenOrOID", refreshTokenOrOID);
		param.put(CURRENT_DATE_PARAM, currDate);
		NamedParameterJdbcTemplate jdbcTemplate = new NamedParameterJdbcTemplate(this.dataSource);
		List<String> list = jdbcTemplate.queryForList(findUserIdByRefreshSql, param, String.class);
		return (list.size() > 0) ? list.get(0) : null;
	}

	@Override
	public boolean accessValidate(String accessToken) {
		Date currDate = new Date();
		Map<String, Object> param = new HashMap<>();
		param.put("accessToken", accessToken);
		param.put(CURRENT_DATE_PARAM, currDate);
		NamedParameterJdbcTemplate jdbcTemplate = new NamedParameterJdbcTemplate(this.dataSource);
		return (jdbcTemplate.queryForObject(accessValidateSql, param, Integer.class) > 0);
	}

	@Override
	public boolean refreshValidate(String refreshTokenOrOID, String userId) {
		Date currDate = new Date();
		Map<String, Object> param = new HashMap<>();
		param.put("refreshTokenOrOID", refreshTokenOrOID);
		param.put("userId", userId);
		param.put(CURRENT_DATE_PARAM, currDate);
		NamedParameterJdbcTemplate jdbcTemplate = new NamedParameterJdbcTemplate(this.dataSource);
		return (jdbcTemplate.queryForObject(refreshValidateWithUserIdSql, param, Integer.class) > 0);
	}

	@Override
	public boolean accessValidate(String accessToken, String userId) {
		Date currDate = new Date();
		Map<String, Object> param = new HashMap<>();
		param.put("accessToken", accessToken);
		param.put("userId", userId);
		param.put(CURRENT_DATE_PARAM, currDate);
		NamedParameterJdbcTemplate jdbcTemplate = new NamedParameterJdbcTemplate(this.dataSource);
		return (jdbcTemplate.queryForObject(accessValidateWithUserIdSql, param, Integer.class) > 0);
	}
	
}
````

### `backend/base/src/main/java/org/qifu/base/SysMsgConstants.java`

- Purpose: Java class; declares class SysMsgConstants
- Package: `org.qifu.base`
- Role: Java class
- Main types: `class SysMsgConstants`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\SysMsgConstants.java`
- Size: 3163 bytes

#### Source

````java
/* 
 * Copyright 2012-2017 qifu of copyright Chen Xin Nien
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
package org.qifu.base;

public class SysMsgConstants {
	
	protected SysMsgConstants() {
		throw new IllegalStateException("static model class: SysMsgConstants");
	}
	
	// ?_BSE_? B=base S=system E=error 
	// ?_UOS_? UO=user-operation S=status-msg
	// ?_STD_? standard message
	// ?_DOS_? DO=data-operation S=status-msg
	
	// system error message
	public static final String NO_PERMISSION="MSG_BSE0001"; // No permission!
	
	
	public static final String NO_LOGIN_ACCESS_DENIED="MSG_BSE0002"; // No sign-on system access denied!
	//public static final String DOZER_MAPPER_ID_BLANK = "MSG_BSE0003"; // error. dozer mapper id blank!
	
	// service or controller operation error message
	public static final String PARAMS_BLANK = "MSG_UOS0001"; // parameter cann't blank!
	public static final String PARAMS_INCORRECT = "MSG_UOS0002"; // parameter is incorrect
	public static final String OBJ_NULL = "MSG_UOS0003"; // object null!
	public static final String CONTROLLER_TRY_AGAIN = "MSG_UOS0004"; // Please try again!
	
	// data operation message
	public static final String DATA_NO_EXIST = "MSG_DOS0001"; // data no exist!
	public static final String DATA_IS_EXIST = "MSG_DOS0002"; // data is exist!
	public static final String UPDATE_SUCCESS = "MSG_DOS0003"; // update data success!
	public static final String UPDATE_FAIL = "MSG_DOS0004"; // update data fail!
	public static final String INSERT_SUCCESS = "MSG_DOS0005"; // insert data success!
	public static final String INSERT_FAIL = "MSG_DOS0006"; // insert data fail!
	public static final String DELETE_SUCCESS = "MSG_DOS0007"; // delete data success!
	public static final String DELETE_FAIL = "MSG_DOS0008"; // delete data fail!
	public static final String SEARCH_NO_DATA = "MSG_DOS0009"; // search no data!
	public static final String DATA_CANNOT_DELETE = "MSG_DOS0010"; // Data to be used, and can not be deleted!
	
	// standard message
	public static final String LOGIN_FAIL = "MSG_STD0001"; // Login fail!
	public static final String UPLOAD_FILE_TYPE_ERROR = "MSG_STD0002"; // Upload a file type error!
	public static final String UPLOAD_FILE_NO_SELECT="MSG_STD0003"; // Please select a file!
	public static final String UPLOAD_FILE_ONLY_IMAGE="MSG_STD0004"; // Please upload a image file!
	public static final String DATA_ERRORS = "MSG_STD0005"; // Data errors!
	
}
````

### `backend/base/src/main/java/org/qifu/base/util/BaseApiSupport.java`

- Purpose: Utility; declares class BaseApiSupport; has 12 detected methods; depends on 7 org.qifu local types
- Package: `org.qifu.base.util`
- Role: Utility
- Main types: `class BaseApiSupport extends YesNo`
- Local dependencies: `org.qifu.base.exception.ControllerException`, `org.qifu.base.message.BaseSystemMessage`, `org.qifu.base.model.DefaultControllerJsonResultObj`, `org.qifu.base.model.QueryParamBuilder`, `org.qifu.base.model.QueryResult`, `org.qifu.base.model.SearchBody`, `org.qifu.base.model.YesNo`
- Main methods:
  - L36 `protected QueryParamBuilder queryParameter()`
  - L40 `protected QueryParamBuilder queryParameter(SearchBody searchBody)`
  - L44 `protected <T> DefaultControllerJsonResultObj<T> initDefaultJsonResult()`
  - L53 `protected <T> QueryResult<T> initResult()`
  - L59 `protected <T> void initResult(QueryResult<T> result)`
  - L70 `protected <T> void successResult(DefaultControllerJsonResultObj<T> result)`
  - L77 `protected <T> void successResult(QueryResult<T> result)`
  - L84 `protected <T> void successResult(QueryResult<T> result, T value)`
  - L92 `protected <T> void noSuccessResult(QueryResult<T> result)`
  - L99 `protected <T> void noSuccessResult(QueryResult<T> result, String message)`
  - L107 `protected <T> void noSuccessResult(QueryResult<T> result, Exception e)`
  - L111 `protected void exceptionResult(DefaultControllerJsonResultObj<?> result, Exception e)`
- Main fields:
  - L34 `long serialVersionUID`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\util\BaseApiSupport.java`
- Size: 3373 bytes

#### Source

````java
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

	protected QueryParamBuilder queryParameter() {
		return QueryParamBuilder.build();
	}
	
	protected QueryParamBuilder queryParameter(SearchBody searchBody) {
		return QueryParamBuilder.build(searchBody);
	}	
	
	protected <T> DefaultControllerJsonResultObj<T> initDefaultJsonResult() {
		DefaultControllerJsonResultObj<T> r = new DefaultControllerJsonResultObj<>();
		if (UserLocalUtils.getUserInfo() != null) {
			r.setIsAuth(YES);
			r.setLogin(YES);
		}
		return r;
	}
	
	protected <T> QueryResult<T> initResult() {
		QueryResult<T> result = new QueryResult<>();
		this.initResult(result);
		return result;
	}
	
	protected <T> void initResult(QueryResult<T> result) {
		if (result == null) {
			return;
		}
		result.setIsAuth(NO);
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
		this.noSuccessResult(result, ( (e != null && e.getMessage() !=null) ? e.getMessage() : BaseSystemMessage.objectNull() ));		
	}	
	
	protected void exceptionResult(DefaultControllerJsonResultObj<?> result, Exception e) {
		e.printStackTrace();
		result.setMessage( e.getMessage() );
		result.setSuccess( ControllerException.PAGE_EXCEPTION_CODE );
	}
	
}

````

### `backend/base/src/main/java/org/qifu/base/util/EntityParameterGenerateUtil.java`

- Purpose: Utility; declares class EntityParameterGenerateUtil; has 9 detected methods; depends on 8 org.qifu local types
- Package: `org.qifu.base.util`
- Role: Utility
- Main types: `class EntityParameterGenerateUtil`
- Local dependencies: `org.qifu.base.model.CreateDateField`, `org.qifu.base.model.CreateField`, `org.qifu.base.model.CreateUserField`, `org.qifu.base.model.EntityPK`, `org.qifu.base.model.EntityUK`, `org.qifu.base.model.UpdateDateField`, `org.qifu.base.model.UpdateField`, `org.qifu.base.model.UpdateUserField`
- Main methods:
  - L46 `public Map<String, Object> createParamMap(String paramName, String value)`
  - L52 `public boolean foundUniqueKey(Object entityObject)`
  - L72 `public Map<String, Object> getUKParameter(Object entityObject)`
  - L88 `private void fillUKParameterParam(Object entityObject, Annotation[] annotations, Method[] methods, Map<String, Object> ukMap, int methodIndex)`
  - L107 `public Map<String, Object> getPKParameter(Object entityObject)`
  - L123 `private void fillPKParameterParam(Object entityObject, Annotation[] annotations, Method[] methods, Map<String, Object> ukMap, int methodIndex)`
  - L142 `public EntityPK getPrimaryKeyField(Object entityObject)`
  - L162 `public UpdateField getUpdateField(Object entityObject)`
  - L185 `public CreateField getCreateField(Object entityObject)`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\util\EntityParameterGenerateUtil.java`
- Size: 7003 bytes

#### Source

````java
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

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.qifu.base.model.CreateDateField;
import org.qifu.base.model.CreateField;
import org.qifu.base.model.CreateUserField;
import org.qifu.base.model.EntityPK;
import org.qifu.base.model.EntityUK;
import org.qifu.base.model.UpdateDateField;
import org.qifu.base.model.UpdateField;
import org.qifu.base.model.UpdateUserField;

public class EntityParameterGenerateUtil {
	
	private EntityParameterGenerateUtil() {
		throw new IllegalStateException("Utility class: EntityParameterGenerateUtil");
	}
	
	public static Map<String, Object> createParamMap(String paramName, String value) {
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put(paramName, value);
		return paramMap;
	}
	
	public static boolean foundUniqueKey(Object entityObject) {
		Method[] methods = entityObject.getClass().getMethods();
		if (methods==null) {
			return false;
		}
		boolean found = false;
		for (int ix = 0; ix < methods.length && !found; ix++) {
			Annotation[] annotations = methods[ix].getDeclaredAnnotations();
			if (annotations == null) {
				continue;
			}
			for(Annotation annotation : annotations) {
				if(annotation instanceof EntityUK) {
					found = true;
				}
			}
		}
		return found;
	}
	
	public static Map<String, Object> getUKParameter(Object entityObject) {
		Method[] methods=entityObject.getClass().getMethods();
		if (methods==null) {
			return Collections.emptyMap();
		}
		Map<String, Object> ukMap=new HashMap<>();
		for (int ix=0; ix<methods.length; ix++) {
			Annotation[] annotations=methods[ix].getDeclaredAnnotations();
			if (annotations==null) {
				continue;
			}
			fillUKParameterParam(entityObject, annotations, methods, ukMap, ix);
		}		
		return ukMap;
	}	
	
	private static void fillUKParameterParam(Object entityObject, Annotation[] annotations, Method[] methods, Map<String, Object> ukMap, int methodIndex) {
		for(Annotation annotation : annotations) {
			if(!(annotation instanceof @SuppressWarnings("unused") EntityUK enuk &&  (methods[methodIndex].getName().indexOf("get")==0))) {
				continue;
			}
			boolean r = true;
			for (int nx=0; r && nx<annotations.length; nx++) {
				if (annotations[nx] instanceof @SuppressWarnings("unused") EntityUK euk) {
					try {
						ukMap.put(((EntityUK)annotations[nx]).name(), methods[methodIndex].invoke(entityObject));
						r = false;
					} catch (IllegalArgumentException | IllegalAccessException | InvocationTargetException e) {
						e.printStackTrace();
					}							
				}
			}
		}		
	}
	
	public static Map<String, Object> getPKParameter(Object entityObject) {
		Method[] methods=entityObject.getClass().getMethods();
		if (methods==null) {
			return Collections.emptyMap();
		}
		Map<String, Object> ukMap=new HashMap<>();
		for (int ix=0; ix<methods.length; ix++) {
			Annotation[] annotations=methods[ix].getDeclaredAnnotations();
			if (annotations==null) {
				continue;
			}
			fillPKParameterParam(entityObject, annotations, methods, ukMap, ix);
		}		
		return ukMap;
	}	
	
	private static void fillPKParameterParam(Object entityObject, Annotation[] annotations, Method[] methods, Map<String, Object> ukMap, int methodIndex) {
		for(Annotation annotation : annotations) {
			if(!(annotation instanceof @SuppressWarnings("unused") EntityPK enpk &&  (methods[methodIndex].getName().indexOf("get")==0))) {
				continue;
			}
			boolean r = true;
			for (int nx = 0; r && nx < annotations.length; nx++) {
				if (annotations[nx] instanceof @SuppressWarnings("unused") EntityPK epk) {
					try {
						ukMap.put(((EntityPK)annotations[nx]).name(), methods[methodIndex].invoke(entityObject));
						r = false;
					} catch (IllegalArgumentException | IllegalAccessException | InvocationTargetException e) {
						e.printStackTrace();
					}							
				}
			}
		}
	}
	
	public static EntityPK getPrimaryKeyField(Object entityObject) {
		Method[] methods=entityObject.getClass().getMethods();
		if (methods==null) {
			return null;
		}
		EntityPK field = null;
		for (int ix=0; ix<methods.length; ix++) {
			Annotation[] annotations=methods[ix].getDeclaredAnnotations();
			if (annotations==null) {
				continue;
			}
			for(Annotation annotation : annotations) {
				if(annotation instanceof @SuppressWarnings("unused") EntityPK epk) {
					field = ((EntityPK)annotation);			
				}
			}
		}
		return field;
	}		
	
	public static UpdateField getUpdateField(Object entityObject) {
		Method[] methods=entityObject.getClass().getMethods();
		if (methods==null) {
			return null;
		}
		UpdateField field = new UpdateField();
		for (int ix=0; ix<methods.length; ix++) {
			Annotation[] annotations=methods[ix].getDeclaredAnnotations();
			if (annotations==null) {
				continue;
			}
			for(Annotation annotation : annotations) {
				if (annotation instanceof @SuppressWarnings("unused") UpdateUserField uf) {
					field.setUpdateUserField( (UpdateUserField)annotation );					
				}
				if (annotation instanceof @SuppressWarnings("unused") UpdateDateField uf) {
					field.setUpdateDateField( (UpdateDateField)annotation );
				}
			}
		}
		return field;
	}	
	
	public static CreateField getCreateField(Object entityObject) {
		Method[] methods=entityObject.getClass().getMethods();
		if (methods==null) {
			return null;
		}
		CreateField field = new CreateField();
		for (int ix=0; ix<methods.length; ix++) {
			Annotation[] annotations=methods[ix].getDeclaredAnnotations();
			if (annotations==null) {
				continue;
			}
			for(Annotation annotation : annotations) {
				if (annotation instanceof @SuppressWarnings("unused") CreateUserField cf) {
					field.setCreateUserField( (CreateUserField)annotation );		
				}
				if (annotation instanceof @SuppressWarnings("unused") CreateDateField cf) {
					field.setCreateDateField( (CreateDateField)annotation );
				}
			}
		}
		return field;		
	}
	
}
````

### `backend/base/src/main/java/org/qifu/base/util/TokenBuilderUtils.java`

- Purpose: Utility; declares class TokenBuilderUtils; has 4 detected methods; depends on 5 org.qifu local types
- Package: `org.qifu.base.util`
- Role: Utility
- Main types: `class TokenBuilderUtils`
- Local dependencies: `org.qifu.base.Constants`, `org.qifu.base.model.TokenBuilderVariable`, `org.qifu.base.support.TokenStore`, `org.qifu.base.support.TokenStoreValidate`, `org.qifu.util.SimpleUtils`
- Third-party dependencies: `org.apache.commons.lang3.StringUtils`, `com.auth0.jwt.JWT`, `com.auth0.jwt.JWTVerifier`, `com.auth0.jwt.algorithms.Algorithm`, `com.auth0.jwt.exceptions.SignatureVerificationException`, `com.auth0.jwt.interfaces.Claim`, `com.auth0.jwt.interfaces.DecodedJWT`
- Main methods:
  - L50 `public boolean existsInfo(Map<String, Claim> claims)`
  - L57 `public boolean verifyRefresh(String refreshToken, TokenStoreValidate storeValidate)`
  - L61 `public Map<String, Claim> verifyToken(String token, TokenStoreValidate storeValidate)`
  - L80 `public TokenBuilderVariable createToken(String userId, String subject, String clientId, TokenStore store)`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\util\TokenBuilderUtils.java`
- Size: 4100 bytes

#### Source

````java
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

import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.qifu.base.Constants;
import org.qifu.base.model.TokenBuilderVariable;
import org.qifu.base.support.TokenStore;
import org.qifu.base.support.TokenStoreValidate;
import org.qifu.util.SimpleUtils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.SignatureVerificationException;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;

public class TokenBuilderUtils {
	
	protected TokenBuilderUtils() {
		throw new IllegalStateException("Utils class: TokenBuilderUtils");
	}
	
	public static boolean existsInfo(Map<String, Claim> claims) {
		if (null == claims) {
			return false;
		}
		return claims.get(Constants.TOKEN_USER_PARAM_NAME) != null;
	}
	
	public static boolean verifyRefresh(String refreshToken, TokenStoreValidate storeValidate ) {
		return storeValidate.refreshValidate(refreshToken);
	}
	
	public static Map<String, Claim> verifyToken(String token, TokenStoreValidate storeValidate ) {
		if (StringUtils.isBlank(token)) {
			return Collections.emptyMap();
		}
		DecodedJWT jwt = null;
		try {
			if (!storeValidate.accessValidate(token)) {
				return Collections.emptyMap();
			}
			JWTVerifier verifier = JWT.require(Algorithm.HMAC256(Constants.TOKEN_SECRET)).withIssuer(Constants.TOKEN_ISSUER).build();
			jwt = verifier.verify(token);
		} catch (SignatureVerificationException sve) {
			sve.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (jwt != null && jwt.getClaims() != null) ? jwt.getClaims() : null;
	}	
	
	public static TokenBuilderVariable createToken(String userId, String subject, String clientId, TokenStore store) {
		Date iatDate = new Date();
		
	    // expire time
	    Calendar setTime1 = Calendar.getInstance();
	    Calendar setTime2 = Calendar.getInstance();
	    setTime1.add(Calendar.MINUTE, Constants.TOKEN_ACCESS_EXPIRED_INTERVAL);
	    setTime2.add(Calendar.MINUTE, Constants.TOKEN_REFRESH_EXPIRED_INTERVAL);
	    Date expiresDate1 = setTime1.getTime();
	    Date expiresDate2 = setTime2.getTime();	    
	    
	    // Header Message
	    Map<String, Object> headerMap = new HashMap<>();
	    headerMap.put("alg", "HS256");
	    headerMap.put("typ", "JWT");
	    
	    TokenBuilderVariable tbv = new TokenBuilderVariable();
	    
	    String token = JWT.create()
	    		.withHeader(headerMap)
	    		.withIssuer(Constants.TOKEN_ISSUER)
	    		.withAudience(clientId)
	    		.withSubject(subject)
	    		.withIssuedAt(iatDate)
	    		.withExpiresAt(expiresDate1)
	    		.withClaim(Constants.TOKEN_USER_PARAM_NAME, StringUtils.defaultString(userId))
	    		.withClaim("currentTimeMillis", String.valueOf(System.currentTimeMillis()))
	    		.sign(Algorithm.HMAC256(Constants.TOKEN_SECRET));
	    tbv.setAccess(token);
	    tbv.setRefresh(SimpleUtils.getUUIDStr());
	    if (null != store) {
	    	store.save(tbv.getRefresh(), tbv.getAccess(), userId, expiresDate1, expiresDate2);
	    }
	    return tbv;
	}
	
}
````

### `backend/base/src/main/java/org/qifu/base/util/UserLocalUtils.java`

- Purpose: Utility; declares class UserLocalUtils; has 3 detected methods; depends on 1 org.qifu local types
- Package: `org.qifu.base.util`
- Role: Utility
- Main types: `class UserLocalUtils`
- Local dependencies: `org.qifu.base.model.IUserInfoProvide`
- Main methods:
  - L38 `public IUserInfoProvide getUserInfo()`
  - L42 `public void setUserInfo(IUserInfoProvide userInfo)`
  - L46 `public void remove()`
- Main fields:
  - L32 `ThreadLocal<IUserInfoProvide> userInfoThreadLocal`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\base\util\UserLocalUtils.java`
- Size: 1423 bytes

#### Source

````java
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

import org.qifu.base.model.IUserInfoProvide;

/**
 * Job使用者ThreadLocal
 * 
 */
public class UserLocalUtils {
	
	private static ThreadLocal<IUserInfoProvide> userInfoThreadLocal = new ThreadLocal<>();	
	
	protected UserLocalUtils() {
		throw new IllegalStateException("Utils class: UserLocalUtils");
	}

	public static IUserInfoProvide getUserInfo() {
		return userInfoThreadLocal.get();
	}

	public static void setUserInfo(IUserInfoProvide userInfo) {
		userInfoThreadLocal.set(userInfo);
	}
	
	public static void remove() {
		userInfoThreadLocal.remove();
	}
	
}
````

### `backend/base/src/main/java/org/qifu/util/DataUtils.java`

- Purpose: Utility; declares class DataUtils; has 10 detected methods; depends on 2 org.qifu local types
- Package: `org.qifu.util`
- Role: Utility
- Main types: `class DataUtils`
- Local dependencies: `org.qifu.base.AppContext`, `org.qifu.base.model.PleaseSelect`
- Spring dependencies: `org.springframework.beans.BeansException`, `org.springframework.jdbc.CannotGetJdbcConnectionException`, `org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate`, `org.springframework.jdbc.datasource.DataSourceUtils`
- Third-party dependencies: `org.apache.commons.lang3.ArrayUtils`, `ognl.OgnlException`
- Main methods:
  - L58 `public Connection getConnection(DataSource dataSource)`
  - L67 `public Connection getConnection(String dataSourceId)`
  - L78 `public void doReleaseConnection(String dataSourceId, Connection connection)`
  - L90 `public String[] getTables(Connection connection)`
  - L103 `public Map<String, Map<String, String>> getTableMetadata(Connection connection, String tableName)`
  - L120 `public NamedParameterJdbcTemplate getManualJdbcTemplate(DataSource dataSource)`
  - L124 `public NamedParameterJdbcTemplate getJdbcTemplate()`
  - L137 `public String[] getTablesWithDoReleaseConnection(String dataSourceId)`
  - L162 `public Map<String, String> getTablesWithDoReleaseConnection(String dataSourceId, boolean pleaseSelect)`
  - L174 `public Map<String, Map<String, String>> getTableMetadataWithDoReleaseConnection(String dataSourceId, String tableName)`
- Main fields:
  - L50 `String COLUMN_NAME`
  - L51 `String TYPE_NAME`
  - L52 `String COLUMN_SIZE`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\util\DataUtils.java`
- Size: 7515 bytes

#### Source

````java
/* 
 * Copyright 2012-2017 qifu of copyright Chen Xin Nien
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
package org.qifu.util;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.commons.lang3.ArrayUtils;
import org.qifu.base.AppContext;
import org.qifu.base.model.PleaseSelect;
import org.springframework.beans.BeansException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceUtils;

import ognl.OgnlException;

public class DataUtils {
	
	public static final String COLUMN_NAME = "COLUMN_NAME";
	public static final String TYPE_NAME = "TYPE_NAME";
	public static final String COLUMN_SIZE = "COLUMN_SIZE";
	
	protected DataUtils() {
		throw new IllegalStateException("Utils class: DataUtils");
	}
	
	public static Connection getConnection(DataSource dataSource) 
		throws CannotGetJdbcConnectionException {
		
		if (dataSource==null) {
			return null;
		}
		return DataSourceUtils.getConnection(dataSource);
	}
	
	public static Connection getConnection(String dataSourceId) {
		Connection conn = null;
		DataSource dataSource = (DataSource)AppContext.getContext().getBean(dataSourceId);
		try {
			conn = getConnection(dataSource);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return conn;
	}
	
	public static void doReleaseConnection(String dataSourceId, Connection connection) {
		if (null == connection) {
			return;
		}
		DataSource dataSource = (DataSource)AppContext.getContext().getBean(dataSourceId);
		try {
			DataSourceUtils.doReleaseConnection(connection, dataSource);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static String[] getTables(Connection connection) throws SQLException {
		DatabaseMetaData metaData = connection.getMetaData();
		String[] types = {"TABLE"};
		ResultSet rs = metaData.getTables(null, null, "%", types);
		List<String> tables = new LinkedList<>();
		while (rs.next()) {
			tables.add(rs.getString("TABLE_NAME"));
		}
		String[] names = new String[tables.size()];
		tables.toArray(names);		
		return names;
	}
	
	public static Map<String, Map<String, String>> getTableMetadata(Connection connection, String tableName) throws SQLException {
		Map<String, Map<String, String>> tableMetadatas = new LinkedHashMap<>();
		DatabaseMetaData metadata = connection.getMetaData();
		ResultSet resultSet = metadata.getColumns(null, null, tableName, null);
		while (resultSet.next()) {
			Map<String, String> metaDataMap = new LinkedHashMap<>();
			String name = resultSet.getString(COLUMN_NAME);
			String type = resultSet.getString(TYPE_NAME);
			int size = resultSet.getInt(COLUMN_SIZE);
			metaDataMap.put(COLUMN_NAME, name);
			metaDataMap.put(TYPE_NAME, type);
			metaDataMap.put(COLUMN_SIZE, Integer.toString(size));
			tableMetadatas.put(name, metaDataMap);
		}
		return tableMetadatas;
	}
	
	public static NamedParameterJdbcTemplate getManualJdbcTemplate(DataSource dataSource) {
		return new NamedParameterJdbcTemplate(dataSource);
	}
	
	public static NamedParameterJdbcTemplate getJdbcTemplate() throws BeansException {
		return (NamedParameterJdbcTemplate)AppContext.getBean("namedParameterJdbcTemplate");
	}	
	
	public static NamedParameterJdbcTemplate getManualJdbcTemplate(
			Class<?> dataSourceClass, String url, String user, String password) throws OgnlException, IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		return getManualJdbcTemplate( ManualDataSourceFactory.getDataSource(dataSourceClass, url, user, password) );
	}
	
	/**
	 * 排除系統表
	 * @throws SQLException 
	 */
	public static String[] getTablesWithDoReleaseConnection(String dataSourceId) throws SQLException {
		Connection connection = getConnection(dataSourceId);
		if (null == connection) {
			return new String[0];
		}
		DatabaseMetaData metaData = connection.getMetaData();
		if (null == metaData) {
			return new String[0];
		}
		String[] types = {"TABLE"};
		ResultSet rs = metaData.getTables(null, null, "%", types);
		List<String> tables = new ArrayList<>();
		while (rs.next()) {
			String tableName = rs.getString("TABLE_NAME");
			if (tableName.startsWith("tb_") || tableName.startsWith("TB_") || tableName.startsWith("act_") || tableName.indexOf("qrtz_") > -1) {
				continue;
			}
			tables.add(tableName);
		}
		String[] names = new String[tables.size()];
		tables.toArray(names);		
		doReleaseConnection(dataSourceId, connection);
		return names;
	}
	
	public static Map<String, String> getTablesWithDoReleaseConnection(String dataSourceId, boolean pleaseSelect) throws SQLException {
		String[] tables = getTablesWithDoReleaseConnection(dataSourceId);
		Map<String, String> dataMap = PleaseSelect.pageSelectMap(pleaseSelect);
		if (ArrayUtils.isEmpty(tables)) {
			return dataMap;
		}		
		for (int i = 0; i < tables.length; i++) {
			dataMap.put(tables[i], tables[i]);
		}
		return dataMap;
	}
	
	public static Map<String, Map<String, String>> getTableMetadataWithDoReleaseConnection(String dataSourceId, String tableName) throws SQLException {
		Map<String, Map<String, String>> tableMetadatas = new LinkedHashMap<>();
		Connection connection = getConnection(dataSourceId);
		if (null == connection) {
			return tableMetadatas;
		}
		DatabaseMetaData metadata = connection.getMetaData();
		if (null == metadata) {
			return tableMetadatas;
		}
		ResultSet resultSet = metadata.getColumns(null, null, tableName, null);
		while (resultSet.next()) {
			Map<String, String> metaDataMap = new HashMap<>();
			String name = resultSet.getString(COLUMN_NAME);
			String nametToLowerCase = name.toLowerCase();
			if (nametToLowerCase.equals("oid") || nametToLowerCase.equals("cuserid") || nametToLowerCase.equals("cdate")
					|| nametToLowerCase.equals("uuserid") || nametToLowerCase.equals("udate") ) { // 不顯示這5個欄位
				continue;
			}
			String type = resultSet.getString(TYPE_NAME);
			int size = resultSet.getInt(COLUMN_SIZE);
			metaDataMap.put(COLUMN_NAME, name);
			metaDataMap.put(TYPE_NAME, type);
			metaDataMap.put(COLUMN_SIZE, Integer.toString(size));
			tableMetadatas.put(name, metaDataMap);
		}
		doReleaseConnection(dataSourceId, connection);
		return tableMetadatas;
	}	
	
}
````

### `backend/base/src/main/java/org/qifu/util/EncryptorUtils.java`

- Purpose: Utility; declares class EncryptorUtils; has 6 detected methods; depends on 1 org.qifu local types
- Package: `org.qifu.util`
- Role: Utility
- Main types: `class EncryptorUtils`
- Local dependencies: `org.qifu.base.Constants`
- Third-party dependencies: `org.apache.commons.codec.binary.Base64`
- Main methods:
  - L56 `public String encrypt(String key1, String iv1, String value)`
  - L70 `public String decrypt(String key1, String iv1, String encrypted)`
  - L88 `public String encryptGcm(String base64Key, String value)`
  - L112 `public String decryptGcm(String base64Key, String encryptedPayload)`
  - L140 `public void validateGcmKey(String base64Key)`
  - L144 `private SecretKeySpec buildGcmKey(String base64Key)`
- Main fields:
  - L46 `String GCM_TRANSFORMATION`
  - L47 `String GCM_PAYLOAD_VERSION`
  - L48 `int GCM_IV_LENGTH_BYTES`
  - L49 `int GCM_TAG_LENGTH_BITS`
  - L50 `SecureRandom SECURE_RANDOM`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\util\EncryptorUtils.java`
- Size: 6209 bytes

#### Source

````java
/* 
 * Copyright 2012-2017 qifu of copyright Chen Xin Nien
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
package org.qifu.util;

import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;
import org.qifu.base.Constants;

/**
 * from network resource
 * http://stackoverflow.com/questions/15554296/simple-java-aes-encrypt-decrypt-example
 * 
 * AES-256 , Java Cryptography Extension (JCE) Unlimited Strength Jurisdiction Policy Files 8 Download
 * http://www.oracle.com/technetwork/java/javase/downloads/jce8-download-2133166.html
 *
 */
public class EncryptorUtils {

	private static final String GCM_TRANSFORMATION = "AES/GCM/NoPadding";
	private static final String GCM_PAYLOAD_VERSION = "v1";
	private static final int GCM_IV_LENGTH_BYTES = 12;
	private static final int GCM_TAG_LENGTH_BITS = 128;
	private static final SecureRandom SECURE_RANDOM = new SecureRandom();
	
	protected EncryptorUtils() {
		throw new IllegalStateException("Utils class: EncryptorUtils");
	}
	
	public static String encrypt(String key1, String iv1, String value) {
		try {
			IvParameterSpec iv = new IvParameterSpec(iv1.getBytes(Constants.BASE_ENCODING));
            SecretKeySpec skeySpec = new SecretKeySpec(key1.getBytes(Constants.BASE_ENCODING), "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);
            byte[] encrypted = cipher.doFinal(value.getBytes());
            return Base64.encodeBase64String(encrypted);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public static String decrypt(String key1, String iv1, String encrypted) {
        try {
            IvParameterSpec iv = new IvParameterSpec(iv1.getBytes(Constants.BASE_ENCODING));
            SecretKeySpec skeySpec = new SecretKeySpec(key1.getBytes(Constants.BASE_ENCODING), "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);
            byte[] original = cipher.doFinal(Base64.decodeBase64(encrypted));
            return new String(original);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

	/**
	 * Encrypts a value with AES-GCM. The key must be a Base64-encoded AES key
	 * containing 16, 24, or 32 bytes.
	 */
	public static String encryptGcm(String base64Key, String value) {
		if (value == null) {
			throw new IllegalArgumentException("Value must not be null");
		}

		byte[] iv = new byte[GCM_IV_LENGTH_BYTES];
		SECURE_RANDOM.nextBytes(iv);

		try {
			Cipher cipher = Cipher.getInstance(GCM_TRANSFORMATION);
			cipher.init(Cipher.ENCRYPT_MODE, buildGcmKey(base64Key),
					new GCMParameterSpec(GCM_TAG_LENGTH_BITS, iv));
			byte[] encrypted = cipher.doFinal(value.getBytes(StandardCharsets.UTF_8));
			return String.join(":", GCM_PAYLOAD_VERSION,
					java.util.Base64.getUrlEncoder().withoutPadding().encodeToString(iv),
					java.util.Base64.getUrlEncoder().withoutPadding().encodeToString(encrypted));
		} catch (GeneralSecurityException ex) {
			throw new IllegalStateException("Unable to encrypt value with AES-GCM", ex);
		}
	}

	/**
	 * Decrypts a payload created by {@link #encryptGcm(String, String)}.
	 */
	public static String decryptGcm(String base64Key, String encryptedPayload) {
		if (encryptedPayload == null) {
			throw new IllegalArgumentException("Encrypted payload must not be null");
		}

		String[] parts = encryptedPayload.split(":", -1);
		if (parts.length != 3 || !GCM_PAYLOAD_VERSION.equals(parts[0])) {
			throw new IllegalArgumentException("Unsupported AES-GCM payload format");
		}

		try {
			byte[] iv = java.util.Base64.getUrlDecoder().decode(parts[1]);
			if (iv.length != GCM_IV_LENGTH_BYTES) {
				throw new IllegalArgumentException("Invalid AES-GCM IV");
			}
			byte[] encrypted = java.util.Base64.getUrlDecoder().decode(parts[2]);
			Cipher cipher = Cipher.getInstance(GCM_TRANSFORMATION);
			cipher.init(Cipher.DECRYPT_MODE, buildGcmKey(base64Key),
					new GCMParameterSpec(GCM_TAG_LENGTH_BITS, iv));
			return new String(cipher.doFinal(encrypted), StandardCharsets.UTF_8);
		} catch (GeneralSecurityException | IllegalArgumentException ex) {
			throw new IllegalArgumentException("Unable to decrypt or authenticate AES-GCM payload", ex);
		}
	}

	/**
	 * Validates that a Base64 value can be used as an AES-GCM key.
	 */
	public static void validateGcmKey(String base64Key) {
		buildGcmKey(base64Key);
	}

	private static SecretKeySpec buildGcmKey(String base64Key) {
		if (base64Key == null || base64Key.isBlank()) {
			throw new IllegalArgumentException("AES-GCM key must not be blank");
		}

		byte[] key;
		try {
			key = java.util.Base64.getDecoder().decode(base64Key);
		} catch (IllegalArgumentException ex) {
			throw new IllegalArgumentException("AES-GCM key must be Base64 encoded", ex);
		}
		if (key.length != 16 && key.length != 24 && key.length != 32) {
			throw new IllegalArgumentException("AES-GCM key must contain 16, 24, or 32 bytes");
		}
		return new SecretKeySpec(key, "AES");
	}
    
}
````

### `backend/base/src/main/java/org/qifu/util/FSUtils.java`

- Purpose: Utility; declares class FSUtils; has 10 detected methods
- Package: `org.qifu.util`
- Role: Utility
- Main types: `class FSUtils`
- Spring dependencies: `org.springframework.mail.javamail.ConfigurableMimeFileTypeMap`
- Third-party dependencies: `org.apache.commons.io.FileUtils`, `org.apache.commons.lang3.StringUtils`, `org.slf4j.Logger`, `org.slf4j.LoggerFactory`
- Main methods:
  - L50 `public void mv(final String sourceFile, final String destFile)`
  - L54 `public void cp(final String sourceFile, final String destFile)`
  - L58 `public void rm(final String removeFile)`
  - L62 `public String[] getList(final String dir)`
  - L67 `public String readStr(final String fileFullPath)`
  - L86 `public boolean writeStr(final String fileFullPath, final String content)`
  - L103 `public boolean writeStr2(final String fileFullPath, final String content)`
  - L148 `public String getMimeType(File file)`
  - L156 `public String getMimeType(String filename)`
  - L167 `public String getMimeType4URL(File file)`
- Main fields:
  - L44 `Logger logger`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\util\FSUtils.java`
- Size: 5232 bytes

#### Source

````java
/* 
 * Copyright 2012-2016 bambooCORE, greenstep of copyright Chen Xin Nien
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
package org.qifu.util;

import java.io.File;
import java.io.IOException;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.javamail.ConfigurableMimeFileTypeMap;

public class FSUtils {
	private static final Logger logger = LoggerFactory.getLogger(FSUtils.class);

	protected FSUtils() {
		throw new IllegalStateException("Utils class: FSUtils");
	}

	public static void mv(final String sourceFile, final String destFile) throws IOException {
		Files.move(Paths.get(sourceFile), Paths.get(destFile), StandardCopyOption.REPLACE_EXISTING);
	}

	public static void cp(final String sourceFile, final String destFile) throws IOException {
		Files.copy(Paths.get(sourceFile), Paths.get(destFile), StandardCopyOption.REPLACE_EXISTING);
	}

	public static void rm(final String removeFile) throws IOException {
		FileUtils.forceDelete(new File(removeFile));
	}

	public static String[] getList(final String dir) {
		File directory = new File(dir);
		return directory.list();
	}

	public static String readStr(final String fileFullPath) {
		Path path = Paths.get(fileFullPath);
		try {
			if (Files.exists(path)) {
				return new String(Files.readAllBytes(path), StandardCharsets.UTF_8);
			}
		} catch (IOException e) {
			logger.error("Read file error: {}", e.getMessage(), e);
		}
		return "";
	}

	/**
	 * Write content to file. If file exists, overwrite it.
	 * 
	 * @param fileFullPath
	 * @param content
	 * @return boolean
	 */
	public static boolean writeStr(final String fileFullPath, final String content) {
		try {
			Files.write(Paths.get(fileFullPath), StringUtils.defaultString(content).getBytes(StandardCharsets.UTF_8));
			return true;
		} catch (IOException e) {
			logger.error("Write file error: {}", e.getMessage(), e);
		}
		return false;
	}

	/**
	 * Same as writeStr, kept for compatibility if needed.
	 * 
	 * @param fileFullPath
	 * @param content
	 * @return boolean
	 */
	public static boolean writeStr2(final String fileFullPath, final String content) {
		return writeStr(fileFullPath, content);
	}

	public static List<String> findFileListByCondition(final String directory, final String[] subName,
			final String content) {
		List<String> result = new ArrayList<>();
		Path start = Paths.get(directory);
		if (!Files.isDirectory(start)) {
			return result;
		}

		try (Stream<Path> stream = Files.walk(start)) {
			List<Path> files = stream.filter(Files::isRegularFile).collect(Collectors.toList());
			for (Path file : files) {
				String fileName = file.getFileName().toString().toUpperCase();
				boolean matchExtension = false;
				for (String sub : subName) {
					if (fileName.contains(sub.toUpperCase())) {
						matchExtension = true;
						break;
					}
				}

				if (matchExtension) {
					String fileContent = readStr(file.toAbsolutePath().toString());
					if (fileContent.contains(content)) {
						result.add(file.toAbsolutePath().toString());
					}
				}
			}
		} catch (IOException e) {
			logger.error("Find files error: {}", e.getMessage(), e);
		}

		return result;
	}

	/**
	 * get MIME-TYPE
	 * 
	 * @param file
	 * @return String
	 * @throws IOException
	 */
	public static String getMimeType(File file) throws IOException {
		if (file == null || !file.exists() || file.isDirectory()) {
			return "";
		}
		String type = Files.probeContentType(file.toPath());
		return type != null ? type : "";
	}

	public static String getMimeType(String filename) {
		ConfigurableMimeFileTypeMap mfm = new ConfigurableMimeFileTypeMap();
		return mfm.getContentType(filename);
	}

	/**
	 * get MIME-TYPE Using URLConnection.guessContentTypeFromName
	 * 
	 * @param file
	 * @return String
	 */
	public static String getMimeType4URL(File file) {
		if (file == null || !file.exists() || file.isDirectory()) {
			return "";
		}
		return URLConnection.guessContentTypeFromName(file.getName());
	}

}
````

### `backend/base/src/main/java/org/qifu/util/FtpClientUtils.java`

- Purpose: Utility; declares class FtpClientUtils; has 21 detected methods
- Package: `org.qifu.util`
- Role: Utility
- Main types: `class FtpClientUtils implements AutoCloseable`
- Third-party dependencies: `org.apache.commons.lang3.StringUtils`, `org.apache.commons.net.ftp.FTP`, `org.apache.commons.net.ftp.FTPClient`, `org.apache.commons.net.ftp.FTPFile`, `org.slf4j.Logger`, `org.slf4j.LoggerFactory`
- Main methods:
  - L58 `public String getFtpserver()`
  - L62 `public void setFtpserver(String ftpserver)`
  - L66 `public String getFtpuser()`
  - L70 `public void setFtpuser(String ftpuser)`
  - L74 `public String getFtppass()`
  - L78 `public void setFtppass(String ftppass)`
  - L82 `public File getStoreDir()`
  - L86 `public void setStoreDir(File storeDir)`
  - L90 `private void ensureConnected()`
  - L96 `public void restConnection()`
  - L106 `public void get()`
  - L141 `public void get(String cwdDirectory, File storeDir, String head)`
  - L155 `public void getByName(String cwdDirectory, File storeDir, String head)`
  - L191 `public void get(String cwdDirectory, File storeDir, String head, boolean deleteFtpFile)`
  - L211 `private void getProcess(FTPFile ftpFile, File storeDir, boolean deleteFtpFile)`
  - L234 `public boolean delete(String remoteFileName)`
  - L248 `public boolean deleteRestConnection(String cwdDirectory, String remoteFileName)`
  - L264 `public void put(String cwdDirectory, String remoteFileName, File localFile)`
  - L284 `public void login(String ftpserver, String ftpuser, String ftppass)`
  - L291 `public void cwd(String cwdDirectory)`
  - L299 `public void close()`
- Main fields:
  - L45 `Logger logger`
  - L47 `FTPClient ftpClient`
  - L48 `String ftpserver`
  - L49 `String ftpuser`
  - L50 `String ftppass`
  - L51 `File storeDir`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\util\FtpClientUtils.java`
- Size: 9367 bytes

#### Source

````java
/* 
 * Copyright 2012-2016 bambooCORE, greenstep of copyright Chen Xin Nien
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
package org.qifu.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FtpClientUtils implements AutoCloseable {
	/*
	 * RFC-1123 A Server-FTP process SHOULD have an idle timeout, which will
	 * terminate the process and close the control connection if the server is
	 * inactive (i.e., no command or data transfer in progress) for a long period of
	 * time. The idle timeout time SHOULD be configurable, and the default should be
	 * at least 5 minutes.
	 */
	public static final int TIME_OUT = 30000; // 30秒
	private static final Logger logger = LoggerFactory.getLogger(FtpClientUtils.class);

	protected FTPClient ftpClient;
	private String ftpserver = "";
	private String ftpuser = "";
	private String ftppass = "";
	private File storeDir;

	public FtpClientUtils() {
		ftpClient = new FTPClient();
		ftpClient.setBufferSize(1024 * 100); // 100KB
	}

	public String getFtpserver() {
		return ftpserver;
	}

	public void setFtpserver(String ftpserver) {
		this.ftpserver = ftpserver;
	}

	public String getFtpuser() {
		return ftpuser;
	}

	public void setFtpuser(String ftpuser) {
		this.ftpuser = ftpuser;
	}

	public String getFtppass() {
		return ftppass;
	}

	public void setFtppass(String ftppass) {
		this.ftppass = ftppass;
	}

	public File getStoreDir() {
		return storeDir;
	}

	public void setStoreDir(File storeDir) {
		this.storeDir = storeDir;
	}

	private void ensureConnected() throws IOException {
		if (ftpClient == null || !ftpClient.isConnected()) {
			restConnection();
		}
	}

	public void restConnection() throws IOException {
		if (StringUtils.isBlank(this.ftpserver)) {
			throw new IOException("FTP server address is blank.");
		}
		this.ftpClient.connect(this.ftpserver);
		this.ftpClient.setConnectTimeout(TIME_OUT);
		this.ftpClient.login(this.ftpuser, this.ftppass);
		this.ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
	}

	public void get() throws IOException {
		this.get(ftpserver, ftpuser, ftppass, "", storeDir, false);
	}

	/**
	 * 把目錄下的檔案抓下來,如果有權限
	 * 
	 * @param ftpserver     FTP domain-name 或 IP
	 * @param ftpuser       FTP user
	 * @param ftppass       FTP 密碼
	 * @param cwdDirectory  cd 目錄
	 * @param storeDir      本地端目錄
	 * @param deleteFtpFile 是否刪除 FTP 上檔案(取完後刪除)
	 * 
	 * @throws IOException
	 */
	public void get(String ftpserver, String ftpuser, String ftppass, String cwdDirectory, File storeDir,
			boolean deleteFtpFile) throws IOException {

		this.ftpserver = ftpserver;
		this.ftpuser = ftpuser;
		this.ftppass = ftppass;
		ensureConnected();
		this.get(cwdDirectory, storeDir, null, deleteFtpFile);
	}

	/**
	 * 把目錄下的檔案抓下來,如果有權限
	 * 
	 * @param cwdDirectory cd 目錄
	 * @param storeDir     本地端目錄
	 * @param head         檔案開頭 代null或 空白 忽略
	 * 
	 * @throws IOException
	 */
	public void get(String cwdDirectory, File storeDir, String head) throws IOException {
		this.get(cwdDirectory, storeDir, head, false);
	}

	/**
	 * 給無法用 get(String cwdDirectory, File storeDir, String head, boolean
	 * deleteFtpFile) 的版本用, 一般正常的 FTPd 不要用這個method , 把目錄下的檔案抓下來, 如果有權限
	 * 
	 * @param cwdDirectory cd 目錄
	 * @param storeDir     本地端目錄
	 * @param head         檔案開頭 代null或 空白 忽略
	 * 
	 * @throws IOException
	 */
	public void getByName(String cwdDirectory, File storeDir, String head) throws IOException {
		ensureConnected();
		if (StringUtils.isNotEmpty(cwdDirectory)) {
			this.ftpClient.cwd(cwdDirectory);
		}
		String[] names = this.ftpClient.listNames();
		if (names == null) {
			return;
		}
		for (String name : names) {
			if (StringUtils.isNotEmpty(head) && !name.startsWith(head)) {
				logger.info("not get : {}", name);
				continue;
			}
			logger.info("ftp file name: {}", name);
			if (name.contains(".")) {
				File downloadFile = new File(storeDir, name);
				try (FileOutputStream fos = new FileOutputStream(downloadFile)) {
					if (this.ftpClient.retrieveFile(name, fos)) {
						logger.info("ftp GET (save to) : {}", downloadFile.getAbsolutePath());
					}
				}
			}
		}
	}

	/**
	 * 把目錄下的檔案抓下來,如果有權限
	 * 
	 * @param cwdDirectory  cd 目錄
	 * @param storeDir      本地端目錄
	 * @param head          檔案開頭 代null或 空白 忽略
	 * @param deleteFtpFile 是否刪除 FTP 上檔案(取完後刪除)
	 * 
	 * @throws IOException
	 */
	public void get(String cwdDirectory, File storeDir, String head, boolean deleteFtpFile) throws IOException {

		ensureConnected();
		if (StringUtils.isNotEmpty(cwdDirectory)) {
			this.ftpClient.cwd(cwdDirectory);
		}
		FTPFile[] ftpFiles = this.ftpClient.listFiles();
		if (ftpFiles == null) {
			return;
		}
		for (FTPFile ftpFile : ftpFiles) {
			if (StringUtils.isNotEmpty(head) && !ftpFile.getName().startsWith(head)) {
				logger.info("not get : {}", ftpFile.getName());
				continue;
			}
			logger.info("ftp file name: {}", ftpFile.getName());
			this.getProcess(ftpFile, storeDir, deleteFtpFile);
		}
	}

	private void getProcess(FTPFile ftpFile, File storeDir, boolean deleteFtpFile) throws IOException {
		if (!ftpFile.isFile()) {
			return;
		}
		File downloadFile = new File(storeDir, ftpFile.getName());
		try (FileOutputStream fos = new FileOutputStream(downloadFile)) {
			if (this.ftpClient.retrieveFile(ftpFile.getName(), fos)) {
				logger.info("ftp GET (save to) : {}", downloadFile.getAbsolutePath());
				if (deleteFtpFile) {
					this.delete(ftpFile.getName());
				}
			}
		}
	}

	/**
	 * 刪除FTP檔案,如果有權限
	 * 
	 * @param remoteFileName FTP上的檔案
	 * 
	 * @return boolean
	 * @throws IOException
	 */
	public boolean delete(String remoteFileName) throws IOException {
		ensureConnected();
		boolean delStatus = this.ftpClient.deleteFile(remoteFileName);
		logger.warn("ftp DELETE : {} del-status : {}", remoteFileName, delStatus);
		return delStatus;
	}

	/**
	 * 刪除時重新連線 , 提供給某些跑很久的Job用, 等刪除檔案時就timeout了, 所以重新建連線
	 * 
	 * @param remoteFileName
	 * @return boolean
	 * @throws IOException
	 */
	public boolean deleteRestConnection(String cwdDirectory, String remoteFileName) throws IOException {

		this.restConnection();
		this.cwd(cwdDirectory);
		return delete(remoteFileName);
	}

	/**
	 * 把本地上的檔案put上去,如果有權限
	 * 
	 * @param cwdDirectory   cd 目錄
	 * @param remoteFileName 放到FTP上的檔名
	 * @param localFile      本機上的檔案
	 * 
	 * @throws IOException
	 */
	public void put(String cwdDirectory, String remoteFileName, File localFile) throws IOException {
		ensureConnected();
		try (FileInputStream fis = new FileInputStream(localFile)) {
			if (StringUtils.isNotEmpty(cwdDirectory)) {
				this.ftpClient.cwd(cwdDirectory);
			}
			this.ftpClient.storeFile(remoteFileName, fis);
			logger.warn("ftp PUT : {}/{}", cwdDirectory, remoteFileName);
		}
	}

	/**
	 * 登入, 如果有權限
	 * 
	 * @param ftpserver FTP domain-name 或 IP
	 * @param ftpuser   FTP user
	 * @param ftppass   FTP 密碼
	 * 
	 * @throws IOException
	 */
	public void login(String ftpserver, String ftpuser, String ftppass) throws IOException {
		this.ftpserver = ftpserver;
		this.ftpuser = ftpuser;
		this.ftppass = ftppass;
		this.restConnection();
	}

	public void cwd(String cwdDirectory) throws IOException {
		ensureConnected();
		this.ftpClient.cwd(cwdDirectory);
	}

	/**
	 * 關閉連ftp
	 */
	public void close() {
		if (this.ftpClient != null) {
			try {
				if (this.ftpClient.isConnected()) {
					this.ftpClient.logout();
				}
			} catch (IOException e) {
				logger.error("FTP logout error: {}", e.getMessage());
			}
			try {
				if (this.ftpClient.isConnected()) {
					this.ftpClient.disconnect();
				}
			} catch (IOException e) {
				logger.error("FTP disconnect error: {}", e.getMessage());
			}
		}
	}

}
````

### `backend/base/src/main/java/org/qifu/util/GenericsUtils.java`

- Purpose: Utility; declares class GenericsUtils; has 2 detected methods
- Package: `org.qifu.util`
- Role: Utility
- Main types: `class GenericsUtils`
- Key annotations: `SuppressWarnings`
- Main methods:
  - L34 `public Class getSuperClassGenricType(Class clazz)`
  - L39 `public Class getSuperClassGenricType(Class clazz, int index)`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\util\GenericsUtils.java`
- Size: 1844 bytes

#### Source

````java
/* 
 * Copyright 2010-2022 qifu of copyright Chen Xin Nien
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
package org.qifu.util;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class GenericsUtils {
	
	protected GenericsUtils() {
		throw new IllegalStateException("Utils class: GenericsUtils");
	}
	
	@SuppressWarnings("rawtypes")
	public static Class getSuperClassGenricType(Class clazz) { 
        return getSuperClassGenricType(clazz, 0);  
    }    
    
    @SuppressWarnings({ "rawtypes" })
    public static Class getSuperClassGenricType(Class clazz, int index) throws IndexOutOfBoundsException { 
        Type genType = clazz.getGenericSuperclass(); 
        if (!(genType instanceof ParameterizedType)) {
            return Object.class; 
        }  
        Type[] params = ((ParameterizedType) genType).getActualTypeArguments(); 
        if (index >= params.length || index < 0) { 
            return Object.class; 
        } 
        if (!(params[index] instanceof Class)) { 
            return Object.class; 
        } 
        return (Class) params[index]; 
    }	
    
}
````

### `backend/base/src/main/java/org/qifu/util/LoadResources.java`

- Purpose: Utility; declares class LoadResources; has 4 detected methods; depends on 1 org.qifu local types
- Package: `org.qifu.util`
- Role: Utility
- Main types: `class LoadResources`
- Local dependencies: `org.qifu.base.Constants`
- Third-party dependencies: `org.apache.commons.io.IOUtils`, `tools.jackson.databind.ObjectMapper`
- Main methods:
  - L41 `public <T> T objectMapperReadValue(String fileRes, Class<T> resourceJson2HashMapOrListClazz, Class<?> resourceClazz)`
  - L45 `public ObjectMapper getObjectMapper()`
  - L49 `public List<String> readLine(String fileRes, Class<?> resourceClazz)`
  - L57 `public String read(String fileRes, Class<?> resourceClazz)`
- Main fields:
  - L35 `ObjectMapper OBJECT_MAPPER`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\util\LoadResources.java`
- Size: 2190 bytes

#### Source

````java
/* 
 * Copyright 2010-2022 qifu of copyright Chen Xin Nien
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
package org.qifu.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.qifu.base.Constants;

import tools.jackson.databind.ObjectMapper;

public class LoadResources {
	
	private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
	
	protected LoadResources() {
		throw new IllegalStateException("Utils class: LoadResources");
	}
	
	public static <T> T objectMapperReadValue(String fileRes, Class<T> resourceJson2HashMapOrListClazz, Class<?> resourceClazz) throws IOException {
		return OBJECT_MAPPER.readValue( read( fileRes, resourceClazz), resourceJson2HashMapOrListClazz );
	}
	
	public static ObjectMapper getObjectMapper() {
		return OBJECT_MAPPER;
	}
	
	public static List<String> readLine(String fileRes, Class<?> resourceClazz) throws IOException {
		List<String> strList = null;
		try (InputStream is = resourceClazz.getClassLoader().getResource( fileRes ).openStream()) {		
			strList = IOUtils.readLines(is, Constants.BASE_ENCODING);				
		}
		return strList;
	}	
	
	public static String read(String fileRes, Class<?> resourceClazz) throws IOException {
		String str = "";
		try (InputStream is = resourceClazz.getClassLoader().getResource( fileRes ).openStream()) {
			str = IOUtils.toString(is, Constants.BASE_ENCODING);
		}
		return str;
	}
	
}
````

### `backend/base/src/main/java/org/qifu/util/ManualDataSourceFactory.java`

- Purpose: Utility; declares class ManualDataSourceFactory; has 2 detected methods
- Package: `org.qifu.util`
- Role: Utility
- Main types: `class ManualDataSourceFactory`
- Third-party dependencies: `org.apache.commons.lang3.StringUtils`, `ognl.Ognl`, `ognl.OgnlContext`, `ognl.OgnlException`
- Main methods:
  - L40 `private boolean checkDataSourceClass(Class<?> clazz)`
  - L55 `public DataSource getDataSource(Class<?> dataSourceClass, String url, String user, String password)`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\util\ManualDataSourceFactory.java`
- Size: 2492 bytes

#### Source

````java
/* 
 * Copyright 2012-2017 qifu of copyright Chen Xin Nien
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
package org.qifu.util;

import java.lang.reflect.InvocationTargetException;

import javax.sql.DataSource;

import org.apache.commons.lang3.StringUtils;

import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;

public class ManualDataSourceFactory {
	
	protected ManualDataSourceFactory() {
		throw new IllegalStateException("Utils class: ManualDataSourceFactory");
	}
	
	private static boolean checkDataSourceClass(Class<?> clazz) {
		if (null == clazz) {
			return false;
		}
		boolean isDataSource = false;
		Class<?>[] ifs = clazz.getInterfaces();
		for (int i=0; ifs!=null && i<ifs.length; i++) {
			String sn = ifs[i].getSimpleName();
			if ("DataSource".equals(sn)) {
				isDataSource = true;
			}
		}
		return isDataSource;
	}
	
	public static DataSource getDataSource(Class<?> dataSourceClass, String url, String user, String password) throws OgnlException, IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		if (!checkDataSourceClass(dataSourceClass)) {
			throw new IllegalArgumentException("DataSource Class is not implements DataSource. error!");
		}
		if (StringUtils.isBlank(url) || StringUtils.isBlank(user)) {
			throw new IllegalArgumentException("url or user is required!");
		}
		DataSource ds = (DataSource)dataSourceClass.getDeclaredConstructor().newInstance();
		OgnlContext ognlContext = Ognl.createDefaultContext(null);
		Ognl.setValue("url", ognlContext, ds, url);
		Ognl.setValue("user", ognlContext, ds, user);
		Ognl.setValue("password", ognlContext, ds, (null==password ? "" : password) );
		return ds;
	}
	
}
````

### `backend/base/src/main/java/org/qifu/util/PdfOwnerUserBuilder.java`

- Purpose: Utility; declares class PdfOwnerUserBuilder; has 10 detected methods; depends on 1 org.qifu local types
- Package: `org.qifu.util`
- Role: Utility
- Main types: `class PdfOwnerUserBuilder`
- Local dependencies: `org.qifu.base.Constants`
- Third-party dependencies: `org.apache.commons.io.FileUtils`, `org.apache.commons.lang3.StringUtils`, `org.apache.pdfbox.Loader`, `org.apache.pdfbox.pdmodel.PDDocument`, `org.apache.pdfbox.pdmodel.encryption.AccessPermission`, `org.apache.pdfbox.pdmodel.encryption.StandardProtectionPolicy`, `org.apache.pdfbox.pdmodel.font.PDType0Font`
- Config keys referenced: `java.io.tmpdir`
- Main methods:
  - L47 `public PdfOwnerUserBuilder build()`
  - L51 `public PdfOwnerUserBuilder watermarkText(String watermarkText)`
  - L58 `public PdfOwnerUserBuilder owner(String owner)`
  - L65 `public PdfOwnerUserBuilder user(String user)`
  - L72 `public PdfOwnerUserBuilder fontPath(String fontPath)`
  - L79 `public PdfOwnerUserBuilder destFile(String fullPath)`
  - L84 `public PdfOwnerUserBuilder destFileToTmpdir()`
  - L92 `public PdfOwnerUserBuilder sourceFile(String fullPath)`
  - L101 `public PdfOwnerUserBuilder process()`
  - L129 `public String destFileFullPath()`
- Main fields:
  - L40 `String pdfFileFullPath`
  - L41 `String destEncryptionPdfPath`
  - L42 `String owner`
  - L43 `String user`
  - L44 `String watermarkText`
  - L45 `String fontPath`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\util\PdfOwnerUserBuilder.java`
- Size: 4410 bytes

#### Source

````java
/* 
 * Copyright 2012-2019 qifu, qifu2 of copyright Chen Xin Nien
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
package org.qifu.util;

import java.awt.Color;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.qifu.base.Constants;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.encryption.AccessPermission;
import org.apache.pdfbox.pdmodel.encryption.StandardProtectionPolicy;
import org.apache.pdfbox.pdmodel.font.PDType0Font;

public class PdfOwnerUserBuilder {

	private String pdfFileFullPath = "";
	private String destEncryptionPdfPath = "";
	private String owner = "PdfOwnerUserBuilder";
	private String user = "PdfOwnerUserBuilder";
	private String watermarkText = "";
	private String fontPath = "fonts/fireflysung.ttf";
	
	public static PdfOwnerUserBuilder build() {
		return new PdfOwnerUserBuilder();
	}
	
	public PdfOwnerUserBuilder watermarkText(String watermarkText) {
		if (!StringUtils.isBlank(watermarkText)) {
			this.watermarkText = watermarkText;
		}
		return this;
	}
	
	public PdfOwnerUserBuilder owner(String owner) {
		if (!StringUtils.isBlank(owner)) {
			this.owner = owner;
		}
		return this;
	}
	
	public PdfOwnerUserBuilder user(String user) {
		if (!StringUtils.isBlank(user)) {
			this.user = user;
		}
		return this;
	}
	
	public PdfOwnerUserBuilder fontPath(String fontPath) {
		if (!StringUtils.isBlank(fontPath)) {
			this.fontPath = fontPath;
		}
		return this;
	}

	public PdfOwnerUserBuilder destFile(String fullPath) {
		this.destEncryptionPdfPath = fullPath;
		return this;
	}

	public PdfOwnerUserBuilder destFileToTmpdir() {
		String fullPath = System.getProperty("java.io.tmpdir") + Constants.FORWARD_SLASH
				+ PdfOwnerUserBuilder.class.getSimpleName() + Constants.FORWARD_SLASH + System.currentTimeMillis()
				+ Constants.FORWARD_SLASH + System.currentTimeMillis() + ".pdf";
		this.destFile(fullPath);
		return this;
	}

	public PdfOwnerUserBuilder sourceFile(String fullPath) throws IOException {
		File file = new File(fullPath);
		if (!file.exists()) {
			throw new IOException("no exists file : " + fullPath);
		}
		this.pdfFileFullPath = fullPath;
		return this;
	}

	public PdfOwnerUserBuilder process() throws IOException {
		if (StringUtils.isBlank(this.destEncryptionPdfPath) || StringUtils.isBlank(this.pdfFileFullPath)) {
			throw new IOException("no exists dest file : " + this.destEncryptionPdfPath + " or source file : "
					+ this.pdfFileFullPath);
		}
		File destFile = new File(this.destEncryptionPdfPath);
		if (destFile.getParentFile() != null && !destFile.getParentFile().exists()) {
			FileUtils.forceMkdir(destFile.getParentFile());
		}
		try (PDDocument document = Loader.loadPDF(new File(this.pdfFileFullPath))) {
			if (StringUtils.isNotBlank(this.watermarkText)) {
				File fontFile = new File(this.fontPath);
				if (!fontFile.exists()) {
					throw new IOException("Font file not found : " + this.fontPath);
				}
				PDType0Font font = PDType0Font.load(document, fontFile);
				PdfWatermarkUtils.addWatermark(document, font, Color.RED, this.watermarkText);
			}
			AccessPermission permission = new AccessPermission();
			permission.setCanPrint(true);
			StandardProtectionPolicy policy = new StandardProtectionPolicy(this.owner, this.user, permission);
			policy.setEncryptionKeyLength(128);
			document.protect(policy);
			document.save(this.destEncryptionPdfPath);
		}
		return this;
	}
	
	public String destFileFullPath() {
		return this.destEncryptionPdfPath;
	}
	
}
````

### `backend/base/src/main/java/org/qifu/util/PdfWatermarkUtils.java`

- Purpose: Utility; declares class PdfWatermarkUtils; has 1 detected methods
- Package: `org.qifu.util`
- Role: Utility
- Main types: `class PdfWatermarkUtils`
- Third-party dependencies: `org.apache.commons.lang3.StringUtils`, `org.apache.pdfbox.pdmodel.PDDocument`, `org.apache.pdfbox.pdmodel.PDPage`, `org.apache.pdfbox.pdmodel.PDPageContentStream`, `org.apache.pdfbox.pdmodel.PDPageContentStream.AppendMode`, `org.apache.pdfbox.pdmodel.font.PDType0Font`, `org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState`, `org.apache.pdfbox.util.Matrix`
- Main methods:
  - L43 `public void addWatermark(PDDocument document, PDType0Font font, Color fontColor, String waterMarkString)`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\util\PdfWatermarkUtils.java`
- Size: 2557 bytes

#### Source

````java
/* 
 * Copyright 2012-2018 qifu, qifu2 of copyright Chen Xin Nien
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
package org.qifu.util;

import java.awt.Color;
import java.io.IOException;

import org.apache.commons.lang3.StringUtils;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.PDPageContentStream.AppendMode;
import org.apache.pdfbox.pdmodel.font.PDType0Font;
import org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState;
import org.apache.pdfbox.util.Matrix;

public class PdfWatermarkUtils {

	protected PdfWatermarkUtils() {
		throw new IllegalStateException("Utils class: PdfWatermarkUtils");
	}

	public static void addWatermark(PDDocument document, PDType0Font font, Color fontColor, String waterMarkString)
			throws IOException {
		if (document == null || font == null) {
			throw new IllegalArgumentException("PDDocument or PDType0Font is null.");
		}
		if (StringUtils.isBlank(waterMarkString)) {
			return;
		}
		PDExtendedGraphicsState gs = new PDExtendedGraphicsState();
		gs.setNonStrokingAlphaConstant(0.4f);
		gs.setStrokingAlphaConstant(0.4f);
		for (PDPage page : document.getPages()) {
			float width = page.getMediaBox().getWidth();
			float height = page.getMediaBox().getHeight();
			float centerX = width / 2;
			float centerY = height / 2;
			try (PDPageContentStream cs = new PDPageContentStream(document, page, AppendMode.APPEND, true, true)) {
				cs.setGraphicsStateParameters(gs);
				cs.beginText();
				cs.setNonStrokingColor(fontColor);
				cs.setFont(font, 60);
				Matrix matrix = Matrix.getRotateInstance(Math.toRadians(45), centerX, centerY);
				cs.setTextMatrix(matrix);
				cs.showText(waterMarkString);
				cs.endText();
			}
		}
	}
	
}
````

### `backend/base/src/main/java/org/qifu/util/ScriptExpressionUtils.java`

- Purpose: Utility; declares class ScriptExpressionUtils; has 2 detected methods; depends on 1 org.qifu local types
- Package: `org.qifu.util`
- Role: Utility
- Main types: `class ScriptExpressionUtils`
- Local dependencies: `org.qifu.base.model.ScriptTypeCode`
- Third-party dependencies: `org.codehaus.groovy.control.CompilationFailedException`, `org.codehaus.groovy.control.CompilerConfiguration`, `groovy.lang.Binding`, `groovy.lang.GroovyShell`
- Main methods:
  - L47 `public GroovyShell buildGroovyShell(boolean fromThreadLocal)`
  - L77 `private Object executeGroovy(String scriptExpression, Map<String, Object> results, Map<String, Object> parameters)`
- Main fields:
  - L34 `CompilerConfiguration groovyCompilerConfig`
  - L35 `ThreadLocal<GroovyShell> groovyShellTL`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\util\ScriptExpressionUtils.java`
- Size: 3299 bytes

#### Source

````java
/* 
 * Copyright 2012-2017 qifu of copyright Chen Xin Nien
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
package org.qifu.util;

import java.util.Map;

import org.codehaus.groovy.control.CompilationFailedException;
import org.codehaus.groovy.control.CompilerConfiguration;
import org.qifu.base.model.ScriptTypeCode;

import groovy.lang.Binding;
import groovy.lang.GroovyShell;

public class ScriptExpressionUtils {
	private static CompilerConfiguration groovyCompilerConfig = new CompilerConfiguration();
	private static ThreadLocal<GroovyShell> groovyShellTL = new ThreadLocal<>();
	
	static {
		groovyShellTL.remove();
		groovyCompilerConfig.getOptimizationOptions().put("indy", true);
		groovyCompilerConfig.getOptimizationOptions().put("int", false);		
	}
	
	protected ScriptExpressionUtils() {
		throw new IllegalStateException("Utils class: ScriptExpressionUtils");
	}
	
	public static GroovyShell buildGroovyShell(boolean fromThreadLocal) {
		if (fromThreadLocal) {
			GroovyShell groovyShell = null;
			if ((groovyShell=groovyShellTL.get()) == null) {
				groovyShell = new GroovyShell(groovyCompilerConfig);
				groovyShellTL.set(groovyShell);
			}	
			return groovyShell;			
		}		
		return new GroovyShell(groovyCompilerConfig);
	}
	
	/**
	 * 執行 script 
	 * 
	 * @param type					請參考 ScriptTypeCode , 目前有 BSH, GROOVY, PYTHON
	 * @param scriptExpression		script內容
	 * @param results				輸出的值
	 * @param parameters			代入的值
	 * @return
	 * @throws Exception
	 */
	public static Object execute(String type, String scriptExpression, 
			Map<String, Object> results, Map<String, Object> parameters) throws IllegalArgumentException {
		if (!ScriptTypeCode.isTypeCode(type)) {
			throw new java.lang.IllegalArgumentException("no support script language of : " + type);
		}
		return executeGroovy(scriptExpression, results, parameters);
	}	
	
	private static Object executeGroovy(String scriptExpression, Map<String, Object> results, Map<String, Object> parameters) throws CompilationFailedException {	
		GroovyShell groovyShell = buildGroovyShell(false);
		Binding binding = groovyShell.getContext();		
		if (parameters!=null) {			
			for (Map.Entry<String, Object> entry : parameters.entrySet()) {
				binding.setVariable(entry.getKey(), entry.getValue());				
			}
		}		
		Object r = groovyShell.evaluate(scriptExpression);
		if (results!=null) {
			for (Map.Entry<String, Object> entry : results.entrySet()) {
				entry.setValue( binding.getVariable(entry.getKey()) );
			}
		}
		return r;
	}	
	
}
````

### `backend/base/src/main/java/org/qifu/util/SFtpClientUtils.java`

- Purpose: Utility; declares class SFtpClientUtils, interface SftpAction; has 5 detected methods
- Package: `org.qifu.util`
- Role: Utility
- Main types: `class SFtpClientUtils`; `interface SftpAction <T>`
- Key annotations: `FunctionalInterface`
- Third-party dependencies: `org.apache.commons.collections.CollectionUtils`, `org.slf4j.Logger`, `org.slf4j.LoggerFactory`, `com.jcraft.jsch.Channel`, `com.jcraft.jsch.ChannelSftp`, `com.jcraft.jsch.ChannelSftp.LsEntry`, `com.jcraft.jsch.JSch`, `com.jcraft.jsch.JSchException`, `com.jcraft.jsch.Session`, `com.jcraft.jsch.SftpException`
- Main methods:
  - L54 `private <T> T execute(String user, String password, String addr, int port, SftpAction<T> action)`
  - L97 `public Vector<LsEntry> getRemoteFileList(String user, String password, String addr, int port)`
  - L107 `public Vector<LsEntry> getRemoteFileList(String user, String password, String addr, int port, String cwd)`
  - L125 `public void get(String user, String password, String addr, int port, String remoteFile, String localFile)`
  - L217 `public void rm(String user, String password, String addr, int port, List<String> fileName)`
- Main fields:
  - L42 `Logger logger`
  - L43 `JSch jsch`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\util\SFtpClientUtils.java`
- Size: 7143 bytes

#### Source

````java
/* 
 * Copyright 2012-2016 bambooCORE, greenstep of copyright Chen Xin Nien
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
package org.qifu.util;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Vector;

import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.ChannelSftp.LsEntry;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;

public class SFtpClientUtils {
	protected static final Logger logger = LoggerFactory.getLogger(SFtpClientUtils.class);
	private static final JSch jsch = new JSch();

	protected SFtpClientUtils() {
		throw new IllegalStateException("Utils class: SFtpClientUtils");
	}

	@FunctionalInterface
	private interface SftpAction<T> {
		T execute(ChannelSftp sftp) throws SftpException, IOException;
	}

	private static <T> T execute(String user, String password, String addr, int port, SftpAction<T> action)
			throws JSchException, SftpException, IOException {
		Session session = null;
		Channel channel = null;
		ChannelSftp sftp = null;
		try {
			session = jsch.getSession(user, addr, port);
			session.setConfig("StrictHostKeyChecking", "no");
			session.setPassword(password.getBytes());
			session.connect();

			channel = session.openChannel("sftp");
			channel.connect();
			sftp = (ChannelSftp) channel;

			return action.execute(sftp);
		} catch (JSchException | SftpException | IOException e) {
			logger.error("SFTP error: {}", e.getMessage(), e);
			throw e;
		} finally {
			if (sftp != null) {
				sftp.exit();
			}
			if (channel != null) {
				channel.disconnect();
			}
			if (session != null) {
				session.disconnect();
			}
		}
	}

	/**
	 * 登入的目錄夾下的檔案清單
	 * 
	 * @param user
	 * @param password
	 * @param addr
	 * @param port
	 * @return
	 * @throws JSchException
	 * @throws SftpException
	 */
	public static Vector<LsEntry> getRemoteFileList(String user, String password, String addr, int port)
			throws JSchException, SftpException {
		try {
			return getRemoteFileList(user, password, addr, port, ".");
		} catch (IOException e) {
			// This shouldn't happen for ls "."
			return new Vector<>();
		}
	}
	
	public static Vector<LsEntry> getRemoteFileList(String user, String password, String addr, int port, String cwd)
			throws JSchException, SftpException, IOException {
		return execute(user, password, addr, port, sftp -> (Vector<LsEntry>) sftp.ls(cwd));
	}

	/**
	 * 抓遠端檔案然後存到本機 , 單筆
	 * 
	 * @param user
	 * @param password
	 * @param addr
	 * @param port
	 * @param remoteFile
	 * @param localFile
	 * @throws JSchException
	 * @throws SftpException
	 * @throws IOException
	 */
	public static void get(String user, String password, String addr, int port, String remoteFile, String localFile)
			throws JSchException, SftpException, IOException {

		execute(user, password, addr, port, sftp -> {
			logger.info("get remote file: {} write to: {}", remoteFile, localFile);
			sftp.get(remoteFile, localFile);
			File f = new File(localFile);
			if (!f.exists()) {
				logger.error("get remote file: {} fail!", remoteFile);
				throw new IOException("Failed to download remote file: " + remoteFile);
			}
			logger.info("success write: {}", localFile);
			return null;
		});
	}

	/**
	 * 抓遠端檔案然後存到本機 , 多筆
	 * 
	 * @param user
	 * @param password
	 * @param addr
	 * @param port
	 * @param remoteFile
	 * @param localFile
	 * @throws JSchException
	 * @throws SftpException
	 * @throws IOException
	 */
	public static void get(String user, String password, String addr, int port, List<String> remoteFile,
			List<String> localFile) throws JSchException, SftpException, IOException {

		if (CollectionUtils.isEmpty(remoteFile) || CollectionUtils.isEmpty(localFile)
				|| remoteFile.size() != localFile.size()) {
			throw new IllegalArgumentException("Invalid file lists.");
		}

		execute(user, password, addr, port, sftp -> {
			for (int i = 0; i < remoteFile.size(); i++) {
				String rf = remoteFile.get(i);
				String lf = localFile.get(i);
				logger.info("get remote file: {} write to: {}", rf, lf);
				sftp.get(rf, lf);
				File f = new File(lf);
				if (!f.exists()) {
					logger.error("get remote file: {} fail!", rf);
					throw new IOException("Failed to download remote file: " + rf);
				}
				logger.info("success write: {}", lf);
			}
			return null;
		});
	}

	/**
	 * 本地檔案放到遠端SFTP上
	 * 
	 * @param user
	 * @param password
	 * @param addr
	 * @param port
	 * @param localFile
	 * @param remoteFile
	 * @throws JSchException
	 * @throws SftpException
	 */
	public static void put(String user, String password, String addr, int port, List<String> localFile,
			List<String> remoteFile) throws JSchException, SftpException {

		if (CollectionUtils.isEmpty(localFile) || CollectionUtils.isEmpty(remoteFile)
				|| localFile.size() != remoteFile.size()) {
			logger.warn("Invalid file lists for put operation.");
			return;
		}
		try {
			execute(user, password, addr, port, sftp -> {
				for (int i = 0; i < localFile.size(); i++) {
					String rf = remoteFile.get(i);
					String lf = localFile.get(i);
					logger.info("put local file: {} write to {} : {}", lf, addr, rf);
					sftp.put(lf, rf);
					logger.info("success write to {} : {}", addr, rf);
				}
				return null;
			});
		} catch (IOException e) {
			// put doesn't throw IOException in original but execute might, wrap it if
			// needed
			throw new SftpException(ChannelSftp.SSH_FX_FAILURE, e.getMessage(), e);
		}
	}

	public static void rm(String user, String password, String addr, int port, List<String> fileName)
			throws JSchException, SftpException {

		if (CollectionUtils.isEmpty(fileName)) {
			return;
		}

		try {
			execute(user, password, addr, port, sftp -> {
				for (String f : fileName) {
					sftp.rm(f);
					logger.warn("success remove file from {} : {}", addr, f);
				}
				return null;
			});
		} catch (IOException e) {
			throw new SftpException(ChannelSftp.SSH_FX_FAILURE, e.getMessage(), e);
		}
	}

}
````

### `backend/base/src/main/java/org/qifu/util/SimpleUtils.java`

- Purpose: Utility; declares class SimpleUtils; has 49 detected methods
- Package: `org.qifu.util`
- Role: Utility
- Main types: `class SimpleUtils`
- Third-party dependencies: `org.apache.commons.codec.DecoderException`, `org.apache.commons.io.IOUtils`, `org.apache.commons.lang3.StringUtils`, `org.apache.commons.lang3.Strings`, `org.apache.commons.lang3.math.NumberUtils`, `org.apache.poi.hssf.usermodel.HSSFWorkbook`, `org.apache.poi.openxml4j.exceptions.InvalidFormatException`, `org.apache.poi.openxml4j.opc.OPCPackage`, `org.apache.poi.poifs.filesystem.FileMagic`, `org.apache.poi.ss.usermodel.Workbook`, `org.apache.poi.xssf.usermodel.XSSFClientAnchor`, `org.apache.poi.xssf.usermodel.XSSFDrawing`, `org.apache.poi.xssf.usermodel.XSSFPicture`, `org.apache.poi.xssf.usermodel.XSSFSheet`, `org.apache.poi.xssf.usermodel.XSSFWorkbook`, `org.slf4j.Logger`, `org.slf4j.LoggerFactory`, `com.fasterxml.uuid.Generators`
- Main methods:
  - L85 `public boolean checkBeTrueOfAZaz09(final int minLength, final int maxLength, final String sourceValue)`
  - L93 `public boolean checkBeTrueOf09(final String sourceValue)`
  - L97 `public boolean checkBeTrueOfAZaz09(final String sourceValue)`
  - L107 `public boolean checkBeTrueOfAZaz09Id(final String sourceValue)`
  - L115 `public boolean checkBeTrueOfNumber(final String sourceValue)`
  - L119 `public String createRandomString(final int length)`
  - L130 `public String getStr(String value)`
  - L134 `public int getInt(final String value, final int defaultValue)`
  - L138 `public long getLong(final String value, final long defaultValue)`
  - L142 `public float getFloat(final String value, final float defaultValue)`
  - L146 `public String getStrYMD(final int type)`
  - L160 `public boolean isDate(final String yyyymmdd)`
  - L196 `private LocalDate parseLocalDate(String dateStr)`
  - L204 `public int getDaysBetween(String startDate, String endDate)`
  - L208 `public int getDaysBetween(Date startDate, Date endDate)`
  - L212 `public int getYearsBetween(String startDate, String endDate)`
  - L216 `public int getYearsBetween(Date startDate, Date endDate)`
  - L221 `public int getMonthsBetween(String startDate, String endDate)`
  - L225 `public int getMonthsBetween(Date startDate, Date endDate)`
  - L229 `public String getStrYMD(String splitStr)`
  - L233 `public String getStrYMD(Date date, String splitStr)`
  - L240 `public String getStrYMD(String yyyymmdd, String splitStr)`
  - L247 `public int getMaxDayOfMonth(final int year, final int month)`
  - L253 `public int getDayOfWeek(final int year, final int month)`
  - L269 `public Map<String, String> getQuarterlyStartEnd(String yyyyMMdd)`
  - L302 `public String toHex(final String sourceValue)`
  - L306 `public String deHex(final String sourceValue)`
  - L315 `public String toB64(final String sourceValue)`
  - L319 `public String deB64(final String sourceValue)`
  - L323 `public String getUUIDStr()`
  - L327 `public String getRandomUUIDStr()`
  - L331 `public byte[] toMD5(final String sourceValue)`
  - L335 `public String toMD5Hex(final String sourceValue)`
  - L339 `public String joinString(Object... values)`
  - L352 `public String toUnicode(String strValue)`
  - L363 `public <T extends java.io.Serializable> List<T> getListHashSet(List<T> list)`
  - L376 `public BufferedImage decodeToImage(String imageString)`
  - L392 `public String encodeToString(BufferedImage image, String type)`
  - L402 `public String getPNGBase64Content(String imgStr)`
  - L415 `public boolean isPNGBase64Content(String imgStr)`
  - L430 `public Workbook createPOIWorkbook(InputStream inp)`
  - L443 `public void setCellPicture(XSSFWorkbook wb, XSSFSheet sh, byte[] iconBytes, int row, int col)`
  - L453 `public byte[] getColorRGB(String rgb)`
  - L463 `public byte[] getColorRGB4POIColor(String srcRGB)`
  - L474 `public int[] getColorRGB2(String color)`
  - L482 `public String getHttpRequestUrl(HttpServletRequest request)`
  - L493 `public int getAvailableProcessors(int maxSize)`
  - L501 `public String getDateFormatOfyyyyMMddHHmmss(Date date)`
  - L508 `public <T extends Comparable<T>> boolean isBetween(T value, T start, T end)`
- Main fields:
  - L70 `Logger logger`
  - L72 `int IS_YEAR`
  - L73 `int IS_MONTH`
  - L74 `int IS_DAY`
  - L75 `Random rnd`
  - L76 `String SOURCE_STR`
  - L77 `char[] SOURCE_STR_ARRAY`
  - L79 `DateTimeFormatter dtfOfyyyyMMddHHmmss`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\util\SimpleUtils.java`
- Size: 17296 bytes

#### Source

````java
/* 
 * Copyright 2012-2017 qifu of copyright Chen Xin Nien
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
package org.qifu.util;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.imageio.ImageIO;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Strings;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.poifs.filesystem.FileMagic;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFClientAnchor;
import org.apache.poi.xssf.usermodel.XSSFDrawing;
import org.apache.poi.xssf.usermodel.XSSFPicture;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.uuid.Generators;

import jakarta.servlet.http.HttpServletRequest;

public class SimpleUtils {
	private static final Logger logger = LoggerFactory.getLogger(SimpleUtils.class);

	public static final int IS_YEAR = 1;
	public static final int IS_MONTH = 2;
	public static final int IS_DAY = 3;
	private static final Random rnd = new Random();
	private static final String SOURCE_STR = "abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final char[] SOURCE_STR_ARRAY = SOURCE_STR.toCharArray();

	private static final DateTimeFormatter dtfOfyyyyMMddHHmmss = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

	protected SimpleUtils() {
		throw new IllegalStateException("Utils class: SimpleUtils");
	}

	public static boolean checkBeTrueOfAZaz09(final int minLength, final int maxLength, final String sourceValue) {
		if (sourceValue == null || minLength < 0 || sourceValue.length() < minLength
				|| sourceValue.length() > maxLength) {
			return false;
		}
		return checkBeTrueOfAZaz09(sourceValue);
	}

	public static boolean checkBeTrueOf09(final String sourceValue) {
		return StringUtils.isNotEmpty(sourceValue) && StringUtils.isNumeric(sourceValue);
	}

	public static boolean checkBeTrueOfAZaz09(final String sourceValue) {
		return StringUtils.isNotEmpty(sourceValue) && StringUtils.isAlphanumeric(sourceValue);
	}

	/**
	 * 支持 Id 類型的 check 如: AA-01 AA_01
	 * 
	 * @param sourceValue
	 * @return
	 */
	public static boolean checkBeTrueOfAZaz09Id(final String sourceValue) {
		if (StringUtils.isEmpty(sourceValue)) {
			return false;
		}
		// Allows alphanumeric, dash, underscore and dot
		return sourceValue.matches("^[a-zA-Z0-9\\-_.]+$");
	}

	public static boolean checkBeTrueOfNumber(final String sourceValue) {
		return NumberUtils.isCreatable(sourceValue);
	}

	public static String createRandomString(final int length) {
		if (length < 1) {
			return "";
		}
		StringBuilder retValue = new StringBuilder();
		for (int ix = 0; ix < length; ix++) {
			retValue.append(SOURCE_STR_ARRAY[rnd.nextInt(SOURCE_STR_ARRAY.length)]);
		}
		return retValue.toString();
	}

	public static String getStr(String value) {
		return StringUtils.defaultString(value);
	}

	public static int getInt(final String value, final int defaultValue) {
		return NumberUtils.toInt(value, defaultValue);
	}

	public static long getLong(final String value, final long defaultValue) {
		return NumberUtils.toLong(value, defaultValue);
	}

	public static float getFloat(final String value, final float defaultValue) {
		return NumberUtils.toFloat(value, defaultValue);
	}

	public static final String getStrYMD(final int type) {
		LocalDate now = LocalDate.now();
		if (type == IS_YEAR) {
			return String.valueOf(now.getYear());
		}
		if (type == IS_MONTH) {
			return StringUtils.leftPad(String.valueOf(now.getMonthValue()), 2, "0");
		}
		if (type == IS_DAY) {
			return StringUtils.leftPad(String.valueOf(now.getDayOfMonth()), 2, "0");
		}
		return String.valueOf(now.getYear());
	}

	public static boolean isDate(final String yyyymmdd) {
		if (yyyymmdd == null) {
			return false;
		}
		int y = 0, m = 0, d = 0;
		if (yyyymmdd.contains("/")) {
			String[] tmp = yyyymmdd.split("/");
			if (tmp.length == 3) {
				y = getInt(tmp[0], 0);
				m = getInt(tmp[1], 0);
				d = getInt(tmp[2], 0);
			}
		} else if (yyyymmdd.contains("-")) {
			String[] tmp = yyyymmdd.split("-");
			if (tmp.length == 3) {
				y = getInt(tmp[0], 0);
				m = getInt(tmp[1], 0);
				d = getInt(tmp[2], 0);
			}
		} else if (yyyymmdd.length() == 8) {
			y = getInt(yyyymmdd.substring(0, 4), 0);
			m = getInt(yyyymmdd.substring(4, 6), 0);
			d = getInt(yyyymmdd.substring(6, 8), 0);
		}

		if (y >= 1900 && y <= 9999 && m >= 1 && m <= 12 && d >= 1) {
			try {
				LocalDate.of(y, m, d);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		return false;
	}

	private static LocalDate parseLocalDate(String dateStr) {
		String cleanDate = getStrYMD(Strings.CS.replace(dateStr, "/", "-"), "-");
		if (cleanDate.length() == 4) {
			cleanDate += "-01-01";
		}
		return LocalDate.parse(cleanDate);
	}

	public static int getDaysBetween(String startDate, String endDate) {
		return (int) ChronoUnit.DAYS.between(parseLocalDate(startDate), parseLocalDate(endDate));
	}

	public static int getDaysBetween(Date startDate, Date endDate) {
		return getDaysBetween(getStrYMD(startDate, "-"), getStrYMD(endDate, "-"));
	}

	public static int getYearsBetween(String startDate, String endDate) {
		return (int) ChronoUnit.YEARS.between(parseLocalDate(startDate), parseLocalDate(endDate));
	}

	public static int getYearsBetween(Date startDate, Date endDate) {
		return (int) ChronoUnit.YEARS.between(startDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),
				endDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
	}

	public static int getMonthsBetween(String startDate, String endDate) {
		return (int) ChronoUnit.MONTHS.between(parseLocalDate(startDate), parseLocalDate(endDate));
	}

	public static int getMonthsBetween(Date startDate, Date endDate) {
		return getMonthsBetween(getStrYMD(startDate, "-"), getStrYMD(endDate, "-"));
	}

	public static final String getStrYMD(String splitStr) {
		return LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy" + splitStr + "MM" + splitStr + "dd"));
	}

	public static final String getStrYMD(Date date, String splitStr) {
		if (date == null)
			return "";
		return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate()
				.format(DateTimeFormatter.ofPattern("yyyy" + splitStr + "MM" + splitStr + "dd"));
	}

	public static final String getStrYMD(String yyyymmdd, String splitStr) {
		if (StringUtils.isBlank(splitStr) || !isDate(yyyymmdd) || yyyymmdd.length() != 8) {
			return yyyymmdd;
		}
		return yyyymmdd.substring(0, 4) + splitStr + yyyymmdd.substring(4, 6) + splitStr + yyyymmdd.substring(6, 8);
	}

	public static int getMaxDayOfMonth(final int year, final int month) {
		int y = (year >= 1900 && year <= 3000) ? year : 1900;
		int m = (month >= 1 && month <= 12) ? month : 1;
		return LocalDate.of(y, m, 1).lengthOfMonth();
	}

	public static int getDayOfWeek(final int year, final int month) {
		int y = (year >= 1900 && year <= 3000) ? year : 1900;
		int m = (month >= 1 && month <= 12) ? month : 1;
		// java.time DayOfWeek is 1 (Monday) to 7 (Sunday).
		// Calendar.DAY_OF_WEEK is 1 (Sunday) to 7 (Saturday).
		int dow = LocalDate.of(y, m, 1).getDayOfWeek().getValue();
		return (dow % 7) + 1;
	}

	/**
	 * yyyyMMdd 2013/01/01 20130101
	 * 
	 * @param yyyyMMdd
	 * @return
	 * @throws Exception
	 */
	public static Map<String, String> getQuarterlyStartEnd(String yyyyMMdd) throws IllegalArgumentException {
		String eMsg = "parameter error.";
		if (yyyyMMdd == null) {
			throw new IllegalArgumentException(eMsg);
		}
		String cleanDate = Strings.CS.replace(yyyyMMdd, "/", "");
		if (cleanDate.length() != 8 || !NumberUtils.isDigits(cleanDate)) {
			throw new IllegalArgumentException(eMsg);
		}
		int yyyy = Integer.parseInt(cleanDate.substring(0, 4));
		int mm = Integer.parseInt(cleanDate.substring(4, 6));
		String start, end;
		if (mm >= 1 && mm <= 3) {
			start = yyyy + "/01/01";
			end = yyyy + "/03/" + getMaxDayOfMonth(yyyy, 3);
		} else if (mm >= 4 && mm <= 6) {
			start = yyyy + "/04/01";
			end = yyyy + "/06/" + getMaxDayOfMonth(yyyy, 6);
		} else if (mm >= 7 && mm <= 9) {
			start = yyyy + "/07/01";
			end = yyyy + "/09/" + getMaxDayOfMonth(yyyy, 9);
		} else if (mm >= 10 && mm <= 12) {
			start = yyyy + "/10/01";
			end = yyyy + "/12/" + getMaxDayOfMonth(yyyy, 12);
		} else {
			throw new IllegalArgumentException(eMsg);
		}
		Map<String, String> dateMap = new HashMap<>();
		dateMap.put("date1", start);
		dateMap.put("date2", end);
		return dateMap;
	}

	public static String toHex(final String sourceValue) {
		return org.apache.commons.codec.binary.Hex.encodeHexString(getStr(sourceValue).getBytes());
	}

	public static String deHex(final String sourceValue) {
		try {
			return new String(org.apache.commons.codec.binary.Hex.decodeHex(getStr(sourceValue).toCharArray()));
		} catch (DecoderException e) {
			logger.error(e.getMessage(), e);
		}
		return "";
	}

	public static String toB64(final String sourceValue) {
		return Base64.getEncoder().encodeToString(getStr(sourceValue).getBytes());
	}

	public static String deB64(final String sourceValue) {
		return new String(Base64.getDecoder().decode(getStr(sourceValue)));
	}

	public static String getUUIDStr() {
		return Generators.timeBasedGenerator().generate().toString();
	}

	public static String getRandomUUIDStr() {
		return Generators.randomBasedGenerator().generate().toString();
	}

	public static byte[] toMD5(final String sourceValue) {
		return org.apache.commons.codec.digest.DigestUtils.md5(getStr(sourceValue));
	}

	public static String toMD5Hex(final String sourceValue) {
		return org.apache.commons.codec.digest.DigestUtils.md5Hex(getStr(sourceValue));
	}

	public static String joinString(Object... values) {
		if (values == null) {
			return "";
		}
		StringBuilder sb = new StringBuilder();
		for (Object o : values) {
			if (o != null) {
				sb.append(o);
			}
		}
		return sb.toString();
	}

	public static String toUnicode(String strValue) {
		if (strValue == null) {
			return "";
		}
		StringBuilder sb = new StringBuilder();
		for (char c : strValue.toCharArray()) {
			sb.append("&#").append((int) c).append(";");
		}
		return sb.toString();
	}

	public static <T extends java.io.Serializable> List<T> getListHashSet(List<T> list) {
		if (list == null) {
			return null;
		}
		return new ArrayList<>(new HashSet<>(list));
	}

	/**
	 * Decode string to image
	 * 
	 * @param imageString The string to decode
	 * @return decoded image
	 */
	public static BufferedImage decodeToImage(String imageString) {
		try (ByteArrayInputStream bis = new ByteArrayInputStream(Base64.getDecoder().decode(imageString))) {
			return ImageIO.read(bis);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
		return null;
	}

	/**
	 * Encode image to string
	 * 
	 * @param image The image to encode
	 * @param type  jpeg, bmp, ...
	 * @return encoded string
	 */
	public static String encodeToString(BufferedImage image, String type) {
		try (ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
			ImageIO.write(image, type, bos);
			return Base64.getEncoder().encodeToString(bos.toByteArray());
		} catch (IOException e) {
			logger.error(e.getMessage(), e);
		}
		return null;
	}

	public static String getPNGBase64Content(String imgStr) throws IOException {
		if (!isPNGBase64Content(imgStr)) {
			try (InputStream is = SimpleUtils.class.getClassLoader().getResource("resource/nofound-icon.html")
					.openStream()) {
				imgStr = new String(IOUtils.toByteArray(is));
			}
		}
		imgStr = Strings.CS.replaceOnce(imgStr, "<img src=\"data:image/png;base64,", "");
		imgStr = Strings.CS.replaceOnce(imgStr, "\">", "");
		imgStr = Strings.CS.replaceOnce(imgStr, "data:image/png;base64,", "");
		return imgStr;
	}

	public static boolean isPNGBase64Content(String imgStr) {
		if (imgStr == null || !imgStr.contains("image/png;base64,")) {
			return false;
		}
		return imgStr.length() >= 35;
	}

	/**
	 * http://stackoverflow.com/questions/12593752/why-do-i-failed-to-read-excel-2007-using-poi
	 * 
	 * @param inp
	 * @return
	 * @throws IOException
	 * @throws InvalidFormatException
	 */
	public static Workbook createPOIWorkbook(InputStream inp) throws IOException, InvalidFormatException {
		if (!inp.markSupported()) {
			inp = new PushbackInputStream(inp, 8);
		}
		if (FileMagic.valueOf(inp) == FileMagic.OLE2) {
			return new HSSFWorkbook(inp);
		}
		if (FileMagic.valueOf(inp) == FileMagic.OOXML) {
			return new XSSFWorkbook(OPCPackage.open(inp));
		}
		throw new IllegalArgumentException("Your InputStream was neither an OLE2 stream, nor an OOXML stream");
	}

	public static void setCellPicture(XSSFWorkbook wb, XSSFSheet sh, byte[] iconBytes, int row, int col) {
		int myPictureId = wb.addPicture(iconBytes, Workbook.PICTURE_TYPE_PNG);
		XSSFDrawing drawing = sh.createDrawingPatriarch();
		XSSFClientAnchor myAnchor = new XSSFClientAnchor();
		myAnchor.setCol1(col);
		myAnchor.setRow1(row);
		XSSFPicture myPicture = drawing.createPicture(myAnchor, myPictureId);
		myPicture.resize();
	}

	public static byte[] getColorRGB(String rgb) {
		if (StringUtils.isEmpty(rgb) || rgb.length() != 6) {
			return new byte[] { (byte) 0, (byte) 0, (byte) 0 };
		}
		int red = Integer.parseInt(rgb.substring(0, 2), 16);
		int green = Integer.parseInt(rgb.substring(2, 4), 16);
		int blue = Integer.parseInt(rgb.substring(4, 6), 16);
		return new byte[] { (byte) red, (byte) green, (byte) blue };
	}

	public static byte[] getColorRGB4POIColor(String srcRGB) {
		if (StringUtils.isEmpty(srcRGB) || (srcRGB.length() != 6 && srcRGB.length() != 7)) {
			return new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 0 };
		}
		String rgb = srcRGB.startsWith("#") ? srcRGB.substring(1) : srcRGB;
		int red = Integer.parseInt(rgb.substring(0, 2), 16);
		int green = Integer.parseInt(rgb.substring(2, 4), 16);
		int blue = Integer.parseInt(rgb.substring(4, 6), 16);
		return new byte[] { (byte) -1, (byte) red, (byte) green, (byte) blue };
	}

	public static int[] getColorRGB2(String color) {
		if (StringUtils.isEmpty(color) || color.length() != 7) {
			return new int[] { 0, 0, 0 };
		}
		Color c = Color.decode(color);
		return new int[] { c.getRed(), c.getGreen(), c.getBlue() };
	}

	public static String getHttpRequestUrl(HttpServletRequest request) {
		StringBuilder url = new StringBuilder();
		url.append(request.getRequestURL());
		Enumeration<String> paramNames = request.getParameterNames();
		for (int i = 0; paramNames.hasMoreElements(); i++) {
			String paramName = paramNames.nextElement();
			url.append(i == 0 ? "?" : "&").append(paramName).append("=").append(request.getParameter(paramName));
		}
		return url.toString();
	}

	public static int getAvailableProcessors(int maxSize) {
		int processors = Runtime.getRuntime().availableProcessors() - 1;
		if (processors > maxSize) {
			processors = maxSize;
		}
		return Math.max(processors, 1);
	}

	public static String getDateFormatOfyyyyMMddHHmmss(Date date) {
		if (null == date) {
			return "";
		}
		return dtfOfyyyyMMddHHmmss.format(date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime());
	}

	public static <T extends Comparable<T>> boolean isBetween(T value, T start, T end) {
		return value.compareTo(start) >= 0 && value.compareTo(end) <= 0;
	}

}
````

### `backend/base/src/main/java/org/qifu/util/TableMetadataModelUtils.java`

- Purpose: Utility; declares class TableMetadataModelUtils; has 1 detected methods; depends on 1 org.qifu local types
- Package: `org.qifu.util`
- Role: Utility
- Main types: `class TableMetadataModelUtils`
- Local dependencies: `org.qifu.base.model.TableMetadataModel`
- Third-party dependencies: `org.apache.commons.lang3.math.NumberUtils`
- Main methods:
  - L16 `public List<TableMetadataModel> build(String dataSourceId, String tableName)`
- Full path: `C:\home\qifu4\backend\base\src\main\java\org\qifu\util\TableMetadataModelUtils.java`
- Size: 1161 bytes

#### Source

````java
package org.qifu.util;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.math.NumberUtils;
import org.qifu.base.model.TableMetadataModel;

public class TableMetadataModelUtils {
	
	protected TableMetadataModelUtils() {
		throw new IllegalStateException("Utils class: TableMetadataModelUtils");
	}
	
	public static List<TableMetadataModel> build(String dataSourceId, String tableName) {
		List<TableMetadataModel> tableMetadataModelList = new LinkedList<>();
		try {
			Map<String, Map<String, String>> tableMetadataMap = DataUtils.getTableMetadataWithDoReleaseConnection(dataSourceId, tableName);
			for (Map.Entry<String, Map<String, String>> entry : tableMetadataMap.entrySet()) {
				Map<String, String> metadataMap = entry.getValue();
				TableMetadataModel model = new TableMetadataModel(
						metadataMap.get("COLUMN_NAME"), 
						metadataMap.get("TYPE_NAME"), 
						NumberUtils.toInt(metadataMap.get("COLUMN_SIZE"), 0));
				tableMetadataModelList.add(model);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tableMetadataModelList;
	}
	
}
````

### `backend/base/src/test/java/org/qifu/util/EncryptorUtilsTest.java`

- Purpose: Utility; declares class EncryptorUtilsTest; has 1 detected methods
- Package: `org.qifu.util`
- Role: Utility
- Main types: `class EncryptorUtilsTest`
- Key annotations: `Test`
- Third-party dependencies: `static org.junit.jupiter.api.Assertions.assertEquals`, `static org.junit.jupiter.api.Assertions.assertNotEquals`, `static org.junit.jupiter.api.Assertions.assertThrows`, `org.apache.commons.codec.binary.Base64`, `org.junit.jupiter.api.Test`
- Main methods:
  - L52 `private String createKey()`
- Main fields:
  - L14 `String KEY`
- Full path: `C:\home\qifu4\backend\base\src\test\java\org\qifu\util\EncryptorUtilsTest.java`
- Size: 1869 bytes

#### Source

````java
package org.qifu.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.security.SecureRandom;

import org.apache.commons.codec.binary.Base64;
import org.junit.jupiter.api.Test;

class EncryptorUtilsTest {

    private static final String KEY = createKey();

    @Test
    void encryptGcmRoundTripsUtf8Value() {
        String encrypted = EncryptorUtils.encryptGcm(KEY, "OpenAI API key: 測試");

        assertEquals("OpenAI API key: 測試", EncryptorUtils.decryptGcm(KEY, encrypted));
    }

    @Test
    void encryptGcmUsesRandomIv() {
        String first = EncryptorUtils.encryptGcm(KEY, "same-value");
        String second = EncryptorUtils.encryptGcm(KEY, "same-value");

        assertNotEquals(first, second);
    }

    @Test
    void decryptGcmRejectsTamperedCiphertext() {
        String encrypted = EncryptorUtils.encryptGcm(KEY, "secret");
        String[] parts = encrypted.split(":");
        byte[] ciphertext = java.util.Base64.getUrlDecoder().decode(parts[2]);
        ciphertext[0] ^= 1;
        String tampered = parts[0] + ":" + parts[1] + ":"
                + java.util.Base64.getUrlEncoder().withoutPadding().encodeToString(ciphertext);

        assertThrows(IllegalArgumentException.class,
                () -> EncryptorUtils.decryptGcm(KEY, tampered));
    }

    @Test
    void encryptGcmRejectsInvalidKeyLength() {
        String shortKey = Base64.encodeBase64String(new byte[8]);

        assertThrows(IllegalArgumentException.class,
                () -> EncryptorUtils.encryptGcm(shortKey, "secret"));
    }

    private static String createKey() {
        byte[] key = new byte[32];
        new SecureRandom().nextBytes(key);
        return Base64.encodeBase64String(key);
    }
}
````

## Properties Files Detailed Analysis

### `backend/base/.gradle/8.9/dependencies-accessors/gc.properties`

- Purpose: Java/Spring configuration resource for application, database, logging, runtime, or test settings.
- Key count: 0
- Full path: `C:\home\qifu4\backend\base\.gradle\8.9\dependencies-accessors\gc.properties`
- Size: 0 bytes

````properties
````

### `backend/base/.gradle/8.9/gc.properties`

- Purpose: Java/Spring configuration resource for application, database, logging, runtime, or test settings.
- Key count: 0
- Full path: `C:\home\qifu4\backend\base\.gradle\8.9\gc.properties`
- Size: 0 bytes

````properties
````

### `backend/base/.gradle/buildOutputCleanup/cache.properties`

- Purpose: Java/Spring configuration resource for application, database, logging, runtime, or test settings.
- Key count: 1
- Key prefixes: `gradle`
- Keys: `gradle.version`
- Full path: `C:\home\qifu4\backend\base\.gradle\buildOutputCleanup\cache.properties`
- Size: 51 bytes

````properties
#Fri Apr 24 07:39:41 CST 2026
gradle.version=8.9
````

### `backend/base/.gradle/vcs-1/gc.properties`

- Purpose: Java/Spring configuration resource for application, database, logging, runtime, or test settings.
- Key count: 0
- Full path: `C:\home\qifu4\backend\base\.gradle\vcs-1\gc.properties`
- Size: 0 bytes

````properties
````

### `backend/base/bin/main/appConfig.properties`

- Purpose: Java/Spring configuration resource for application, database, logging, runtime, or test settings.
- Key count: 25
- Key prefixes: `jasperreport`, `spring-mail-session`, `base`, `page`, `ldap`
- Keys: `jasperreport.source`, `jasperreport.owner`, `spring-mail-session.debug`, `base.errorContact`, `base.verMsg`, `base.jsVerBuild`, `base.loginCaptchaCodeEnable`, `base.mainSystem`, `base.system`, `base.uploadDir`, `base.enableControllerAuthCheckLog`, `base.enableServiceAuthChecLog`, `base.enableAlwaysRememberMe`, `page.jqXhrType`, `page.jqXhrTimeout`, `page.jqXhrCache`, `page.jqXhrAsync`, `page.maxUploadSize`, `ldap.loginEnable`, `ldap.contextUrl`, `ldap.contextBase`, `ldap.contextUserDn`, `ldap.contextPassword`, `ldap.searchFilter`, `ldap.authSearchBase`
- Full path: `C:\home\qifu4\backend\base\bin\main\appConfig.properties`
- Size: 964 bytes

````properties
# put jasperreport .jasper file folder, if product server set /var/core-app/jasperreport/
jasperreport.source=/var/core-app/jasperreport
jasperreport.owner=qifu3

spring-mail-session.debug=Y

# info config
base.errorContact=chen.xin.nien@gmail.com
base.verMsg=qifu3 0.1 TEST
base.jsVerBuild=0_1_TEST
base.loginCaptchaCodeEnable=N
base.mainSystem=CORE
base.system=CORE
base.uploadDir=/var/core-app/upload
base.enableControllerAuthCheckLog=Y
base.enableServiceAuthChecLog=N
base.enableAlwaysRememberMe=N

# page variable config
page.jqXhrType=POST
page.jqXhrTimeout=300000
page.jqXhrCache=N
page.jqXhrAsync=Y
page.maxUploadSize=8388608

# login setting
# "Y" login by LDAP / "N" login by DB
ldap.loginEnable=N
ldap.contextUrl=ldap://127.0.0.1:389
ldap.contextBase=dc=example,dc=com
ldap.contextUserDn=cn=admin
ldap.contextPassword=password1234
ldap.searchFilter=uid
# ou=MIS;ou=People ... , blank no effective
ldap.authSearchBase=
````

### `backend/base/src/main/resources/appConfig.properties`

- Purpose: Java/Spring configuration resource for application, database, logging, runtime, or test settings.
- Key count: 25
- Key prefixes: `jasperreport`, `spring-mail-session`, `base`, `page`, `ldap`
- Keys: `jasperreport.source`, `jasperreport.owner`, `spring-mail-session.debug`, `base.errorContact`, `base.verMsg`, `base.jsVerBuild`, `base.loginCaptchaCodeEnable`, `base.mainSystem`, `base.system`, `base.uploadDir`, `base.enableControllerAuthCheckLog`, `base.enableServiceAuthChecLog`, `base.enableAlwaysRememberMe`, `page.jqXhrType`, `page.jqXhrTimeout`, `page.jqXhrCache`, `page.jqXhrAsync`, `page.maxUploadSize`, `ldap.loginEnable`, `ldap.contextUrl`, `ldap.contextBase`, `ldap.contextUserDn`, `ldap.contextPassword`, `ldap.searchFilter`, `ldap.authSearchBase`
- Full path: `C:\home\qifu4\backend\base\src\main\resources\appConfig.properties`
- Size: 964 bytes

````properties
# put jasperreport .jasper file folder, if product server set /var/core-app/jasperreport/
jasperreport.source=/var/core-app/jasperreport
jasperreport.owner=qifu3

spring-mail-session.debug=Y

# info config
base.errorContact=chen.xin.nien@gmail.com
base.verMsg=qifu3 0.1 TEST
base.jsVerBuild=0_1_TEST
base.loginCaptchaCodeEnable=N
base.mainSystem=CORE
base.system=CORE
base.uploadDir=/var/core-app/upload
base.enableControllerAuthCheckLog=Y
base.enableServiceAuthChecLog=N
base.enableAlwaysRememberMe=N

# page variable config
page.jqXhrType=POST
page.jqXhrTimeout=300000
page.jqXhrCache=N
page.jqXhrAsync=Y
page.maxUploadSize=8388608

# login setting
# "Y" login by LDAP / "N" login by DB
ldap.loginEnable=N
ldap.contextUrl=ldap://127.0.0.1:389
ldap.contextBase=dc=example,dc=com
ldap.contextUserDn=cn=admin
ldap.contextPassword=password1234
ldap.searchFilter=uid
# ou=MIS;ou=People ... , blank no effective
ldap.authSearchBase=
````

### `backend/base/target/classes/appConfig.properties`

- Purpose: Java/Spring configuration resource for application, database, logging, runtime, or test settings.
- Key count: 25
- Key prefixes: `jasperreport`, `spring-mail-session`, `base`, `page`, `ldap`
- Keys: `jasperreport.source`, `jasperreport.owner`, `spring-mail-session.debug`, `base.errorContact`, `base.verMsg`, `base.jsVerBuild`, `base.loginCaptchaCodeEnable`, `base.mainSystem`, `base.system`, `base.uploadDir`, `base.enableControllerAuthCheckLog`, `base.enableServiceAuthChecLog`, `base.enableAlwaysRememberMe`, `page.jqXhrType`, `page.jqXhrTimeout`, `page.jqXhrCache`, `page.jqXhrAsync`, `page.maxUploadSize`, `ldap.loginEnable`, `ldap.contextUrl`, `ldap.contextBase`, `ldap.contextUserDn`, `ldap.contextPassword`, `ldap.searchFilter`, `ldap.authSearchBase`
- Full path: `C:\home\qifu4\backend\base\target\classes\appConfig.properties`
- Size: 964 bytes

````properties
# put jasperreport .jasper file folder, if product server set /var/core-app/jasperreport/
jasperreport.source=/var/core-app/jasperreport
jasperreport.owner=qifu3

spring-mail-session.debug=Y

# info config
base.errorContact=chen.xin.nien@gmail.com
base.verMsg=qifu3 0.1 TEST
base.jsVerBuild=0_1_TEST
base.loginCaptchaCodeEnable=N
base.mainSystem=CORE
base.system=CORE
base.uploadDir=/var/core-app/upload
base.enableControllerAuthCheckLog=Y
base.enableServiceAuthChecLog=N
base.enableAlwaysRememberMe=N

# page variable config
page.jqXhrType=POST
page.jqXhrTimeout=300000
page.jqXhrCache=N
page.jqXhrAsync=Y
page.maxUploadSize=8388608

# login setting
# "Y" login by LDAP / "N" login by DB
ldap.loginEnable=N
ldap.contextUrl=ldap://127.0.0.1:389
ldap.contextBase=dc=example,dc=com
ldap.contextUserDn=cn=admin
ldap.contextPassword=password1234
ldap.searchFilter=uid
# ou=MIS;ou=People ... , blank no effective
ldap.authSearchBase=
````

### `backend/base/target/classes/META-INF/maven/org.qifu/core-base/pom.properties`

- Purpose: Java/Spring configuration resource for application, database, logging, runtime, or test settings.
- Key count: 5
- Key prefixes: `artifactId`, `groupId`, `m2e`, `version`
- Keys: `artifactId`, `groupId`, `m2e.projectLocation`, `m2e.projectName`, `version`
- Full path: `C:\home\qifu4\backend\base\target\classes\META-INF\maven\org.qifu\core-base\pom.properties`
- Size: 220 bytes

````properties
#Generated by Maven Integration for Eclipse
#Tue Jun 23 20:10:33 CST 2026
artifactId=core-base
groupId=org.qifu
m2e.projectLocation=C\:\\home\\qifu4\\backend\\base
m2e.projectName=core-base
version=0.0.5-SNAPSHOT
````

### `backend/base/target/maven-archiver/pom.properties`

- Purpose: Java/Spring configuration resource for application, database, logging, runtime, or test settings.
- Key count: 3
- Key prefixes: `artifactId`, `groupId`, `version`
- Keys: `artifactId`, `groupId`, `version`
- Full path: `C:\home\qifu4\backend\base\target\maven-archiver\pom.properties`
- Size: 64 bytes

````properties
artifactId=core-base
groupId=org.qifu
version=0.0.5-SNAPSHOT
````

## JSON Files Detailed Analysis

### `backend/base/bin/main/org/qifu/base/message/BaseSystemMessage.json`

- Purpose: JSON configuration/resource data used by endpoints, publishing, permissions, messages, menu data, or tests.
- JSON root type: `object`
- Item/key count: 21
- Top-level keys: `MSG_BSE0001`, `MSG_BSE0002`, `MSG_UOS0001`, `MSG_UOS0002`, `MSG_UOS0003`, `MSG_UOS0004`, `MSG_DOS0001`, `MSG_DOS0002`, `MSG_DOS0003`, `MSG_DOS0004`, `MSG_DOS0005`, `MSG_DOS0006`, `MSG_DOS0007`, `MSG_DOS0008`, `MSG_DOS0009`, `MSG_DOS0010`, `MSG_STD0001`, `MSG_STD0002`, `MSG_STD0003`, `MSG_STD0004`, `MSG_STD0005`
- Full path: `C:\home\qifu4\backend\base\bin\main\org\qifu\base\message\BaseSystemMessage.json`
- Size: 877 bytes

````json
{ 
	"MSG_BSE0001" : "No permission!",
	"MSG_BSE0002" : "No sign-on system access denied!",
	"MSG_UOS0001" : "parameter cann't blank!",
	"MSG_UOS0002" : "parameter is incorrect!",
	"MSG_UOS0003" : "object null!",
	"MSG_UOS0004" : "Please try again!",
	"MSG_DOS0001" : "data no exist!",
	"MSG_DOS0002" : "data is exist!",
	"MSG_DOS0003" : "update data success!",
	"MSG_DOS0004" : "update data fail!",
	"MSG_DOS0005" : "insert data success!",
	"MSG_DOS0006" : "insert data fail!",
	"MSG_DOS0007" : "delete data success!",
	"MSG_DOS0008" : "delete data fail!",
	"MSG_DOS0009" : "search no data!",
	"MSG_DOS0010" : "Data to be used, and can not be deleted!",
	"MSG_STD0001" : "Login fail!",
	"MSG_STD0002" : "Upload a file type error!",
	"MSG_STD0003" : "Please select a file!",
	"MSG_STD0004" : "Please upload a image file!",
	"MSG_STD0005" : "Data errors!"
}
````

### `backend/base/bin/main/please-select-label-name.json`

- Purpose: JSON configuration/resource data used by endpoints, publishing, permissions, messages, menu data, or tests.
- JSON root type: `object`
- Item/key count: 2
- Top-level keys: `en`, `tw`
- Full path: `C:\home\qifu4\backend\base\bin\main\please-select-label-name.json`
- Size: 66 bytes

````json
{ 
	"en"		:	" - please select - ",
	"tw"		:	" - 請選擇 - "
}
````

### `backend/base/bin/main/token-store-config.json`

- Purpose: JSON configuration/resource data used by endpoints, publishing, permissions, messages, menu data, or tests.
- JSON root type: `object`
- Item/key count: 1
- Top-level keys: `table`
- Full path: `C:\home\qifu4\backend\base\bin\main\token-store-config.json`
- Size: 31 bytes

````json
{
	"table"	:	"tb_sys_token"
}
````

### `backend/base/src/main/resources/org/qifu/base/message/BaseSystemMessage.json`

- Purpose: JSON configuration/resource data used by endpoints, publishing, permissions, messages, menu data, or tests.
- JSON root type: `object`
- Item/key count: 21
- Top-level keys: `MSG_BSE0001`, `MSG_BSE0002`, `MSG_UOS0001`, `MSG_UOS0002`, `MSG_UOS0003`, `MSG_UOS0004`, `MSG_DOS0001`, `MSG_DOS0002`, `MSG_DOS0003`, `MSG_DOS0004`, `MSG_DOS0005`, `MSG_DOS0006`, `MSG_DOS0007`, `MSG_DOS0008`, `MSG_DOS0009`, `MSG_DOS0010`, `MSG_STD0001`, `MSG_STD0002`, `MSG_STD0003`, `MSG_STD0004`, `MSG_STD0005`
- Full path: `C:\home\qifu4\backend\base\src\main\resources\org\qifu\base\message\BaseSystemMessage.json`
- Size: 877 bytes

````json
{ 
	"MSG_BSE0001" : "No permission!",
	"MSG_BSE0002" : "No sign-on system access denied!",
	"MSG_UOS0001" : "parameter cann't blank!",
	"MSG_UOS0002" : "parameter is incorrect!",
	"MSG_UOS0003" : "object null!",
	"MSG_UOS0004" : "Please try again!",
	"MSG_DOS0001" : "data no exist!",
	"MSG_DOS0002" : "data is exist!",
	"MSG_DOS0003" : "update data success!",
	"MSG_DOS0004" : "update data fail!",
	"MSG_DOS0005" : "insert data success!",
	"MSG_DOS0006" : "insert data fail!",
	"MSG_DOS0007" : "delete data success!",
	"MSG_DOS0008" : "delete data fail!",
	"MSG_DOS0009" : "search no data!",
	"MSG_DOS0010" : "Data to be used, and can not be deleted!",
	"MSG_STD0001" : "Login fail!",
	"MSG_STD0002" : "Upload a file type error!",
	"MSG_STD0003" : "Please select a file!",
	"MSG_STD0004" : "Please upload a image file!",
	"MSG_STD0005" : "Data errors!"
}
````

### `backend/base/src/main/resources/please-select-label-name.json`

- Purpose: JSON configuration/resource data used by endpoints, publishing, permissions, messages, menu data, or tests.
- JSON root type: `object`
- Item/key count: 2
- Top-level keys: `en`, `tw`
- Full path: `C:\home\qifu4\backend\base\src\main\resources\please-select-label-name.json`
- Size: 66 bytes

````json
{ 
	"en"		:	" - please select - ",
	"tw"		:	" - 請選擇 - "
}
````

### `backend/base/src/main/resources/token-store-config.json`

- Purpose: JSON configuration/resource data used by endpoints, publishing, permissions, messages, menu data, or tests.
- JSON root type: `object`
- Item/key count: 1
- Top-level keys: `table`
- Full path: `C:\home\qifu4\backend\base\src\main\resources\token-store-config.json`
- Size: 31 bytes

````json
{
	"table"	:	"tb_sys_token"
}
````

### `backend/base/target/classes/org/qifu/base/message/BaseSystemMessage.json`

- Purpose: JSON configuration/resource data used by endpoints, publishing, permissions, messages, menu data, or tests.
- JSON root type: `object`
- Item/key count: 21
- Top-level keys: `MSG_BSE0001`, `MSG_BSE0002`, `MSG_UOS0001`, `MSG_UOS0002`, `MSG_UOS0003`, `MSG_UOS0004`, `MSG_DOS0001`, `MSG_DOS0002`, `MSG_DOS0003`, `MSG_DOS0004`, `MSG_DOS0005`, `MSG_DOS0006`, `MSG_DOS0007`, `MSG_DOS0008`, `MSG_DOS0009`, `MSG_DOS0010`, `MSG_STD0001`, `MSG_STD0002`, `MSG_STD0003`, `MSG_STD0004`, `MSG_STD0005`
- Full path: `C:\home\qifu4\backend\base\target\classes\org\qifu\base\message\BaseSystemMessage.json`
- Size: 877 bytes

````json
{ 
	"MSG_BSE0001" : "No permission!",
	"MSG_BSE0002" : "No sign-on system access denied!",
	"MSG_UOS0001" : "parameter cann't blank!",
	"MSG_UOS0002" : "parameter is incorrect!",
	"MSG_UOS0003" : "object null!",
	"MSG_UOS0004" : "Please try again!",
	"MSG_DOS0001" : "data no exist!",
	"MSG_DOS0002" : "data is exist!",
	"MSG_DOS0003" : "update data success!",
	"MSG_DOS0004" : "update data fail!",
	"MSG_DOS0005" : "insert data success!",
	"MSG_DOS0006" : "insert data fail!",
	"MSG_DOS0007" : "delete data success!",
	"MSG_DOS0008" : "delete data fail!",
	"MSG_DOS0009" : "search no data!",
	"MSG_DOS0010" : "Data to be used, and can not be deleted!",
	"MSG_STD0001" : "Login fail!",
	"MSG_STD0002" : "Upload a file type error!",
	"MSG_STD0003" : "Please select a file!",
	"MSG_STD0004" : "Please upload a image file!",
	"MSG_STD0005" : "Data errors!"
}
````

### `backend/base/target/classes/please-select-label-name.json`

- Purpose: JSON configuration/resource data used by endpoints, publishing, permissions, messages, menu data, or tests.
- JSON root type: `object`
- Item/key count: 2
- Top-level keys: `en`, `tw`
- Full path: `C:\home\qifu4\backend\base\target\classes\please-select-label-name.json`
- Size: 66 bytes

````json
{ 
	"en"		:	" - please select - ",
	"tw"		:	" - 請選擇 - "
}
````

### `backend/base/target/classes/token-store-config.json`

- Purpose: JSON configuration/resource data used by endpoints, publishing, permissions, messages, menu data, or tests.
- JSON root type: `object`
- Item/key count: 1
- Top-level keys: `table`
- Full path: `C:\home\qifu4\backend\base\target\classes\token-store-config.json`
- Size: 31 bytes

````json
{
	"table"	:	"tb_sys_token"
}
````

