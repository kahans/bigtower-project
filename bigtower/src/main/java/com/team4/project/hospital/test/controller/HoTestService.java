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

	public int mediaTestAdd(HoMediaTestSub hmts) {
		System.out.println(hmts.getHoMediaFile());
		String path="";
		MultipartFile multipartFile = hmts.getHoMediaFile();
		try{
			path="D:\\testImage\\";
			UUID uuid = UUID.randomUUID();
			String fileName = uuid.toString().replace("-", "");
			File file = new File(fileName);
			multipartFile.transferTo(file);
			
			hmts.setHoMediaFileName(fileName);
			hmts.setHoMediaFilePath(path);
			System.out.println("서비스 : "+hmts.toString());
			hoTD.hoMediaTestAdd(hmts);
		}catch(IllegalStateException e){
			//file.delete();
			e.printStackTrace();
		}catch (IOException e) {
			//file.delete();
			e.printStackTrace();
		}		
		System.out.println(hmts.getHoMediaFileName());
		System.out.println(hmts.getHoMediaFilePath());
		return 0;
	}
}
