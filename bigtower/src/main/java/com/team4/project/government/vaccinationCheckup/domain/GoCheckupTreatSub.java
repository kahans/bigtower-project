package com.team4.project.government.vaccinationCheckup.domain;

import com.team4.project.government.treat.domain.GoTreat;

public class GoCheckupTreatSub extends GoTreat{
	protected String goCheckUpResultCode;
	protected String goCheckUpResultFilePath;
	protected String goCheckUpResultFileName;
	protected String goCheckUpResultRegistrationDate;
	protected String goCheckUpResultGoRegistrationDate;
	protected String goHospitalName;
	protected String goDoctorName;
	
	
	public String getGoHospitalName() {
		return goHospitalName;
	}
	public void setGoHospitalName(String goHospitalName) {
		this.goHospitalName = goHospitalName;
	}
	public String getGoDoctorName() {
		return goDoctorName;
	}
	public void setGoDoctorName(String goDoctorName) {
		this.goDoctorName = goDoctorName;
	}
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
	

	
	

	
}