package com.team4.project.hospital.hospitalizationOperation.domain;

public class HoOperation {

private String hoOperationCode;
private String hoTreatmentCode;
private String hoOperationTypeCode;
private String hoOperationDiary;
private String hoOperationStartDate;
private String hoOperationEndDate;
private int hoGoSendstate;

public String getHoOperationCode() {
	return hoOperationCode;
}
public void setHoOperationCode(String hoOperationCode) {
	this.hoOperationCode = hoOperationCode;
}
public String getHoTreatmentCode() {
	return hoTreatmentCode;
}
public void setHoTreatmentCode(String hoTreatmentCode) {
	this.hoTreatmentCode = hoTreatmentCode;
}
public String getHoOperationTypeCode() {
	return hoOperationTypeCode;
}
public void setHoOperationTypeCode(String hoOperationTypeCode) {
	this.hoOperationTypeCode = hoOperationTypeCode;
}
public String getHoOperationDiary() {
	return hoOperationDiary;
}
public void setHoOperationDiary(String hoOperationDiary) {
	this.hoOperationDiary = hoOperationDiary;
}
public String getHoOperationStartDate() {
	return hoOperationStartDate;
}
public void setHoOperationStartDate(String hoOperationStartDate) {
	this.hoOperationStartDate = hoOperationStartDate;
}
public String getHoOperationEndDate() {
	return hoOperationEndDate;
}
public void setHoOperationEndDate(String hoOperationEndDate) {
	this.hoOperationEndDate = hoOperationEndDate;
}
public int getHoGoSendstate() {
	return hoGoSendstate;
}
public void setHoGoSendstate(int hoGoSendstate) {
	this.hoGoSendstate = hoGoSendstate;
}

@Override
public String toString() {
	return "HoOperation [hoOperationCode=" + hoOperationCode + ", hoTreatmentCode=" + hoTreatmentCode
			+ ", hoOperationTypeCode=" + hoOperationTypeCode + ", hoOperationDiary=" + hoOperationDiary
			+ ", hoOperationStartDate=" + hoOperationStartDate + ", hoOperationEndDate=" + hoOperationEndDate
			+ ", hoGoSendstate=" + hoGoSendstate + "]";
}


}
