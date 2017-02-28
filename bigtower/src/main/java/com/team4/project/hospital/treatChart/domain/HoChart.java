package com.team4.project.hospital.treatChart.domain;

public class HoChart {

private String hoChartCode;
private String hoPatientCode;
private String hoHospitalCode;
private String hoChartRegistrationDate;
private int hoGoSendstate;

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
public String getHoChartRegistrationDate() {
	return hoChartRegistrationDate;
}
public void setHoChartRegistrationDate(String hoChartRegistrationDate) {
	this.hoChartRegistrationDate = hoChartRegistrationDate;
}
public int getHoGoSendstate() {
	return hoGoSendstate;
}
public void setHoGoSendstate(int hoGoSendstate) {
	this.hoGoSendstate = hoGoSendstate;
}

@Override
public String toString() {
	return "HoChart [hoChartCode=" + hoChartCode + ", hoPatientCode=" + hoPatientCode + ", hoHospitalCode="
			+ hoHospitalCode + ", hoChartRegistrationDate=" + hoChartRegistrationDate + ", hoGoSendstate="
			+ hoGoSendstate + "]";
}


}
