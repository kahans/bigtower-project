package com.team4.project.government.vaccinationCheckup.controller;

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
import com.team4.project.government.test.domain.GoBloodTest;
import com.team4.project.government.test.domain.GoImageTest;
import com.team4.project.government.vaccinationCheckup.domain.GoCheckup;
import com.team4.project.government.vaccinationCheckup.domain.GoVaccinationResult;
import com.team4.project.util.ContextParam;
import com.team4.project.util.HttpUrlCon;

@Service
public class GoVaccinationCheckupService {
	Gson gson = new Gson();
	private static final Logger logger = LoggerFactory.getLogger(GoVaccinationCheckupService.class);

	
	//treatCode 받아 하나의 예방접종결과 조회
	public GoVaccinationResult getOneVaccinationResult(String treatCode, String doctorId){	
		GoVaccinationResult vaccineResult = new GoVaccinationResult();
		logger.debug("서비스 , 진료코드를 받아 하나의 예방접종결과 조회");
		logger.debug("매개변수로 받은 treatCode 확인 : "+treatCode);
		String url = ContextParam.context.getInitParameter("receiveUrl");
		HttpUrlCon conn = new HttpUrlCon(url+"/bigbang/government/getOneVaccinationResultByTreatCode");
		Map<String, String> map = new HashMap<String, String>();
		map.put("doctorId", doctorId);
		map.put("treatCode", treatCode);
		
		try {
			String result = conn.HttpUrlPOST(map);
			logger.debug("result 확인 : "+result);
			vaccineResult = gson.fromJson(result, GoVaccinationResult.class);
		} catch (Exception e) {
			logger.debug("예외발생");
			e.printStackTrace();
		}
		return vaccineResult;
	}
	
	//citizenId 받아 예방접종결과리스트 조회
	public List<GoVaccinationResult> getListVaccinationResult(String citizenId, String doctorId){
		logger.debug("서비스 , 진료코드를 받아예방접종결과리스트 조회");
		logger.debug("매개변수로 받은 citizenId 확인 : "+citizenId);
		List<GoVaccinationResult> listVaccineResult = new ArrayList<GoVaccinationResult>();
		String url = ContextParam.context.getInitParameter("receiveUrl");
		HttpUrlCon conn = new HttpUrlCon(url+"/bigbang/government/getListVaccinationResultByCitizenId");
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("doctorId", doctorId);
		map.put("citizenId", citizenId);
		
		try {
			String result = conn.HttpUrlPOST(map);
			logger.debug("result 확인 : "+result);
			listVaccineResult = gson.fromJson(result, new TypeToken<List<GoVaccinationResult>>(){}.getType() );
			logger.debug("리스트로 잘 바뀌었는지 확인 :"+listVaccineResult.get(0));
		} catch (Exception e) {
			logger.debug("예외발생");
			e.printStackTrace();
		}
		return listVaccineResult;
	}
	
	//doctorId 받아 예방접종결과리스트 조회
	public List<GoVaccinationResult> getListVaccinationResultByDoctorId(String doctorId){
		logger.debug("서비스 , 진료코드를 받아예방접종결과리스트 조회");
		logger.debug("매개변수로 받은 doctorId 확인 : "+doctorId);
		List<GoVaccinationResult> listVaccineResult = new ArrayList<GoVaccinationResult>();
		String url = ContextParam.context.getInitParameter("receiveUrl");
		HttpUrlCon conn = new HttpUrlCon(url+"/bigbang/government/getListVaccinationResultByDoctorId");
		Map<String, String> map = new HashMap<String, String>();
		map.put("doctorId", doctorId);
		
		try {
			String result = conn.HttpUrlPOST(map);
			logger.debug("result 확인 : "+result);
			listVaccineResult = gson.fromJson(result, new TypeToken<List<GoVaccinationResult>>(){}.getType() );
			logger.debug("리스트로 잘 바뀌었는지 확인 :"+listVaccineResult.get(0));
		} catch (Exception e) {
			logger.debug("예외발생");
			e.printStackTrace();
		}
		return listVaccineResult;
	}
	
	//treatCode 받아 하나의 예방접종결과 조회
	public GoCheckup getOneCheckupResult(String treatCode, String doctorId){
		GoCheckup goCheckup = new GoCheckup();
		logger.debug("서비스 , 진료코드를 받아 하나의 예방접종결과 조회");
		logger.debug("매개변수로 받은 treatCode 확인 : "+treatCode);
		String url = ContextParam.context.getInitParameter("receiveUrl");
		HttpUrlCon conn = new HttpUrlCon(url+"/bigbang/government/getOneCheckupResultByTreatCode");
		Map<String, String> map = new HashMap<String, String>();
		map.put("doctorId", doctorId);
		map.put("treatCode", treatCode);
		
		try {
			String result = conn.HttpUrlPOST(map);
			logger.debug("result 확인 : "+result);
			goCheckup = gson.fromJson(result, GoCheckup.class);
		} catch (Exception e) {
			logger.debug("예외발생");
			e.printStackTrace();
		}
		return goCheckup;
	}

	//citizenId 받아 예방접종결과리스트 조회
	public List<GoCheckup> getListCheckupResult(String citizenId, String doctorId){
		List<GoCheckup> listCheckupResult = new ArrayList<GoCheckup>();
		logger.debug("서비스 , 진료코드를 받아예방접종결과리스트 조회");
		logger.debug("매개변수로 받은 citizenId 확인 : "+citizenId);
		String url = ContextParam.context.getInitParameter("receiveUrl");
		HttpUrlCon conn = new HttpUrlCon(url+"/bigbang/government/getListCheckupResultByCitizenId");
		Map<String, String> map = new HashMap<String, String>();
		map.put("doctorId", doctorId);
		map.put("citizenId", citizenId);
		
		try {
			String result = conn.HttpUrlPOST(map);
			logger.debug("result 확인 : "+result);
			listCheckupResult = gson.fromJson(result, new TypeToken<List<GoCheckup>>(){}.getType() );
		} catch (Exception e) {
			logger.debug("예외발생");
			e.printStackTrace();
		}
		return listCheckupResult;
	}
	
	//doctorId 받아 예방접종결과리스트 조회
	public List<GoCheckup> getListCheckupResultByDoctorId(String doctorId){
		List<GoCheckup> listCheckupResult = new ArrayList<GoCheckup>();
		logger.debug("서비스 , 진료코드를 받아예방접종결과리스트 조회");
		logger.debug("매개변수로 받은 doctorId 확인 : "+doctorId);
		String url = ContextParam.context.getInitParameter("receiveUrl");
		HttpUrlCon conn = new HttpUrlCon(url+"/bigbang/government/getListCheckupResultByDoctorId");
		Map<String, String> map = new HashMap<String, String>();
		map.put("doctorId", doctorId);
		
		try {
			String result = conn.HttpUrlPOST(map);
			logger.debug("result 확인 : "+result);
			listCheckupResult = gson.fromJson(result, new TypeToken<List<GoCheckup>>(){}.getType() );
		} catch (Exception e) {
			logger.debug("예외발생");
			e.printStackTrace();
		}
		return listCheckupResult;
	}
}
