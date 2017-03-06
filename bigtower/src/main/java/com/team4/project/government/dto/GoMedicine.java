package com.team4.project.government.dto;

public class GoMedicine {
	private String goMedicineCode;
	private String goMedicineName;
	public String getGoMedicineCode() {
		return goMedicineCode;
	}
	public void setGoMedicineCode(String goMedicineCode) {
		this.goMedicineCode = goMedicineCode;
	}
	public String getGoMedicineName() {
		return goMedicineName;
	}
	public void setGoMedicineName(String goMedicineName) {
		this.goMedicineName = goMedicineName;
	}
	@Override
	public String toString() {
		return "GoMedicine [goMedicineCode=" + goMedicineCode + ", goMedicineName=" + goMedicineName + "]";
	}
	
}
