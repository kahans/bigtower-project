package com.team4.project.hospital.test.domain;

public class HoMediaTest {
	private String hoMediaTestCode;
	private String hoTestRequestCode;
	private String hoTreatmentCode;
	private int hoTestStateCode;
	private String hoMediaTestImagePath;
	private String hoMediaTestImageName;
	private String hoMediaTestDate;
	private String hoMediaTestRegistationDate;
	private int hoGoSendState;
	
	
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
				+ ", hoTreatmentCode=" + hoTreatmentCode + ", hoTestStateCode=" + hoTestStateCode
				+ ", hoMediaTestImagePath=" + hoMediaTestImagePath + ", hoMediaTestImageName=" + hoMediaTestImageName
				+ ", hoMediaTestDate=" + hoMediaTestDate + ", hoMediaTestRegistationDate=" + hoMediaTestRegistationDate
				+ ", hoGoSendState=" + hoGoSendState + "]";
	}
	
	
}
