package com.team4.project.hospital.dto;

public class HoDisease {

private String hoDiseaseCode;
private String hoDiseaseKor;
private String hoDiseaseEng;

public String getHoDiseaseCode() {
	return hoDiseaseCode;
}
public void setHoDiseaseCode(String hoDiseaseCode) {
	this.hoDiseaseCode = hoDiseaseCode;
}
public String getHoDiseaseKor() {
	return hoDiseaseKor;
}
public void setHoDiseaseKor(String hoDiseaseKor) {
	this.hoDiseaseKor = hoDiseaseKor;
}
public String getHoDiseaseEng() {
	return hoDiseaseEng;
}
public void setHoDiseaseEng(String hoDiseaseEng) {
	this.hoDiseaseEng = hoDiseaseEng;
}

@Override
public String toString() {
	return "HoDisease [hoDiseaseCode=" + hoDiseaseCode + ", hoDiseaseKor=" + hoDiseaseKor + ", hoDiseaseEng="
			+ hoDiseaseEng + "]";
}
	

}

