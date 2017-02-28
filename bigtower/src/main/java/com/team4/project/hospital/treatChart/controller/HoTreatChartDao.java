package com.team4.project.hospital.treatChart.controller;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.project.hospital.treatChart.domain.HoChart;

@Repository
public class HoTreatChartDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	//차트생성
	public int addChart(HoChart hoChart){
		return sqlSession.insert("hoTreatChart.addChart", hoChart);
	}
}
