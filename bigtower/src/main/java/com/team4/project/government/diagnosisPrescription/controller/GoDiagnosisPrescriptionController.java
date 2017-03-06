package com.team4.project.government.diagnosisPrescription.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.team4.project.government.hopitalizationSurgery.controller.GoHospitalizationSurgeryController;

@RestController
public class GoDiagnosisPrescriptionController {
	private static final Logger logger = LoggerFactory.getLogger(GoHospitalizationSurgeryController.class);
	private Gson gson = new Gson();
	
	@Autowired
	private GoDiagnosisPrescriptionService goDPService;
	
	// 1.진료코드로 진단결과 가져오기(test)
	@RequestMapping(value="/government/getListDiagnosisByTreatCode", method=RequestMethod.GET,
			produces = "text/json; charset=UTF-8")
	public String getListDiagnosisByTreatCode(String treatCode, String test){
		logger.debug("getListDiagnosisByTreatCode GET 진입");
		String diagnosisList = gson.toJson(goDPService.getListDiagnosisByTreatCode(treatCode));
		return diagnosisList;
	}
	
	// 1.진료코드로 진단결과 가져오기
	@RequestMapping(value="/government/getListDiagnosisByTreatCode", method=RequestMethod.POST,
			produces = "text/json; charset=UTF-8")
	public String getListDiagnosisByTreatCode(String treatCode){
		logger.debug("getListDiagnosisByTreatCode POST 진입");
		String diagnosisList = gson.toJson(goDPService.getListDiagnosisByTreatCode(treatCode));
		return diagnosisList;
	}
	
	
	// 2.진료코드로 처방(약)결과 가져오기(test)
	@RequestMapping(value="/government/getListPrescriptionByTreatCode", method=RequestMethod.GET,
			produces = "text/json; charset=UTF-8")
	public String getListPrescriptionByTreatCode(String treatCode, String test){
		logger.debug("getListPrescriptionByTreatCode GET 진입");
		String prescriptionList = gson.toJson(goDPService.getListPrescriptionByTreatCode(treatCode));
		return prescriptionList;
	}
	
	// 2.진료코드로 처방(약)결과 가져오기(test)
	@RequestMapping(value="/government/getListPrescriptionByTreatCode", method=RequestMethod.POST,
			produces = "text/json; charset=UTF-8")
	public String getListPrescriptionByTreatCode(String treatCode){
		logger.debug("getListPrescriptionByTreatCode GET 진입");
		String prescriptionList = gson.toJson(goDPService.getListPrescriptionByTreatCode(treatCode));
		return prescriptionList;
	}
	
}
