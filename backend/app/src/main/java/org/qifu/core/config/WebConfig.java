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
