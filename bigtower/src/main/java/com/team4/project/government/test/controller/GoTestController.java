package com.team4.project.government.test.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.google.gson.Gson;
import com.team4.project.government.test.domain.GoBloodTest;
import com.team4.project.government.test.domain.GoImageTest;

@Controller
public class GoTestController {
	Gson gson = new Gson();
	private static final Logger logger = LoggerFactory.getLogger(GoTestController.class);

	@Autowired
	private GoTestService goTestService;
	
	
	//혈액검사 조회하는 페이지로 이동
	@RequestMapping(value="/government/searchBloodTest", method=RequestMethod.GET)
	public String moveBloodTestSearchForm(){
		return "/hospital/views/government/gov_searchBloodTestForm";
	}

	//treatCode 사용하여 혈액검사결과 하나 조회
	@RequestMapping(value="/government/getOneBloodTestResultByTreatCode", method=RequestMethod.POST , produces = "text/json; charset=UTF-8")
	public String getOneBloodTestResult(String treatCode, Model model){
		logger.debug("controller 에 매개변수로 받은 treatCode 확인 :"+treatCode);
		//treatCode를 사용하여 혈액검사결과 조회
		GoBloodTest getOneBloodTest = goTestService.getOneBloodTestResult(treatCode);
		logger.debug("getBloodTest 확인 : "+getOneBloodTest);
		
		model.addAttribute("getBloodTest", getOneBloodTest);
	
		return "/hospital/views/government/gov_bloodTestResult";
	}
	

	//citizenId 사용하여 혈액검사결과리스트 조회
	@RequestMapping(value="/government/getListBloodTestResultByCitizenId" , method=RequestMethod.POST,  produces = "text/json; charset=UTF-8")
	public String getListBloodTestResult(String citizenId, Model model){
		logger.debug("controller 에 매개변수로 받은 citizenId 확인 :"+citizenId);
		//citizenId를 사용하여 혈액검사결과 조회
		List<GoBloodTest> getListBloodTestResult = goTestService.getListBloodTestResult(citizenId);
		logger.debug("goBloodTest 확인 : "+getListBloodTestResult);
		
		model.addAttribute("getBloodTest", getListBloodTestResult);
		
		return "/hospital/views/government/gov_listBloodTestResult";
	}
	
	//의사코드로 혈액검사결과리스트 조회
	@RequestMapping(value="/government/getListBloodTestResultByDoctorId", method=RequestMethod.POST, produces="text/json; charset=UTF-8")
	public String getListBloodTestResultByDocotrId(String doctorId, Model model){
		logger.debug("controller 에 매개변수로 받은 doctorId 확인 :"+doctorId);
		List<GoBloodTest> getListBloodTestResult = goTestService.getListBloodTestResultByDoctorId(doctorId);
		logger.debug("goBloodTest 확인 : "+getListBloodTestResult);
		
		model.addAttribute("getBloodTest", getListBloodTestResult);
		
		return "/hospital/views/government/gov_listBloodTestResult";
	}
	

	
	//영상검사 조회하는 페이지로 이동
		@RequestMapping(value="/government/searchMediaTest", method=RequestMethod.GET)
		public String moveMediaTestSearchForm(){
			return "/hospital/views/government/gov_searchMediaTestForm";
		}

	
	
	
	//treatCode를 사용하여 이미지테스트 결과 하나 받아옴
	@RequestMapping(value="/government/getOneImageTestResultByTreatCode" , method=RequestMethod.POST, produces="text/json; charset=UTF-8")
	public String getOneImageTestResult(String treatCode, Model model){
		logger.debug("controller 에 매개변수로 받은 treatCode 확인 :"+treatCode);
		//treatCode를 사용하여 영상검사결과를 받아옴
		GoImageTest getMediaTest = goTestService.getOneImageTestResult(treatCode);
		logger.debug("getMediaTest 확인 : "+getMediaTest);
		//영상검사결과를 json타입으로 변형		
		model.addAttribute("getMediaTest", getMediaTest);
	return "/hospital/views/government/gov_mediaTestResult";
		
	}
	
	
	//citizenId를 사용하여 영상검사결과리스트 조회
	@RequestMapping(value="/government/getListImageTestResultByCitizenId" , method=RequestMethod.POST, produces="text/json; charset=UTF-8")
	public String getListImageTestResult(String citizenId, Model model){
		
		logger.debug("controller 에 매개변수로 받은 treatCode 확인 :"+citizenId);
		//citizenId를 사용하여 영상검사결과를 받아옴
		List<GoImageTest> getMediaTest = goTestService.getListImageTestResult(citizenId);
		logger.debug("getMediaTest 확인 : "+getMediaTest);
		//영상검사결과를 json타입으로 변형		
		model.addAttribute("getMediaTest", getMediaTest);
	return "/hospital/views/government/gov_listMediaTestResult";
	}
	
	
	//doctorId로 영상검사결과리스트 조회
	@RequestMapping(value="/government/getListImageTestResultByDoctorId", method=RequestMethod.POST, produces="text/json; charset=UTF-8")
	public String getListImageTestResultByDoctorId(String doctorId, Model model){
		logger.debug("controller 에 매개변수로 받은 doctorId 확인 :"+doctorId);
		//doctorId를 사용하여 영상검사결과를 받아옴
		List<GoImageTest> getMediaTest = goTestService.getListImageTestResultByDoctorId(doctorId);
		logger.debug("getMediaTest 확인 : "+getMediaTest);
		//영상검사결과를 json타입으로 변형		
		model.addAttribute("getMediaTest", getMediaTest);		
	return "/hospital/views/government/gov_listMediaTestResult";
	}
	
	
}
