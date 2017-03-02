package com.team4.project.hospital.treatChart.domain;

public class HoTreatSub extends HoTreat{

private String hoDoctorName;
private String hoPatientName;
private String hoTreatSubjectName;
private String hoHospitalName;



public String getHoHospitalName() {
	return hoHospitalName;
}
public void setHoHospitalName(String hoHospitalName) {
	this.hoHospitalName = hoHospitalName;
}
public String getHoDoctorName() {
	return hoDoctorName;
}
public void setHoDoctorName(String hoDoctorName) {
	this.hoDoctorName = hoDoctorName;
}
public String getHoPatientName() {
	return hoPatientName;
}
public void setHoPatientName(String hoPatientName) {
	this.hoPatientName = hoPatientName;
}
public String getHoTreatSubjectName() {
	return hoTreatSubjectName;
}
public void setHoTreatSubjectName(String hoTreatSubjectName) {
	this.hoTreatSubjectName = hoTreatSubjectName;
}

@Override
public String toString() {
	return "HoTreatSub [hoDoctorName=" + hoDoctorName + ", hoPatientName=" + hoPatientName + ", hoTreatSubjectName="
			+ hoTreatSubjectName + ", hoHospitalName=" + hoHospitalName + ", getHoTreatmentCode()="
			+ getHoTreatmentCode() + ", getHoDoctorId()=" + getHoDoctorId() + ", getHoHospitalizationStateCode()="
			+ getHoHospitalizationStateCode() + ", getHoChartCode()=" + getHoChartCode() + ", getHoPatientCode()="
			+ getHoPatientCode() + ", getHoHospitalCode()=" + getHoHospitalCode() + ", getHoTreatSubjectCode()="
			+ getHoTreatSubjectCode() + ", getHoTreatmentContents()=" + getHoTreatmentContents()
			+ ", getHoTreatmentWriteDate()=" + getHoTreatmentWriteDate() + ", getHoGoSendstate()=" + getHoGoSendstate()
			+ "]";
}

}
