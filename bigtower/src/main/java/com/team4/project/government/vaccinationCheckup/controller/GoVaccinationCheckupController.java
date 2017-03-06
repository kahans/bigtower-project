package com.team4.project.government.vaccinationCheckup.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.team4.project.government.vaccinationCheckup.domain.GoCheckup;
import com.team4.project.government.vaccinationCheckup.domain.GoVaccinationResult;

@RestController
public class GoVaccinationCheckupController {
	private static final Logger logger = LoggerFactory.getLogger(GoVaccinationCheckupController.class);
	Gson gson = new Gson();
	@Autowired
	private GoVaccinationCheckupService goVaccinationCheckupService;
	
	//treatCode를 입력받아 하나의 예방접종결과를 가져옴
	@RequestMapping(value="/government/getOneVaccinationResultByTreatCode", method=RequestMethod.POST, produces="text/json; charset=UTF-8")
	public String getOneVaccinationResult(String treatCode){
		logger.debug("treatCode를 입력받아 하나의 예방접종결과를 가져옴");
		logger.debug("매개변수 treatCode 확인 : "+treatCode);
		
		GoVaccinationResult goVaccinationResult = goVaccinationCheckupService.getOneVaccinationResult(treatCode);
		logger.debug("객체 제대로 받았는지 확인 :"+goVaccinationResult); 
		String vaccinationResult = gson.toJson(goVaccinationResult);
		
		return vaccinationResult;
	}
	
	//treatCode를 입력받아 하나의 예방접종결과를 가져오는 테스트용 메소드
	@RequestMapping(value="/government/getOneVaccinationResultByTreatCode", method=RequestMethod.GET, produces="text/json; charset=UTF-8")
	public String getOneVaccinationResult(String treatCode, String test){
		logger.debug("treatCode를 입력받아 하나의 예방접종결과를 가져옴");
		logger.debug("매개변수 treatCode 확인 : "+treatCode);
		
		GoVaccinationResult goVaccinationResult = goVaccinationCheckupService.getOneVaccinationResult(treatCode);
		logger.debug("객체 제대로 받았는지 확인 :"+goVaccinationResult); 
		String vaccinationResult = gson.toJson(goVaccinationResult);
		
		return vaccinationResult;
	}
	
	//citizenId를 입력받아 예방접종결과리스트를 가져옴
	@RequestMapping(value="/government/getListVaccinationResultByCitizenId" , method=RequestMethod.POST , produces="text/json; charset=UTF-8")
	public String getListVaccinationResult(String citizenId){
		logger.debug("citizenId를 입력받아 예방접종결과리스트를 가져옴");
		logger.debug("매개변수 citizenId 확인 : "+citizenId);
		
		List<GoVaccinationResult> goVaccinationResult = goVaccinationCheckupService.getListVaccinationResult(citizenId);
		String vaccinationResult = gson.toJson(goVaccinationResult);
		return vaccinationResult;
	}
	
	//citizenId를 입력받아 예방접종결과리스트를 가져오는 테스트용 메소드
	@RequestMapping(value="/government/getListVaccinationResultByCitizenId" , method=RequestMethod.GET , produces="text/json; charset=UTF-8")
	public String getListVaccinationResult(String citizenId, String test){
		logger.debug("citizenId를 입력받아 예방접종결과리스트를 가져옴");
		logger.debug("매개변수 citizenId 확인 : "+citizenId);
		
		List<GoVaccinationResult> goVaccinationResult = goVaccinationCheckupService.getListVaccinationResult(citizenId);
		String vaccinationResult = gson.toJson(goVaccinationResult);
		return vaccinationResult;
	}
	
	//doctorId를 입력받아 예방접종결과리스트를 가져오는 메소드
	@RequestMapping(value="/government/getListVaccinationResultByDoctorId" , method=RequestMethod.POST , produces="text/json; charset=UTF-8")
	public String getListVaccinationResultByDoctorId(String doctorId){
		logger.debug("doctorId를 입력받아 예방접종결과리스트를 가져옴");
		logger.debug("매개변수 doctorId 확인 : "+doctorId);
		
		List<GoVaccinationResult> goVaccinationResult = goVaccinationCheckupService.getListVaccinationResultByDoctorId(doctorId);
		String vaccinationResult = gson.toJson(goVaccinationResult);
		return vaccinationResult;
	}
	
