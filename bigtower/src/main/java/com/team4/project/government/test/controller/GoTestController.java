package com.team4.project.government.test.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.team4.project.government.test.domain.GoBloodTest;
import com.team4.project.government.test.domain.GoImageTest;

@RestController
public class GoTestController {
	Gson gson = new Gson();
	private static final Logger logger = LoggerFactory.getLogger(GoTestController.class);

	@Autowired
	private GoTestService goTestService;
	
	//treatCode 사용하여 혈액검사결과 하나 조회
	@RequestMapping(value="/government/getOneBloodTestResultByTreatCode", method=RequestMethod.POST , produces = "text/json; charset=UTF-8")
	public String getOneBloodTestResult(String treatCode){
		logger.debug("controller 에 매개변수로 받은 treatCode 확인 :"+treatCode);
		//treatCode를 사용하여 혈액검사결과 조회
		GoBloodTest goBloodTest = goTestService.getOneBloodTestResult(treatCode);
		logger.debug("goBloodTest 확인 : "+goBloodTest);
		//혈액검사결과를 json타입으로 바꿔줌
		String bloodTestResult = gson.toJson(goBloodTest);
		System.out.println("혈액검사결과 확인 : "+bloodTestResult);
		//String 타입의 json 객체를 리턴시킴
		return bloodTestResult;
	}
	
	//혈액검사결과를 하나 받아오는 test용 메소드(GET방식으로 값을 직접 넣어줘 확인)
	@RequestMapping(value="/government/getOneBloodTestResultByTreatCode", method=RequestMethod.GET , produces = "text/json; charset=UTF-8")
	public String getOneBloodTestResult(String treatCode, String test){
		logger.debug("controller 에 매개변수로 받은 treatCode 확인 :"+treatCode);
		//treatCode를 사용하여 혈액검사결과 조회
		GoBloodTest goBloodTest = goTestService.getOneBloodTestResult(treatCode);
		logger.debug("goBloodTest 확인 : "+goBloodTest);
		//혈액검사결과를 json타입으로 바꿔줌
		String bloodTestResult = gson.toJson(goBloodTest);
		System.out.println("혈액검사결과 확인 : "+bloodTestResult);
		//String 타입의 json 객체를 리턴시킴
		return bloodTestResult;
	}
	
	//citizenId 사용하여 혈액검사결과리스트 조회
	@RequestMapping(value="/government/getListBloodTestResultByCitizenId" , method=RequestMethod.POST,  produces = "text/json; charset=UTF-8")
	public String getListBloodTestResult(String citizenId){
		logger.debug("controller 에 매개변수로 받은 citizenId 확인 :"+citizenId);
		//citizenId를 사용하여 혈액검사결과 조회
		List<GoBloodTest> getListBloodTestResult = goTestService.getListBloodTestResult(citizenId);
		logger.debug("goBloodTest 확인 : "+getListBloodTestResult);
		//혈액검사결과리스트를 json타입으로 바꿔줌
		String bloodTestResult = gson.toJson(getListBloodTestResult);
		System.out.println("혈액검사결과 확인 : "+bloodTestResult);
		//String 타입의 json 객체를 리턴시킴
		return bloodTestResult;
	}
	
	//citizenId로 혈액검사리스트를 조회하는 테스트용 메소드 (GET방식으로 값을 직접 넣어줘 확인)
	@RequestMapping(value="/government/getListBloodTestResultByCitizenId" , method=RequestMethod.GET,  produces = "text/json; charset=UTF-8")
	public String getListBloodTestResult(String citizenId , String test){
		logger.debug("controller 에 매개변수로 받은 citizenId 확인 :"+citizenId);
		//citizenId를 사용하여 혈액검사결과 조회
		List<GoBloodTest> getListBloodTestResult = goTestService.getListBloodTestResult(citizenId);
		logger.debug("goBloodTest 확인 : "+getListBloodTestResult);
		//혈액검사결과리스트를 json타입으로 바꿔줌
		String bloodTestResult = gson.toJson(getListBloodTestResult);
		System.out.println("혈액검사결과 확인 : "+bloodTestResult);
		//String 타입의 json 객체를 리턴시킴
		return bloodTestResult;
	}
	
