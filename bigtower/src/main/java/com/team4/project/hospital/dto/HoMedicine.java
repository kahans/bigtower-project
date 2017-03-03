package com.team4.project.hospital.dto;

public class HoMedicine {

private String hoMedicineCode;
private String hoMedicineName;

public String getHoMedicineCode() {
	return hoMedicineCode;
}
public void setHoMedicineCode(String hoMedicineCode) {
	this.hoMedicineCode = hoMedicineCode;
}
public String getHoMedicineName() {
	return hoMedicineName;
}
public void setHoMedicineName(String hoMedicineName) {
	this.hoMedicineName = hoMedicineName;
}

@Override
public String toString() {
	return "HoMedicine [hoMedicineCode=" + hoMedicineCode + ", hoMedicineName=" + hoMedicineName + "]";
}


}
