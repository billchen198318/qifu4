package org.qifu.core.api;

import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;
import javax.validation.Valid;

import org.qifu.base.Constants;
import org.qifu.base.exception.ServiceException;
import org.qifu.base.model.TokenBuilderVariable;
import org.qifu.base.support.TokenStoreBuilder;
import org.qifu.base.util.TokenBuilderUtils;
import org.qifu.core.entity.TbSysCode;
import org.qifu.core.model.User;
import org.qifu.core.service.ISysCodeService;
import org.qifu.core.vo.LoginRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
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
	
	@PostMapping("/signin")
	public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest, HttpServletRequest request) {
		request.setAttribute(Constants.HTTP_REQUEST_PASSWORD_AuthLogin, loginRequest.getPassword());
	    Authentication authentication = authenticationManager.authenticate(
	    		new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));
	    SecurityContextHolder.getContext().setAuthentication(authentication);
	    User user = (User) authentication.getPrincipal();
	    
	    String clientToken = "";
	    TbSysCode sysCode = new TbSysCode();
	    sysCode.setType("TOKEN");
	    sysCode.setCode(String.valueOf(System.currentTimeMillis()));
	    try {
			sysCode = sysCodeService.selectByUniqueKey(sysCode).getValue();
			if (null != sysCode) {
				clientToken = sysCode.getCode();
			}
		} catch (ServiceException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	    
	    TokenBuilderVariable tbv = TokenBuilderUtils.createAccessToken(user.getUserId(), Constants.TOKEN_Authorization, clientToken, TokenStoreBuilder.build(this.dataSource));
		user.setAccessToken(tbv.getAccess());
		user.setRefreshToken(tbv.getRefresh());
		user.blankPassword();
		
	    return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE, tbv.getAccess())
	            .body(user);
	}
	
}
