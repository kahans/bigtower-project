package com.team4.project.government.hopitalizationSurgery.domain;

public class GoSearchSurgerySub {
	//DB에서 조인문을 통해서 받는 값들
	protected String goHospitalName;
	protected String goSurgeryName;
	protected String goDoctorName;
	
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
	public String getGoSurgeryName() {
		return goSurgeryName;
	}
	public void setGoSurgeryName(String goSurgeryName) {
		this.goSurgeryName = goSurgeryName;
	}
	@Override
	public String toString()  {
		return "GoSurgerySub [goHospitalName=" + goHospitalName + ", goSurgeryName=" + goSurgeryName + ", goDoctorName="
				+ goDoctorName + "]";
	}
	
	
}
