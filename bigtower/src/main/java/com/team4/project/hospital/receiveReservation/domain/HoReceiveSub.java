package com.team4.project.hospital.receiveReservation.domain;

public class HoReceiveSub extends HoReceive{

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
			+ ", getHoReceiveCode()=" + getHoReceiveCode() + ", getHoHospitalCode()=" + getHoHospitalCode()
			+ ", getHoPatientCode()=" + getHoPatientCode() + ", getHoStaffId()=" + getHoStaffId()
			+ ", getHoTreatSubjectCode()=" + getHoTreatSubjectCode() + ", getHoReceiveStateCode()="
			+ getHoReceiveStateCode() + ", getHoReceivePurpose()=" + getHoReceivePurpose()
			+ ", getHoReceiveRegistrationDate()=" + getHoReceiveRegistrationDate() + ", getHoReceiveCompleteDate()="
			+ getHoReceiveCompleteDate() + "]";
}


}
