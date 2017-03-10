package com.team4.project.hospital.receiveReservation.domain;

public class HoReceiveSub extends HoReceive {

	private String hoPatientName;
	private String hoTreatSubjectName;
	private String hoReceiveStateName;
	private String hoPatientPhone;

	public String getHoPatientPhone() {
		return hoPatientPhone;
	}

	public void setHoPatientPhone(String hoPatientPhone) {
		this.hoPatientPhone = hoPatientPhone;
	}

	public String getHoReceiveStateName() {
		return hoReceiveStateName;
	}

	public void setHoReceiveStateName(String hoReceiveStateName) {
		this.hoReceiveStateName = hoReceiveStateName;
	}

	public String getHoTreatSubjectName() {
		return hoTreatSubjectName;
	}

	public void setHoTreatSubjectName(String hoTreatSubjectName) {
		this.hoTreatSubjectName = hoTreatSubjectName;
	}

	public String getHoPatientName() {
		return hoPatientName;
	}

	public void setHoPatientName(String hoPatientName) {
		this.hoPatientName = hoPatientName;
	}

	@Override
	public String toString() {
		return "HoReceiveSub [hoPatientName=" + hoPatientName + ", hoTreatSubjectName=" + hoTreatSubjectName
				+ ", hoReceiveStateName=" + hoReceiveStateName + ", hoPatientPhone=" + hoPatientPhone
				+ ", hoReceiveCode=" + hoReceiveCode + ", hoHospitalCode=" + hoHospitalCode + ", hoPatientCode="
				+ hoPatientCode + ", hoStaffId=" + hoStaffId + ", hoTreatSubjectCode=" + hoTreatSubjectCode
				+ ", hoReceiveStateCode=" + hoReceiveStateCode + ", hoReceivePurpose=" + hoReceivePurpose
				+ ", hoReceiveRegistrationDate=" + hoReceiveRegistrationDate + ", hoReceiveCompleteDate="
				+ hoReceiveCompleteDate + "]";
	}

}
