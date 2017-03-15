package com.team4.project.hospital.dto;

public class HoStatistics {
	//진료과목명, 진료과 방문횟수
	private String hoTreatSubjectName;
	private int hoTreatsubjectCount;
	//질병명, 질병코드, 질병진단횟수
	private String hoDiseaseCode;
	private String hoDiseaseName;
	private int hoDiseaseCount;
	//약품명, 약품코드, 약품처방횟수
	private String hoMedicineCode;
	private String hoMedicineName;
	private int hoMedicineCount;
	public String getHoTreatSubjectName() {
		return hoTreatSubjectName;
	}
	public void setHoTreatSubjectName(String hoTreatSubjectName) {
		this.hoTreatSubjectName = hoTreatSubjectName;
	}
	public int getHoTreatsubjectCount() {
		return hoTreatsubjectCount;
	}
	public void setHoTreatsubjectCount(int hoTreatsubjectCount) {
		this.hoTreatsubjectCount = hoTreatsubjectCount;
	}
	public String getHoDiseaseCode() {
		return hoDiseaseCode;
	}
	public void setHoDiseaseCode(String hoDiseaseCode) {
		this.hoDiseaseCode = hoDiseaseCode;
	}
	public String getHoDiseaseName() {
		return hoDiseaseName;
	}
	public void setHoDiseaseName(String hoDiseaseName) {
		this.hoDiseaseName = hoDiseaseName;
	}
	public int getHoDiseaseCount() {
		return hoDiseaseCount;
	}
	public void setHoDiseaseCount(int hoDiseaseCount) {
		this.hoDiseaseCount = hoDiseaseCount;
	}
	public String getHoMedicineCode() {
		return hoMedicineCode;
	}
	public void setHoMedicineCode(String hoMedicineCode) {
		this.hoMedicineCode = hoMedicineCode;
	}
	public String getHoMedicineName() {
		return hoMedicineName;
	}
	public void setHoMedicineName(String hoMedicineName) {
		this.hoMedicineName = hoMedicineName;
	}
	public int getHoMedicineCount() {
		return hoMedicineCount;
	}
	public void setHoMedicineCount(int hoMedicineCount) {
		this.hoMedicineCount = hoMedicineCount;
	}
	@Override
	public String toString() {
		return "HoStatistics [hoTreatSubjectName=" + hoTreatSubjectName + ", hoTreatsubjectCount=" + hoTreatsubjectCount
				+ ", hoDiseaseCode=" + hoDiseaseCode + ", hoDiseaseName=" + hoDiseaseName + ", hoDiseaseCount="
				+ hoDiseaseCount + ", hoMedicineCode=" + hoMedicineCode + ", hoMedicineName=" + hoMedicineName
				+ ", hoMedicineCount=" + hoMedicineCount + "]";
	}
	
}
