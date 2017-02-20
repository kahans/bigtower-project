package com.team4.project;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController_government_admin {
	
	@Autowired
	
	
	private static final Logger logger = LoggerFactory.getLogger(TestController_government_admin.class);
	
	@RequestMapping(value="/goAdmin/main" , method=RequestMethod.GET)
	public String mainPage(){
		logger.debug("관리자 권한으로 로그인 성공함. 관리자용 메인페이지로 보내줌");
		return "/government/admin/main";
	}
	
	
}
