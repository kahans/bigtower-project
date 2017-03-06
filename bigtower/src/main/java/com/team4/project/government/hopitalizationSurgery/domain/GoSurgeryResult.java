package com.team4.project.government.hopitalizationSurgery.domain;

import org.springframework.format.annotation.DateTimeFormat;

import com.team4.project.government.dto.HangleInfo;

public class GoSurgeryResult extends HangleInfo{
	protected String goSurgeryResultCode;
	protected String goTreatCode;
	protected String goSurgeryCode;
	protected String goSurgeryName;
	//날짜
	@DateTimeFormat(pattern="yyyy/MM/dd hh:mm:ss")
	protected String goSurgeryResultRegistrationDate;
	@DateTimeFormat(pattern="yyyy/MM/dd hh:mm:ss")
	protected String goSurgeryResultGoRegistrationDate;
	
	
	public String getGoSurgeryResultCode() {
		return goSurgeryResultCode;
	}
	public void setGoSurgeryResultCode(String goSurgeryResultCode) {
		this.goSurgeryResultCode = goSurgeryResultCode;
	}
	public String getGoTreatCode() {
		return goTreatCode;
	}
	public void setGoTreatCode(String goTreatCode) {
		this.goTreatCode = goTreatCode;
	}
	public String getGoSurgeryCode() {
		return goSurgeryCode;
	}
	public void setGoSurgeryCode(String goSurgeryCode) {
		this.goSurgeryCode = goSurgeryCode;
	}
	public String getGoSurgeryResultGoRegistrationDate() {
		return goSurgeryResultGoRegistrationDate;
	}
	public void setGoSurgeryResultGoRegistrationDate(String goSurgeryResultGoRegistrationDate) {
		this.goSurgeryResultGoRegistrationDate = goSurgeryResultGoRegistrationDate;
	}
	@Override
	public String toString() {
		return "GoSurgery [goSurgeryResultCode=" + goSurgeryResultCode + ", goTreatCode=" + goTreatCode
				+ ", goSurgeryCode=" + goSurgeryCode + ", goSurgeryResultGoRegistrationDate="
				+ goSurgeryResultGoRegistrationDate + "]";
	}
	
}
