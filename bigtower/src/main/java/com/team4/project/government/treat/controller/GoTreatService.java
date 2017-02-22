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
		//질병목록에 있는 질병이름을 검색하기 위해 앞뒤로 %를 넣어주고 그 단어가 들어가는 목록들을 출력하도록 하기 위함
		String diseaseSearch = (String) returnMap.get("diseaseSearch");
		diseaseSearch = "%"+diseaseSearch+"%";
		returnMap.put("diseaseSearch", diseaseSearch);
		
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
