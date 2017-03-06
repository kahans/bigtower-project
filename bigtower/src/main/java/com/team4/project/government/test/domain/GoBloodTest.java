package com.team4.project.government.test.domain;

import com.team4.project.government.dto.HangleInfo;

public class GoBloodTest extends HangleInfo {
	
	// 혈액검사
	private String goBloodTestCode;
	private String goTreatCode;
	private int goBloodTestBloodSugar;
	private int goBloodTestPlatelet;
	private String goBloodTestFilePath;
	private String goBloodTestFileName;
	private String goBloodTestDate;
	private String goBloodTestGoRegistrationDate;
	
	public String getGoBloodTestCode() {
		return goBloodTestCode;
	}
	public void setGoBloodTestCode(String goBloodTestCode) {
		this.goBloodTestCode = goBloodTestCode;
	}
	public String getGoTreatCode() {
		return goTreatCode;
	}
	public void setGoTreatCode(String goTreatCode) {
		this.goTreatCode = goTreatCode;
	}
	public int getGoBloodTestBloodSugar() {
		return goBloodTestBloodSugar;
	}
	public void setGoBloodTestBloodSugar(int goBloodTestBloodSugar) {
		this.goBloodTestBloodSugar = goBloodTestBloodSugar;
	}
	public int getGoBloodTestPlatelet() {
		return goBloodTestPlatelet;
	}
	public void setGoBloodTestPlatelet(int goBloodTestPlatelet) {
		this.goBloodTestPlatelet = goBloodTestPlatelet;
	}
	public String getGoBloodTestFilePath() {
		return goBloodTestFilePath;
	}
	public void setGoBloodTestFilePath(String goBloodTestFilePath) {
		this.goBloodTestFilePath = goBloodTestFilePath;
	}
	public String getGoBloodTestFileName() {
		return goBloodTestFileName;
	}
	public void setGoBloodTestFileName(String goBloodTestFileName) {
		this.goBloodTestFileName = goBloodTestFileName;
	}
	public String getGoBloodTestDate() {
		return goBloodTestDate;
	}
	public void setGoBloodTestDate(String goBloodTestDate) {
		this.goBloodTestDate = goBloodTestDate;
	}
	public String getGoBloodTestGoRegistrationDate() {
		return goBloodTestGoRegistrationDate;
	}
	public void setGoBloodTestGoRegistrationDate(String goBloodTestGoRegistrationDate) {
		this.goBloodTestGoRegistrationDate = goBloodTestGoRegistrationDate;
	}
	@Override
	public String toString() {
		return "GoBloodTest [goBloodTestCode=" + goBloodTestCode + ", goTreatCode=" + goTreatCode
				+ ", goBloodTestBloodSugar=" + goBloodTestBloodSugar + ", goBloodTestPlatelet=" + goBloodTestPlatelet
				+ ", goBloodTestFilePath=" + goBloodTestFilePath + ", goBloodTestFileName=" + goBloodTestFileName
				+ ", goBloodTestDate=" + goBloodTestDate + ", goBloodTestGoRegistrationDate="
				+ goBloodTestGoRegistrationDate + ", goHospitalName=" + goHospitalName + ", goHospitalAddress="
				+ goHospitalAddress + ", goCitizenName=" + goCitizenName + ", goDoctorName=" + goDoctorName
				+ ", goTreatSubjectName=" + goTreatSubjectName + "]";
	}
	
}
