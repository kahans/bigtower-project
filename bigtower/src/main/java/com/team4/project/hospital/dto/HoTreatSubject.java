package com.team4.project.hospital.dto;

public class HoTreatSubject {

	private int hoTreatSubjectCode;
	private String hoTreatSubjectName;
	
	public int getHoTreatSubjectCode() {
		return hoTreatSubjectCode;
	}
	public void setHoTreatSubjectCode(int hoTreatSubjectCode) {
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
