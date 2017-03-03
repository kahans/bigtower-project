package com.team4.project.hospital.test.domain;

public class HoTestRequestSub extends HoTestRequest{
	private String hoPatientName;

	public String getHoPatientName() {
		return hoPatientName;
	}

	public void setHoPatientName(String hoPatientName) {
		this.hoPatientName = hoPatientName;
	}

	@Override
	public String toString() {
		return "HoTestRequestSub [hoPatientName=" + hoPatientName + ", getHoTestRequestCode()=" + getHoTestRequestCode()
				+ ", getHoTreatmentCode()=" + getHoTreatmentCode() + ", getHoTreatCode()=" + getHoTreatCode()
				+ ", getHoTestStartDate()=" + getHoTestStartDate() + ", getHoTestEndDate()=" + getHoTestEndDate() + "]";
	}
	
	
}
