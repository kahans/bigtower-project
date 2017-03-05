package com.team4.project.hospital.vaccineCheckup.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.team4.project.hospital.vaccineCheckup.domain.HoCheckup;
import com.team4.project.hospital.vaccineCheckup.domain.HoCheckupSub;

@Service
public class HoVaccineCheckupService {

	@Autowired
	private HoVaccineCheckupDao hoVCD;

	//건강검진 목록
	public List<HoCheckup> checkupList(HoCheckup hoCheckup) {
		// TODO Auto-generated method stub
		return hoVCD.checkupList(hoCheckup);
	}

	public HoCheckupSub checkView(String hoTestRequestCode) {
		// TODO Auto-generated method stub
		return hoVCD.checkView(hoTestRequestCode);
	}

	public int checkAdd(HoCheckupSub checkAdd) {
		
		String path=checkAdd.getHoCheckUpResultPath();
		File file = null;
		String extention = "";
		MultipartFile multipartFile = checkAdd.getUploadFile();
		try{
			
				UUID uuid = UUID.randomUUID();
				String fileName = uuid.toString().replace("-", "");
				int index = multipartFile.getOriginalFilename().lastIndexOf(".");
				extention = multipartFile.getOriginalFilename().substring(index+1);
				fileName=fileName+"."+extention;
				file = new File(path+"/"+fileName);
				
				multipartFile.transferTo(file);
				
			
				checkAdd.setHoCheckUpResultName(fileName);
				checkAdd.setHoCheckUpResultPath(path);
				System.out.println("서비스try후 : "+checkAdd.toString());
				
				hoVCD.checkupAdd(checkAdd);
				
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
}
