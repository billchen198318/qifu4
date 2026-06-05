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
	private static final String API_AUTH_MATCHER = "/api/auth/**";
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
    					matcher(API_AUTH_MATCHER),
    					matcher(CoreAppConstants.WEBSERVICE_PATH)
    			)
    		)
    		// Force our aggressive filter to run before standard CsrfFilter
    		.addFilterBefore(new CsrfCookieFilter(csrfTokenRepository()), CsrfFilter.class)
    		.sessionManagement( sessMgr -> sessMgr.sessionCreationPolicy(SessionCreationPolicy.STATELESS) )
    		.authorizeHttpRequests(auth -> {
    			auth.requestMatchers(matcher(API_AUTH_MATCHER)).permitAll();
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
