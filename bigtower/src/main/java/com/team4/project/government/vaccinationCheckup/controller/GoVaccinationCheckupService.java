package com.team4.project.government.vaccinationCheckup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoVaccinationCheckupService {

	@Autowired
	private GoVaccinationCheckupDao goVCD;
}
