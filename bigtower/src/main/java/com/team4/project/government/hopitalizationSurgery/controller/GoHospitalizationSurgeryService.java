package com.team4.project.government.hopitalizationSurgery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.project.government.hopitalizationSurgery.domain.GoSurgery;

@Service
public class GoHospitalizationSurgeryService {

	@Autowired
	private GoHospitalizationSurgeryDao goHSD;
	
	public List<GoSurgery> goSurgeryList(){
		return goHSD.goSurgeryList();
	}
}
