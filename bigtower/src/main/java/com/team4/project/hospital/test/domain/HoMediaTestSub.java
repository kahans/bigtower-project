package com.team4.project.hospital.test.domain;

import org.springframework.web.multipart.MultipartFile;

public class HoMediaTestSub extends HoMediaTest {
	private String hoPatientName;
	private String hoTestStateName;
	private String hoMediaFilePath;
	private String hoMediaFileName;
	private MultipartFile hoMediaFile;
	private String hoTestName;
	

	


	public String getHoTestName() {
		return hoTestName;
	}


	public void setHoTestName(String hoTestName) {
		this.hoTestName = hoTestName;
	}


	public MultipartFile getHoMediaFile() {
		return hoMediaFile;
	}


	public void setHoMediaFile(MultipartFile hoMediaFile) {
		this.hoMediaFile = hoMediaFile;
	}


	@Override
	public String toString() {
		return "HoMediaTestSub [hoPatientName=" + hoPatientName + ", hoTestStateName=" + hoTestStateName
				+ ", hoMediaFilePath=" + hoMediaFilePath + ", hoMediaFileName=" + hoMediaFileName + ", hoMediaFile="
				+ hoMediaFile + ", hoTestName=" + hoTestName + ", getHoMediaTestCode()=" + getHoMediaTestCode()
				+ ", getHoTestRequestCode()=" + getHoTestRequestCode() + ", getHoTreatmentCode()="
				+ getHoTreatmentCode() + ", getHoTestStateCode()=" + getHoTestStateCode()
				+ ", getHoMediaTestImagePath()=" + getHoMediaTestImagePath() + ", getHoMediaTestImageName()="
				+ getHoMediaTestImageName() + ", getHoMediaTestDate()=" + getHoMediaTestDate()
				+ ", getHoMediaTestRegistationDate()=" + getHoMediaTestRegistationDate() + ", getHoGoSendState()="
				+ getHoGoSendState() + "]";
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

	public String getHoMediaFilePath() {
		return hoMediaFilePath;
	}

	public void setHoMediaFilePath(String hoMediaFilePath) {
		this.hoMediaFilePath = hoMediaFilePath;
	}

	public String getHoMediaFileName() {
		return hoMediaFileName;
	}

	public void setHoMediaFileName(String hoMediaFileName) {
		this.hoMediaFileName = hoMediaFileName;
	}
	
	
	
}
