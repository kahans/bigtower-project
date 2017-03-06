package com.team4.project.government.vaccinationCheckup.domain;

import com.team4.project.government.dto.HangleInfo;

public class GoCheckup extends HangleInfo{
	private String goCheckUpResultCode;
	private String goTreatCode;
	private String goCheckUpResultFilePath;
	private String goCheckUpResultFileName;
	private String goCheckUpResultRegistrationDate;
	private String goCheckUpResultGoRegistrationDate;

	public String getGoCheckUpResultCode() {
		return goCheckUpResultCode;
	}
	public void setGoCheckUpResultCode(String goCheckUpResultCode) {
		this.goCheckUpResultCode = goCheckUpResultCode;
	}
	
	public String getGoCheckUpResultFilePath() {
		return goCheckUpResultFilePath;
	}
	public void setGoCheckUpResultFilePath(String goCheckUpResultFilePath) {
		this.goCheckUpResultFilePath = goCheckUpResultFilePath;
	}
	public String getGoCheckUpResultFileName() {
		return goCheckUpResultFileName;
	}
	public void setGoCheckUpResultFileName(String goCheckUpResultFileName) {
		this.goCheckUpResultFileName = goCheckUpResultFileName;
	}
	public String getGoCheckUpResultRegistrationDate() {
		return goCheckUpResultRegistrationDate;
	}
	public void setGoCheckUpResultRegistrationDate(String goCheckUpResultRegistrationDate) {
		this.goCheckUpResultRegistrationDate = goCheckUpResultRegistrationDate;
	}
	public String getGoCheckUpResultGoRegistrationDate() {
		return goCheckUpResultGoRegistrationDate;
	}
	public void setGoCheckUpResultGoRegistrationDate(String goCheckUpResultGoRegistrationDate) {
		this.goCheckUpResultGoRegistrationDate = goCheckUpResultGoRegistrationDate;
	}
	public String getGoTreatCode() {
		return goTreatCode;
	}
	public void setGoTreatCode(String goTreatCode) {
		this.goTreatCode = goTreatCode;
	}
	@Override
	public String toString() {
		return "GoCheckup [goCheckUpResultCode=" + goCheckUpResultCode + ", goTreatCode=" + goTreatCode
				+ ", goCheckUpResultFilePath=" + goCheckUpResultFilePath + ", goCheckUpResultFileName="
				+ goCheckUpResultFileName + ", goCheckUpResultRegistrationDate=" + goCheckUpResultRegistrationDate
				+ ", goCheckUpResultGoRegistrationDate=" + goCheckUpResultGoRegistrationDate + "]";
	}
	
	
	
}
