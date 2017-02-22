package com.team4.project.government.test.domain;

import java.util.List;

public class GoTest {
	private String goCitizenId;
	private List<GoBloodTestTreatSub> goBloodTestTreatSub;
	private List<GoImageTest> goImageTest;
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


	public List<GoBloodTestTreatSub> getGoBloodTestTreatSub() {
		return goBloodTestTreatSub;
	}

	public void setGoBloodTestTreatSub(List<GoBloodTestTreatSub> goBloodTestTreatSub) {
		this.goBloodTestTreatSub = goBloodTestTreatSub;
	}

	public List<GoImageTest> getGoImageTest() {
		return goImageTest;
	}

	public void setGoImageTest(List<GoImageTest> goImageTest) {
		this.goImageTest = goImageTest;
	}

	@Override
	public String toString() {
		return "GoTest [goCitizenId=" + goCitizenId + ", goBloodTestTreatSub=" + goBloodTestTreatSub + ", goImageTest="
				+ goImageTest + ", goFirstDate=" + goFirstDate + ", goSecondDate=" + goSecondDate + "]";
	}




	
	
}
