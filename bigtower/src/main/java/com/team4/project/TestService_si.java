package com.team4.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.project.government.treatChart.domain.GoTreat;

@Service
public class TestService_si {

	@Autowired
	private TestDao_si testDao;
	
	public List<GoTreat> treatList(){
		return testDao.treatList();
	}
}
