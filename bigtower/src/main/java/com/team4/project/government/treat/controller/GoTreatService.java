package com.team4.project.government.treat.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.team4.project.government.treat.domain.GoTreat;
import com.team4.project.util.ContextParam;
import com.team4.project.util.HttpUrlCon;

@Service
public class GoTreatService {
	private static final Logger logger = LoggerFactory.getLogger(GoTreatService.class);
	Gson gson = new Gson();
	
	// 한사람의 하나의 진료정보
	public GoTreat getOneTreat(String treatCode){
		return null;
	}
		
	// 한사람의 진료리스트
	public List<GoTreat> getListTreatByCitizenId(String citizenId, String doctorId){
		logger.debug("의사아이디 확인 : "+doctorId);
		logger.debug("주민번호 확인 : "+citizenId);
		
		List<GoTreat> treatList = new ArrayList<GoTreat>();
		String url = ContextParam.context.getInitParameter("receiveUrl");
		HttpUrlCon conn = new HttpUrlCon(url+"/bigbang/government/getListTreatByCitizenId");
		Map<String, String> map = new HashMap<String, String>(); 
		map.put("doctorId", doctorId);
		map.put("citizenId", citizenId);
		try {
			String list = conn.HttpUrlPOST(map);	//여기서 전송 해서 String으로 받아
			logger.debug("list : "+list);
			treatList = gson.fromJson(list, new TypeToken<List<GoTreat>>(){}.getType());
			logger.debug("treatList : "+treatList);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return treatList;
	}
	
	// 한명의 의사에게 진료받은 여러사람의 진료리스트
	public List<GoTreat> getListTreatByDoctorId(String doctorId){
		
		logger.debug("의사아이디 확인 : "+doctorId);
		
		List<GoTreat> treatList = new ArrayList<GoTreat>();
		String url = ContextParam.context.getInitParameter("receiveUrl");
		HttpUrlCon conn = new HttpUrlCon(url+"/bigbang//government/getListTreatByDoctorId");
		Map<String, String> map = new HashMap<String, String>(); 
		map.put("doctorId", doctorId);
		
		try {
			String list = conn.HttpUrlPOST(map);	//여기서 전송 해서 String으로 받아
			logger.debug("list : "+list);
			treatList = gson.fromJson(list, new TypeToken<List<GoTreat>>(){}.getType());
			logger.debug("treatList : "+treatList);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return treatList;
	}

}
