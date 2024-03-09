package org.qifu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class BlankController {
	
	@RequestMapping("/")
	public String indexPage(ModelMap mm, HttpServletRequest request) {
		return "view/blank";
	}
	
	@RequestMapping("/loginPage")
	public String loginPage(ModelMap mm, HttpServletRequest request) {
		return "view/blank";
	}
	
	@RequestMapping("/loginAgainPage")
	public String loginAgainPage(ModelMap mm, HttpServletRequest request) {
		return "view/blank";
	}	
	
	@RequestMapping("/noAuthPage")
	public String noAuthPage(ModelMap mm, HttpServletRequest request) {
		return "view/blank";
	}
	
}
