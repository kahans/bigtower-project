package com.team4.project.government.hopitalizationSurgery.domain;

import org.springframework.format.annotation.DateTimeFormat;

public class GoSurgery {
	private String goSurgeryResultCode;
	private String goTreatCode;
	private String goSurgeryCode;
	//날짜
	@DateTimeFormat(pattern="yyyy/MM/dd hh:mm:ss")
	private String goSurgeryResultGoRegistrationDate;
	//DB에서 조인문을 통해서 받는 값들
	private String goHospitalName;
	private String goSurgeryName;
	private String goDoctorName;
	
	public String getGoDoctorName() {
		return goDoctorName;
	}
	public void setGoDoctorName(String goDoctorName) {
		this.goDoctorName = goDoctorName;
	}
	public String getGoHospitalName() {
		return goHospitalName;
	}
	public void setGoHospitalName(String goHospitalName) {
		this.goHospitalName = goHospitalName;
	}
	public String getGoSurgeryName() {
		return goSurgeryName;
	}
	public void setGoSurgeryName(String goSurgeryName) {
		this.goSurgeryName = goSurgeryName;
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
		return "GoSurgery [goSurgeryResultCode=" + goSurgeryResultCode + ", goTreatCode=" + goTreatCode
				+ ", goSurgeryCode=" + goSurgeryCode + ", goSurgeryResultGoRegistrationDate="
				+ goSurgeryResultGoRegistrationDate + ", goHospitalName=" + goHospitalName + ", goSurgeryName="
				+ goSurgeryName + ", goDoctorName=" + goDoctorName + "]";
	}
	
}
