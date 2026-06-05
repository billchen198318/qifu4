package org.qifu.core.webservice.impl;

import java.util.Map;

import org.qifu.core.webservice.ITestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import tools.jackson.databind.ObjectMapper;

import jakarta.jws.WebService;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@WebService(serviceName = "testService", targetNamespace = "http://test.webservice.core.qifu.org", endpointInterface = "org.qifu.core.webservice.ITestService")
@Component(value = "testService")
public class TestServiceImpl implements ITestService {
	protected static Logger log = LoggerFactory.getLogger(TestServiceImpl.class);

	@Override
	public String play(String message) {
		return "test:" + message;
	}

	/**
	 * test jaxrs http://localhost:8088/services/rest/testService/play
	 * 
	 * @param request
	 * @return
	 */
	@POST
	@Path("/play")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String createItemRest(String requestContent) {
		String jsonStr = "{ \"processCode\" : \"400\", \"processMessage\":\"錯誤\" }";
		try {
			jsonStr = new ObjectMapper().writeValueAsString(Map.of("value", "TEST!"));
		} catch (Exception e) {
			log.info("Exception Happened ! ", e);
		}
		return jsonStr;
	}
	
}
