package com.team4.project.government.treatChart.domain;



import java.sql.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.team4.project.government.diagnosisPrescription.domain.GoDiagnosis;

public class GoTreat {

private String goTreatCode;
private String goHospitalId;
private String goCitizenId;
private String goDoctorId;
private String goTreatSubjectCode;
private String goChartCode;
private int goChartSeq;
private String goTreatContents;
/*날짜 포멧을 하여 원하는 형식으로 표기*/
@DateTimeFormat(pattern ="YY-MM-DD")
private Date goTreatRegistrationDate;
private String goTreatGoRegistrationDate;
private List<GoDiagnosis> diagnosisList;




public List<GoDiagnosis> getDiagnosisList() {
	return diagnosisList;
}

public void setDiagnosisList(List<GoDiagnosis> diagnosisList) {
	this.diagnosisList = diagnosisList;
}

//조인문 데이터
private String goHospitalName;
private String goHospitalAddress;
private String goCitizenName;
private String goDoctorName;
private String goTreatSubjectName;
private String goDiseaseKor;

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
			+ goTreatGoRegistrationDate + ", goHospitalName=" + goHospitalName + ", goCitizenName=" + goCitizenName
			+ ", goDoctorName=" + goDoctorName + ", goTreatSubjectName=" + goTreatSubjectName + ", goDiseaseKor="
			+ goDiseaseKor + "]";
}


}
