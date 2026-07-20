# Qifu4 Backend App Module Java / Resource Analysis

Scope: `C:\home\qifu4\backend\app\**`.

## Summary

| Type | Count |
| --- | ---: |
| Java | 38 |
| Properties | 17 |
| JSON | 8 |

## Java Index

| File | Role | Type | Endpoints | Methods | Local Dependencies |
| --- | --- | --- | ---: | ---: | ---: |
| `backend/app/src/main/java/org/qifu/Application.java` | Java class | class Application | 0 | 5 | 1 |
| `backend/app/src/main/java/org/qifu/controller/BlankController.java` | MVC Controller | class BlankController | 5 | 5 | 1 |
| `backend/app/src/main/java/org/qifu/controller/CommonJasperReportController.java` | MVC Controller | class CommonJasperReportController | 1 | 0 | 9 |
| `backend/app/src/main/java/org/qifu/core/api/AuthController.java` | REST API Controller | class AuthController | 5 | 8 | 23 |
| `backend/app/src/main/java/org/qifu/core/api/BaseHelperApiController.java` | REST API Controller | class BaseHelperApiController | 2 | 1 | 8 |
| `backend/app/src/main/java/org/qifu/core/api/DashboardDemoController.java` | REST API Controller | class DashboardDemoController | 3 | 2 | 6 |
| `backend/app/src/main/java/org/qifu/core/api/HelloApiController.java` | REST API Controller | class HelloApiController | 4 | 3 | 5 |
| `backend/app/src/main/java/org/qifu/core/api/PROG001D0001Controller.java` | REST API Controller | class PROG001D0001Controller | 6 | 8 | 12 |
| `backend/app/src/main/java/org/qifu/core/api/PROG001D0002Controller.java` | REST API Controller | class PROG001D0002Controller | 6 | 8 | 12 |
| `backend/app/src/main/java/org/qifu/core/api/PROG001D0003Controller.java` | REST API Controller | class PROG001D0003Controller | 5 | 4 | 11 |
| `backend/app/src/main/java/org/qifu/core/api/PROG001D0004Controller.java` | REST API Controller | class PROG001D0004Controller | 9 | 13 | 14 |
| `backend/app/src/main/java/org/qifu/core/api/PROG001D0005Controller.java` | REST API Controller | class PROG001D0005Controller | 9 | 14 | 15 |
| `backend/app/src/main/java/org/qifu/core/api/PROG002D0001Controller.java` | REST API Controller | class PROG002D0001Controller | 10 | 14 | 14 |
| `backend/app/src/main/java/org/qifu/core/api/PROG002D0002Controller.java` | REST API Controller | class PROG002D0002Controller | 5 | 4 | 10 |
| `backend/app/src/main/java/org/qifu/core/api/PROG002D0003Controller.java` | REST API Controller | class PROG002D0003Controller | 4 | 3 | 10 |
| `backend/app/src/main/java/org/qifu/core/api/PROG004D0001Controller.java` | REST API Controller | class PROG004D0001Controller | 4 | 3 | 11 |
| `backend/app/src/main/java/org/qifu/core/api/PROG004D0002Controller.java` | REST API Controller | class PROG004D0002Controller | 3 | 2 | 10 |
| `backend/app/src/main/java/org/qifu/core/api/PROG005D0001Controller.java` | REST API Controller | class PROG005D0001Controller | 4 | 3 | 10 |
| `backend/app/src/main/java/org/qifu/core/config/AdditionConfig.java` | Spring configuration | class AdditionConfig | 0 | 0 | 0 |
| `backend/app/src/main/java/org/qifu/core/config/CxfConfig.java` | Spring configuration | class CxfConfig | 0 | 5 | 2 |
| `backend/app/src/main/java/org/qifu/core/config/LdapConfig.java` | Spring configuration | class LdapConfig | 0 | 2 | 2 |
| `backend/app/src/main/java/org/qifu/core/config/MqttBrokerConfig.java` | Spring configuration | class MqttBrokerConfig | 0 | 3 | 3 |
| `backend/app/src/main/java/org/qifu/core/config/MyBatisConfig.java` | Spring configuration | class MyBatisConfig | 0 | 6 | 0 |
| `backend/app/src/main/java/org/qifu/core/config/SwaggerConfig.java` | Spring configuration | class SwaggerConfig | 0 | 1 | 1 |
| `backend/app/src/main/java/org/qifu/core/config/WebConfig.java` | Spring configuration | class WebConfig | 0 | 4 | 3 |
| `backend/app/src/main/java/org/qifu/core/config/WebSecurityConfig.java` | Spring configuration | class WebSecurityConfig | 0 | 8 | 10 |
| `backend/app/src/main/java/org/qifu/core/filter/CsrfCookieFilter.java` | Java class | class CsrfCookieFilter | 0 | 1 | 2 |
| `backend/app/src/main/java/org/qifu/core/filter/JwtUserContextFilter.java` | Spring component | class JwtUserContextFilter | 0 | 3 | 8 |
| `backend/app/src/main/java/org/qifu/core/handler/CustomAccessDeniedHandler.java` | Spring component | class CustomAccessDeniedHandler | 0 | 0 | 0 |
| `backend/app/src/main/java/org/qifu/core/handler/SpaCsrfTokenRequestHandler.java` | Java class | class SpaCsrfTokenRequestHandler | 0 | 1 | 0 |
| `backend/app/src/main/java/org/qifu/core/support/AuthComponents.java` | Spring component | class AuthComponents | 0 | 7 | 8 |
| `backend/app/src/main/java/org/qifu/core/vo/LoginRequest.java` | DTO/VO/model | class LoginRequest | 0 | 8 | 0 |
| `backend/app/src/main/java/org/qifu/core/vo/TestModel.java` | DTO/VO/model | class TestModel | 0 | 4 | 0 |
| `backend/app/src/main/java/org/qifu/core/webservice/impl/TestServiceImpl.java` | Spring component, SOAP/WebService | class TestServiceImpl | 0 | 2 | 2 |
| `backend/app/src/main/java/org/qifu/core/webservice/ITestService.java` | SOAP/WebService | interface ITestService | 0 | 0 | 0 |
| `backend/app/src/main/java/org/qifu/ServletInitializer.java` | Java class | class ServletInitializer | 0 | 1 | 0 |
| `backend/app/src/test/java/org/qifu/test/DatabasePasswordJasyptTest.java` | Test | class DatabasePasswordJasyptTest, class TestApplication | 0 | 4 | 0 |
| `backend/app/src/test/java/org/qifu/test/MqttIntegrationTest.java` | Test | class MqttIntegrationTest | 0 | 2 | 1 |

## Java Files Detailed Analysis

### `backend/app/src/main/java/org/qifu/Application.java`

- Purpose: Java class; declares class Application; has 5 detected methods; depends on 1 org.qifu local types
- Package: `org.qifu`
- Role: Java class
- Main types: `class Application`
- Key annotations: `SpringBootApplication`, `ComponentScan`, `EnableWebMvc`, `EnableAutoConfiguration`, `EnableCaching`, `EnableScheduling`, `EnableEncryptableProperties`, `PropertySource`, `Resource`, `Bean`
- Local dependencies: `org.qifu.base.AppContext`
- Spring dependencies: `org.springframework.boot.CommandLineRunner`, `org.springframework.boot.SpringApplication`, `org.springframework.boot.autoconfigure.EnableAutoConfiguration`, `org.springframework.boot.autoconfigure.SpringBootApplication`, `org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration`, `org.springframework.cache.annotation.EnableCaching`, `org.springframework.context.ApplicationContext`, `org.springframework.context.ConfigurableApplicationContext`, `org.springframework.context.annotation.Bean`, `org.springframework.context.annotation.ComponentScan`, `org.springframework.context.annotation.PropertySource`, `org.springframework.scheduling.annotation.EnableScheduling`, `org.springframework.web.servlet.config.annotation.EnableWebMvc`
- Third-party dependencies: `com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties`, `org.slf4j.Logger`, `org.slf4j.LoggerFactory`
- Injection/config points:
  - L70 `@Resource` -> `public void setDataSource(DataSource dataSource) {`
- Main methods:
  - L66 `public DataSource getDataSource()`
  - L71 `public void setDataSource(DataSource dataSource)`
  - L75 `public ApplicationContext getContext()`
  - L79 `public void main(String[] args)`
  - L86 `public CommandLineRunner commandLineRunner(ApplicationContext ctx)`
- Main fields:
  - L60 `Logger logger`
  - L62 `ApplicationContext context`
  - L64 `DataSource dataSource`
- Full path: `C:\home\qifu4\backend\app\src\main\java\org\qifu\Application.java`
- Size: 3642 bytes

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
package org.qifu;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Arrays;

import javax.sql.DataSource;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

import org.qifu.base.AppContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import jakarta.annotation.Resource;

@SpringBootApplication
@ComponentScan("org.qifu.*")
@EnableWebMvc
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@EnableCaching
@EnableScheduling
@EnableEncryptableProperties
@PropertySource("classpath:appConfig.properties")
public class Application {
	protected static Logger logger = LoggerFactory.getLogger(Application.class);
	
	private static ApplicationContext context;
	
	private DataSource dataSource;	
	
	public DataSource getDataSource() {
		return dataSource;
	}
	
	@Resource(name = "dataSource")
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public static ApplicationContext getContext() {
		return context;
	}
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		AppContext.init(context);
		Application.context = context;
	}
	
    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
    	
    	logger.info("test DataBase connection....");
		try (Connection connection = this.dataSource.getConnection()) {		
			logger.info("DataBase [{}] connection success.", connection.getCatalog());
		} catch (SQLException e) {
			e.printStackTrace();
			logger.warn("*** FAIL ***, test DataBase connection....");
		}
		
        return args -> {
        	logger.info("Let's inspect the beans provided by Spring Boot:");
            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
            	logger.info(beanName);
            }
        };
    }		
	
}
````

### `backend/app/src/main/java/org/qifu/controller/BlankController.java`

- Purpose: MVC Controller; declares class BlankController; defines 5 web mappings; has 5 detected methods; depends on 1 org.qifu local types
- Package: `org.qifu.controller`
- Role: MVC Controller
- Main types: `class BlankController`
- Key annotations: `Controller`, `RequestMapping`, `GetMapping`
- Local dependencies: `org.qifu.base.Constants`
- Spring dependencies: `org.springframework.stereotype.Controller`, `org.springframework.ui.ModelMap`, `org.springframework.web.bind.annotation.GetMapping`, `org.springframework.web.bind.annotation.RequestMapping`
- Web/API mappings:
  - L19 `@RequestMapping("/")` -> method `indexPage`
  - L24 `@GetMapping(value = "/", produces = "application/json")` -> method `indexGet`
  - L36 `@RequestMapping("/loginPage")` -> method `loginPage`
  - L41 `@RequestMapping("/loginAgainPage")` -> method `loginAgainPage`
  - L46 `@RequestMapping("/noAuthPage")` -> method `noAuthPage`
- Main methods:
  - L20 `public String indexPage(ModelMap mm, HttpServletRequest request, HttpServletResponse response)`
  - L25 `public String indexGet(ModelMap mm, HttpServletRequest request, HttpServletResponse response)`
  - L37 `public String loginPage(ModelMap mm, HttpServletRequest request)`
  - L42 `public String loginAgainPage(ModelMap mm, HttpServletRequest request)`
  - L47 `public String noAuthPage(ModelMap mm, HttpServletRequest request)`
- Main fields:
  - L17 `String VIEW_BLANK`
- Full path: `C:\home\qifu4\backend\app\src\main\java\org\qifu\controller\BlankController.java`
- Size: 1463 bytes

#### Source

````java
package org.qifu.controller;

import java.io.IOException;

import org.qifu.base.Constants;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class BlankController {
	
	private static final String VIEW_BLANK = "view/blank";
	
	@RequestMapping("/")
	public String indexPage(ModelMap mm, HttpServletRequest request, HttpServletResponse response) {
		return VIEW_BLANK;
	}
	
	@GetMapping(value = "/", produces = "application/json")
	public String indexGet(ModelMap mm, HttpServletRequest request, HttpServletResponse response) {
		try {
			response.getWriter().print(Constants.NO_LOGIN_JSON_DATA);
			response.getWriter().flush();
			response.getWriter().close();			
		} catch (IOException e) {
			e.printStackTrace();
		}		
		return null;
	}	
	
	@RequestMapping("/loginPage")
	public String loginPage(ModelMap mm, HttpServletRequest request) {
		return VIEW_BLANK;
	}
	
	@RequestMapping("/loginAgainPage")
	public String loginAgainPage(ModelMap mm, HttpServletRequest request) {
		return VIEW_BLANK;
	}	
	
	@RequestMapping("/noAuthPage")
	public String noAuthPage(ModelMap mm, HttpServletRequest request) {
		return VIEW_BLANK;
	}
	
}
````

### `backend/app/src/main/java/org/qifu/controller/CommonJasperReportController.java`

- Purpose: MVC Controller; declares class CommonJasperReportController; defines 1 web mappings; depends on 9 org.qifu local types
- Package: `org.qifu.controller`
- Role: MVC Controller
- Main types: `class CommonJasperReportController`
- Key annotations: `Controller`, `ControllerMethodAuthority`, `RequestMapping`, `RequestParam`
- Local dependencies: `org.qifu.base.Constants`, `org.qifu.base.exception.ControllerException`, `org.qifu.base.exception.ServiceException`, `org.qifu.base.model.ControllerMethodAuthority`, `org.qifu.base.model.YesNoKeyProvide`, `org.qifu.base.support.TokenStoreValidateBuilder`, `org.qifu.base.util.TokenBuilderUtils`, `org.qifu.core.util.CookieUtils`, `org.qifu.core.util.JReportUtils`
- Spring dependencies: `org.springframework.stereotype.Controller`, `org.springframework.ui.ModelMap`, `org.springframework.web.bind.annotation.RequestMapping`, `org.springframework.web.bind.annotation.RequestParam`
- Third-party dependencies: `org.apache.commons.io.IOUtils`, `org.apache.commons.lang3.StringUtils`, `com.auth0.jwt.interfaces.Claim`
- Web/API mappings:
  - L61 `@RequestMapping(value = "/commonOpenJasperReport")` -> method `processReport`
- Main fields:
  - L54 `DataSource dataSource`
- Full path: `C:\home\qifu4\backend\app\src\main\java\org\qifu\controller\CommonJasperReportController.java`
- Size: 3466 bytes

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
package org.qifu.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.qifu.base.Constants;
import org.qifu.base.exception.ControllerException;
import org.qifu.base.exception.ServiceException;
import org.qifu.base.model.ControllerMethodAuthority;
import org.qifu.base.model.YesNoKeyProvide;
import org.qifu.base.support.TokenStoreValidateBuilder;
import org.qifu.base.util.TokenBuilderUtils;
import org.qifu.core.util.CookieUtils;
import org.qifu.core.util.JReportUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.auth0.jwt.interfaces.Claim;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class CommonJasperReportController {

	private final DataSource dataSource;
	public CommonJasperReportController(DataSource dataSource) {
		super();
		this.dataSource = dataSource;
	}
	
	@ControllerMethodAuthority(check = false, programId = "CORE_PROGCOMM")
	@RequestMapping(value = "/commonOpenJasperReport")
	public String processReport(ModelMap mm, HttpServletRequest request, HttpServletResponse response, 
			@RequestParam("jreportId") String jreportId) throws IOException {
		try {
			String qifutoken = StringUtils.defaultString(request.getParameter("qifutoken"));
			if (StringUtils.isBlank(qifutoken) || YesNoKeyProvide.YES.equals(qifutoken)) {
				qifutoken = StringUtils.defaultString(CookieUtils.getCookieValue(request, Constants.TOKEN_ACCESS_COOKIE_NAME));
			}
			TokenStoreValidateBuilder tsv = TokenStoreValidateBuilder.build(this.dataSource);
			Map<String, Claim> claimToken = TokenBuilderUtils.verifyToken(qifutoken.replaceFirst(Constants.TOKEN_PREFIX, "").replace(" ", ""), tsv);
			if (!TokenBuilderUtils.existsInfo(claimToken)) {
				byte[] blankPdfData;
				try (InputStream is = CommonJasperReportController.class.getClassLoader().getResource( "qifu4blank.pdf" ).openStream()) {
					blankPdfData = IOUtils.toByteArray(is);
				}
				response.setContentType("application/pdf");
				response.getOutputStream().write(blankPdfData);
				response.flushBuffer();
				return null;
			}
			JReportUtils.fillReportToResponse(
					jreportId, 
					request, 
					response);
		} catch (ServiceException | ControllerException e) {
			e.printStackTrace();
		} 
		return null;
	}
	
}
````

### `backend/app/src/main/java/org/qifu/core/api/AuthController.java`

- Purpose: REST API Controller; declares class AuthController; defines 5 web mappings; has 8 detected methods; depends on 23 org.qifu local types
- Package: `org.qifu.core.api`
- Role: REST API Controller
- Main types: `class AuthController`
- Key annotations: `RestController`, `RequestMapping`, `PostMapping`
- Local dependencies: `org.qifu.base.Constants`, `org.qifu.base.exception.ControllerException`, `org.qifu.base.exception.ServiceException`, `org.qifu.base.message.BaseSystemMessage`, `org.qifu.base.model.RolePermissionAttr`, `org.qifu.base.model.TokenBuilderVariable`, `org.qifu.base.model.YesNoKeyProvide`, `org.qifu.base.support.TokenStoreBuilder`, `org.qifu.base.support.TokenStoreValidate`, `org.qifu.base.support.TokenStoreValidateBuilder`, `org.qifu.base.util.TokenBuilderUtils`, `org.qifu.core.entity.TbAccount`, `org.qifu.core.entity.TbRolePermission`, `org.qifu.core.entity.TbSysCode`, `org.qifu.core.entity.TbUserRole`, `org.qifu.core.model.PermissionType`, `org.qifu.core.model.User`, `org.qifu.core.service.ISysCodeService`, `org.qifu.core.support.AuthComponents`, `org.qifu.core.util.CookieUtils`, `org.qifu.core.util.UserUtils`, `org.qifu.core.vo.LoginRequest`, `org.qifu.core.entity.TbSysLoginLog`
- Spring dependencies: `org.springframework.http.HttpStatus`, `org.springframework.http.ResponseEntity`, `org.springframework.security.authentication.UsernamePasswordAuthenticationToken`, `org.springframework.security.core.Authentication`, `org.springframework.security.core.AuthenticationException`, `org.springframework.security.core.context.SecurityContextHolder`, `org.springframework.web.bind.annotation.PostMapping`, `org.springframework.web.bind.annotation.RequestBody`, `org.springframework.web.bind.annotation.RequestMapping`, `org.springframework.web.bind.annotation.RestController`
- Third-party dependencies: `org.apache.commons.lang3.StringUtils`, `org.slf4j.Logger`, `org.slf4j.LoggerFactory`, `com.auth0.jwt.interfaces.Claim`
- Web/API mappings:
  - L56 `@RequestMapping("/api/auth")`
  - L73 `@PostMapping("/validLogined")` -> method `validCheck`
  - L147 `@PostMapping("/signin")` -> method `authenticateUser`
  - L221 `@PostMapping("/refreshNewToken")` -> method `refreshNewToken`
  - L270 `@PostMapping("/logout")` -> method `logout`
- Main methods:
  - L74 `public ResponseEntity<User> validCheck(@Valid @RequestBody LoginRequest loginRequest, HttpServletRequest request, HttpServletResponse response)`
  - L114 `private User processOfValidCheck(String userId, LoginRequest loginRequest)`
  - L148 `public ResponseEntity<User> authenticateUser(@Valid @RequestBody LoginRequest loginRequest, HttpServletRequest request, HttpServletResponse response)`
  - L192 `private void checkAccountLocked(String username)`
  - L210 `private void logLoginFail(String username)`
  - L222 `public ResponseEntity<LoginRequest> refreshNewToken(@Valid @RequestBody LoginRequest loginRequest, HttpServletRequest request, HttpServletResponse response)`
  - L271 `public ResponseEntity<String> logout(HttpServletRequest request, HttpServletResponse response)`
  - L278 `private void maskTokens(User user)`
- Main fields:
  - L58 `Logger logger`
  - L60 `DataSource dataSource`
  - L62 `ISysCodeService<TbSysCode, String> sysCodeService`
  - L64 `AuthComponents authComponents`
- Full path: `C:\home\qifu4\backend\app\src\main\java\org\qifu\core\api\AuthController.java`
- Size: 12936 bytes

#### Source

````java
package org.qifu.core.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.commons.lang3.StringUtils;
import org.qifu.base.Constants;
import org.qifu.base.exception.ControllerException;
import org.qifu.base.exception.ServiceException;
import org.qifu.base.message.BaseSystemMessage;
import org.qifu.base.model.RolePermissionAttr;
import org.qifu.base.model.TokenBuilderVariable;
import org.qifu.base.model.YesNoKeyProvide;
import org.qifu.base.support.TokenStoreBuilder;
import org.qifu.base.support.TokenStoreValidate;
import org.qifu.base.support.TokenStoreValidateBuilder;
import org.qifu.base.util.TokenBuilderUtils;
import org.qifu.core.entity.TbAccount;
import org.qifu.core.entity.TbRolePermission;
import org.qifu.core.entity.TbSysCode;
import org.qifu.core.entity.TbUserRole;
import org.qifu.core.model.PermissionType;
import org.qifu.core.model.User;
import org.qifu.core.service.ISysCodeService;
import org.qifu.core.support.AuthComponents;
import org.qifu.core.util.CookieUtils;
import org.qifu.core.util.UserUtils;
import org.qifu.core.vo.LoginRequest;
import org.qifu.core.entity.TbSysLoginLog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.auth0.jwt.interfaces.Claim;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;

import java.util.Date;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
	private static final Logger logger = LoggerFactory.getLogger(AuthController.class);
	
	private final DataSource dataSource;
	
	private final ISysCodeService<TbSysCode, String> sysCodeService;
	
	private final AuthComponents authComponents;
	
	public AuthController(DataSource dataSource, ISysCodeService<TbSysCode, String> sysCodeService, AuthComponents authComponents) {
		super();
		this.dataSource = dataSource;
		this.sysCodeService = sysCodeService;
		this.authComponents = authComponents;
	}
	
	@PostMapping("/validLogined")
	public ResponseEntity<User> validCheck(@Valid @RequestBody LoginRequest loginRequest, HttpServletRequest request, HttpServletResponse response) {
		User user = null;
	    try {
	    	String accessToken = loginRequest.getAccessToken();
	    	String refreshToken = loginRequest.getRefreshToken();
	    	if (StringUtils.isBlank(accessToken) || YesNoKeyProvide.YES.equals(accessToken)) {
	    		accessToken = CookieUtils.getCookieValue(request, Constants.TOKEN_ACCESS_COOKIE_NAME);
	    	}
	    	if (StringUtils.isBlank(refreshToken) || YesNoKeyProvide.YES.equals(refreshToken)) {
	    		refreshToken = CookieUtils.getCookieValue(request, Constants.TOKEN_REFRESH_COOKIE_NAME);
	    	}
	    	
	    	TokenStoreValidate tsv = new TokenStoreValidateBuilder(this.dataSource);
	    	if (TokenBuilderUtils.verifyRefresh(refreshToken, tsv)) {
	    		Map<String,Claim> userMapClaim = TokenBuilderUtils.verifyToken(accessToken, tsv);
	    		if (userMapClaim != null) {
	    			String userId = StringUtils.defaultString( userMapClaim.get(Constants.TOKEN_USER_PARAM_NAME).asString() );
					if (StringUtils.isNotBlank(userId)) {
						loginRequest.setAccessToken(accessToken);
						loginRequest.setRefreshToken(refreshToken);
						user = this.processOfValidCheck(userId, loginRequest);
					}	    			
	    		}
	    	}	    	
	    } catch (AuthenticationException | ServiceException e) {
	    	logger.error("Authentication/Service error in validCheck: {}", e.getMessage());
	    	throw e;
		}  catch (Exception e) {
			logger.error("Unexpected error in validCheck: ", e);
		}		
	    if (null == user) {
	    	user = new User(StringUtils.EMPTY, StringUtils.EMPTY, YesNoKeyProvide.NO);
	    	user.setAccessToken(StringUtils.EMPTY);
	    	user.setRefreshToken(StringUtils.EMPTY);
	    } else {
	    	maskTokens(user);
	    }
	    return ResponseEntity.ok().body(user);
	}
	
	private User processOfValidCheck(String userId, LoginRequest loginRequest) throws ServiceException {
		Map<String, Object> param = new HashMap<>();
		param.put("account", userId);
		List<String> roleIds = new ArrayList<>();
		Map<String, List<RolePermissionAttr>> rolePermissionMap = new HashMap<>();
		
		List<TbUserRole> urList = this.authComponents.getUserRoleService().selectListByParams(param).getValue();
		for (TbUserRole ur : urList) {
			roleIds.add(ur.getRole());
			param.clear();
			param.put("role", ur.getRole());
			List<TbRolePermission> rpList = this.authComponents.getRolePermissionService().selectListByParams(param).getValue();
			rolePermissionMap.put(ur.getRole(), new ArrayList<>());
			List<RolePermissionAttr> permList = rolePermissionMap.get(ur.getRole());
			for (TbRolePermission rp : rpList) {
				if (PermissionType.VIEW.name().equals(rp.getPermType())) {
					RolePermissionAttr rpa = new RolePermissionAttr();
					rpa.setPermission(rp.getPermission());
					rpa.setType(rp.getPermType());
					permList.add(rpa);
				}
			}
		}
		
		User user = UserUtils.setUserInfoForUserLocalUtils( userId, roleIds, rolePermissionMap );
		TbAccount acc = new TbAccount();
		acc.setAccount(userId);
		authComponents.getAccountService().selectByUniqueKey(acc).getValueEmptyThrowMessage();											
		user.setAccessToken(loginRequest.getAccessToken());
		user.setRefreshToken(loginRequest.getRefreshToken());	
		return user;
	}
	
	@PostMapping("/signin")
	public ResponseEntity<User> authenticateUser(@Valid @RequestBody LoginRequest loginRequest, HttpServletRequest request, HttpServletResponse response) {
		// 1. Check if account is locked
		checkAccountLocked(loginRequest.getUsername());

		TokenBuilderVariable tbv = null;
		User user = null;
	    try {
			request.setAttribute(Constants.HTTP_REQUEST_PASSWORD_AUTH, loginRequest.getPassword());
		    Authentication authentication = authComponents.getAuthenticationManager().authenticate(
		    		new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));
		    SecurityContextHolder.getContext().setAuthentication(authentication);
		    user = (User) authentication.getPrincipal();
		    
		    TbSysCode sysCode = new TbSysCode();
		    sysCode.setCode(Constants.SYSCODE_TOKEN_CODE);		    
			sysCode = sysCodeService.selectByUniqueKey(sysCode).getValue();
			
			if (null != sysCode && Constants.SYSCODE_TOKEN_TYPE.equals(sysCode.getType()) && StringUtils.isNotBlank(sysCode.getParam1())) {								
			    tbv = TokenBuilderUtils.createToken(user.getUserId(), Constants.TOKEN_AUTH, sysCode.getParam1(), TokenStoreBuilder.build(this.dataSource));
				maskTokens(user);
				CookieUtils.setTokenCookie(response, Constants.TOKEN_ACCESS_COOKIE_NAME, tbv.getAccess(), Constants.TOKEN_ACCESS_EXPIRED_INTERVAL);
				CookieUtils.setTokenCookie(response, Constants.TOKEN_REFRESH_COOKIE_NAME, tbv.getRefresh(), Constants.TOKEN_REFRESH_EXPIRED_INTERVAL);
				user.blankPassword();
				this.authComponents.getJwtAuthLoginedUserRoleService().onLoginedSuccess(authentication);
			}
	    } catch (AuthenticationException | ServiceException e) {
	    	logLoginFail(loginRequest.getUsername());
	    	logger.warn("Login failed for user {}: {}", loginRequest.getUsername(), e.getMessage());
	    	throw e;
		}  catch (Exception e) {
	    	logLoginFail(loginRequest.getUsername());
	    	logger.error("Login unexpected error for user {}: ", loginRequest.getUsername(), e);
		}		
	    
	    if (null == user || null == tbv) {
	    	user = (user == null) ? new User(StringUtils.EMPTY, StringUtils.EMPTY, YesNoKeyProvide.NO) : user;
	    	user.setAccessToken(StringUtils.EMPTY);
	    	user.setRefreshToken(StringUtils.EMPTY);
	    	user.blankPassword();
	    	user.setUserId(StringUtils.EMPTY);
	    }
	    return ResponseEntity.ok().body(user);
	}
	
	private void checkAccountLocked(String username) {
		if (StringUtils.isBlank(username)) {
			logger.warn("Account {} is blank.", username);
			throw new AuthenticationException("Account is blank.") {};
		}
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("user", username);
		paramMap.put("failFlag", YesNoKeyProvide.YES);
		// Find logs within the last 5 minutes
		paramMap.put("cdateStart", this.authComponents.getWithinTheLast5Minutes());
		
		Long failCount = this.authComponents.getSysLoginLogService().count(paramMap);
		if (failCount != null && failCount >= AuthComponents.MAX_FAIL_COUNT) {
			logger.warn("Account {} is locked due to multiple failed login attempts.", username);
			throw new AuthenticationException("Account is locked due to multiple failed login attempts. Please try again later.") {};
		}
	}
	
	private void logLoginFail(String username) {
    	TbSysLoginLog log = new TbSysLoginLog();
    	log.setUser(username);
    	log.setCdate(new Date());
    	try {
			this.authComponents.getSysLoginLogService().insertLoginFailLog(log);
		} catch (Exception e) {
			logger.error("Failed to insert login fail log for user {}: ", username, e);
		}
	}
	
	@PostMapping("/refreshNewToken")
	public ResponseEntity<LoginRequest> refreshNewToken(@Valid @RequestBody LoginRequest loginRequest, HttpServletRequest request, HttpServletResponse response) {
		LoginRequest res = new LoginRequest();
		boolean refreshSuccess = false;
	    try {
	    	String refreshToken = loginRequest.getRefreshToken();
	    	if (StringUtils.isBlank(refreshToken) || YesNoKeyProvide.YES.equals(refreshToken)) {
	    		refreshToken = CookieUtils.getCookieValue(request, Constants.TOKEN_REFRESH_COOKIE_NAME);
	    	}
	    	
	    	if (StringUtils.isBlank(refreshToken)) {
	    		throw new ControllerException( BaseSystemMessage.parameterBlank() );
	    	}
	    	
	    	TokenStoreValidateBuilder tsv = TokenStoreValidateBuilder.build(this.dataSource);
	    	if (tsv.refreshValidate(refreshToken)) {
	    		String userId = StringUtils.defaultIfBlank(loginRequest.getUsername(), tsv.getUserIdByRefreshToken(refreshToken));
	    		if (StringUtils.isBlank(userId)) {
	    			throw new ControllerException( BaseSystemMessage.parameterBlank() );
	    		}
	    		
			    TbSysCode sysCode = new TbSysCode();
			    sysCode.setCode(Constants.SYSCODE_TOKEN_CODE);	
			    sysCode = sysCodeService.selectByUniqueKey(sysCode).getValue();
			    
			    if (null != sysCode && Constants.SYSCODE_TOKEN_TYPE.equals(sysCode.getType()) && StringUtils.isNotBlank(sysCode.getParam1())) {
			    	TokenBuilderVariable tbv = TokenBuilderUtils.createToken(userId, Constants.TOKEN_AUTH, sysCode.getParam1(), TokenStoreBuilder.build(this.dataSource));
			    	res.setAccessToken(YesNoKeyProvide.YES);
			    	res.setRefreshToken(YesNoKeyProvide.YES);
			    	CookieUtils.setTokenCookie(response, Constants.TOKEN_ACCESS_COOKIE_NAME, tbv.getAccess(), Constants.TOKEN_ACCESS_EXPIRED_INTERVAL);
			    	CookieUtils.setTokenCookie(response, Constants.TOKEN_REFRESH_COOKIE_NAME, tbv.getRefresh(), Constants.TOKEN_REFRESH_EXPIRED_INTERVAL);
			    	res.setUsername(userId);
			    	refreshSuccess = true;
			    	logger.info("Successfully refreshed token for user {}", userId);
			    }
	    	}
	    } catch (AuthenticationException | ControllerException | ServiceException e) {
	    	logger.warn("Token refresh failed: {}", e.getMessage());
	    	throw e;
		}  catch (Exception e) {
			logger.error("Token refresh unexpected error: ", e);
		}
	    
	    if (refreshSuccess) {
	    	return ResponseEntity.ok().body(res);
	    }
	    return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(res);
	}	
	
	@PostMapping("/logout")
	public ResponseEntity<String> logout(HttpServletRequest request, HttpServletResponse response) {
		CookieUtils.setTokenCookie(response, Constants.TOKEN_ACCESS_COOKIE_NAME, StringUtils.EMPTY, 0);
		CookieUtils.setTokenCookie(response, Constants.TOKEN_REFRESH_COOKIE_NAME, StringUtils.EMPTY, 0);
		logger.info("User logged out and cookies cleared.");
		return ResponseEntity.ok().body("OK");
	}
	
	private void maskTokens(User user) {
		if (user != null) {
			user.setAccessToken(YesNoKeyProvide.YES);
			user.setRefreshToken(YesNoKeyProvide.YES);
		}
	}
	
}
````

