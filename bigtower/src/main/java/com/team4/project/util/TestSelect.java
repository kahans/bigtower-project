package com.team4.project.util;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestSelect {
	
	/*
		HoBloodTest
		HoChart
		HoCheckup
		HoDiagnosis
		HoHospitalization
		HoMediaTest
		HoOperation
		HoPrescription
		HoTreat
		HoVaccine
	*/
	@RequestMapping(value="/hospital/allGet", method=RequestMethod.GET)
	public void test(){
		
	}
}
