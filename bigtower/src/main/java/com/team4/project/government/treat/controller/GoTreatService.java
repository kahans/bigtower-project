package com.team4.project.government.treat.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.project.government.diagnosisPrescription.domain.GoDiagnosis;
import com.team4.project.government.treat.domain.GoSearchTreatSub;
import com.team4.project.util.Util;

@Service
public class GoTreatService {

	@Autowired
	private GoTreatDao goTCD;
	
	//진료 상세보기
	public GoSearchTreatSub goSelectTreat(String goTreatCode){
		return goTCD.goSelectTreat(goTreatCode);
	}
		
	//진료목록
	public List<GoSearchTreatSub> goTreatList(Map<String, Object> returnMap){
		//검색 내용에 들어가는 단어를 포함한 모든 목록을 출력할 수 있도록 앞뒤로 %를 추가해줌
		String diseaseSearch = (String) returnMap.get("diseaseSearch");
		String subjectSearch = (String) returnMap.get("subjectSearch");
		String hospitalSearch = (String) returnMap.get("hospitalSearch");
		String doctorSearch = (String) returnMap.get("doctorSearch");
		if(!diseaseSearch.equals("")){
			diseaseSearch = "%"+diseaseSearch+"%";
		}
		if(!subjectSearch.equals("")){
			subjectSearch = "%"+subjectSearch+"%";
		}
		if(!hospitalSearch.equals("")){
			hospitalSearch = "%"+hospitalSearch+"%";
		}
		if(!doctorSearch.equals("")){
			doctorSearch = "%"+doctorSearch+"%";
		}
		returnMap.put("diseaseSearch", diseaseSearch);
		returnMap.put("subjectSearch", subjectSearch);
		returnMap.put("hospitalSearch", hospitalSearch);
		returnMap.put("doctorSearch", doctorSearch);
		System.out.println("diseaseSearch is "+diseaseSearch);
		System.out.println("subjectSearch is "+subjectSearch);
		System.out.println("hospitalSearch is "+hospitalSearch);
		System.out.println("doctorSearch is "+doctorSearch);
		
		//날짜가 null일 때 자동 날짜 셋팅
		String firstDay = (String) returnMap.get("firstDay");
		String secondDay = (String) returnMap.get("secondDay");		
		Map<String, Object> map = Util.createDate(firstDay, secondDay);
		firstDay = (String)map.get("firstDate");
		secondDay = (String)map.get("secondDate");
		System.out.println("firstDay is "+firstDay);
		System.out.println("secondDay is "+secondDay);
		returnMap.put("firstDay", firstDay);
		returnMap.put("secondDay", secondDay);
		
		//맵에 담긴 검색내용에 부합한 목록을 가져와 goTreatList에 return함
		List<GoSearchTreatSub> goTreatList = goTCD.goTreatList(returnMap);
		System.out.println("goTreatList:"+goTreatList);
		
		//진료코드를 이용하여 질병 목록들을 가져오기 위해  for문을 사용함
		for(int i=0;i<goTreatList.size();i++){
			String goTreatCode = goTreatList.get(i).getGoTreatCode();
			System.out.println("goTreatCode is "+goTreatCode);
			List<GoDiagnosis> diagnosisList = goTCD.goDiagnosisList(goTreatCode);
			goTreatList.get(i).setDiagnosisList(diagnosisList);
		}
		//goTreatList.size()
		return goTreatList;
	}
	
	//동일한 진료코드의 질병코드 리스트 가져오기
	public List<GoDiagnosis> goDiagnosisList(String goTreatCode){	
		return goTCD.goDiagnosisList(goTreatCode);
	}
	
	//로그인된 국민의 진료본 과목 목록 출력하기
	public List<GoSearchTreatSub> goSelectOneTreatSubject(int goCitizenNo){
		return goTCD.goSelectOneTreatSubject(goCitizenNo);
	}
}