### `backend/app/src/main/java/org/qifu/core/api/BaseHelperApiController.java`

- Purpose: REST API Controller; declares class BaseHelperApiController; defines 2 web mappings; has 1 detected methods; depends on 8 org.qifu local types
- Package: `org.qifu.core.api`
- Role: REST API Controller
- Main types: `class BaseHelperApiController extends CoreApiSupport`
- Key annotations: `Tag`, `RestController`, `RequestMapping`, `Operation`, `PostMapping`
- Local dependencies: `org.qifu.base.model.QueryResult`, `org.qifu.core.entity.TbSysMenu`, `org.qifu.core.entity.TbSysProg`, `org.qifu.core.service.ISysMenuService`, `org.qifu.core.service.ISysProgService`, `org.qifu.core.util.CoreApiSupport`, `org.qifu.core.util.UserUtils`, `org.qifu.core.vo.ProgramAndMenuResult`
- Spring dependencies: `org.springframework.http.MediaType`, `org.springframework.web.bind.annotation.PostMapping`, `org.springframework.web.bind.annotation.RequestMapping`, `org.springframework.web.bind.annotation.RestController`
- Third-party dependencies: `org.apache.commons.collections.CollectionUtils`, `io.swagger.v3.oas.annotations.Operation`, `io.swagger.v3.oas.annotations.tags.Tag`
- Web/API mappings:
  - L24 `@RequestMapping("/api/menu")`
  - L40 `@PostMapping(value = "/getMemuItemAndProgList", produces = {MediaType.APPLICATION_JSON_VALUE})` -> method `getMemuItem`
- Main methods:
  - L41 `public QueryResult<ProgramAndMenuResult> getMemuItem()`
- Main fields:
  - L26 `long serialVersionUID`
  - L28 `transient ISysMenuService<TbSysMenu, String> sysMenuService`
  - L30 `transient ISysProgService<TbSysProg, String> sysProgService`
- Full path: `C:\home\qifu4\backend\app\src\main\java\org\qifu\core\api\BaseHelperApiController.java`
- Size: 2487 bytes

#### Source

````java
package org.qifu.core.api;

import java.util.ArrayList;

import org.apache.commons.collections.CollectionUtils;
import org.qifu.base.model.QueryResult;
import org.qifu.core.entity.TbSysMenu;
import org.qifu.core.entity.TbSysProg;
import org.qifu.core.service.ISysMenuService;
import org.qifu.core.service.ISysProgService;
import org.qifu.core.util.CoreApiSupport;
import org.qifu.core.util.UserUtils;
import org.qifu.core.vo.ProgramAndMenuResult;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "MENU", description = "選單資料.")
@RestController
@RequestMapping("/api/menu")
public class BaseHelperApiController extends CoreApiSupport {
	private static final long serialVersionUID = -769226894308818831L;
	
	private final transient ISysMenuService<TbSysMenu, String> sysMenuService;
	
	private final transient ISysProgService<TbSysProg, String> sysProgService;
	
	public BaseHelperApiController(ISysMenuService<TbSysMenu, String> sysMenuService,
			ISysProgService<TbSysProg, String> sysProgService) {
		super();
		this.sysMenuService = sysMenuService;
		this.sysProgService = sysProgService;
	}
	
	@Operation(summary = "選單與程式清單", description = "左邊選單項目與程式清單")
	@PostMapping(value = "/getMemuItemAndProgList", produces = {MediaType.APPLICATION_JSON_VALUE})
	public QueryResult<ProgramAndMenuResult> getMemuItem() {
		QueryResult<ProgramAndMenuResult> result = this.initResult();
		ProgramAndMenuResult r = new ProgramAndMenuResult();
		result.setValue(r);
		try {
			if (UserUtils.isAdmin()) {
				r.setMenuList( this.sysMenuService.getMemuItemListForFrontend("") );	
			} else {
				r.setMenuList( this.sysMenuService.getMemuItemListForFrontend(UserUtils.getCurrentUser().getUserId()) );
			}			
			r.setProgramList( this.sysProgService.findForInThePermRoleOfUserId("") );
			result.setSuccess( YES );
		} catch (Exception e) {
			e.printStackTrace();
		}  finally {
			if (CollectionUtils.isEmpty(r.getMenuList())) {
				r.setMenuList( new ArrayList<>());
			}
			if (CollectionUtils.isEmpty(r.getProgramList())) {
				r.setProgramList(new ArrayList<>());
			}
		}
		return result;
	}	
	
}
````

### `backend/app/src/main/java/org/qifu/core/api/DashboardDemoController.java`

- Purpose: REST API Controller; declares class DashboardDemoController; defines 3 web mappings; has 2 detected methods; depends on 6 org.qifu local types
- Package: `org.qifu.core.api`
- Role: REST API Controller
- Main types: `class DashboardDemoController extends CoreApiSupport`
- Key annotations: `Tag`, `RestController`, `ResponseBody`, `RequestMapping`, `Operation`, `PostMapping`
- Local dependencies: `org.qifu.base.model.QueryResult`, `org.qifu.core.entity.TbSysToken`, `org.qifu.core.service.ISysTokenService`, `org.qifu.core.util.CoreApiSupport`, `org.qifu.core.vo.BoardDemo`, `org.qifu.util.SimpleUtils`
- Spring dependencies: `org.springframework.http.MediaType`, `org.springframework.http.ResponseEntity`, `org.springframework.web.bind.annotation.PostMapping`, `org.springframework.web.bind.annotation.RequestMapping`, `org.springframework.web.bind.annotation.ResponseBody`, `org.springframework.web.bind.annotation.RestController`
- Third-party dependencies: `org.apache.commons.lang3.time.DateUtils`, `io.swagger.v3.oas.annotations.Operation`, `io.swagger.v3.oas.annotations.tags.Tag`
- Web/API mappings:
  - L27 `@RequestMapping("/api/DashboardDemo")`
  - L39 `@PostMapping(value = "/findBoardDemo", produces = {MediaType.APPLICATION_JSON_VALUE})` -> method `findBoardDemo`
  - L55 `@PostMapping(value = "/findSize", produces = {MediaType.APPLICATION_JSON_VALUE})` -> method `findPage`
- Main methods:
  - L40 `public ResponseEntity<QueryResult<List<BoardDemo>>> findBoardDemo()`
  - L56 `public ResponseEntity<QueryResult<List<BoardDemo>>> findPage()`
- Main fields:
  - L29 `long serialVersionUID`
  - L31 `transient ISysTokenService<TbSysToken, String> sysTokenService`
- Full path: `C:\home\qifu4\backend\app\src\main\java\org\qifu\core\api\DashboardDemoController.java`
- Size: 3209 bytes

#### Source

````java
package org.qifu.core.api;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.lang3.time.DateUtils;
import org.qifu.base.model.QueryResult;
import org.qifu.core.entity.TbSysToken;
import org.qifu.core.service.ISysTokenService;
import org.qifu.core.util.CoreApiSupport;
import org.qifu.core.vo.BoardDemo;
import org.qifu.util.SimpleUtils;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "DASHBOARD_DEMO", description = "index page data from admin.")
@RestController
@ResponseBody
@RequestMapping("/api/DashboardDemo")
public class DashboardDemoController extends CoreApiSupport {
	private static final long serialVersionUID = -5269105329111725657L;
	
	private final transient ISysTokenService<TbSysToken, String> sysTokenService;
	
	public DashboardDemoController(ISysTokenService<TbSysToken, String> sysTokenService) {
		super();
		this.sysTokenService = sysTokenService;
	}
	
	@Operation(summary = "DASHBOARD_DEMO - findBoardDemo", description = "查核TbSysToken資料")
	@PostMapping(value = "/findBoardDemo", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<QueryResult<List<BoardDemo>>> findBoardDemo() {
		QueryResult<List<BoardDemo>> result = this.initResult();
		try {
			Date d2 = new Date();
			Date d1 = DateUtils.addDays(d2, -6);
			List<BoardDemo> val = this.sysTokenService.findCountSizeByDatePerUser(d1, d2);
			result.setValue(val);
			result.setSuccess( YES );
		} catch (Exception e) {
			this.noSuccessResult(result, e);
		} 
		return ResponseEntity.ok().body(result);
	}	
	
	@Operation(summary = "DASHBOARD_DEMO - findSize", description = "查核TbSysToken資料")
	@PostMapping(value = "/findSize", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<QueryResult<List<BoardDemo>>> findPage() {
		QueryResult<List<BoardDemo>> result = this.initResult();
		try {
			List<BoardDemo> val = new LinkedList<>();
			String currDateStr = SimpleUtils.getStrYMD("-");
			Date currDate = DateUtils.parseDate(currDateStr + " 00:00:00", "yyyy-MM-dd HH:mm:ss");
			for (int d = 6; d >= 0; d--) {
				Date perDate = DateUtils.addDays(currDate, d*-1);
				String perDateStr = SimpleUtils.getStrYMD(perDate, "-");
				Date d1 = DateUtils.parseDate(perDateStr + " 00:00:00", "yyyy-MM-dd HH:mm:ss");
				Date d2 = DateUtils.parseDate(perDateStr + " 23:59:59.999", "yyyy-MM-dd HH:mm:ss.SSS");
				BoardDemo b = new BoardDemo();
				b.setCountSize( this.sysTokenService.countSizeByDate(d1, d2) );
				b.setDate(perDateStr);
				b.setUserId("");
				val.add(b);
			}
			result.setValue(val);
			result.setSuccess( YES );
		} catch (Exception e) {
			this.noSuccessResult(result, e);
		} 
		return ResponseEntity.ok().body(result);
	}	
	
}
````

### `backend/app/src/main/java/org/qifu/core/api/HelloApiController.java`

- Purpose: REST API Controller; declares class HelloApiController; defines 4 web mappings; has 3 detected methods; depends on 5 org.qifu local types
- Package: `org.qifu.core.api`
- Role: REST API Controller
- Main types: `class HelloApiController extends CoreApiSupport`
- Key annotations: `Tag`, `RestController`, `RequestMapping`, `Autowired`, `Operation`, `DeleteMapping`, `PostMapping`, `GetMapping`
- Local dependencies: `org.qifu.base.message.BaseSystemMessage`, `org.qifu.base.model.QueryResult`, `org.qifu.base.model.YesNoKeyProvide`, `org.qifu.core.util.CoreApiSupport`, `org.qifu.core.vo.TestModel`
- Spring dependencies: `org.springframework.beans.factory.annotation.Autowired`, `org.springframework.http.MediaType`, `org.springframework.web.bind.annotation.DeleteMapping`, `org.springframework.web.bind.annotation.GetMapping`, `org.springframework.web.bind.annotation.PathVariable`, `org.springframework.web.bind.annotation.PostMapping`, `org.springframework.web.bind.annotation.RequestBody`, `org.springframework.web.bind.annotation.RequestMapping`, `org.springframework.web.bind.annotation.RestController`
- Third-party dependencies: `org.apache.commons.lang3.StringUtils`, `tools.jackson.databind.ObjectMapper`, `io.swagger.v3.oas.annotations.Operation`, `io.swagger.v3.oas.annotations.tags.Tag`
- Injection/config points:
  - L55 `@Autowired` -> `private ObjectMapper objectMapper;`
- Web/API mappings:
  - L50 `@RequestMapping(value = "/api/hello")`
  - L59 `@DeleteMapping("/delPlay")` -> method `delPlay`
  - L69 `@PostMapping(value = "/play", produces = {MediaType.APPLICATION_JSON_VALUE})` -> method `play`
  - L89 `@GetMapping(value = "/testPV/{id}")` -> method `testPV`
- Main methods:
  - L60 `public String delPlay(String key)`
  - L70 `public QueryResult<String> play(@RequestBody TestModel data)`
  - L90 `public QueryResult<String> testPV(@PathVariable String id)`
- Main fields:
  - L53 `long serialVersionUID`
  - L56 `ObjectMapper objectMapper`
- Full path: `C:\home\qifu4\backend\app\src\main\java\org\qifu\core\api\HelloApiController.java`
- Size: 3474 bytes

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
package org.qifu.core.api;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.qifu.base.message.BaseSystemMessage;
import org.qifu.base.model.QueryResult;
import org.qifu.base.model.YesNoKeyProvide;
import org.qifu.core.util.CoreApiSupport;
import org.qifu.core.vo.TestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tools.jackson.databind.ObjectMapper;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "TEST.", description = "Test hello world.")
@RestController
@RequestMapping(value = "/api/hello")
public class HelloApiController extends CoreApiSupport {
	
	private static final long serialVersionUID = -2710621780849674671L;
	
	@Autowired
	private ObjectMapper objectMapper;
	
	@Operation(summary = "測試del", description = "測試用的接口del")
	@DeleteMapping("/delPlay")
	public String delPlay(String key) {
		String flag = YesNoKeyProvide.NO;
		if (StringUtils.isBlank(key)) {
			return YesNoKeyProvide.NO;
		}		
		return flag;
	}
	
	@Operation(summary = "測試", description = "測試用的接口")
	@PostMapping(value = "/play", produces = {MediaType.APPLICATION_JSON_VALUE})
	public QueryResult<String> play(@RequestBody TestModel data) {
		QueryResult<String> result = this.initResult();
		if (null == data || StringUtils.isBlank(data.getKey())) {
			this.noSuccessResult(result, BaseSystemMessage.parameterBlank());
			return result;
		}
		try {
			Map<String, String> dataMap = new HashMap<>();
			dataMap.put("str", data.getMsg());
			String val = objectMapper.writeValueAsString(dataMap);
			this.successResult(result, val);
		} catch (Exception e) {
			e.printStackTrace();
			this.noSuccessResult(result, e);
		}
		return result;
	}
	
