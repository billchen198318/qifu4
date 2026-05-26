package org.qifu.core.config;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.security.web.csrf.CsrfException;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class CustomAccessDeniedHandler implements AccessDeniedHandler {
	protected static Logger logger = LoggerFactory.getLogger(CustomAccessDeniedHandler.class);

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response,
			AccessDeniedException accessDeniedException) throws IOException, ServletException {
		
		if (accessDeniedException instanceof CsrfException) {
			logger.error("CSRF Token validation failed for path: {} , error: {}", request.getServletPath(), accessDeniedException.getMessage());
		} else {
			logger.error("Access Denied for path: {} , error: {}", request.getServletPath(), accessDeniedException.getMessage());
		}

	    response.setContentType(MediaType.APPLICATION_JSON_VALUE);
	    response.setStatus(HttpServletResponse.SC_FORBIDDEN);
	    
	    Map<String, Object> body = new HashMap<>();
	    body.put("status", HttpServletResponse.SC_FORBIDDEN);
	    body.put("error", "Forbidden");
	    body.put("message", accessDeniedException.getMessage());
	    body.put("csrf_error", accessDeniedException instanceof CsrfException);
	    body.put("path", request.getServletPath());
	    
	    ObjectMapper mapper = new ObjectMapper();
	    mapper.writeValue(response.getOutputStream(), body);
	}
	
}
