package com.team4.project.hospital.diagnosisPrescription.domain;

public class HoPrescription {

private String hoPrescriptionCode;
private String hoTreatmentCode;
private String hoMedicineCode;
private String hoPrescriptionDailydose;
private String hoPrescriptionDailycount;
private String hoPrescriptionTotalday;
private String hoPrescriptionUsage;
private String hoPrescriptionWrite;
private String hoPrescriptionState;
private String hoGoSendstate;


public String getHoPrescriptionCode() {
	return hoPrescriptionCode;
}
public void setHoPrescriptionCode(String hoPrescriptionCode) {
	this.hoPrescriptionCode = hoPrescriptionCode;
}
public String getHoTreatmentCode() {
	return hoTreatmentCode;
}
public void setHoTreatmentCode(String hoTreatmentCode) {
	this.hoTreatmentCode = hoTreatmentCode;
}
public String getHoMedicineCode() {
	return hoMedicineCode;
}
public void setHoMedicineCode(String hoMedicineCode) {
	this.hoMedicineCode = hoMedicineCode;
}
public String getHoPrescriptionDailydose() {
	return hoPrescriptionDailydose;
}
public void setHoPrescriptionDailydose(String hoPrescriptionDailydose) {
	this.hoPrescriptionDailydose = hoPrescriptionDailydose;
}
public String getHoPrescriptionDailycount() {
	return hoPrescriptionDailycount;
}
public void setHoPrescriptionDailycount(String hoPrescriptionDailycount) {
	this.hoPrescriptionDailycount = hoPrescriptionDailycount;
}
public String getHoPrescriptionTotalday() {
	return hoPrescriptionTotalday;
}
public void setHoPrescriptionTotalday(String hoPrescriptionTotalday) {
	this.hoPrescriptionTotalday = hoPrescriptionTotalday;
}
public String getHoPrescriptionUsage() {
	return hoPrescriptionUsage;
}
public void setHoPrescriptionUsage(String hoPrescriptionUsage) {
	this.hoPrescriptionUsage = hoPrescriptionUsage;
}
public String getHoPrescriptionWrite() {
	return hoPrescriptionWrite;
}
public void setHoPrescriptionWrite(String hoPrescriptionWrite) {
	this.hoPrescriptionWrite = hoPrescriptionWrite;
}
public String getHoPrescriptionState() {
	return hoPrescriptionState;
}
public void setHoPrescriptionState(String hoPrescriptionState) {
	this.hoPrescriptionState = hoPrescriptionState;
}
public String getHoGoSendstate() {
	return hoGoSendstate;
}
public void setHoGoSendstate(String hoGoSendstate) {
	this.hoGoSendstate = hoGoSendstate;
}

@Override
public String toString() {
	return "HoPrescription [hoPrescriptionCode=" + hoPrescriptionCode + ", hoTreatmentCode=" + hoTreatmentCode
			+ ", hoMedicineCode=" + hoMedicineCode + ", hoPrescriptionDailydose=" + hoPrescriptionDailydose
			+ ", hoPrescriptionDailycount=" + hoPrescriptionDailycount + ", hoPrescriptionTotalday="
			+ hoPrescriptionTotalday + ", hoPrescriptionUsage=" + hoPrescriptionUsage + ", hoPrescriptionWrite="
			+ hoPrescriptionWrite + ", hoPrescriptionState=" + hoPrescriptionState + ", hoGoSendstate=" + hoGoSendstate
			+ "]";
}


}
