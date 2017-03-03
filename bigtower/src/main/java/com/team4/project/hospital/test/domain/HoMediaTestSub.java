package com.team4.project.hospital.test.domain;

import org.springframework.web.multipart.MultipartFile;

public class HoMediaTestSub extends HoMediaTest {
	protected String hoPatientName;//환자명
	protected String hoTestStateName;//검사상태
	protected String hoTestName;//검사명
	protected String hoTestCode;//검사종류 코드
	protected MultipartFile uploadFile ;//파일
	


	public String getHoTestCode() {
		return hoTestCode;
	}


	public void setHoTestCode(String hoTestCode) {
		this.hoTestCode = hoTestCode;
	}


	public String getHoTestName() {
		return hoTestName;
	}


	public void setHoTestName(String hoTestName) {
		this.hoTestName = hoTestName;
	}



	public MultipartFile getUploadFile() {
		return uploadFile;
	}


	public void setUploadFile(MultipartFile uploadFile) {
		this.uploadFile = uploadFile;
	}


	@Override
	public String toString() {
		return "HoMediaTestSub [hoPatientName=" + hoPatientName + ", hoTestStateName=" + hoTestStateName
				+ ", hoTestName=" + hoTestName + ", hoTestCode=" + hoTestCode + ", uploadFile=" + uploadFile
				+ ", hoMediaTestCode=" + hoMediaTestCode + ", hoTestRequestCode=" + hoTestRequestCode
				+ ", hoTreatmentCode=" + hoTreatmentCode + ", hoTestStateCode=" + hoTestStateCode
				+ ", hoMediaTestImagePath=" + hoMediaTestImagePath + ", hoMediaTestImageName=" + hoMediaTestImageName
				+ ", hoMediaTestDate=" + hoMediaTestDate + ", hoMediaTestRegistationDate=" + hoMediaTestRegistationDate
				+ ", hoGoSendState=" + hoGoSendState + "]";
	}


	public String getHoPatientName() {
		return hoPatientName;
	}

	public void setHoPatientName(String hoPatientName) {
		this.hoPatientName = hoPatientName;
	}

	public String getHoTestStateName() {
		return hoTestStateName;
	}

	public void setHoTestStateName(String hoTestStateName) {
		this.hoTestStateName = hoTestStateName;
	}


	
	
}
