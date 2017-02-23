package com.team4.project.government.test.domain;

public class SelectInfo {
	protected String goHospitalName;
	protected String goDoctorName;
	protected String goTreatContents;
	public String getGoHospitalName() {
		return goHospitalName;
	}
	public void setGoHospitalName(String goHospitalName) {
		this.goHospitalName = goHospitalName;
	}
	public String getGoDoctorName() {
		return goDoctorName;
	}
	public void setGoDoctorName(String goDoctorName) {
		this.goDoctorName = goDoctorName;
	}
	public String getGoTreatContents() {
		return goTreatContents;
	}
	public void setGoTreatContents(String goTreatContents) {
		this.goTreatContents = goTreatContents;
	}
	@Override
	public String toString() {
		return "SelectInfo [goHospitalName=" + goHospitalName + ", goDoctorName=" + goDoctorName + ", goTreatContents="
				+ goTreatContents + "]";
	}
	
	
}
