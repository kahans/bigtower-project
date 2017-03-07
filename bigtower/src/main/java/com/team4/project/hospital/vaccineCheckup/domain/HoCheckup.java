package com.team4.project.hospital.vaccineCheckup.domain;

public class HoCheckup {

	protected String hoCheckUpCode;			//건겅검진코드
	protected String hoTreatmentCode;		//진료코드
	protected String hoTestRequestCode;		//검사요청 코드
	protected String hoCheckUpResultName;	//파일이름
	protected String hoCheckUpResultPath;	//파일경로
	protected String hoCheckUpDate;			//시작일
	protected String hoCheckUpRegistrationDate;//등록일
	protected int hoGoSendstate;
	
	public String getHoTestRequestCode() {
		return hoTestRequestCode;
	}
	public void setHoTestRequestCode(String hoTestRequestCode) {
		this.hoTestRequestCode = hoTestRequestCode;
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
				+ ", hoTestRequestCode=" + hoTestRequestCode + ", hoCheckUpResultName=" + hoCheckUpResultName
				+ ", hoCheckUpResultPath=" + hoCheckUpResultPath + ", hoCheckUpDate=" + hoCheckUpDate
				+ ", hoCheckUpRegistrationDate=" + hoCheckUpRegistrationDate + ", hoGoSendstate=" + hoGoSendstate + "]";
	}
	
}
