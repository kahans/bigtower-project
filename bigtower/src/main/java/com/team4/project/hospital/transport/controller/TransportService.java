package com.team4.project.hospital.transport.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.project.hospital.diagnosisPrescription.domain.HoDiagnosis;
import com.team4.project.hospital.diagnosisPrescription.domain.HoPrescription;
import com.team4.project.hospital.hospitalizationOperation.domain.HoHospitalization;
import com.team4.project.hospital.hospitalizationOperation.domain.HoOperation;
import com.team4.project.hospital.test.domain.HoBloodTest;
import com.team4.project.hospital.test.domain.HoMediaTest;
import com.team4.project.hospital.treatChart.domain.HoChart;
import com.team4.project.hospital.treatChart.domain.HoTreat;
import com.team4.project.hospital.vaccineCheckup.domain.HoCheckup;
import com.team4.project.hospital.vaccineCheckup.domain.HoVaccine;

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
		// 건강검진 조회
		List<HoDiagnosis> hoDiagnosis = transportDao.selectListHoDiagnosis();
		logger.debug("hoDiagnosis:"+hoDiagnosis);
		// 건강검진 조회
		List<HoHospitalization> hoHospitalization = transportDao.selectListHoHospitalization();
		logger.debug("hoHospitalization:"+hoHospitalization);
		// 영상검사결과 조회
		List<HoMediaTest> hoMediaTest = transportDao.selectListHoMediaTest();
		logger.debug("hoMediaTest:"+hoMediaTest);
		// 수술결과 조회
		List<HoOperation> hoOperation = transportDao.selectListHoOperation();
		logger.debug("hoOperation:"+hoOperation);
		// 처방결과 조회
		List<HoPrescription> hoPrescription = transportDao.selectListHoPrescription();
		logger.debug("hoPrescription:"+hoPrescription);
		// 진료 조회
		List<HoTreat> hoTreat = transportDao.selectListHoTreat();
		logger.debug("hoTreat:"+hoTreat);
		// 예방접종 조회
		List<HoVaccine> hoVaccine = transportDao.selectListHoVaccine();
		logger.debug("hoVaccine:"+hoVaccine);
		
		
		
	}
}
