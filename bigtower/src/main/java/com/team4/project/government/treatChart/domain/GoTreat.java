package com.team4.project.government.treatChart.domain;

public class GoTreat {

private String goTreatCode;
private String goHospitalId;
private String goCitizenId;
private String goDoctorId;
private String goTreatSubjectCode;
private String goChartCode;
private String goDiseaseCode;
private int goChartSeq;
private String goTreatContents;
private String goTreatRegistrationDate;
private String goTreatGoRegistrationDate;

public String getGoTreatCode() {
	return goTreatCode;
}
public void setGoTreatCode(String goTreatCode) {
	this.goTreatCode = goTreatCode;
}
public String getGoHospitalId() {
	return goHospitalId;
}
public void setGoHospitalId(String goHospitalId) {
	this.goHospitalId = goHospitalId;
}
public String getGoCitizenId() {
	return goCitizenId;
}
public void setGoCitizenId(String goCitizenId) {
	this.goCitizenId = goCitizenId;
}
public String getGoDoctorId() {
	return goDoctorId;
}
public void setGoDoctorId(String goDoctorId) {
	this.goDoctorId = goDoctorId;
}
public String getGoTreatSubjectCode() {
	return goTreatSubjectCode;
}
public void setGoTreatSubjectCode(String goTreatSubjectCode) {
	this.goTreatSubjectCode = goTreatSubjectCode;
}
public String getGoChartCode() {
	return goChartCode;
}
public void setGoChartCode(String goChartCode) {
	this.goChartCode = goChartCode;
}
public String getGoDiseaseCode() {
	return goDiseaseCode;
}
public void setGoDiseaseCode(String goDiseaseCode) {
	this.goDiseaseCode = goDiseaseCode;
}
public int getGoChartSeq() {
	return goChartSeq;
}
public void setGoChartSeq(int goChartSeq) {
	this.goChartSeq = goChartSeq;
}
public String getGoTreatContents() {
	return goTreatContents;
}
public void setGoTreatContents(String goTreatContents) {
	this.goTreatContents = goTreatContents;
}
public String getGoTreatRegistrationDate() {
	return goTreatRegistrationDate;
}
public void setGoTreatRegistrationDate(String goTreatRegistrationDate) {
	this.goTreatRegistrationDate = goTreatRegistrationDate;
}
public String getGoTreatGoRegistrationDate() {
	return goTreatGoRegistrationDate;
}
public void setGoTreatGoRegistrationDate(String goTreatGoRegistrationDate) {
	this.goTreatGoRegistrationDate = goTreatGoRegistrationDate;
}

@Override
public String toString() {
	return "GoTreat [goTreatCode=" + goTreatCode + ", goHospitalId=" + goHospitalId + ", goCitizenId=" + goCitizenId
			+ ", goDoctorId=" + goDoctorId + ", goTreatSubjectCode=" + goTreatSubjectCode + ", goChartCode="
			+ goChartCode + ", goDiseaseCode=" + goDiseaseCode + ", goChartSeq=" + goChartSeq + ", goTreatContents="
			+ goTreatContents + ", goTreatRegistrationDate=" + goTreatRegistrationDate + ", goTreatGoRegistrationDate="
			+ goTreatGoRegistrationDate + "]";
}


}
