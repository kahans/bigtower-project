package com.team4.project.government.treat.domain;

import java.util.List;

import com.team4.project.government.diagnosisPrescription.domain.GoDiagnosis;

public class GoSearchTreatSub extends GoTreat{

private String goHospitalName;
private String goHospitalAddress;
private String goCitizenId;
private String goCitizenName;
private String goDoctorName;
private String goTreatSubjectName;
private String goDiseaseKor;
private List<GoDiagnosis> diagnosisList;


public String getGoCitizenId() {
	return goCitizenId;
}
public void setGoCitizenId(String goCitizenId) {
	this.goCitizenId = goCitizenId;
}
public String getGoHospitalName() {
	return goHospitalName;
}
public void setGoHospitalName(String goHospitalName) {
	this.goHospitalName = goHospitalName;
}
public String getGoHospitalAddress() {
	return goHospitalAddress;
}
public void setGoHospitalAddress(String goHospitalAddress) {
	this.goHospitalAddress = goHospitalAddress;
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
public List<GoDiagnosis> getDiagnosisList() {
	return diagnosisList;
}
public void setDiagnosisList(List<GoDiagnosis> diagnosisList) {
	this.diagnosisList = diagnosisList;
}


@Override
public String toString() {
	return "GoSearchTreatSub [goHospitalName=" + goHospitalName + ", goHospitalAddress=" + goHospitalAddress
			+ ", goCitizenId=" + goCitizenId + ", goCitizenName=" + goCitizenName + ", goDoctorName=" + goDoctorName
			+ ", goTreatSubjectName=" + goTreatSubjectName + ", goDiseaseKor=" + goDiseaseKor + ", diagnosisList="
			+ diagnosisList + "]";
}


}
