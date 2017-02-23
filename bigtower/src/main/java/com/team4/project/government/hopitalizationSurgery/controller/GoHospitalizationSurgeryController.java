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
import com.team4.project.government.hopitalizationSurgery.domain.GoSearchSurgerySub;
import com.team4.project.util.Util;

@Controller
public class GoHospitalizationSurgeryController {

	@Autowired
	private GoHospitalizationSurgeryService goHSS;
	//수술 뷰검색
	@RequestMapping(value="/government/surgerySearch", method=RequestMethod.GET)
	public @ResponseBody List<GoSearchSurgerySub> surgeryList(
										@RequestParam(value="searchContents", required=false)String searchContents,
										@RequestParam(value="secondDate", required=false)String secondDate,
										@RequestParam(value="firstDate", required=false)String firstDate
										){
		System.out.println(searchContents);
		//util에서 뷰에서받은 날짜 데이터를 uitl클래스로 호출을 한다.
		System.out.println("Today: "+secondDate);
		System.out.println("yastday : "+firstDate);
		
		Map<String, Object> test = Util.createDate(firstDate, secondDate);
		
		String secontDate02 = (String)test.get("secondDate");
		String firstDate02 = (String)test.get("firstDate");
		Map<String ,Object> returnMap = new HashMap<String, Object>();
		returnMap.put("searchContents", searchContents);
		
		returnMap.put("firstDate", firstDate02);
		returnMap.put("secondDate", secontDate02);
		
		System.out.println("service : "+returnMap.put("searchContents", searchContents));
		System.out.println("test1 : "+(String)returnMap.get("firstDate"));
		System.out.println("test : "+secontDate02);
		
		
		List<GoSearchSurgerySub> goSurgeryList = goHSS.goSurgeryList(returnMap);
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
