package com.team4.project.hospital.test.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.team4.project.hospital.test.domain.HoBloodTestSub;
import com.team4.project.hospital.test.domain.HoMediaTestSub;
import com.team4.project.hospital.test.domain.HoTestRequestSub;

@Transactional
@Service
public class HoTestService {

	@Autowired
	private HoTestDao hoTD;
	//검사요청 목록
	public List<HoTestRequestSub> mediaTestList(HoTestRequestSub hmt) {
		// TODO Auto-generated method stub
		return hoTD.mediaList(hmt);
	}
	//혈액 검사 목록
	public List<HoTestRequestSub> bloodTestList(HoTestRequestSub hoTestRequest) {
		
		return hoTD.bloodTestList(hoTestRequest);
	}
	
	//영상글 뷰
	public HoMediaTestSub mediaTestView(String hoTestRequestCode) {
		// TODO Auto-generated method stub
		System.out.println("서비스 "+hoTestRequestCode);
		return hoTD.mediaTestView(hoTestRequestCode);
	}	
	//혈액 검사 글 보기
	public HoBloodTestSub bloodTestView(String hoTestRequestCode) {
		
		return hoTD.bloodTestView(hoTestRequestCode);
		
	}
	
	//파일 경로 하기 
	public int updateMediaTest(HoMediaTestSub mediaView) {
		System.out.println("서비스try전 : "+mediaView.toString());
		String path=mediaView.getHoMediaTestImagePath();
		System.out.println("서비스경로 : "+path);
		File file = null;
		String fileName = "";
		String extention = "";
		MultipartFile multipartFile = mediaView.getUploadFile();
		
		//System.out.println("try들어가기 전 : "+multipartFile);
		try{
		
			
			UUID uuid = UUID.randomUUID();
			fileName = uuid.toString().replace("-", "5");
			int index = multipartFile.getOriginalFilename().lastIndexOf(".");
			extention = multipartFile.getOriginalFilename().substring(index+1);
			fileName=fileName+"."+extention;
			//작업시
			//file = new File(path+"\\"+fileName);
			//배포시
			file = new File(path+"/"+fileName);
			System.out.println("파일 전체경로"+file);
			multipartFile.transferTo(file);
			
			//System.out.println("서비스try후 : "+mediaView.toString());
			
			System.out.println("파일 이름들 : "+fileName);
			mediaView.setHoMediaTestImageName(fileName);
			mediaView.setHoMediaTestImagePath(path);
			hoTD.updateMediaTest(mediaView);
			
			
			
		}catch(IllegalStateException e){
			System.out.println("IllegalStateException 예외발생");
			file.delete();
			e.printStackTrace();
		}catch(IOException e){
			System.out.println("IOException 예외발생");
			file.delete();
			e.printStackTrace();
		}
		return 0;
	}
	
	
	//혈액검사 등록
	public int updateBloodTest(HoBloodTestSub bloodView) {
		// TODO Auto-generated method stub
		String path=bloodView.getHoBloodTestImagePath();
		File file = null;
		String extention = "";
		MultipartFile multipartFile = bloodView.getUploadFile();
		try{
			
				UUID uuid = UUID.randomUUID();
				String fileName = uuid.toString().replace("-", "");
				int index = multipartFile.getOriginalFilename().lastIndexOf(".");
				extention = multipartFile.getOriginalFilename().substring(index+1);
				fileName=fileName+"."+extention;
				//작업시
				//file = new File(path+"\\"+fileName);
				//배포시
				file = new File(path+"/"+fileName);
				
				multipartFile.transferTo(file);
				
			
				bloodView.setHoBloodTestImageName(fileName);
				bloodView.setHoBloodTestImagePath(path);
				System.out.println("서비스try후 : "+bloodView.toString());
				
				hoTD.updateBloodTest(bloodView);
			}catch(IllegalStateException e){
				System.out.println("IllegalStateException 예외발생");
				file.delete();
				e.printStackTrace();
			}catch (IOException e) {
				System.out.println("IOException 예외발생");
				file.delete();
				e.printStackTrace();
			}		
		return 0;
	}
	//검사용청테이블에서 필수 정보만 글에 혈액검사테이블에 등록
	public int addBlood(HoBloodTestSub bloodView) {
		// TODO Auto-generated method stub
		
		return hoTD.addBlood(bloodView);
	}
	public int addMedia(HoMediaTestSub mediaView) {
		// TODO Auto-generated method stub
		return hoTD.addMedia(mediaView);
	}
	//검사대기상테에서 결과대기상태로 상태 코드를 업데이트
	public int updateState(HoTestRequestSub hoTestRequest) {
		// TODO Auto-generated method stub
		return hoTD.updateState(hoTestRequest);
	}
	//결과대기상태에서 결과등록 완료로 상태가 변경
	public int updateBloodTestRequest(HoBloodTestSub bloodView) {
		// TODO Auto-generated method stub
		
		return hoTD.updateBloodTestRequest(bloodView);
	}
	public int updateMediaTestRequest(HoMediaTestSub mediaView) {
		// TODO Auto-generated method stub
		return hoTD.updateMediaTestRequest(mediaView);
	}
	
	
	
}
