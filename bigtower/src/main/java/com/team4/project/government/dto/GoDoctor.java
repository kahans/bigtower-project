package com.team4.project.government.dto;

public class GoDoctor {
	private String goDoctorId;
	private int goTreatSubjectCode;
	private String goHospitalId;
	private String goDoctorName;
	private String goDoctorLicense;
	private String goDoctorPhone;
	
	public String getGoDoctorId() {
		return goDoctorId;
	}
	public void setGoDoctorId(String goDoctorId) {
		this.goDoctorId = goDoctorId;
	}
	public int getGoTreatSubjectCode() {
		return goTreatSubjectCode;
	}
	public void setGoTreatSubjectCode(int goTreatSubjectCode) {
		this.goTreatSubjectCode = goTreatSubjectCode;
	}
	public String getGoHospitalId() {
		return goHospitalId;
	}
	public void setGoHospitalId(String goHospitalId) {
		this.goHospitalId = goHospitalId;
	}
	public String getGoDoctorName() {
		return goDoctorName;
	}
	public void setGoDoctorName(String goDoctorName) {
		this.goDoctorName = goDoctorName;
	}
	public String getGoDoctorLicense() {
		return goDoctorLicense;
	}
	public void setGoDoctorLicense(String goDoctorLicense) {
		this.goDoctorLicense = goDoctorLicense;
	}
	public String getGoDoctorPhone() {
		return goDoctorPhone;
	}
	public void setGoDoctorPhone(String goDoctorPhone) {
		this.goDoctorPhone = goDoctorPhone;
	}
	@Override
	public String toString() {
		return "GoDoctor [goDoctorId=" + goDoctorId + ", goTreatSubjectCode=" + goTreatSubjectCode + ", goHospitalId="
				+ goHospitalId + ", goDoctorName=" + goDoctorName + ", goDoctorLicense=" + goDoctorLicense
				+ ", goDoctorPhone=" + goDoctorPhone + "]";
	}
	
	
}
