package com.team4.project.hospital.test.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

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

	public HoMediaTestSub mediaTestView(String hoTestRequestCode) {
		// TODO Auto-generated method stub
		return hoTD.mediaTestView(hoTestRequestCode);
	}

	public int mediaTestAdd(HoMediaTestSub mediaView) {
		System.out.println("서비스try전 : "+mediaView.toString());
		System.out.println();
		String path="";
		File file = null;
		MultipartFile multipartFile = mediaView.getUploadFile();
		try{
			path="D:\\testImage\\";
			UUID uuid = UUID.randomUUID();
			String fileName = uuid.toString().replace("-", "");
			file = new File(fileName+path);
			multipartFile.transferTo(file);
			
			mediaView= new HoMediaTestSub();
			mediaView.setHoMediaFileName(fileName);
			mediaView.setHoMediaFilePath(path);
			System.out.println("서비스try후 : "+mediaView.toString());
			
			hoTD.hoMediaTestAdd(mediaView);
			
		}catch(IllegalStateException e){
			System.out.println("IllegalStateException 예외발생");
			file.delete();
			e.printStackTrace();
		}catch (IOException e) {
			System.out.println("IOException 예외발생");
			file.delete();
			e.printStackTrace();
		}		
		System.out.println(mediaView.getHoMediaFileName());
		System.out.println(mediaView.getHoMediaFilePath());
		return 0;
	}
}
