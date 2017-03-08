package com.team4.project.hospital.hospitalizationOperation.domain;

public class HoHospitalizationRequest {

private String hoHospitalizationRequestCode;
private String hoTreatmentCode;
private String hoHospitalizationRequestDate;
private String hoPatientName;
private int hoHospitalizationStateCode;


public int getHoHospitalizationStateCode() {
	return hoHospitalizationStateCode;
}
public void setHoHospitalizationStateCode(int hoHospitalizationStateCode) {
	this.hoHospitalizationStateCode = hoHospitalizationStateCode;
}
public String getHoPatientName() {
	return hoPatientName;
}
public void setHoPatientName(String hoPatientName) {
	this.hoPatientName = hoPatientName;
}
public String getHoHospitalizationRequestCode() {
	return hoHospitalizationRequestCode;
}
public void setHoHospitalizationRequestCode(String hoHospitalizationRequestCode) {
	this.hoHospitalizationRequestCode = hoHospitalizationRequestCode;
}
public String getHoTreatmentCode() {
	return hoTreatmentCode;
}
public void setHoTreatmentCode(String hoTreatmentCode) {
	this.hoTreatmentCode = hoTreatmentCode;
}
public String getHoHospitalizationRequestDate() {
	return hoHospitalizationRequestDate;
}
public void setHoHospitalizationRequestDate(String hoHospitalizationRequestDate) {
	this.hoHospitalizationRequestDate = hoHospitalizationRequestDate;
}

@Override
public String toString() {
	return "HoHospitalizationRequest [hoHospitalizationRequestCode=" + hoHospitalizationRequestCode
			+ ", hoTreatmentCode=" + hoTreatmentCode + ", hoHospitalizationRequestDate=" + hoHospitalizationRequestDate
			+ ", hoPatientName=" + hoPatientName + "]";
}


}
