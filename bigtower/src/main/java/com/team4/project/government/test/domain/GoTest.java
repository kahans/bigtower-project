package com.team4.project.government.test.domain;

import java.util.List;

public class GoTest {
	private String goCitizenId;
	private List<GoBloodTest> goBloodTest;
	private String goFirstDate;
	private String goSecondDate;

	
	public String getGoFirstDate() {
		return goFirstDate;
	}

	public void setGoFirstDate(String goFirstDate) {
		this.goFirstDate = goFirstDate;
	}

	public String getGoSecondDate() {
		return goSecondDate;
	}

	public void setGoSecondDate(String goSecondDate) {
		this.goSecondDate = goSecondDate;
	}


	public String getGoCitizenId() {
		return goCitizenId;
	}

	public void setGoCitizenId(String goCitizenId) {
		this.goCitizenId = goCitizenId;
	}

	public List<GoBloodTest> getGoBloodTest() {
		return goBloodTest;
	}

	public void setGoBloodTest(List<GoBloodTest> goBloodTest) {
		this.goBloodTest = goBloodTest;
	}

	@Override
	public String toString() {
		return "GoTest [goCitizenId=" + goCitizenId + ", goBloodTest=" + goBloodTest + ", goFirstDate=" + goFirstDate
				+ ", goSecondDate=" + goSecondDate + "]";
	}
	
	
}
