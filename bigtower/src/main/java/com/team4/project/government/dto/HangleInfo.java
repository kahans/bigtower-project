package com.team4.project.government.dto;

public class HangleInfo {
	protected String goHospitalName;
	protected String goHospitalAddress;
	protected String goCitizenName;
	protected String goDoctorName;
	protected String goTreatSubjectName;
	
	public String getGoHospitalName() {
		return goHospitalName;
	}
	public void setGoHospitalName(String goHospitalName) {
		this.goHospitalName = goHospitalName;
	}
	public String getGoHospitalAddress() {
		return goHospitalAddress;
	}
	public void setGoHospitalAddress(String goHospitalAddress) {
		this.goHospitalAddress = goHospitalAddress;
	}
	public String getGoCitizenName() {
		return goCitizenName;
	}
	public void setGoCitizenName(String goCitizenName) {
		this.goCitizenName = goCitizenName;
	}
	public String getGoDoctorName() {
		return goDoctorName;
	}
	public void setGoDoctorName(String goDoctorName) {
		this.goDoctorName = goDoctorName;
	}
	public String getGoTreatSubjectName() {
		return goTreatSubjectName;
	}
	public void setGoTreatSubjectName(String goTreatSubjectName) {
		this.goTreatSubjectName = goTreatSubjectName;
	}
	@Override
	public String toString() {
		return "HangleInfo [goHospitalName=" + goHospitalName + ", goHospitalAddress=" + goHospitalAddress
				+ ", goCitizenName=" + goCitizenName + ", goDoctorName=" + goDoctorName + ", goTreatSubjectName="
				+ goTreatSubjectName + "]";
	}
	
}
