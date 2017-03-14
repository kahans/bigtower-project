package com.team4.project.government.dto;

import com.team4.project.government.dto.HangleInfo;

public class GoCheckup extends HangleInfo{
	private String goCheckupResultCode;
	private String goTreatCode;
	private String goCheckupResultFilePath;
	private String goCheckupResultFileName;
	private String goCheckupResultRegistrationDate;
	private String goCheckupResultGoRegistrationDate;
	public String getGoCheckupResultCode() {
		return goCheckupResultCode;
	}
	public void setGoCheckupResultCode(String goCheckupResultCode) {
		this.goCheckupResultCode = goCheckupResultCode;
	}
	public String getGoTreatCode() {
		return goTreatCode;
	}
	public void setGoTreatCode(String goTreatCode) {
		this.goTreatCode = goTreatCode;
	}
	public String getGoCheckupResultFilePath() {
		return goCheckupResultFilePath;
	}
	public void setGoCheckupResultFilePath(String goCheckupResultFilePath) {
		this.goCheckupResultFilePath = goCheckupResultFilePath;
	}
	public String getGoCheckupResultFileName() {
		return goCheckupResultFileName;
	}
	public void setGoCheckupResultFileName(String goCheckupResultFileName) {
		this.goCheckupResultFileName = goCheckupResultFileName;
	}
	public String getGoCheckupResultRegistrationDate() {
		return goCheckupResultRegistrationDate;
	}
	public void setGoCheckupResultRegistrationDate(String goCheckupResultRegistrationDate) {
		this.goCheckupResultRegistrationDate = goCheckupResultRegistrationDate;
	}
	public String getGoCheckupResultGoRegistrationDate() {
		return goCheckupResultGoRegistrationDate;
	}
	public void setGoCheckupResultGoRegistrationDate(String goCheckupResultGoRegistrationDate) {
		this.goCheckupResultGoRegistrationDate = goCheckupResultGoRegistrationDate;
	}
	@Override
	public String toString() {
		return "GoCheckup [goCheckupResultCode=" + goCheckupResultCode + ", goTreatCode=" + goTreatCode
				+ ", goCheckupResultFilePath=" + goCheckupResultFilePath + ", goCheckupResultFileName="
				+ goCheckupResultFileName + ", goCheckupResultRegistrationDate=" + goCheckupResultRegistrationDate
				+ ", goCheckupResultGoRegistrationDate=" + goCheckupResultGoRegistrationDate + ", goHospitalName="
				+ goHospitalName + ", goHospitalAddress=" + goHospitalAddress + ", goCitizenName=" + goCitizenName
				+ ", goDoctorName=" + goDoctorName + ", goTreatSubjectName=" + goTreatSubjectName + "]";
	}
	
}
