package com.team4.project.government.hopitalizationSurgery.controller;

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
	public List<GoSurgery> goSurgeryList(Map<String, Object> returnMap){
		
		
		List<GoSurgery> goSurgeryList =goHSD.goSurgeryList(returnMap);
		System.out.println(goSurgeryList.toString());
		return goSurgeryList;
	}
	
	//입,퇴원 목록
	public List<GoHospitalization> goHospitalizationList(Map<String, Object> returnMap){
		List<GoHospitalization> goHospitalization = goHSD.goHospitalizationList(returnMap);
		for(int i=0; i<goHospitalization.size();i++){
			String goTreatCode = goHospitalization.get(i).getGoTreatCode();
			List<GoDiagnosis> diagnosisList =goHSD.goDiagnosis(goTreatCode);
			goHospitalization.get(i).setDiagnosisList(diagnosisList);
		}
		
		return goHospitalization;
	}
}
