package com.team4.project.government.hopitalizationSurgery.domain;

public class GoSearchSurgerySub extends GoSurgeryResult{
	//DB에서 조인문을 통해서 받는 값들
	protected String goHospitalName;
	protected String goSurgeryName;
	protected String goDoctorName;
	protected String goCitizenName;
	
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
				+ ", goDoctorName=" + goDoctorName + ", goCitizenName=" + goCitizenName + ", goSurgeryResultCode="
				+ goSurgeryResultCode + ", goTreatCode=" + goTreatCode + ", goSurgeryCode=" + goSurgeryCode
				+ ", goSurgeryResultGoRegistrationDate=" + goSurgeryResultGoRegistrationDate + "]";
	}
	
	
}
