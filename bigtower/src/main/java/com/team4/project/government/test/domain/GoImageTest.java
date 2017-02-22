package com.team4.project.government.test.domain;

import com.team4.project.government.treat.domain.GoTreat;

public class GoImageTest extends GoTreat{
	private String goImageTestCode;
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
	@Override
	public String toString() {
		return "GoImageTest [goImageTestCode=" + goImageTestCode + ", goImageTestFilePath=" + goImageTestFilePath
				+ ", goImageTestFileName=" + goImageTestFileName + ", goImageTestDate=" + goImageTestDate
				+ ", goImageTestGoRegistrationDate=" + goImageTestGoRegistrationDate + "]";
	}
	
	
}
