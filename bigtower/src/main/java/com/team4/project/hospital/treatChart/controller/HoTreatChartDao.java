package com.team4.project.hospital.treatChart.controller;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.project.hospital.receiveReservation.domain.HoReceiveSub;
import com.team4.project.hospital.treatChart.domain.HoChart;
import com.team4.project.hospital.treatChart.domain.HoTreatSub;

@Repository
public class HoTreatChartDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	//차트생성
	public int addChart(HoChart hoChart){
		return sqlSession.insert("hoTreatChart.addChart", hoChart);
	}
	
	public HoTreatSub treatView(String hoTreatmentCode){
		return sqlSession.selectOne("hoTreatChart.treatView", hoTreatmentCode);
	}

	public List<HoTreatSub> treatLsit(String hospitalCode) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("hoTreatChart.treatmentList", hospitalCode);
	}
}