	//의사코드로 혈액검사결과리스트 조회
	@RequestMapping(value="/government/getListBloodTestResultByDoctorId", method=RequestMethod.POST, produces="text/json; charset=UTF-8")
	public String getListBloodTestResultByDocotrId(String doctorId){
		logger.debug("controller 에 매개변수로 받은 doctorId 확인 :"+doctorId);
		List<GoBloodTest> getListBloodTestResult = goTestService.getListBloodTestResultByDoctorId(doctorId);
		logger.debug("goBloodTest 확인 : "+getListBloodTestResult);
		String bloodTestResult = gson.toJson(getListBloodTestResult);
		System.out.println("혈액검사결과 확인 : "+bloodTestResult);
		//String 타입의 json 객체를 리턴시킴
		return bloodTestResult;
	}
	
	//의사코드로 혈액검사결과 리스트 조회 테스트용 메소드
	@RequestMapping(value="/government/getListBloodTestResultByDoctorId", method=RequestMethod.GET, produces="text/json; charset=UTF-8")
	public String getListBloodTestResultByDocotrId(String doctorId, String test){
		logger.debug("controller 에 매개변수로 받은 doctorId 확인 :"+doctorId);
		List<GoBloodTest> getListBloodTestResult = goTestService.getListBloodTestResultByDoctorId(doctorId);
		logger.debug("goBloodTest 확인 : "+getListBloodTestResult);
		String bloodTestResult = gson.toJson(getListBloodTestResult);
		System.out.println("혈액검사결과 확인 : "+bloodTestResult);
		//String 타입의 json 객체를 리턴시킴
		return bloodTestResult;
	}
	
	/*//json type으로 혈액검사 요청한것을 받아보겠다.(테스트용)
	@RequestMapping(value="/getJson" , method=RequestMethod.GET)
	public String getJson(Map<String, String> map){
		HttpUrlCon http = new HttpUrlCon("http://localhost/project/government/getListBloodTestResult");
		 try {
			
			String jsonString = http.HttpUrlPOST(map);
			System.out.println("jsonString : "+jsonString);
			
		
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}*/
	
	//treatCode를 사용하여 이미지테스트 결과 하나 받아옴
	@RequestMapping(value="/government/getOneImageTestResultByTreatCode" , method=RequestMethod.POST, produces="text/json; charset=UTF-8")
	public String getOneImageTestResult(String treatCode){
		logger.debug("controller 에 매개변수로 받은 treatCode 확인 :"+treatCode);
		//treatCode를 사용하여 영상검사결과를 받아옴
		GoImageTest goImageTestResult = goTestService.getOneImageTestResult(treatCode);
		logger.debug("goImageTestResult 확인 : "+goImageTestResult);
		//영상검사결과를 json타입으로 변형		
		String imageTestResult =gson.toJson(goImageTestResult);
		logger.debug("imageTestResult 확인 : "+imageTestResult);			
	return imageTestResult;
		
	}
	
	//treatCode를 사용하여 이미지테스트 결과 하나 받아옴(테스트용)
	@RequestMapping(value="/government/getOneImageTestResultByTreatCode" , method=RequestMethod.GET, produces="text/json; charset=UTF-8")
	public String getOneImageTestResult(String treatCode, String test){
		
		logger.debug("controller 에 매개변수로 받은 treatCode 확인 :"+treatCode);			
		//treatCode를 사용하여 영상검사결과를 받아옴
		GoImageTest goImageTestResult = goTestService.getOneImageTestResult(treatCode);
		logger.debug("goImageTestResult 확인 : "+goImageTestResult);
		//영상검사결과를 json타입으로 변형			
		String imageTestResult =gson.toJson(goImageTestResult);
		logger.debug("imageTestResult 확인 : "+imageTestResult);				
	return imageTestResult;
		
	}
	
