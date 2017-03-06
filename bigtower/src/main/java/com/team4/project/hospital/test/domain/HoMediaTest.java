package com.team4.project.hospital.test.domain;

public class HoMediaTest {
	protected String hoMediaTestCode;
	protected String hoTestRequestCode;
	protected String hoTreatmentCode;
	protected String hoMediaTestImagePath;
	protected String hoMediaTestImageName;
	protected String hoMediaTestDate;
	protected String hoMediaTestRegistationDate;
	protected int hoGoSendState;
	protected int hoTestStateCode;	//추가??
	
	
	public String getHoMediaTestCode() {
		return hoMediaTestCode;
	}
	public void setHoMediaTestCode(String hoMediaTestCode) {
		this.hoMediaTestCode = hoMediaTestCode;
	}
	public String getHoTestRequestCode() {
		return hoTestRequestCode;
	}
	public void setHoTestRequestCode(String hoTestRequestCode) {
		this.hoTestRequestCode = hoTestRequestCode;
	}
	public String getHoTreatmentCode() {
		return hoTreatmentCode;
	}
	public void setHoTreatmentCode(String hoTreatmentCode) {
		this.hoTreatmentCode = hoTreatmentCode;
	}
	public int getHoTestStateCode() {
		return hoTestStateCode;
	}
	public void setHoTestStateCode(int hoTestStateCode) {
		this.hoTestStateCode = hoTestStateCode;
	}
	public String getHoMediaTestImagePath() {
		return hoMediaTestImagePath;
	}
	public void setHoMediaTestImagePath(String hoMediaTestImagePath) {
		this.hoMediaTestImagePath = hoMediaTestImagePath;
	}
	public String getHoMediaTestImageName() {
		return hoMediaTestImageName;
	}
	public void setHoMediaTestImageName(String hoMediaTestImageName) {
		this.hoMediaTestImageName = hoMediaTestImageName;
	}
	public String getHoMediaTestDate() {
		return hoMediaTestDate;
	}
	public void setHoMediaTestDate(String hoMediaTestDate) {
		this.hoMediaTestDate = hoMediaTestDate;
	}
	public String getHoMediaTestRegistationDate() {
		return hoMediaTestRegistationDate;
	}
	public void setHoMediaTestRegistationDate(String hoMediaTestRegistationDate) {
		this.hoMediaTestRegistationDate = hoMediaTestRegistationDate;
	}
	public int getHoGoSendState() {
		return hoGoSendState;
	}
	public void setHoGoSendState(int hoGoSendState) {
		this.hoGoSendState = hoGoSendState;
	}
	@Override
	public String toString() {
		return "HoMediaTest [hoMediaTestCode=" + hoMediaTestCode + ", hoTestRequestCode=" + hoTestRequestCode
				+ ", hoTreatmentCode=" + hoTreatmentCode + ", hoMediaTestImagePath=" + hoMediaTestImagePath
				+ ", hoMediaTestImageName=" + hoMediaTestImageName + ", hoMediaTestDate=" + hoMediaTestDate
				+ ", hoMediaTestRegistationDate=" + hoMediaTestRegistationDate + ", hoGoSendState=" + hoGoSendState
				+ ", hoTestStateCode=" + hoTestStateCode + "]";
	}

	
	
}
