package com.team4.project.hospital.diagnosisPrescription.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.team4.project.hospital.diagnosisPrescription.domain.HoPrescription;
import com.team4.project.hospital.dto.HoMedicine;

@Controller
public class HoDiagnosisPrescriptionController {

	@Autowired
	private HoDiagnosisPrescriptionService hoDPS;
	
	//진단(질병명) 등록
	@RequestMapping(value="/hospital/addDiagnosis")
	public String addDiagnosis(String[] diseaseList,
							   String hoTreatmentCode){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("diseaseList", diseaseList);
		map.put("hoTreatmentCode", hoTreatmentCode);
		hoDPS.addDiagnosis(map);
		return "redirect:/hospital/treatList";
	}
	
	@RequestMapping(value="/hospital/addPrescription", method=RequestMethod.GET)
	public String addPrescription(String hoTreatmentCode, Model model){
		List<HoMedicine> medicineList = hoDPS.selectMedicine();
		System.out.println("addPrescription 메서드의 hoTreatmentCode : "+hoTreatmentCode);
		model.addAttribute("hoTreatmentCode", hoTreatmentCode);
		model.addAttribute("medicineList",medicineList);
		return "/hospital/views/addPrescription";
	}
	
	@RequestMapping(value="/hospital/addPrescription", method=RequestMethod.POST)
	public String addPrescription(HoPrescription hoPrescription){
		System.out.println("hoPrescription : "+hoPrescription);
		int result = hoDPS.addPrescription(hoPrescription);
		System.out.println("처방전 등록 결과는 ? "+result);
		return "redirect:/hospital/treatList";
	}
}