	//doctorId를 입력받아 예방접종결과리스트를 가져오는 테스트용 메소드
		@RequestMapping(value="/government/getListVaccinationResultByDoctorId" , method=RequestMethod.GET , produces="text/json; charset=UTF-8")
		public String getListVaccinationResultByDoctorId(String doctorId, String test){
			logger.debug("doctorId를 입력받아 예방접종결과리스트를 가져옴");
			logger.debug("매개변수 doctorId 확인 : "+doctorId);
			
			List<GoVaccinationResult> goVaccinationResult = goVaccinationCheckupService.getListVaccinationResultByDoctorId(doctorId);
			String vaccinationResult = gson.toJson(goVaccinationResult);
			return vaccinationResult;
		}
	
	
	//treatCode를 입력받아 하나의 건강검진결과를 가져옴
	@RequestMapping(value="/government/getOneCheckupResultByTreatCode", method=RequestMethod.POST, produces="text/json; charset=UTF-8")
	public String getOneCheckupResult(String treatCode){
		logger.debug("treatCode를 입력받아 하나의 건강검진결과를 가져옴");
		logger.debug("매개변수 treatCode 확인 : "+treatCode);
		
		GoCheckup goVaccinationResult = goVaccinationCheckupService.getOneCheckupResult(treatCode);
		logger.debug("객체 제대로 받았는지 확인 :"+goVaccinationResult); 
		String CheckupResult = gson.toJson(goVaccinationResult);
		
		return CheckupResult;
	}
	
	//treatCode를 입력받아 하나의 건강검진결과를 가져옴 테스트용
	@RequestMapping(value="/government/getOneCheckupResultByTreatCode", method=RequestMethod.GET, produces="text/json; charset=UTF-8")
	public String getOneCheckupResult(String treatCode, String test){
		logger.debug("treatCode를 입력받아 하나의 건강검진결과를 가져옴");
		logger.debug("매개변수 treatCode 확인 : "+treatCode);
		
		GoCheckup goCheckupResult = goVaccinationCheckupService.getOneCheckupResult(treatCode);
		logger.debug("객체 제대로 받았는지 확인 :"+goCheckupResult); 
		String CheckupResult = gson.toJson(goCheckupResult);
		
		return CheckupResult;
	}
	
	//citizenId를 입력받아 건강검진결과리스트 가져옴
	@RequestMapping(value="/government/getListCheckupResultByCitizenId", method=RequestMethod.POST, produces="text/json; charset=UTF-8")
	public String getListCheckupResult(String citizenId){
		logger.debug("treatCode를 입력받아 건강검진결과리스트를 가져옴");
		logger.debug("매개변수 treatCode 확인 : "+citizenId);
		
		List<GoCheckup> goCheckupResult = goVaccinationCheckupService.getListCheckupResult(citizenId);
		logger.debug("객체 제대로 받았는지 확인 :"+goCheckupResult); 
		String CheckupResult = gson.toJson(goCheckupResult);
		return CheckupResult;
	}
	
	//citizenId를 입력받아 건강검진결과리스트 가져오는 테스트용 메소드
	@RequestMapping(value="/government/getListCheckupResultByCitizenId", method=RequestMethod.GET, produces="text/json; charset=UTF-8")
	public String getListCheckupResult(String citizenId, String test){
		logger.debug("treatCode를 입력받아 건강검진결과리스트를 가져옴");
		logger.debug("매개변수 treatCode 확인 : "+citizenId);
		
		List<GoCheckup> goCheckupResult = goVaccinationCheckupService.getListCheckupResult(citizenId);
		logger.debug("객체 제대로 받았는지 확인 :"+goCheckupResult); 
		String CheckupResult = gson.toJson(goCheckupResult);
		return CheckupResult;
	}
	
	
	//doctorId를 입력받아 건강검진결과리스트 가져옴
	@RequestMapping(value="/government/getListCheckupResultByDoctorId", method=RequestMethod.POST, produces="text/json; charset=UTF-8")
	public String getListCheckupResultByDoctorId(String doctorId){
		logger.debug("doctorId를 입력받아 건강검진결과리스트를 가져옴");
		logger.debug("매개변수 doctorId 확인 : "+doctorId);
		
		List<GoCheckup> goCheckupResult = goVaccinationCheckupService.getListCheckupResultByDoctorId(doctorId);
		logger.debug("객체 제대로 받았는지 확인 :"+goCheckupResult); 
		String CheckupResult = gson.toJson(goCheckupResult);
		return CheckupResult;
	}
	
	//doctorId를 입력받아 건강검진결과리스트 가져옴 테스트용 메소드
	@RequestMapping(value="/government/getListCheckupResultByDoctorId", method=RequestMethod.GET, produces="text/json; charset=UTF-8")
	public String getListCheckupResultByDoctorId(String doctorId,String test){
		logger.debug("doctorId를 입력받아 건강검진결과리스트를 가져옴");
		logger.debug("매개변수 doctorId 확인 : "+doctorId);
		
		List<GoCheckup> goCheckupResult = goVaccinationCheckupService.getListCheckupResultByDoctorId(doctorId);
		logger.debug("객체 제대로 받았는지 확인 :"+goCheckupResult); 
		String CheckupResult = gson.toJson(goCheckupResult);
		return CheckupResult;
	}
	
}