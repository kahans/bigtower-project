package com.team4.project.hospital.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.team4.project.hospital.dto.HoStaff;
import com.team4.project.hospital.receiveReservation.controller.HoReceiveReservationController;

@Controller
public class HospitalController {
	private static final Logger logger = LoggerFactory.getLogger(HospitalController.class);

	@Autowired
	private HospitalService hoService;
	
	//인덱스 화면 보기
	@RequestMapping(value="/hospital/", method=RequestMethod.GET)
	public String index(Model model, HttpSession session){
		if( session.getAttribute("hospitalCode")!=null){
			model.addAttribute("hospitalCode", session.getAttribute("hospitalCode"));
			model.addAttribute("staffLevelCode", session.getAttribute("staffLevelCode"));
			model.addAttribute("hoStaffName", session.getAttribute("hoStaffName"));
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
		HoStaff staff = hoService.loginCheck(hoStaffId, hoStaffPw);
		if (staff!=null){
			session.setAttribute("hospitalCode", staff.getHoHospitalCode());
			session.setAttribute("staffLevelCode", staff.getStaffLevelCode());
			session.setAttribute("hoStaffName", staff.getHoStaffName());
			logger.debug("session hospitalCode:"+session.getAttribute("hospitalCode"));
			logger.debug("session staffLevelCode:"+session.getAttribute("staffLevelCode"));
			logger.debug("session hoStaffName:"+session.getAttribute("hoStaffName"));
		}
/*		ho_hospital_code,
		staff_level_code,
		ho_staff_name*/
		return "redirect:/hospital/login";
	}
}
