package com.team4.project.hospital.vaccineCheckup.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.team4.project.hospital.vaccineCheckup.domain.HoCheckup;
import com.team4.project.hospital.vaccineCheckup.domain.HoCheckupSub;
import com.team4.project.hospital.vaccineCheckup.domain.HoVaccine;

@Transactional
@Service
public class HoVaccineCheckupService {

	@Autowired
	private HoVaccineCheckupDao hoVCD;

	//건강검진 목록
	public List<HoCheckup> checkupList(HoCheckup hoCheckup) {		
		return hoVCD.checkupList(hoCheckup);
	}

	//건강검진 상세보기
	public HoCheckupSub checkView(String hoTestRequestCode) {		
		return hoVCD.checkView(hoTestRequestCode);
	}

	//건강검진 업데이트
	public int updateCheck(HoCheckupSub addCheckup) {
		
		String path=addCheckup.getHoCheckUpResultPath();
		File file = null;
		String extention = "";
		MultipartFile multipartFile = addCheckup.getUploadFile();
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
				
			
				addCheckup.setHoCheckUpResultName(fileName);
				addCheckup.setHoCheckUpResultPath(path);
				System.out.println("서비스try후 : "+addCheckup.toString());
				
				hoVCD.updateCheckup(addCheckup);
				
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
	
	//예방접종 등록
	public int addVaccine(HoVaccine hoVaccine) {
		return hoVCD.addVaccine(hoVaccine);		
	}

	public int addCheck(HoCheckupSub checkView) {
		// TODO Auto-generated method stub
		return hoVCD.addCheckup(checkView);
	}
	
}