	@Operation(summary = "測試2", description = "測試用的接口2")
	@GetMapping(value = "/testPV/{id}")
	public QueryResult<String> testPV(@PathVariable String id) {
		QueryResult<String> result = this.initResult();
		result.setValue(id);
		result.setMessage( "hello." );
		result.setSuccess( YES );
		return result;
	}
	
}
````

### `backend/app/src/main/java/org/qifu/core/api/PROG001D0001Controller.java`

- Purpose: REST API Controller; declares class PROG001D0001Controller; defines 6 web mappings; has 8 detected methods; depends on 12 org.qifu local types
- Package: `org.qifu.core.api`
- Role: REST API Controller
- Main types: `class PROG001D0001Controller extends CoreApiSupport`
- Key annotations: `Tag`, `RestController`, `ResponseBody`, `RequestMapping`, `ControllerMethodAuthority`, `Operation`, `PostMapping`
- Local dependencies: `org.qifu.base.exception.ControllerException`, `org.qifu.base.exception.ServiceException`, `org.qifu.base.model.CheckControllerFieldHandler`, `org.qifu.base.model.ControllerMethodAuthority`, `org.qifu.base.model.DefaultControllerJsonResultObj`, `org.qifu.base.model.DefaultResult`, `org.qifu.base.model.QueryResult`, `org.qifu.base.model.SearchBody`, `org.qifu.core.entity.TbSys`, `org.qifu.core.logic.IApplicationSystemLogicService`, `org.qifu.core.service.ISysService`, `org.qifu.core.util.CoreApiSupport`
- Spring dependencies: `org.springframework.http.MediaType`, `org.springframework.http.ResponseEntity`, `org.springframework.web.bind.annotation.PostMapping`, `org.springframework.web.bind.annotation.RequestBody`, `org.springframework.web.bind.annotation.RequestMapping`, `org.springframework.web.bind.annotation.ResponseBody`, `org.springframework.web.bind.annotation.RestController`
- Third-party dependencies: `io.swagger.v3.oas.annotations.Operation`, `io.swagger.v3.oas.annotations.tags.Tag`
- Web/API mappings:
  - L52 `@RequestMapping("/api/PROG001D0001")`
  - L71 `@PostMapping(value = "/findPage", produces = {MediaType.APPLICATION_JSON_VALUE})` -> method `findPage`
  - L87 `@PostMapping(value = "/delete", produces = {MediaType.APPLICATION_JSON_VALUE})` -> method `doDelete`
  - L126 `@PostMapping(value = "/save", produces = {MediaType.APPLICATION_JSON_VALUE})` -> method `doSave`
  - L139 `@PostMapping(value = "/load", produces = {MediaType.APPLICATION_JSON_VALUE})` -> method `doLoad`
  - L153 `@PostMapping(value = "/update", produces = {MediaType.APPLICATION_JSON_VALUE})` -> method `doUpdate`
- Main methods:
  - L72 `public ResponseEntity<QueryResult<List<TbSys>>> findPage(@RequestBody SearchBody searchBody)`
  - L88 `public ResponseEntity<DefaultControllerJsonResultObj<Boolean>> doDelete(@RequestBody TbSys sys)`
  - L99 `private void handlerCheck(DefaultControllerJsonResultObj<TbSys> result, TbSys sys)`
  - L112 `private void save(DefaultControllerJsonResultObj<TbSys> result, TbSys sys)`
  - L118 `private void update(DefaultControllerJsonResultObj<TbSys> result, TbSys sys)`
  - L127 `public ResponseEntity<DefaultControllerJsonResultObj<TbSys>> doSave(@RequestBody TbSys sys)`
  - L140 `public ResponseEntity<DefaultControllerJsonResultObj<TbSys>> doLoad(@RequestBody TbSys sys)`
  - L154 `public ResponseEntity<DefaultControllerJsonResultObj<TbSys>> doUpdate(@RequestBody TbSys sys)`
- Main fields:
  - L54 `long serialVersionUID`
  - L56 `String SYS_ID_VAR`
  - L58 `transient ISysService<TbSys, String> sysService`
  - L60 `transient IApplicationSystemLogicService applicationSystemLogicService`
- Full path: `C:\home\qifu4\backend\app\src\main\java\org\qifu\core\api\PROG001D0001Controller.java`
- Size: 7701 bytes

#### Source

````java
/* 
 * Copyright 2021-2023 qifu of copyright Chen Xin Nien
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
package org.qifu.core.api;

import java.util.List;

import org.qifu.base.exception.ControllerException;
import org.qifu.base.exception.ServiceException;
import org.qifu.base.model.CheckControllerFieldHandler;
import org.qifu.base.model.ControllerMethodAuthority;
import org.qifu.base.model.DefaultControllerJsonResultObj;
import org.qifu.base.model.DefaultResult;
import org.qifu.base.model.QueryResult;
import org.qifu.base.model.SearchBody;
import org.qifu.core.entity.TbSys;
import org.qifu.core.logic.IApplicationSystemLogicService;
import org.qifu.core.service.ISysService;
import org.qifu.core.util.CoreApiSupport;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "CORE_PROG001D0001", description = "Application site.")
@RestController
@ResponseBody
@RequestMapping("/api/PROG001D0001")
public class PROG001D0001Controller extends CoreApiSupport {
	private static final long serialVersionUID = -5896010855369568172L;
	
	private static final String SYS_ID_VAR = "sysId";
	
	private final transient ISysService<TbSys, String> sysService;
	
	private final transient IApplicationSystemLogicService applicationSystemLogicService;
	
	public PROG001D0001Controller(ISysService<TbSys, String> sysService,
			IApplicationSystemLogicService applicationSystemLogicService) {
		super();
		this.sysService = sysService;
		this.applicationSystemLogicService = applicationSystemLogicService;
	}
	
	@ControllerMethodAuthority(programId = "CORE_PROG001D0001Q", check = true)
	@Operation(summary = "CORE_PROG001D0001 - findPage", description = "查核TB_SYS資料")
	@PostMapping(value = "/findPage", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<QueryResult<List<TbSys>>> findPage(@RequestBody SearchBody searchBody) {
		QueryResult<List<TbSys>> result = this.initResult();
		try {
			QueryResult<List<TbSys>> queryResult = this.sysService.findPage(
					this.queryParameter(searchBody).fullEquals(SYS_ID_VAR).fullLink("nameLike").value(), 
					searchBody.getPageOf().orderBy("SYS_ID").sortTypeAsc());
			this.setQueryResponseJsonResult(queryResult, result, searchBody.getPageOf());
		} catch (ServiceException | ControllerException e) {
			this.noSuccessResult(result, e);
		} 
		return ResponseEntity.ok().body(result);
	}
	
	@ControllerMethodAuthority(programId = "CORE_PROG001D0001D", check = true)
	@Operation(summary = "CORE_PROG001D0001 - delete", description = "刪除TB_SYS資料")
	@PostMapping(value = "/delete", produces = {MediaType.APPLICATION_JSON_VALUE})	
	public ResponseEntity<DefaultControllerJsonResultObj<Boolean>> doDelete(@RequestBody TbSys sys) {
		DefaultControllerJsonResultObj<Boolean> result = this.initDefaultJsonResult();
		try {
			DefaultResult<Boolean> delResult = this.applicationSystemLogicService.delete(sys);
			this.setDefaultResponseJsonResult(delResult, result);
		} catch (ServiceException | ControllerException e) {
			this.exceptionResult(result, e);
		} 
		return ResponseEntity.ok().body(result);
	}
	
	private void handlerCheck(DefaultControllerJsonResultObj<TbSys> result, TbSys sys) throws ControllerException, ServiceException {
		CheckControllerFieldHandler<TbSys> chk = this.getCheckControllerFieldHandler(result);
		
		chk.testField(SYS_ID_VAR, sys, "@org.apache.commons.lang3.StringUtils@isBlank(sysId)", "請輸入編號")
		.testField("name", sys, "@org.apache.commons.lang3.StringUtils@isBlank(name)", "請輸入名稱")
		.testField("host", sys, "@org.apache.commons.lang3.StringUtils@isBlank(host)", "請輸入host")
		.testField("contextPath", sys, "@org.apache.commons.lang3.StringUtils@isBlank(contextPath)", "請輸入Context path")
		.throwHtmlMessage();
		
		chk.testField(SYS_ID_VAR, sys, "!@org.qifu.util.SimpleUtils@checkBeTrueOfAZaz09Id(sysId)", "編號只允許輸入0-9,a-z,A-Z正常字元")
		.throwHtmlMessage();		
	}
	
	private void save(DefaultControllerJsonResultObj<TbSys> result, TbSys sys) throws ControllerException, ServiceException {
		this.handlerCheck(result, sys);
		DefaultResult<TbSys> cResult = this.applicationSystemLogicService.create(sys);
		this.setDefaultResponseJsonResult(cResult, result);
	}
	
	private void update(DefaultControllerJsonResultObj<TbSys> result, TbSys sys) throws ControllerException, ServiceException {
		this.handlerCheck(result, sys);
		DefaultResult<TbSys> uResult = this.applicationSystemLogicService.update(sys);
		this.setDefaultResponseJsonResult(uResult, result);
	}
	
	@ControllerMethodAuthority(programId = "CORE_PROG001D0001C", check = true)
	@Operation(summary = "CORE_PROG001D0001 - save", description = "新增TB_SYS資料")
	@PostMapping(value = "/save", produces = {MediaType.APPLICATION_JSON_VALUE})	
	public ResponseEntity<DefaultControllerJsonResultObj<TbSys>> doSave(@RequestBody TbSys sys) {
		DefaultControllerJsonResultObj<TbSys> result = this.initDefaultJsonResult();
		try {
			this.save(result, sys);
		} catch (ServiceException | ControllerException e) {
			this.exceptionResult(result, e);
		} 
		return ResponseEntity.ok().body(result);
	}
	
	@ControllerMethodAuthority(programId = "CORE_PROG001D0001E", check = true)
	@Operation(summary = "CORE_PROG001D0001 - load", description = "讀取TB_SYS資料")
	@PostMapping(value = "/load", produces = {MediaType.APPLICATION_JSON_VALUE})	
	public ResponseEntity<DefaultControllerJsonResultObj<TbSys>> doLoad(@RequestBody TbSys sys) {
		DefaultControllerJsonResultObj<TbSys> result = this.initDefaultJsonResult();
		try {
			DefaultResult<TbSys> lResult = this.sysService.selectByEntityPrimaryKey(sys);
			this.setDefaultResponseJsonResult(lResult, result);
		} catch (ServiceException | ControllerException e) {
			this.exceptionResult(result, e);
		} 
		return ResponseEntity.ok().body(result);
	}	
	
	@ControllerMethodAuthority(programId = "CORE_PROG001D0001U", check = true)
	@Operation(summary = "CORE_PROG001D0001 - update", description = "更新TB_SYS資料")
	@PostMapping(value = "/update", produces = {MediaType.APPLICATION_JSON_VALUE})	
	public ResponseEntity<DefaultControllerJsonResultObj<TbSys>> doUpdate(@RequestBody TbSys sys) {
		DefaultControllerJsonResultObj<TbSys> result = this.initDefaultJsonResult();
		try {
			this.update(result, sys);
		} catch (ServiceException | ControllerException e) {
			this.exceptionResult(result, e);
		} 
		return ResponseEntity.ok().body(result);
	}	
	
}
````

### `backend/app/src/main/java/org/qifu/core/api/PROG001D0002Controller.java`

- Purpose: REST API Controller; declares class PROG001D0002Controller; defines 6 web mappings; has 8 detected methods; depends on 12 org.qifu local types
- Package: `org.qifu.core.api`
- Role: REST API Controller
- Main types: `class PROG001D0002Controller extends CoreApiSupport`
- Key annotations: `Tag`, `RestController`, `ResponseBody`, `RequestMapping`, `ControllerMethodAuthority`, `Operation`, `PostMapping`
- Local dependencies: `org.qifu.base.exception.ControllerException`, `org.qifu.base.exception.ServiceException`, `org.qifu.base.model.CheckControllerFieldHandler`, `org.qifu.base.model.ControllerMethodAuthority`, `org.qifu.base.model.DefaultControllerJsonResultObj`, `org.qifu.base.model.DefaultResult`, `org.qifu.base.model.QueryResult`, `org.qifu.base.model.SearchBody`, `org.qifu.core.entity.TbSysProg`, `org.qifu.core.logic.ISystemProgramLogicService`, `org.qifu.core.service.ISysProgService`, `org.qifu.core.util.CoreApiSupport`
- Spring dependencies: `org.springframework.http.MediaType`, `org.springframework.http.ResponseEntity`, `org.springframework.web.bind.annotation.PostMapping`, `org.springframework.web.bind.annotation.RequestBody`, `org.springframework.web.bind.annotation.RequestMapping`, `org.springframework.web.bind.annotation.ResponseBody`, `org.springframework.web.bind.annotation.RestController`
- Third-party dependencies: `io.swagger.v3.oas.annotations.Operation`, `io.swagger.v3.oas.annotations.tags.Tag`
- Web/API mappings:
  - L52 `@RequestMapping("/api/PROG001D0002")`
  - L71 `@PostMapping(value = "/findPage", produces = {MediaType.APPLICATION_JSON_VALUE})` -> method `findPage`
  - L87 `@PostMapping(value = "/delete", produces = {MediaType.APPLICATION_JSON_VALUE})` -> method `doDelete`
  - L132 `@PostMapping(value = "/save", produces = {MediaType.APPLICATION_JSON_VALUE})` -> method `doSave`
  - L145 `@PostMapping(value = "/load", produces = {MediaType.APPLICATION_JSON_VALUE})` -> method `doLoad`
  - L159 `@PostMapping(value = "/update", produces = {MediaType.APPLICATION_JSON_VALUE})` -> method `doUpdate`
- Main methods:
  - L72 `public ResponseEntity<QueryResult<List<TbSysProg>>> findPage(@RequestBody SearchBody searchBody)`
  - L88 `public ResponseEntity<DefaultControllerJsonResultObj<Boolean>> doDelete(@RequestBody TbSysProg sysProg)`
  - L99 `private void handlerCheck(DefaultControllerJsonResultObj<TbSysProg> result, TbSysProg sysProg)`
  - L118 `private void save(DefaultControllerJsonResultObj<TbSysProg> result, TbSysProg sysProg)`
  - L124 `private void update(DefaultControllerJsonResultObj<TbSysProg> result, TbSysProg sysProg)`
  - L133 `public ResponseEntity<DefaultControllerJsonResultObj<TbSysProg>> doSave(@RequestBody TbSysProg sysProg)`
  - L146 `public ResponseEntity<DefaultControllerJsonResultObj<TbSysProg>> doLoad(@RequestBody TbSysProg sysProg)`
  - L160 `public ResponseEntity<DefaultControllerJsonResultObj<TbSysProg>> doUpdate(@RequestBody TbSysProg sysProg)`
- Main fields:
  - L54 `long serialVersionUID`
  - L56 `String PROG_ID_VAR`
  - L58 `transient ISysProgService<TbSysProg, String> sysProgService`
  - L60 `transient ISystemProgramLogicService systemProgramLogicService`
- Full path: `C:\home\qifu4\backend\app\src\main\java\org\qifu\core\api\PROG001D0002Controller.java`
- Size: 8627 bytes

#### Source

````java
/* 
 * Copyright 2021-2023 qifu of copyright Chen Xin Nien
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
package org.qifu.core.api;

import java.util.List;

import org.qifu.base.exception.ControllerException;
import org.qifu.base.exception.ServiceException;
import org.qifu.base.model.CheckControllerFieldHandler;
import org.qifu.base.model.ControllerMethodAuthority;
import org.qifu.base.model.DefaultControllerJsonResultObj;
import org.qifu.base.model.DefaultResult;
import org.qifu.base.model.QueryResult;
import org.qifu.base.model.SearchBody;
import org.qifu.core.entity.TbSysProg;
import org.qifu.core.logic.ISystemProgramLogicService;
import org.qifu.core.service.ISysProgService;
import org.qifu.core.util.CoreApiSupport;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "CORE_PROG001D0002", description = "Program page management.")
@RestController
@ResponseBody
@RequestMapping("/api/PROG001D0002")
public class PROG001D0002Controller extends CoreApiSupport {
	private static final long serialVersionUID = -2060599663035482390L;
	
	private static final String PROG_ID_VAR = "progId";
	
	private final transient ISysProgService<TbSysProg, String> sysProgService;
	
	private final transient ISystemProgramLogicService systemProgramLogicService;
	
	public PROG001D0002Controller(ISysProgService<TbSysProg, String> sysProgService,
			ISystemProgramLogicService systemProgramLogicService) {
		super();
		this.sysProgService = sysProgService;
		this.systemProgramLogicService = systemProgramLogicService;
	}
	
	@ControllerMethodAuthority(programId = "CORE_PROG001D0002Q", check = true)
	@Operation(summary = "CORE_PROG001D0002 - findPage", description = "查詢TB_SYS_PROG資料")
	@PostMapping(value = "/findPage", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<QueryResult<List<TbSysProg>>> findPage(@RequestBody SearchBody searchBody) {
		QueryResult<List<TbSysProg>> result = this.initResult();
		try {
			QueryResult<List<TbSysProg>> queryResult = this.sysProgService.findPage(
					this.queryParameter(searchBody).fullEquals(PROG_ID_VAR).fullLink("nameLike").value(), 
					searchBody.getPageOf().orderBy("PROG_ID").sortTypeAsc());
			this.setQueryResponseJsonResult(queryResult, result, searchBody.getPageOf());
		} catch (ServiceException | ControllerException e) {
			this.noSuccessResult(result, e);
		} 
		return ResponseEntity.ok().body(result);
	}	
	
	@ControllerMethodAuthority(programId = "CORE_PROG001D0002D", check = true)
	@Operation(summary = "CORE_PROG001D0002 - delete", description = "刪除TB_SYS_PROG資料")
	@PostMapping(value = "/delete", produces = {MediaType.APPLICATION_JSON_VALUE})	
	public ResponseEntity<DefaultControllerJsonResultObj<Boolean>> doDelete(@RequestBody TbSysProg sysProg) {
		DefaultControllerJsonResultObj<Boolean> result = this.initDefaultJsonResult();
		try {
			DefaultResult<Boolean> delResult = this.systemProgramLogicService.delete(sysProg);
			this.setDefaultResponseJsonResult(delResult, result);
		} catch (ServiceException | ControllerException e) {
			this.exceptionResult(result, e);
		} 
		return ResponseEntity.ok().body(result);
	}
	
	private void handlerCheck(DefaultControllerJsonResultObj<TbSysProg> result, TbSysProg sysProg) throws ControllerException, ServiceException {
		CheckControllerFieldHandler<TbSysProg> chk = this.getCheckControllerFieldHandler(result);
		chk
		.testField(PROG_ID_VAR, sysProg, "@org.apache.commons.lang3.StringUtils@isBlank(progId)", "請輸入程式編號")
		.testField("name", sysProg, "@org.apache.commons.lang3.StringUtils@isBlank(name)", "請輸入程式名稱")
		.testField("url", sysProg, "@org.apache.commons.lang3.StringUtils@isBlank(url)", "請輸入Url")		
		.testField("editMode", sysProg, "@org.apache.commons.lang3.StringUtils@isBlank(editMode)", "請輸入Edit mode")
		.testField("isDialog", sysProg, "@org.apache.commons.lang3.StringUtils@isBlank(isDialog)", "請輸入Dialog")		
		.testField("dialogW", sysProg, "null == dialogW", "請輸入Dialog寬")
		.testField("dialogH", sysProg, "null == dialogH", "請輸入Dialog高")
		.testField("progSystem", sysProg, "@org.apache.commons.lang3.StringUtils@isBlank(progSystem)", "請輸入系統")		
		.testField("itemType", sysProg, "@org.apache.commons.lang3.StringUtils@isBlank(itemType)", "請輸入Item類別")		
		.testField("icon", sysProg, "@org.apache.commons.lang3.StringUtils@isBlank(icon)", "請輸入ICON")
		.testField("fontIconClassId", sysProg, "@org.apache.commons.lang3.StringUtils@isBlank(fontIconClassId)", "請輸入ICON class")		
		.throwHtmlMessage();
		
		chk.testField(PROG_ID_VAR, sysProg, "!@org.qifu.util.SimpleUtils@checkBeTrueOfAZaz09Id(sysId)", "程式編號只允許輸入0-9,a-z,A-Z正常字元");		
	}	
	
	private void save(DefaultControllerJsonResultObj<TbSysProg> result, TbSysProg sysProg) throws ControllerException, ServiceException {
		this.handlerCheck(result, sysProg);
		DefaultResult<TbSysProg> cResult = this.sysProgService.insert(sysProg);
		this.setDefaultResponseJsonResult(cResult, result);
	}	
	
	private void update(DefaultControllerJsonResultObj<TbSysProg> result, TbSysProg sysProg) throws ControllerException, ServiceException {
		this.handlerCheck(result, sysProg);
		DefaultResult<TbSysProg> cResult = this.sysProgService.update(sysProg);
		this.setDefaultResponseJsonResult(cResult, result);
	}	
	
	@ControllerMethodAuthority(programId = "CORE_PROG001D0002C", check = true)
	@Operation(summary = "CORE_PROG001D0002 - save", description = "新增TB_SYS_PROG資料")
	@PostMapping(value = "/save", produces = {MediaType.APPLICATION_JSON_VALUE})	
	public ResponseEntity<DefaultControllerJsonResultObj<TbSysProg>> doSave(@RequestBody TbSysProg sysProg) {
		DefaultControllerJsonResultObj<TbSysProg> result = this.initDefaultJsonResult();
		try {
			this.save(result, sysProg);
		} catch (ServiceException | ControllerException e) {
			this.exceptionResult(result, e);
		} 
		return ResponseEntity.ok().body(result);
	}	
	
	@ControllerMethodAuthority(programId = "CORE_PROG001D0002E", check = true)
	@Operation(summary = "CORE_PROG001D0002 - load", description = "讀取TB_SYS_PROG資料")
	@PostMapping(value = "/load", produces = {MediaType.APPLICATION_JSON_VALUE})	
	public ResponseEntity<DefaultControllerJsonResultObj<TbSysProg>> doLoad(@RequestBody TbSysProg sysProg) {
		DefaultControllerJsonResultObj<TbSysProg> result = this.initDefaultJsonResult();
		try {
			DefaultResult<TbSysProg> lResult = this.sysProgService.selectByEntityPrimaryKey(sysProg);
			this.setDefaultResponseJsonResult(lResult, result);
		} catch (ServiceException | ControllerException e) {
			this.exceptionResult(result, e);
		} 
		return ResponseEntity.ok().body(result);
	}
	
	@ControllerMethodAuthority(programId = "CORE_PROG001D0002U", check = true)
	@Operation(summary = "CORE_PROG001D0002 - update", description = "更新TB_SYS_PROG資料")
	@PostMapping(value = "/update", produces = {MediaType.APPLICATION_JSON_VALUE})	
	public ResponseEntity<DefaultControllerJsonResultObj<TbSysProg>> doUpdate(@RequestBody TbSysProg sysProg) {
		DefaultControllerJsonResultObj<TbSysProg> result = this.initDefaultJsonResult();
		try {
			this.update(result, sysProg);
		} catch (ServiceException | ControllerException e) {
			this.exceptionResult(result, e);
		} 
		return ResponseEntity.ok().body(result);
	}		
	
}
````

### `backend/app/src/main/java/org/qifu/core/api/PROG001D0003Controller.java`

- Purpose: REST API Controller; declares class PROG001D0003Controller; defines 5 web mappings; has 4 detected methods; depends on 11 org.qifu local types
- Package: `org.qifu.core.api`
- Role: REST API Controller
- Main types: `class PROG001D0003Controller extends CoreApiSupport`
- Key annotations: `Tag`, `RestController`, `ResponseBody`, `RequestMapping`, `ControllerMethodAuthority`, `Operation`, `PostMapping`
- Local dependencies: `org.qifu.base.exception.ControllerException`, `org.qifu.base.exception.ServiceException`, `org.qifu.base.model.ControllerMethodAuthority`, `org.qifu.base.model.DefaultControllerJsonResultObj`, `org.qifu.base.model.DefaultResult`, `org.qifu.base.model.SortType`, `org.qifu.core.entity.TbSysProg`, `org.qifu.core.logic.ISystemMenuLogicService`, `org.qifu.core.model.MenuItemType`, `org.qifu.core.service.ISysProgService`, `org.qifu.core.util.CoreApiSupport`
- Spring dependencies: `org.springframework.http.MediaType`, `org.springframework.http.ResponseEntity`, `org.springframework.web.bind.annotation.PathVariable`, `org.springframework.web.bind.annotation.PostMapping`, `org.springframework.web.bind.annotation.RequestMapping`, `org.springframework.web.bind.annotation.ResponseBody`, `org.springframework.web.bind.annotation.RestController`
- Third-party dependencies: `io.swagger.v3.oas.annotations.Operation`, `io.swagger.v3.oas.annotations.tags.Tag`
- Web/API mappings:
  - L53 `@RequestMapping("/api/PROG001D0003")`
  - L69 `@PostMapping(value = "/loadProgramFolder", produces = {MediaType.APPLICATION_JSON_VALUE})` -> method `doLoadProgramFolder`
  - L85 `@PostMapping(value = "/loadProgramEnableAndAllList/{oid}", produces = {MediaType.APPLICATION_JSON_VALUE})` -> method `queryProgramListByFolderOid`
  - L100 `@RequestMapping(value = "/updateMenu/{folderProgramOid}", produces = MediaType.APPLICATION_JSON_VALUE)` -> method `updateMenu`
  - L117 `@RequestMapping(value = "/updateMenu/{folderProgramOid}/{appendOid}", produces = MediaType.APPLICATION_JSON_VALUE)` -> method `updateMenu`
- Main methods:
  - L70 `public ResponseEntity<DefaultControllerJsonResultObj<List<TbSysProg>>> doLoadProgramFolder()`
  - L86 `public DefaultControllerJsonResultObj< Map<String, List<TbSysProg>> > queryProgramListByFolderOid(@PathVariable String oid)`
  - L101 `public DefaultControllerJsonResultObj<Boolean> updateMenu(@PathVariable String folderProgramOid)`
  - L118 `public DefaultControllerJsonResultObj<Boolean> updateMenu(@PathVariable String folderProgramOid, @PathVariable String appendOid)`
- Main fields:
  - L55 `long serialVersionUID`
  - L57 `transient ISysProgService<TbSysProg, String> sysProgService`
  - L59 `transient ISystemMenuLogicService systemMenuLogicService`
- Full path: `C:\home\qifu4\backend\app\src\main\java\org\qifu\core\api\PROG001D0003Controller.java`
- Size: 6304 bytes

#### Source

````java
/* 
 * Copyright 2021-2023 qifu of copyright Chen Xin Nien
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
package org.qifu.core.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.qifu.base.exception.ControllerException;
import org.qifu.base.exception.ServiceException;
import org.qifu.base.model.ControllerMethodAuthority;
import org.qifu.base.model.DefaultControllerJsonResultObj;
import org.qifu.base.model.DefaultResult;
import org.qifu.base.model.SortType;
import org.qifu.core.entity.TbSysProg;
import org.qifu.core.logic.ISystemMenuLogicService;
import org.qifu.core.model.MenuItemType;
import org.qifu.core.service.ISysProgService;
import org.qifu.core.util.CoreApiSupport;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "CORE_PROG001D0003", description = "Program menu management.")
@RestController
@ResponseBody
@RequestMapping("/api/PROG001D0003")
public class PROG001D0003Controller extends CoreApiSupport {
	private static final long serialVersionUID = 3908071442920993630L;
	
	private final transient ISysProgService<TbSysProg, String> sysProgService;	
	
	private final transient ISystemMenuLogicService systemMenuLogicService;
	
	public PROG001D0003Controller(ISysProgService<TbSysProg, String> sysProgService, ISystemMenuLogicService systemMenuLogicService) {
		super();
		this.sysProgService = sysProgService;
		this.systemMenuLogicService = systemMenuLogicService;
	}
	
	@ControllerMethodAuthority(programId = "CORE_PROG001D0003Q", check = true)
	@Operation(summary = "CORE_PROG001D0003 - load folder program", description = "讀取TB_SYS_PROG ITEM_TYPE 是 FOLDER 資料")
	@PostMapping(value = "/loadProgramFolder", produces = {MediaType.APPLICATION_JSON_VALUE})	
	public ResponseEntity<DefaultControllerJsonResultObj<List<TbSysProg>>> doLoadProgramFolder() {
		DefaultControllerJsonResultObj<List<TbSysProg>> result = this.initDefaultJsonResult();
		try {
			Map<String, Object> param = new HashMap<>();
			param.put("itemType", MenuItemType.FOLDER);			
			DefaultResult<List<TbSysProg>> lResult = this.sysProgService.selectListByParams(param, "PROG_ID", SortType.ASC);
			this.setDefaultResponseJsonResult(lResult, result);
		} catch (ServiceException | ControllerException e) {
			this.exceptionResult(result, e);
		} 
		return ResponseEntity.ok().body(result);
	}	
	
	@ControllerMethodAuthority(programId = "CORE_PROG001D0003Q", check = true)
	@Operation(summary = "CORE_PROG001D0003 - load folder program", description = "讀取TB_SYS_PROG ITEM_TYPE 是 FOLDER 資料")
	@PostMapping(value = "/loadProgramEnableAndAllList/{oid}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public DefaultControllerJsonResultObj< Map<String, List<TbSysProg>> > queryProgramListByFolderOid(@PathVariable String oid) {
		DefaultControllerJsonResultObj< Map<String, List<TbSysProg>> > result = this.initDefaultJsonResult();
		try {			
			Map<String, List<TbSysProg>> searchDataMap = this.systemMenuLogicService.findForMenuSettingsEnableAndAll(oid);
			result.setValue( searchDataMap );
			result.setSuccess( YES );
		} catch (ServiceException | ControllerException e) {
			this.exceptionResult(result, e);
		} 
		return result;
	}	
	
	@ControllerMethodAuthority(programId = "CORE_PROG001D0003U", check = true)
	@Operation(summary = "CORE_PROG001D0003 - update program page of menu - 1.", description = "更新選單資料 - 1")
	@RequestMapping(value = "/updateMenu/{folderProgramOid}", produces = MediaType.APPLICATION_JSON_VALUE)		
	public DefaultControllerJsonResultObj<Boolean> updateMenu(@PathVariable String folderProgramOid) {
		DefaultControllerJsonResultObj<Boolean> result = this.initDefaultJsonResult();
		try {
			DefaultResult<Boolean> updateResult = this.systemMenuLogicService.createOrUpdate(folderProgramOid, this.transformAppendKeyStringToList(""));
			if (updateResult.getValue() != null && updateResult.getValue()) {
				result.setSuccess(YES);
			}
			result.setMessage( updateResult.getMessage() );
		} catch (ServiceException | ControllerException e) {
			this.exceptionResult(result, e);
		} 
		return result;
	}	
	
	@ControllerMethodAuthority(programId = "CORE_PROG001D0003U", check = true)
	@Operation(summary = "CORE_PROG001D0003 - update program page of menu - 2.", description = "更新選單資料 - 2")
	@RequestMapping(value = "/updateMenu/{folderProgramOid}/{appendOid}", produces = MediaType.APPLICATION_JSON_VALUE)		
	public DefaultControllerJsonResultObj<Boolean> updateMenu(@PathVariable String folderProgramOid, @PathVariable String appendOid) {
		DefaultControllerJsonResultObj<Boolean> result = this.initDefaultJsonResult();
		try {
			DefaultResult<Boolean> updateResult = this.systemMenuLogicService.createOrUpdate(folderProgramOid, this.transformAppendKeyStringToList(appendOid));
			if (updateResult.getValue() != null && updateResult.getValue()) {
				result.setSuccess(YES);
			}
			result.setMessage( updateResult.getMessage() );
		} catch (ServiceException | ControllerException e) {
			this.exceptionResult(result, e);
		} 
		return result;
	}	
	
}
````

### `backend/app/src/main/java/org/qifu/core/api/PROG001D0004Controller.java`

- Purpose: REST API Controller; declares class PROG001D0004Controller; defines 9 web mappings; has 13 detected methods; depends on 14 org.qifu local types
- Package: `org.qifu.core.api`
- Role: REST API Controller
- Main types: `class PROG001D0004Controller extends CoreApiSupport`
- Key annotations: `Tag`, `RestController`, `ResponseBody`, `RequestMapping`, `ControllerMethodAuthority`, `Operation`, `PostMapping`
- Local dependencies: `org.qifu.base.exception.ControllerException`, `org.qifu.base.exception.ServiceException`, `org.qifu.base.model.CheckControllerFieldHandler`, `org.qifu.base.model.ControllerMethodAuthority`, `org.qifu.base.model.DefaultControllerJsonResultObj`, `org.qifu.base.model.DefaultResult`, `org.qifu.base.model.QueryResult`, `org.qifu.base.model.SearchBody`, `org.qifu.core.entity.TbSysTemplate`, `org.qifu.core.entity.TbSysTemplateParam`, `org.qifu.core.logic.ISystemTemplateLogicService`, `org.qifu.core.service.ISysTemplateParamService`, `org.qifu.core.service.ISysTemplateService`, `org.qifu.core.util.CoreApiSupport`
- Spring dependencies: `org.springframework.http.MediaType`, `org.springframework.http.ResponseEntity`, `org.springframework.web.bind.annotation.PostMapping`, `org.springframework.web.bind.annotation.RequestBody`, `org.springframework.web.bind.annotation.RequestMapping`, `org.springframework.web.bind.annotation.ResponseBody`, `org.springframework.web.bind.annotation.RestController`
- Third-party dependencies: `io.swagger.v3.oas.annotations.Operation`, `io.swagger.v3.oas.annotations.tags.Tag`
- Web/API mappings:
  - L54 `@RequestMapping("/api/PROG001D0004")`
  - L77 `@PostMapping(value = "/findPage", produces = {MediaType.APPLICATION_JSON_VALUE})` -> method `findPage`
  - L93 `@PostMapping(value = "/delete", produces = {MediaType.APPLICATION_JSON_VALUE})` -> method `doDelete`
  - L130 `@PostMapping(value = "/save", produces = {MediaType.APPLICATION_JSON_VALUE})` -> method `doSave`
  - L143 `@PostMapping(value = "/load", produces = {MediaType.APPLICATION_JSON_VALUE})` -> method `doLoad`
  - L157 `@PostMapping(value = "/update", produces = {MediaType.APPLICATION_JSON_VALUE})` -> method `doUpdate`
  - L170 `@PostMapping(value = "/findSetParamPage", produces = {MediaType.APPLICATION_JSON_VALUE})` -> method `findSetParamPage`
  - L204 `@PostMapping(value = "/saveSetParam", produces = {MediaType.APPLICATION_JSON_VALUE})` -> method `doSaveSetParam`
  - L217 `@PostMapping(value = "/deleteSetParam", produces = {MediaType.APPLICATION_JSON_VALUE})` -> method `doDeleteSetParam`
- Main methods:
  - L78 `public ResponseEntity<QueryResult<List<TbSysTemplate>>> findPage(@RequestBody SearchBody searchBody)`
  - L94 `public ResponseEntity<DefaultControllerJsonResultObj<Boolean>> doDelete(@RequestBody TbSysTemplate sysTemplate)`
  - L105 `private void handlerCheck(DefaultControllerJsonResultObj<TbSysTemplate> result, TbSysTemplate sysTemplate)`
  - L116 `private void save(DefaultControllerJsonResultObj<TbSysTemplate> result, TbSysTemplate sysTemplate)`
  - L122 `private void update(DefaultControllerJsonResultObj<TbSysTemplate> result, TbSysTemplate sysTemplate)`
  - L131 `public ResponseEntity<DefaultControllerJsonResultObj<TbSysTemplate>> doSave(@RequestBody TbSysTemplate sysTemplate)`
  - L144 `public ResponseEntity<DefaultControllerJsonResultObj<TbSysTemplate>> doLoad(@RequestBody TbSysTemplate sysTemplate)`
  - L158 `public ResponseEntity<DefaultControllerJsonResultObj<TbSysTemplate>> doUpdate(@RequestBody TbSysTemplate sysTemplate)`
  - L171 `public ResponseEntity<QueryResult<List<TbSysTemplateParam>>> findSetParamPage(@RequestBody SearchBody searchBody)`
  - L184 `private void handlerCheckParam(DefaultControllerJsonResultObj<TbSysTemplateParam> result, TbSysTemplateParam param)`
  - L196 `private void saveParam(DefaultControllerJsonResultObj<TbSysTemplateParam> result, TbSysTemplateParam param)`
  - L205 `public ResponseEntity<DefaultControllerJsonResultObj<TbSysTemplateParam>> doSaveSetParam(@RequestBody TbSysTemplateParam param)`
  - L218 `public ResponseEntity<DefaultControllerJsonResultObj<Boolean>> doDeleteSetParam(@RequestBody TbSysTemplateParam param)`
- Main fields:
  - L56 `long serialVersionUID`
  - L58 `String TEMPLATE_ID_VAR`
  - L60 `transient ISysTemplateService<TbSysTemplate, String> sysTemplateService`
  - L62 `transient ISysTemplateParamService<TbSysTemplateParam, String> sysTemplateParamService`
  - L64 `transient ISystemTemplateLogicService systemTemplateLogicService`
- Full path: `C:\home\qifu4\backend\app\src\main\java\org\qifu\core\api\PROG001D0004Controller.java`
- Size: 12215 bytes

#### Source

````java
/* 
 * Copyright 2021-2023 qifu of copyright Chen Xin Nien
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
package org.qifu.core.api;

import java.util.List;

import org.qifu.base.exception.ControllerException;
import org.qifu.base.exception.ServiceException;
import org.qifu.base.model.CheckControllerFieldHandler;
import org.qifu.base.model.ControllerMethodAuthority;
import org.qifu.base.model.DefaultControllerJsonResultObj;
import org.qifu.base.model.DefaultResult;
import org.qifu.base.model.QueryResult;
import org.qifu.base.model.SearchBody;
import org.qifu.core.entity.TbSysTemplate;
import org.qifu.core.entity.TbSysTemplateParam;
import org.qifu.core.logic.ISystemTemplateLogicService;
import org.qifu.core.service.ISysTemplateParamService;
import org.qifu.core.service.ISysTemplateService;
import org.qifu.core.util.CoreApiSupport;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "CORE_PROG001D0004", description = "Freemarker樣板 management.")
@RestController
@ResponseBody
@RequestMapping("/api/PROG001D0004")
public class PROG001D0004Controller extends CoreApiSupport {
	private static final long serialVersionUID = 1558945973473225107L;
	
	private static final String TEMPLATE_ID_VAR = "templateId";
	
	private final transient ISysTemplateService<TbSysTemplate, String> sysTemplateService;
	
	private final transient ISysTemplateParamService<TbSysTemplateParam, String> sysTemplateParamService;
	
	private final transient ISystemTemplateLogicService systemTemplateLogicService;
	
	public PROG001D0004Controller(ISysTemplateService<TbSysTemplate, String> sysTemplateService,
			ISysTemplateParamService<TbSysTemplateParam, String> sysTemplateParamService,
			ISystemTemplateLogicService systemTemplateLogicService) {
		super();
		this.sysTemplateService = sysTemplateService;
		this.sysTemplateParamService = sysTemplateParamService;
		this.systemTemplateLogicService = systemTemplateLogicService;
	}
	
	@ControllerMethodAuthority(programId = "CORE_PROG001D0004Q", check = true)
	@Operation(summary = "CORE_PROG001D0004 - findPage", description = "查詢TB_SYS_TEMPLATE資料")
	@PostMapping(value = "/findPage", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<QueryResult<List<TbSysTemplate>>> findPage(@RequestBody SearchBody searchBody) {
		QueryResult<List<TbSysTemplate>> result = this.initResult();
		try {
			QueryResult<List<TbSysTemplate>> queryResult = this.sysTemplateService.findPage(
					this.queryParameter(searchBody).fullEquals(TEMPLATE_ID_VAR).fullLink("titleLike").value(), 
					searchBody.getPageOf().orderBy("TEMPLATE_ID").sortTypeAsc());
			this.setQueryResponseJsonResult(queryResult, result, searchBody.getPageOf());
		} catch (ServiceException | ControllerException e) {
			this.noSuccessResult(result, e);
		} 
		return ResponseEntity.ok().body(result);
	}		
	
	@ControllerMethodAuthority(programId = "CORE_PROG001D0004D", check = true)
	@Operation(summary = "CORE_PROG001D0004 - delete", description = "刪除TB_SYS_TEMPLATE資料")
	@PostMapping(value = "/delete", produces = {MediaType.APPLICATION_JSON_VALUE})	
	public ResponseEntity<DefaultControllerJsonResultObj<Boolean>> doDelete(@RequestBody TbSysTemplate sysTemplate) {
		DefaultControllerJsonResultObj<Boolean> result = this.initDefaultJsonResult();
		try {
			DefaultResult<Boolean> delResult = this.systemTemplateLogicService.delete(sysTemplate);
			this.setDefaultResponseJsonResult(delResult, result);
		} catch (ServiceException | ControllerException e) {
			this.exceptionResult(result, e);
		} 
		return ResponseEntity.ok().body(result);
	}	
	
	private void handlerCheck(DefaultControllerJsonResultObj<TbSysTemplate> result, TbSysTemplate sysTemplate) throws ControllerException, ServiceException {
		CheckControllerFieldHandler<TbSysTemplate> chk = this.getCheckControllerFieldHandler(result);
		chk
		.testField(TEMPLATE_ID_VAR, sysTemplate, "@org.apache.commons.lang3.StringUtils@isBlank(templateId)", "請輸入樣板編號")
		.testField("title", sysTemplate, "@org.apache.commons.lang3.StringUtils@isBlank(title)", "請輸入樣板標題")		
		.testField("message", sysTemplate, "@org.apache.commons.lang3.StringUtils@isBlank(message)", "請輸入樣板內容")		
		.throwHtmlMessage();
		
		chk.testField(TEMPLATE_ID_VAR, sysTemplate, "!@org.qifu.util.SimpleUtils@checkBeTrueOfAZaz09Id(templateId)", "樣板編號只允許輸入0-9,a-z,A-Z正常字元");		
	}	
	
	private void save(DefaultControllerJsonResultObj<TbSysTemplate> result, TbSysTemplate sysTemplate) throws ControllerException, ServiceException {
		this.handlerCheck(result, sysTemplate);
		DefaultResult<TbSysTemplate> cResult = this.systemTemplateLogicService.create(sysTemplate);
		this.setDefaultResponseJsonResult(cResult, result);
	}	
	
	private void update(DefaultControllerJsonResultObj<TbSysTemplate> result, TbSysTemplate sysTemplate) throws ControllerException, ServiceException {
		this.handlerCheck(result, sysTemplate);
		DefaultResult<TbSysTemplate> uResult = this.systemTemplateLogicService.update(sysTemplate);
		this.setDefaultResponseJsonResult(uResult, result);		
	}	
	
	@ControllerMethodAuthority(programId = "CORE_PROG001D0004C", check = true)
	@Operation(summary = "CORE_PROG001D0004 - save", description = "新增TB_SYS_TEMPLATE資料")
	@PostMapping(value = "/save", produces = {MediaType.APPLICATION_JSON_VALUE})	
	public ResponseEntity<DefaultControllerJsonResultObj<TbSysTemplate>> doSave(@RequestBody TbSysTemplate sysTemplate) {
		DefaultControllerJsonResultObj<TbSysTemplate> result = this.initDefaultJsonResult();
		try {
			this.save(result, sysTemplate);
		} catch (ServiceException | ControllerException e) {
			this.exceptionResult(result, e);
		} 
		return ResponseEntity.ok().body(result);
	}		
	
	@ControllerMethodAuthority(programId = "CORE_PROG001D0004E", check = true)
	@Operation(summary = "CORE_PROG001D0004 - load", description = "讀取TB_SYS_TEMPLATE資料")
	@PostMapping(value = "/load", produces = {MediaType.APPLICATION_JSON_VALUE})	
	public ResponseEntity<DefaultControllerJsonResultObj<TbSysTemplate>> doLoad(@RequestBody TbSysTemplate sysTemplate) {
		DefaultControllerJsonResultObj<TbSysTemplate> result = this.initDefaultJsonResult();
		try {
			DefaultResult<TbSysTemplate> lResult = this.sysTemplateService.selectByEntityPrimaryKey(sysTemplate);
			this.setDefaultResponseJsonResult(lResult, result);
		} catch (ServiceException | ControllerException e) {
			this.exceptionResult(result, e);
		} 
		return ResponseEntity.ok().body(result);
	}	
	
	@ControllerMethodAuthority(programId = "CORE_PROG001D0004U", check = true)
	@Operation(summary = "CORE_PROG001D0004 - update", description = "更新TB_SYS_TEMPLATE資料")
	@PostMapping(value = "/update", produces = {MediaType.APPLICATION_JSON_VALUE})	
	public ResponseEntity<DefaultControllerJsonResultObj<TbSysTemplate>> doUpdate(@RequestBody TbSysTemplate sysTemplate) {
		DefaultControllerJsonResultObj<TbSysTemplate> result = this.initDefaultJsonResult();
		try {
			this.update(result, sysTemplate);
		} catch (ServiceException | ControllerException e) {
			this.exceptionResult(result, e);
		} 
		return ResponseEntity.ok().body(result);
	}		
	
	@ControllerMethodAuthority(programId = "CORE_PROG001D0004Q", check = true)
	@Operation(summary = "CORE_PROG001D0004 - findSetParamPage", description = "查詢TB_SYS_TEMPLATE_PARAM資料")
	@PostMapping(value = "/findSetParamPage", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<QueryResult<List<TbSysTemplateParam>>> findSetParamPage(@RequestBody SearchBody searchBody) {
		QueryResult<List<TbSysTemplateParam>> result = this.initResult();
		try {
			QueryResult<List<TbSysTemplateParam>> queryResult = this.sysTemplateParamService.findPage(
					this.queryParameter(searchBody).fullEquals(TEMPLATE_ID_VAR).value(), 
					searchBody.getPageOf().orderBy("TEMPLATE_VAR").sortTypeAsc());
			this.setQueryResponseJsonResult(queryResult, result, searchBody.getPageOf());
		} catch (ServiceException | ControllerException e) {
			this.noSuccessResult(result, e);
		} 
		return ResponseEntity.ok().body(result);
	}	
	
	private void handlerCheckParam(DefaultControllerJsonResultObj<TbSysTemplateParam> result, TbSysTemplateParam param) throws ControllerException, ServiceException {
		CheckControllerFieldHandler<TbSysTemplateParam> chk = this.getCheckControllerFieldHandler(result);
		chk
		.testField(TEMPLATE_ID_VAR, param, "@org.apache.commons.lang3.StringUtils@isBlank(templateId)", "請輸入樣板編號")
		.testField("isTitle", param, "@org.apache.commons.lang3.StringUtils@isBlank(isTitle)", "請輸入樣板是否標題")
		.testField("templateVar", param, "@org.apache.commons.lang3.StringUtils@isBlank(templateVar)", "請輸入樣板變數")
		.testField("objectVar", param, "@org.apache.commons.lang3.StringUtils@isBlank(objectVar)", "請輸入物件變數")		
		.throwHtmlMessage();
		
		chk.testField(TEMPLATE_ID_VAR, param, "!@org.qifu.util.SimpleUtils@checkBeTrueOfAZaz09Id(templateId)", "樣板編號只允許輸入0-9,a-z,A-Z正常字元");		
	}	
	
	private void saveParam(DefaultControllerJsonResultObj<TbSysTemplateParam> result, TbSysTemplateParam param) throws ControllerException, ServiceException {
		this.handlerCheckParam(result, param);
		DefaultResult<TbSysTemplateParam> cResult = this.sysTemplateParamService.insert(param);
		this.setDefaultResponseJsonResult(cResult, result);
	}		
	
	@ControllerMethodAuthority(programId = "CORE_PROG001D0004U", check = true)
	@Operation(summary = "CORE_PROG001D0004 - saveSetParam", description = "新增TB_SYS_TEMPLATE_PARAM資料")
	@PostMapping(value = "/saveSetParam", produces = {MediaType.APPLICATION_JSON_VALUE})	
	public ResponseEntity<DefaultControllerJsonResultObj<TbSysTemplateParam>> doSaveSetParam(@RequestBody TbSysTemplateParam param) {
		DefaultControllerJsonResultObj<TbSysTemplateParam> result = this.initDefaultJsonResult();
		try {			
			this.saveParam(result, param);
		} catch (ServiceException | ControllerException e) {
			this.exceptionResult(result, e);
		} 
		return ResponseEntity.ok().body(result);
	}	
	
	@ControllerMethodAuthority(programId = "CORE_PROG001D0004D", check = true)
	@Operation(summary = "CORE_PROG001D0004 - deleteSetParam", description = "刪除TB_SYS_TEMPLATE_PARAM資料")
	@PostMapping(value = "/deleteSetParam", produces = {MediaType.APPLICATION_JSON_VALUE})	
	public ResponseEntity<DefaultControllerJsonResultObj<Boolean>> doDeleteSetParam(@RequestBody TbSysTemplateParam param) {
		DefaultControllerJsonResultObj<Boolean> result = this.initDefaultJsonResult();
		try {
			DefaultResult<Boolean> delResult = this.systemTemplateLogicService.deleteParam(param);
			this.setDefaultResponseJsonResult(delResult, result);
		} catch (ServiceException | ControllerException e) {
			this.exceptionResult(result, e);
		} 
		return ResponseEntity.ok().body(result);
	}	
	
}
````

### `backend/app/src/main/java/org/qifu/core/api/PROG001D0005Controller.java`

- Purpose: REST API Controller; declares class PROG001D0005Controller; defines 9 web mappings; has 14 detected methods; depends on 15 org.qifu local types
- Package: `org.qifu.core.api`
- Role: REST API Controller
- Main types: `class PROG001D0005Controller extends CoreApiSupport`
- Key annotations: `Tag`, `RestController`, `ResponseBody`, `RequestMapping`, `ControllerMethodAuthority`, `Operation`, `PostMapping`
- Local dependencies: `org.qifu.base.exception.ControllerException`, `org.qifu.base.exception.ServiceException`, `org.qifu.base.model.CheckControllerFieldHandler`, `org.qifu.base.model.ControllerMethodAuthority`, `org.qifu.base.model.DefaultControllerJsonResultObj`, `org.qifu.base.model.DefaultResult`, `org.qifu.base.model.QueryResult`, `org.qifu.base.model.SearchBody`, `org.qifu.core.entity.TbSysJreport`, `org.qifu.core.entity.TbSysJreportParam`, `org.qifu.core.logic.ISystemJreportLogicService`, `org.qifu.core.service.ISysJreportParamService`, `org.qifu.core.service.ISysJreportService`, `org.qifu.core.util.CoreApiSupport`, `org.qifu.core.util.JReportUtils`
- Spring dependencies: `org.springframework.http.MediaType`, `org.springframework.http.ResponseEntity`, `org.springframework.web.bind.annotation.PostMapping`, `org.springframework.web.bind.annotation.RequestBody`, `org.springframework.web.bind.annotation.RequestMapping`, `org.springframework.web.bind.annotation.ResponseBody`, `org.springframework.web.bind.annotation.RestController`
- Third-party dependencies: `org.apache.commons.lang3.StringUtils`, `io.swagger.v3.oas.annotations.Operation`, `io.swagger.v3.oas.annotations.tags.Tag`, `net.sf.jasperreports.engine.JRException`, `ognl.OgnlException`
- Web/API mappings:
  - L59 `@RequestMapping("/api/PROG001D0005")`
  - L82 `@PostMapping(value = "/findPage", produces = {MediaType.APPLICATION_JSON_VALUE})` -> method `findPage`
  - L100 `@PostMapping(value = "/delete", produces = {MediaType.APPLICATION_JSON_VALUE})` -> method `doDelete`
  - L147 `@PostMapping(value = "/save", produces = {MediaType.APPLICATION_JSON_VALUE})` -> method `doSave`
  - L160 `@PostMapping(value = "/load", produces = {MediaType.APPLICATION_JSON_VALUE})` -> method `doLoad`
  - L174 `@PostMapping(value = "/update", produces = {MediaType.APPLICATION_JSON_VALUE})` -> method `doUpdate`
  - L187 `@PostMapping(value = "/findSetParamPage", produces = {MediaType.APPLICATION_JSON_VALUE})` -> method `findSetParamPage`
  - L221 `@PostMapping(value = "/saveSetParam", produces = {MediaType.APPLICATION_JSON_VALUE})` -> method `doSaveSetParam`
  - L234 `@PostMapping(value = "/deleteSetParam", produces = {MediaType.APPLICATION_JSON_VALUE})` -> method `doDeleteSetParam`
- Main methods:
  - L83 `public ResponseEntity<QueryResult<List<TbSysJreport>>> findPage(@RequestBody SearchBody searchBody)`
  - L101 `public ResponseEntity<DefaultControllerJsonResultObj<Boolean>> doDelete(@RequestBody TbSysJreport sysJreport)`
  - L112 `private void handlerCheck(DefaultControllerJsonResultObj<TbSysJreport> result, TbSysJreport sysJreport, boolean createMode)`
  - L124 `private void deployReport(DefaultResult<TbSysJreport> result)`
  - L131 `private void save(DefaultControllerJsonResultObj<TbSysJreport> result, TbSysJreport sysJreport)`
  - L138 `private void update(DefaultControllerJsonResultObj<TbSysJreport> result, TbSysJreport sysJreport)`
  - L148 `public ResponseEntity<DefaultControllerJsonResultObj<TbSysJreport>> doSave(@RequestBody TbSysJreport sysJreport)`
  - L161 `public ResponseEntity<DefaultControllerJsonResultObj<TbSysJreport>> doLoad(@RequestBody TbSysJreport sysJreport)`
  - L175 `public ResponseEntity<DefaultControllerJsonResultObj<TbSysJreport>> doUpdate(@RequestBody TbSysJreport sysJreport)`
  - L188 `public ResponseEntity<QueryResult<List<TbSysJreportParam>>> findSetParamPage(@RequestBody SearchBody searchBody)`
  - L201 `private void handlerCheckParam(DefaultControllerJsonResultObj<TbSysJreportParam> result, TbSysJreportParam param)`
  - L213 `private void saveParam(DefaultControllerJsonResultObj<TbSysJreportParam> result, TbSysJreportParam param)`
  - L222 `public ResponseEntity<DefaultControllerJsonResultObj<TbSysJreportParam>> doSaveSetParam(@RequestBody TbSysJreportParam param)`
  - L235 `public ResponseEntity<DefaultControllerJsonResultObj<Boolean>> doDeleteSetParam(@RequestBody TbSysJreportParam param)`
- Main fields:
  - L61 `long serialVersionUID`
  - L63 `String REPORT_ID_VAR`
  - L65 `transient ISysJreportService<TbSysJreport, String> sysJreportService`
  - L67 `transient ISysJreportParamService<TbSysJreportParam, String> sysJreportParamService`
  - L69 `transient ISystemJreportLogicService systemJreportLogicService`
- Full path: `C:\home\qifu4\backend\app\src\main\java\org\qifu\core\api\PROG001D0005Controller.java`
- Size: 12879 bytes

#### Source

````java
/* 
 * Copyright 2021-2023 qifu of copyright Chen Xin Nien
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
package org.qifu.core.api;

import java.io.IOException;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.qifu.base.exception.ControllerException;
import org.qifu.base.exception.ServiceException;
import org.qifu.base.model.CheckControllerFieldHandler;
import org.qifu.base.model.ControllerMethodAuthority;
import org.qifu.base.model.DefaultControllerJsonResultObj;
import org.qifu.base.model.DefaultResult;
import org.qifu.base.model.QueryResult;
import org.qifu.base.model.SearchBody;
import org.qifu.core.entity.TbSysJreport;
import org.qifu.core.entity.TbSysJreportParam;
import org.qifu.core.logic.ISystemJreportLogicService;
import org.qifu.core.service.ISysJreportParamService;
import org.qifu.core.service.ISysJreportService;
import org.qifu.core.util.CoreApiSupport;
import org.qifu.core.util.JReportUtils;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import net.sf.jasperreports.engine.JRException;
import ognl.OgnlException;

@Tag(name = "CORE_PROG001D0005", description = "Jasper report resources management.")
@RestController
@ResponseBody
@RequestMapping("/api/PROG001D0005")
public class PROG001D0005Controller extends CoreApiSupport {
	private static final long serialVersionUID = -6882334788025159559L;
	
	private static final String REPORT_ID_VAR = "reportId";
	
	private final transient ISysJreportService<TbSysJreport, String> sysJreportService;
	
	private final transient ISysJreportParamService<TbSysJreportParam, String> sysJreportParamService;
	
	private final transient ISystemJreportLogicService systemJreportLogicService;
	
	public PROG001D0005Controller(ISysJreportService<TbSysJreport, String> sysJreportService,
			ISysJreportParamService<TbSysJreportParam, String> sysJreportParamService,
			ISystemJreportLogicService systemJreportLogicService) {
		super();
		this.sysJreportService = sysJreportService;
		this.sysJreportParamService = sysJreportParamService;
		this.systemJreportLogicService = systemJreportLogicService;
	}
	
	@ControllerMethodAuthority(programId = "CORE_PROG001D0005Q", check = true)
	@Operation(summary = "CORE_PROG001D0005 - findPage", description = "查詢TB_SYS_JREPORT資料")
	@PostMapping(value = "/findPage", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<QueryResult<List<TbSysJreport>>> findPage(@RequestBody SearchBody searchBody) {
		QueryResult<List<TbSysJreport>> result = this.initResult();
		try {
			QueryResult<List<TbSysJreport>> queryResult = this.sysJreportService.findPage(
					"count", 
					"findPageSimple",
					this.queryParameter(searchBody).fullEquals(REPORT_ID_VAR).value(),
					searchBody.getPageOf().orderBy("REPORT_ID").sortTypeAsc());
			this.setQueryResponseJsonResult(queryResult, result, searchBody.getPageOf());
		} catch (ServiceException | ControllerException | OgnlException e) {
			this.noSuccessResult(result, e);
		} 
		return ResponseEntity.ok().body(result);
	}
	
	@ControllerMethodAuthority(programId = "CORE_PROG001D0005D", check = true)
	@Operation(summary = "CORE_PROG001D0005 - delete", description = "刪除TB_SYS_JREPORT資料")
	@PostMapping(value = "/delete", produces = {MediaType.APPLICATION_JSON_VALUE})	
	public ResponseEntity<DefaultControllerJsonResultObj<Boolean>> doDelete(@RequestBody TbSysJreport sysJreport) {
		DefaultControllerJsonResultObj<Boolean> result = this.initDefaultJsonResult();
		try {
			DefaultResult<Boolean> delResult = this.systemJreportLogicService.delete(sysJreport);
			this.setDefaultResponseJsonResult(delResult, result);
		} catch (ServiceException | ControllerException e) {
			this.exceptionResult(result, e);
		} 
		return ResponseEntity.ok().body(result);
	}
	
	private void handlerCheck(DefaultControllerJsonResultObj<TbSysJreport> result, TbSysJreport sysJreport, boolean createMode) throws ControllerException, ServiceException {
		CheckControllerFieldHandler<TbSysJreport> chk = this.getCheckControllerFieldHandler(result);
		chk.testField(REPORT_ID_VAR, sysJreport, "@org.apache.commons.lang3.StringUtils@isBlank(reportId)", "請輸入報表編號").throwHtmlMessage();
		chk.testField(REPORT_ID_VAR, sysJreport, "!@org.qifu.util.SimpleUtils@checkBeTrueOfAZaz09Id(reportId)", "報表編號只允許輸入0-9,a-z,A-Z正常字元").throwHtmlMessage();
		if (createMode) {
			chk.testField("file", sysJreport, "@org.apache.commons.lang3.StringUtils@isBlank(file)", "請輸入檔案").throwHtmlMessage();
			if (StringUtils.isBlank(sysJreport.getUploadBase64())) {
				chk.throwHtmlMessage("file", "請輸入檔案");
			}
		}
	}
	
	private void deployReport(DefaultResult<TbSysJreport> result) throws ControllerException, ServiceException, IOException, JRException {
		if (YES.equals(result.getSuccess())) {
			TbSysJreport sysJRpt = result.getValue();
			JReportUtils.deployReport(sysJRpt);			
		}		
	}
	
	private void save(DefaultControllerJsonResultObj<TbSysJreport> result, TbSysJreport sysJreport) throws ControllerException, ServiceException, IOException, JRException {
		this.handlerCheck(result, sysJreport, true);
		DefaultResult<TbSysJreport> cResult = this.systemJreportLogicService.create(sysJreport);
		this.deployReport(cResult);
		this.setDefaultResponseJsonResult(result, cResult);
	}
	
	private void update(DefaultControllerJsonResultObj<TbSysJreport> result, TbSysJreport sysJreport) throws ControllerException, ServiceException, IOException, JRException {
		this.handlerCheck(result, sysJreport, false);
		DefaultResult<TbSysJreport> uResult = this.systemJreportLogicService.update(sysJreport);
		this.deployReport(uResult);
		this.setDefaultResponseJsonResult(uResult, result);		
	}
	
	@ControllerMethodAuthority(programId = "CORE_PROG001D0005C", check = true)
	@Operation(summary = "CORE_PROG001D0005 - save", description = "新增TB_SYS_JREPORT資料")
	@PostMapping(value = "/save", produces = {MediaType.APPLICATION_JSON_VALUE})	
	public ResponseEntity<DefaultControllerJsonResultObj<TbSysJreport>> doSave(@RequestBody TbSysJreport sysJreport) {
		DefaultControllerJsonResultObj<TbSysJreport> result = this.initDefaultJsonResult();
		try {
			this.save(result, sysJreport);
		} catch (ServiceException | ControllerException | IOException | JRException e) {
			this.exceptionResult(result, e);
		} 
		return ResponseEntity.ok().body(result);
	}		
	
	@ControllerMethodAuthority(programId = "CORE_PROG001D0005E", check = true)
	@Operation(summary = "CORE_PROG001D0005 - load", description = "讀取TB_SYS_JREPORT資料")
	@PostMapping(value = "/load", produces = {MediaType.APPLICATION_JSON_VALUE})	
	public ResponseEntity<DefaultControllerJsonResultObj<TbSysJreport>> doLoad(@RequestBody TbSysJreport sysJreport) {
		DefaultControllerJsonResultObj<TbSysJreport> result = this.initDefaultJsonResult();
		try {
			DefaultResult<TbSysJreport> lResult = this.sysJreportService.selectByPrimaryKeySimple(sysJreport.getOid());
			this.setDefaultResponseJsonResult(lResult, result);
		} catch (ServiceException | ControllerException e) {
			this.exceptionResult(result, e);
		} 
		return ResponseEntity.ok().body(result);
	}	
	
	@ControllerMethodAuthority(programId = "CORE_PROG001D0005U", check = true)
	@Operation(summary = "CORE_PROG001D0005 - update", description = "更新TB_SYS_JREPORT資料")
	@PostMapping(value = "/update", produces = {MediaType.APPLICATION_JSON_VALUE})	
	public ResponseEntity<DefaultControllerJsonResultObj<TbSysJreport>> doUpdate(@RequestBody TbSysJreport sysJreport) {
		DefaultControllerJsonResultObj<TbSysJreport> result = this.initDefaultJsonResult();
		try {
			this.update(result, sysJreport);
		} catch (ServiceException | ControllerException | IOException | JRException e) {
			this.exceptionResult(result, e);
		} 
		return ResponseEntity.ok().body(result);
	}
	
	@ControllerMethodAuthority(programId = "CORE_PROG001D0005Q", check = true)
	@Operation(summary = "CORE_PROG001D0005 - findSetParamPage", description = "查詢TB_SYS_JREPORT_PARAM資料")
	@PostMapping(value = "/findSetParamPage", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<QueryResult<List<TbSysJreportParam>>> findSetParamPage(@RequestBody SearchBody searchBody) {
		QueryResult<List<TbSysJreportParam>> result = this.initResult();
		try {
			QueryResult<List<TbSysJreportParam>> queryResult = this.sysJreportParamService.findPage(
					this.queryParameter(searchBody).fullEquals(REPORT_ID_VAR).value(), 
					searchBody.getPageOf().orderBy("RPT_PARAM").sortTypeAsc());					
			this.setQueryResponseJsonResult(queryResult, result, searchBody.getPageOf());
		} catch (ServiceException | ControllerException e) {
			this.noSuccessResult(result, e);
		} 
		return ResponseEntity.ok().body(result);
	}
	
	private void handlerCheckParam(DefaultControllerJsonResultObj<TbSysJreportParam> result, TbSysJreportParam param) throws ControllerException, ServiceException {
		CheckControllerFieldHandler<TbSysJreportParam> chk = this.getCheckControllerFieldHandler(result);
		chk
		.testField(REPORT_ID_VAR, param, "@org.apache.commons.lang3.StringUtils@isBlank(reportId)", "請輸入Jasper報表編號")
		.testField("urlParam", param, "@org.apache.commons.lang3.StringUtils@isBlank(urlParam)", "請輸入Url參數")
		.testField("rptParam", param, "@org.apache.commons.lang3.StringUtils@isBlank(rptParam)", "請輸入報表參數")	
		.throwHtmlMessage();
		
		chk.testField("urlParam", param, "!@org.qifu.util.SimpleUtils@checkBeTrueOfAZaz09Id(urlParam)", "Url參數只允許輸入0-9,a-z,A-Z正常字元");		
		chk.testField("rptParam", param, "!@org.qifu.util.SimpleUtils@checkBeTrueOfAZaz09Id(rptParam)", "報表參數只允許輸入0-9,a-z,A-Z正常字元");	
	}	
	
	private void saveParam(DefaultControllerJsonResultObj<TbSysJreportParam> result, TbSysJreportParam param) throws ControllerException, ServiceException {
		this.handlerCheckParam(result, param);
		DefaultResult<TbSysJreportParam> cResult = this.sysJreportParamService.insert(param);
		this.setDefaultResponseJsonResult(cResult, result);
	}		
	
	@ControllerMethodAuthority(programId = "CORE_PROG001D0005C", check = true)
	@Operation(summary = "CORE_PROG001D0005 - saveSetParam", description = "新增TB_SYS_TEMPLATE_PARAM資料")
	@PostMapping(value = "/saveSetParam", produces = {MediaType.APPLICATION_JSON_VALUE})	
	public ResponseEntity<DefaultControllerJsonResultObj<TbSysJreportParam>> doSaveSetParam(@RequestBody TbSysJreportParam param) {
		DefaultControllerJsonResultObj<TbSysJreportParam> result = this.initDefaultJsonResult();
		try {			
			this.saveParam(result, param);
		} catch (ServiceException | ControllerException e) {
			this.exceptionResult(result, e);
		} 
		return ResponseEntity.ok().body(result);
	}	
	
	@ControllerMethodAuthority(programId = "CORE_PROG001D0005D", check = true)
	@Operation(summary = "CORE_PROG001D0005 - deleteSetParam", description = "刪除TB_SYS_TEMPLATE_PARAM資料")
	@PostMapping(value = "/deleteSetParam", produces = {MediaType.APPLICATION_JSON_VALUE})	
	public ResponseEntity<DefaultControllerJsonResultObj<Boolean>> doDeleteSetParam(@RequestBody TbSysJreportParam param) {
		DefaultControllerJsonResultObj<Boolean> result = this.initDefaultJsonResult();
		try {
			DefaultResult<Boolean> delResult = this.systemJreportLogicService.deleteParam(param);
			this.setDefaultResponseJsonResult(delResult, result);
		} catch (ServiceException | ControllerException e) {
			this.exceptionResult(result, e);
		} 
		return ResponseEntity.ok().body(result);
	}
	
}
````

### `backend/app/src/main/java/org/qifu/core/api/PROG002D0001Controller.java`

- Purpose: REST API Controller; declares class PROG002D0001Controller; defines 10 web mappings; has 14 detected methods; depends on 14 org.qifu local types
- Package: `org.qifu.core.api`
- Role: REST API Controller
- Main types: `class PROG002D0001Controller extends CoreApiSupport`
- Key annotations: `Tag`, `RestController`, `ResponseBody`, `RequestMapping`, `ControllerMethodAuthority`, `Operation`, `PostMapping`
- Local dependencies: `org.qifu.base.exception.ControllerException`, `org.qifu.base.exception.ServiceException`, `org.qifu.base.model.CheckControllerFieldHandler`, `org.qifu.base.model.ControllerMethodAuthority`, `org.qifu.base.model.DefaultControllerJsonResultObj`, `org.qifu.base.model.DefaultResult`, `org.qifu.base.model.QueryResult`, `org.qifu.base.model.SearchBody`, `org.qifu.core.entity.TbRole`, `org.qifu.core.entity.TbRolePermission`, `org.qifu.core.logic.IRoleLogicService`, `org.qifu.core.service.IRolePermissionService`, `org.qifu.core.service.IRoleService`, `org.qifu.core.util.CoreApiSupport`
- Spring dependencies: `org.springframework.http.MediaType`, `org.springframework.http.ResponseEntity`, `org.springframework.web.bind.annotation.PostMapping`, `org.springframework.web.bind.annotation.RequestBody`, `org.springframework.web.bind.annotation.RequestMapping`, `org.springframework.web.bind.annotation.ResponseBody`, `org.springframework.web.bind.annotation.RestController`
- Third-party dependencies: `io.swagger.v3.oas.annotations.Operation`, `io.swagger.v3.oas.annotations.tags.Tag`
- Web/API mappings:
  - L54 `@RequestMapping("/api/PROG002D0001")`
  - L75 `@PostMapping(value = "/findPage", produces = {MediaType.APPLICATION_JSON_VALUE})` -> method `findPage`
  - L91 `@PostMapping(value = "/delete", produces = {MediaType.APPLICATION_JSON_VALUE})` -> method `doDelete`
  - L123 `@PostMapping(value = "/save", produces = {MediaType.APPLICATION_JSON_VALUE})` -> method `doSave`
  - L136 `@PostMapping(value = "/load", produces = {MediaType.APPLICATION_JSON_VALUE})` -> method `doLoad`
  - L150 `@PostMapping(value = "/update", produces = {MediaType.APPLICATION_JSON_VALUE})` -> method `doUpdate`
  - L163 `@PostMapping(value = "/findSetParamPage", produces = {MediaType.APPLICATION_JSON_VALUE})` -> method `findSetParamPage`
  - L193 `@PostMapping(value = "/saveSetParam", produces = {MediaType.APPLICATION_JSON_VALUE})` -> method `doSaveSetParam`
  - L206 `@PostMapping(value = "/deleteSetParam", produces = {MediaType.APPLICATION_JSON_VALUE})` -> method `doDeleteSetParam`
  - L220 `@PostMapping(value = "/roleCopySaveJson", produces = {MediaType.APPLICATION_JSON_VALUE})` -> method `doSaveCopyAsNew`
- Main methods:
  - L76 `public ResponseEntity<QueryResult<List<TbRole>>> findPage(@RequestBody SearchBody searchBody)`
  - L92 `public ResponseEntity<DefaultControllerJsonResultObj<Boolean>> doDelete(@RequestBody TbRole role)`
  - L103 `private void handlerCheck(DefaultControllerJsonResultObj<TbRole> result, TbRole role)`
  - L109 `private void save(DefaultControllerJsonResultObj<TbRole> result, TbRole role)`
  - L115 `private void update(DefaultControllerJsonResultObj<TbRole> result, TbRole role)`
  - L124 `public ResponseEntity<DefaultControllerJsonResultObj<TbRole>> doSave(@RequestBody TbRole role)`
  - L137 `public ResponseEntity<DefaultControllerJsonResultObj<TbRole>> doLoad(@RequestBody TbRole role)`
  - L151 `public ResponseEntity<DefaultControllerJsonResultObj<TbRole>> doUpdate(@RequestBody TbRole role)`
  - L164 `public ResponseEntity<QueryResult<List<TbRolePermission>>> findSetParamPage(@RequestBody SearchBody searchBody)`
  - L177 `private void handlerCheckParam(DefaultControllerJsonResultObj<TbRolePermission> result, TbRolePermission perm)`
  - L185 `private void saveParam(DefaultControllerJsonResultObj<TbRolePermission> result, TbRolePermission perm)`
  - L194 `public ResponseEntity<DefaultControllerJsonResultObj<TbRolePermission>> doSaveSetParam(@RequestBody TbRolePermission perm)`
  - L207 `public ResponseEntity<DefaultControllerJsonResultObj<Boolean>> doDeleteSetParam(@RequestBody TbRolePermission perm)`
  - L221 `public ResponseEntity<DefaultControllerJsonResultObj<TbRole>> doSaveCopyAsNew(@RequestBody TbRole role)`
- Main fields:
  - L56 `long serialVersionUID`
  - L58 `transient IRoleService<TbRole, String> roleService`
  - L60 `transient IRolePermissionService<TbRolePermission, String> rolePermissionService`
  - L62 `transient IRoleLogicService roleLogicService`
- Full path: `C:\home\qifu4\backend\app\src\main\java\org\qifu\core\api\PROG002D0001Controller.java`
- Size: 11602 bytes

#### Source

````java
/* 
 * Copyright 2021-2023 qifu of copyright Chen Xin Nien
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
package org.qifu.core.api;

import java.util.List;

import org.qifu.base.exception.ControllerException;
import org.qifu.base.exception.ServiceException;
import org.qifu.base.model.CheckControllerFieldHandler;
import org.qifu.base.model.ControllerMethodAuthority;
import org.qifu.base.model.DefaultControllerJsonResultObj;
import org.qifu.base.model.DefaultResult;
import org.qifu.base.model.QueryResult;
import org.qifu.base.model.SearchBody;
import org.qifu.core.entity.TbRole;
import org.qifu.core.entity.TbRolePermission;
import org.qifu.core.logic.IRoleLogicService;
import org.qifu.core.service.IRolePermissionService;
import org.qifu.core.service.IRoleService;
import org.qifu.core.util.CoreApiSupport;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "CORE_PROG002D0001", description = "Role management.")
@RestController
@ResponseBody
@RequestMapping("/api/PROG002D0001")
public class PROG002D0001Controller extends CoreApiSupport {
	private static final long serialVersionUID = -8319767341034129139L;
	
	private final transient IRoleService<TbRole, String> roleService;
	
	private final transient IRolePermissionService<TbRolePermission, String> rolePermissionService;
	
	private final transient IRoleLogicService roleLogicService;
	
	public PROG002D0001Controller(IRoleService<TbRole, String> roleService,
			IRolePermissionService<TbRolePermission, String> rolePermissionService,
			IRoleLogicService roleLogicService) {
		super();
		this.roleService = roleService;
		this.rolePermissionService = rolePermissionService;
		this.roleLogicService = roleLogicService;
	}
	
	@ControllerMethodAuthority(programId = "CORE_PROG002D0001Q", check = true)
	@Operation(summary = "CORE_PROG002D0001 - findPage", description = "查詢TB_ROLE資料")
	@PostMapping(value = "/findPage", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<QueryResult<List<TbRole>>> findPage(@RequestBody SearchBody searchBody) {
		QueryResult<List<TbRole>> result = this.initResult();
		try {
			QueryResult<List<TbRole>> queryResult = this.roleService.findPage(
					this.queryParameter(searchBody).fullEquals("role").value(),
					searchBody.getPageOf().orderBy("ROLE").sortTypeAsc());
			this.setQueryResponseJsonResult(queryResult, result, searchBody.getPageOf());
		} catch (ServiceException | ControllerException e) {
			this.noSuccessResult(result, e);
		} 
		return ResponseEntity.ok().body(result);
	}	
	
	@ControllerMethodAuthority(programId = "CORE_PROG002D0001D", check = true)
	@Operation(summary = "CORE_PROG002D0001 - delete", description = "刪除TB_ROLE資料")
	@PostMapping(value = "/delete", produces = {MediaType.APPLICATION_JSON_VALUE})	
	public ResponseEntity<DefaultControllerJsonResultObj<Boolean>> doDelete(@RequestBody TbRole role) {
		DefaultControllerJsonResultObj<Boolean> result = this.initDefaultJsonResult();
		try {
			DefaultResult<Boolean> delResult = this.roleLogicService.delete(role);
			this.setDefaultResponseJsonResult(delResult, result);
		} catch (ServiceException | ControllerException e) {
			this.exceptionResult(result, e);
		} 
		return ResponseEntity.ok().body(result);
	}	
	
	private void handlerCheck(DefaultControllerJsonResultObj<TbRole> result, TbRole role) throws ControllerException, ServiceException {
		CheckControllerFieldHandler<TbRole> chk = this.getCheckControllerFieldHandler(result);
		chk.testField("role", role, "@org.apache.commons.lang3.StringUtils@isBlank(role)", "請輸入Role編號").throwHtmlMessage();
		chk.testField("role", role, "!@org.qifu.util.SimpleUtils@checkBeTrueOfAZaz09Id(role)", "Role編號只允許輸入0-9,a-z,A-Z正常字元").throwHtmlMessage();
	}	
	
	private void save(DefaultControllerJsonResultObj<TbRole> result, TbRole role) throws ControllerException, ServiceException {
		this.handlerCheck(result, role);
		DefaultResult<TbRole> cResult = this.roleLogicService.create(role);
		this.setDefaultResponseJsonResult(result, cResult);
	}	
	
	private void update(DefaultControllerJsonResultObj<TbRole> result, TbRole role) throws ControllerException, ServiceException {
		this.handlerCheck(result, role);
		DefaultResult<TbRole> uResult = this.roleLogicService.update(role);
		this.setDefaultResponseJsonResult(result, uResult);
	}		
	
	@ControllerMethodAuthority(programId = "CORE_PROG002D0001C", check = true)
	@Operation(summary = "CORE_PROG002D0001 - save", description = "新增TB_ROLE資料")
	@PostMapping(value = "/save", produces = {MediaType.APPLICATION_JSON_VALUE})	
	public ResponseEntity<DefaultControllerJsonResultObj<TbRole>> doSave(@RequestBody TbRole role) {
		DefaultControllerJsonResultObj<TbRole> result = this.initDefaultJsonResult();
		try {
			this.save(result, role);
		} catch (ServiceException | ControllerException e) {
			this.exceptionResult(result, e);
		} 
		return ResponseEntity.ok().body(result);
	}
	
	@ControllerMethodAuthority(programId = "CORE_PROG002D0001E", check = true)
	@Operation(summary = "CORE_PROG002D0001 - load", description = "讀取TB_ROLE資料")
	@PostMapping(value = "/load", produces = {MediaType.APPLICATION_JSON_VALUE})	
	public ResponseEntity<DefaultControllerJsonResultObj<TbRole>> doLoad(@RequestBody TbRole role) {
		DefaultControllerJsonResultObj<TbRole> result = this.initDefaultJsonResult();
		try {
			DefaultResult<TbRole> lResult = this.roleService.selectByEntityPrimaryKey(role);
			this.setDefaultResponseJsonResult(lResult, result);
		} catch (ServiceException | ControllerException e) {
			this.exceptionResult(result, e);
		} 
		return ResponseEntity.ok().body(result);
	}		
	
	@ControllerMethodAuthority(programId = "CORE_PROG002D0001U", check = true)
	@Operation(summary = "CORE_PROG002D0001 - update", description = "更新TB_ROLE資料")
	@PostMapping(value = "/update", produces = {MediaType.APPLICATION_JSON_VALUE})	
	public ResponseEntity<DefaultControllerJsonResultObj<TbRole>> doUpdate(@RequestBody TbRole role) {
		DefaultControllerJsonResultObj<TbRole> result = this.initDefaultJsonResult();
		try {
			this.update(result, role);
		} catch (ServiceException | ControllerException e) {
			this.exceptionResult(result, e);
		} 
		return ResponseEntity.ok().body(result);
	}	
	
	@ControllerMethodAuthority(programId = "CORE_PROG002D0001Q", check = true)
	@Operation(summary = "CORE_PROG002D0001 - findSetParamPage", description = "查詢TB_ROLE_Permission資料")
	@PostMapping(value = "/findSetParamPage", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<QueryResult<List<TbRolePermission>>> findSetParamPage(@RequestBody SearchBody searchBody) {
		QueryResult<List<TbRolePermission>> result = this.initResult();
		try {
			QueryResult<List<TbRolePermission>> queryResult = this.rolePermissionService.findPage(
					this.queryParameter(searchBody).fullEquals("role").value(), 
					searchBody.getPageOf().orderBy("PERM_TYPE,PERMISSION").sortTypeAsc());					
			this.setQueryResponseJsonResult(queryResult, result, searchBody.getPageOf());
		} catch (ServiceException | ControllerException e) {
			this.noSuccessResult(result, e);
		} 
		return ResponseEntity.ok().body(result);
	}	
	
	private void handlerCheckParam(DefaultControllerJsonResultObj<TbRolePermission> result, TbRolePermission perm) throws ControllerException, ServiceException {
		CheckControllerFieldHandler<TbRolePermission> chk = this.getCheckControllerFieldHandler(result);
		chk
		.testField("permission", perm, "@org.apache.commons.lang3.StringUtils@isBlank(permission)", "請輸入permission字串")
		.testField("permType", perm, "@org.apache.commons.lang3.StringUtils@isBlank(permType)", "請輸入類別")
		.throwHtmlMessage();
	}	
	
	private void saveParam(DefaultControllerJsonResultObj<TbRolePermission> result, TbRolePermission perm) throws ControllerException, ServiceException {
		this.handlerCheckParam(result, perm);
		DefaultResult<TbRolePermission> cResult = this.rolePermissionService.insert(perm);
		this.setDefaultResponseJsonResult(cResult, result);
	}		
	
	@ControllerMethodAuthority(programId = "CORE_PROG002D0001C", check = true)
	@Operation(summary = "CORE_PROG002D0001 - saveSetParam", description = "新增TB_ROLE_Permission資料")
	@PostMapping(value = "/saveSetParam", produces = {MediaType.APPLICATION_JSON_VALUE})	
	public ResponseEntity<DefaultControllerJsonResultObj<TbRolePermission>> doSaveSetParam(@RequestBody TbRolePermission perm) {
		DefaultControllerJsonResultObj<TbRolePermission> result = this.initDefaultJsonResult();
		try {			
			this.saveParam(result, perm);
		} catch (ServiceException | ControllerException e) {
			this.exceptionResult(result, e);
		} 
		return ResponseEntity.ok().body(result);
	}		
	
	@ControllerMethodAuthority(programId = "CORE_PROG002D0001D", check = true)
	@Operation(summary = "CORE_PROG002D0001 - deleteSetParam", description = "刪除TB_ROLE_Permission資料")
	@PostMapping(value = "/deleteSetParam", produces = {MediaType.APPLICATION_JSON_VALUE})	
	public ResponseEntity<DefaultControllerJsonResultObj<Boolean>> doDeleteSetParam(@RequestBody TbRolePermission perm) {
		DefaultControllerJsonResultObj<Boolean> result = this.initDefaultJsonResult();
		try {
			DefaultResult<Boolean> delResult = this.roleLogicService.deletePermission(perm);
			this.setDefaultResponseJsonResult(delResult, result);
		} catch (ServiceException | ControllerException e) {
			this.exceptionResult(result, e);
		} 
		return ResponseEntity.ok().body(result);
	}	
	
	@ControllerMethodAuthority(programId = "CORE_PROG002D0001C", check = true)
	@Operation(summary = "CORE_PROG002D0001 - saveCopyAsNew", description = "複製TB_ROLE資料")
	@PostMapping(value = "/roleCopySaveJson", produces = {MediaType.APPLICATION_JSON_VALUE})		
	public ResponseEntity<DefaultControllerJsonResultObj<TbRole>> doSaveCopyAsNew(@RequestBody TbRole role) {
		DefaultControllerJsonResultObj<TbRole> result = this.initDefaultJsonResult();
		try {
			DefaultResult<TbRole> cResult = this.roleLogicService.copyAsNew(role.getFromRoleOid(), role);
			this.setDefaultResponseJsonResult(cResult, result);
		} catch (ServiceException | ControllerException e) {
			this.exceptionResult(result, e);
		} 
		return ResponseEntity.ok().body(result);
	}	
	
}
````

### `backend/app/src/main/java/org/qifu/core/api/PROG002D0002Controller.java`

- Purpose: REST API Controller; declares class PROG002D0002Controller; defines 5 web mappings; has 4 detected methods; depends on 10 org.qifu local types
- Package: `org.qifu.core.api`
- Role: REST API Controller
- Main types: `class PROG002D0002Controller extends CoreApiSupport`
- Key annotations: `Tag`, `RestController`, `ResponseBody`, `RequestMapping`, `ControllerMethodAuthority`, `Operation`, `PostMapping`
- Local dependencies: `org.qifu.base.exception.ControllerException`, `org.qifu.base.exception.ServiceException`, `org.qifu.base.model.ControllerMethodAuthority`, `org.qifu.base.model.DefaultControllerJsonResultObj`, `org.qifu.base.model.DefaultResult`, `org.qifu.core.entity.TbAccount`, `org.qifu.core.entity.TbRole`, `org.qifu.core.logic.IRoleLogicService`, `org.qifu.core.service.IAccountService`, `org.qifu.core.util.CoreApiSupport`
- Spring dependencies: `org.springframework.http.MediaType`, `org.springframework.http.ResponseEntity`, `org.springframework.web.bind.annotation.PathVariable`, `org.springframework.web.bind.annotation.PostMapping`, `org.springframework.web.bind.annotation.RequestBody`, `org.springframework.web.bind.annotation.RequestMapping`, `org.springframework.web.bind.annotation.ResponseBody`, `org.springframework.web.bind.annotation.RestController`
- Third-party dependencies: `io.swagger.v3.oas.annotations.Operation`, `io.swagger.v3.oas.annotations.tags.Tag`
- Web/API mappings:
  - L52 `@RequestMapping("/api/PROG002D0002")`
  - L69 `@PostMapping(value = "/loadUserList", produces = {MediaType.APPLICATION_JSON_VALUE})` -> method `doLoadUserList`
  - L83 `@PostMapping(value = "/findUserRoleListByAccountOid", produces = {MediaType.APPLICATION_JSON_VALUE})` -> method `findUserRoleListByAccountOid`
  - L98 `@RequestMapping(value = "/updateUserRole/{accountOid}", produces = MediaType.APPLICATION_JSON_VALUE)` -> method `updateUserRole`
  - L112 `@RequestMapping(value = "/updateUserRole/{accountOid}/{roleAppendOid}", produces = MediaType.APPLICATION_JSON_VALUE)` -> method `updateUserRole`
- Main methods:
  - L70 `public ResponseEntity<DefaultControllerJsonResultObj<List<TbAccount>>> doLoadUserList()`
  - L84 `public ResponseEntity<DefaultControllerJsonResultObj<Map<String, List<TbRole>>>> findUserRoleListByAccountOid(@RequestBody TbAccount account)`
  - L99 `public ResponseEntity<DefaultControllerJsonResultObj<Boolean>> updateUserRole(@PathVariable String accountOid)`
  - L113 `public ResponseEntity<DefaultControllerJsonResultObj<Boolean>> updateUserRole(@PathVariable String accountOid, @PathVariable String roleAppendOid)`
- Main fields:
  - L54 `long serialVersionUID`
  - L56 `transient IAccountService<TbAccount, String> accountService`
  - L58 `transient IRoleLogicService roleLogicService`
- Full path: `C:\home\qifu4\backend\app\src\main\java\org\qifu\core\api\PROG002D0002Controller.java`
- Size: 5937 bytes

#### Source

````java
/* 
 * Copyright 2021-2023 qifu of copyright Chen Xin Nien
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
package org.qifu.core.api;

import java.util.List;
import java.util.Map;

import org.qifu.base.exception.ControllerException;
import org.qifu.base.exception.ServiceException;
import org.qifu.base.model.ControllerMethodAuthority;
import org.qifu.base.model.DefaultControllerJsonResultObj;
import org.qifu.base.model.DefaultResult;
import org.qifu.core.entity.TbAccount;
import org.qifu.core.entity.TbRole;
import org.qifu.core.logic.IRoleLogicService;
import org.qifu.core.service.IAccountService;
import org.qifu.core.util.CoreApiSupport;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "CORE_PROG002D0002", description = "Role of user.")
@RestController
@ResponseBody
@RequestMapping("/api/PROG002D0002")
public class PROG002D0002Controller extends CoreApiSupport {
	private static final long serialVersionUID = 2856536977765326140L;
	
	private final transient IAccountService<TbAccount, String> accountService;
	
	private final transient IRoleLogicService roleLogicService;
	
	public PROG002D0002Controller(IAccountService<TbAccount, String> accountService,
			IRoleLogicService roleLogicService) {
		super();
		this.accountService = accountService;
		this.roleLogicService = roleLogicService;
	}
	
	@ControllerMethodAuthority(programId = "CORE_PROG002D0002Q", check = true)
	@Operation(summary = "CORE_PROG002D0002 - loadUserList", description = "讀取TC_ACCOUNT資料")
	@PostMapping(value = "/loadUserList", produces = {MediaType.APPLICATION_JSON_VALUE})	
	public ResponseEntity<DefaultControllerJsonResultObj<List<TbAccount>>> doLoadUserList() {
		DefaultControllerJsonResultObj<List<TbAccount>> result = this.initDefaultJsonResult();
		try {
			DefaultResult<List<TbAccount>> lResult = this.accountService.selectList();
			this.setDefaultResponseJsonResult(lResult, result);
		} catch (ServiceException | ControllerException e) {
			this.exceptionResult(result, e);
		} 
		return ResponseEntity.ok().body(result);
	}		
	
	@ControllerMethodAuthority(programId = "CORE_PROG002D0002Q", check = true)
	@Operation(summary = "CORE_PROG002D0002 - findUserRoleListByAccountOid", description = "讀取使用者TB_ROLE資料")
	@PostMapping(value = "/findUserRoleListByAccountOid", produces = {MediaType.APPLICATION_JSON_VALUE})	
	public ResponseEntity<DefaultControllerJsonResultObj<Map<String, List<TbRole>>>> findUserRoleListByAccountOid(@RequestBody TbAccount account) {
		DefaultControllerJsonResultObj<Map<String, List<TbRole>>> result = this.initDefaultJsonResult();
		try {
			Map<String, List<TbRole>> searchDataMap = this.roleLogicService.findForAccountRoleEnableAndAll(account.getOid());
			result.setValue(searchDataMap);
			result.setSuccess( YES );
		} catch (ServiceException | ControllerException e) {
			this.exceptionResult(result, e);
		} 
		return ResponseEntity.ok().body(result);
	}		
	
	@ControllerMethodAuthority(programId = "CORE_PROG002D0002U", check = true)
	@Operation(summary = "CORE_PROG002D0002 - update user role - 1.", description = "更新使用者ROLE資料 - 1")
	@RequestMapping(value = "/updateUserRole/{accountOid}", produces = MediaType.APPLICATION_JSON_VALUE)		
	public ResponseEntity<DefaultControllerJsonResultObj<Boolean>> updateUserRole(@PathVariable String accountOid) {
		DefaultControllerJsonResultObj<Boolean> result = this.initDefaultJsonResult();
		try {
			DefaultResult<Boolean> uResult = this.roleLogicService.updateUserRole(accountOid, this.transformAppendKeyStringToList(""));
			this.setDefaultResponseJsonResult(result, uResult);
		} catch (ServiceException | ControllerException e) {
			this.exceptionResult(result, e);
		} 
		return ResponseEntity.ok().body(result);
	}	
	
	@ControllerMethodAuthority(programId = "CORE_PROG002D0002U", check = true)
	@Operation(summary = "CORE_PROG002D0002 - update user role - 2.", description = "更新使用者ROLE資料 - 2")
	@RequestMapping(value = "/updateUserRole/{accountOid}/{roleAppendOid}", produces = MediaType.APPLICATION_JSON_VALUE)		
	public ResponseEntity<DefaultControllerJsonResultObj<Boolean>> updateUserRole(@PathVariable String accountOid, @PathVariable String roleAppendOid) {
		DefaultControllerJsonResultObj<Boolean> result = this.initDefaultJsonResult();
		try {
			DefaultResult<Boolean> uResult = this.roleLogicService.updateUserRole(accountOid, this.transformAppendKeyStringToList(roleAppendOid));
			this.setDefaultResponseJsonResult(result, uResult);
		} catch (ServiceException | ControllerException e) {
			this.exceptionResult(result, e);
		} 
		return ResponseEntity.ok().body(result);
	}
	
}
````

### `backend/app/src/main/java/org/qifu/core/api/PROG002D0003Controller.java`

- Purpose: REST API Controller; declares class PROG002D0003Controller; defines 4 web mappings; has 3 detected methods; depends on 10 org.qifu local types
- Package: `org.qifu.core.api`
- Role: REST API Controller
- Main types: `class PROG002D0003Controller extends CoreApiSupport`
- Key annotations: `Tag`, `RestController`, `ResponseBody`, `RequestMapping`, `ControllerMethodAuthority`, `Operation`, `PostMapping`
- Local dependencies: `org.qifu.base.exception.ControllerException`, `org.qifu.base.exception.ServiceException`, `org.qifu.base.model.ControllerMethodAuthority`, `org.qifu.base.model.DefaultControllerJsonResultObj`, `org.qifu.base.model.DefaultResult`, `org.qifu.core.entity.TbRole`, `org.qifu.core.entity.TbSysProg`, `org.qifu.core.logic.IRoleLogicService`, `org.qifu.core.service.ISysProgService`, `org.qifu.core.util.CoreApiSupport`
- Spring dependencies: `org.springframework.http.MediaType`, `org.springframework.http.ResponseEntity`, `org.springframework.web.bind.annotation.PathVariable`, `org.springframework.web.bind.annotation.PostMapping`, `org.springframework.web.bind.annotation.RequestBody`, `org.springframework.web.bind.annotation.RequestMapping`, `org.springframework.web.bind.annotation.ResponseBody`, `org.springframework.web.bind.annotation.RestController`
- Third-party dependencies: `io.swagger.v3.oas.annotations.Operation`, `io.swagger.v3.oas.annotations.tags.Tag`
- Web/API mappings:
  - L52 `@RequestMapping("/api/PROG002D0003")`
  - L68 `@PostMapping(value = "/findProgramFolderMenuItem/{sysId}", produces = {MediaType.APPLICATION_JSON_VALUE})` -> method `findProgramFolderMenuItem`
  - L83 `@PostMapping(value = "/findMenuProgramRoleList", produces = {MediaType.APPLICATION_JSON_VALUE})` -> method `findMenuProgramRoleList`
  - L98 `@RequestMapping(value = "/updateMenuRole/{progOid}/{appendOid}", produces = MediaType.APPLICATION_JSON_VALUE)` -> method `updateUserRole`
- Main methods:
  - L69 `public ResponseEntity<DefaultControllerJsonResultObj<List<TbSysProg>>> findProgramFolderMenuItem(@PathVariable String sysId)`
  - L84 `public ResponseEntity<DefaultControllerJsonResultObj< Map<String, List<TbRole>> >> findMenuProgramRoleList(@RequestBody TbSysProg prog)`
  - L99 `public ResponseEntity<DefaultControllerJsonResultObj<Boolean>> updateUserRole(@PathVariable String progOid, @PathVariable String appendOid)`
- Main fields:
  - L54 `long serialVersionUID`
  - L56 `transient ISysProgService<TbSysProg, String> sysProgService`
  - L58 `transient IRoleLogicService roleLogicService`
- Full path: `C:\home\qifu4\backend\app\src\main\java\org\qifu\core\api\PROG002D0003Controller.java`
- Size: 5178 bytes

#### Source

````java
/* 
 * Copyright 2021-2023 qifu of copyright Chen Xin Nien
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
package org.qifu.core.api;

import java.util.List;
import java.util.Map;

import org.qifu.base.exception.ControllerException;
import org.qifu.base.exception.ServiceException;
import org.qifu.base.model.ControllerMethodAuthority;
import org.qifu.base.model.DefaultControllerJsonResultObj;
import org.qifu.base.model.DefaultResult;
import org.qifu.core.entity.TbRole;
import org.qifu.core.entity.TbSysProg;
import org.qifu.core.logic.IRoleLogicService;
import org.qifu.core.service.ISysProgService;
import org.qifu.core.util.CoreApiSupport;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "CORE_PROG002D0003", description = "Role of menu.")
@RestController
@ResponseBody
@RequestMapping("/api/PROG002D0003")
public class PROG002D0003Controller extends CoreApiSupport {
	private static final long serialVersionUID = -6375259391250545485L;
	
	private final transient ISysProgService<TbSysProg, String> sysProgService;
	
	private final transient IRoleLogicService roleLogicService;
	
	public PROG002D0003Controller(ISysProgService<TbSysProg, String> sysProgService, IRoleLogicService roleLogicService) {
		super();
		this.sysProgService = sysProgService;
		this.roleLogicService = roleLogicService;
	}
	
	@ControllerMethodAuthority(programId = "CORE_PROG002D0003Q", check = true)
	@Operation(summary = "CORE_PROG002D0003 - findProgramFolderMenuItem", description = "讀取程式清單TB_SYS_PROG List資料")
	@PostMapping(value = "/findProgramFolderMenuItem/{sysId}", produces = {MediaType.APPLICATION_JSON_VALUE})	
	public ResponseEntity<DefaultControllerJsonResultObj<List<TbSysProg>>> findProgramFolderMenuItem(@PathVariable String sysId) {
		DefaultControllerJsonResultObj<List<TbSysProg>> result = this.initDefaultJsonResult();
		try {
			List<TbSysProg> menuProgList = this.sysProgService.findForInTheFolderMenuItems(sysId, null, null);
			result.setValue(menuProgList);
			result.setSuccess( YES );
		} catch (ServiceException | ControllerException e) {
			this.exceptionResult(result, e);
		} 
		return ResponseEntity.ok().body(result);
	}	
	
	@ControllerMethodAuthority(programId = "CORE_PROG002D0003Q", check = true)
	@Operation(summary = "CORE_PROG002D0003 - findMenuProgramRoleList", description = "讀取程式Role List資料")
	@PostMapping(value = "/findMenuProgramRoleList", produces = {MediaType.APPLICATION_JSON_VALUE})	
	public ResponseEntity<DefaultControllerJsonResultObj< Map<String, List<TbRole>> >> findMenuProgramRoleList(@RequestBody TbSysProg prog) {
		DefaultControllerJsonResultObj< Map<String, List<TbRole>> > result = this.initDefaultJsonResult();
		try {
			Map<String, List<TbRole>> searchDataMap = this.roleLogicService.findForProgramRoleEnableAndAll(prog.getOid());
			result.setValue( searchDataMap );
			result.setSuccess( YES );
		} catch (ServiceException | ControllerException e) {
			this.exceptionResult(result, e);
		} 
		return ResponseEntity.ok().body(result);
	}		
	
	@ControllerMethodAuthority(programId = "CORE_PROG002D0003U", check = true)
	@Operation(summary = "CORE_PROG002D0003 - update menu role - 1.", description = "更新選單ROLE資料 - 1")
	@RequestMapping(value = "/updateMenuRole/{progOid}/{appendOid}", produces = MediaType.APPLICATION_JSON_VALUE)		
	public ResponseEntity<DefaultControllerJsonResultObj<Boolean>> updateUserRole(@PathVariable String progOid, @PathVariable String appendOid) {
		DefaultControllerJsonResultObj<Boolean> result = this.initDefaultJsonResult();
		try {
			DefaultResult<Boolean> uResult = this.roleLogicService.updateMenuRole(progOid, super.transformAppendKeyStringToList(appendOid));
			this.setDefaultResponseJsonResult(result, uResult);
		} catch (ServiceException | ControllerException e) {
			this.exceptionResult(result, e);
		} 
		return ResponseEntity.ok().body(result);
	}
	
}
````

### `backend/app/src/main/java/org/qifu/core/api/PROG004D0001Controller.java`

- Purpose: REST API Controller; declares class PROG004D0001Controller; defines 4 web mappings; has 3 detected methods; depends on 11 org.qifu local types
- Package: `org.qifu.core.api`
- Role: REST API Controller
- Main types: `class PROG004D0001Controller extends CoreApiSupport`
- Key annotations: `Tag`, `RestController`, `ResponseBody`, `RequestMapping`, `ControllerMethodAuthority`, `Operation`, `PostMapping`
- Local dependencies: `org.qifu.base.exception.ControllerException`, `org.qifu.base.exception.ServiceException`, `org.qifu.base.message.BaseSystemMessage`, `org.qifu.base.model.ControllerMethodAuthority`, `org.qifu.base.model.DefaultControllerJsonResultObj`, `org.qifu.base.model.DefaultResult`, `org.qifu.base.model.QueryResult`, `org.qifu.base.model.SearchBody`, `org.qifu.core.entity.TbSysEventLog`, `org.qifu.core.service.ISysEventLogService`, `org.qifu.core.util.CoreApiSupport`
- Spring dependencies: `org.springframework.http.MediaType`, `org.springframework.http.ResponseEntity`, `org.springframework.web.bind.annotation.PostMapping`, `org.springframework.web.bind.annotation.RequestBody`, `org.springframework.web.bind.annotation.RequestMapping`, `org.springframework.web.bind.annotation.ResponseBody`, `org.springframework.web.bind.annotation.RestController`
- Third-party dependencies: `io.swagger.v3.oas.annotations.Operation`, `io.swagger.v3.oas.annotations.tags.Tag`
- Web/API mappings:
  - L51 `@RequestMapping("/api/PROG004D0001")`
  - L64 `@PostMapping(value = "/findPage", produces = {MediaType.APPLICATION_JSON_VALUE})` -> method `findPage`
  - L80 `@PostMapping(value = "/delete", produces = {MediaType.APPLICATION_JSON_VALUE})` -> method `doDelete`
  - L94 `@PostMapping(value = "/deleteAll", produces = {MediaType.APPLICATION_JSON_VALUE})` -> method `doDeleteAll`
- Main methods:
  - L65 `public ResponseEntity<QueryResult<List<TbSysEventLog>>> findPage(@RequestBody SearchBody searchBody)`
  - L81 `public ResponseEntity<DefaultControllerJsonResultObj<Boolean>> doDelete(@RequestBody TbSysEventLog log)`
  - L95 `public ResponseEntity<DefaultControllerJsonResultObj<Boolean>> doDeleteAll()`
- Main fields:
  - L53 `long serialVersionUID`
  - L55 `transient ISysEventLogService<TbSysEventLog, String> sysEventLogService`
- Full path: `C:\home\qifu4\backend\app\src\main\java\org\qifu\core\api\PROG004D0001Controller.java`
- Size: 4784 bytes

#### Source

````java
/* 
 * Copyright 2021-2023 qifu of copyright Chen Xin Nien
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
package org.qifu.core.api;

import java.util.List;

import org.qifu.base.exception.ControllerException;
import org.qifu.base.exception.ServiceException;
import org.qifu.base.message.BaseSystemMessage;
import org.qifu.base.model.ControllerMethodAuthority;
import org.qifu.base.model.DefaultControllerJsonResultObj;
import org.qifu.base.model.DefaultResult;
import org.qifu.base.model.QueryResult;
import org.qifu.base.model.SearchBody;
import org.qifu.core.entity.TbSysEventLog;
import org.qifu.core.service.ISysEventLogService;
import org.qifu.core.util.CoreApiSupport;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "CORE_PROG004D0001", description = "Event log.")
@RestController
@ResponseBody
@RequestMapping("/api/PROG004D0001")
public class PROG004D0001Controller extends CoreApiSupport {
	private static final long serialVersionUID = 1711431436491423905L;
	
	private final transient ISysEventLogService<TbSysEventLog, String> sysEventLogService;
	
	public PROG004D0001Controller(ISysEventLogService<TbSysEventLog, String> sysEventLogService) {
		super();
		this.sysEventLogService = sysEventLogService;
	}
	
	@ControllerMethodAuthority(programId = "CORE_PROG004D0001Q", check = true)
	@Operation(summary = "CORE_PROG004D0001 - findPage", description = "查詢TB_SYS_EVENT_LOG資料")
	@PostMapping(value = "/findPage", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<QueryResult<List<TbSysEventLog>>> findPage(@RequestBody SearchBody searchBody) {
		QueryResult<List<TbSysEventLog>> result = this.initResult();
		try {
			QueryResult<List<TbSysEventLog>> queryResult = this.sysEventLogService.findPage(
					this.queryParameter(searchBody).fullEquals("user").value(), 
					searchBody.getPageOf().orderBy("CDATE").sortTypeDesc());
			this.setQueryResponseJsonResult(queryResult, result, searchBody.getPageOf());
		} catch (ServiceException | ControllerException e) {
			this.noSuccessResult(result, e);
		} 
		return ResponseEntity.ok().body(result);
	}		
	
	@ControllerMethodAuthority(programId = "CORE_PROG004D0001D", check = true)
	@Operation(summary = "CORE_PROG004D0001 - delete", description = "刪除TB_SYS_EVENT_LOG資料")
	@PostMapping(value = "/delete", produces = {MediaType.APPLICATION_JSON_VALUE})	
	public ResponseEntity<DefaultControllerJsonResultObj<Boolean>> doDelete(@RequestBody TbSysEventLog log) {
		DefaultControllerJsonResultObj<Boolean> result = this.initDefaultJsonResult();
		try {
			DefaultResult<Boolean> delResult = this.sysEventLogService.delete(log);
			this.setDefaultResponseJsonResult(delResult, result);
		} catch (ServiceException | ControllerException e) {
			this.exceptionResult(result, e);
		} 
		return ResponseEntity.ok().body(result);
	}
	
	@ControllerMethodAuthority(programId = "CORE_PROG004D0001D", check = true)
	@Operation(summary = "CORE_PROG004D0001 - deleteAll", description = "刪除TB_SYS_EVENT_LOG所有資料")
	@PostMapping(value = "/deleteAll", produces = {MediaType.APPLICATION_JSON_VALUE})	
	public ResponseEntity<DefaultControllerJsonResultObj<Boolean>> doDeleteAll() {
		DefaultControllerJsonResultObj<Boolean> result = this.initDefaultJsonResult();
		try {
			result.setValue( this.sysEventLogService.deleteAll() );
			result.setSuccess( YES );
			result.setMessage( BaseSystemMessage.deleteSuccess() );
		} catch (ServiceException | ControllerException e) {
			this.exceptionResult(result, e);
		} 
		return ResponseEntity.ok().body(result);
	}	
	
}
````

### `backend/app/src/main/java/org/qifu/core/api/PROG004D0002Controller.java`

- Purpose: REST API Controller; declares class PROG004D0002Controller; defines 3 web mappings; has 2 detected methods; depends on 10 org.qifu local types
- Package: `org.qifu.core.api`
- Role: REST API Controller
- Main types: `class PROG004D0002Controller extends CoreApiSupport`
- Key annotations: `Tag`, `RestController`, `ResponseBody`, `RequestMapping`, `ControllerMethodAuthority`, `Operation`, `PostMapping`
- Local dependencies: `org.qifu.base.exception.ControllerException`, `org.qifu.base.exception.ServiceException`, `org.qifu.base.model.ControllerMethodAuthority`, `org.qifu.base.model.DefaultControllerJsonResultObj`, `org.qifu.base.model.DefaultResult`, `org.qifu.base.model.QueryResult`, `org.qifu.base.model.SearchBody`, `org.qifu.core.entity.TbSysToken`, `org.qifu.core.service.ISysTokenService`, `org.qifu.core.util.CoreApiSupport`
- Spring dependencies: `org.springframework.http.MediaType`, `org.springframework.http.ResponseEntity`, `org.springframework.web.bind.annotation.PostMapping`, `org.springframework.web.bind.annotation.RequestBody`, `org.springframework.web.bind.annotation.RequestMapping`, `org.springframework.web.bind.annotation.ResponseBody`, `org.springframework.web.bind.annotation.RestController`
- Third-party dependencies: `io.swagger.v3.oas.annotations.Operation`, `io.swagger.v3.oas.annotations.tags.Tag`
- Web/API mappings:
  - L29 `@RequestMapping("/api/PROG004D0002")`
  - L42 `@PostMapping(value = "/findPage", produces = {MediaType.APPLICATION_JSON_VALUE})` -> method `findPage`
  - L58 `@PostMapping(value = "/delete", produces = {MediaType.APPLICATION_JSON_VALUE})` -> method `doDelete`
- Main methods:
  - L43 `public ResponseEntity<QueryResult<List<TbSysToken>>> findPage(@RequestBody SearchBody searchBody)`
  - L59 `public ResponseEntity<DefaultControllerJsonResultObj<Boolean>> doDelete(@RequestBody TbSysToken log)`
- Main fields:
  - L31 `long serialVersionUID`
  - L33 `transient ISysTokenService<TbSysToken, String> sysTokenService`
- Full path: `C:\home\qifu4\backend\app\src\main\java\org\qifu\core\api\PROG004D0002Controller.java`
- Size: 3153 bytes

#### Source

````java
package org.qifu.core.api;

import java.util.List;

import org.qifu.base.exception.ControllerException;
import org.qifu.base.exception.ServiceException;
import org.qifu.base.model.ControllerMethodAuthority;
import org.qifu.base.model.DefaultControllerJsonResultObj;
import org.qifu.base.model.DefaultResult;
import org.qifu.base.model.QueryResult;
import org.qifu.base.model.SearchBody;
import org.qifu.core.entity.TbSysToken;
import org.qifu.core.service.ISysTokenService;
import org.qifu.core.util.CoreApiSupport;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "CORE_PROG004D0002", description = "Token log.")
@RestController
@ResponseBody
@RequestMapping("/api/PROG004D0002")
public class PROG004D0002Controller extends CoreApiSupport {
	private static final long serialVersionUID = -1512324626977181535L;
	
	private final transient ISysTokenService<TbSysToken, String> sysTokenService;
	
	public PROG004D0002Controller(ISysTokenService<TbSysToken, String> sysTokenService) {
		super();
		this.sysTokenService = sysTokenService;
	}
	
	@ControllerMethodAuthority(programId = "CORE_PROG004D0002Q", check = true)
	@Operation(summary = "CORE_PROG004D0002 - findPage", description = "查詢TB_SYS_EVENT_LOG資料")
	@PostMapping(value = "/findPage", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<QueryResult<List<TbSysToken>>> findPage(@RequestBody SearchBody searchBody) {
		QueryResult<List<TbSysToken>> result = this.initResult();
		try {
			QueryResult<List<TbSysToken>> queryResult = this.sysTokenService.findPage(
					this.queryParameter(searchBody).fullEquals("userId").value(), 
					searchBody.getPageOf().orderBy("CDATE").sortTypeDesc());
			this.setQueryResponseJsonResult(queryResult, result, searchBody.getPageOf());
		} catch (ServiceException | ControllerException e) {
			this.noSuccessResult(result, e);
		} 
		return ResponseEntity.ok().body(result);
	}		
	
	@ControllerMethodAuthority(programId = "CORE_PROG004D0002D", check = true)
	@Operation(summary = "CORE_PROG004D0002 - delete", description = "刪除TB_SYS_EVENT_LOG資料")
	@PostMapping(value = "/delete", produces = {MediaType.APPLICATION_JSON_VALUE})	
	public ResponseEntity<DefaultControllerJsonResultObj<Boolean>> doDelete(@RequestBody TbSysToken log) {
		DefaultControllerJsonResultObj<Boolean> result = this.initDefaultJsonResult();
		try {
			DefaultResult<Boolean> delResult = this.sysTokenService.delete(log);
			this.setDefaultResponseJsonResult(delResult, result);
		} catch (ServiceException | ControllerException e) {
			this.exceptionResult(result, e);
		} 
		return ResponseEntity.ok().body(result);
	}	
	
}
````

### `backend/app/src/main/java/org/qifu/core/api/PROG005D0001Controller.java`

- Purpose: REST API Controller; declares class PROG005D0001Controller; defines 4 web mappings; has 3 detected methods; depends on 10 org.qifu local types
- Package: `org.qifu.core.api`
- Role: REST API Controller
- Main types: `class PROG005D0001Controller extends CoreApiSupport`
- Key annotations: `Tag`, `RestController`, `RequestMapping`, `Autowired`, `ControllerMethodAuthority`, `Operation`, `PostMapping`
- Local dependencies: `org.qifu.base.model.ControllerMethodAuthority`, `org.qifu.base.model.QueryResult`, `org.qifu.base.model.SearchBody`, `org.qifu.base.properties.MqttConfigProperties`, `org.qifu.core.interceptor.MqttMonitoringInterceptor`, `org.qifu.core.util.CoreApiSupport`, `org.qifu.core.vo.MqttBrokerVO`, `org.qifu.core.vo.MqttBrokerVO.MqttClientVO`, `org.qifu.core.vo.MqttMessageVO`, `org.qifu.core.vo.MqttTopicVO`
- Spring dependencies: `org.springframework.beans.factory.annotation.Autowired`, `org.springframework.http.MediaType`, `org.springframework.http.ResponseEntity`, `org.springframework.web.bind.annotation.PostMapping`, `org.springframework.web.bind.annotation.RequestBody`, `org.springframework.web.bind.annotation.RequestMapping`, `org.springframework.web.bind.annotation.RestController`
- Third-party dependencies: `io.moquette.broker.ClientDescriptor`, `io.moquette.broker.Server`, `io.swagger.v3.oas.annotations.Operation`, `io.swagger.v3.oas.annotations.tags.Tag`
- Injection/config points:
  - L39 `@Autowired` -> `private Server mqttServer;`
  - L42 `@Autowired` -> `private MqttMonitoringInterceptor interceptor;`
- Web/API mappings:
  - L34 `@RequestMapping("/api/PROG005D0001")`
  - L53 `@PostMapping(value = "/findPage", produces = MediaType.APPLICATION_JSON_VALUE)` -> method `findPage`
  - L84 `@PostMapping(value = "/findTopics", produces = MediaType.APPLICATION_JSON_VALUE)` -> method `findTopics`
  - L113 `@PostMapping(value = "/findMessages", produces = MediaType.APPLICATION_JSON_VALUE)` -> method `findMessages`
- Main methods:
  - L54 `public ResponseEntity<QueryResult<MqttBrokerVO>> findPage(@RequestBody SearchBody searchBody)`
  - L85 `public ResponseEntity<QueryResult<List<MqttTopicVO>>> findTopics(@RequestBody SearchBody searchBody)`
  - L114 `public ResponseEntity<QueryResult<List<MqttMessageVO>>> findMessages(@RequestBody SearchBody searchBody)`
- Main fields:
  - L37 `long serialVersionUID`
  - L40 `Server mqttServer`
  - L43 `MqttMonitoringInterceptor interceptor`
  - L45 `MqttConfigProperties mqttConfigProperties`
- Full path: `C:\home\qifu4\backend\app\src\main\java\org\qifu\core\api\PROG005D0001Controller.java`
- Size: 5064 bytes

#### Source

````java
package org.qifu.core.api;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.qifu.base.model.ControllerMethodAuthority;
import org.qifu.base.model.QueryResult;
import org.qifu.base.model.SearchBody;
import org.qifu.base.properties.MqttConfigProperties;
import org.qifu.core.interceptor.MqttMonitoringInterceptor;
import org.qifu.core.util.CoreApiSupport;
import org.qifu.core.vo.MqttBrokerVO;
import org.qifu.core.vo.MqttBrokerVO.MqttClientVO;
import org.qifu.core.vo.MqttMessageVO;
import org.qifu.core.vo.MqttTopicVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.moquette.broker.ClientDescriptor;
import io.moquette.broker.Server;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "CORE_PROG005D0001", description = "MQTT Dashboard.")
@RestController
@RequestMapping("/api/PROG005D0001")
public class PROG005D0001Controller extends CoreApiSupport {

	private static final long serialVersionUID = 52812734123L;

	@Autowired(required = false)
	private Server mqttServer;

	@Autowired(required = false)
	private MqttMonitoringInterceptor interceptor;

	private final MqttConfigProperties mqttConfigProperties;

	public PROG005D0001Controller(MqttConfigProperties mqttConfigProperties) {
		this.mqttConfigProperties = mqttConfigProperties;
	}

	@ControllerMethodAuthority(programId = "CORE_PROG005D0001Q", check = true)
	@Operation(summary = "findPage", description = "MQTT Dashboard 查詢")
	@PostMapping(value = "/findPage", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<QueryResult<MqttBrokerVO>> findPage(@RequestBody SearchBody searchBody) {
		QueryResult<MqttBrokerVO> result = this.initResult();
		try {
			MqttBrokerVO brokerVO = new MqttBrokerVO();
			brokerVO.setEnable(mqttConfigProperties.isEnable());
			brokerVO.setHost(mqttConfigProperties.getHost());
			brokerVO.setPort(mqttConfigProperties.getPort());
			List<MqttClientVO> clients = new ArrayList<>();
			if (mqttServer != null) {
				Collection<ClientDescriptor> descriptors = mqttServer.listConnectedClients();
				for (ClientDescriptor desc : descriptors) {
					MqttClientVO vo = new MqttClientVO();
					vo.setClientId(desc.getClientID());
					vo.setAddress(desc.getAddress());
					vo.setPort(desc.getPort());
					clients.add(vo);
				}
			}
			brokerVO.setClients(clients);
			brokerVO.setClientSize(clients.size());
			result.setValue(brokerVO);
			this.successResult(result);
		} catch (Exception e) {
			this.noSuccessResult(result, e.getMessage());
		}
		return ResponseEntity.ok(result);
	}

	@ControllerMethodAuthority(programId = "CORE_PROG005D0001Q", check = true)
	@Operation(summary = "findTopics", description = "MQTT Topics 查詢")
	@PostMapping(value = "/findTopics", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<QueryResult<List<MqttTopicVO>>> findTopics(@RequestBody SearchBody searchBody) {
		QueryResult<List<MqttTopicVO>> result = this.initResult();
		try {
			List<MqttTopicVO> topics = new ArrayList<>();
			Set<String> allTopics = new HashSet<>();
			if (interceptor != null) {
				allTopics.addAll(interceptor.getObservedTopics());
				allTopics.addAll(interceptor.getSubscribedTopics());
			}
			for (String topic : allTopics) {
				MqttTopicVO vo = new MqttTopicVO();
				vo.setTopic(topic);
				if (interceptor != null) {
					vo.setSubscriberCount(interceptor.getSubscriberCount(topic));
					vo.setLastMessageTime(interceptor.getLastTime(topic));
				}
				topics.add(vo);
			}
			result.setValue(topics);
			this.successResult(result);
		} catch (Exception e) {
			this.noSuccessResult(result, e.getMessage());
		}
		return ResponseEntity.ok(result);
	}

	@ControllerMethodAuthority(programId = "CORE_PROG005D0001Q", check = true)
	@Operation(summary = "findMessages", description = "MQTT Topic 訊息查詢")
	@PostMapping(value = "/findMessages", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<QueryResult<List<MqttMessageVO>>> findMessages(@RequestBody SearchBody searchBody) {
		QueryResult<List<MqttMessageVO>> result = this.initResult();
		try {
			String topic = (String) searchBody.getField().get("topic");
			List<MqttMessageVO> messages = new ArrayList<>();
			if (interceptor != null && topic != null) {
				messages = interceptor.getMessages(topic);
			}
			result.setValue(messages);
			this.successResult(result);
		} catch (Exception e) {
			this.noSuccessResult(result, e.getMessage());
		}
		return ResponseEntity.ok(result);
	}

}
````

### `backend/app/src/main/java/org/qifu/core/config/AdditionConfig.java`

- Purpose: Spring configuration; declares class AdditionConfig
- Package: `org.qifu.core.config`
- Role: Spring configuration
- Main types: `class AdditionConfig`
- Key annotations: `Configuration`, `Bean`
- Spring dependencies: `org.springframework.context.annotation.Bean`, `org.springframework.context.annotation.Configuration`, `org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder`, `org.springframework.security.crypto.password.PasswordEncoder`
- Full path: `C:\home\qifu4\backend\app\src\main\java\org\qifu\core\config\AdditionConfig.java`
- Size: 1251 bytes

#### Source

````java
/* 
 * Copyright 2019-2023 qifu of copyright Chen Xin Nien
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
package org.qifu.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class AdditionConfig {
    
	@Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
    
}
````

### `backend/app/src/main/java/org/qifu/core/config/CxfConfig.java`

- Purpose: Spring configuration; declares class CxfConfig; has 5 detected methods; depends on 2 org.qifu local types
- Package: `org.qifu.core.config`
- Role: Spring configuration
- Main types: `class CxfConfig`
- Key annotations: `Configuration`, `Value`, `Bean`, `Primary`
- Local dependencies: `org.qifu.base.CoreAppConstants`, `org.qifu.core.webservice.interceptor.SoapForceDoclitBareInInterceptor`
- Spring dependencies: `org.springframework.beans.factory.annotation.Value`, `org.springframework.boot.web.servlet.ServletRegistrationBean`, `org.springframework.context.annotation.Bean`, `org.springframework.context.annotation.Configuration`, `org.springframework.context.annotation.Primary`
- Third-party dependencies: `org.apache.cxf.bus.spring.SpringBus`, `org.apache.cxf.ext.logging.LoggingInInterceptor`, `org.apache.cxf.ext.logging.LoggingOutInterceptor`, `org.apache.cxf.transport.servlet.CXFServlet`
- Config keys referenced: `cxf.servlet.hide-service-list-page`
- Injection/config points:
  - L21 `@Value` -> `private String hideServiceListPage;`
- Main methods:
  - L32 `public SpringBus springBus()`
  - L37 `public LoggingInInterceptor loggingInInterceptor()`
  - L45 `public LoggingOutInterceptor loggingOutInterceptor()`
  - L53 `public SoapForceDoclitBareInInterceptor soapForceDoclitBareInInterceptor()`
  - L61 `public ServletRegistrationBean<CXFServlet> cxfServlet()`
- Main fields:
  - L22 `String hideServiceListPage`
  - L24 `LoggingInInterceptor loggingInInterceptor`
  - L26 `LoggingOutInterceptor loggingOutInterceptor`
  - L28 `SoapForceDoclitBareInInterceptor soapForceDoclitBareInInterceptor`
- Full path: `C:\home\qifu4\backend\app\src\main\java\org\qifu\core\config\CxfConfig.java`
- Size: 2226 bytes

#### Source

````java
package org.qifu.core.config;

import java.util.Arrays;
import java.util.Map;

import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.ext.logging.LoggingInInterceptor;
import org.apache.cxf.ext.logging.LoggingOutInterceptor;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.qifu.base.CoreAppConstants;
import org.qifu.core.webservice.interceptor.SoapForceDoclitBareInInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class CxfConfig {

	@Value("${cxf.servlet.hide-service-list-page}")
	private String hideServiceListPage;

	private LoggingInInterceptor loggingInInterceptor;

	private LoggingOutInterceptor loggingOutInterceptor;

	private SoapForceDoclitBareInInterceptor soapForceDoclitBareInInterceptor;

	@Bean(name = "cxf")
	@Primary
	public SpringBus springBus() {
		return new SpringBus();
	}

	@Bean
	public LoggingInInterceptor loggingInInterceptor() {
		if (null == this.loggingInInterceptor) {
			this.loggingInInterceptor = new LoggingInInterceptor();
		}
		return this.loggingInInterceptor;
	}

	@Bean
	public LoggingOutInterceptor loggingOutInterceptor() {
		if (null == this.loggingOutInterceptor) {
			this.loggingOutInterceptor = new LoggingOutInterceptor();
		}
		return this.loggingOutInterceptor;
	}

	@Bean
	public SoapForceDoclitBareInInterceptor soapForceDoclitBareInInterceptor() {
		if (null == this.soapForceDoclitBareInInterceptor) {
			this.soapForceDoclitBareInInterceptor = new SoapForceDoclitBareInInterceptor();
		}
		return this.soapForceDoclitBareInInterceptor;
	}

	@Bean
	public ServletRegistrationBean<CXFServlet> cxfServlet() {
		ServletRegistrationBean<CXFServlet> srb = new ServletRegistrationBean<>();
		srb.setServlet(new CXFServlet());
		srb.setUrlMappings(Arrays.asList(CoreAppConstants.WEBSERVICE_PATH));
		srb.setInitParameters(Map.of("hide-service-list-page", hideServiceListPage));
		return srb;
	}

}
````

### `backend/app/src/main/java/org/qifu/core/config/LdapConfig.java`

- Purpose: Spring configuration; declares class LdapConfig; has 2 detected methods; depends on 2 org.qifu local types
- Package: `org.qifu.core.config`
- Role: Spring configuration
- Main types: `class LdapConfig`
- Key annotations: `Configuration`, `Bean`
- Local dependencies: `org.qifu.base.model.YesNoKeyProvide`, `org.qifu.base.properties.LdapLoginConfigProperties`
- Spring dependencies: `org.springframework.context.annotation.Bean`, `org.springframework.context.annotation.Configuration`, `org.springframework.ldap.core.LdapTemplate`, `org.springframework.ldap.core.support.LdapContextSource`
- Third-party dependencies: `org.apache.commons.lang3.StringUtils`
- Main methods:
  - L46 `public LdapContextSource contextSource()`
  - L64 `public LdapTemplate ldapTemplate()`
- Main fields:
  - L38 `LdapLoginConfigProperties ldapLoginConfigProperties`
- Full path: `C:\home\qifu4\backend\app\src\main\java\org\qifu\core\config\LdapConfig.java`
- Size: 2805 bytes

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
package org.qifu.core.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.qifu.base.model.YesNoKeyProvide;
import org.qifu.base.properties.LdapLoginConfigProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.ldap.core.support.LdapContextSource;

@Configuration
public class LdapConfig {
	
	private final LdapLoginConfigProperties ldapLoginConfigProperties;
	
    public LdapConfig(LdapLoginConfigProperties ldapLoginConfigProperties) {
		super();
		this.ldapLoginConfigProperties = ldapLoginConfigProperties;
	}

	@Bean
    public LdapContextSource contextSource() {
    	LdapContextSource contextSource = new LdapContextSource();
    	if ( !StringUtils.isBlank(ldapLoginConfigProperties.getJavaNamingReferral()) ) {
        	Map<String, Object> p = new HashMap<>();
        	p.put("java.naming.referral", StringUtils.deleteWhitespace(ldapLoginConfigProperties.getJavaNamingReferral()));    	
        	contextSource.setBaseEnvironmentProperties(p);    		
    	}
    	contextSource.setUrl( ldapLoginConfigProperties.getContextUrl() );
    	contextSource.setBase( ldapLoginConfigProperties.getContextBase() );
    	contextSource.setUserDn( ldapLoginConfigProperties.getContextUserDn() );
    	contextSource.setPassword( ldapLoginConfigProperties.getContextPassword() );
    	if (YesNoKeyProvide.YES.equals( ldapLoginConfigProperties.getPooled() )) {
    		contextSource.setPooled(true);
    	}
    	return contextSource;
    }
    
    @Bean
    public LdapTemplate ldapTemplate() {
    	LdapTemplate template = new LdapTemplate(contextSource());
    	if (YesNoKeyProvide.YES.equals( ldapLoginConfigProperties.getIgnorePartialResultException() )) {
    		template.setIgnorePartialResultException(true);
    	}    	
    	return template;
    }
    
}
````

### `backend/app/src/main/java/org/qifu/core/config/MqttBrokerConfig.java`

- Purpose: Spring configuration; declares class MqttBrokerConfig; has 3 detected methods; depends on 3 org.qifu local types
- Package: `org.qifu.core.config`
- Role: Spring configuration
- Main types: `class MqttBrokerConfig`
- Key annotations: `Configuration`, `ConditionalOnProperty`, `Bean`, `SuppressWarnings`, `PreDestroy`
- Local dependencies: `org.qifu.base.properties.MqttConfigProperties`, `org.qifu.core.interceptor.MqttMonitoringInterceptor`, `org.qifu.util.LoadResources`
- Spring dependencies: `org.springframework.boot.autoconfigure.condition.ConditionalOnProperty`, `org.springframework.context.annotation.Configuration`, `org.springframework.context.annotation.Bean`
- Third-party dependencies: `io.moquette.broker.Server`, `io.moquette.broker.config.FluentConfig`, `org.apache.commons.codec.digest.DigestUtils`, `org.apache.commons.io.FileUtils`, `org.apache.commons.lang3.math.NumberUtils`, `org.apache.logging.log4j.LogManager`, `org.apache.logging.log4j.Logger`
- Main methods:
  - L39 `public MqttMonitoringInterceptor mqttMonitoringInterceptor()`
  - L44 `public Server mqttServer(MqttMonitoringInterceptor interceptor)`
  - L101 `public void stopMqttServer()`
- Main fields:
  - L29 `Logger log`
  - L30 `MqttConfigProperties mqttConfigProperties`
  - L31 `Server mqttServer`
  - L32 `File tempPasswordFile`
- Full path: `C:\home\qifu4\backend\app\src\main\java\org\qifu\core\config\MqttBrokerConfig.java`
- Size: 4532 bytes

#### Source

````java
package org.qifu.core.config;

import io.moquette.broker.Server;
import io.moquette.broker.config.FluentConfig;
import jakarta.annotation.PreDestroy;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.qifu.base.properties.MqttConfigProperties;
import org.qifu.core.interceptor.MqttMonitoringInterceptor;
import org.qifu.util.LoadResources;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@Configuration
@ConditionalOnProperty(prefix = "mqttbroker", name = "enable", havingValue = "true", matchIfMissing = false)
public class MqttBrokerConfig {
	private static final Logger log = LogManager.getLogger(MqttBrokerConfig.class);
	private final MqttConfigProperties mqttConfigProperties;
	private Server mqttServer;
	private File tempPasswordFile;

	public MqttBrokerConfig(MqttConfigProperties mqttConfigProperties) {
		this.mqttConfigProperties = mqttConfigProperties;
	}
	
	@Bean
	public MqttMonitoringInterceptor mqttMonitoringInterceptor() {
		return new MqttMonitoringInterceptor(mqttConfigProperties);
	}

	@Bean
	public Server mqttServer(MqttMonitoringInterceptor interceptor) throws IOException {
		log.info("====================================================================");
		log.info(" [MQTT] 正在初始化內嵌式 Moquette MQTT Broker ({})...", mqttConfigProperties.isEnablePersistence() ? "檔案模式" : "非檔案模式");
		log.info("====================================================================");

		File storeDir = new File(mqttConfigProperties.getStorePath());
		if (!storeDir.exists()) {
			storeDir.mkdirs();
		}

		// 1. 動態生成 Moquette 標準密碼檔案
		try {
			tempPasswordFile = new File(mqttConfigProperties.getTempPasswordFile());
			try (PrintWriter writer = new PrintWriter(tempPasswordFile)) {
				@SuppressWarnings("unchecked")
				Map<String, Object> dataMap = LoadResources.objectMapperReadValue("mqtt-user.json", Map.class, MqttBrokerConfig.class);
				@SuppressWarnings("unchecked")
				List<Map<String, String>> accountList = (List<Map<String, String>>) dataMap.get("accountList");
				for (Map<String, String> account : accountList) {
					writer.println(account.get("account") + ":" + DigestUtils.sha256Hex(account.get("password")));
				}
			}
			log.info(" [MQTT] 安全憑證檔案已成功在本地生成。");
		} catch (IOException e) {
			log.error(" [MQTT] 無法生成憑證檔案: ", e);
		}
		
		FluentConfig fConfig = new FluentConfig()
		        .host(mqttConfigProperties.getHost())
		        .port(NumberUtils.toInt(mqttConfigProperties.getPort(),1883))
		        .passwordFile(tempPasswordFile.getAbsolutePath());
		
		if (mqttConfigProperties.isEnablePersistence()) {
			fConfig.enablePersistence().dataPath(mqttConfigProperties.getStorePath());	
		}
		
		if (!mqttConfigProperties.isAllowAnonymous()) {
			fConfig.disallowAnonymous();
		}
		if (mqttConfigProperties.isTelemetryEnabled()) {
			fConfig.enableTelemetry();
		} else {
			fConfig.disableTelemetry();
		}
		
		// 3. 啟動服務
		mqttServer = new Server();
		mqttServer.startServer(fConfig.build(), Collections.singletonList(interceptor));
		
		log.info("====================================================================");
		log.info(" [MQTT] Broker 啟動成功！已透過標準安全檔啟用帳密卡控 (Port: {})。", mqttConfigProperties.getPort());
		log.info("====================================================================");

		return mqttServer;
	}

	@PreDestroy
	public void stopMqttServer() {
		if (mqttServer != null) {
			log.info(" [MQTT] 偵測到 Spring 容器關閉，正在安全儲存佇列數據並關閉 MQTT Broker...");
			mqttServer.stopServer();
			log.info(" [MQTT] MQTT Broker 已安全關閉。");
		}
		if (tempPasswordFile != null && tempPasswordFile.exists()) {
			try {
				FileUtils.delete(tempPasswordFile);
			} catch (IOException e) {
				log.error(e.getMessage());
			}
			log.info(" [MQTT] 暫存憑證檔案已成功刪除。");
		}
	}
	
}
````

### `backend/app/src/main/java/org/qifu/core/config/MyBatisConfig.java`

- Purpose: Spring configuration; declares class MyBatisConfig; has 6 detected methods
- Package: `org.qifu.core.config`
- Role: Spring configuration
- Main types: `class MyBatisConfig implements EnvironmentAware`
- Key annotations: `MapperScan`, `Configuration`, `EnableAutoConfiguration`, `EnableTransactionManagement`, `PropertySource`, `Resource`, `Override`, `Primary`, `Bean`, `ConfigurationProperties`, `DependsOn`
- Spring dependencies: `org.springframework.beans.factory.annotation.Qualifier`, `org.springframework.boot.autoconfigure.EnableAutoConfiguration`, `org.springframework.boot.context.properties.ConfigurationProperties`, `org.springframework.boot.jdbc.DataSourceBuilder`, `org.springframework.context.EnvironmentAware`, `org.springframework.context.annotation.Bean`, `org.springframework.context.annotation.Configuration`, `org.springframework.context.annotation.DependsOn`, `org.springframework.context.annotation.Primary`, `org.springframework.context.annotation.PropertySource`, `org.springframework.core.env.Environment`, `org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate`, `org.springframework.jdbc.datasource.DataSourceTransactionManager`, `org.springframework.transaction.annotation.EnableTransactionManagement`
- Third-party dependencies: `org.apache.ibatis.session.SqlSessionFactory`, `org.mybatis.spring.SqlSessionFactoryBean`, `org.mybatis.spring.SqlSessionTemplate`, `org.mybatis.spring.annotation.MapperScan`, `org.slf4j.Logger`, `org.slf4j.LoggerFactory`
- Config keys referenced: `db1.datasource.jdbcUrl`
- Injection/config points:
  - L61 `@Resource` -> `public void setEnvironment(Environment environment) {`
- Main methods:
  - L63 `public void setEnvironment(Environment environment)`
  - L70 `public DataSource dataSource()`
  - L79 `public NamedParameterJdbcTemplate db1JdbcTemplate()`
  - L86 `public SqlSessionFactory sqlSessionFactory()`
  - L94 `public SqlSessionTemplate sqlSessionTemplate(@Qualifier("sqlSessionFactory") SqlSessionFactory sessionFactory)`
  - L100 `public DataSourceTransactionManager transactionManager(@Qualifier("dataSource") DataSource dataSource)`
- Main fields:
  - L55 `Logger logger`
  - L57 `Environment environment`
  - L59 `DataSource dataSource`
- Full path: `C:\home\qifu4\backend\app\src\main\java\org\qifu\core\config\MyBatisConfig.java`
- Size: 3991 bytes

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
package org.qifu.core.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import jakarta.annotation.Resource;

@MapperScan(basePackages = "org.qifu.core.mapper", sqlSessionFactoryRef = "sqlSessionFactory")
@Configuration
@EnableAutoConfiguration
@EnableTransactionManagement
@PropertySource("classpath:db1-config.properties")
public class MyBatisConfig implements EnvironmentAware {
	protected static Logger logger = LoggerFactory.getLogger(MyBatisConfig.class);
	
	private Environment environment;
	
	private DataSource dataSource;
	
	@Resource
	@Override
	public void setEnvironment(Environment environment) {
		this.environment = environment;
	}
	
	@Primary
	@Bean(name = "dataSource")
	@ConfigurationProperties(prefix = "db1.datasource")
	public DataSource dataSource() {		
		String jdbcUrl = environment.getProperty("db1.datasource.jdbcUrl");
		logger.info("dataSource build jdbcUrl: {}", jdbcUrl);
		this.dataSource = DataSourceBuilder.create().build();
		return this.dataSource;
	}	
	
	@Bean(name = "db1JdbcTemplate")
	@DependsOn("dataSource")
	public NamedParameterJdbcTemplate db1JdbcTemplate() {
		return new NamedParameterJdbcTemplate(this.dataSource);
	}
	
	@Bean(name = "sqlSessionFactory")
	@Primary
	@DependsOn("dataSource")
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(this.dataSource);
        return sqlSessionFactoryBean.getObject();
    }
	
	@Bean("sqlSessionTemplate")
	@DependsOn("sqlSessionFactory")
	public SqlSessionTemplate sqlSessionTemplate(@Qualifier("sqlSessionFactory") SqlSessionFactory sessionFactory) {
		return new SqlSessionTemplate(sessionFactory);
	}
	
    @Bean(name = "transactionManager")
    @DependsOn("dataSource")
    public DataSourceTransactionManager transactionManager(@Qualifier("dataSource") DataSource dataSource) {
    	return new DataSourceTransactionManager(dataSource);
    }
    
}
````

### `backend/app/src/main/java/org/qifu/core/config/SwaggerConfig.java`

- Purpose: Spring configuration; declares class SwaggerConfig; has 1 detected methods; depends on 1 org.qifu local types
- Package: `org.qifu.core.config`
- Role: Spring configuration
- Main types: `class SwaggerConfig`
- Key annotations: `Configuration`, `OpenAPIDefinition`, `Bean`
- Local dependencies: `org.qifu.base.Constants`
- Spring dependencies: `org.springframework.context.annotation.Bean`, `org.springframework.context.annotation.Configuration`
- Third-party dependencies: `io.swagger.v3.oas.annotations.OpenAPIDefinition`, `io.swagger.v3.oas.models.Components`, `io.swagger.v3.oas.models.OpenAPI`, `io.swagger.v3.oas.models.info.Contact`, `io.swagger.v3.oas.models.info.Info`, `io.swagger.v3.oas.models.info.License`, `io.swagger.v3.oas.models.security.SecurityRequirement`, `io.swagger.v3.oas.models.security.SecurityScheme`
- Main methods:
  - L49 `public OpenAPI customOpenAPI()`
- Main fields:
  - L46 `String SECURITY_SCHEME_NAME`
- Full path: `C:\home\qifu4\backend\app\src\main\java\org\qifu\core\config\SwaggerConfig.java`
- Size: 2400 bytes

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
package org.qifu.core.config;

import java.util.List;

import org.qifu.base.Constants;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
/**
 * http://127.0.0.1:8088/swagger-ui/
 * http://127.0.0.1:8088/swagger-ui/index.html
 */
@Configuration
@OpenAPIDefinition
public class SwaggerConfig {
	
