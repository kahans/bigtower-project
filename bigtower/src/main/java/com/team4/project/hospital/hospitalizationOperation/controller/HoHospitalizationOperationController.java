package com.team4.project.hospital.hospitalizationOperation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.team4.project.hospital.hospitalizationOperation.domain.HoHospitalization;
import com.team4.project.hospital.hospitalizationOperation.domain.HoOperation;
import com.team4.project.hospital.hospitalizationOperation.domain.HoOperationSub;

@Controller
public class HoHospitalizationOperationController {

	@Autowired
	private HoHospitalizationOperationService hoHOS;
	
	//입퇴원요청
	@RequestMapping(value="/hospital/hospitalizationRequest")
	public String addHospitalizationRequest(HoHospitalization hoHospitalization){
		System.out.println("hoHospitalization : "+hoHospitalization);
		int result = hoHOS.addRequest(hoHospitalization);
		System.out.println("입퇴원 요청 등록 결과는 ? "+result);
		return "redirect:/hospital/treatList";
	}
	
	//수술 추가
	@RequestMapping(value="/hospital/addOperation")
	public String addOperation(HoOperation hoOperation){
		System.out.println(hoOperation);
		int result = hoHOS.addOperation(hoOperation);
		System.out.println("수술 등록 결과는 ? "+result);
		
		return "redirect:/hospital/operationList";
	}
	
	//수술 목록
	@RequestMapping(value="/hospital/operationList")
	public String operationList(Model model){
		List<HoOperationSub> operationList = hoHOS.operationList();
		System.out.println("수술 목록 : "+operationList);
		model.addAttribute("operationList",operationList);
		return "/hospital/views/operationList";
	}
}
