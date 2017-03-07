package com.team4.project.hospital.vaccineCheckup.controller;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.project.hospital.test.domain.HoTestRequestSub;
import com.team4.project.hospital.vaccineCheckup.domain.HoCheckup;
import com.team4.project.hospital.vaccineCheckup.domain.HoCheckupSub;
import com.team4.project.hospital.vaccineCheckup.domain.HoVaccine;

@Repository
public class HoVaccineCheckupDao {

	@Autowired
	private SqlSessionTemplate sqlSession;

	//건강검진 목록
	public List<HoTestRequestSub> checkupList(HoTestRequestSub hoTestRequestSub) {		
		return sqlSession.selectList("VC.checkupList", hoTestRequestSub);
	}

	//건강검진 상세보기
	public HoCheckupSub checkView(String hoTestRequestCode) {		
		return sqlSession.selectOne("VC.checkupView", hoTestRequestCode);
	}

	
	/*public int checkupAdd(HoCheckupSub checkAdd) {
		return sqlSession.insert("VC.addCheckup", checkAdd);		
	}*/
	
	//예방접종 등록
	public int addVaccine(HoVaccine hoVaccine) {
		return sqlSession.insert("VC.addVaccine", hoVaccine);		
	}
	//건강검진 등록
	public int addCheckup(HoCheckupSub checkView) {
		// TODO Auto-generated method stub
		return sqlSession.insert("VC.addCheckup", checkView);
	}
	//건감검진 데이터 업데이트
	public int updateCheckup(HoCheckupSub updateCheckup) {
		// TODO Auto-generated method stub
		return sqlSession.update("VC.updateCheckup", updateCheckup);
	}
}
