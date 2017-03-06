package com.team4.project.hospital.transport.controller;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.project.hospital.test.domain.HoBloodTest;
import com.team4.project.hospital.treatChart.domain.HoChart;
import com.team4.project.hospital.vaccineCheckup.domain.HoCheckup;

@Repository
public class TransportDao {
	private static final Logger logger = LoggerFactory.getLogger(TransportDao.class);
	@Autowired
	private SqlSessionTemplate sql;
	
	// 혈액검사 조회
	public List<HoBloodTest> selectListHoBloodTest(){
		return sql.selectList("hoTransport.selectListHoBloodTest");
	}
	
	// 차트 조회
	public List<HoChart> selectListHoChart(){
		return sql.selectList("hoTransport.selectListHoChart");
	}
	
	// 건강검진 조회
	public List<HoCheckup> selectListHoCheckup(){
		return sql.selectList("hoTransport.selectListHoCheckup");
	}
}
