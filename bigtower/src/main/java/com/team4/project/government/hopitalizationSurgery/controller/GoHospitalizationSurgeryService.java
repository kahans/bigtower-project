package com.team4.project.government.hopitalizationSurgery.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.project.government.diagnosisPrescription.domain.GoDiagnosis;
import com.team4.project.government.hopitalizationSurgery.domain.GoHospitalization;
import com.team4.project.government.hopitalizationSurgery.domain.GoSurgery;

@Service
public class GoHospitalizationSurgeryService {

	@Autowired
	private GoHospitalizationSurgeryDao goHSD;
	
	//수술내역 검색
	public List<GoSurgery> goSurgeryList(String selectBox, String searchContents){
		
		if(selectBox.equals("goSurgeryResultGoRegistrationDate")){
			selectBox = "GO_SURGERY_RESULT_GO_REGISTRATION_DATE";
		}else if(selectBox.equals("goHospitalName")){
			selectBox = "GO_HOSPITAL_NAME";
		}
		Map<String ,Object> returnMap = new HashMap<String, Object>();
		returnMap.put("selectBox", selectBox);
		returnMap.put("searchContents", searchContents);
		return goHSD.goSurgeryList(returnMap);
	}
	
	//입,퇴원 목록
	public List<GoHospitalization> goHospitalizationList(){
		List<GoHospitalization> goHospitalization = goHSD.goHospitalizationList();
		for(int i=0; i<goHospitalization.size();i++){
			String goTreatCode = goHospitalization.get(i).getGoTreatCode();
			List<GoDiagnosis> diagnosisList =goHSD.goDiagnosis(goTreatCode);
			goHospitalization.get(i).setDiagnosisList(diagnosisList);
		}
		
		return goHospitalization;
	}
}