	private static final String SECURITY_SCHEME_NAME = "bearerAuth";
	
	@Bean
	public OpenAPI customOpenAPI() {
		Contact contact = new Contact().name("Bill Chen").email("chen.xin.nien@gmail.com");
		License license = new License().name("Apache 2.0").url("http://www.apache.org/licenses/LICENSE-2.0");
		Info info = new Info().title("QiFu4").description("backend interface.").version("0.4").contact(contact).license(license);
		Components component = new Components().addSecuritySchemes(
				SECURITY_SCHEME_NAME, 
				new SecurityScheme().type(SecurityScheme.Type.HTTP).scheme(Constants.TOKEN_PREFIX).bearerFormat("JWT")
		);
		SecurityRequirement securityReq = new SecurityRequirement().addList(SECURITY_SCHEME_NAME);
		return new OpenAPI().components(component).security(List.of(securityReq)).info(info);
	}
	
}
````

### `backend/app/src/main/java/org/qifu/core/config/WebConfig.java`

- Purpose: Spring configuration; declares class WebConfig; has 4 detected methods; depends on 3 org.qifu local types
- Package: `org.qifu.core.config`
- Role: Spring configuration
- Main types: `class WebConfig implements WebMvcConfigurer`
- Key annotations: `Configuration`, `Override`, `Bean`
- Local dependencies: `org.qifu.base.CoreAppConstants`, `org.qifu.base.properties.PageVariableConfigProperties`, `org.qifu.core.interceptor.ControllerAuthorityCheckInterceptor`
- Spring dependencies: `org.springframework.context.annotation.Bean`, `org.springframework.context.annotation.Configuration`, `org.springframework.web.context.request.RequestContextListener`, `org.springframework.web.servlet.config.annotation.CorsRegistry`, `org.springframework.web.servlet.config.annotation.InterceptorRegistry`, `org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry`, `org.springframework.web.servlet.config.annotation.WebMvcConfigurer`
- Main methods:
  - L49 `public void addResourceHandlers(ResourceHandlerRegistry registry)`
  - L56 `public RequestContextListener requestContextListener()`
  - L66 `public void addInterceptors(InterceptorRegistry registry)`
  - L73 `public void addCorsMappings(CorsRegistry registry)`
- Main fields:
  - L38 `String[] API_PATH`
  - L40 `String EVENT_LOG_PATH`
  - L42 `PageVariableConfigProperties pageVariableConfigProperties`
- Full path: `C:\home\qifu4\backend\app\src\main\java\org\qifu\core\config\WebConfig.java`
- Size: 3222 bytes

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
package org.qifu.core.config;

import org.qifu.base.CoreAppConstants;
import org.qifu.base.properties.PageVariableConfigProperties;
import org.qifu.core.interceptor.ControllerAuthorityCheckInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestContextListener;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
	
