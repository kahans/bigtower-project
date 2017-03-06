package com.team4.project.government.dto;

public class GoCitizen {
	protected int goCitizenNo;
	protected String goCitizenId;
	protected String goCitizenPw;
	protected String goCitizenName;
	protected String goCitizenPhone;
	protected String goCitizenZipCode;
	protected String goCitizenAddress;
	protected String goCitizenDetailAddress;
	
	public int getGoCitizenNo() {
		return goCitizenNo;
	}
	public void setGoCitizenNo(int goCitizenNo) {
		this.goCitizenNo = goCitizenNo;
	}
	public String getGoCitizenId() {
		return goCitizenId;
	}
	public void setGoCitizenId(String goCitizenId) {
		this.goCitizenId = goCitizenId;
	}
	public String getGoCitizenPw() {
		return goCitizenPw;
	}
	public void setGoCitizenPw(String goCitizenPw) {
		this.goCitizenPw = goCitizenPw;
	}
	public String getGoCitizenName() {
		return goCitizenName;
	}
	public void setGoCitizenName(String goCitizenName) {
		this.goCitizenName = goCitizenName;
	}
	public String getGoCitizenPhone() {
		return goCitizenPhone;
	}
	public void setGoCitizenPhone(String goCitizenPhone) {
		this.goCitizenPhone = goCitizenPhone;
	}
	public String getGoCitizenZipCode() {
		return goCitizenZipCode;
	}
	public void setGoCitizenZipCode(String goCitizenZipCode) {
		this.goCitizenZipCode = goCitizenZipCode;
	}
	public String getGoCitizenAddress() {
		return goCitizenAddress;
	}
	public void setGoCitizenAddress(String goCitizenAddress) {
		this.goCitizenAddress = goCitizenAddress;
	}
	public String getGoCitizenDetailAddress() {
		return goCitizenDetailAddress;
	}
	public void setGoCitizenDetailAddress(String goCitizenDetailAddress) {
		this.goCitizenDetailAddress = goCitizenDetailAddress;
	}
	@Override
	public String toString() {
		return "GoCitizen [goCitizenNo=" + goCitizenNo + ", goCitizenId=" + goCitizenId + ", goCitizenPw=" + goCitizenPw
				+ ", goCitizenName=" + goCitizenName + ", goCitizenPhone=" + goCitizenPhone + ", goCitizenZipCode="
				+ goCitizenZipCode + ", goCitizenAddress=" + goCitizenAddress + ", goCitizenDetailAddress="
				+ goCitizenDetailAddress + "]";
	}
	
}
