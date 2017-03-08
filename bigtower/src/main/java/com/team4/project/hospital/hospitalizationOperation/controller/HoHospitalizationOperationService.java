package com.team4.project.hospital.hospitalizationOperation.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.team4.project.hospital.hospitalizationOperation.domain.HoHospitalization;
import com.team4.project.hospital.hospitalizationOperation.domain.HoHospitalizationRequest;
import com.team4.project.hospital.hospitalizationOperation.domain.HoOperation;
import com.team4.project.hospital.hospitalizationOperation.domain.HoOperationSub;

@Transactional
@Service
public class HoHospitalizationOperationService {

	@Autowired
	private HoHospitalizationOperationDao hoHOD;
	
	//수술 등록
	public int addOperation(HoOperation hoOperation){
		return hoHOD.addOperation(hoOperation);
	}
	
	//수술 목록
	public List<HoOperationSub> operationList(String hoHospitalCode){
		return hoHOD.operationList(hoHospitalCode);
	}
	
	//입퇴원 요청 목록
	public List<HoHospitalizationRequest> hospitalizationRequestList(String hoHospitalCode){
		return hoHOD.hospitalizationRequestList(hoHospitalCode);
	}
	
	//입원 등록
	public int addHospitalization(Map<String, Object> map){
		return hoHOD.addHospitalization(map);
	}
	
	//퇴원일 업데이트
	public int updateHospitalization(String hoHospitalizationCode){
		return hoHOD.updateHospitalization(hoHospitalizationCode);
	}
	
	//수술 상세보기
	public HoOperationSub operationView(String hoOperationCode){
		return hoHOD.operationView(hoOperationCode);
	}
	
	//수술일지 수정
	public int updateOperation(HoOperationSub hoOperationSub){
		//수술 시작일과 종료일을 비교하여 종료일이 더 이전날짜일 경우 수정이 안되도록 비교하는 로직 추가
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date hoOperationStartDate = hoOperationSub.getHoOperationStartDate();
		Date hoOperationEndDate = hoOperationSub.getHoOperationEndDate();
		System.out.println("hoOperationStartDate : "+hoOperationStartDate);
		System.out.println("hoOperationEndDate : "+hoOperationEndDate);
		
		int result = 0;
		/*try{
			hoOperationStartDate = format.parse(hoOperationStartDate);
			hoOperationEndDate = format.parse(hoOperationEndDate);
			System.out.println("parsing한 수술시작일 : "+hoOperationStartDate);
			System.out.println("parsing한 수술종료일 : "+hoOperationEndDate);
		}catch(Exception e){
			e.printStackTrace();
		}
		*/
		int compare = hoOperationStartDate.compareTo(hoOperationEndDate);
		if(compare > 0) {
			System.out.println("========수술 종료일이 시작일보다 이전 날짜로 설정되었습니다.============");
		}else if(compare<0){
			result = hoHOD.updateOperation(hoOperationSub);
		}else {
			result = hoHOD.updateOperation(hoOperationSub);
		}
		return result;
	}
	
	//입원 환자 목록
	public List<HoHospitalization> hospitalizationList(String hoHospitalCode){
		return hoHOD.hospitalizationList(hoHospitalCode);
	}
}
