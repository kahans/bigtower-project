package com.team4.project.hospital.test.domain;

public class HoTestRequest {
	private String hoTestReqestCode;
	private String hoTreatmentCode;
	private String hoTreatCode;
	private String hoTestStartDate;
	private String hoTestEndDate;
	public String getHoTestReqestCode() {
		return hoTestReqestCode;
	}
	public void setHoTestReqestCode(String hoTestReqestCode) {
		this.hoTestReqestCode = hoTestReqestCode;
	}
	public String getHoTreatmentCode() {
		return hoTreatmentCode;
	}
	public void setHoTreatmentCode(String hoTreatmentCode) {
		this.hoTreatmentCode = hoTreatmentCode;
	}
	public String getHoTreatCode() {
		return hoTreatCode;
	}
	public void setHoTreatCode(String hoTreatCode) {
		this.hoTreatCode = hoTreatCode;
	}
	public String getHoTestStartDate() {
		return hoTestStartDate;
	}
	public void setHoTestStartDate(String hoTestStartDate) {
		this.hoTestStartDate = hoTestStartDate;
	}
	public String getHoTestEndDate() {
		return hoTestEndDate;
	}
	public void setHoTestEndDate(String hoTestEndDate) {
		this.hoTestEndDate = hoTestEndDate;
	}
	@Override
	public String toString() {
		return "HoTestRequest [hoTestReqestCode=" + hoTestReqestCode + ", hoTreatmentCode=" + hoTreatmentCode
				+ ", hoTreatCode=" + hoTreatCode + ", hoTestStartDate=" + hoTestStartDate + ", hoTestEndDate="
				+ hoTestEndDate + "]";
	}
	
	
}
