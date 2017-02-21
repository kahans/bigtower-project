package com.team4.project.government.hopitalizationSurgery.domain;

import java.util.List;

import com.team4.project.government.diagnosisPrescription.domain.GoDiagnosis;

public class GoHospitalization {
	private String goHospitalizationCode;
	private String goTreatCode;
	private String goHospitalizationEnterDate;
	private String goHospitalizationExitDate;
	//DB에서 조인문을 통해서 받는 값들
	private String goHospitalName;
	private List<GoDiagnosis> diagnosisList;
	
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
	public String getGoHospitalName() {
		return goHospitalName;
	}
	public void setGoHospitalName(String goHospitalName) {
		this.goHospitalName = goHospitalName;
	}
	public List<GoDiagnosis> getDiagnosisList() {
		return diagnosisList;
	}
	public void setDiagnosisList(List<GoDiagnosis> diagnosisList) {
		this.diagnosisList = diagnosisList;
	}
	@Override
	public String toString() {
		return "GoHospitalization [goHospitalizationCode=" + goHospitalizationCode + ", goTreatCode=" + goTreatCode
				+ ", goHospitalizationEnterDate=" + goHospitalizationEnterDate + ", goHospitalizationExitDate="
				+ goHospitalizationExitDate + ", goHospitalName=" + goHospitalName + ", diagnosisList=" + diagnosisList
				+ "]";
	}
	
}
