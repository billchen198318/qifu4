package org.qifu.core.config;

import java.util.function.Supplier;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.security.web.csrf.CsrfTokenRequestAttributeHandler;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Simplified Request Handler to avoid deferred loading issues in SPA.
 */
public class SpaCsrfTokenRequestHandler extends CsrfTokenRequestAttributeHandler {

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response, Supplier<CsrfToken> csrfToken) {
		// Force immediate resolution of the token
		request.setAttribute(CsrfToken.class.getName(), csrfToken.get());
		super.handle(request, response, csrfToken);
	}
	
}
