package com.team4.project.government.treatChart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.project.government.treatChart.domain.GoTreat;

@Service
public class GoTreatChartService {

	@Autowired
	private GoTreatChartDao goTCD;
	
	public GoTreat goSelectTreat(){
		return goTCD.goSelectTreat();
	}
}
