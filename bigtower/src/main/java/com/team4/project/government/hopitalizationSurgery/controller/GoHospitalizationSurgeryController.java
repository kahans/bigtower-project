package com.team4.project.government.hopitalizationSurgery.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.team4.project.government.hopitalizationSurgery.domain.GoHospitalization;
import com.team4.project.government.hopitalizationSurgery.domain.GoSearchHospitalizationSub;
import com.team4.project.government.hopitalizationSurgery.domain.GoSearchSurgerySub;

@Controller
public class GoHospitalizationSurgeryController {

	@Autowired
	private GoHospitalizationSurgeryService goHSS;
	//수술 뷰검색
	@RequestMapping(value="/government/surgerySearch", method=RequestMethod.POST)
	public @ResponseBody List<GoSearchSurgerySub> surgeryList(HttpSession session, Model model,
										@RequestParam(value="searchContents", required=false)String searchContents,
										@RequestParam(value="secondDate", required=false)String secondDate,
										@RequestParam(value="firstDate", required=false)String firstDate
										){
		System.out.println(searchContents);
		System.out.println("Today: "+secondDate);
		System.out.println("yastday : "+firstDate);		
		
		String citizen = (String) session.getAttribute("GOCITIZENID");//로그인세션	
		
		
		Map<String ,Object> returnMap = new HashMap<String, Object>();
		returnMap.put("searchContents", searchContents);		
		returnMap.put("firstDate", firstDate);
		returnMap.put("secondDate", secondDate);
		returnMap.put("citizen", citizen);
		
		System.out.println("service : "+returnMap.put("searchContents", searchContents));
		System.out.println("test1 : "+(String)returnMap.get("firstDate"));
		System.out.println("test : "+secondDate);
		
		
		List<GoSearchSurgerySub> goSurgeryList = goHSS.goSurgeryList(returnMap);
		return goSurgeryList;
	}
	
	//수술목록 불러오기
	@RequestMapping(value="/government/surgeryList", method=RequestMethod.GET)
	public String surgeryList(HttpSession session, Model model){
		
		int citizen = (Integer) session.getAttribute("GOCITIZENNO");//로그인 세션에서 시민no를 가져온다.
		System.out.println(citizen);
		List<GoSearchSurgerySub> surgeryStatistics = goHSS.goSurgeryStatistics(citizen);//대입
		model.addAttribute("surgeryStatistics", surgeryStatistics);
		
		
		return "/government/citizen/hospitalizationSurgery/surgeryList";
	}
	
	
	
	//입,퇴원 검색
	@RequestMapping(value="/government/hospitalizationSearch", method=RequestMethod.POST)
	public @ResponseBody List<GoSearchHospitalizationSub> hospitalizationList(HttpSession session, Model model,
							@RequestParam(value="searchContents", required=false)String searchContents,
							@RequestParam(value="secondDate", required=false)String secondDate,
							@RequestParam(value="firstDate", required=false)String firstDate){
		
		//GO_CITIZEN_ID 아이디 로그인
		String citizen = (String) session.getAttribute("GOCITIZENID");
		
		
		Map<String ,Object> returnMap = new HashMap<String, Object>();		
		returnMap.put("searchContents", searchContents);
		returnMap.put("secondDate", secondDate);
		returnMap.put("firstDate", firstDate);
		returnMap.put("citizen", citizen);
		
		System.out.println("service : "+returnMap.put("searchContents", searchContents));
		
		List<GoSearchHospitalizationSub> goHospitalizationList = goHSS.goHospitalizationList(returnMap);
		return goHospitalizationList;
	}
	//입,퇴원 목록
	@RequestMapping(value="/government/hospitalizationList", method=RequestMethod.GET)
	public String hospitalizationList(HttpSession session, Model model, GoHospitalization goHospitalization){
		
		int citizen = (Integer) session.getAttribute("GOCITIZENNO");//로그인 세션에서 시민no를 가져온다.
		System.out.println(citizen);
		List<GoSearchHospitalizationSub> hospitalization = goHSS.hospitalizationStatistics(citizen);//대입
		model.addAttribute("hospitalization", hospitalization);
		
		return "/government/citizen/hospitalizationSurgery/hospitalizationList";
	}
}
