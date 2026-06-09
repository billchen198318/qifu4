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
