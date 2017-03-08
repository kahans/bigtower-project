package com.team4.project.hospital.hospitalizationOperation.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.team4.project.hospital.hospitalizationOperation.domain.HoHospitalization;
import com.team4.project.hospital.hospitalizationOperation.domain.HoHospitalizationRequest;
import com.team4.project.hospital.hospitalizationOperation.domain.HoOperation;
import com.team4.project.hospital.hospitalizationOperation.domain.HoOperationSub;

@Controller
public class HoHospitalizationOperationController {

	@Autowired
	private HoHospitalizationOperationService hoHOS;

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
		return "/hospital/views/operation/operationList";
	}
	
	//입퇴원 요청 목록
	@RequestMapping(value="/hospital/hospitalizationRequestList")
	public String hospitalizationRequestList(Model model, HttpSession session){
		String hoHospitalCode = (String) session.getAttribute("HOSPITALCODE");
		List<HoHospitalizationRequest> hospitalizationRequestList = hoHOS.hospitalizationRequestList(hoHospitalCode);
		model.addAttribute("hospitalizationRequestList",hospitalizationRequestList);
		return "/hospital/views/hospitalization/hospitalizationRequestList";
	}
	
	//입원 환자 목록 
	@RequestMapping(value="/hospital/hospitalizationList")
	public String hospitalizationList(HttpSession session, Model model){
		String hoHospitalCode = (String) session.getAttribute("HOSPITALCODE");
		List<HoHospitalization> hospitalizationList = hoHOS.hospitalizationList(hoHospitalCode);
		model.addAttribute("hospitalizationList",hospitalizationList);
		return "/hospital/views/hospitalization/hospitalizationList";
	}
	
	//퇴원일 업데이트
	@RequestMapping(value="/hospital/updateHospitalization")
	public String updateHospitalization(String hoHospitalizationCode){
		System.out.println("hoHospitalizationCode : " + hoHospitalizationCode);
		int result = hoHOS.updateHospitalization(hoHospitalizationCode);
		System.out.println("퇴원일 갱신 결과는 ? "+result);
		return "redirect:/hospital/hospitalizationList";
	}
	
	//입원 등록
	@RequestMapping(value="/hospital/addHospitalization")
	public String addHospitalization(String hoTreatmentCode,
									 String hoHospitalizationRequestCode){
		System.out.println("hoTreatmentCode : "+hoTreatmentCode);
		System.out.println("hoHospitalizationRequestCode : "+hoHospitalizationRequestCode);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("hoTreatmentCode", hoTreatmentCode);
		map.put("hoHospitalizationRequestCode", hoHospitalizationRequestCode);
		int result = hoHOS.addHospitalization(map);
		System.out.println("입원등록 결과는? " + result );
		return "redirect:/hospital/hospitalizationList";
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
		return "/hospital/views/operation/operationView";
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
