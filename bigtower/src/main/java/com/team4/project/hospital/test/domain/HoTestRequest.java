package com.team4.project.hospital.test.domain;

public class HoTestRequest {
	protected String hoTestRequestCode;
	protected String hoTreatmentCode;
	protected int hoTestStateCode;
	protected String hoTestCode;
	protected String hoTestStartDate;
	protected String hoTestEndDate;
	
	
	
	public int getHoTestStateCode() {
		return hoTestStateCode;
	}
	public void setHoTestStateCode(int hoTestStateCode) {
		this.hoTestStateCode = hoTestStateCode;
	}
	public String getHoTestRequestCode() {
		return hoTestRequestCode;
	}
	public void setHoTestRequestCode(String hoTestRequestCode) {
		this.hoTestRequestCode = hoTestRequestCode;
	}
	public String getHoTreatmentCode() {
		return hoTreatmentCode;
	}
	public void setHoTreatmentCode(String hoTreatmentCode) {
		this.hoTreatmentCode = hoTreatmentCode;
	}
	
	public String getHoTestCode() {
		return hoTestCode;
	}
	public void setHoTestCode(String hoTestCode) {
		this.hoTestCode = hoTestCode;
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
		return "HoTestRequest [hoTestRequestCode=" + hoTestRequestCode + ", hoTreatmentCode=" + hoTreatmentCode
				+ ", hoTreatCode=" + hoTestCode + ", hoTestStartDate=" + hoTestStartDate + ", hoTestEndDate="
				+ hoTestEndDate + "]";
	}

	
	
}
