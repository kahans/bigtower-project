package com.team4.project.government.vaccinationCheckup.domain;

import com.team4.project.government.treat.domain.GoTreat;

public class GoVaccinationResultTreatSub extends GoTreat {

protected String goVaccinationResultCode;
protected String goTreatCode;
protected String goVaccinationCode;
protected int goVaccinationResultDegree; //예방접종 몇차까지 접종 받았는지의 결과
protected String goVaccinationResultRegistrationDate; //병원결과등록일
protected String goVaccinationResultGoRegistrationDate; //정부DB등록일
//조인문
protected String goVaccinationName;
protected String goVaccinationDegree; //최종차수가 몇차까지인지
protected String goDoctorName;
protected String goHospitalName;



public String getGoDoctorName() {
	return goDoctorName;
}
public void setGoDoctorName(String goDoctorName) {
	this.goDoctorName = goDoctorName;
}
public String getGoHospitalName() {
	return goHospitalName;
}
public void setGoHospitalName(String goHospitalName) {
	this.goHospitalName = goHospitalName;
}
public int getGoVaccinationResultDegree() {
	return goVaccinationResultDegree;
}
public void setGoVaccinationResultDegree(int goVaccinationResultDegree) {
	this.goVaccinationResultDegree = goVaccinationResultDegree;
}
public String getGoVaccinationName() {
	return goVaccinationName;
}
public void setGoVaccinationName(String goVaccinationName) {
	this.goVaccinationName = goVaccinationName;
}
public String getGoVaccinationResultCode() {
	return goVaccinationResultCode;
}
public void setGoVaccinationResultCode(String goVaccinationResultCode) {
	this.goVaccinationResultCode = goVaccinationResultCode;
}
public String getGoTreatCode() {
	return goTreatCode;
}
public void setGoTreatCode(String goTreatCode) {
	this.goTreatCode = goTreatCode;
}
public String getGoVaccinationCode() {
	return goVaccinationCode;
}
public void setGoVaccinationCode(String goVaccinationCode) {
	this.goVaccinationCode = goVaccinationCode;
}
public String getGoVaccinationDegree() {
	return goVaccinationDegree;
}
public void setGoVaccinationDegree(String goVaccinationDegree) {
	this.goVaccinationDegree = goVaccinationDegree;
}
public String getGoVaccinationResultRegistrationDate() {
	return goVaccinationResultRegistrationDate;
}
public void setGoVaccinationResultRegistrationDate(String goVaccinationResultRegistrationDate) {
	this.goVaccinationResultRegistrationDate = goVaccinationResultRegistrationDate;
}
public String getGoVaccinationResultGoRegistrationDate() {
	return goVaccinationResultGoRegistrationDate;
}
public void setGoVaccinationResultGoRegistrationDate(String goVaccinationResultGoRegistrationDate) {
	this.goVaccinationResultGoRegistrationDate = goVaccinationResultGoRegistrationDate;
}

@Override
public String toString() {
	return "GoVaccination [goVaccinationResultCode=" + goVaccinationResultCode + ", goTreatCode=" + goTreatCode
			+ ", goVaccinationCode=" + goVaccinationCode + ", goVaccinationDegree=" + goVaccinationDegree
			+ ", goVaccinationResultRegistrationDate=" + goVaccinationResultRegistrationDate
			+ ", goVaccinationResultGoRegistrationDate=" + goVaccinationResultGoRegistrationDate + "]";
}

}
