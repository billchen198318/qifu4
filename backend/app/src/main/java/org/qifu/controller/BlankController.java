package org.qifu.controller;

import java.io.IOException;

import org.qifu.base.Constants;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class BlankController {
	
	private static final String VIEW_BLANK = "view/blank";
	
	@RequestMapping("/")
	public String indexPage(ModelMap mm, HttpServletRequest request, HttpServletResponse response) {
		return VIEW_BLANK;
	}
	
	@GetMapping(value = "/", produces = "application/json")
	public String indexGet(ModelMap mm, HttpServletRequest request, HttpServletResponse response) {
		try {
			response.getWriter().print(Constants.NO_LOGIN_JSON_DATA);
			response.getWriter().flush();
			response.getWriter().close();			
		} catch (IOException e) {
			e.printStackTrace();
		}		
		return null;
	}	
	
	@RequestMapping("/loginPage")
	public String loginPage(ModelMap mm, HttpServletRequest request) {
		return VIEW_BLANK;
	}
	
	@RequestMapping("/loginAgainPage")
	public String loginAgainPage(ModelMap mm, HttpServletRequest request) {
		return VIEW_BLANK;
	}	
	
	@RequestMapping("/noAuthPage")
	public String noAuthPage(ModelMap mm, HttpServletRequest request) {
		return VIEW_BLANK;
	}
	
}
