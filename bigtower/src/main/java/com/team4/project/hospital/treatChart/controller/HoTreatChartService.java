package com.team4.project.hospital.treatChart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	
	public HoTreatSub treatView(String hoTreatmentCode){
		return hoTCD.treatView(hoTreatmentCode);
	}

	public List<HoTreatSub> treatList(String hospitalCode) {
		// TODO Auto-generated method stub
		return hoTCD.treatLsit(hospitalCode);
	}
}
