package com.team4.project.hospital.hospitalizationOperation.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.team4.project.hospital.hospitalizationOperation.domain.HoHospitalizationRequest;
import com.team4.project.hospital.hospitalizationOperation.domain.HoOperation;
import com.team4.project.hospital.hospitalizationOperation.domain.HoOperationSub;

@Controller
public class HoHospitalizationOperationController {

	@Autowired
	private HoHospitalizationOperationService hoHOS;
/*	
	//입퇴원요청
	@RequestMapping(value="/hospital/hospitalizationRequest")
	public String addHospitalizationRequest(HoHospitalization hoHospitalization){
		System.out.println("hoHospitalization : "+hoHospitalization);
		int result = hoHOS.addRequest(hoHospitalization);
		System.out.println("입퇴원 요청 등록 결과는 ? "+result);
		return "redirect:/hospital/treatList";
	}*/
	
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
	public String operationList(Model model, HttpSession session){
		String hoHospitalCode = (String) session.getAttribute("HOSPITALCODE");
		List<HoOperationSub> operationList = hoHOS.operationList(hoHospitalCode);
		System.out.println("수술 목록 : "+operationList);
		model.addAttribute("operationList",operationList);
		return "/hospital/views/operationList";
	}
	
	//입퇴원 요청 목록
	@RequestMapping(value="/hospital/hospitalizationRequestList")
	public String hospitalizationRequestList(Model model, HttpSession session){
		String hoHospitalCode = (String) session.getAttribute("HOSPITALCODE");
		List<HoHospitalizationRequest> hospitalizationRequestList = hoHOS.hospitalizationRequestList(hoHospitalCode);
		model.addAttribute("hospitalizationRequestList",hospitalizationRequestList);
		return "/hospital/views/hospitalizationRequestList";
	}
	
	//수술 데이터 상세보기
	@RequestMapping(value="/hospital/operationView", method=RequestMethod.GET)
	public String operationView(String hoOperationCode,
								HoOperation hoOperation,
								Model model){
		System.out.println("수술 상세보기 hoOperationCode : "+hoOperationCode );
		hoOperation = hoHOS.operationView(hoOperationCode);
		System.out.println("hoOperation : "+hoOperation);
		model.addAttribute("hoOperation",hoOperation);
		return "/hospital/views/operationView";
	}
	
	//수술일지 수정
	@RequestMapping(value="/hospital/operationView", method=RequestMethod.POST)
	public String operationView(HoOperationSub hoOperationSub){
		System.out.println("수술수정 hoOperationSub : "+hoOperationSub );
		int result = hoHOS.updateOperation(hoOperationSub);
		System.out.println("수술 수정 결과는 ? "+result );
		return "redirect:/hospital/operationList";
	}
}
