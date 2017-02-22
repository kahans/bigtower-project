package com.team4.project.hospital.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.team4.project.hospital.dto.HoLoginCheckStaffSub;

@Controller
public class HospitalController {
	private static final Logger logger = LoggerFactory.getLogger(HospitalController.class);

	@Autowired
	private HospitalService hoService;
	
	//인덱스 화면 보기
	@RequestMapping(value="/hospital/", method=RequestMethod.GET)
	public String index(Model model, HttpSession session){
		if( session.getAttribute("HOSPITALCODE")!=null){
			model.addAttribute("HOSPITALCODE", session.getAttribute("HOSPITALCODE"));
			model.addAttribute("HOSPITALNAME", session.getAttribute("HOSPITALNAME"));
			model.addAttribute("STAFFLEVELCODE", session.getAttribute("STAFFLEVELCODE"));
			model.addAttribute("STAFFLEVELNAME", session.getAttribute("STAFFLEVELNAME"));
			model.addAttribute("HOSTAFFNAME", session.getAttribute("HOSTAFFNAME"));
		}
		return "/hospital_YJ/index";
	}
	
	//로그인페이지 보기
	@RequestMapping(value="/hospital/login", method=RequestMethod.GET)
	public String login(){
		return "/hospital_YJ/login";
	}
	
	//로그인 처리
	@RequestMapping(value="/hospital/login", method=RequestMethod.POST)
	public String login(String hoStaffId, String hoStaffPw, HttpSession session){
		logger.debug("hoStaffId:"+hoStaffId);
		logger.debug("hoStaffPw:"+hoStaffPw);
		HoLoginCheckStaffSub staff = hoService.loginCheck(hoStaffId, hoStaffPw);
		if (staff!=null){
			session.setAttribute("HOSPITALCODE", staff.getHoHospitalCode());
			session.setAttribute("HOSPITALNAME", staff.getHoHospitalName());
			session.setAttribute("STAFFLEVELCODE", staff.getStaffLevelCode());
			session.setAttribute("STAFFLEVELNAME", staff.getStaffLevelName());
			session.setAttribute("HOSTAFFNAME", staff.getHoStaffName());
			logger.debug("session HOSPITALCODE:"+session.getAttribute("HOSPITALCODE"));
			logger.debug("session HOSPITALNAME:"+session.getAttribute("HOSPITALNAME"));
			logger.debug("session STAFFLEVELCODE:"+session.getAttribute("STAFFLEVELCODE"));
			logger.debug("session STAFFLEVELNAME:"+session.getAttribute("STAFFLEVELNAME"));
			logger.debug("session HOSTAFFNAME:"+session.getAttribute("HOSTAFFNAME"));
		}
		return "redirect:/hospital/";
	}
	
	//로그아웃 실행
	@RequestMapping(value="/hospital/logout", method=RequestMethod.GET)
	public String logout(HttpSession session){
		session.invalidate();
		return "/hospital_YJ/index";
	}
}
