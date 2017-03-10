package com.team4.project.government.diagnosisPrescription.domain;

import org.springframework.format.annotation.DateTimeFormat;

import com.team4.project.government.dto.HangleInfo;

public class GoPrescription extends HangleInfo{
	protected String goPrescriptionResultCode;
	protected String goTreatCode;
	protected String goMedicineCode;
	protected String goPrescriptionResultInjectionNumber;
	protected String goPrescriptionResultDosage;
	protected String goPrescriptionResultUsage;
	protected String goPrescriptionResultTotalDate;
	/* 날짜 포멧을 하여 원하는 형식으로 표기 */
	@DateTimeFormat(pattern = "YY-MM-DD")
	private String goPrescriptionResultWriteDate;
	@DateTimeFormat(pattern = "YY-MM-DD")
	private String goPrescriptionResultGoRegistrationDate;
	
	
	public String getGoPrescriptionResultTotalDate() {
		return goPrescriptionResultTotalDate;
	}
	public void setGoPrescriptionResultTotalDate(String goPrescriptionResultTotalDate) {
		this.goPrescriptionResultTotalDate = goPrescriptionResultTotalDate;
	}
	public String getGoPrescriptionResultCode() {
		return goPrescriptionResultCode;
	}
	public void setGoPrescriptionResultCode(String goPrescriptionResultCode) {
		this.goPrescriptionResultCode = goPrescriptionResultCode;
	}
	public String getGoTreatCode() {
		return goTreatCode;
	}
	public void setGoTreatCode(String goTreatCode) {
		this.goTreatCode = goTreatCode;
	}
	public String getGoMedicineCode() {
		return goMedicineCode;
	}
	public void setGoMedicineCode(String goMedicineCode) {
		this.goMedicineCode = goMedicineCode;
	}
	public String getGoPrescriptionResultInjectionNumber() {
		return goPrescriptionResultInjectionNumber;
	}
	public void setGoPrescriptionResultInjectionNumber(String goPrescriptionResultInjectionNumber) {
		this.goPrescriptionResultInjectionNumber = goPrescriptionResultInjectionNumber;
	}
	public String getGoPrescriptionResultDosage() {
		return goPrescriptionResultDosage;
	}
	public void setGoPrescriptionResultDosage(String goPrescriptionResultDosage) {
		this.goPrescriptionResultDosage = goPrescriptionResultDosage;
	}
	public String getGoPrescriptionResultUsage() {
		return goPrescriptionResultUsage;
	}
	public void setGoPrescriptionResultUsage(String goPrescriptionResultUsage) {
		this.goPrescriptionResultUsage = goPrescriptionResultUsage;
	}
	public String getGoPrescriptionResultWriteDate() {
		return goPrescriptionResultWriteDate;
	}
	public void setGoPrescriptionResultWriteDate(String goPrescriptionResultWriteDate) {
		this.goPrescriptionResultWriteDate = goPrescriptionResultWriteDate;
	}
	public String getGoPrescriptionResultGoRegistrationDate() {
		return goPrescriptionResultGoRegistrationDate;
	}
	public void setGoPrescriptionResultGoRegistrationDate(String goPrescriptionResultGoRegistrationDate) {
		this.goPrescriptionResultGoRegistrationDate = goPrescriptionResultGoRegistrationDate;
	}
	@Override
	public String toString() {
		return "GoPrescription [goPrescriptionResultCode=" + goPrescriptionResultCode + ", goTreatCode=" + goTreatCode
				+ ", goMedicineCode=" + goMedicineCode + ", goPrescriptionResultInjectionNumber="
				+ goPrescriptionResultInjectionNumber + ", goPrescriptionResultDosage=" + goPrescriptionResultDosage
				+ ", goPrescriptionResultUsage=" + goPrescriptionResultUsage + ", goPrescriptionResultTotalDate="
				+ goPrescriptionResultTotalDate + ", goPrescriptionResultWriteDate=" + goPrescriptionResultWriteDate
				+ ", goPrescriptionResultGoRegistrationDate=" + goPrescriptionResultGoRegistrationDate + "]";
	}

	
}
