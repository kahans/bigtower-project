package com.team4.project.hospital.hospitalizationOperation.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.project.hospital.hospitalizationOperation.domain.HoHospitalization;
import com.team4.project.hospital.hospitalizationOperation.domain.HoOperation;
import com.team4.project.hospital.hospitalizationOperation.domain.HoOperationSub;

@Service
public class HoHospitalizationOperationService {

	@Autowired
	private HoHospitalizationOperationDao hoHOD;
	
	//수술 등록
	public int addOperation(HoOperation hoOperation){
		return hoHOD.addOperation(hoOperation);
	}
	
	//수술 목록
	public List<HoOperationSub> operationList(){
		return hoHOD.operationList();
	}
	
	//수술 상세보기
	public HoOperationSub operationView(String hoOperationCode){
		HoOperationSub hoOperationSub = hoHOD.operationView(hoOperationCode);
		String date = hoOperationSub.getHoOperationStartDate();
		System.out.println("포맷팅 전 날짜 : "+date);
		SimpleDateFormat orginalFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		try{
			Date formatDate = formatter.parse(date);
			System.out.println("포맷된 날짜 : "+formatDate);
			
		}catch(Exception e){
			
		}

		return hoOperationSub;
	}
	
	//수술일지 수정
	public int updateOperation(HoOperationSub hoOperationSub){
		return hoHOD.updateOperation(hoOperationSub);
	}
}
