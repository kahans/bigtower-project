package com.team4.project.government.hopitalizationSurgery.domain;

import java.util.List;

import com.team4.project.government.diagnosisPrescription.domain.GoDiagnosis;

public class GoSearchHospitalizationSub extends GoHospitalization{
	//DB에서 조인문을 통해서 받는 값들
	protected String goHospitalName;
	protected String goCitizenName;
	
	protected List<GoDiagnosis> diagnosisList;
	
	public String getGoCitizenName() {
		return goCitizenName;
	}
	public void setGoCitizenName(String goCitizenName) {
		this.goCitizenName = goCitizenName;
	}
	public String getGoHospitalName() {
		return goHospitalName;
	}
	public void setGoHospitalName(String goHospitalName) {
		this.goHospitalName = goHospitalName;
	}
	public List<GoDiagnosis> getDiagnosisList() {
		return diagnosisList;
	}
	public void setDiagnosisList(List<GoDiagnosis> diagnosisList) {
		this.diagnosisList = diagnosisList;
	}
	@Override
	public String toString() {
		return "GoSearchHospitalizationSub [goHospitalName=" + goHospitalName + ", goCitizenName=" + goCitizenName
				+ ", diagnosisList=" + diagnosisList + "]";
	}
	
	
}
