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
	/*첫 메인화면*/
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String firstIndex(){
		return "index";
	}
	/*정부 메인페이지*/ 
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		return "government/government-index";
	}
	/*정부 회원가입*/
	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public String index(){
		return "government/index-form";
	}
	/*정부로그인*/
	@RequestMapping(value = "/gologin", method = RequestMethod.GET)
	public String gologin(Model model) {
				
		return "government/government-login";
	}
	@RequestMapping(value = "/gologin", method = RequestMethod.POST)
	public String PostLogin(LoginDto dto) {
		LoginDto dto01 = new LoginDto();
		
		// 관리자 아이디가 트루
		if (dto01.getId().equals("admin")) {
			// 관리자의 비번이 트루
			dto01.setLevel("관리자");
			if (dto01.getPw().equals("1111")) {
				//
				if (dto01.getLevel().equals("관리자")) {
					System.out.println(dto01.toString());
					return "government/admin/main";
				}
			} else {
				return "government/government-login";
				// 비번이 틀린경우 다시 로그인 창으로 이동
			}
		} else if (dto.getId().equals("guest")) {
			// 손님비번은 나중에
			return "government/citizen/cmain";
		}else{
			return "government/government-login";

		}
		return "index";
	}
	
	/*병원관리 페이지*/
	@RequestMapping(value = "/ho", method = RequestMethod.GET)
	public String ho(Model model) {
	
		
		return "/hospital/templates/hospital-index";
	}
	/*아이콘 페이지*/
	@RequestMapping(value = "/icons", method = RequestMethod.GET)
	public String icons(Model model) {
				
		return "hospital/icons";
	}
	/*병원 로그인*/
	@RequestMapping(value = "/hologin", method = RequestMethod.GET)
	public String hologin(Model model) {
				
		return "views/hospital/templates/login";
	}
}