	private static final String[] API_PATH = new String[] { "/api/*", "/api/**" };
	
	private static final String EVENT_LOG_PATH = "/api/PROG004D0001/**";
	
	private final PageVariableConfigProperties pageVariableConfigProperties;
	
    public WebConfig(PageVariableConfigProperties pageVariableConfigProperties) {
		this.pageVariableConfigProperties = pageVariableConfigProperties;
	}
    
	@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
        .addResourceHandler( CoreAppConstants.getWebconfigresource() )
        .addResourceLocations( CoreAppConstants.getWebconfigresourcelocations() );
    }
    
    @Bean 
    public RequestContextListener requestContextListener(){
        return new RequestContextListener();
    }     
    
    @Bean
    ControllerAuthorityCheckInterceptor controllerAuthorityCheckInterceptor() {
    	return new ControllerAuthorityCheckInterceptor();
    }
    
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(controllerAuthorityCheckInterceptor())
        	.addPathPatterns(API_PATH)
        	.excludePathPatterns( CoreAppConstants.AUTH_PATH ).excludePathPatterns( EVENT_LOG_PATH );
    }
    
    @Override
    public void addCorsMappings(CorsRegistry registry) {
    	registry.addMapping("/**")
    		.allowedOriginPatterns(pageVariableConfigProperties.getAllowedOriginVals())
    		.allowedMethods("*")
    		.allowCredentials(true) 
    		.maxAge(3600)
    		.allowedHeaders("*")
    		.exposedHeaders( CoreAppConstants.X_CSRF_TOKEN_HEADER );
    }
    
}
````

