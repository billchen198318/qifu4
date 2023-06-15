package org.qifu.core.api;

import javax.sql.DataSource;
import javax.validation.Valid;

import org.qifu.base.properties.BaseInfoConfigProperties;
import org.qifu.base.service.impl.BaseUserDetailsService;
import org.qifu.base.util.TokenBuilderUtils;
import org.qifu.core.model.User;
import org.qifu.core.support.BaseAuthenticationSuccessHandler;
import org.qifu.core.vo.LoginRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
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
	
	//@Autowired
	//JwtUtils jwtUtils;	
	
    //@Autowired
    //BaseUserDetailsService baseUserDetailsService;	
	
	@PostMapping("/signin")
	public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {
	    Authentication authentication = authenticationManager.authenticate(
	    		new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));
	    SecurityContextHolder.getContext().setAuthentication(authentication);
	    User user = (User) authentication.getPrincipal();
	    
	    String userAccessToken = TokenBuilderUtils.createToken(user.getUserId(), "user", user.getOid());
		
	    return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE, userAccessToken.toString())
	            .body(user);
	}
	
}
