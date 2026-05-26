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

import org.qifu.base.CoreAppConstants;
import org.qifu.base.service.impl.BaseUserDetailsService;
import org.qifu.core.support.JwtAuthEntryPoint;
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
import org.springframework.security.web.csrf.CsrfTokenRepository;
import org.springframework.security.web.servlet.util.matcher.PathPatternRequestMatcher;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
import org.springframework.security.web.csrf.CsrfFilter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {
	
    private final BaseUserDetailsService baseUserDetailsService;
    
    private final JwtAuthEntryPoint unauthorizedHandler;    
    
    private final PasswordEncoder passwordEncoder;    
    
    private final CustomAccessDeniedHandler accessDeniedHandler;
    
    public WebSecurityConfig(BaseUserDetailsService baseUserDetailsService, 
    		JwtAuthEntryPoint unauthorizedHandler, PasswordEncoder passwordEncoder,
    		CustomAccessDeniedHandler accessDeniedHandler) {
		super();
		this.baseUserDetailsService = baseUserDetailsService;
		this.unauthorizedHandler = unauthorizedHandler;
		this.passwordEncoder = passwordEncoder;
		this.accessDeniedHandler = accessDeniedHandler;
	}

	@Bean
    public AuthenticationManager authenticationManagerBean(AuthenticationConfiguration authenticationConfiguration) throws Exception {
    	return authenticationConfiguration.getAuthenticationManager();
    }    
    
    @Bean
    public DaoAuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider(this.baseUserDetailsService);
        
        //authProvider.setUserDetailsService(this.baseUserDetailsService);
        authProvider.setPasswordEncoder(this.passwordEncoder);
        
        return authProvider;
    }    
    
    @Bean
    public CsrfTokenRepository csrfTokenRepository() {
    	CookieCsrfTokenRepository repository = CookieCsrfTokenRepository.withHttpOnlyFalse();
    	repository.setCookiePath("/");
    	return repository;
    }
    
    private PathPatternRequestMatcher matcher(String pattern) {
        return PathPatternRequestMatcher.withDefaults().matcher(pattern);
    }    
    
    @Bean
    protected SecurityFilterChain filterChain(HttpSecurity http) throws Exception {   
    	http.cors(Customizer.withDefaults())
    		.csrf(csrf -> csrf
    			.csrfTokenRepository(csrfTokenRepository())
    			.csrfTokenRequestHandler(new SpaCsrfTokenRequestHandler())
    			.ignoringRequestMatchers(
    					matcher("/"),
    					matcher("/loginPage"),
    					matcher("/loginAgainPage"),
    					matcher("/noAuthPage"),
    					matcher("/commonOpenJasperReport"),
    					matcher("/api/auth/**")
    			)
    		)
    		// Force our aggressive filter to run before standard CsrfFilter
    		.addFilterBefore(new CsrfCookieFilter(csrfTokenRepository()), CsrfFilter.class)
    		.sessionManagement( sessMgr -> sessMgr.sessionCreationPolicy(SessionCreationPolicy.STATELESS) )
    		.authorizeHttpRequests(auth -> {
    			auth.requestMatchers(matcher("/api/auth/**")).permitAll();
    			for (String par : CoreAppConstants.getWebConfiginterceptorExcludePathPatterns()) {
    				auth.requestMatchers(matcher(par)).permitAll();
    			}
    			auth.anyRequest().authenticated();
    		});
		http.exceptionHandling(exeConfig -> exeConfig
				.authenticationEntryPoint(this.unauthorizedHandler)
				.accessDeniedHandler(this.accessDeniedHandler)
		);
    	return http.build();
    }
    
}
