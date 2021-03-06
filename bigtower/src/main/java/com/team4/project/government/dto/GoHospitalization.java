package com.team4.project.government.dto;

import com.team4.project.government.dto.HangleInfo;

public class GoHospitalization extends HangleInfo{
	protected String goHospitalizationCode;
	protected String goTreatCode;
	protected String goHospitalizationEnterDate;
	protected String goHospitalizationExitDate;
	
	
	public String getGoHospitalizationCode() {
		return goHospitalizationCode;
	}
	public void setGoHospitalizationCode(String goHospitalizationCode) {
		this.goHospitalizationCode = goHospitalizationCode;
	}
	public String getGoTreatCode() {
		return goTreatCode;
	}
	public void setGoTreatCode(String goTreatCode) {
		this.goTreatCode = goTreatCode;
	}
	public String getGoHospitalizationEnterDate() {
		return goHospitalizationEnterDate;
	}
	public void setGoHospitalizationEnterDate(String goHospitalizationEnterDate) {
		this.goHospitalizationEnterDate = goHospitalizationEnterDate;
	}
	public String getGoHospitalizationExitDate() {
		return goHospitalizationExitDate;
	}
	public void setGoHospitalizationExitDate(String goHospitalizationExitDate) {
		this.goHospitalizationExitDate = goHospitalizationExitDate;
	}
	@Override
	public String toString() {
		return "GoHospitalization [goHospitalizationCode=" + goHospitalizationCode + ", goTreatCode=" + goTreatCode
				+ ", goHospitalizationEnterDate=" + goHospitalizationEnterDate + ", goHospitalizationExitDate="
				+ goHospitalizationExitDate + "]";
	}
	
	
}
