package org.qifu.core.config;

import java.io.IOException;

import org.qifu.base.Constants;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.security.web.csrf.CsrfTokenRepository;
import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Super aggressive filter to ensure CSRF token is available via Cookie AND Header.
 */
public class CsrfCookieFilter extends OncePerRequestFilter {
	private final String HEADER_NAME = "X-CSRF-TOKEN";
	
	private final CsrfTokenRepository tokenRepository;

	public CsrfCookieFilter(CsrfTokenRepository tokenRepository) {
		this.tokenRepository = tokenRepository;
	}

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		
		CsrfToken csrfToken = tokenRepository.loadToken(request);
		if (csrfToken == null) {
			csrfToken = tokenRepository.generateToken(request);
			tokenRepository.saveToken(csrfToken, request, response);
		}
		
		if (csrfToken != null) {
			String token = csrfToken.getToken();
			// 1. Force write to Request Attribute
			request.setAttribute(CsrfToken.class.getName(), csrfToken);
			
			// 2. Force write to Response Header (as backup for frontend)
			response.setHeader(HEADER_NAME, token);
			
			// 3. Force write manual Cookie (to be 100% sure about path and domain)
			Cookie cookie = new Cookie(HEADER_NAME, token);
			cookie.setPath(Constants.FORWARD_SLASH);
			cookie.setHttpOnly(false); // MUST be false for JS to read
			cookie.setSecure(request.isSecure());
			response.addCookie(cookie);
		}

		filterChain.doFilter(request, response);
	}

}
