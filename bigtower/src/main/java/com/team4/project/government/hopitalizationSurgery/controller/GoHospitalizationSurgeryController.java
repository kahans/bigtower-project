package com.team4.project.government.hopitalizationSurgery.controller;

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
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.team4.project.government.hopitalizationSurgery.domain.GoHospitalization;
import com.team4.project.government.hopitalizationSurgery.domain.GoSearchHospitalizationSub;
import com.team4.project.government.hopitalizationSurgery.domain.GoSearchSurgerySub;
import com.team4.project.government.treat.controller.GoTreatController;

@RestController
public class GoHospitalizationSurgeryController {
	private static final Logger logger = LoggerFactory.getLogger(GoHospitalizationSurgeryController.class);
	private Gson gson = new Gson();
	
	@Autowired
	private GoHospitalizationSurgeryService goHSService;
	
	// 1.한진료의 수술결과(test)
	@RequestMapping(value="/government/getOneSurgeryByTreatCode", method=RequestMethod.GET,
			produces = "text/json; charset=UTF-8")
		public String getOneSurgeryByTreatCode(String treatCode, String test){
		logger.debug("1.getOneSurgeryByTreatCode GET 진입");
		String surgery = gson.toJson(goHSService.getOneSurgeryByTreatCode(treatCode));
		return surgery;
	}

	// 1.한진료의 수술결과
	@RequestMapping(value="/government/getOneSurgeryByTreatCode", method=RequestMethod.POST,
			produces = "text/json; charset=UTF-8")
		public String getOneSurgeryByTreatCode(String treatCode){
		logger.debug("1.getOneSurgeryByTreatCode POST 진입");
		String surgery = gson.toJson(goHSService.getOneSurgeryByTreatCode(treatCode));
		return surgery;
	}
	
	// 2.국민한명의 수술결과 리스트(test)
	@RequestMapping(value="/government/getListSurgeryByCitizenId", method=RequestMethod.GET,
					produces = "text/json; charset=UTF-8")
	public String getListSurgeryByCitizenId(String citizenId, String test){
		logger.debug("2.getListSurgeryByCitizenId GET 진입");
		String surgeryList = gson.toJson(goHSService.getListSurgeryByCitizenId(citizenId));
		return surgeryList;
	}
	
	// 2.국민한명의 수술결과 리스트
	@RequestMapping(value="/government/getListSurgeryByCitizenId", method=RequestMethod.POST,
					produces = "text/json; charset=UTF-8")
	public String getListSurgeryByCitizenId(String citizenId){
		logger.debug("2.getListSurgeryByCitizenId POST 진입");
		String surgeryList = gson.toJson(goHSService.getListSurgeryByCitizenId(citizenId));
		return surgeryList;
	}
	

	// 3.의사한명의 수술결과 리스트(test)
	@RequestMapping(value="/government/getListSurgeryByDoctorId", method=RequestMethod.GET,
					produces = "text/json; charset=UTF-8")
	public String getListSurgeryByDoctorId(String doctorId, String test){
		logger.debug("3.getListSurgeryByDoctorId GET 진입");
		String surgeryList = gson.toJson(goHSService.getListSurgeryByDoctorId(doctorId));
		return surgeryList;
	}
	
	// 3.의사한명의 수술결과 리스트
	@RequestMapping(value="/government/getListSurgeryByDoctorId", method=RequestMethod.POST,
					produces = "text/json; charset=UTF-8")
	public String getListSurgeryByDoctorId(String doctorId){
		logger.debug("3.getListSurgeryByDoctorId POST 진입");
		String surgeryList = gson.toJson(goHSService.getListSurgeryByDoctorId(doctorId));
		return surgeryList;
	}
	
	
	// 4.한진료의 입퇴원결과(test)
	@RequestMapping(value="/government/getOneHospitalizationByTreatCode", method=RequestMethod.GET,
			produces = "text/json; charset=UTF-8")
		public String getOneHospitalizationByTreatCode(String treatCode, String test){
		logger.debug("4.getOneHospitalizationByTreatCode GET 진입");
		String hopitalization = gson.toJson(goHSService.getOneHospitalizationByTreatCode(treatCode));
		return hopitalization;
	}
	
	// 4.한진료의 입퇴원결과
	@RequestMapping(value="/government/getOneHospitalizationByTreatCode", method=RequestMethod.POST,
			produces = "text/json; charset=UTF-8")
		public String getOneHospitalizationByTreatCode(String treatCode){
		logger.debug("4.getOneHospitalizationByTreatCode POST 진입");
		String hopitalization = gson.toJson(goHSService.getOneHospitalizationByTreatCode(treatCode));
		return hopitalization;
	}

	
	// 5.국민한명의 입퇴원결과 리스트(test)
	@RequestMapping(value="/government/getListHospitalizationByCitizenId", method=RequestMethod.GET,
					produces = "text/json; charset=UTF-8")
	public String getListHospitalizationByCitizenId(String citizenId, String test){
		logger.debug("5.getListHospitalizationByCitizenId GET 진입");
		String hopitalizationList = gson.toJson(goHSService.getListHospitalizationByCitizenId(citizenId));
		return hopitalizationList;
	}
	
	// 5.국민한명의 입퇴원결과 리스트
	@RequestMapping(value="/government/getListHospitalizationByCitizenId", method=RequestMethod.POST,
					produces = "text/json; charset=UTF-8")
	public String getListHospitalizationByCitizenId(String citizenId){
		logger.debug("5.getListHospitalizationByCitizenId POST 진입");
		String hopitalizationList = gson.toJson(goHSService.getListHospitalizationByCitizenId(citizenId));
		return hopitalizationList;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
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
		
		
		List<GoSearchSurgerySub> goSurgeryList = goHSService.goSurgeryList(returnMap);
		return goSurgeryList;
	}
	
	//수술목록 불러오기
	@RequestMapping(value="/government/surgeryList", method=RequestMethod.GET)
	public String surgeryList(HttpSession session, Model model){
		
		int citizen = (Integer) session.getAttribute("GOCITIZENNO");//로그인 세션에서 시민no를 가져온다.
		System.out.println(citizen);
		List<GoSearchSurgerySub> surgeryStatistics = goHSService.goSurgeryStatistics(citizen);//대입
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
		
		List<GoSearchHospitalizationSub> goHospitalizationList = goHSService.goHospitalizationList(returnMap);
		return goHospitalizationList;
	}
	//입,퇴원 목록
	@RequestMapping(value="/government/hospitalizationList", method=RequestMethod.GET)
	public String hospitalizationList(HttpSession session, Model model, GoHospitalization goHospitalization){
		
		int citizen = (Integer) session.getAttribute("GOCITIZENNO");//로그인 세션에서 시민no를 가져온다.
		System.out.println(citizen);
		List<GoSearchHospitalizationSub> hospitalization = goHSService.hospitalizationStatistics(citizen);//대입
		model.addAttribute("hospitalization", hospitalization);
		
		return "/government/citizen/hospitalizationSurgery/hospitalizationList";
	}
}
