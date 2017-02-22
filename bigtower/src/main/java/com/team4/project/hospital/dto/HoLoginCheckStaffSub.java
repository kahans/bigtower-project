package com.team4.project.hospital.dto;

public class HoLoginCheckStaffSub extends HoStaff {
	private String hoHospitalName;
	private String staffLevelName;
	public String getHoHospitalName() {
		return hoHospitalName;
	}
	public void setHoHospitalName(String hoHospitalName) {
		this.hoHospitalName = hoHospitalName;
	}
	public String getStaffLevelName() {
		return staffLevelName;
	}
	public void setStaffLevelName(String staffLevelName) {
		this.staffLevelName = staffLevelName;
	}
	@Override
	public String toString() {
		return "HoLoginCheckStaffSub [hoHospitalName=" + hoHospitalName + ", staffLevelName=" + staffLevelName
				+ ", hoStaffId=" + hoStaffId + ", hoHospitalCode=" + hoHospitalCode + ", staffLevelCode="
				+ staffLevelCode + ", hoStaffPw=" + hoStaffPw + ", hoStaffSerialNo=" + hoStaffSerialNo
				+ ", hoStaffName=" + hoStaffName + ", hoStaffPhone=" + hoStaffPhone + ", hoZipCode=" + hoZipCode
				+ ", hoStaffAddress=" + hoStaffAddress + ", hoStaffDetailAddress=" + hoStaffDetailAddress + "]";
	}
	
}
