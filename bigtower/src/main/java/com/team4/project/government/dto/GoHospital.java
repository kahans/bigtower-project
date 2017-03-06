package com.team4.project.government.dto;

public class GoHospital {
	protected String goHospitalId;
	protected String goHospitalPw;
	protected String goHospitalName;
	protected String goHospitalPhone;
	protected String goHospitalBusinessNo;
	protected String goHospitalZipCode;
	protected String goHospitalAddress;
	protected String goHospitalAddressDetail;
	
	public String getGoHospitalId() {
		return goHospitalId;
	}
	public void setGoHospitalId(String goHospitalId) {
		this.goHospitalId = goHospitalId;
	}
	public String getGoHospitalPw() {
		return goHospitalPw;
	}
	public void setGoHospitalPw(String goHospitalPw) {
		this.goHospitalPw = goHospitalPw;
	}
	public String getGoHospitalName() {
		return goHospitalName;
	}
	public void setGoHospitalName(String goHospitalName) {
		this.goHospitalName = goHospitalName;
	}
	public String getGoHospitalPhone() {
		return goHospitalPhone;
	}
	public void setGoHospitalPhone(String goHospitalPhone) {
		this.goHospitalPhone = goHospitalPhone;
	}
	public String getGoHospitalBusinessNo() {
		return goHospitalBusinessNo;
	}
	public void setGoHospitalBusinessNo(String goHospitalBusinessNo) {
		this.goHospitalBusinessNo = goHospitalBusinessNo;
	}
	public String getGoHospitalZipCode() {
		return goHospitalZipCode;
	}
	public void setGoHospitalZipCode(String goHospitalZipCode) {
		this.goHospitalZipCode = goHospitalZipCode;
	}
	public String getGoHospitalAddress() {
		return goHospitalAddress;
	}
	public void setGoHospitalAddress(String goHospitalAddress) {
		this.goHospitalAddress = goHospitalAddress;
	}
	public String getGoHospitalAddressDetail() {
		return goHospitalAddressDetail;
	}
	public void setGoHospitalAddressDetail(String goHospitalAddressDetail) {
		this.goHospitalAddressDetail = goHospitalAddressDetail;
	}
	@Override
	public String toString() {
		return "GoHospital [goHospitalId=" + goHospitalId + ", goHospitalPw=" + goHospitalPw + ", goHospitalName="
				+ goHospitalName + ", goHospitalPhone=" + goHospitalPhone + ", goHospitalBusinessNo="
				+ goHospitalBusinessNo + ", goHospitalZipCode=" + goHospitalZipCode + ", goHospitalAddress="
				+ goHospitalAddress + ", goHospitalAddressDetail=" + goHospitalAddressDetail + "]";
	}
	
}
