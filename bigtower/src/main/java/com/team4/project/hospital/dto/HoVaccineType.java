package com.team4.project.hospital.dto;

public class HoVaccineType {

private String hoVaccineTypeCode;
private String hoVaccineTypeName;
private Double hoVaccineTypeDegree;

public String getHoVaccineTypeCode() {
	return hoVaccineTypeCode;
}
public void setHoVaccineTypeCode(String hoVaccineTypeCode) {
	this.hoVaccineTypeCode = hoVaccineTypeCode;
}
public String getHoVaccineTypeName() {
	return hoVaccineTypeName;
}
public void setHoVaccineTypeName(String hoVaccineTypeName) {
	this.hoVaccineTypeName = hoVaccineTypeName;
}
public Double getHoVaccineTypeDegree() {
	return hoVaccineTypeDegree;
}
public void setHoVaccineTypeDegree(Double hoVaccineTypeDegree) {
	this.hoVaccineTypeDegree = hoVaccineTypeDegree;
}
@Override
public String toString() {
	return "HoVaccineType [hoVaccineTypeCode=" + hoVaccineTypeCode + ", hoVaccineTypeName=" + hoVaccineTypeName
			+ ", hoVaccineTypeDegree=" + hoVaccineTypeDegree + "]";
}


}
