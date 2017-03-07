package com.team4.project.hospital.test.domain;

public class HoTestRequestSub extends HoTestRequest{
	protected String hoPatientName;
	protected String hoHospitalCode;
	protected String hoTestStateName;
	
	
	
	public String getHoTestStateName() {
		return hoTestStateName;
	}

	public void setHoTestStateName(String hoTestStateName) {
		this.hoTestStateName = hoTestStateName;
	}

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
				+ ", hoTestStateName=" + hoTestStateName + ", hoTestRequestCode=" + hoTestRequestCode
				+ ", hoTreatmentCode=" + hoTreatmentCode + ", hoTestStateCode=" + hoTestStateCode + ", hoTestCode="
				+ hoTestCode + ", hoTestStartDate=" + hoTestStartDate + ", hoTestEndDate=" + hoTestEndDate + "]";
	}


	
	
}
