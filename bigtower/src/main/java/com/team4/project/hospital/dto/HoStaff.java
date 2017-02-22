package com.team4.project.hospital.dto;

public class HoStaff {
	protected String hoStaffId;
	protected String hoHospitalCode;
	protected int staffLevelCode;
	protected String hoStaffPw;
	protected String hoStaffSerialNo;
	protected String hoStaffName;
	protected String hoStaffPhone;
	protected String hoZipCode;
	protected String hoStaffAddress;
	protected String hoStaffDetailAddress;
	
	public String getHoStaffId() {
		return hoStaffId;
	}
	public void setHoStaffId(String hoStaffId) {
		this.hoStaffId = hoStaffId;
	}
	public String getHoHospitalCode() {
		return hoHospitalCode;
	}
	public void setHoHospitalCode(String hoHospitalCode) {
		this.hoHospitalCode = hoHospitalCode;
	}
	public int getStaffLevelCode() {
		return staffLevelCode;
	}
	public void setStaffLevelCode(int staffLevelCode) {
		this.staffLevelCode = staffLevelCode;
	}
	public String getHoStaffPw() {
		return hoStaffPw;
	}
	public void setHoStaffPw(String hoStaffPw) {
		this.hoStaffPw = hoStaffPw;
	}
	public String getHoStaffSerialNo() {
		return hoStaffSerialNo;
	}
	public void setHoStaffSerialNo(String hoStaffSerialNo) {
		this.hoStaffSerialNo = hoStaffSerialNo;
	}
	public String getHoStaffName() {
		return hoStaffName;
	}
	public void setHoStaffName(String hoStaffName) {
		this.hoStaffName = hoStaffName;
	}
	public String getHoStaffPhone() {
		return hoStaffPhone;
	}
	public void setHoStaffPhone(String hoStaffPhone) {
		this.hoStaffPhone = hoStaffPhone;
	}
	public String getHoZipCode() {
		return hoZipCode;
	}
	public void setHoZipCode(String hoZipCode) {
		this.hoZipCode = hoZipCode;
	}
	public String getHoStaffAddress() {
		return hoStaffAddress;
	}
	public void setHoStaffAddress(String hoStaffAddress) {
		this.hoStaffAddress = hoStaffAddress;
	}
	public String getHoStaffDetailAddress() {
		return hoStaffDetailAddress;
	}
	public void setHoStaffDetailAddress(String hoStaffDetailAddress) {
		this.hoStaffDetailAddress = hoStaffDetailAddress;
	}
	@Override
	public String toString() {
		return "HoStaff [hoStaffId=" + hoStaffId + ", hoHospitalCode=" + hoHospitalCode + ", staffLevelCode="
				+ staffLevelCode + ", hoStaffPw=" + hoStaffPw + ", hoStaffSerialNo=" + hoStaffSerialNo
				+ ", hoStaffName=" + hoStaffName + ", hoStaffPhone=" + hoStaffPhone + ", hoZipCode=" + hoZipCode
				+ ", hoStaffAddress=" + hoStaffAddress + ", hoStaffDetailAddress=" + hoStaffDetailAddress + "]";
	}
	
	
}
