package org.qifu.core.api;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import javax.validation.Valid;

import org.apache.commons.lang3.StringUtils;
import org.qifu.base.Constants;
import org.qifu.base.exception.ServiceException;
import org.qifu.base.model.TokenBuilderVariable;
import org.qifu.base.model.YesNo;
import org.qifu.base.support.TokenStoreBuilder;
import org.qifu.base.util.TokenBuilderUtils;
import org.qifu.core.entity.TbSysCode;
import org.qifu.core.model.User;
import org.qifu.core.service.ISysCodeService;
import org.qifu.core.support.JwtAuthLoginedUserRoleService;
import org.qifu.core.vo.LoginRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class AuthController {
	
	@Autowired
	AuthenticationManager authenticationManager;
	
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	ISysCodeService<TbSysCode, String> sysCodeService;
	
	@Autowired
	JwtAuthLoginedUserRoleService jwtAuthLoginedUserRoleService;
	
	@PostMapping("/signin")
	public ResponseEntity<User> authenticateUser(@Valid @RequestBody LoginRequest loginRequest, HttpServletRequest request, HttpServletResponse response) {
		TokenBuilderVariable tbv = null;
		User user = null;
	    try {
			request.setAttribute(Constants.HTTP_REQUEST_PASSWORD_AuthLogin, loginRequest.getPassword());
		    Authentication authentication = authenticationManager.authenticate(
		    		new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));
		    SecurityContextHolder.getContext().setAuthentication(authentication);
		    user = (User) authentication.getPrincipal();
		    
		    TbSysCode sysCode = new TbSysCode();
		    sysCode.setCode(Constants.SYSCODE_TOKEN_CODE);		    
		    
			sysCode = sysCodeService.selectByUniqueKey(sysCode).getValue();
			if (null != sysCode && Constants.SYSCODE_TOKEN_TYPE.equals(sysCode.getType()) && !StringUtils.isBlank(sysCode.getParam1())) {								
			    tbv = TokenBuilderUtils.createToken(user.getUserId(), Constants.TOKEN_Authorization, sysCode.getParam1(), TokenStoreBuilder.build(this.dataSource));
				user.setAccessToken(tbv.getAccess());
				user.setRefreshToken(tbv.getRefresh());
				user.blankPassword();
				this.jwtAuthLoginedUserRoleService.onAuthenticationSuccess(authentication);
			}
	    } catch (AuthenticationException e) {
	    	e.printStackTrace();
	    	throw e;
		} catch (ServiceException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	    if (null == user) {
	    	user = new User("", "", "", YesNo.NO);
	    }
	    if (null == tbv) {
	    	tbv = new TokenBuilderVariable();
	    	user.blankPassword();
	    	user.setUserId("");
	    }
	    return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE, tbv.getAccess())
	            .body(user);
	}
	
}
