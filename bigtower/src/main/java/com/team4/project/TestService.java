package com.team4.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
	@Autowired
	private TestDao testDao;	
	
	public List selectTreatSubject(){
		System.out.println("Service");
		return testDao.selectTreatSubject();
	}
	
}
