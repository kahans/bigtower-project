package com.team4.project;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	/*정부 메인페이지*/
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		return "government/government-index";
	}
	/*정부 회원가입*/
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(){
		return "government/index-form";
	}
	/*정부로그인*/
	@RequestMapping(value = "/gologin", method = RequestMethod.GET)
	public String gologin(Model model) {
				
		return "government/government-login";
	}
	
	
	/*병원관리 페이지*/
	@RequestMapping(value = "/ho", method = RequestMethod.GET)
	public String ho(Model model) {
	
		
		return "hospital/hospital-index";
	}
	/*아이콘 페이지*/
	@RequestMapping(value = "/icons", method = RequestMethod.GET)
	public String icons(Model model) {
				
		return "hospital/icons";
	}
	/*병원 로그인*/
	@RequestMapping(value = "/hologin", method = RequestMethod.GET)
	public String hologin(Model model) {
				
		return "hospital/login";
	}
}
