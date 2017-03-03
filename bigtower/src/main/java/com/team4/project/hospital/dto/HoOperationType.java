package com.team4.project.hospital.dto;

public class HoOperationType {

private String hoOperationTypeCode;
private String hoOperationTypeName;

public String getHoOperationTypeCode() {
	return hoOperationTypeCode;
}
public void setHoOperationTypeCode(String hoOperationTypeCode) {
	this.hoOperationTypeCode = hoOperationTypeCode;
}
public String getHoOperationTypeName() {
	return hoOperationTypeName;
}
public void setHoOperationTypeName(String hoOperationTypeName) {
	this.hoOperationTypeName = hoOperationTypeName;
}

@Override
public String toString() {
	return "HoOperationType [hoOperationTypeCode=" + hoOperationTypeCode + ", hoOperationTypeName="
			+ hoOperationTypeName + "]";
}


}
