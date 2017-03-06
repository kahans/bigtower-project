package com.team4.project.government.dto;

public class GoChart {
	private String goChartCode;
	private String goPatientCode;
	private String gogospitalCode;
	private String goChartRegistrationDat;
	private int goGoSendState;
	public String getgoChartCode() {
		return goChartCode;
	}
	public void setgoChartCode(String goChartCode) {
		this.goChartCode = goChartCode;
	}
	public String getgoPatientCode() {
		return goPatientCode;
	}
	public void setgoPatientCode(String goPatientCode) {
		this.goPatientCode = goPatientCode;
	}
	public String getgogospitalCode() {
		return gogospitalCode;
	}
	public void setgogospitalCode(String gogospitalCode) {
		this.gogospitalCode = gogospitalCode;
	}
	public String getgoChartRegistrationDat() {
		return goChartRegistrationDat;
	}
	public void setgoChartRegistrationDat(String goChartRegistrationDat) {
		this.goChartRegistrationDat = goChartRegistrationDat;
	}
	public int getgoGoSendState() {
		return goGoSendState;
	}
	public void setgoGoSendState(int goGoSendState) {
		this.goGoSendState = goGoSendState;
	}
	@Override
	public String toString() {
		return "GoChart [goChartCode=" + goChartCode + ", goPatientCode=" + goPatientCode + ", gogospitalCode="
				+ gogospitalCode + ", goChartRegistrationDat=" + goChartRegistrationDat + ", goGoSendState="
				+ goGoSendState + "]";
	}
	
}
