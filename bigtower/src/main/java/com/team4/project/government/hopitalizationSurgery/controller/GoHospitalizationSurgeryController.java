package com.team4.project.government.hopitalizationSurgery.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.team4.project.government.hopitalizationSurgery.domain.GoHospitalization;
import com.team4.project.government.hopitalizationSurgery.domain.GoSurgery;

@Controller
public class GoHospitalizationSurgeryController {

	@Autowired
	private GoHospitalizationSurgeryService goHSS;
	//수술 뷰검색
	@RequestMapping(value="/government/surgerySearch", method=RequestMethod.GET)
	public @ResponseBody List<GoSurgery> surgeryList(@RequestParam(value="selectBox") String selectBox,
										@RequestParam(value="searchContents", required=false)String searchContents,
										@RequestParam(value="todayDate", required=false)String todayDate,
										@RequestParam(value="PreviousDate", required=false)String PreviousDate){
		System.out.println("search : "+selectBox+", "+searchContents);
		
		
		Map<String ,Object> returnMap = new HashMap<String, Object>();
		returnMap.put("selectBox", selectBox);
		returnMap.put("searchContents", searchContents);
		returnMap.put("todayDate", todayDate);
		returnMap.put("PreviousDate", PreviousDate);
		System.out.println("service : "+returnMap.put("selectBox", selectBox));
		System.out.println("service : "+returnMap.put("searchContents", searchContents));
		
		List<GoSurgery> goSurgeryList = goHSS.goSurgeryList(returnMap);
		return goSurgeryList;
	}
	//수술목록 불러오기
	@RequestMapping(value="/government/surgeryList", method=RequestMethod.GET)
	public String surgeryList(){
		
		//model.addAttribute("goSurgery", goHSS.goSurgeryList());
		return "/government/citizen/hospitalizationSurgery/surgeryList";
	}
	
	
	
	//입,퇴원 검색
	@RequestMapping(value="/government/hospitalizationSearch", method=RequestMethod.GET)
	public @ResponseBody List<GoHospitalization> hospitalizationList(
							@RequestParam(value="selectBox") String selectBox,
							@RequestParam(value="searchContents", required=false)String searchContents,
							@RequestParam(value="toDay", required=false)String toDay,
							@RequestParam(value="firstDay", required=false)String firstDay){
		Map<String ,Object> returnMap = new HashMap<String, Object>();
		returnMap.put("selectBox", selectBox);
		returnMap.put("searchContents", searchContents);
		returnMap.put("toDay", toDay);
		returnMap.put("firstDay", firstDay);
		System.out.println("service : "+returnMap.put("selectBox", selectBox));
		System.out.println("service : "+returnMap.put("searchContents", searchContents));
		
		List<GoHospitalization> goHospitalizationList = goHSS.goHospitalizationList(returnMap);
		return goHospitalizationList;
	}
	//입,퇴원 목록
	@RequestMapping(value="/government/hospitalizationList", method=RequestMethod.GET)
	public String hospitalizationList(Model model, GoHospitalization goHospitalization){
		
		return "/government/citizen/hospitalizationSurgery/hospitalizationList";
	}
}