### `backend/app/src/main/java/org/qifu/core/config/WebSecurityConfig.java`

- Purpose: Spring configuration; declares class WebSecurityConfig; has 8 detected methods; depends on 10 org.qifu local types
- Package: `org.qifu.core.config`
- Role: Spring configuration
- Main types: `class WebSecurityConfig`
- Key annotations: `Configuration`, `EnableWebSecurity`, `Bean`
- Local dependencies: `org.qifu.base.Constants`, `org.qifu.base.CoreAppConstants`, `org.qifu.base.service.impl.BaseUserDetailsService`, `org.qifu.base.support.TokenStoreValidateBuilder`, `org.qifu.core.util.CookieUtils`, `org.qifu.core.filter.CsrfCookieFilter`, `org.qifu.core.filter.JwtUserContextFilter`, `org.qifu.core.handler.CustomAccessDeniedHandler`, `org.qifu.core.handler.SpaCsrfTokenRequestHandler`, `org.qifu.core.support.JwtAuthEntryPoint`
- Spring dependencies: `org.springframework.boot.web.servlet.FilterRegistrationBean`, `org.springframework.context.annotation.Bean`, `org.springframework.context.annotation.Configuration`, `org.springframework.security.authentication.AuthenticationManager`, `org.springframework.security.authentication.dao.DaoAuthenticationProvider`, `org.springframework.security.config.Customizer`, `org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration`, `org.springframework.security.config.annotation.web.builders.HttpSecurity`, `org.springframework.security.config.annotation.web.configuration.EnableWebSecurity`, `org.springframework.security.config.http.SessionCreationPolicy`, `org.springframework.security.crypto.password.PasswordEncoder`, `org.springframework.security.oauth2.core.DelegatingOAuth2TokenValidator`, `org.springframework.security.oauth2.core.OAuth2Error`, `org.springframework.security.oauth2.core.OAuth2TokenValidator`, `org.springframework.security.oauth2.core.OAuth2TokenValidatorResult`, `org.springframework.security.oauth2.jwt.Jwt`, `org.springframework.security.oauth2.jwt.JwtDecoder`, `org.springframework.security.oauth2.jwt.JwtTimestampValidator`, `org.springframework.security.oauth2.jwt.JwtValidators`, `org.springframework.security.oauth2.jwt.NimbusJwtDecoder`
- Main methods:
  - L96 `public AuthenticationManager authenticationManagerBean(AuthenticationConfiguration authenticationConfiguration)`
  - L101 `public DaoAuthenticationProvider authenticationProvider()`
  - L108 `public CsrfTokenRepository csrfTokenRepository()`
  - L114 `private PathPatternRequestMatcher matcher(String pattern)`
  - L119 `public JwtDecoder jwtDecoder(DataSource dataSource)`
  - L136 `public BearerTokenResolver bearerTokenResolver()`
  - L155 `public FilterRegistrationBean<JwtUserContextFilter> jwtUserContextFilterRegistration(JwtUserContextFilter filter)`
  - L162 `protected SecurityFilterChain filterChain(HttpSecurity http)`
- Main fields:
  - L72 `String JASPERREPORT_MATCHER`
  - L74 `BaseUserDetailsService baseUserDetailsService`
  - L76 `JwtAuthEntryPoint unauthorizedHandler`
  - L78 `PasswordEncoder passwordEncoder`
  - L80 `CustomAccessDeniedHandler accessDeniedHandler`
  - L82 `JwtUserContextFilter jwtUserContextFilter`
- Full path: `C:\home\qifu4\backend\app\src\main\java\org\qifu\core\config\WebSecurityConfig.java`
- Size: 9548 bytes

#### Source

