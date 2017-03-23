package com.team4.project.hospital.hospitalizationOperation.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;
import com.team4.project.hospital.dto.HoOperationType;
import com.team4.project.hospital.hospitalizationOperation.domain.HoHospitalization;
import com.team4.project.hospital.hospitalizationOperation.domain.HoHospitalizationRequest;
import com.team4.project.hospital.hospitalizationOperation.domain.HoOperation;
import com.team4.project.hospital.hospitalizationOperation.domain.HoOperationSub;
import com.team4.project.util.GetReferenceData;

@Transactional
@Service
public class HoHospitalizationOperationService {
	Gson gson = new Gson();
	private static final Logger logger = LoggerFactory.getLogger(HoHospitalizationOperationService.class);
	
	@Autowired
	private HoHospitalizationOperationDao hoHOD;
	
	//수술 등록
	public int addOperation(HoOperation hoOperation){
		return hoHOD.addOperation(hoOperation);
	}
	
	//수술 목록
	public List<HoOperationSub> operationList(String hoHospitalCode, String doctorId){
		List<HoOperationType> operationTypeList = GetReferenceData.getSurgeryCode(doctorId);
		List<HoOperationSub> operationList = hoHOD.operationList(hoHospitalCode);
		//정부에서 수술코드 가져와 해당하는 이름을 찾아서 수술목록에 셋팅
		for(int i =0;i<operationList.size();i++){
			String hoOperationTypeCode = operationList.get(i).getHoOperationTypeCode();
			logger.info(i+"번째 hoOperationTypeCode : "+hoOperationTypeCode);
			for(int j=0;j<operationTypeList.size();j++){
				if(operationTypeList.get(j).getHoOperationTypeCode().equals(hoOperationTypeCode)){
					operationList.get(i).setHoOperationTypeName(operationTypeList.get(j).getHoOperationTypeName());
				}
			}
		}
		return operationList;
	}
	
	//입퇴원 요청 목록
	public List<HoHospitalizationRequest> hospitalizationRequestList(String hoHospitalCode){
		return hoHOD.hospitalizationRequestList(hoHospitalCode);
	}
	
	//입원 등록
	public int addHospitalization(Map<String, Object> map){
		String hoHospitalizationRequestCode = (String) map.get("hoHospitalizationRequestCode");
		int result = hoHOD.updateHospitalizationRequest(hoHospitalizationRequestCode);
		logger.debug("입퇴원 요청테이블 상태코드 업데이트 결과는 ? "+result);
		return hoHOD.addHospitalization(map);
	}
	
	//퇴원일 업데이트
	public int updateHospitalization(String hoHospitalizationCode){
		logger.debug("서비스의 hoHospitalizationCode : "+ hoHospitalizationCode);
		return hoHOD.updateHospitalization(hoHospitalizationCode);
	}
	
	//수술 상세보기
	public HoOperationSub operationView(String hoOperationCode, String doctorId){
		List<HoOperationType> operationTypeList = GetReferenceData.getSurgeryCode(doctorId);
		HoOperationSub hoOperationSub = hoHOD.operationView(hoOperationCode);
		String hoOperationTypeCode = hoOperationSub.getHoOperationTypeCode();
		for(int i=0;i<operationTypeList.size();i++){
			if(operationTypeList.get(i).getHoOperationTypeCode().equals(hoOperationTypeCode)){
				hoOperationSub.setHoOperationTypeName(operationTypeList.get(i).getHoOperationTypeName());
			}
		}
		return hoOperationSub;
	}
	
	//수술일지 수정
	public int updateOperation(HoOperationSub hoOperationSub){
		//수술 시작일과 종료일을 비교하여 종료일이 더 이전날짜일 경우 수정이 안되도록 비교하는 로직 추가
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String startDate = hoOperationSub.getHoOperationStartDate();
		Date hoOperationStartDate = null;
		try {
			hoOperationStartDate = format.parse(startDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Date hoOperationEndDate = hoOperationSub.getHoOperationEndDate();
		logger.debug("hoOperationStartDate : "+hoOperationStartDate);
		logger.debug("hoOperationEndDate : "+hoOperationEndDate);
		
		int result = 0;
		
		int compare = hoOperationStartDate.compareTo(hoOperationEndDate);
		if(compare > 0) {
			logger.debug("========수술 종료일이 시작일보다 이전 날짜로 설정되었습니다.============");
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
