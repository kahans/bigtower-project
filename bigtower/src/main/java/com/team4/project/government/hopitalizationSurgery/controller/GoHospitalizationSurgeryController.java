package com.team4.project.government.hopitalizationSurgery.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.team4.project.government.hopitalizationSurgery.domain.GoHospitalization;
import com.team4.project.government.hopitalizationSurgery.domain.GoSurgeryResult;

@Controller
public class GoHospitalizationSurgeryController {
	private static final Logger logger = LoggerFactory.getLogger(GoHospitalizationSurgeryController.class);
	private Gson gson = new Gson();
	
	@Autowired
	private GoHospitalizationSurgeryService goHSService;
	
	//수술 조회하는 뷰
	@RequestMapping(value="/government/searchSurgeryForm")
	public String searchSurgery(){
		
		return "/hospital/views/government/gov_searchSurgeryForm";
	}
	
	//입원 조회
	@RequestMapping(value="/government/searchHospitalization")
	public String searchHospitalization(){
		return "/hospital/views/government/gov_searchHospitalizationForm";
	}
	
	// 1.한진료의 수술결과
	@RequestMapping(value="/government/getOneSurgeryByTreatCode", method=RequestMethod.POST,
			produces = "text/json; charset=UTF-8")
		public String getOneSurgeryByTreatCode(HttpSession session, String treatCode, Model model){
		String doctorId = (String) session.getAttribute("DOCTORID");
		logger.debug("1.getOneSurgeryByTreatCode POST 진입");
		GoSurgeryResult surgery = goHSService.getOneSurgeryByTreatCode(treatCode, doctorId);
		model.addAttribute("getSurgery", surgery);
		return "/hospital/views/government/surgery/gov_surgeryTestResult";
	}
	
	// 2.국민한명의 수술결과 리스트
	@RequestMapping(value="/government/getListSurgeryByCitizenId", method=RequestMethod.GET,
					produces = "text/json; charset=UTF-8")
	public String getListSurgeryByCitizenId(HttpSession session, String citizenId, Model model){
		String doctorId = (String) session.getAttribute("DOCTORID");
		logger.debug("2.getListSurgeryByCitizenId POST 진입");
		List<GoSurgeryResult> surgeryList = goHSService.getListSurgeryByCitizenId(citizenId, doctorId);
		model.addAttribute("surgeryList", surgeryList);
		model.addAttribute("citizenId", citizenId);
		return "/hospital/views/government/surgery/gov_listSurgeryResult";
	}
	
	/*
	// 3.의사한명의 수술결과 리스트
	@RequestMapping(value="/government/getListSurgeryByDoctorId", method=RequestMethod.POST,
					produces = "text/json; charset=UTF-8")
	public String getListSurgeryByDoctorId(String doctorId, Model model){
		
		logger.debug("3.getListSurgeryByDoctorId POST 진입");
		List<GoSurgeryResult> surgeryList = goHSService.getListSurgeryByDoctorId(doctorId);
		model.addAttribute("surgeryList", surgeryList);
		return "/hospital/views/government/surgery/gov_listDoctorSurgeryResult";
	}
	*/
	
	// 4.한진료의 입퇴원결과
	@RequestMapping(value="/government/getOneHospitalizationByTreatCode", method=RequestMethod.POST,
			produces = "text/json; charset=UTF-8")
		public String getOneHospitalizationByTreatCode(HttpSession session, String treatCode, Model model){
		String doctorId = (String) session.getAttribute("DOCTORID");
		logger.debug("4.getOneHospitalizationByTreatCode POST 진입");
		GoHospitalization hopitalization = goHSService.getOneHospitalizationByTreatCode(treatCode, doctorId);
		model.addAttribute("hopitalization", hopitalization);
		
		return "/hospital/views/government/hospitalization/gov_hospitalizationResult";
	}
	
	// 5.국민한명의 입퇴원결과 리스트
	@RequestMapping(value="/government/getListHospitalizationByCitizenId", method=RequestMethod.GET,
					produces = "text/json; charset=UTF-8")
	public String getListHospitalizationByCitizenId(HttpSession session, String citizenId, Model model){
		String doctorId = (String) session.getAttribute("DOCTORID");
		logger.debug("5.getListHospitalizationByCitizenId POST 진입");
		List<GoHospitalization> hopitalizationList = goHSService.getListHospitalizationByCitizenId(citizenId, doctorId);
		model.addAttribute("hopitalizationList", hopitalizationList);
		model.addAttribute("citizenId", citizenId);
		return "/hospital/views/government/hospitalization/gov_listHospitalizationResult";
	}
	
}
