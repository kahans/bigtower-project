package com.team4.project.hospital.vaccineCheckup.domain;

import org.springframework.web.multipart.MultipartFile;

public class HoCheckupSub extends HoCheckup{
	protected String hoPatientName;
	protected String hoTestStateName;
	protected String hoTestName;
	protected String hoTestCode;
	protected MultipartFile uploadFile;
	
	
	
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
		return "HoCheckupSub [hoPatientName=" + hoPatientName + ", hoTestStateName=" + hoTestStateName + ", hoTestName="
				+ hoTestName + ", hoTestCode=" + hoTestCode + ", uploadFile=" + uploadFile + ", hoCheckUpCode="
				+ hoCheckUpCode + ", hoTreatmentCode=" + hoTreatmentCode + ", hoCheckUpResultPath="
				+ hoCheckUpResultPath + ", hoCheckUpResultName=" + hoCheckUpResultName + ", hoCheckUpDate="
				+ hoCheckUpDate + ", hoCheckUpRegistrationDate=" + hoCheckUpRegistrationDate + ", hoTestStateCode="
				+ hoTestStateCode + ", hoGoSendstate=" + hoGoSendstate + "]";
	}
	
	
	
}
