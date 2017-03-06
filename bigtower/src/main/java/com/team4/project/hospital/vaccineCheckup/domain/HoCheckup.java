package com.team4.project.hospital.vaccineCheckup.domain;

public class HoCheckup {

	protected String hoCheckUpCode;
	protected String hoTreatmentCode;
	protected String hoTestRequestCode;		//검사요청 코드
	protected String hoCheckUpResultName;
	protected String hoCheckUpResultPath;
	protected String hoCheckUpDate;
	protected String hoCheckUpRegistrationDate;
	protected int hoGoSendstate;
	protected int hoTestStateCode;	//이거 뭐냐 왜만듬?
	protected String hoTestCode;	//이것도 뭐냐?

	
	
	public String getHoTestCode() {
		return hoTestCode;
	}
	public void setHoTestCode(String hoTestCode) {
		this.hoTestCode = hoTestCode;
	}
	public String getHoTestRequestCode() {
		return hoTestRequestCode;
	}
	public void setHoTestRequestCode(String hoTestRequestCode) {
		this.hoTestRequestCode = hoTestRequestCode;
	}
	public int getHoTestStateCode() {
		return hoTestStateCode;
	}
	public void setHoTestStateCode(int hoTestStateCode) {
		this.hoTestStateCode = hoTestStateCode;
	}
	public String getHoCheckUpCode() {
		return hoCheckUpCode;
	}
	public void setHoCheckUpCode(String hoCheckUpCode) {
		this.hoCheckUpCode = hoCheckUpCode;
	}
	public String getHoTreatmentCode() {
		return hoTreatmentCode;
	}
	public void setHoTreatmentCode(String hoTreatmentCode) {
		this.hoTreatmentCode = hoTreatmentCode;
	}
	public String getHoCheckUpResultPath() {
		return hoCheckUpResultPath;
	}
	public void setHoCheckUpResultPath(String hoCheckUpResultPath) {
		this.hoCheckUpResultPath = hoCheckUpResultPath;
	}
	public String getHoCheckUpResultName() {
		return hoCheckUpResultName;
	}
	public void setHoCheckUpResultName(String hoCheckUpResultName) {
		this.hoCheckUpResultName = hoCheckUpResultName;
	}
	public String getHoCheckUpDate() {
		return hoCheckUpDate;
	}
	public void setHoCheckUpDate(String hoCheckUpDate) {
		this.hoCheckUpDate = hoCheckUpDate;
	}
	public String getHoCheckUpRegistrationDate() {
		return hoCheckUpRegistrationDate;
	}
	public void setHoCheckUpRegistrationDate(String hoCheckUpRegistrationDate) {
		this.hoCheckUpRegistrationDate = hoCheckUpRegistrationDate;
	}
	public int getHoGoSendstate() {
		return hoGoSendstate;
	}
	public void setHoGoSendstate(int hoGoSendstate) {
		this.hoGoSendstate = hoGoSendstate;
	}
	@Override
	public String toString() {
		return "HoCheckup [hoCheckUpCode=" + hoCheckUpCode + ", hoTreatmentCode=" + hoTreatmentCode
				+ ", hoCheckUpResultPath=" + hoCheckUpResultPath + ", hoCheckUpResultName=" + hoCheckUpResultName
				+ ", hoCheckUpDate=" + hoCheckUpDate + ", hoCheckUpRegistrationDate=" + hoCheckUpRegistrationDate
				+ ", hoTestStateCode=" + hoTestStateCode + ", hoGoSendstate=" + hoGoSendstate + ", hoTestRequestCode="
				+ hoTestRequestCode + ", hoTestCode=" + hoTestCode + "]";
	}
	
}
