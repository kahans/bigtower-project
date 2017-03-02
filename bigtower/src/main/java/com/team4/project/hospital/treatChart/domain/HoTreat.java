package com.team4.project.hospital.treatChart.domain;

public class HoTreat {

private String hoTreatmentCode;
private String hoDoctorId;
private String hoHospitalizationStateCode;
private String hoChartCode;
private String hoPatientCode;
private String hoHospitalCode;
private String hoTreatSubjectCode;
private String hoTreatmentContents;
private String hoTreatmentWriteDate;
private String hoGoSendstate;
public String getHoTreatmentCode() {
	return hoTreatmentCode;
}
public void setHoTreatmentCode(String hoTreatmentCode) {
	this.hoTreatmentCode = hoTreatmentCode;
}
public String getHoDoctorId() {
	return hoDoctorId;
}
public void setHoDoctorId(String hoDoctorId) {
	this.hoDoctorId = hoDoctorId;
}
public String getHoHospitalizationStateCode() {
	return hoHospitalizationStateCode;
}
public void setHoHospitalizationStateCode(String hoHospitalizationStateCode) {
	this.hoHospitalizationStateCode = hoHospitalizationStateCode;
}
public String getHoChartCode() {
	return hoChartCode;
}
public void setHoChartCode(String hoChartCode) {
	this.hoChartCode = hoChartCode;
}
public String getHoPatientCode() {
	return hoPatientCode;
}
public void setHoPatientCode(String hoPatientCode) {
	this.hoPatientCode = hoPatientCode;
}
public String getHoHospitalCode() {
	return hoHospitalCode;
}
public void setHoHospitalCode(String hoHospitalCode) {
	this.hoHospitalCode = hoHospitalCode;
}
public String getHoTreatSubjectCode() {
	return hoTreatSubjectCode;
}
public void setHoTreatSubjectCode(String hoTreatSubjectCode) {
	this.hoTreatSubjectCode = hoTreatSubjectCode;
}
public String getHoTreatmentContents() {
	return hoTreatmentContents;
}
public void setHoTreatmentContents(String hoTreatmentContents) {
	this.hoTreatmentContents = hoTreatmentContents;
}
public String getHoTreatmentWriteDate() {
	return hoTreatmentWriteDate;
}
public void setHoTreatmentWriteDate(String hoTreatmentWriteDate) {
	this.hoTreatmentWriteDate = hoTreatmentWriteDate;
}
public String getHoGoSendstate() {
	return hoGoSendstate;
}
public void setHoGoSendstate(String hoGoSendstate) {
	this.hoGoSendstate = hoGoSendstate;
}

@Override
public String toString() {
	return "HoTreat [hoTreatmentCode=" + hoTreatmentCode + ", hoDoctorId=" + hoDoctorId
			+ ", hoHospitalizationStateCode=" + hoHospitalizationStateCode + ", hoChartCode=" + hoChartCode
			+ ", hoPatientCode=" + hoPatientCode + ", hoHospitalCode=" + hoHospitalCode + ", hoTreatSubjectCode="
			+ hoTreatSubjectCode + ", hoTreatmentContents=" + hoTreatmentContents + ", hoTreatmentWriteDate="
			+ hoTreatmentWriteDate + ", hoGoSendstate=" + hoGoSendstate + "]";
}


}
