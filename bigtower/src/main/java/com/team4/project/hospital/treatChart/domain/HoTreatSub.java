package com.team4.project.hospital.treatChart.domain;

public class HoTreatSub extends HoTreat{

private String hoDoctorName;
private String hoPatientName;
private String hoTreatSubjectName;



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
			+ hoTreatSubjectName + "]";
}

}
