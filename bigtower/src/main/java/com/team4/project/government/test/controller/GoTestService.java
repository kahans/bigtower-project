package com.team4.project.government.test.controller;

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
import com.team4.project.util.ContextParam;
import com.team4.project.util.HttpUrlCon;

@Service
public class GoTestService {
	Gson gson = new Gson();
	private static final Logger logger = LoggerFactory.getLogger(GoTestService.class);

	@Autowired
	private GoTestDao goTestDao;
	
	
	//treatCode로 혈액검사결과 하나 요청
	public GoBloodTest getOneBloodTestResult(String treatCode, String doctorId){
			GoBloodTest bloodTestResult = new GoBloodTest();
			logger.debug("서비스 혈액검사결과 하나");
			logger.debug("매개변수 treatCode 확인 : "+treatCode); 
			String url = ContextParam.context.getInitParameter("receiveUrl");
			HttpUrlCon conn = new HttpUrlCon(url+"/bigbang/government/getOneBloodTestResultByTreatCode");
			Map<String, String> map = new HashMap<String, String>();
			map.put("doctorId", doctorId);
			map.put("treatCode", treatCode);
			
			try {
				String result = conn.HttpUrlPOST(map);
				logger.debug("result 확인 : "+result);
				bloodTestResult = gson.fromJson(result, GoBloodTest.class);
			} catch (Exception e) {
				logger.debug("예외발생");
				e.printStackTrace();
			}
			return bloodTestResult;
	}
		
	//citizenId로 혈액검사결과리스트 요청
	public List<GoBloodTest> getListBloodTestResult(String citizenId, String doctorId){
		logger.debug("서비스 혈액검사결과 리스트");
		logger.debug("매개변수 citizenId 확인 : "+citizenId);
		List<GoBloodTest> listBloodTestResult = new ArrayList<GoBloodTest>();
		String url = ContextParam.context.getInitParameter("receiveUrl");
		HttpUrlCon conn = new HttpUrlCon(url+"/bigbang/government/getListBloodTestResultByCitizenId");
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("doctorId", doctorId);
		map.put("citizenId", citizenId);
		
		try {
			String result = conn.HttpUrlPOST(map);
			logger.debug("result 확인 : "+result);
			listBloodTestResult = gson.fromJson(result, new TypeToken<List<GoBloodTest>>(){}.getType() );
			logger.debug("리스트로 잘 바뀌었는지 확인 :"+listBloodTestResult.get(0));
		} catch (Exception e) {
			logger.debug("예외발생");
			e.printStackTrace();
		}
		return listBloodTestResult;
		
	}
	
	//doctorId로 혈액검사결과리스트 요청
	public List<GoBloodTest> getListBloodTestResultByDoctorId(String doctorId){
		logger.debug("서비스 혈액검사결과 리스트");
		logger.debug("매개변수 doctorId 확인 : "+doctorId);
		List<GoBloodTest> listBloodTestResult = new ArrayList<GoBloodTest>();
		String url = ContextParam.context.getInitParameter("receiveUrl");
		HttpUrlCon conn = new HttpUrlCon(url+"/bigbang/government/getListBloodTestResultByDoctorId");
		Map<String, String> map = new HashMap<String, String>();
		map.put("doctorId", doctorId);
		
		try {
			String result = conn.HttpUrlPOST(map);
			logger.debug("result 확인 : "+result);
			listBloodTestResult = gson.fromJson(result, new TypeToken<List<GoBloodTest>>(){}.getType() );
			logger.debug("리스트로 잘 바뀌었는지 확인 :"+listBloodTestResult.get(0));
		} catch (Exception e) {
			logger.debug("예외발생");
			e.printStackTrace();
		}
		return listBloodTestResult;
	}
	
	
	
	
		
	//treatCode로 영상검사결과 하나 요청
	public GoImageTest getOneImageTestResult(String treatCode, String doctorId){
		GoImageTest goImageTest = new GoImageTest();
		logger.debug("서비스 혈액검사결과 하나");
		logger.debug("매개변수 treatCode 확인 : "+treatCode); 
		String url = ContextParam.context.getInitParameter("receiveUrl");
		HttpUrlCon conn = new HttpUrlCon(url+"/bigbang/government/getOneImageTestResultByTreatCode");
		Map<String, String> map = new HashMap<String, String>();
		map.put("doctorId", doctorId);
		map.put("treatCode", treatCode);
		
		try {
			String result = conn.HttpUrlPOST(map);
			logger.debug("result 확인 : "+result);
			goImageTest = gson.fromJson(result, GoImageTest.class);
		} catch (Exception e) {
			logger.debug("예외발생");
			e.printStackTrace();
		}
		return goImageTest;
	}
	
	//citizenId로 영상검사결과 리스트 요청
	public List<GoImageTest> getListImageTestResult(String citizenId, String doctorId){
		List<GoImageTest> listImageTestResult = new ArrayList<GoImageTest>();
		logger.debug("서비스 영상검사결과 리스트");
		logger.debug("매개변수 citizenId 확인 : "+citizenId);
		String url = ContextParam.context.getInitParameter("receiveUrl");
		HttpUrlCon conn = new HttpUrlCon(url+"/bigbang/government/getListImageTestResultByCitizenId");
		Map<String, String> map = new HashMap<String, String>();
		map.put("doctorId", doctorId);
		map.put("citizenId", citizenId);
		
		try {
			String result = conn.HttpUrlPOST(map);
			logger.debug("result 확인 : "+result);
			listImageTestResult = gson.fromJson(result, new TypeToken<List<GoImageTest>>(){}.getType() );
		} catch (Exception e) {
			logger.debug("예외발생");
			e.printStackTrace();
		}
		return listImageTestResult;
	}
	
	//doctorId로 영상검사결과 리스트 조회
	public List<GoImageTest> getListImageTestResultByDoctorId(String doctorId){
		List<GoImageTest> listImageTestResult = new ArrayList<GoImageTest>();
		logger.debug("서비스 영상검사결과 리스트");
		logger.debug("매개변수 doctorId 확인 : "+doctorId);
		String url = ContextParam.context.getInitParameter("receiveUrl");
		HttpUrlCon conn = new HttpUrlCon(url+"/bigbang/government/getListImageTestResultByDoctorId");
		Map<String, String> map = new HashMap<String, String>();
		map.put("doctorId", doctorId);
		try {
			String result = conn.HttpUrlPOST(map);
			logger.debug("result 확인 : "+result);
			listImageTestResult = gson.fromJson(result, new TypeToken<List<GoImageTest>>(){}.getType() );
		} catch (Exception e) {
			logger.debug("예외발생");
			e.printStackTrace();
		}
		return listImageTestResult;
	}
}