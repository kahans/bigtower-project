package com.team4.project.hospital.receiveReservation.domain;

public class HoReceive {

private String hoReceiveCode;
private String hoHospitalCode;
private String hoPatientCode;
private String hoStaffId;
private String hoTreatSubjectCode;
private int hoReceiveStateCode;
private String hoReceivePurpose;
private String hoReceiveRegistrationDate;
private String hoReceiveCompleteDate;


public String getHoReceiveCode() {
	return hoReceiveCode;
}
public void setHoReceiveCode(String hoReceiveCode) {
	this.hoReceiveCode = hoReceiveCode;
}
public String getHoHospitalCode() {
	return hoHospitalCode;
}
public void setHoHospitalCode(String hoHospitalCode) {
	this.hoHospitalCode = hoHospitalCode;
}
public String getHoPatientCode() {
	return hoPatientCode;
}
public void setHoPatientCode(String hoPatientCode) {
	this.hoPatientCode = hoPatientCode;
}
public String getHoStaffId() {
	return hoStaffId;
}
public void setHoStaffId(String hoStaffId) {
	this.hoStaffId = hoStaffId;
}
public String getHoTreatSubjectCode() {
	return hoTreatSubjectCode;
}
public void setHoTreatSubjectCode(String hoTreatSubjectCode) {
	this.hoTreatSubjectCode = hoTreatSubjectCode;
}
public int getHoReceiveStateCode() {
	return hoReceiveStateCode;
}
public void setHoReceiveStateCode(int hoReceiveStateCode) {
	this.hoReceiveStateCode = hoReceiveStateCode;
}
public String getHoReceivePurpose() {
	return hoReceivePurpose;
}
public void setHoReceivePurpose(String hoReceivePurpose) {
	this.hoReceivePurpose = hoReceivePurpose;
}
public String getHoReceiveRegistrationDate() {
	return hoReceiveRegistrationDate;
}
public void setHoReceiveRegistrationDate(String hoReceiveRegistrationDate) {
	this.hoReceiveRegistrationDate = hoReceiveRegistrationDate;
}
public String getHoReceiveCompleteDate() {
	return hoReceiveCompleteDate;
}
public void setHoReceiveCompleteDate(String hoReceiveCompleteDate) {
	this.hoReceiveCompleteDate = hoReceiveCompleteDate;
}

@Override
public String toString() {
	return "HoReceive [hoReceiveCode=" + hoReceiveCode + ", hoHospitalCode=" + hoHospitalCode + ", hoPatientCode="
			+ hoPatientCode + ", hoStaffId=" + hoStaffId + ", hoTreatSubjectCode=" + hoTreatSubjectCode
			+ ", hoReceiveStateCode=" + hoReceiveStateCode + ", hoReceivePurpose=" + hoReceivePurpose
			+ ", hoReceiveRegistrationDate=" + hoReceiveRegistrationDate + ", hoReceiveCompleteDate="
			+ hoReceiveCompleteDate + "]";
}


}
