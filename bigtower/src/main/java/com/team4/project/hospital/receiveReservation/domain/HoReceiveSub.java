package com.team4.project.hospital.receiveReservation.domain;

public class HoReceiveSub extends HoReceive{

private String hoPatientName;
private String hoTreatSubjectName;



public String getHoTreatSubjectName() {
	return hoTreatSubjectName;
}

public void setHoTreatSubjectName(String hoTreatSubjectName) {
	this.hoTreatSubjectName = hoTreatSubjectName;
}

public String getHoPatientName() {
	return hoPatientName;
}

public void setHoPatientName(String hoPatientName) {
	this.hoPatientName = hoPatientName;
}

@Override
public String toString() {
	return "HoReceiveSub [hoPatientName=" + hoPatientName + ", hoTreatSubjectName=" + hoTreatSubjectName + "]";
}


}
