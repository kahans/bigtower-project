package com.team4.project.hospital.controller;

import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.team4.project.hospital.dto.HoLoginCheckStaffSub;
import com.team4.project.hospital.dto.HoPatient;

@Controller
public class HospitalController {
	private static final Logger logger = LoggerFactory.getLogger(HospitalController.class);

	@Autowired
	private HospitalService hoService;
	
	//인덱스 화면 보기
	@RequestMapping(value="/hospital/", method=RequestMethod.GET)
	public String index(Model model, HttpSession session){
		
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
			session.setAttribute("HOSTAFFID", hoStaffId);
			session.setAttribute("HOSTAFFNAME", staff.getHoStaffName());
			logger.debug("session HOSPITALCODE:"+session.getAttribute("HOSPITALCODE"));
			logger.debug("session HOSPITALNAME:"+session.getAttribute("HOSPITALNAME"));
			logger.debug("session STAFFLEVELCODE:"+session.getAttribute("STAFFLEVELCODE"));
			logger.debug("session STAFFLEVELNAME:"+session.getAttribute("STAFFLEVELNAME"));
			logger.debug("session HOSTAFFID:"+session.getAttribute("HOSTAFFID"));
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
	
	//환자등록 페이지
	@RequestMapping(value="/hospital/addPatient", method=RequestMethod.GET)
	public String addPatient(){
		return "/hospital/views/addPatient";
	}
	
	//환자등록 처리
	@RequestMapping(value="/hospital/addPatient", method=RequestMethod.POST)
	public String addPatient(HoPatient hoPatient, 
							 HttpSession session,
							 RedirectAttributes redidredctAttributes){
		//로그인된 직원의 병원코드를 가져와 환자등록시 이 병원코드가 들어가도록 셋팅
		if(session!=null){
			String hoHospitalCode = (String) session.getAttribute("HOSPITALCODE");
			hoPatient.setHoHospitalCode(hoHospitalCode);
			System.out.println("hoPatient : "+hoPatient);
		}
		int result = hoService.addPatient(hoPatient);
		System.out.println("성공했냐? " + result);
		//환자등록 완료 분기문
		if(result==1){
			JOptionPane.showMessageDialog(null, "등록이 완료되었습니다.");
			redidredctAttributes.addAttribute("hoCitizenId", hoPatient.getHoCitizenId());
			return "redirect:/hospital/receive";
		}else{
			JOptionPane.showMessageDialog(null, "등록 오류");
			return "/hospital/views/addPatient";
		}
		
	}
}
