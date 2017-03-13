package com.team4.project.government.hopitalizationSurgery.controller;

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
import com.team4.project.government.hopitalizationSurgery.domain.GoHospitalization;
import com.team4.project.government.hopitalizationSurgery.domain.GoSearchHospitalizationSub;
import com.team4.project.government.hopitalizationSurgery.domain.GoSearchSurgerySub;
import com.team4.project.government.hopitalizationSurgery.domain.GoSurgeryResult;
import com.team4.project.government.test.controller.GoTestService;
import com.team4.project.government.test.domain.GoBloodTest;
import com.team4.project.util.ContextParam;
import com.team4.project.util.HttpUrlCon;
import com.team4.project.util.Util;

@Service
public class GoHospitalizationSurgeryService {
	Gson gson = new Gson();
	private static final Logger logger = LoggerFactory.getLogger(GoHospitalizationSurgeryService.class);
			
	// 한진료의 수술결과
	public GoSearchSurgerySub getOneSurgeryByTreatCode(String treatCode, String doctorId){
		return null;
	}
	
	// 한진료의 입/퇴원결과
	public GoHospitalization getOneHospitalizationByTreatCode(String treatCode, String doctorId){
		return null;
	}
	
	// 국민한명의 수술결과 리스트
	public List<GoSurgeryResult> getListSurgeryByCitizenId(String citizenId, String doctorId){
		List<GoSurgeryResult> listSurgeryResult = new ArrayList<GoSurgeryResult>();
		String url = ContextParam.context.getInitParameter("receiveUrl");
		HttpUrlCon conn = new HttpUrlCon(url+"/bigbang/government/getListSurgeryResultByCitizenId");
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("doctorId", doctorId);
		map.put("citizenId", citizenId);
		
		try {
			String result = conn.HttpUrlPOST(map);
			logger.debug("result 확인 : "+result);
			listSurgeryResult = gson.fromJson(result, new TypeToken<List<GoSurgeryResult>>(){}.getType() );
			logger.debug("리스트로 잘 바뀌었는지 확인 :"+listSurgeryResult.get(0));
		} catch (Exception e) {
			logger.debug("예외발생");
			e.printStackTrace();
		}
		return listSurgeryResult;
	}
	
	// 국민한명의 입퇴원결과 리스트
	public List<GoHospitalization> getListHospitalizationByCitizenId(String citizenId, String doctorId){
		List<GoHospitalization> listSurgeryResult = new ArrayList<GoHospitalization>();
		String url = ContextParam.context.getInitParameter("receiveUrl");
		HttpUrlCon conn = new HttpUrlCon(url+"/bigbang/government/getListHospitalizationByCitizenId");
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("doctorId", doctorId);
		map.put("citizenId", citizenId);
		
		try {
			String result = conn.HttpUrlPOST(map);
			logger.debug("result 확인 : "+result);
			listSurgeryResult = gson.fromJson(result, new TypeToken<List<GoHospitalization>>(){}.getType() );
			logger.debug("리스트로 잘 바뀌었는지 확인 :"+listSurgeryResult.get(0));
		} catch (Exception e) {
			logger.debug("예외발생");
			e.printStackTrace();
		}
		return listSurgeryResult;
	}
	
	// 의사한명의 수술결과 리스트
	public List<GoSurgeryResult> getListSurgeryByDoctorId(String doctorId){
		return null;
	}

	public List<GoSearchSurgerySub> goSurgeryStatistics(int citizen) {
		System.out.println(citizen);
		// TODO Auto-generated method stub
		return null;
	}

	public List<GoSearchHospitalizationSub> hospitalizationStatistics(int citizen) {
		// TODO Auto-generated method stub
		return null;
	}
}
