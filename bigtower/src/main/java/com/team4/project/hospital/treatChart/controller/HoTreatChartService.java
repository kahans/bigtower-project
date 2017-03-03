package com.team4.project.hospital.treatChart.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.project.hospital.dto.HoDisease;
import com.team4.project.hospital.dto.HoOperationType;
import com.team4.project.hospital.dto.HoTest;
import com.team4.project.hospital.receiveReservation.domain.HoReceiveSub;
import com.team4.project.hospital.treatChart.domain.HoChart;
import com.team4.project.hospital.treatChart.domain.HoTreat;
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
	
	//수술 이름 가져오기
	public List<HoOperationType> selectOperation() {
		return hoTCD.selectOperation();
	}
		
	//검사 이름 가져오기
	public List<HoTest> selectTest() {
		return hoTCD.selectTest();
	}
	
	//질병 이름 가져오기
	public List<HoDisease> selectDisease() {
		return hoTCD.selectDisease();
	}
	
	//환자코드에 맞는 차트코드 가져오기
	public String selectChartCode(Map<String, Object> map){
		return hoTCD.selectChartCode(map);
	}
	
	//접수완료 클릭시 진료 데이터 생성
	public int addTreat(HoTreat hoTreat){
		return hoTCD.addTreat(hoTreat);
	}
	
	//진료 상세보기에서 진료업데이트
	public int updateTreat(HoTreat hoTreat){
		return hoTCD.updateTreat(hoTreat);
	}
}