````java
/* 
 * Copyright 2019-2023 qifu of copyright Chen Xin Nien
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
package org.qifu.core.config;

import java.nio.charset.StandardCharsets;

import javax.crypto.spec.SecretKeySpec;
import javax.sql.DataSource;

import org.qifu.base.Constants;
import org.qifu.base.CoreAppConstants;
import org.qifu.base.service.impl.BaseUserDetailsService;
import org.qifu.base.support.TokenStoreValidateBuilder;
import org.qifu.core.util.CookieUtils;
import org.qifu.core.filter.CsrfCookieFilter;
import org.qifu.core.filter.JwtUserContextFilter;
import org.qifu.core.handler.CustomAccessDeniedHandler;
import org.qifu.core.handler.SpaCsrfTokenRequestHandler;
import org.qifu.core.support.JwtAuthEntryPoint;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.core.DelegatingOAuth2TokenValidator;
import org.springframework.security.oauth2.core.OAuth2Error;
import org.springframework.security.oauth2.core.OAuth2TokenValidator;
import org.springframework.security.oauth2.core.OAuth2TokenValidatorResult;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.JwtTimestampValidator;
import org.springframework.security.oauth2.jwt.JwtValidators;
import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;
import org.springframework.security.oauth2.server.resource.web.BearerTokenResolver;
import org.springframework.security.oauth2.server.resource.web.DefaultBearerTokenResolver;
import org.springframework.security.oauth2.server.resource.web.authentication.BearerTokenAuthenticationFilter;
import org.springframework.security.web.csrf.CsrfTokenRepository;
import org.springframework.security.web.servlet.util.matcher.PathPatternRequestMatcher;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
import org.springframework.security.web.csrf.CsrfFilter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {
	
	private static final String JASPERREPORT_MATCHER = "/commonOpenJasperReport";
	
    private final BaseUserDetailsService baseUserDetailsService;
    
    private final JwtAuthEntryPoint unauthorizedHandler;    
    
    private final PasswordEncoder passwordEncoder;    
    
    private final CustomAccessDeniedHandler accessDeniedHandler;

    private final JwtUserContextFilter jwtUserContextFilter;
    
    public WebSecurityConfig(BaseUserDetailsService baseUserDetailsService, 
    		JwtAuthEntryPoint unauthorizedHandler, PasswordEncoder passwordEncoder,
    		CustomAccessDeniedHandler accessDeniedHandler, JwtUserContextFilter jwtUserContextFilter) {
		super();
		this.baseUserDetailsService = baseUserDetailsService;
		this.unauthorizedHandler = unauthorizedHandler;
		this.passwordEncoder = passwordEncoder;
		this.accessDeniedHandler = accessDeniedHandler;
		this.jwtUserContextFilter = jwtUserContextFilter;
	}

	@Bean
    public AuthenticationManager authenticationManagerBean(AuthenticationConfiguration authenticationConfiguration) throws Exception {
    	return authenticationConfiguration.getAuthenticationManager();
    }    
    
    @Bean
    public DaoAuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider(this.baseUserDetailsService);        
        authProvider.setPasswordEncoder(this.passwordEncoder);        
        return authProvider;
    }    
    
    @Bean
    public CsrfTokenRepository csrfTokenRepository() {
    	CookieCsrfTokenRepository repository = CookieCsrfTokenRepository.withHttpOnlyFalse();
    	repository.setCookiePath(Constants.FORWARD_SLASH);
    	return repository;
    }
    
    private PathPatternRequestMatcher matcher(String pattern) {
        return PathPatternRequestMatcher.withDefaults().matcher(pattern);
    }    

    @Bean
    public JwtDecoder jwtDecoder(DataSource dataSource) {
    	SecretKeySpec secretKey = new SecretKeySpec(Constants.TOKEN_SECRET.getBytes(StandardCharsets.UTF_8), "HmacSHA256");
    	NimbusJwtDecoder jwtDecoder = NimbusJwtDecoder.withSecretKey(secretKey).build();
    	OAuth2TokenValidator<Jwt> tokenStoreValidator = jwt -> 
    			TokenStoreValidateBuilder.build(dataSource).accessValidate(jwt.getTokenValue())
    					? OAuth2TokenValidatorResult.success()
    					: OAuth2TokenValidatorResult.failure(new OAuth2Error("invalid_token", "Access token is not active", null));
    	OAuth2TokenValidator<Jwt> validator = new DelegatingOAuth2TokenValidator<>(
    			new JwtTimestampValidator(),
    			JwtValidators.createDefaultWithIssuer(Constants.TOKEN_ISSUER),
    			tokenStoreValidator
    	);
    	jwtDecoder.setJwtValidator(validator);
    	return jwtDecoder;
    }

    @Bean
    public BearerTokenResolver bearerTokenResolver() {
    	DefaultBearerTokenResolver headerResolver = new DefaultBearerTokenResolver();
    	return request -> {
    		String servletPath = request.getServletPath();
    		if (servletPath != null && servletPath.startsWith("/api/auth/")) {
    			return null;
    		}
    		String token = headerResolver.resolve(request);
    		if (token != null) {
    			return token;
    		}
    		if (servletPath == null || !servletPath.startsWith(Constants.TOKEN_CHECK_URL_PATH)) {
    			return null;
    		}
    		return CookieUtils.getCookieValue(request, Constants.TOKEN_ACCESS_COOKIE_NAME);
    	};
    }

    @Bean
    public FilterRegistrationBean<JwtUserContextFilter> jwtUserContextFilterRegistration(JwtUserContextFilter filter) {
    	FilterRegistrationBean<JwtUserContextFilter> registration = new FilterRegistrationBean<>(filter);
    	registration.setEnabled(false);
    	return registration;
    }
    
    @Bean
    protected SecurityFilterChain filterChain(HttpSecurity http) throws Exception {   
    	http.cors(Customizer.withDefaults())
    		.csrf(csrf -> csrf
    			.csrfTokenRepository(csrfTokenRepository())
    			.csrfTokenRequestHandler(new SpaCsrfTokenRequestHandler())
    			.ignoringRequestMatchers(
    					matcher(Constants.FORWARD_SLASH),
    					matcher(CoreAppConstants.SYS_PAGE_LOGIN),
    					matcher(CoreAppConstants.SYS_PAGE_TAB_LOGIN_AGAIN),
    					matcher(CoreAppConstants.SYS_PAGE_NO_AUTH),
    					matcher(JASPERREPORT_MATCHER),
    					matcher(CoreAppConstants.API_AUTH_SIGNIN),
    					matcher(CoreAppConstants.API_AUTH_LOGOUT),
    					matcher(CoreAppConstants.API_AUTH_VALID_LOGINED),
    					matcher(CoreAppConstants.WEBSERVICE_PATH)
    			) // 需排除 refreshNewToken , 因 refreshNewToken 需要 CSRF 處理
    		)
    		// Force our aggressive filter to run before standard CsrfFilter
    		.addFilterBefore(new CsrfCookieFilter(csrfTokenRepository()), CsrfFilter.class)
    		.sessionManagement( sessMgr -> sessMgr.sessionCreationPolicy(SessionCreationPolicy.STATELESS) )
    		.authorizeHttpRequests(auth -> {
    			auth.requestMatchers(
    					matcher(CoreAppConstants.API_AUTH_SIGNIN),
    					matcher(CoreAppConstants.API_AUTH_LOGOUT),
    					matcher(CoreAppConstants.API_AUTH_VALID_LOGINED),
    					matcher(CoreAppConstants.API_AUTH_REFRESH_TOKEN)).permitAll();
    			for (String par : CoreAppConstants.getWebConfiginterceptorExcludePathPatterns()) {
    				auth.requestMatchers(matcher(par)).permitAll();
    			}
    			auth.anyRequest().authenticated();
    		});
    	http.oauth2ResourceServer(oauth2 -> oauth2
    			.bearerTokenResolver(bearerTokenResolver())
    			.jwt(Customizer.withDefaults())
    			.authenticationEntryPoint(this.unauthorizedHandler)
    	);
    	http.addFilterAfter(this.jwtUserContextFilter, BearerTokenAuthenticationFilter.class);
		http.exceptionHandling(exeConfig -> exeConfig
				.authenticationEntryPoint(this.unauthorizedHandler)
				.accessDeniedHandler(this.accessDeniedHandler)
		);
    	return http.build();
    }
    
}
````

### `backend/app/src/main/java/org/qifu/core/filter/CsrfCookieFilter.java`

- Purpose: Java class; declares class CsrfCookieFilter; has 1 detected methods; depends on 2 org.qifu local types
- Package: `org.qifu.core.filter`
- Role: Java class
- Main types: `class CsrfCookieFilter extends OncePerRequestFilter`
- Key annotations: `Override`
- Local dependencies: `org.qifu.base.Constants`, `org.qifu.base.CoreAppConstants`
- Spring dependencies: `org.springframework.security.web.csrf.CsrfToken`, `org.springframework.security.web.csrf.CsrfTokenRepository`, `org.springframework.web.filter.OncePerRequestFilter`
- Main methods:
  - L28 `protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)`
- Main fields:
  - L21 `CsrfTokenRepository tokenRepository`
- Full path: `C:\home\qifu4\backend\app\src\main\java\org\qifu\core\filter\CsrfCookieFilter.java`
- Size: 1974 bytes

#### Source

````java
package org.qifu.core.filter;

import java.io.IOException;

import org.qifu.base.Constants;
import org.qifu.base.CoreAppConstants;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.security.web.csrf.CsrfTokenRepository;
import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Super aggressive filter to ensure CSRF token is available via Cookie AND Header.
 */
public class CsrfCookieFilter extends OncePerRequestFilter {
	private final CsrfTokenRepository tokenRepository;

	public CsrfCookieFilter(CsrfTokenRepository tokenRepository) {
		this.tokenRepository = tokenRepository;
	}

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		
		CsrfToken csrfToken = tokenRepository.loadToken(request);
		if (csrfToken == null) {
			csrfToken = tokenRepository.generateToken(request);
			tokenRepository.saveToken(csrfToken, request, response);
		}
		
		if (csrfToken != null) {
			String token = csrfToken.getToken();
			// 1. Force write to Request Attribute
			request.setAttribute(CsrfToken.class.getName(), csrfToken);
			
			// 2. Force write to Response Header (as backup for frontend)
			response.setHeader(CoreAppConstants.X_CSRF_TOKEN_HEADER, token);
			
			// 3. Force write manual Cookie (to be 100% sure about path and domain)
			Cookie cookie = new Cookie(CoreAppConstants.X_CSRF_TOKEN_HEADER, token);
			cookie.setPath(Constants.FORWARD_SLASH);
			cookie.setHttpOnly(false); // MUST be false for JS to read
			cookie.setSecure(request.isSecure());
			response.addCookie(cookie);
		}

		filterChain.doFilter(request, response);
	}

}
````

### `backend/app/src/main/java/org/qifu/core/filter/JwtUserContextFilter.java`

- Purpose: Spring component; declares class JwtUserContextFilter; has 3 detected methods; depends on 8 org.qifu local types
- Package: `org.qifu.core.filter`
- Role: Spring component
- Main types: `class JwtUserContextFilter extends OncePerRequestFilter`
- Key annotations: `Component`, `Override`
- Local dependencies: `org.qifu.base.Constants`, `org.qifu.base.exception.ServiceException`, `org.qifu.base.model.RolePermissionAttr`, `org.qifu.core.entity.TbRolePermission`, `org.qifu.core.entity.TbUserRole`, `org.qifu.core.service.IRolePermissionService`, `org.qifu.core.service.IUserRoleService`, `org.qifu.core.util.UserUtils`
- Spring dependencies: `org.springframework.security.core.Authentication`, `org.springframework.security.core.context.SecurityContextHolder`, `org.springframework.security.oauth2.jwt.Jwt`, `org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken`, `org.springframework.stereotype.Component`, `org.springframework.web.filter.OncePerRequestFilter`
- Third-party dependencies: `org.apache.commons.lang3.StringUtils`, `org.slf4j.Logger`, `org.slf4j.LoggerFactory`, `org.slf4j.MDC`
- Main methods:
  - L49 `protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)`
  - L60 `private void buildUserContext()`
  - L79 `private void fillUserRoleData(String userId, List<String> roleIds, Map<String, List<RolePermissionAttr>> rolePermissionMap)`
- Main fields:
  - L35 `Logger logger`
  - L36 `String USERID_KEY_NAME`
  - L38 `IUserRoleService<TbUserRole, String> userRoleService`
  - L40 `IRolePermissionService<TbRolePermission, String> rolePermissionService`
- Full path: `C:\home\qifu4\backend\app\src\main\java\org\qifu\core\filter\JwtUserContextFilter.java`
- Size: 4385 bytes

#### Source

````java
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
````

### `backend/app/src/main/java/org/qifu/core/handler/CustomAccessDeniedHandler.java`

- Purpose: Spring component; declares class CustomAccessDeniedHandler
- Package: `org.qifu.core.handler`
- Role: Spring component
- Main types: `class CustomAccessDeniedHandler implements AccessDeniedHandler`
- Key annotations: `Component`, `Autowired`, `Override`
- Spring dependencies: `org.springframework.beans.factory.annotation.Autowired`, `org.springframework.http.MediaType`, `org.springframework.security.access.AccessDeniedException`, `org.springframework.security.web.access.AccessDeniedHandler`, `org.springframework.security.web.csrf.CsrfException`, `org.springframework.stereotype.Component`
- Third-party dependencies: `org.slf4j.Logger`, `org.slf4j.LoggerFactory`, `tools.jackson.databind.ObjectMapper`
- Injection/config points:
  - L26 `@Autowired` -> `private ObjectMapper objectMapper;`
- Main fields:
  - L24 `Logger logger`
  - L27 `ObjectMapper objectMapper`
- Full path: `C:\home\qifu4\backend\app\src\main\java\org\qifu\core\handler\CustomAccessDeniedHandler.java`
- Size: 2025 bytes

#### Source

````java
package org.qifu.core.handler;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.security.web.csrf.CsrfException;
import org.springframework.stereotype.Component;

import tools.jackson.databind.ObjectMapper;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class CustomAccessDeniedHandler implements AccessDeniedHandler {
	protected static Logger logger = LoggerFactory.getLogger(CustomAccessDeniedHandler.class);
	
	@Autowired
	private ObjectMapper objectMapper;

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response,
			AccessDeniedException accessDeniedException) throws IOException, ServletException {
		
		if (accessDeniedException instanceof CsrfException) {
			logger.error("CSRF Token validation failed for path: {} , error: {}", request.getServletPath(), accessDeniedException.getMessage());
		} else {
			logger.error("Access Denied for path: {} , error: {}", request.getServletPath(), accessDeniedException.getMessage());
		}

	    response.setContentType(MediaType.APPLICATION_JSON_VALUE);
	    response.setStatus(HttpServletResponse.SC_FORBIDDEN);
	    
	    Map<String, Object> body = new HashMap<>();
	    body.put("status", HttpServletResponse.SC_FORBIDDEN);
	    body.put("error", "Forbidden");
	    body.put("message", accessDeniedException.getMessage());
	    body.put("csrf_error", accessDeniedException instanceof CsrfException);
	    body.put("path", request.getServletPath());
	    
	    objectMapper.writeValue(response.getOutputStream(), body);
	}
	
}
````

### `backend/app/src/main/java/org/qifu/core/handler/SpaCsrfTokenRequestHandler.java`

- Purpose: Java class; declares class SpaCsrfTokenRequestHandler; has 1 detected methods
- Package: `org.qifu.core.handler`
- Role: Java class
- Main types: `class SpaCsrfTokenRequestHandler extends CsrfTokenRequestAttributeHandler`
- Key annotations: `Override`
- Spring dependencies: `org.springframework.security.web.csrf.CsrfToken`, `org.springframework.security.web.csrf.CsrfTokenRequestAttributeHandler`
- Main methods:
  - L17 `public void handle(HttpServletRequest request, HttpServletResponse response, Supplier<CsrfToken> csrfToken)`
- Full path: `C:\home\qifu4\backend\app\src\main\java\org\qifu\core\handler\SpaCsrfTokenRequestHandler.java`
- Size: 777 bytes

#### Source

````java
package org.qifu.core.handler;

import java.util.function.Supplier;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.security.web.csrf.CsrfTokenRequestAttributeHandler;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Simplified Request Handler to avoid deferred loading issues in SPA.
 */
public class SpaCsrfTokenRequestHandler extends CsrfTokenRequestAttributeHandler {

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response, Supplier<CsrfToken> csrfToken) {
		// Force immediate resolution of the token
		request.setAttribute(CsrfToken.class.getName(), csrfToken.get());
		super.handle(request, response, csrfToken);
	}
	
}
````

### `backend/app/src/main/java/org/qifu/core/support/AuthComponents.java`

- Purpose: Spring component; declares class AuthComponents; has 7 detected methods; depends on 8 org.qifu local types
- Package: `org.qifu.core.support`
- Role: Spring component
- Main types: `class AuthComponents`
- Key annotations: `Component`
- Local dependencies: `org.qifu.core.entity.TbAccount`, `org.qifu.core.entity.TbRolePermission`, `org.qifu.core.entity.TbSysLoginLog`, `org.qifu.core.entity.TbUserRole`, `org.qifu.core.service.IAccountService`, `org.qifu.core.service.IRolePermissionService`, `org.qifu.core.service.ISysLoginLogService`, `org.qifu.core.service.IUserRoleService`
- Spring dependencies: `org.springframework.security.authentication.AuthenticationManager`, `org.springframework.stereotype.Component`
- Main methods:
  - L47 `public AuthenticationManager getAuthenticationManager()`
  - L51 `public JwtAuthLoginedUserRoleService getJwtAuthLoginedUserRoleService()`
  - L55 `public IUserRoleService<TbUserRole, String> getUserRoleService()`
  - L59 `public IRolePermissionService<TbRolePermission, String> getRolePermissionService()`
  - L63 `public IAccountService<TbAccount, String> getAccountService()`
  - L67 `public ISysLoginLogService<TbSysLoginLog, String> getSysLoginLogService()`
  - L71 `public Date getWithinTheLast5Minutes()`
- Main fields:
  - L18 `int MAX_FAIL_COUNT`
  - L20 `AuthenticationManager authenticationManager`
  - L22 `JwtAuthLoginedUserRoleService jwtAuthLoginedUserRoleService`
  - L24 `IUserRoleService<TbUserRole, String> userRoleService`
  - L26 `IRolePermissionService<TbRolePermission, String> rolePermissionService`
  - L28 `IAccountService<TbAccount, String> accountService`
  - L30 `ISysLoginLogService<TbSysLoginLog, String> sysLoginLogService`
- Full path: `C:\home\qifu4\backend\app\src\main\java\org\qifu\core\support\AuthComponents.java`
- Size: 2621 bytes

#### Source

````java
package org.qifu.core.support;

import java.util.Date;

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
	public static final int MAX_FAIL_COUNT = 3; 
	
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
	
	public Date getWithinTheLast5Minutes() {
		return new Date(System.currentTimeMillis() - (5 * 60 * 1000));
	}
	
}
````

### `backend/app/src/main/java/org/qifu/core/vo/LoginRequest.java`

- Purpose: DTO/VO/model; declares class LoginRequest; has 8 detected methods
- Package: `org.qifu.core.vo`
- Role: DTO/VO/model
- Main types: `class LoginRequest implements java.io.Serializable`
- Main methods:
  - L11 `public String getUsername()`
  - L15 `public void setUsername(String username)`
  - L19 `public String getPassword()`
  - L23 `public void setPassword(String password)`
  - L27 `public String getRefreshToken()`
  - L31 `public void setRefreshToken(String refreshToken)`
  - L35 `public String getAccessToken()`
  - L39 `public void setAccessToken(String accessToken)`
- Main fields:
  - L4 `long serialVersionUID`
  - L6 `String username`
  - L7 `String password`
  - L8 `String refreshToken`
  - L9 `String accessToken`
- Full path: `C:\home\qifu4\backend\app\src\main\java\org\qifu\core\vo\LoginRequest.java`
- Size: 883 bytes

#### Source

````java
package org.qifu.core.vo;

public class LoginRequest implements java.io.Serializable {
	private static final long serialVersionUID = -1619501251369763324L;
	
	private String username;
	private String password;
	private String refreshToken;	
	private String accessToken;
	
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

	public String getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	
}
````

### `backend/app/src/main/java/org/qifu/core/vo/TestModel.java`

- Purpose: DTO/VO/model; declares class TestModel; has 4 detected methods
- Package: `org.qifu.core.vo`
- Role: DTO/VO/model
- Main types: `class TestModel implements java.io.Serializable`
- Key annotations: `Schema`
- Third-party dependencies: `io.swagger.v3.oas.annotations.media.Schema`
- Main methods:
  - L18 `public String getKey()`
  - L21 `public void setKey(String key)`
  - L24 `public String getMsg()`
  - L27 `public void setMsg(String msg)`
- Main fields:
  - L10 `long serialVersionUID`
  - L13 `String key`
  - L16 `String msg`
- Full path: `C:\home\qifu4\backend\app\src\main\java\org\qifu\core\vo\TestModel.java`
- Size: 658 bytes

#### Source

````java
/**
 * test
 */
package org.qifu.core.vo;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "TestModel", description = "測試模組")
public class TestModel implements java.io.Serializable {
	private static final long serialVersionUID = -5289888544046385634L;
	
	@Schema(name = "key", description = "編號")
	private String key;
	
	@Schema(name = "msg", description = "訊息資料")
	private String msg;
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
````

### `backend/app/src/main/java/org/qifu/core/webservice/impl/TestServiceImpl.java`

- Purpose: Spring component, SOAP/WebService; declares class TestServiceImpl; has 2 detected methods; depends on 2 org.qifu local types
- Package: `org.qifu.core.webservice.impl`
- Role: Spring component, SOAP/WebService
- Main types: `class TestServiceImpl implements ITestService`
- Key annotations: `WebService`, `Component`, `Override`, `POST`, `Path`, `Consumes`, `Produces`
- Local dependencies: `org.qifu.core.webservice.ITestService`, `org.qifu.util.LoadResources`
- Spring dependencies: `org.springframework.stereotype.Component`
- Third-party dependencies: `org.slf4j.Logger`, `org.slf4j.LoggerFactory`
- Main methods:
  - L24 `public String play(String message)`
  - L38 `public String createItemRest(String requestContent)`
- Main fields:
  - L21 `Logger log`
- Full path: `C:\home\qifu4\backend\app\src\main\java\org\qifu\core\webservice\impl\TestServiceImpl.java`
- Size: 1437 bytes

#### Source

````java
package org.qifu.core.webservice.impl;

import java.util.Map;

import org.qifu.core.webservice.ITestService;
import org.qifu.util.LoadResources;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import jakarta.jws.WebService;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@WebService(serviceName = "testService", targetNamespace = "http://test.webservice.core.qifu.org", endpointInterface = "org.qifu.core.webservice.ITestService")
@Component(value = "testService")
public class TestServiceImpl implements ITestService {
	protected static Logger log = LoggerFactory.getLogger(TestServiceImpl.class);

	@Override
	public String play(String message) {
		return "test:" + message;
	}

	/**
	 * test jaxrs http://localhost:8088/services/rest/testService/play
	 * 
	 * @param request
	 * @return
	 */
	@POST
	@Path("/play")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String createItemRest(String requestContent) {
		String jsonStr = "{ \"processCode\" : \"400\", \"processMessage\":\"錯誤\" }";
		try {
			jsonStr = LoadResources.getObjectMapper().writeValueAsString(Map.of("value", "TEST!"));
		} catch (Exception e) {
			log.info("Exception Happened ! ", e);
		}
		return jsonStr;
	}
	
}
````

### `backend/app/src/main/java/org/qifu/core/webservice/ITestService.java`

- Purpose: SOAP/WebService; declares interface ITestService
- Package: `org.qifu.core.webservice`
- Role: SOAP/WebService
- Main types: `interface ITestService`
- Key annotations: `WebService`, `WebMethod`
- Full path: `C:\home\qifu4\backend\app\src\main\java\org\qifu\core\webservice\ITestService.java`
- Size: 318 bytes

#### Source

````java
package org.qifu.core.webservice;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService(targetNamespace = "http://test.webservice.core.qifu.org")
public interface ITestService {
	
	@WebMethod
	String play(@WebParam(name = "message") String message);	
	
}
````

### `backend/app/src/main/java/org/qifu/ServletInitializer.java`

- Purpose: Java class; declares class ServletInitializer; has 1 detected methods
- Package: `org.qifu`
- Role: Java class
- Main types: `class ServletInitializer extends SpringBootServletInitializer`
- Key annotations: `Override`
- Spring dependencies: `org.springframework.boot.builder.SpringApplicationBuilder`, `org.springframework.boot.web.servlet.support.SpringBootServletInitializer`
- Main methods:
  - L9 `protected SpringApplicationBuilder configure(SpringApplicationBuilder application)`
- Full path: `C:\home\qifu4\backend\app\src\main\java\org\qifu\ServletInitializer.java`
- Size: 424 bytes

#### Source

````java
package org.qifu;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }
    
}
````

### `backend/app/src/test/java/org/qifu/test/DatabasePasswordJasyptTest.java`

- Purpose: Test; declares class DatabasePasswordJasyptTest, class TestApplication; has 4 detected methods
- Package: `org.qifu.test`
- Role: Test
- Main types: `class DatabasePasswordJasyptTest`; `class TestApplication`
- Key annotations: `SpringBootTest`, `Autowired`, `Test`, `SpringBootConfiguration`, `EnableEncryptableProperties`
- Spring dependencies: `org.springframework.beans.factory.annotation.Autowired`, `org.springframework.boot.SpringBootConfiguration`, `org.springframework.boot.test.context.SpringBootTest`, `org.springframework.core.env.Environment`
- Third-party dependencies: `static org.junit.jupiter.api.Assertions.assertEquals`, `static org.junit.jupiter.api.Assertions.assertNotEquals`, `static org.junit.jupiter.api.Assertions.assertTrue`, `org.jasypt.encryption.pbe.StandardPBEStringEncryptor`, `org.junit.jupiter.api.Test`, `com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties`
- Config keys referenced: `test.datasource.password`
- Injection/config points:
  - L29 `@Autowired` -> `private Environment environment;`
- Main methods:
  - L33 `public void testEncryptAndDecryptDatabasePassword()`
  - L48 `public void testEncryptedValueCanBeRenderedForPropertiesFile()`
  - L59 `public void testJasyptSpringBootStarterDecryptsEnvironmentProperty()`
  - L63 `private StandardPBEStringEncryptor buildEncryptor(String encryptorPassword)`
- Main fields:
  - L27 `String ALGORITHM`
  - L30 `Environment environment`
- Full path: `C:\home\qifu4\backend\app\src\test\java\org\qifu\test\DatabasePasswordJasyptTest.java`
- Size: 2783 bytes

#### Source

````java
package org.qifu.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@SpringBootTest(
        classes = DatabasePasswordJasyptTest.TestApplication.class,
        properties = {
                "jasypt.encryptor.algorithm=PBEWithMD5AndDES",
                "jasypt.encryptor.iv-generator-classname=org.jasypt.iv.NoIvGenerator",
                "jasypt.encryptor.password=qifu4-test-key",
                "test.datasource.password=ENC(Xe4HkSmQX1wt7wAx9CR9zkOippF0uLYK)"
        }
)
public class DatabasePasswordJasyptTest {

    private static final String ALGORITHM = "PBEWithMD5AndDES";

    @Autowired
    private Environment environment;

    @Test
    public void testEncryptAndDecryptDatabasePassword() {
        String rawPassword = "password";
        String encryptorPassword = "qifu4-test-key";

        StandardPBEStringEncryptor encryptor = buildEncryptor(encryptorPassword);
        String cipherText = encryptor.encrypt(rawPassword);
        String encryptedPropertyValue = "ENC(" + cipherText + ")";

        assertNotEquals(rawPassword, cipherText);
        assertTrue(encryptedPropertyValue.startsWith("ENC("));
        assertTrue(encryptedPropertyValue.endsWith(")"));
        assertEquals(rawPassword, encryptor.decrypt(cipherText));
    }

    @Test
    public void testEncryptedValueCanBeRenderedForPropertiesFile() {
        String rawPassword = "password";
        String encryptorPassword = "qifu4-test-key";
        StandardPBEStringEncryptor encryptor = buildEncryptor(encryptorPassword);

        String propertyValue = "ENC(" + encryptor.encrypt(rawPassword) + ")";

        assertTrue(propertyValue.matches("^ENC\\(.+\\)$"));
    }

    @Test
    public void testJasyptSpringBootStarterDecryptsEnvironmentProperty() {
        assertEquals("password", environment.getProperty("test.datasource.password"));
    }

    private StandardPBEStringEncryptor buildEncryptor(String encryptorPassword) {
        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
        encryptor.setAlgorithm(ALGORITHM);
        encryptor.setPassword(encryptorPassword);
        return encryptor;
    }

    @SpringBootConfiguration
    @EnableEncryptableProperties
    static class TestApplication {
    }
}
````

### `backend/app/src/test/java/org/qifu/test/MqttIntegrationTest.java`

- Purpose: Test; declares class MqttIntegrationTest; has 2 detected methods; depends on 1 org.qifu local types
- Package: `org.qifu.test`
- Role: Test
- Main types: `class MqttIntegrationTest`
- Key annotations: `SpringBootTest`, `Autowired`, `Test`, `Override`
- Local dependencies: `org.qifu.base.properties.MqttConfigProperties`
- Spring dependencies: `org.springframework.beans.factory.annotation.Autowired`, `org.springframework.boot.test.context.SpringBootTest`
- Third-party dependencies: `org.eclipse.paho.client.mqttv3.IMqttDeliveryToken`, `org.eclipse.paho.client.mqttv3.MqttCallback`, `org.eclipse.paho.client.mqttv3.MqttClient`, `org.eclipse.paho.client.mqttv3.MqttConnectOptions`, `org.eclipse.paho.client.mqttv3.MqttMessage`, `org.junit.jupiter.api.Test`, `static org.junit.jupiter.api.Assertions.assertTrue`
- Injection/config points:
  - L21 `@Autowired` -> `private MqttConfigProperties mqttConfigProperties;`
- Main methods:
  - L25 `public void testMqttPublishAndSubscribe()`
  - L45 `public void messageArrived(String topic, MqttMessage message)`
- Main fields:
  - L22 `MqttConfigProperties mqttConfigProperties`
- Full path: `C:\home\qifu4\backend\app\src\test\java\org\qifu\test\MqttIntegrationTest.java`
- Size: 2678 bytes

#### Source

````java
package org.qifu.test;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.junit.jupiter.api.Test;
import org.qifu.base.properties.MqttConfigProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(properties = {"mqttbroker.enable=true", "mqttbroker.allowAnonymous=true"})
public class MqttIntegrationTest {

    @Autowired
    private MqttConfigProperties mqttConfigProperties;

    @Test
    public void testMqttPublishAndSubscribe() throws Exception {
        // 使用原有的配置屬性
        String brokerUrl = "tcp://" + mqttConfigProperties.getHost() + ":" + mqttConfigProperties.getPort();
        String topic = "test/topic";
        String messageContent = "Hello MQTT";

        CountDownLatch latch = new CountDownLatch(1);

        // 1. 訂閱者 (Consumer)
        MqttClient subscriber = new MqttClient(brokerUrl, "subscriber_client");
        MqttConnectOptions options = new MqttConnectOptions();
        options.setCleanSession(true);
        // 不設定帳號密碼，因為我們允許匿名
        subscriber.connect(options);

        subscriber.setCallback(new MqttCallback() {
            @Override
            public void connectionLost(Throwable cause) {}

            @Override
            public void messageArrived(String topic, MqttMessage message) {
                // 驗證訊息內容
                if (new String(message.getPayload()).equals(messageContent)) {
                    latch.countDown();
                }
            }

            @Override
            public void deliveryComplete(IMqttDeliveryToken token) {}
        });

        subscriber.subscribe(topic);

        // 2. 發布者 (Producer)
        MqttClient publisher = new MqttClient(brokerUrl, "publisher_client");
        publisher.connect(options);
        MqttMessage message = new MqttMessage(messageContent.getBytes());
        publisher.publish(topic, message);
        publisher.disconnect();
        publisher.close();

        // 等待訊息接收
        assertTrue(latch.await(5, TimeUnit.SECONDS), "訊息應該在 5 秒內被接收");

        subscriber.disconnect();
        subscriber.close();
    }
}
````

## Properties Files Detailed Analysis

### `backend/app/.gradle/8.9/dependencies-accessors/gc.properties`

- Purpose: Java/Spring configuration resource for application, database, logging, runtime, or test settings.
- Key count: 0
- Full path: `C:\home\qifu4\backend\app\.gradle\8.9\dependencies-accessors\gc.properties`
- Size: 0 bytes

````properties
````

### `backend/app/.gradle/8.9/gc.properties`

- Purpose: Java/Spring configuration resource for application, database, logging, runtime, or test settings.
- Key count: 0
- Full path: `C:\home\qifu4\backend\app\.gradle\8.9\gc.properties`
- Size: 0 bytes

````properties
````

### `backend/app/.gradle/buildOutputCleanup/cache.properties`

- Purpose: Java/Spring configuration resource for application, database, logging, runtime, or test settings.
- Key count: 1
- Key prefixes: `gradle`
- Keys: `gradle.version`
- Full path: `C:\home\qifu4\backend\app\.gradle\buildOutputCleanup\cache.properties`
- Size: 51 bytes

````properties
#Fri Apr 24 07:37:33 CST 2026
gradle.version=8.9
````

### `backend/app/.gradle/vcs-1/gc.properties`

- Purpose: Java/Spring configuration resource for application, database, logging, runtime, or test settings.
- Key count: 0
- Full path: `C:\home\qifu4\backend\app\.gradle\vcs-1\gc.properties`
- Size: 0 bytes

````properties
````

### `backend/app/bin/main/appConfig.properties`

- Purpose: Java/Spring configuration resource for application, database, logging, runtime, or test settings.
- Key count: 24
- Key prefixes: `jasperreport`, `spring-mail-session`, `base`, `page`, `ldap`
- Keys: `jasperreport.source`, `jasperreport.owner`, `spring-mail-session.debug`, `base.errorContact`, `base.verMsg`, `base.jsVerBuild`, `base.loginCaptchaCodeEnable`, `base.mainSystem`, `base.system`, `base.uploadDir`, `base.enableControllerAuthCheckLog`, `base.enableServiceAuthChecLog`, `base.enableAlwaysRememberMe`, `page.maxUploadSize`, `ldap.loginEnable`, `ldap.javaNamingReferral`, `ldap.contextUrl`, `ldap.contextBase`, `ldap.contextUserDn`, `ldap.contextPassword`, `ldap.searchFilter`, `ldap.authSearchBase`, `ldap.pooled`, `ldap.ignorePartialResultException`
- Full path: `C:\home\qifu4\backend\app\bin\main\appConfig.properties`
- Size: 992 bytes

````properties
# put jasperreport .jasper file folder, if product server set /var/core-app/jasperreport/
jasperreport.source=/var/core-app/jasperreport
jasperreport.owner=qifu4

spring-mail-session.debug=Y

# info config
base.errorContact=chen.xin.nien@gmail.com
base.verMsg=qifu4 0.1 TEST
base.jsVerBuild=0_4_1_TEST
base.loginCaptchaCodeEnable=N
base.mainSystem=CORE
base.system=CORE
base.uploadDir=/var/core-app/upload
base.enableControllerAuthCheckLog=Y
base.enableServiceAuthChecLog=N
base.enableAlwaysRememberMe=N

# page variable config
page.maxUploadSize=8388608

# login setting
# "Y" login by LDAP / "N" login by DB
ldap.loginEnable=N
# follow , ignore , throw
ldap.javaNamingReferral=follow
ldap.contextUrl=ldap://127.0.0.1:389
ldap.contextBase=dc=example,dc=com
ldap.contextUserDn=cn=admin
ldap.contextPassword=password1234
ldap.searchFilter=uid
# ou=MIS;ou=People ... , blank no effective
ldap.authSearchBase=
ldap.pooled=N
ldap.ignorePartialResultException=N
````

### `backend/app/bin/main/application.properties`

- Purpose: Java/Spring configuration resource for application, database, logging, runtime, or test settings.
- Key count: 42
- Key prefixes: `logging`, `server`, `spring`, `springfox`
- Keys: `logging.config`, `server.port`, `server.undertow.threads.io`, `server.undertow.threads.worker`, `server.undertow.buffer-size`, `server.undertow.direct-buffers`, `server.servlet.encoding.charset`, `server.servlet.encoding.enabled`, `server.servlet.encoding.force`, `server.compression.enabled`, `server.compression.mime-types`, `server.compression.min-response-size`, `spring.servlet.multipart.max-file-size`, `spring.servlet.multipart.max-request-size`, `spring.jpa.open-in-view`, `spring.mail.host`, `spring.mail.username`, `spring.mail.password`, `spring.mail.properties.mail.smtp.auth`, `spring.mail.properties.mail.smtp.starttls.enable`, `spring.mail.properties.mail.smtp.starttls.required`, `spring.mail.properties.mail.smtp.debug`, `spring.freemarker.template-loader-path`, `spring.freemarker.cache`, `spring.freemarker.charset`, `spring.freemarker.check-template-location`, `spring.freemarker.content-type`, `spring.freemarker.expose-request-attributes`, `spring.freemarker.expose-session-attributes`, `spring.freemarker.request-context-attribute`, `spring.freemarker.suffix`, `spring.freemarker.prefer-file-system-access`, `spring.redis.database`, `spring.redis.host`, `spring.redis.port`, `spring.redis.password`, `spring.redis.jedis.pool.max-active`, `spring.redis.jedis.pool.max-wait`, `spring.redis.jedis.pool.max-idle`, `spring.redis.jedis.pool.min-idle`, `spring.redis.timeout`, `springfox.documentation.swagger-ui.enabled`
- Full path: `C:\home\qifu4\backend\app\bin\main\application.properties`
- Size: 2534 bytes

