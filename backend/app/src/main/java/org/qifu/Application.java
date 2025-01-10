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

import org.qifu.base.AppContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import jakarta.annotation.Resource;

@SpringBootApplication
@ComponentScan("org.qifu.*")
@EnableWebMvc
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@EnableCaching
@EnableScheduling
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
