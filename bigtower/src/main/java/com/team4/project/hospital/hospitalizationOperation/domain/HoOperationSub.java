package com.team4.project.hospital.hospitalizationOperation.domain;

public class HoOperationSub extends HoOperation{

private String hoPatientName;
private String hoOperationTypeName;


public String getHoPatientName() {
	return hoPatientName;
}


public void setHoPatientName(String hoPatientName) {
	this.hoPatientName = hoPatientName;
}


public String getHoOperationTypeName() {
	return hoOperationTypeName;
}


public void setHoOperationTypeName(String hoOperationTypeName) {
	this.hoOperationTypeName = hoOperationTypeName;
}


@Override
public String toString() {
	return "HoOperationSub [hoPatientName=" + hoPatientName + ", hoOperationTypeName=" + hoOperationTypeName + "]";
}


}
