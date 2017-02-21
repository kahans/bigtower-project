package com.team4.project.government.treat.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.project.government.diagnosisPrescription.domain.GoDiagnosis;
import com.team4.project.government.treat.domain.GoTreat;

@Service
public class GoTreatService {

	@Autowired
	private GoTreatDao goTCD;
	
	//진료 상세보기
	public GoTreat goSelectTreat(String goTreatCode){
		return goTCD.goSelectTreat(goTreatCode);
	}
	
	//진료목록
	public List<GoTreat> goTreatList(String selectConditions, String searchContents){
		System.out.println("selectConditions 값 : "+ selectConditions);
		System.out.println("searchContents 값 : "+ searchContents);
		
		if(selectConditions.equals("selectSubject")){
			selectConditions = "GO_TREAT_SUBJECT_NAME";
		} else if(selectConditions.equals("selectHospital")){
			selectConditions = "GO_HOSPTIAL_NAME";
		} else if(selectConditions.equals("selectDisease")){
			selectConditions = "GO_DISEASE_KOR";
		} else if(selectConditions.equals("selectDoctor")){
			selectConditions = "GO_DOCTOR_NAME";
		}
		System.out.println("조건문 후 selectConditions 값 : "+ selectConditions);
		Map<String, Object> returnMap = new HashMap<String, Object>();
		returnMap.put("selectConditions", selectConditions);
		returnMap.put("searchContents", searchContents);
		List<GoTreat> goTreatList = goTCD.goTreatList(returnMap);
		System.out.println("goTreatList:"+goTreatList);
		//진료코드를 이용하여 질병 목록들을 가져오기 위해  for문을 사용한다.
		for(int i=0;i<goTreatList.size();i++){
			String goTreatCode = goTreatList.get(i).getGoTreatCode();
			List<GoDiagnosis> diagnosisList = goTCD.goDiagnosisList(goTreatCode);
			goTreatList.get(i).setDiagnosisList(diagnosisList);
		}
		
		return goTreatList;
	}
	
	//동일한 진료코드의 질병코드 리스트 가져오기
	public List<GoDiagnosis> goDiagnosisList(String goTreatCode){
		
		return goTCD.goDiagnosisList(goTreatCode);
	}
}