	//citizenId를 사용하여 영상검사결과리스트 조회
	@RequestMapping(value="/government/getListImageTestResultByCitizenId" , method=RequestMethod.POST, produces="text/json; charset=UTF-8")
	public String getListImageTestResult(String citizenId){
		
		logger.debug("controller 에 매개변수로 받은 treatCode 확인 :"+citizenId);
		//citizenId를 사용하여 영상검사결과를 받아옴
		List<GoImageTest> goImageTestResult = goTestService.getListImageTestResult(citizenId);
		logger.debug("goImageTestResult 확인 : "+goImageTestResult);
		//영상검사결과를 json타입으로 변형		
		String imageTestResult =gson.toJson(goImageTestResult);
		logger.debug("imageTestResult 확인 : "+imageTestResult);			
	return imageTestResult;
	}
	
	//citizenId를 사용하여 영상검사결과리스트 조회(테스트용)
	@RequestMapping(value="/government/getListImageTestResultByCitizenId" , method=RequestMethod.GET , produces="text/json; charset=UTF-8")
	public String getListImageTestResult(String citizenId, String test){
		
		logger.debug("controller 에 매개변수로 받은 treatCode 확인 :"+citizenId);
		//test로 세팅된 citizenId 확인
		logger.debug("test citizenId : "+citizenId);
		//citizenId를 사용하여 영상검사결과리스트를 받아옴
		List<GoImageTest> goImageTestResult = goTestService.getListImageTestResult(citizenId);
		logger.debug("goImageTestResult 확인 : "+goImageTestResult);
		//영상검사결과리스트를 json타입으로 변형			
		String imageTestResult =gson.toJson(goImageTestResult);
		logger.debug("imageTestResult 확인 : "+imageTestResult);				
	return imageTestResult;
	}
	
	//doctorId로 영상검사결과리스트 조회
	@RequestMapping(value="/government/getListImageTestResultByDoctorId", method=RequestMethod.POST, produces="text/json; charset=UTF-8")
	public String getListImageTestResultByDoctorId(String doctorId){
		logger.debug("controller 에 매개변수로 받은 doctorId 확인 :"+doctorId);
		//doctorId를 사용하여 영상검사결과를 받아옴
		List<GoImageTest> goImageTestResult = goTestService.getListImageTestResultByDoctorId(doctorId);
		logger.debug("goImageTestResult 확인 : "+goImageTestResult);
		//영상검사결과를 json타입으로 변형		
		String imageTestResult =gson.toJson(goImageTestResult);
		logger.debug("imageTestResult 확인 : "+imageTestResult);			
	return imageTestResult;
	}
	
	//doctorId로 영상검사결과리스트 조회 테스트용
							
	@RequestMapping(value="/government/getListImageTestResultByDoctorId", method=RequestMethod.GET, produces="text/json; charset=UTF-8")
	public String getListImageTestResultByDoctorId(String doctorId, String test){
		logger.debug("controller 에 매개변수로 받은 doctorId 확인 :"+doctorId);
		//doctorId를 사용하여 영상검사결과를 받아옴
		List<GoImageTest> goImageTestResult = goTestService.getListImageTestResultByDoctorId(doctorId);
		logger.debug("goImageTestResult 확인 : "+goImageTestResult);
		//영상검사결과를 json타입으로 변형		
		String imageTestResult =gson.toJson(goImageTestResult);
		logger.debug("imageTestResult 확인 : "+imageTestResult);			
	return imageTestResult;
	}
	
	/*//json type으로 영상검사 요청한것을 받아보겠다.(테스트용)
	@RequestMapping(value="/getJson" , method=RequestMethod.GET)
	public String getJson(Map<String, String> map){
		HttpUrlCon http = new HttpUrlCon("http://localhost/project/government/getListImageTestResult");
		 try {
			
			String jsonString = http.HttpUrlPOST(map);
			System.out.println("jsonString : "+jsonString);
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}*/
	
	
}
