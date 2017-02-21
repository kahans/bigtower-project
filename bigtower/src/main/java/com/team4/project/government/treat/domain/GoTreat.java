package com.team4.project.government.treat.domain;



import java.sql.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.team4.project.government.diagnosisPrescription.domain.GoDiagnosis;

public class GoTreat {

protected String goTreatCode;
protected String goHospitalId;
protected String goCitizenId;
protected String goDoctorId;
protected String goTreatSubjectCode;
protected String goChartCode;
protected int goChartSeq;
protected String goTreatContents;
/*날짜 포멧을 하여 원하는 형식으로 표기*/
@DateTimeFormat(pattern ="YY-MM-DD")
protected Date goTreatRegistrationDate;
protected String goTreatGoRegistrationDate;
protected List<GoDiagnosis> diagnosisList;
 
//조인문 데이터
protected String goHospitalName;
protected String goHospitalAddress;
protected String goCitizenName;
protected String goDoctorName;
protected String goTreatSubjectName;
protected String goDiseaseKor;


public List<GoDiagnosis> getDiagnosisList() {
	return diagnosisList;
}

public void setDiagnosisList(List<GoDiagnosis> diagnosisList) {
	this.diagnosisList = diagnosisList;
}



public String getGoHospitalAddress() {
	return goHospitalAddress;
}

public void setGoHospitalAddress(String goHospitalAddress) {
	this.goHospitalAddress = goHospitalAddress;
}
public String getGoHospitalName() {
	return goHospitalName;
}

public void setGoHospitalName(String goHospitalName) {
	this.goHospitalName = goHospitalName;
}

public String getGoCitizenName() {
	return goCitizenName;
}

public void setGoCitizenName(String goCitizenName) {
	this.goCitizenName = goCitizenName;
}

public String getGoDoctorName() {
	return goDoctorName;
}

public void setGoDoctorName(String goDoctorName) {
	this.goDoctorName = goDoctorName;
}

public String getGoTreatSubjectName() {
	return goTreatSubjectName;
}

public void setGoTreatSubjectName(String goTreatSubjectName) {
	this.goTreatSubjectName = goTreatSubjectName;
}

public String getGoDiseaseKor() {
	return goDiseaseKor;
}

public void setGoDiseaseKor(String goDiseaseKor) {
	this.goDiseaseKor = goDiseaseKor;
}

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
	return "GoTreat [goTreatCode=" + goTreatCode + ", goHospitalId=" + goHospitalId + ", goCitizenId=" + goCitizenId
			+ ", goDoctorId=" + goDoctorId + ", goTreatSubjectCode=" + goTreatSubjectCode + ", goChartCode="
			+ goChartCode + ", goChartSeq=" + goChartSeq + ", goTreatContents=" + goTreatContents
			+ ", goTreatRegistrationDate=" + goTreatRegistrationDate + ", goTreatGoRegistrationDate="
			+ goTreatGoRegistrationDate + ", diagnosisList=" + diagnosisList + ", goHospitalName=" + goHospitalName
			+ ", goHospitalAddress=" + goHospitalAddress + ", goCitizenName=" + goCitizenName + ", goDoctorName="
			+ goDoctorName + ", goTreatSubjectName=" + goTreatSubjectName + ", goDiseaseKor=" + goDiseaseKor + "]";
}



}
