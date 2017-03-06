package com.team4.project.government.test.domain;

import com.team4.project.government.dto.HangleInfo;

public class GoImageTest extends HangleInfo{
	private String goImageTestCode;
	private String goTreatCode;
	private String goImageTestFilePath;
	private String goImageTestFileName;
	private String goImageTestDate;
	private String goImageTestGoRegistrationDate;

	public GoImageTest() {
		super();
	}
	public String getGoImageTestCode() {
		return goImageTestCode;
	}
	public void setGoImageTestCode(String goImageTestCode) {
		this.goImageTestCode = goImageTestCode;
	}
	public String getGoImageTestFilePath() {
		return goImageTestFilePath;
	}
	public void setGoImageTestFilePath(String goImageTestFilePath) {
		this.goImageTestFilePath = goImageTestFilePath;
	}
	public String getGoImageTestFileName() {
		return goImageTestFileName;
	}
	public void setGoImageTestFileName(String goImageTestFileName) {
		this.goImageTestFileName = goImageTestFileName;
	}
	public String getGoImageTestDate() {
		return goImageTestDate;
	}
	public void setGoImageTestDate(String goImageTestDate) {
		this.goImageTestDate = goImageTestDate;
	}
	public String getGoImageTestGoRegistrationDate() {
		return goImageTestGoRegistrationDate;
	}
	public void setGoImageTestGoRegistrationDate(String goImageTestGoRegistrationDate) {
		this.goImageTestGoRegistrationDate = goImageTestGoRegistrationDate;
	}
	public String getGoTreatCode() {
		return goTreatCode;
	}
	public void setGoTreatCode(String goTreatCode) {
		this.goTreatCode = goTreatCode;
	}
	@Override
	public String toString() {
		return "GoImageTest [goImageTestCode=" + goImageTestCode + ", goTreatCode=" + goTreatCode
				+ ", goImageTestFilePath=" + goImageTestFilePath + ", goImageTestFileName=" + goImageTestFileName
				+ ", goImageTestDate=" + goImageTestDate + ", goImageTestGoRegistrationDate="
				+ goImageTestGoRegistrationDate + ", goHospitalName=" + goHospitalName + ", goHospitalAddress="
				+ goHospitalAddress + ", goCitizenName=" + goCitizenName + ", goDoctorName=" + goDoctorName
				+ ", goTreatSubjectName=" + goTreatSubjectName + "]";
	}
}
