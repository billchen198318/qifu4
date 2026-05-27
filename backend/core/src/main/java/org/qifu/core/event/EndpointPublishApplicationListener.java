package org.qifu.core.event;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.qifu.base.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import com.fasterxml.jackson.databind.ObjectMapper;

/** 載入 endpoint-publish.json 依設定內容部屬 soap 與 jaxrs(rest) */
@Component
public class EndpointPublishApplicationListener implements ApplicationListener<ContextRefreshedEvent> {
	protected Logger log = LoggerFactory.getLogger(getClass()); 
	
	public EndpointPublishApplicationListener() {
	}

	private Object getBean(ContextRefreshedEvent event, String beanId) {
		Object bean = null;
		try {
			bean = event.getApplicationContext().getBean(beanId);
		} catch (Exception e) {
			log.info("Exception Happened ! ", e);
		}
		return bean;
	}

	@SuppressWarnings("unchecked")
	private Map<String, Object> objectMapperReadValue(String fileRes) throws IOException {
		return new ObjectMapper().readValue(read(fileRes), Map.class);
	}

	private String read(String fileRes) throws IOException {
		String str = "";
		try (InputStream is = EndpointPublishApplicationListener.class.getClassLoader().getResource(fileRes)
				.openStream()) {
			str = IOUtils.toString(is, StandardCharsets.UTF_8);
		}
		return str;
	}

	private void publishCxfEndpoint(ContextRefreshedEvent event) throws IOException {
		Bus bus = event.getApplicationContext().getBean(Bus.class);
		Map<String, Object> configMap = objectMapperReadValue("endpoint-publish.json");

		if (MapUtils.isEmpty(configMap)) {
			return;
		}
		String restAddress = (String) configMap.get("restAddress");
		@SuppressWarnings("unchecked")
		List<Map<String, Object>> endpointsList = (List<Map<String, Object>>) configMap.get("endpoints");
		if (CollectionUtils.isEmpty(endpointsList)) {
			return;
		}
		List<Object> restServiceList = new ArrayList<>();
		for (Map<String, Object> endpointMap : endpointsList) {
			String name = StringUtils.defaultString((String) endpointMap.get("name"));
			String beanId = StringUtils.defaultString((String) endpointMap.get("beanId"));
			String publish = StringUtils.defaultString((String) endpointMap.get("publish"));
			boolean hasRest = (boolean) endpointMap.get("hasRest");
			boolean enable = (boolean) endpointMap.get("enable");
			if (!enable || (StringUtils.isBlank(beanId) || StringUtils.isBlank(name) || StringUtils.isBlank(publish))
					|| (!publish.startsWith(Constants.FORWARD_SLASH) || publish.length() < 2)) {
				continue;
			}
			Object serviceBean = this.getBean(event, beanId);
			if (null != serviceBean) {
				EndpointImpl endpoint = new EndpointImpl(bus, serviceBean);
				@SuppressWarnings("unchecked")
				List<String> inInterceptors = (List<String>) endpointMap.get("inInterceptors");
				@SuppressWarnings("unchecked")
				List<String> outInterceptors = (List<String>) endpointMap.get("outInterceptors");
				this.publishProcess(event, publish, endpoint, inInterceptors, outInterceptors);
				if (hasRest) {
					restServiceList.add(serviceBean);
				}
			}
		}
		if (!CollectionUtils.isEmpty(restServiceList)) {
			JAXRSServerFactoryBean jaxrsBean = new JAXRSServerFactoryBean();
			jaxrsBean.setBus(bus);
			jaxrsBean.setAddress(restAddress);
			jaxrsBean.setServiceBeans(restServiceList);
			jaxrsBean.create();
		}
	}

	private void publishProcess(ContextRefreshedEvent event, String publish, EndpointImpl endpoint,
			List<String> inInterceptors, List<String> outInterceptors) {
		if (!CollectionUtils.isEmpty(inInterceptors)) {
			for (String interceptorBeanId : inInterceptors) {
				Object interceptorBean = this.getBean(event, interceptorBeanId);
				if (interceptorBean != null
						&& interceptorBean instanceof @SuppressWarnings("unused") AbstractPhaseInterceptor<?> pi) {
					endpoint.getInInterceptors().add((AbstractPhaseInterceptor<?>) interceptorBean);
				}
			}
		}
		if (!CollectionUtils.isEmpty(outInterceptors)) {
			for (String interceptorBeanId : outInterceptors) {
				Object interceptorBean = this.getBean(event, interceptorBeanId);
				if (interceptorBean != null
						&& interceptorBean instanceof @SuppressWarnings("unused") AbstractPhaseInterceptor<?> pi) {
					endpoint.getOutInterceptors().add((AbstractPhaseInterceptor<?>) interceptorBean);
				}
			}
		}
		endpoint.publish(publish);
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		try {
			this.publishCxfEndpoint(event);
		} catch (Exception e) {
			log.info("Exception Happened ! ", e);
		}
	}
	
}
