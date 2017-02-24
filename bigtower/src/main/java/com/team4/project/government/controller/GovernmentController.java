package com.team4.project.government.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.team4.project.HomeController;
import com.team4.project.government.dto.GoCitizen;
import com.team4.project.government.dto.GoHospital;

@Controller
public class GovernmentController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired
	private GovernmentService goService;
	
	//httpUrlConnection Test
	@RequestMapping(value="/government/getData", method=RequestMethod.POST)
	public String getData(String id, String name, Model model){
		goService.addData(id, name);
		model.addAttribute("id", id);
		model.addAttribute("name", name);
		return "home";
	}
	
	//초기화면 보여주기
	@RequestMapping(value="/government/", method=RequestMethod.GET)
	public String index(HttpSession session, Model model){
		logger.debug("index 메서드 호출");
		return "/government/index";
	}
	
	
	//로그인 화면 보여주기
	@RequestMapping(value="/government/login", method=RequestMethod.GET )
	public String login(){
		return "/government/login";
	}
	
	//국민 로그인
	@RequestMapping(value="/government/loginCitizen", method=RequestMethod.POST )
	public String login(GoCitizen goCitizen, String birthDate, String serialNo, HttpSession session){
		logger.debug("GoLoginCitizenSub_goLoginCitizen:"+goCitizen);
		goCitizen.setGoCitizenId(birthDate+"-"+serialNo);
		goCitizen = goService.loginCheck(goCitizen);
		logger.debug("goCitizen:"+goCitizen);
		//session.invalidate();
		session.setAttribute("FLAG", "citizen");
		session.setAttribute("GOCITIZENNO", goCitizen.getGoCitizenNo());
		session.setAttribute("GOCITIZENID", goCitizen.getGoCitizenId());
		session.setAttribute("GOCITIZENNAME", goCitizen.getGoCitizenName());
		return "redirect:/government/";
	}
	
	//병원 로그인
	@RequestMapping(value="/government/loginHospital", method=RequestMethod.POST )
	public String login(GoHospital goHospital, HttpSession session){
		logger.debug("GoHospital_goLoginInfo:"+goHospital);
		goHospital = goService.loginCheck(goHospital);
		logger.debug("goHospital:"+goHospital);
		//session.invalidate();
		session.setAttribute("FLAG", "hospital");
		session.setAttribute("GOHOSPITALID", goHospital.getGoHospitalId());
		session.setAttribute("GOHOSPITALNAME", goHospital.getGoHospitalName());
		return "redirect:/government/";
	}
	
	@RequestMapping(value="/government/logout", method=RequestMethod.GET)
	public String logout(HttpSession session){
		session.invalidate();
		logger.debug("session invalidate!!");
		return "redirect:/government/";
	}
	
}
