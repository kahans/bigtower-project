package com.team4.project.government.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.project.government.dto.GoCitizen;
import com.team4.project.government.dto.GoHospital;
import com.team4.project.government.dto.GoMedicine;

@Service
public class GovernmentService {
	@Autowired
	private GovernmentDao goDao;
	
	public void addData(String id, String name){
		Map<String, String> map = new HashMap<String, String>();
		map.put("id", id);
		map.put("name", name);
		goDao.insertData(map);
	}
	
	//국민 로그인체크
	public GoCitizen loginCheck(GoCitizen goCitizen){
		System.out.println("GovernmentService_loginInfo:"+goCitizen);
		
		return goDao.loginCheck(goCitizen);
	}
	
	//국민 로그인체크
	public GoHospital loginCheck(GoHospital goHospital){
		System.out.println("GovernmentService_loginInfo:"+goHospital);
		return goDao.loginCheck(goHospital);
	}
	
	//약 코드가져오기
	public List<GoMedicine> getMedicine(){
		return goDao.selectMedicine();
	}
}
