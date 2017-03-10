package com.team4.project.government.vaccinationCheckup.controller;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.google.gson.Gson;
import com.team4.project.government.vaccinationCheckup.domain.GoCheckup;
import com.team4.project.government.vaccinationCheckup.domain.GoVaccinationResult;

@Controller
public class GoVaccinationCheckupController {
	private static final Logger logger = LoggerFactory.getLogger(GoVaccinationCheckupController.class);
	Gson gson = new Gson();
	@Autowired
	private GoVaccinationCheckupService goVaccinationCheckupService;
	
	//treatCode를 입력받아 하나의 예방접종결과를 가져옴
	@RequestMapping(value="/government/getOneVaccinationResultByTreatCode", method=RequestMethod.POST, produces="text/json; charset=UTF-8")
	public String getOneVaccinationResult(HttpSession session, String treatCode, Model model){
		String doctorId = (String) session.getAttribute("DOCTORID");
		logger.debug("treatCode를 입력받아 하나의 예방접종결과를 가져옴");
		logger.debug("매개변수 treatCode 확인 : "+treatCode);
		
		GoVaccinationResult goVaccinationResult = goVaccinationCheckupService.getOneVaccinationResult(treatCode, doctorId);
		logger.debug("객체 제대로 받았는지 확인 :"+goVaccinationResult); 
		model.addAttribute("goVaccinationResult",goVaccinationResult);
		
		return "/hospital/views/government/gov_vaccineResult";
	}
	
	//citizenId를 입력받아 예방접종결과리스트를 가져옴
	@RequestMapping(value="/government/getListVaccinationResultByCitizenId" , method=RequestMethod.POST , produces="text/json; charset=UTF-8")
	public String getListVaccinationResult(Model model, HttpSession session, String citizenId){
		String doctorId = (String) session.getAttribute("DOCTORID");
		logger.debug("citizenId를 입력받아 예방접종결과리스트를 가져옴");
		logger.debug("매개변수 citizenId 확인 : "+citizenId);
		
		List<GoVaccinationResult> goVaccinationResult = goVaccinationCheckupService.getListVaccinationResult(citizenId, doctorId);
		model.addAttribute("goVaccinationResult",goVaccinationResult);
		return "/hospital/views/government/gov_vaccineResult";
	}
	
	//doctorId를 입력받아 예방접종결과리스트를 가져오는 메소드
	@RequestMapping(value="/government/getListVaccinationResultByDoctorId" , method=RequestMethod.POST , produces="text/json; charset=UTF-8")
	public String getListVaccinationResultByDoctorId(Model model, String doctorId){
		logger.debug("doctorId를 입력받아 예방접종결과리스트를 가져옴");
		logger.debug("매개변수 doctorId 확인 : "+doctorId);
		
		List<GoVaccinationResult> goVaccinationResult = goVaccinationCheckupService.getListVaccinationResultByDoctorId(doctorId);
		model.addAttribute("goVaccinationResult",goVaccinationResult);
		return "/hospital/views/government/gov_vaccineResult";
	}
	
	//treatCode를 입력받아 하나의 건강검진결과를 가져옴
	@RequestMapping(value="/government/getOneCheckupResultByTreatCode", method=RequestMethod.POST, produces="text/json; charset=UTF-8")
	public String getOneCheckupResult(Model model, HttpSession session, String treatCode){
		String doctorId = (String) session.getAttribute("DOCTORID");
		logger.debug("treatCode를 입력받아 하나의 건강검진결과를 가져옴");
		logger.debug("매개변수 treatCode 확인 : "+treatCode);
		
		GoCheckup goCheckupResult = goVaccinationCheckupService.getOneCheckupResult(treatCode, doctorId);
		logger.debug("객체 제대로 받았는지 확인 :"+goCheckupResult); 
		model.addAttribute("goVaccinationResult",goCheckupResult);
		
		return "/hospital/views/government/gov_vaccineResult";
	}
	
	//citizenId를 입력받아 건강검진결과리스트 가져옴
	@RequestMapping(value="/government/getListCheckupResultByCitizenId", method=RequestMethod.POST, produces="text/json; charset=UTF-8")
	public String getListCheckupResult(Model model, HttpSession session, String citizenId){
		String doctorId = (String) session.getAttribute("DOCTORID");
		logger.debug("treatCode를 입력받아 건강검진결과리스트를 가져옴");
		logger.debug("매개변수 treatCode 확인 : "+citizenId);
		
		List<GoCheckup> goCheckupResult = goVaccinationCheckupService.getListCheckupResult(citizenId, doctorId);
		logger.debug("객체 제대로 받았는지 확인 :"+goCheckupResult); 
		model.addAttribute("goVaccinationResult",goCheckupResult);
		return "/hospital/views/government/gov_vaccineResult";
	}
	
	//doctorId를 입력받아 건강검진결과리스트 가져옴
	@RequestMapping(value="/government/getListCheckupResultByDoctorId", method=RequestMethod.POST, produces="text/json; charset=UTF-8")
	public String getListCheckupResultByDoctorId(Model model, String doctorId){
		logger.debug("doctorId를 입력받아 건강검진결과리스트를 가져옴");
		logger.debug("매개변수 doctorId 확인 : "+doctorId);
		
		List<GoCheckup> goCheckupResult = goVaccinationCheckupService.getListCheckupResultByDoctorId(doctorId);
		logger.debug("객체 제대로 받았는지 확인 :"+goCheckupResult); 
		model.addAttribute("goVaccinationResult",goCheckupResult);
		return "/hospital/views/government/gov_vaccineResult";
	}
	
}