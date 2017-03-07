package com.team4.project.hospital.test.domain;

import org.springframework.web.multipart.MultipartFile;

public class HoBloodTestSub extends HoBloodTest{
	protected String hoPatientName;//환자명
	protected String hoTestName;//검사명
	protected String hoTestCode;//검사종류 코드
	protected MultipartFile uploadFile ;//파일
	protected String hoHospitalCode;
	
	
	
	public String getHoHospitalCode() {
		return hoHospitalCode;
	}
	public void setHoHospitalCode(String hoHospitalCode) {
		this.hoHospitalCode = hoHospitalCode;
	}
	public String getHoPatientName() {
		return hoPatientName;
	}
	public void setHoPatientName(String hoPatientName) {
		this.hoPatientName = hoPatientName;
	}
	public String getHoTestName() {
		return hoTestName;
	}
	public void setHoTestName(String hoTestName) {
		this.hoTestName = hoTestName;
	}
	public String getHoTestCode() {
		return hoTestCode;
	}
	public void setHoTestCode(String hoTestCode) {
		this.hoTestCode = hoTestCode;
	}
	public MultipartFile getUploadFile() {
		return uploadFile;
	}
	public void setUploadFile(MultipartFile uploadFile) {
		this.uploadFile = uploadFile;
	}
	@Override
	public String toString() {
		return "HoBloodTestSub [hoPatientName=" + hoPatientName + ", hoTestName=" + hoTestName + ", hoTestCode="
				+ hoTestCode + ", uploadFile=" + uploadFile + ", hoHospitalCode=" + hoHospitalCode
				+ ", hoBloodTestCode=" + hoBloodTestCode + ", hoTestRequestCode=" + hoTestRequestCode
				+ ", hoTreatmentCode=" + hoTreatmentCode + ", hoBloodTestPlatelet=" + hoBloodTestPlatelet
				+ ", hoBloodTestSugar=" + hoBloodTestSugar + ", hoBloodTestImagePath=" + hoBloodTestImagePath
				+ ", hoBloodTestImageName=" + hoBloodTestImageName + ", hoBloodTestDate=" + hoBloodTestDate
				+ ", hoBloodTestRegistrationDate=" + hoBloodTestRegistrationDate + ", hoGoSendState=" + hoGoSendState
				+ "]";
	}

	
}
