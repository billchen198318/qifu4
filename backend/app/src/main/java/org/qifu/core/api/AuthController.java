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
	    	
	    	Map<String, Object> param = new HashMap<>();
	    	TokenStoreValidate tsv = new TokenStoreValidateBuilder(this.dataSource);
	    	if (TokenBuilderUtils.verifyRefresh(refreshToken, tsv)) {
	    		Map<String,Claim> userMapClaim = null;
	    		if ((userMapClaim = TokenBuilderUtils.verifyToken(accessToken, tsv)) != null) {
	    			String userId = StringUtils.defaultString( userMapClaim.get(Constants.TOKEN_USER_PARAM_NAME).asString() );
	    			List<String> roleIds = new ArrayList<>();
	    			Map<String, List<RolePermissionAttr>> rolePermissionMap = new HashMap<>();
					param.clear();
					if (!StringUtils.isBlank(userId)) {
						param.put("account", userId);
						// Update loginRequest with real tokens for processOfValidCheck
						loginRequest.setAccessToken(accessToken);
						loginRequest.setRefreshToken(refreshToken);
						user = this.processOfValidCheck(param, roleIds, rolePermissionMap, userId, loginRequest);
					}	    			
	    		}
	    	}	    	
	    } catch (AuthenticationException | ServiceException e) {
	    	e.printStackTrace();
	    	throw e;
		}  catch (Exception e) {
			e.printStackTrace();
		}		
	    if (null == user) {
	    	user = new User("", "", YesNoKeyProvide.NO);
	    	user.setAccessToken("");
	    	user.setRefreshToken("");
	    } else {
	    	// Return 'Y' flag to frontend instead of real token
	    	user.setAccessToken("Y");
	    	user.setRefreshToken("Y");
	    }
	    return ResponseEntity.ok().body(user);
	}
	
	private User processOfValidCheck(Map<String, Object> param, List<String> roleIds, 
			Map<String, List<RolePermissionAttr>> rolePermissionMap, String userId,
			LoginRequest loginRequest) throws ServiceException {
		List<TbUserRole> urList = this.authComponents.getUserRoleService().selectListByParams(param).getValue();
		for (int j = 0; urList != null && j < urList.size(); j++) {
			TbUserRole ur = urList.get(j);
			roleIds.add(ur.getRole());
			param.clear();
			param.put("role", ur.getRole());
			List<TbRolePermission> rpList = this.authComponents.getRolePermissionService().selectListByParams(param).getValue();
			rolePermissionMap.put(ur.getRole(), new ArrayList<>());
			List<RolePermissionAttr> permList = rolePermissionMap.get(ur.getRole());
			for (int x = 0; rpList != null && x < rpList.size(); x++) {
				TbRolePermission rp = rpList.get(x);
				if (!PermissionType.VIEW.name().equals(rp.getPermType())) {
					continue;
				}								
				RolePermissionAttr rpa = new RolePermissionAttr();
				rpa.setPermission(rp.getPermission());
				rpa.setType(rp.getPermType());
				permList.add(rpa);
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
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("user", loginRequest.getUsername());
		paramMap.put("failFlag", "Y");
		// Find logs within the last 5 minutes
		paramMap.put("cdateStart", new Date(System.currentTimeMillis() - (5 * 60 * 1000)));
		
		Long failCount = this.authComponents.getSysLoginLogService().count(paramMap);
		if (failCount != null && failCount >= 3) {
			throw new AuthenticationException("Account is locked due to multiple failed login attempts. Please try again later.") {};
		}

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
			if (null != sysCode && Constants.SYSCODE_TOKEN_TYPE.equals(sysCode.getType()) && !StringUtils.isBlank(sysCode.getParam1())) {								
			    tbv = TokenBuilderUtils.createToken(user.getUserId(), Constants.TOKEN_AUTH, sysCode.getParam1(), TokenStoreBuilder.build(this.dataSource));
				user.setAccessToken("Y");
				user.setRefreshToken("Y");
				CookieUtils.setTokenCookie(response, Constants.TOKEN_ACCESS_COOKIE_NAME, tbv.getAccess(), Constants.TOKEN_ACCESS_EXPIRED_INTERVAL);
				CookieUtils.setTokenCookie(response, Constants.TOKEN_REFRESH_COOKIE_NAME, tbv.getRefresh(), Constants.TOKEN_REFRESH_EXPIRED_INTERVAL);
				user.blankPassword();
				this.authComponents.getJwtAuthLoginedUserRoleService().onLoginedSuccess(authentication);
			}
	    } catch (AuthenticationException | ServiceException e) {
	    	// 2. Log failed attempt
	    	TbSysLoginLog log = new TbSysLoginLog();
	    	log.setUser(loginRequest.getUsername());
	    	log.setCdate(new Date());
	    	this.authComponents.getSysLoginLogService().insertLoginFailLog(log);
	    	
	    	e.printStackTrace();
	    	throw e;
		}  catch (Exception e) {
	    	// Log failed attempt
	    	TbSysLoginLog log = new TbSysLoginLog();
	    	log.setUser(loginRequest.getUsername());
	    	log.setCdate(new Date());
	    	this.authComponents.getSysLoginLogService().insertLoginFailLog(log);
	    	
			e.printStackTrace();
		}		
	    if (null == user) {
	    	user = new User("", "", YesNoKeyProvide.NO);
	    	user.setAccessToken("");
	    	user.setRefreshToken("");	    	
	    }
	    if (null == tbv) {
	    	user.blankPassword();
	    	user.setUserId("");
	    }
	    return ResponseEntity.ok().body(user);
	}
	
	@PostMapping("/refreshNewToken")
	public ResponseEntity<LoginRequest> refreshNewToken(@Valid @RequestBody LoginRequest loginRequest, HttpServletRequest request, HttpServletResponse response) {
		TokenBuilderVariable tbv = null;
		TokenStoreValidateBuilder tsv = null;
		LoginRequest res = new LoginRequest();
		boolean refreshNew = false;
	    try {
	    	String refreshToken = loginRequest.getRefreshToken();
	    	if (StringUtils.isBlank(refreshToken) || YesNoKeyProvide.YES.equals(refreshToken)) {
	    		refreshToken = CookieUtils.getCookieValue(request, Constants.TOKEN_REFRESH_COOKIE_NAME);
	    	}
	    	
	    	if (StringUtils.isBlank(refreshToken)) {
	    		throw new ControllerException( BaseSystemMessage.parameterBlank() );
	    	}
	    	tsv = TokenStoreValidateBuilder.build(this.dataSource);
	    	if (tsv.refreshValidate(refreshToken)) {
	    		String userId = loginRequest.getUsername();
	    		if (StringUtils.isBlank(userId)) {
	    			userId = tsv.getUserIdByRefreshToken(refreshToken);
	    		}
	    		if (StringUtils.isBlank(userId)) {
	    			throw new ControllerException( BaseSystemMessage.parameterBlank() );
	    		}
			    TbSysCode sysCode = new TbSysCode();
			    sysCode.setCode(Constants.SYSCODE_TOKEN_CODE);	
			    sysCode = sysCodeService.selectByUniqueKey(sysCode).getValue();
			    if (null != sysCode && Constants.SYSCODE_TOKEN_TYPE.equals(sysCode.getType()) && !StringUtils.isBlank(sysCode.getParam1())) {
			    	tbv = TokenBuilderUtils.createToken(userId, Constants.TOKEN_AUTH, sysCode.getParam1(), TokenStoreBuilder.build(this.dataSource));
			    	res.setAccessToken("Y");
			    	res.setRefreshToken("Y");
			    	CookieUtils.setTokenCookie(response, Constants.TOKEN_ACCESS_COOKIE_NAME, tbv.getAccess(), Constants.TOKEN_ACCESS_EXPIRED_INTERVAL);
			    	CookieUtils.setTokenCookie(response, Constants.TOKEN_REFRESH_COOKIE_NAME, tbv.getRefresh(), Constants.TOKEN_REFRESH_EXPIRED_INTERVAL);
			    	res.setUsername(userId);
			    	refreshNew = true;
			    }
	    	}
	    } catch (AuthenticationException | ControllerException | ServiceException e) {
	    	e.printStackTrace();
	    	throw e;
		}  catch (Exception e) {
			e.printStackTrace();
		}
	    if (refreshNew) {
	    	return ResponseEntity.ok().body(res);
	    }
	    return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(res);
	}	
	
	@PostMapping("/logout")
	public ResponseEntity<String> logout(HttpServletRequest request, HttpServletResponse response) {
		CookieUtils.setTokenCookie(response, Constants.TOKEN_ACCESS_COOKIE_NAME, "", 0);
		CookieUtils.setTokenCookie(response, Constants.TOKEN_REFRESH_COOKIE_NAME, "", 0);
		return ResponseEntity.ok().body("OK");
	}
	
}