````properties
# spring boot server properties view:
# https://docs.spring.io/spring-boot/docs/current/reference/html/appendix-application-properties.html#server-properties

# log
logging.config=classpath:log4j2.xml

# server service port
server.port=8088

# server / undertow config
server.undertow.threads.io=2
server.undertow.threads.worker=16
server.undertow.buffer-size=1024
server.undertow.direct-buffers=true

# http encoding
server.servlet.encoding.charset=UTF-8
server.servlet.encoding.enabled=true
server.servlet.encoding.force=true

# Enable response compression
server.compression.enabled=true
# The comma-separated list of mime types that should be compressed
server.compression.mime-types=text/html,text/xml,text/plain,text/css,text/javascript,application/javascript,application/json,font/woff2
# Compress the response only if the response size is at least 1KB
server.compression.min-response-size=1024

# multipart
spring.servlet.multipart.max-file-size=10MB
spring.servlet.multipart.max-request-size=10MB

# ehcache config xml file
# current no need
#spring.cache.jcache.config=classpath:ehcache.xml

# settings open-in-view=false, Be aware that this might lead to LazyInitialization Exception
# connection no release, set spring.jpa.open-in-view=false
spring.jpa.open-in-view=false

# mail
spring.mail.host=192.168.1.251
spring.mail.username=root
spring.mail.password=password123
spring.mail.properties.mail.smtp.auth=false
spring.mail.properties.mail.smtp.starttls.enable=false
spring.mail.properties.mail.smtp.starttls.required=false
spring.mail.properties.mail.smtp.debug=true

# freemarker
#spring.freemarker.enabled=true
spring.freemarker.template-loader-path=classpath:/templates/
spring.freemarker.cache=false
spring.freemarker.charset=UTF-8
spring.freemarker.check-template-location=true
spring.freemarker.content-type=text/html
spring.freemarker.expose-request-attributes=true
spring.freemarker.expose-session-attributes=true
spring.freemarker.request-context-attribute=request
spring.freemarker.suffix=.ftl
# for some default ftl file in core-standard project
spring.freemarker.prefer-file-system-access=false

# redis
spring.redis.database=0
spring.redis.host=127.0.0.1
spring.redis.port=6379  
spring.redis.password=
spring.redis.jedis.pool.max-active=8
spring.redis.jedis.pool.max-wait=-1
spring.redis.jedis.pool.max-idle=8
spring.redis.jedis.pool.min-idle=0
spring.redis.timeout=0

# swagger3
springfox.documentation.swagger-ui.enabled=true

````

### `backend/app/bin/main/db1-config.properties`

- Purpose: Java/Spring configuration resource for application, database, logging, runtime, or test settings.
- Key count: 11
- Key prefixes: `db1`
- Keys: `db1.datasource.type`, `db1.datasource.driver-class-name`, `db1.datasource.jdbcUrl`, `db1.datasource.username`, `db1.datasource.password`, `db1.datasource.minimumIdle`, `db1.datasource.maximumPoolSize`, `db1.datasource.idleTimeout`, `db1.datasource.poolName`, `db1.datasource.maxLifetime`, `db1.datasource.connectionTimeout`
- Full path: `C:\home\qifu4\backend\app\bin\main\db1-config.properties`
- Size: 759 bytes

````properties
# database config
db1.datasource.type=com.zaxxer.hikari.HikariDataSource

# MariaDB
db1.datasource.driver-class-name=org.mariadb.jdbc.Driver
db1.datasource.jdbcUrl=jdbc:mariadb://localhost/qifu4?useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull&useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true


# database account/password
db1.datasource.username=root
db1.datasource.password=password

# Hikari will use the above plus the following to setup connection pooling
db1.datasource.minimumIdle=2
# maximumPoolSize Default min 10
db1.datasource.maximumPoolSize=10
db1.datasource.idleTimeout=600000
db1.datasource.poolName=db1HikariCP
db1.datasource.maxLifetime=1800000
db1.datasource.connectionTimeout=30000
````

### `backend/app/src/main/resources/appConfig.properties`

- Purpose: Java/Spring configuration resource for application, database, logging, runtime, or test settings.
- Key count: 34
- Key prefixes: `jasperreport`, `spring-mail-session`, `base`, `page`, `ldap`, `mqttbroker`
- Keys: `jasperreport.source`, `jasperreport.owner`, `spring-mail-session.debug`, `base.errorContact`, `base.verMsg`, `base.jsVerBuild`, `base.loginCaptchaCodeEnable`, `base.mainSystem`, `base.system`, `base.uploadDir`, `base.enableControllerAuthCheckLog`, `base.enableServiceAuthChecLog`, `base.enableAlwaysRememberMe`, `page.maxUploadSize`, `page.allowedOrigin`, `ldap.loginEnable`, `ldap.javaNamingReferral`, `ldap.contextUrl`, `ldap.contextBase`, `ldap.contextUserDn`, `ldap.contextPassword`, `ldap.searchFilter`, `ldap.authSearchBase`, `ldap.pooled`, `ldap.ignorePartialResultException`, `mqttbroker.enable`, `mqttbroker.host`, `mqttbroker.port`, `mqttbroker.enablePersistence`, `mqttbroker.allowAnonymous`, `mqttbroker.telemetryEnabled`, `mqttbroker.storePath`, `mqttbroker.tempPasswordFile`, `mqttbroker.monitoringInterceptorPerTopic`
- Full path: `C:\home\qifu4\backend\app\src\main\resources\appConfig.properties`
- Size: 1446 bytes

````properties
# put jasperreport .jasper file folder, if product server set /var/core-app/jasperreport/
jasperreport.source=/var/core-app/jasperreport
jasperreport.owner=qifu4

spring-mail-session.debug=Y

# info config
base.errorContact=chen.xin.nien@gmail.com
base.verMsg=qifu4 0.1 TEST
base.jsVerBuild=0_4_1_TEST
base.loginCaptchaCodeEnable=N
base.mainSystem=CORE
base.system=CORE
base.uploadDir=/var/core-app/upload
base.enableControllerAuthCheckLog=Y
base.enableServiceAuthChecLog=N
base.enableAlwaysRememberMe=N

# page variable config
page.maxUploadSize=8388608
page.allowedOrigin=https://192.168.10.200,http://localhost,http://localhost:8077

# login setting
# "Y" login by LDAP / "N" login by DB
ldap.loginEnable=N
# follow , ignore , throw
ldap.javaNamingReferral=follow
ldap.contextUrl=ldap://127.0.0.1:389
ldap.contextBase=dc=example,dc=com
ldap.contextUserDn=cn=admin
ldap.contextPassword=password1234
ldap.searchFilter=uid
# ou=MIS;ou=People ... , blank no effective
ldap.authSearchBase=
ldap.pooled=N
ldap.ignorePartialResultException=N

# MQTT config
mqttbroker.enable=false
#mqttbroker.host=0.0.0.0
mqttbroker.host=127.0.0.1
mqttbroker.port=1883
mqttbroker.enablePersistence=true
mqttbroker.allowAnonymous=false
mqttbroker.telemetryEnabled=false
mqttbroker.storePath=/var/mqtt-data/store
mqttbroker.tempPasswordFile=/var/mqtt-data/password.properties
mqttbroker.monitoringInterceptorPerTopic=50
````

### `backend/app/src/main/resources/application.properties`

- Purpose: Java/Spring configuration resource for application, database, logging, runtime, or test settings.
- Key count: 43
- Key prefixes: `logging`, `server`, `spring`, `springfox`, `cxf`, `jasypt`
- Keys: `logging.config`, `server.port`, `server.servlet.encoding.charset`, `server.servlet.encoding.enabled`, `server.servlet.encoding.force`, `server.compression.enabled`, `server.compression.mime-types`, `server.compression.min-response-size`, `spring.servlet.multipart.max-file-size`, `spring.servlet.multipart.max-request-size`, `spring.jpa.open-in-view`, `spring.mail.host`, `spring.mail.username`, `spring.mail.password`, `spring.mail.properties.mail.smtp.auth`, `spring.mail.properties.mail.smtp.starttls.enable`, `spring.mail.properties.mail.smtp.starttls.required`, `spring.mail.properties.mail.smtp.debug`, `spring.freemarker.template-loader-path`, `spring.freemarker.cache`, `spring.freemarker.charset`, `spring.freemarker.check-template-location`, `spring.freemarker.content-type`, `spring.freemarker.expose-request-attributes`, `spring.freemarker.expose-session-attributes`, `spring.freemarker.request-context-attribute`, `spring.freemarker.suffix`, `spring.freemarker.prefer-file-system-access`, `spring.redis.database`, `spring.redis.host`, `spring.redis.port`, `spring.redis.password`, `spring.redis.jedis.pool.max-active`, `spring.redis.jedis.pool.max-wait`, `spring.redis.jedis.pool.max-idle`, `spring.redis.jedis.pool.min-idle`, `spring.redis.timeout`, `springfox.documentation.swagger-ui.enabled`, `cxf.servlet.hide-service-list-page`, `spring.main.allow-circular-references`, `jasypt.encryptor.algorithm`, `jasypt.encryptor.iv-generator-classname`, `jasypt.encryptor.password`
- Full path: `C:\home\qifu4\backend\app\src\main\resources\application.properties`
- Size: 3057 bytes

````properties
# spring boot server properties view:
# https://docs.spring.io/spring-boot/docs/current/reference/html/appendix-application-properties.html#server-properties

# log
logging.config=classpath:log4j2.xml

# server service port
server.port=8088

# server / undertow config
#server.undertow.threads.io=2
#server.undertow.threads.worker=16
#server.undertow.buffer-size=1024
#server.undertow.direct-buffers=true

# http encoding
server.servlet.encoding.charset=UTF-8
server.servlet.encoding.enabled=true
server.servlet.encoding.force=true

# Enable response compression
server.compression.enabled=true
# The comma-separated list of mime types that should be compressed
server.compression.mime-types=text/html,text/xml,text/plain,text/css,text/javascript,application/javascript,application/json,font/woff2
# Compress the response only if the response size is at least 1KB
server.compression.min-response-size=1024

# multipart
spring.servlet.multipart.max-file-size=10MB
spring.servlet.multipart.max-request-size=10MB

# ehcache config xml file
# current no need
#spring.cache.jcache.config=classpath:ehcache.xml

# settings open-in-view=false, Be aware that this might lead to LazyInitialization Exception
# connection no release, set spring.jpa.open-in-view=false
spring.jpa.open-in-view=false

# mail
spring.mail.host=192.168.1.251
spring.mail.username=root
spring.mail.password=password123
spring.mail.properties.mail.smtp.auth=false
spring.mail.properties.mail.smtp.starttls.enable=false
spring.mail.properties.mail.smtp.starttls.required=false
spring.mail.properties.mail.smtp.debug=true

# freemarker
#spring.freemarker.enabled=true
spring.freemarker.template-loader-path=classpath:/templates/
spring.freemarker.cache=false
spring.freemarker.charset=UTF-8
spring.freemarker.check-template-location=true
spring.freemarker.content-type=text/html
spring.freemarker.expose-request-attributes=true
spring.freemarker.expose-session-attributes=true
spring.freemarker.request-context-attribute=request
spring.freemarker.suffix=.ftl
# for some default ftl file in core-standard project
spring.freemarker.prefer-file-system-access=false

# redis
spring.redis.database=0
spring.redis.host=127.0.0.1
spring.redis.port=6379  
spring.redis.password=
spring.redis.jedis.pool.max-active=8
spring.redis.jedis.pool.max-wait=-1
spring.redis.jedis.pool.max-idle=8
spring.redis.jedis.pool.min-idle=0
spring.redis.timeout=0

# swagger3
springfox.documentation.swagger-ui.enabled=true

# CXF Servlet hide-service-list-page (self add custom, not system item)
cxf.servlet.hide-service-list-page=false

# Allow circular references for CXF
spring.main.allow-circular-references=true

# Jasypt encrypted property support.
# Set JASYPT_ENCRYPTOR_PASSWORD in production and regenerate every ENC(...) value with that key.
jasypt.encryptor.algorithm=PBEWithMD5AndDES
jasypt.encryptor.iv-generator-classname=org.jasypt.iv.NoIvGenerator
jasypt.encryptor.password=${JASYPT_ENCRYPTOR_PASSWORD:qifu4-dev-jasypt-key}
````

### `backend/app/src/main/resources/db1-config.properties`

- Purpose: Java/Spring configuration resource for application, database, logging, runtime, or test settings.
- Key count: 13
- Key prefixes: `db1`
- Keys: `db1.datasource.type`, `db1.datasource.driver-class-name`, `db1.datasource.jdbcUrl`, `db1.datasource.username`, `db1.datasource.password`, `db1.datasource.minimumIdle`, `db1.datasource.maximumPoolSize`, `db1.datasource.idleTimeout`, `db1.datasource.poolName`, `db1.datasource.maxLifetime`, `db1.datasource.keepaliveTime`, `db1.datasource.connectionTimeout`, `db1.datasource.validationTimeout`
- Full path: `C:\home\qifu4\backend\app\src\main\resources\db1-config.properties`
- Size: 1407 bytes

````properties
# database config
db1.datasource.type=com.zaxxer.hikari.HikariDataSource

# MariaDB
db1.datasource.driver-class-name=org.mariadb.jdbc.Driver
db1.datasource.jdbcUrl=jdbc:mariadb://192.168.10.1/qifu4?useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull&useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true


# database account/password
db1.datasource.username=root
# The datasource password can be plain text or Jasypt encrypted with ENC(...).
db1.datasource.password=ENC(MyOP1Akcwd7hW6GpqYmiwLM6e98kFTyU)

# Hikari will use the above plus the following to setup connection pooling.
# These values are tuned for environments where firewalls may drop idle DB connections after 15 minutes.
db1.datasource.minimumIdle=2
# maximumPoolSize Default min 10
db1.datasource.maximumPoolSize=10
# Close idle connections after 10 minutes when the pool has more than minimumIdle connections.
db1.datasource.idleTimeout=600000
db1.datasource.poolName=db1HikariCP
# Retire connections after 14 minutes, before a 15-minute firewall idle timeout can drop them.
db1.datasource.maxLifetime=840000
# Keep idle connections alive every 5 minutes to prevent stale pooled connections.
db1.datasource.keepaliveTime=300000
db1.datasource.connectionTimeout=30000
# Fail connection validation quickly instead of waiting too long on a broken network connection.
db1.datasource.validationTimeout=5000
````

### `backend/app/src/test/resources/test_password.properties`

- Purpose: Java/Spring configuration resource for application, database, logging, runtime, or test settings.
- Key count: 1
- Key prefixes: `admin`
- Keys: `admin`
- Full path: `C:\home\qifu4\backend\app\src\test\resources\test_password.properties`
- Size: 72 bytes

````properties
admin:ef92b778bafe771e89245b89ecbc08a44a4e166c06659911881f383d4473e94f
````

### `backend/app/target/classes/appConfig.properties`

- Purpose: Java/Spring configuration resource for application, database, logging, runtime, or test settings.
- Key count: 34
- Key prefixes: `jasperreport`, `spring-mail-session`, `base`, `page`, `ldap`, `mqttbroker`
- Keys: `jasperreport.source`, `jasperreport.owner`, `spring-mail-session.debug`, `base.errorContact`, `base.verMsg`, `base.jsVerBuild`, `base.loginCaptchaCodeEnable`, `base.mainSystem`, `base.system`, `base.uploadDir`, `base.enableControllerAuthCheckLog`, `base.enableServiceAuthChecLog`, `base.enableAlwaysRememberMe`, `page.maxUploadSize`, `page.allowedOrigin`, `ldap.loginEnable`, `ldap.javaNamingReferral`, `ldap.contextUrl`, `ldap.contextBase`, `ldap.contextUserDn`, `ldap.contextPassword`, `ldap.searchFilter`, `ldap.authSearchBase`, `ldap.pooled`, `ldap.ignorePartialResultException`, `mqttbroker.enable`, `mqttbroker.host`, `mqttbroker.port`, `mqttbroker.enablePersistence`, `mqttbroker.allowAnonymous`, `mqttbroker.telemetryEnabled`, `mqttbroker.storePath`, `mqttbroker.tempPasswordFile`, `mqttbroker.monitoringInterceptorPerTopic`
- Full path: `C:\home\qifu4\backend\app\target\classes\appConfig.properties`
- Size: 1446 bytes

````properties
# put jasperreport .jasper file folder, if product server set /var/core-app/jasperreport/
jasperreport.source=/var/core-app/jasperreport
jasperreport.owner=qifu4

spring-mail-session.debug=Y

# info config
base.errorContact=chen.xin.nien@gmail.com
base.verMsg=qifu4 0.1 TEST
base.jsVerBuild=0_4_1_TEST
base.loginCaptchaCodeEnable=N
base.mainSystem=CORE
base.system=CORE
base.uploadDir=/var/core-app/upload
base.enableControllerAuthCheckLog=Y
base.enableServiceAuthChecLog=N
base.enableAlwaysRememberMe=N

# page variable config
page.maxUploadSize=8388608
page.allowedOrigin=https://192.168.10.200,http://localhost,http://localhost:8077

# login setting
# "Y" login by LDAP / "N" login by DB
ldap.loginEnable=N
# follow , ignore , throw
ldap.javaNamingReferral=follow
ldap.contextUrl=ldap://127.0.0.1:389
ldap.contextBase=dc=example,dc=com
ldap.contextUserDn=cn=admin
ldap.contextPassword=password1234
ldap.searchFilter=uid
# ou=MIS;ou=People ... , blank no effective
ldap.authSearchBase=
ldap.pooled=N
ldap.ignorePartialResultException=N

# MQTT config
mqttbroker.enable=false
#mqttbroker.host=0.0.0.0
mqttbroker.host=127.0.0.1
mqttbroker.port=1883
mqttbroker.enablePersistence=true
mqttbroker.allowAnonymous=false
mqttbroker.telemetryEnabled=false
mqttbroker.storePath=/var/mqtt-data/store
mqttbroker.tempPasswordFile=/var/mqtt-data/password.properties
mqttbroker.monitoringInterceptorPerTopic=50
````

### `backend/app/target/classes/application.properties`

- Purpose: Java/Spring configuration resource for application, database, logging, runtime, or test settings.
- Key count: 43
- Key prefixes: `logging`, `server`, `spring`, `springfox`, `cxf`, `jasypt`
- Keys: `logging.config`, `server.port`, `server.servlet.encoding.charset`, `server.servlet.encoding.enabled`, `server.servlet.encoding.force`, `server.compression.enabled`, `server.compression.mime-types`, `server.compression.min-response-size`, `spring.servlet.multipart.max-file-size`, `spring.servlet.multipart.max-request-size`, `spring.jpa.open-in-view`, `spring.mail.host`, `spring.mail.username`, `spring.mail.password`, `spring.mail.properties.mail.smtp.auth`, `spring.mail.properties.mail.smtp.starttls.enable`, `spring.mail.properties.mail.smtp.starttls.required`, `spring.mail.properties.mail.smtp.debug`, `spring.freemarker.template-loader-path`, `spring.freemarker.cache`, `spring.freemarker.charset`, `spring.freemarker.check-template-location`, `spring.freemarker.content-type`, `spring.freemarker.expose-request-attributes`, `spring.freemarker.expose-session-attributes`, `spring.freemarker.request-context-attribute`, `spring.freemarker.suffix`, `spring.freemarker.prefer-file-system-access`, `spring.redis.database`, `spring.redis.host`, `spring.redis.port`, `spring.redis.password`, `spring.redis.jedis.pool.max-active`, `spring.redis.jedis.pool.max-wait`, `spring.redis.jedis.pool.max-idle`, `spring.redis.jedis.pool.min-idle`, `spring.redis.timeout`, `springfox.documentation.swagger-ui.enabled`, `cxf.servlet.hide-service-list-page`, `spring.main.allow-circular-references`, `jasypt.encryptor.algorithm`, `jasypt.encryptor.iv-generator-classname`, `jasypt.encryptor.password`
- Full path: `C:\home\qifu4\backend\app\target\classes\application.properties`
- Size: 3057 bytes

````properties
# spring boot server properties view:
# https://docs.spring.io/spring-boot/docs/current/reference/html/appendix-application-properties.html#server-properties

# log
logging.config=classpath:log4j2.xml

# server service port
server.port=8088

# server / undertow config
#server.undertow.threads.io=2
#server.undertow.threads.worker=16
#server.undertow.buffer-size=1024
#server.undertow.direct-buffers=true

# http encoding
server.servlet.encoding.charset=UTF-8
server.servlet.encoding.enabled=true
server.servlet.encoding.force=true

# Enable response compression
server.compression.enabled=true
# The comma-separated list of mime types that should be compressed
server.compression.mime-types=text/html,text/xml,text/plain,text/css,text/javascript,application/javascript,application/json,font/woff2
# Compress the response only if the response size is at least 1KB
server.compression.min-response-size=1024

# multipart
spring.servlet.multipart.max-file-size=10MB
spring.servlet.multipart.max-request-size=10MB

# ehcache config xml file
# current no need
#spring.cache.jcache.config=classpath:ehcache.xml

# settings open-in-view=false, Be aware that this might lead to LazyInitialization Exception
# connection no release, set spring.jpa.open-in-view=false
spring.jpa.open-in-view=false

# mail
spring.mail.host=192.168.1.251
spring.mail.username=root
spring.mail.password=password123
spring.mail.properties.mail.smtp.auth=false
spring.mail.properties.mail.smtp.starttls.enable=false
spring.mail.properties.mail.smtp.starttls.required=false
spring.mail.properties.mail.smtp.debug=true

# freemarker
#spring.freemarker.enabled=true
spring.freemarker.template-loader-path=classpath:/templates/
spring.freemarker.cache=false
spring.freemarker.charset=UTF-8
spring.freemarker.check-template-location=true
spring.freemarker.content-type=text/html
spring.freemarker.expose-request-attributes=true
spring.freemarker.expose-session-attributes=true
spring.freemarker.request-context-attribute=request
spring.freemarker.suffix=.ftl
# for some default ftl file in core-standard project
spring.freemarker.prefer-file-system-access=false

# redis
spring.redis.database=0
spring.redis.host=127.0.0.1
spring.redis.port=6379  
spring.redis.password=
spring.redis.jedis.pool.max-active=8
spring.redis.jedis.pool.max-wait=-1
spring.redis.jedis.pool.max-idle=8
spring.redis.jedis.pool.min-idle=0
spring.redis.timeout=0

# swagger3
springfox.documentation.swagger-ui.enabled=true

# CXF Servlet hide-service-list-page (self add custom, not system item)
cxf.servlet.hide-service-list-page=false

# Allow circular references for CXF
spring.main.allow-circular-references=true

# Jasypt encrypted property support.
# Set JASYPT_ENCRYPTOR_PASSWORD in production and regenerate every ENC(...) value with that key.
jasypt.encryptor.algorithm=PBEWithMD5AndDES
jasypt.encryptor.iv-generator-classname=org.jasypt.iv.NoIvGenerator
jasypt.encryptor.password=${JASYPT_ENCRYPTOR_PASSWORD:qifu4-dev-jasypt-key}
````

### `backend/app/target/classes/db1-config.properties`

- Purpose: Java/Spring configuration resource for application, database, logging, runtime, or test settings.
- Key count: 13
- Key prefixes: `db1`
- Keys: `db1.datasource.type`, `db1.datasource.driver-class-name`, `db1.datasource.jdbcUrl`, `db1.datasource.username`, `db1.datasource.password`, `db1.datasource.minimumIdle`, `db1.datasource.maximumPoolSize`, `db1.datasource.idleTimeout`, `db1.datasource.poolName`, `db1.datasource.maxLifetime`, `db1.datasource.keepaliveTime`, `db1.datasource.connectionTimeout`, `db1.datasource.validationTimeout`
- Full path: `C:\home\qifu4\backend\app\target\classes\db1-config.properties`
- Size: 1407 bytes

````properties
# database config
db1.datasource.type=com.zaxxer.hikari.HikariDataSource

# MariaDB
db1.datasource.driver-class-name=org.mariadb.jdbc.Driver
db1.datasource.jdbcUrl=jdbc:mariadb://192.168.10.1/qifu4?useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull&useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true


# database account/password
db1.datasource.username=root
# The datasource password can be plain text or Jasypt encrypted with ENC(...).
db1.datasource.password=ENC(MyOP1Akcwd7hW6GpqYmiwLM6e98kFTyU)

# Hikari will use the above plus the following to setup connection pooling.
# These values are tuned for environments where firewalls may drop idle DB connections after 15 minutes.
db1.datasource.minimumIdle=2
# maximumPoolSize Default min 10
db1.datasource.maximumPoolSize=10
# Close idle connections after 10 minutes when the pool has more than minimumIdle connections.
db1.datasource.idleTimeout=600000
db1.datasource.poolName=db1HikariCP
# Retire connections after 14 minutes, before a 15-minute firewall idle timeout can drop them.
db1.datasource.maxLifetime=840000
# Keep idle connections alive every 5 minutes to prevent stale pooled connections.
db1.datasource.keepaliveTime=300000
db1.datasource.connectionTimeout=30000
# Fail connection validation quickly instead of waiting too long on a broken network connection.
db1.datasource.validationTimeout=5000
````

### `backend/app/target/classes/META-INF/maven/org.qifu/core-app/pom.properties`

- Purpose: Java/Spring configuration resource for application, database, logging, runtime, or test settings.
- Key count: 5
- Key prefixes: `artifactId`, `groupId`, `m2e`, `version`
- Keys: `artifactId`, `groupId`, `m2e.projectLocation`, `m2e.projectName`, `version`
- Full path: `C:\home\qifu4\backend\app\target\classes\META-INF\maven\org.qifu\core-app\pom.properties`
- Size: 217 bytes

````properties
#Generated by Maven Integration for Eclipse
#Mon Jun 22 19:53:55 CST 2026
artifactId=core-app
groupId=org.qifu
m2e.projectLocation=C\:\\home\\qifu4\\backend\\app
m2e.projectName=core-app
version=0.0.5-SNAPSHOT
````

### `backend/app/target/maven-archiver/pom.properties`

- Purpose: Java/Spring configuration resource for application, database, logging, runtime, or test settings.
- Key count: 3
- Key prefixes: `artifactId`, `groupId`, `version`
- Keys: `artifactId`, `groupId`, `version`
- Full path: `C:\home\qifu4\backend\app\target\maven-archiver\pom.properties`
- Size: 63 bytes

````properties
artifactId=core-app
groupId=org.qifu
version=0.0.5-SNAPSHOT
````

### `backend/app/target/test-classes/test_password.properties`

- Purpose: Java/Spring configuration resource for application, database, logging, runtime, or test settings.
- Key count: 1
- Key prefixes: `admin`
- Keys: `admin`
- Full path: `C:\home\qifu4\backend\app\target\test-classes\test_password.properties`
- Size: 72 bytes

````properties
admin:ef92b778bafe771e89245b89ecbc08a44a4e166c06659911881f383d4473e94f
````

## JSON Files Detailed Analysis

### `backend/app/bin/main/endpoint-publish.json`

- Purpose: JSON configuration/resource data used by endpoints, publishing, permissions, messages, menu data, or tests.
- JSON root type: `object`
- Item/key count: 1
- Top-level keys: `endpoints`
- Full path: `C:\home\qifu4\backend\app\bin\main\endpoint-publish.json`
- Size: 310 bytes

````json
{
	"endpoints" : [
		{
			"name"		:	"testService",
			"beanId"	:	"testService",
			"publish"	:	"/testService",
			"inInterceptors"	:	[
				"loggingInInterceptor",
				"soapForceDoclitBareInInterceptor"
			],
			"outInterceptors"	:	[
				"loggingOutInterceptor"
			],
			"enable"	:	true
		}
	]
}
````

### `backend/app/bin/main/excludePathPatterns.json`

- Purpose: JSON configuration/resource data used by endpoints, publishing, permissions, messages, menu data, or tests.
- JSON root type: `object`
- Item/key count: 1
- Top-level keys: `excludePathPatterns`
- Full path: `C:\home\qifu4\backend\app\bin\main\excludePathPatterns.json`
- Size: 158 bytes

````json
{
	"excludePathPatterns" : [
		"/favicon.ico",
		"/services**",
		"/services/**",		
		"/api**",
		"/api/**",
		"/commonOpenJasperReport",
		"/"
	]
}
````

### `backend/app/src/main/resources/endpoint-publish.json`

- Purpose: JSON configuration/resource data used by endpoints, publishing, permissions, messages, menu data, or tests.
- JSON root type: `object`
- Item/key count: 2
- Top-level keys: `restAddress`, `endpoints`
- Full path: `C:\home\qifu4\backend\app\src\main\resources\endpoint-publish.json`
- Size: 359 bytes

````json
{
	"restAddress"	:	"/rest",
	"endpoints" : [
		{
			"name"		:	"testService",
			"beanId"	:	"testService",
			"publish"	:	"/testService",
			"hasRest"	:	true,
			"inInterceptors"	:	[
				"loggingInInterceptor",
				"soapForceDoclitBareInInterceptor"
			],
			"outInterceptors"	:	[
				"loggingOutInterceptor"
			],
			"enable"	:	true
		}
	]
}
````

### `backend/app/src/main/resources/excludePathPatterns.json`

- Purpose: JSON configuration/resource data used by endpoints, publishing, permissions, messages, menu data, or tests.
- JSON root type: `object`
- Item/key count: 1
- Top-level keys: `excludePathPatterns`
- Full path: `C:\home\qifu4\backend\app\src\main\resources\excludePathPatterns.json`
- Size: 158 bytes

````json
{
	"excludePathPatterns" : [
		"/favicon.ico",
		"/services**",
		"/services/**",		
		"/api**",
		"/api/**",
		"/commonOpenJasperReport",
		"/"
	]
}
````

### `backend/app/src/main/resources/mqtt-user.json`

- Purpose: JSON configuration/resource data used by endpoints, publishing, permissions, messages, menu data, or tests.
- JSON root type: `object`
- Item/key count: 1
- Top-level keys: `accountList`
- Full path: `C:\home\qifu4\backend\app\src\main\resources\mqtt-user.json`
- Size: 166 bytes

````json
{
	"accountList" : [
		{
			"account" : "admin",
			"password" : "password123"
		}
		,
		{
			"account" : "brokerusr",
			"password" : "P@ssw0rd"
		}
	]
}
````

### `backend/app/target/classes/endpoint-publish.json`

- Purpose: JSON configuration/resource data used by endpoints, publishing, permissions, messages, menu data, or tests.
- JSON root type: `object`
- Item/key count: 2
- Top-level keys: `restAddress`, `endpoints`
- Full path: `C:\home\qifu4\backend\app\target\classes\endpoint-publish.json`
- Size: 359 bytes

````json
{
	"restAddress"	:	"/rest",
	"endpoints" : [
		{
			"name"		:	"testService",
			"beanId"	:	"testService",
			"publish"	:	"/testService",
			"hasRest"	:	true,
			"inInterceptors"	:	[
				"loggingInInterceptor",
				"soapForceDoclitBareInInterceptor"
			],
			"outInterceptors"	:	[
				"loggingOutInterceptor"
			],
			"enable"	:	true
		}
	]
}
````

### `backend/app/target/classes/excludePathPatterns.json`

- Purpose: JSON configuration/resource data used by endpoints, publishing, permissions, messages, menu data, or tests.
- JSON root type: `object`
- Item/key count: 1
- Top-level keys: `excludePathPatterns`
- Full path: `C:\home\qifu4\backend\app\target\classes\excludePathPatterns.json`
- Size: 158 bytes

````json
{
	"excludePathPatterns" : [
		"/favicon.ico",
		"/services**",
		"/services/**",		
		"/api**",
		"/api/**",
		"/commonOpenJasperReport",
		"/"
	]
}
````

### `backend/app/target/classes/mqtt-user.json`

- Purpose: JSON configuration/resource data used by endpoints, publishing, permissions, messages, menu data, or tests.
- JSON root type: `object`
- Item/key count: 1
- Top-level keys: `accountList`
- Full path: `C:\home\qifu4\backend\app\target\classes\mqtt-user.json`
- Size: 166 bytes

````json
{
	"accountList" : [
		{
			"account" : "admin",
			"password" : "password123"
		}
		,
		{
			"account" : "brokerusr",
			"password" : "P@ssw0rd"
		}
	]
}
````

