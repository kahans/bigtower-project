package com.team4.project.government.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.project.government.dto.GoCitizen;
import com.team4.project.government.dto.GoHospital;

@Service
public class GovernmentService {
	@Autowired
	private GovernmentDao goDao;
	
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
		
}
