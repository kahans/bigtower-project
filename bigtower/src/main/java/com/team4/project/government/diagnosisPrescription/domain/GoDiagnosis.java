package com.team4.project.government.diagnosisPrescription.domain;

public class GoDiagnosis {

	private String goDiagnosisCode;
	private String goTreatCode;
	private String goDiseaseCode;

	// 조인문 데이터
	private String goDiseaseKor;

	public String getGoDiagnosisCode() {
		return goDiagnosisCode;
	}

	public void setGoDiagnosisCode(String goDiagnosisCode) {
		this.goDiagnosisCode = goDiagnosisCode;
	}

	public String getGoTreatCode() {
		return goTreatCode;
	}

	public void setGoTreatCode(String goTreatCode) {
		this.goTreatCode = goTreatCode;
	}

	public String getGoDiseaseCode() {
		return goDiseaseCode;
	}

	public void setGoDiseaseCode(String goDiseaseCode) {
		this.goDiseaseCode = goDiseaseCode;
	}

	public String getGoDiseaseKor() {
		return goDiseaseKor;
	}

	public void setGoDiseaseKor(String goDiseaseKor) {
		this.goDiseaseKor = goDiseaseKor;
	}

}
