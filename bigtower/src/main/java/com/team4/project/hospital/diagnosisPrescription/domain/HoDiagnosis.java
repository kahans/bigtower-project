package com.team4.project.hospital.diagnosisPrescription.domain;

public class HoDiagnosis {

	private String hoDiagnosisCode;
	private String hoTreatmentCode;
	private String hoDiseaseCode;
	private String hoDiagnosisWriteDate;
	private String hoGoSendstate;
	
	public String getHoDiagnosisCode() {
		return hoDiagnosisCode;
	}
	public void setHoDiagnosisCode(String hoDiagnosisCode) {
		this.hoDiagnosisCode = hoDiagnosisCode;
	}
	public String getHoTreatmentCode() {
		return hoTreatmentCode;
	}
	public void setHoTreatmentCode(String hoTreatmentCode) {
		this.hoTreatmentCode = hoTreatmentCode;
	}
	public String getHoDiseaseCode() {
		return hoDiseaseCode;
	}
	public void setHoDiseaseCode(String hoDiseaseCode) {
		this.hoDiseaseCode = hoDiseaseCode;
	}
	public String getHoDiagnosisWriteDate() {
		return hoDiagnosisWriteDate;
	}
	public void setHoDiagnosisWriteDate(String hoDiagnosisWriteDate) {
		this.hoDiagnosisWriteDate = hoDiagnosisWriteDate;
	}
	public String getHoGoSendstate() {
		return hoGoSendstate;
	}
	public void setHoGoSendstate(String hoGoSendstate) {
		this.hoGoSendstate = hoGoSendstate;
	}
	
	@Override
	public String toString() {
		return "HoDiagnosis [hoDiagnosisCode=" + hoDiagnosisCode + ", hoTreatmentCode=" + hoTreatmentCode
				+ ", hoDiseaseCode=" + hoDiseaseCode + ", hoDiagnosisWriteDate=" + hoDiagnosisWriteDate
				+ ", hoGoSendstate=" + hoGoSendstate + "]";
	}
	
	
}
