package com.team4.project.government.test.domain;

import java.util.List;

public class GoTest {
	protected String goCitizenId;
	protected List<GoBloodTestTreatSub> goBloodTestTreatSub;
	protected List<GoImageTestTreatSub> goImageTestTreatSub;
	protected List<SelectInfo> selectInfo;
	protected int selectBloodTestCount;
	protected String goFirstDate;
	protected String goSecondDate;
	

	public List<SelectInfo> getSelectInfo() {
		return selectInfo;
	}

	public void setSelectInfo(List<SelectInfo> selectInfo) {
		this.selectInfo = selectInfo;
	}

	public int getSelectBloodTestCount() {
		return selectBloodTestCount;
	}

	public void setSelectBloodTestCount(int selectBloodTestCount) {
		this.selectBloodTestCount = selectBloodTestCount;
	}

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

	public List<GoImageTestTreatSub> getGoImageTestTreatSub() {
		return goImageTestTreatSub;
	}

	public void setGoImageTestTreatSub(List<GoImageTestTreatSub> goImageTestTreatSub) {
		this.goImageTestTreatSub = goImageTestTreatSub;
	}

	@Override
	public String toString() {
		return "GoTest [goCitizenId=" + goCitizenId + ", goBloodTestTreatSub=" + goBloodTestTreatSub
				+ ", goImageTestTreatSub=" + goImageTestTreatSub + ", goFirstDate=" + goFirstDate + ", goSecondDate="
				+ goSecondDate + "]";
	}








	
	
}
