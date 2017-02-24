package com.team4.project.government.hopitalizationSurgery.domain;

public class GoSearchSurgerySub extends GoSurgeryResult{
	//DB에서 조인문을 통해서 받는 값들
	protected String goHospitalName;
	protected String goSurgeryName;
	protected String goDoctorName;
	protected String goCitizenName;
	protected String goCitizenNo;
	protected int goStatistics;//수술명 횟수
	
	public int getGoStatistics() {
		return goStatistics;
	}
	public String getGoCitizenNo() {
		return goCitizenNo;
	}
	public void setGoCitizenNo(String goCitizenNo) {
		this.goCitizenNo = goCitizenNo;
	}
	public void setGoStatistics(int goStatistics) {
		this.goStatistics = goStatistics;
	}
	public String getGoDoctorName() {
		return goDoctorName;
	}
	public void setGoDoctorName(String goDoctorName) {
		this.goDoctorName = goDoctorName;
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
	public String getGoSurgeryName() {
		return goSurgeryName;
	}
	public void setGoSurgeryName(String goSurgeryName) {
		this.goSurgeryName = goSurgeryName;
	}
	@Override
	public String toString() {
		return "GoSearchSurgerySub [goHospitalName=" + goHospitalName + ", goSurgeryName=" + goSurgeryName
				+ ", goDoctorName=" + goDoctorName + ", goCitizenName=" + goCitizenName + ", goCitizenNo=" + goCitizenNo
				+ ", goStatistics=" + goStatistics + ", goSurgeryResultCode=" + goSurgeryResultCode + ", goTreatCode="
				+ goTreatCode + ", goSurgeryCode=" + goSurgeryCode + ", goSurgeryResultGoRegistrationDate="
				+ goSurgeryResultGoRegistrationDate + "]";
	}
	
	
}
