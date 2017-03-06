package com.team4.project.hospital.test.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.team4.project.hospital.test.domain.HoBloodTestSub;
import com.team4.project.hospital.test.domain.HoMediaTestSub;
import com.team4.project.hospital.test.domain.HoTestRequestSub;

@Service
public class HoTestService {

	@Autowired
	private HoTestDao hoTD;
	//검사요청 목록
	public List<HoTestRequestSub> mediaTest(HoTestRequestSub hmt) {
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
		String extention = "";
		MultipartFile multipartFile = mediaView.getUploadFile();
		System.out.println(multipartFile);
		try{
		/*	path="D:\\testImage\\";
			String path01=request.getServletContext().getRealPath("resources/file/image");//상대주소
			System.out.println("경로 : "+path01);*/
			//path="/home/hosting_users/myeong3695/tomcat/webapps/upload/";
			UUID uuid = UUID.randomUUID();
			String fileName = uuid.toString().replace("-", "");
			int index = multipartFile.getOriginalFilename().lastIndexOf(".");
			extention = multipartFile.getOriginalFilename().substring(index+1);
			fileName=fileName+"."+extention;
			//배포시
			//file = new File(path+"/"+fileName);
			file = new File(path+"\\"+fileName);
			
			multipartFile.transferTo(file);
			
		
			mediaView.setHoMediaTestImageName(fileName);
			mediaView.setHoMediaTestImagePath(path);
			System.out.println("서비스try후 : "+mediaView.toString());
			
			hoTD.updateMediaTest(mediaView);
			
		}catch(IllegalStateException e){
			System.out.println("IllegalStateException 예외발생");
			file.delete();
			e.printStackTrace();
		}catch (IOException e) {
			System.out.println("IOException 예외발생");
			file.delete();
			e.printStackTrace();
		}		
		System.out.println(mediaView.getHoMediaTestImageName());
		System.out.println(mediaView.getHoMediaTestImagePath());
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
				//배포시
				//file = new File(path+"/"+fileName);
				file = new File(path+"\\"+fileName);
				
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
	
	
	
}
