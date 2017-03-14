package com.team4.project.government.diagnosisPrescription.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.team4.project.government.diagnosisPrescription.domain.GoDiagnosis;
import com.team4.project.government.diagnosisPrescription.domain.GoPrescription;
import com.team4.project.government.test.controller.GoTestService;
import com.team4.project.government.test.domain.GoBloodTest;
import com.team4.project.util.ContextParam;
import com.team4.project.util.HttpUrlCon;

@Service
public class GoDiagnosisPrescriptionService {
	private static final Logger logger = LoggerFactory.getLogger(GoDiagnosisPrescriptionService.class);
	Gson gson = new Gson();

	// 진료코드로 진단결과 가져오기
	public List<GoDiagnosis> getListDiagnosisByTreatCode(String treatCode){
		return null;
	}
	
	// 주민번호로 진단결과 가져오기
	public List<GoDiagnosis> getListDiagnosisByCitizenId(String citizenId, String doctorId){
		List<GoDiagnosis> listDiagnosis = new ArrayList<GoDiagnosis>();
		logger.debug("매개변수 citizenId 확인 : "+citizenId); 
		logger.debug("doctorId : "+doctorId);
		String url = ContextParam.context.getInitParameter("receiveUrl");
		HttpUrlCon conn = new HttpUrlCon(url+"/bigbang/government/getListDiagnosisByCitizenId");
		Map<String, String> map = new HashMap<String, String>();
		map.put("doctorId", doctorId);
		map.put("citizenId", citizenId);
		try{
		String result = conn.HttpUrlPOST(map);
		logger.debug("result 확인 : "+result);
		listDiagnosis = gson.fromJson(result, new TypeToken<List<GoDiagnosis>>(){}.getType() );
		
		}catch(Exception e) {
			logger.debug("예외발생");
			e.printStackTrace();
		}
		return listDiagnosis;
	}
	
	// 진료코드로 처방결과 가져오기
	public List<GoPrescription> getListPrescriptionByTreatCode(String treatCode){
		return null;
	}
	
	// 주민번호로 처방결과 가져오기
	public List<GoPrescription> getListPrescriptionByCitizenId(String citizenId , String doctorId){
		List<GoPrescription> listPrescription = new ArrayList<GoPrescription>();
		logger.debug("서비스 혈액검사결과 하나");
		logger.debug("매개변수 citizenId 확인 : "+citizenId); 
		logger.debug("doctorId : "+doctorId);
		String url = ContextParam.context.getInitParameter("receiveUrl");
		HttpUrlCon conn = new HttpUrlCon(url+"/bigbang/government/getListPrescriptionByCitizenId");
		Map<String, String> map = new HashMap<String, String>();
		map.put("doctorId", doctorId);
		map.put("citizenId", citizenId);
		try{
		String result = conn.HttpUrlPOST(map);
		logger.debug("result 확인 : "+result);
		listPrescription = gson.fromJson(result, new TypeToken<List<GoPrescription>>(){}.getType() );
	
		}catch(Exception e) {
			logger.debug("예외발생");
			e.printStackTrace();
		}
		return listPrescription;
	}
}
