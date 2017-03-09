package com.team4.project.hospital.dto;

public class HoTreatSubject {

	private String hoTreatSubjectCode;
	private String hoTreatSubjectName;
	
	public String getHoTreatSubjectCode() {
		return hoTreatSubjectCode;
	}
	public void setHoTreatSubjectCode(String hoTreatSubjectCode) {
		this.hoTreatSubjectCode = hoTreatSubjectCode;
	}
	public String getHoTreatSubjectName() {
		return hoTreatSubjectName;
	}
	public void setHoTreatSubjectName(String hoTreatSubjectName) {
		this.hoTreatSubjectName = hoTreatSubjectName;
	}
	
	@Override
	public String toString() {
		return "HoTreatSubject [hoTreatSubjectCode=" + hoTreatSubjectCode + ", hoTreatSubjectName=" + hoTreatSubjectName
				+ "]";
	}


}
