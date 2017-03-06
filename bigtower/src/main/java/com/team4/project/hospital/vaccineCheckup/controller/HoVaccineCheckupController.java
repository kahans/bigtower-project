package com.team4.project.hospital.vaccineCheckup.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.team4.project.hospital.vaccineCheckup.domain.HoCheckup;
import com.team4.project.hospital.vaccineCheckup.domain.HoCheckupSub;

@Controller
public class HoVaccineCheckupController {

	@Autowired
	private HoVaccineCheckupService hoVCS;
	//거강검진 리스트
	@RequestMapping(value="/hospital/test/checkupList", method=RequestMethod.GET)
	public String checkupList(HoCheckup hoCheckup, Model model){
		hoCheckup.setHoTestCode("3");
		
		List<HoCheckup> checkupList = hoVCS.checkupList(hoCheckup);
		
		model.addAttribute("checkupList", checkupList);
		return "/hospital/views/tests/checkupList";
	}
	//건강검진 등록 뷰 get
	@RequestMapping(value="/hospital/test/checkupAdd", method=RequestMethod.GET)
	public String checkupAdd(Model model,
				@RequestParam(value="hoTestRequestCode", required=false)String hoTestRequestCode
			){
		HoCheckupSub checkView = hoVCS.checkView(hoTestRequestCode);
		model.addAttribute("checkView", checkView);
		return "/hospital/views/tests/checkupAdd";
	}
	//건강검진 등록 뷰 post
	@RequestMapping(value="/hospital/test/checkupAdd", method=RequestMethod.POST)
	public String checkAdd(HttpServletRequest request, HoCheckupSub checkAdd){
		String path="D:\\testImage";//상대주소
		// 배포시사용할경로
		//String path = "/home/hosting_users/bluesang7/tomcat/webapps/bigtower/resources/file/image";
		checkAdd.setHoCheckUpResultPath(path);
		hoVCS.checkAdd(checkAdd);
		return "redirect:/hospital/test/checkupList";
	}
	//예방잡종 리스트
	@RequestMapping(value="/hospital/vaccineList", method=RequestMethod.GET)
	public String vaccineList(Model model){
		
		return "";
	}
}
