package com.team4.project.hospital.dto;

public class HoTest {

private int hoTestCode;
private String hoTestName;

public int getHoTestCode() {
	return hoTestCode;
}
public void setHoTestCode(int hoTestCode) {
	this.hoTestCode = hoTestCode;
}
public String getHoTestName() {
	return hoTestName;
}
public void setHoTestName(String hoTestName) {
	this.hoTestName = hoTestName;
}

@Override
public String toString() {
	return "HoTest [hoTestCode=" + hoTestCode + ", hoTestName=" + hoTestName + "]";
}


}
