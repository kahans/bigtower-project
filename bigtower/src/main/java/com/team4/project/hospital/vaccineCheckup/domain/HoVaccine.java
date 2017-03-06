package com.team4.project.hospital.vaccineCheckup.domain;

public class HoVaccine {

	protected String hoVaccineCode;
	protected String hoTreatmentCode;
	protected String hoVaccineTypeCode;
	protected String hoVaccineDate;
	protected int hoGoSendState;
	
	public String getHoVaccineCode() {
		return hoVaccineCode;
	}
	public void setHoVaccineCode(String hoVaccineCode) {
		this.hoVaccineCode = hoVaccineCode;
	}
	public String getHoTreatmentCode() {
		return hoTreatmentCode;
	}
	public void setHoTreatmentCode(String hoTreatmentCode) {
		this.hoTreatmentCode = hoTreatmentCode;
	}
	public String getHoVaccineTypeCode() {
		return hoVaccineTypeCode;
	}
	public void setHoVaccineTypeCode(String hoVaccineTypeCode) {
		this.hoVaccineTypeCode = hoVaccineTypeCode;
	}
	public String getHoVaccineDate() {
		return hoVaccineDate;
	}
	public void setHoVaccineDate(String hoVaccineDate) {
		this.hoVaccineDate = hoVaccineDate;
	}
	public int getHoGoSendState() {
		return hoGoSendState;
	}
	public void setHoGoSendState(int hoGoSendState) {
		this.hoGoSendState = hoGoSendState;
	}
	@Override
	public String toString() {
		return "HoVaccine [hoVaccineCode=" + hoVaccineCode + ", hoTreatmentCode=" + hoTreatmentCode
				+ ", hoVaccineTypeCode=" + hoVaccineTypeCode + ", hoVaccineDate=" + hoVaccineDate + ", hoGoSendState="
				+ hoGoSendState + "]";
	}
	
	
}
