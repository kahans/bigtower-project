package com.team4.project.hospital.treatChart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.project.hospital.dto.HoTest;
import com.team4.project.hospital.receiveReservation.domain.HoReceiveSub;
import com.team4.project.hospital.treatChart.domain.HoChart;
import com.team4.project.hospital.treatChart.domain.HoTreatSub;

@Service
public class HoTreatChartService {

	@Autowired
	private HoTreatChartDao hoTCD;
	
	//차트생성
	public int addChart(HoChart hoChart){
		return hoTCD.addChart(hoChart);
	}
	
	//진료 상세보기
	public HoTreatSub treatView(String hoTreatmentCode){
		return hoTCD.treatView(hoTreatmentCode);
	}

	//진료 목록
	public List<HoTreatSub> treatList(String hospitalCode) {
		return hoTCD.treatLsit(hospitalCode);
	}
	
	//검사 이름 가져오기
	public List<HoTest> selectTest() {
		return hoTCD.selectTest();
	}
}
