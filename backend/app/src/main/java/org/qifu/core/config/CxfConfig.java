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
