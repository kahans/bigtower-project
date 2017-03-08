package com.team4.project.hospital.hospitalizationOperation.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class HoOperation {

private String hoOperationCode;
private String hoTreatmentCode;
private String hoOperationTypeCode;
private String hoOperationDiary;
@DateTimeFormat(pattern="yyyy-MM-dd")
private Date hoOperationStartDate;
@DateTimeFormat(pattern="yyyy-MM-dd")
private Date hoOperationEndDate;

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

public Date getHoOperationStartDate() {
	return hoOperationStartDate;
}
public void setHoOperationStartDate(Date hoOperationStartDate) {
	this.hoOperationStartDate = hoOperationStartDate;
}
public Date getHoOperationEndDate() {
	return hoOperationEndDate;
}
public void setHoOperationEndDate(Date hoOperationEndDate) {
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
