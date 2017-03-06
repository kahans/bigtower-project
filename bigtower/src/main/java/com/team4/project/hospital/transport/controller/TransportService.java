package com.team4.project.hospital.transport.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.project.hospital.test.domain.HoBloodTest;
import com.team4.project.hospital.treatChart.domain.HoChart;
import com.team4.project.hospital.vaccineCheckup.domain.HoCheckup;

@Service
public class TransportService {
	private static final Logger logger = LoggerFactory.getLogger(TransportService.class);
	@Autowired
	private TransportDao transportDao;
	
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
	public void getAll(){
		// 혈액검사 결과 조회
		List<HoBloodTest> hoBloodTest = transportDao.selectListHoBloodTest();
		logger.debug("hoBloodTest:"+hoBloodTest);
		// 차트 조회
		List<HoChart> hoChart = transportDao.selectListHoChart();
		logger.debug("hoChart:"+hoChart);
		// 건강검진 조회
		List<HoCheckup> hoCheckup = transportDao.selectListHoCheckup();
		logger.debug("hoCheckup:"+hoCheckup);
		
		
	}
}
