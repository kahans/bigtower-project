package com.team4.project.government.vaccinationCheckup.domain;

import com.team4.project.government.dto.HangleInfo;

public class GoVaccinationResult extends HangleInfo{
	
	private String goVaccinationResultCode;
	private String goTreatCode;
	private String goVaccinationCode;
	private String goVaccinationResultDegree; //예방접종 몇차까지 접종 받았는지의 결과
	private String goVaccinationResultRegistrationDate; //병원결과등록일
	private String goVaccinationResultGoRegistrationDate; //정부DB등록일
	private String goVaccinationName; //예방접종명
	public String getGoVaccinationResultCode() {
		return goVaccinationResultCode;
	}
	public void setGoVaccinationResultCode(String goVaccinationResultCode) {
		this.goVaccinationResultCode = goVaccinationResultCode;
	}
	public String getGoTreatCode() {
		return goTreatCode;
	}
	public void setGoTreatCode(String goTreatCode) {
		this.goTreatCode = goTreatCode;
	}
	public String getGoVaccinationCode() {
		return goVaccinationCode;
	}
	public void setGoVaccinationCode(String goVaccinationCode) {
		this.goVaccinationCode = goVaccinationCode;
	}
	public String getGoVaccinationResultDegree() {
		return goVaccinationResultDegree;
	}
	public void setGoVaccinationResultDegree(String goVaccinationResultDegree) {
		this.goVaccinationResultDegree = goVaccinationResultDegree;
	}
	public String getGoVaccinationResultRegistrationDate() {
		return goVaccinationResultRegistrationDate;
	}
	public void setGoVaccinationResultRegistrationDate(String goVaccinationResultRegistrationDate) {
		this.goVaccinationResultRegistrationDate = goVaccinationResultRegistrationDate;
	}
	public String getGoVaccinationResultGoRegistrationDate() {
		return goVaccinationResultGoRegistrationDate;
	}
	public void setGoVaccinationResultGoRegistrationDate(String goVaccinationResultGoRegistrationDate) {
		this.goVaccinationResultGoRegistrationDate = goVaccinationResultGoRegistrationDate;
	}
	
	public String getGoVaccinationName() {
		return goVaccinationName;
	}
	public void setGoVaccinationName(String goVaccinationName) {
		this.goVaccinationName = goVaccinationName;
	}
	@Override
	public String toString() {
		return "GoVaccinationResult [goVaccinationResultCode=" + goVaccinationResultCode + ", goTreatCode="
				+ goTreatCode + ", goVaccinationCode=" + goVaccinationCode + ", goVaccinationResultDegree="
				+ goVaccinationResultDegree + ", goVaccinationResultRegistrationDate="
				+ goVaccinationResultRegistrationDate + ", goVaccinationResultGoRegistrationDate="
				+ goVaccinationResultGoRegistrationDate + ", goVaccinationName=" + goVaccinationName + "]";
	}
	
	

}
