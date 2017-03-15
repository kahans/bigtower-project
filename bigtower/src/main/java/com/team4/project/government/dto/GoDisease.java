package com.team4.project.government.dto;

public class GoDisease {
	
	protected String goDiseaseCode;
	protected String goDiseaseKOR;
	protected String goDiseaseENG;
	public String getGoDiseaseCode() {
		return goDiseaseCode;
	}
	public void setGoDiseaseCode(String goDiseaseCode) {
		this.goDiseaseCode = goDiseaseCode;
	}
	public String getGoDiseaseKOR() {
		return goDiseaseKOR;
	}
	public void setGoDiseaseKOR(String goDiseaseKOR) {
		this.goDiseaseKOR = goDiseaseKOR;
	}
	public String getGoDiseaseENG() {
		return goDiseaseENG;
	}
	public void setGoDiseaseENG(String goDiseaseENG) {
		this.goDiseaseENG = goDiseaseENG;
	}
	@Override
	public String toString() {
		return "GoDisease [goDiseaseCode=" + goDiseaseCode + ", goDiseaseKOR=" + goDiseaseKOR + ", goDiseaseENG="
				+ goDiseaseENG + "]";
	}
}
	
	
	