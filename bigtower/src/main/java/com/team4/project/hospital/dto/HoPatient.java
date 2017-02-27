package com.team4.project.hospital.dto;

public class HoPatient {
	protected String hoPatientCode;
	protected String hoHospitalCode;
	protected String hoCitizenId;
	protected String hoPatientPhone;
	protected String hoPatientName;
	protected String hoZipCode;
	protected String hoPatientAddress;
	protected String hoPatientDetailAddress;
	
	
	public String getHoPatientCode() {
		return hoPatientCode;
	}
	public void setHoPatientCode(String hoPatientCode) {
		this.hoPatientCode = hoPatientCode;
	}
	public String getHoHospitalCode() {
		return hoHospitalCode;
	}
	public void setHoHospitalCode(String hoHospitalCode) {
		this.hoHospitalCode = hoHospitalCode;
	}
	
	public String getHoCitizenId() {
		return hoCitizenId;
	}
	public void setHoCitizenId(String hoCitizenId) {
		this.hoCitizenId = hoCitizenId;
	}
	public String getHoPatientPhone() {
		return hoPatientPhone;
	}
	public void setHoPatientPhone(String hoPatientPhone) {
		this.hoPatientPhone = hoPatientPhone;
	}
	public String getHoPatientName() {
		return hoPatientName;
	}
	public void setHoPatientName(String hoPatientName) {
		this.hoPatientName = hoPatientName;
	}
	public String getHoZipCode() {
		return hoZipCode;
	}
	public void setHoZipCode(String hoZipCode) {
		this.hoZipCode = hoZipCode;
	}
	public String getHoPatientAddress() {
		return hoPatientAddress;
	}
	public void setHoPatientAddress(String hoPatientAddress) {
		this.hoPatientAddress = hoPatientAddress;
	}
	public String getHoPatientDetailAddress() {
		return hoPatientDetailAddress;
	}
	public void setHoPatientDetailAddress(String hoPatientDetailAddress) {
		this.hoPatientDetailAddress = hoPatientDetailAddress;
	}
	
	@Override
	public String toString() {
		return "HoPatient [hoPatientCode=" + hoPatientCode + ", hoHospitalCode=" + hoHospitalCode + ", hoCitizenId="
				+ hoCitizenId + ", hoPatientPhone=" + hoPatientPhone + ", hoPatientName=" + hoPatientName
				+ ", hoZipCode=" + hoZipCode + ", hoPatientAddress=" + hoPatientAddress + ", hoPatientDetailAddress="
				+ hoPatientDetailAddress + "]";
	}
	

}
