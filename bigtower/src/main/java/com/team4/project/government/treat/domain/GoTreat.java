package com.team4.project.government.treat.domain;



import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class GoTreat {

protected String goTreatCode;
protected String goHospitalId;
protected String goCitizenNo;
protected String goDoctorId;
protected String goTreatSubjectCode;
protected String goChartCode;
protected int goChartSeq;
protected String goTreatContents;
/*날짜 포멧을 하여 원하는 형식으로 표기*/
@DateTimeFormat(pattern ="YY-MM-DD")
protected Date goTreatRegistrationDate;
protected String goTreatGoRegistrationDate;


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

public String getGoCitizenNo() {
	return goCitizenNo;
}

public void setGoCitizenNo(String goCitizenNo) {
	this.goCitizenNo = goCitizenNo;
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
public Date getGoTreatRegistrationDate() {
	return goTreatRegistrationDate;
}
public void setGoTreatRegistrationDate(Date goTreatRegistrationDate) {
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
	return "GoTreat [goTreatCode=" + goTreatCode + ", goHospitalId=" + goHospitalId + ", goCitizenNo=" + goCitizenNo
			+ ", goDoctorId=" + goDoctorId + ", goTreatSubjectCode=" + goTreatSubjectCode + ", goChartCode="
			+ goChartCode + ", goChartSeq=" + goChartSeq + ", goTreatContents=" + goTreatContents
			+ ", goTreatRegistrationDate=" + goTreatRegistrationDate + ", goTreatGoRegistrationDate="
			+ goTreatGoRegistrationDate + "]";
}





}
