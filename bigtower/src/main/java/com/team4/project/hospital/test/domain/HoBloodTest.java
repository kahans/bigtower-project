package com.team4.project.hospital.test.domain;

public class HoBloodTest {
	protected String hoBloodTestCode;		//혈액검사 코드
	protected String hoTestRequestCode;		//검사요청 코드
	protected String hoTreatmentCode;		//진료코드
	protected int hoTestStateCode;			//검사상태
	protected int hoBloodTestPlatelet;		//혈소판
	protected int hoBloodTestSugar;			//혈당
	protected String hoBloodTestImagePath;	//이미지 경로
	protected String hoBloodTestImageName;	//이미지 이름
	protected String hoBloodTestDate;		//검사일
	protected String hoBloodTestRegistationDate;//결과등록일
	protected String hoGoSendState;			//정부 등록상태
	public String getHoBloodTestCode() {
		return hoBloodTestCode;
	}
	public void setHoBloodTestCode(String hoBloodTestCode) {
		this.hoBloodTestCode = hoBloodTestCode;
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
	public int getHoBloodTestPlatelet() {
		return hoBloodTestPlatelet;
	}
	public void setHoBloodTestPlatelet(int hoBloodTestPlatelet) {
		this.hoBloodTestPlatelet = hoBloodTestPlatelet;
	}
	public int getHoBloodTestSugar() {
		return hoBloodTestSugar;
	}
	public void setHoBloodTestSugar(int hoBloodTestSugar) {
		this.hoBloodTestSugar = hoBloodTestSugar;
	}
	public String getHoBloodTestImagePath() {
		return hoBloodTestImagePath;
	}
	public void setHoBloodTestImagePath(String hoBloodTestImagePath) {
		this.hoBloodTestImagePath = hoBloodTestImagePath;
	}
	public String getHoBloodTestImageName() {
		return hoBloodTestImageName;
	}
	public void setHoBloodTestImageName(String hoBloodTestImageName) {
		this.hoBloodTestImageName = hoBloodTestImageName;
	}
	public String getHoBloodTestDate() {
		return hoBloodTestDate;
	}
	public void setHoBloodTestDate(String hoBloodTestDate) {
		this.hoBloodTestDate = hoBloodTestDate;
	}
	public String getHoBloodTestRegistationDate() {
		return hoBloodTestRegistationDate;
	}
	public void setHoBloodTestRegistationDate(String hoBloodTestRegistationDate) {
		this.hoBloodTestRegistationDate = hoBloodTestRegistationDate;
	}
	public String getHoGoSendState() {
		return hoGoSendState;
	}
	public void setHoGoSendState(String hoGoSendState) {
		this.hoGoSendState = hoGoSendState;
	}
	@Override
	public String toString() {
		return "HoBloodTest [hoBloodTestCode=" + hoBloodTestCode + ", hoTestRequestCode=" + hoTestRequestCode
				+ ", hoTreatmentCode=" + hoTreatmentCode + ", hoTestStateCode=" + hoTestStateCode
				+ ", hoBloodTestPlatelet=" + hoBloodTestPlatelet + ", hoBloodTestSugar=" + hoBloodTestSugar
				+ ", hoBloodTestImagePath=" + hoBloodTestImagePath + ", hoBloodTestImageName=" + hoBloodTestImageName
				+ ", hoBloodTestDate=" + hoBloodTestDate + ", hoBloodTestRegistationDate=" + hoBloodTestRegistationDate
				+ ", hoGoSendState=" + hoGoSendState + "]";
	}
	
	

}
