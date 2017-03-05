package com.team4.project.hospital.vaccineCheckup.controller;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.project.hospital.vaccineCheckup.domain.HoCheckup;
import com.team4.project.hospital.vaccineCheckup.domain.HoCheckupSub;

@Repository
public class HoVaccineCheckupDao {

	@Autowired
	private SqlSessionTemplate sqlSession;

	//건강검진 목록
	public List<HoCheckup> checkupList(HoCheckup hoCheckup) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("VC.checkupList", hoCheckup);
	}

	public HoCheckupSub checkView(String hoTestRequestCode) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("VC.checkupView", hoTestRequestCode);
	}

	public int checkupAdd(HoCheckupSub checkAdd) {
		//
		return sqlSession.insert("VC.checkAdd", checkAdd);
		
	}
}
