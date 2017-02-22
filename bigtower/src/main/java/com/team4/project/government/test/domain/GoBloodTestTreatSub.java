package com.team4.project.government.test.domain;

import com.team4.project.government.treat.domain.GoTreat;

public class GoBloodTestTreatSub extends GoTreat {
	
	// 혈액검사
	protected String goBloodTestCode;
	protected int goBloodTestBloodSugar;
	protected int goBloodTestPlatelet;
	protected String goBloodTestFilePath;
	protected String goBloodTestFileName;
	protected String goBloodTestDate;
	protected String goBloodTestGoRegistrationDate;
	
	public String getGoBloodTestCode() {
		return goBloodTestCode;
	}
	public void setGoBloodTestCode(String goBloodTestCode) {
		this.goBloodTestCode = goBloodTestCode;
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
		return "GoBloodTestTreatSub [goBloodTestCode=" + goBloodTestCode + ", goBloodTestBloodSugar="
				+ goBloodTestBloodSugar + ", goBloodTestPlatelet=" + goBloodTestPlatelet + ", goBloodTestFilePath="
				+ goBloodTestFilePath + ", goBloodTestFileName=" + goBloodTestFileName + ", goBloodTestDate="
				+ goBloodTestDate + ", goBloodTestGoRegistrationDate=" + goBloodTestGoRegistrationDate + "]";
	}


	
	
	
	
	
}
