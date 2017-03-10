package com.team4.project.government.diagnosisPrescription.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.google.gson.Gson;
import com.team4.project.government.hopitalizationSurgery.controller.GoHospitalizationSurgeryController;

@Controller
public class GoDiagnosisPrescriptionController {
	private static final Logger logger = LoggerFactory.getLogger(GoHospitalizationSurgeryController.class);
	private Gson gson = new Gson();
	
	@Autowired
	private GoDiagnosisPrescriptionService goDPService;
	
	//진료코드 진단 정보 조회폼
	@RequestMapping(value="/government/getListDiagnosisByTreatCode", method=RequestMethod.GET)
	public String searchDiagnosis(){
		return "/hospital/views/government/gov_searchDiagnosis";
	}
	
	// 진료코드로 진단결과 가져오기
	@RequestMapping(value="/government/getListDiagnosisByTreatCode", method=RequestMethod.POST,
			produces = "text/json; charset=UTF-8")
	public String getListDiagnosisByTreatCode(String treatCode){
		logger.debug("getListDiagnosisByTreatCode POST 진입");
		String diagnosisList = gson.toJson(goDPService.getListDiagnosisByTreatCode(treatCode));
		return diagnosisList;
	}
	
	// 주민번호로 진단결과 가져오기
	
	
	// 진료코드로 처방(약)결과 가져오기(test)
	@RequestMapping(value="/government/getListPrescriptionByTreatCode", method=RequestMethod.POST,
			produces = "text/json; charset=UTF-8")
	public String getListPrescriptionByTreatCode(String treatCode){
		logger.debug("getListPrescriptionByTreatCode GET 진입");
		String prescriptionList = gson.toJson(goDPService.getListPrescriptionByTreatCode(treatCode));
		return prescriptionList;
	}
	
	//진단을 조회하는 뷰
	@RequestMapping(value="/government/searchDiagnosis", method=RequestMethod.GET)
	public String searchDiagnois(){
		return "/hospital/views/government/gov_searchDiagnosis";
	}
}
