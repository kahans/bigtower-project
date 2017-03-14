package com.team4.project.government.dto;

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
	
	
	public String getGoSurgeryName() {
		return goSurgeryName;
	}
	public void setGoSurgeryName(String goSurgeryName) {
		this.goSurgeryName = goSurgeryName;
	}
	public String getGoSurgeryResultRegistrationDate() {
		return goSurgeryResultRegistrationDate;
	}
	public void setGoSurgeryResultRegistrationDate(String goSurgeryResultRegistrationDate) {
		this.goSurgeryResultRegistrationDate = goSurgeryResultRegistrationDate;
	}
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
		return "GoSurgeryResult [goSurgeryResultCode=" + goSurgeryResultCode + ", goTreatCode=" + goTreatCode
				+ ", goSurgeryCode=" + goSurgeryCode + ", goSurgeryName=" + goSurgeryName
				+ ", goSurgeryResultRegistrationDate=" + goSurgeryResultRegistrationDate
				+ ", goSurgeryResultGoRegistrationDate=" + goSurgeryResultGoRegistrationDate + "]";
	}
	
}
