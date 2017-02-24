package com.team4.project.government.vaccinationCheckup.controller;


import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.team4.project.government.vaccinationCheckup.domain.GoVaccinationCheckup;

@Controller
public class GoVaccinationCheckupController {
	private static final Logger logger = LoggerFactory.getLogger(GoVaccinationCheckupController.class);
	@Autowired
	private GoVaccinationCheckupService goVCS;
	
	
	
	
	//예방접종 결과 요청 페이지
	@RequestMapping(value="/government/vaccination", method=RequestMethod.GET)
	public String vaccinationList(){
		
		return "/government/citizen/testVaccinationCheckup/vaccination";
	}
	//예방접종 결과 목록 페이지
	@RequestMapping(value="/government/vaccination", method=RequestMethod.POST)
	public String vaccinationList(Model model, GoVaccinationCheckup govaccination, HttpSession session){
		
		
			if(session.getAttribute("GOCITIZENID").equals(null)){
				System.out.println("세션확인 : "+session.getAttribute("citizenId"));
				return "/governmnet/login";
			}else{
				
				String goCitizenId = (String) session.getAttribute("GOCITIZENID");
				govaccination.setGoCitizenId(goCitizenId);
				//여기까지
				logger.debug("백신확인 : "+govaccination.toString());
				GoVaccinationCheckup vaccination = goVCS.vaccinationList(govaccination);
				model.addAttribute("vaccination", vaccination);
				logger.debug("vaccination 확인 :" + vaccination.toString());
		
				return "/government/citizen/testVaccinationCheckup/vaccinationResult";
			}
	}
	//건강검진 결과 목록 가져오기
	@RequestMapping(value="/government/checkUp" , method=RequestMethod.GET)
	public String checkUpList(){
		
		
		return "/government/citizen/testVaccinationCheckup/checkUp";
		
	}
	
	
	//건강검진 결과 목록 가져오기
	@RequestMapping(value="/government/checkUp", method=RequestMethod.POST)
	public String checkUpList(GoVaccinationCheckup goCheckup, Model model,HttpSession session){
		logger.debug(goCheckup.toString());
		//세션 임의로 만들어서 넣어줌
		if(session.getAttribute("GOCITIZENID").equals(null)){
			logger.debug("goCitizenId 이 null일때 :" +session.getAttribute("GOCITIZENID"));
			
			return "/governmnet/login";
		}else{
			//여기까지
			System.out.println("세션확인 : "+session.getAttribute("GOCITIZENID"));
			
			String goCitizenId = (String) session.getAttribute("GOCITIZENID");
			goCheckup.setGoCitizenId(goCitizenId);
			GoVaccinationCheckup checkUp = goVCS.checkUpList(goCheckup);
			model.addAttribute("checkUp", checkUp);
			return "/government/citizen/testVaccinationCheckup/checkUpResult";	
		
		}
	}
}