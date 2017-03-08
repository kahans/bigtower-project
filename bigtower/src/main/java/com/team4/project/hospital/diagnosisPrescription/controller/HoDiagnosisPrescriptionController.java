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
	
}
