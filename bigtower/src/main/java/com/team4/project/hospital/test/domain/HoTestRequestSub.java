package com.team4.project.hospital.test.domain;

public class HoTestRequestSub extends HoTestRequest{
	protected String hoPatientName;

	public String getHoPatientName() {
		return hoPatientName;
	}

	public void setHoPatientName(String hoPatientName) {
		this.hoPatientName = hoPatientName;
	}

	@Override
	public String toString() {
		return "HoTestRequestSub [hoPatientName=" + hoPatientName + ", hoTestRequestCode=" + hoTestRequestCode
				+ ", hoTreatmentCode=" + hoTreatmentCode + ", hoTestCode=" + hoTestCode + ", hoTestStartDate="
				+ hoTestStartDate + ", hoTestEndDate=" + hoTestEndDate + "]";
	}


	
	
}
