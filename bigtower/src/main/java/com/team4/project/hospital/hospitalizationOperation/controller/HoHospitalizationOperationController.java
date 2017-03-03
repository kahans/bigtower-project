package com.team4.project.hospital.hospitalizationOperation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.team4.project.hospital.hospitalizationOperation.domain.HoHospitalization;

@Controller
public class HoHospitalizationOperationController {

	@Autowired
	private HoHospitalizationOperationService hoHOS;
	
	@RequestMapping(value="/hospital/hospitalizationRequest")
	public String addHospitalizationRequest(HoHospitalization hoHospitalization){
		System.out.println("hoHospitalization : "+hoHospitalization);
		int result = hoHOS.addRequest(hoHospitalization);
		System.out.println("입퇴원 요청 등록 결과는 ? "+result);
		return "redirect:/hospital/treatList";
	}
}
