package com.team4.project.hospital.test.domain;

public class HoTestRequestSub extends HoTestRequest{
	protected String hoPatientName;
	protected String hoHospitalCode;
	public String getHoPatientName() {
		return hoPatientName;
	}

	public void setHoPatientName(String hoPatientName) {
		this.hoPatientName = hoPatientName;
	}

	

	
	public String getHoHospitalCode() {
		return hoHospitalCode;
	}

	public void setHoHospitalCode(String hoHospitalCode) {
		this.hoHospitalCode = hoHospitalCode;
	}

	@Override
	public String toString() {
		return "HoTestRequestSub [hoPatientName=" + hoPatientName + ", hoHospitalCode=" + hoHospitalCode
				+ ", hoTestRequestCode=" + hoTestRequestCode + ", hoTreatmentCode=" + hoTreatmentCode + ", hoTestCode="
				+ hoTestCode + ", hoTestStartDate=" + hoTestStartDate + ", hoTestEndDate=" + hoTestEndDate + "]";
	}


	
	
}
