package com.team4.project.government.treat.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.team4.project.government.treat.domain.GoSearchTreatSub;

@Controller
public class GoTreatController {
	private static final Logger logger = LoggerFactory.getLogger(GoTreatController.class);
	
	@Autowired
	private GoTreatService goTCS;

	//진료 상세보기
	@RequestMapping(value="/government/treatView", method=RequestMethod.GET)
	public String goSelectTreat(Model model,
			@RequestParam(value="goTreatCode")String goTreatCode){
		System.out.println("진료상세보기 진료코드 : "+goTreatCode);
		model.addAttribute("Treat",goTCS.goSelectTreat(goTreatCode));
		return "/government/citizen/treat/goSelectTreat";
	}
	
	//진료목록  검색
	@RequestMapping(value="/government/treatSearch", method=RequestMethod.POST)
	public @ResponseBody List<GoSearchTreatSub> treatList(HttpSession session,
			@RequestParam(value="firstDay", required=false)String firstDay,
			@RequestParam(value="secondDay", required=false)String secondDay,
			@RequestParam(value="subjectSearch", required=false) String subjectSearch,
			@RequestParam(value="hospitalSearch", required=false)String hospitalSearch,
			@RequestParam(value="diseaseSearch", required=false) String diseaseSearch,
			@RequestParam(value="doctorSearch", required=false)String doctorSearch) {
		System.out.println("firstDay 값 : "+ firstDay);
		System.out.println("secondDay 값 : "+ secondDay);
		System.out.println("subjectSearch 값 : "+ subjectSearch);
		System.out.println("hospitalSearch 값 : "+ hospitalSearch);
		System.out.println("diseaseSearch 값 : "+ diseaseSearch);
		System.out.println("doctorSearch 값 : "+ doctorSearch);
		
		//세션ID 받아서 이곳에 넣기		
		String goCitizenId = (String) session.getAttribute("GOCITIZENID");
		
		//검색내용을 Map에 담아 보냄
		Map<String, Object> returnMap = new HashMap<String, Object>();
		returnMap.put("firstDay", firstDay);
		returnMap.put("secondDay", secondDay);
		returnMap.put("subjectSearch", subjectSearch);
		returnMap.put("hospitalSearch", hospitalSearch);
		returnMap.put("diseaseSearch", diseaseSearch);
		returnMap.put("doctorSearch", doctorSearch);
		returnMap.put("goCitizenId", goCitizenId); //로그인시 받아올 국민 주민번호
		
		List<GoSearchTreatSub> goTreatList = goTCS.goTreatList(returnMap);
		
		System.out.println("treatList : "+ goTreatList);
		return goTreatList;
	}
	
	//로그인된 국민의 진료본 과목 목록 출력하기
	@RequestMapping(value="/government/treatList", method=RequestMethod.GET)
	public String treatSearch(HttpSession session, Model model){
		int goCitizenNo = (Integer) session.getAttribute("GOCITIZENNO");
		List<GoSearchTreatSub> treatSubjectList = goTCS.goSelectOneTreatSubject(goCitizenNo);
		model.addAttribute("treatSubjectList",treatSubjectList);
		return "/government/citizen/treat/goTreatList";
	}
	
	
	
}
