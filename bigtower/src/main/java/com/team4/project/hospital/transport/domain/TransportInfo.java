package com.team4.project.hospital.transport.domain;

import java.util.List;

import com.team4.project.hospital.diagnosisPrescription.domain.HoDiagnosis;
import com.team4.project.hospital.diagnosisPrescription.domain.HoPrescription;
import com.team4.project.hospital.hospitalizationOperation.domain.HoHospitalization;
import com.team4.project.hospital.hospitalizationOperation.domain.HoOperation;
import com.team4.project.hospital.test.domain.HoBloodTest;
import com.team4.project.hospital.test.domain.HoMediaTest;
import com.team4.project.hospital.treatChart.domain.HoChart;
import com.team4.project.hospital.treatChart.domain.HoTreat;
import com.team4.project.hospital.vaccineCheckup.domain.HoCheckup;
import com.team4.project.hospital.vaccineCheckup.domain.HoVaccine;

public class TransportInfo {
	private List<HoBloodTest> hoBloodTest;
	private List<HoChart> hoChart;
	private List<HoCheckup> hoCheckup;
	private List<HoDiagnosis> hoDiagnosis;
	private List<HoHospitalization> hoHospitalization;
	private List<HoMediaTest> hoMediaTest;
	private List<HoOperation> hoOperation;
	private List<HoPrescription> hoPrescription;
	private List<HoTreat> hoTreat;
	private List<HoVaccine> hoVaccine;
	
	public List<HoBloodTest> getHoBloodTest() {
		return hoBloodTest;
	}
	public void setHoBloodTest(List<HoBloodTest> hoBloodTest) {
		this.hoBloodTest = hoBloodTest;
	}
	public List<HoChart> getHoChart() {
		return hoChart;
	}
	public void setHoChart(List<HoChart> hoChart) {
		this.hoChart = hoChart;
	}
	public List<HoCheckup> getHoCheckup() {
		return hoCheckup;
	}
	public void setHoCheckup(List<HoCheckup> hoCheckup) {
		this.hoCheckup = hoCheckup;
	}
	public List<HoDiagnosis> getHoDiagnosis() {
		return hoDiagnosis;
	}
	public void setHoDiagnosis(List<HoDiagnosis> hoDiagnosis) {
		this.hoDiagnosis = hoDiagnosis;
	}
	public List<HoHospitalization> getHoHospitalization() {
		return hoHospitalization;
	}
	public void setHoHospitalization(List<HoHospitalization> hoHospitalization) {
		this.hoHospitalization = hoHospitalization;
	}
	public List<HoMediaTest> getHoMediaTest() {
		return hoMediaTest;
	}
	public void setHoMediaTest(List<HoMediaTest> hoMediaTest) {
		this.hoMediaTest = hoMediaTest;
	}
	public List<HoOperation> getHoOperation() {
		return hoOperation;
	}
	public void setHoOperation(List<HoOperation> hoOperation) {
		this.hoOperation = hoOperation;
	}
	public List<HoPrescription> getHoPrescription() {
		return hoPrescription;
	}
	public void setHoPrescription(List<HoPrescription> hoPrescription) {
		this.hoPrescription = hoPrescription;
	}
	public List<HoTreat> getHoTreat() {
		return hoTreat;
	}
	public void setHoTreat(List<HoTreat> hoTreat) {
		this.hoTreat = hoTreat;
	}
	public List<HoVaccine> getHoVaccine() {
		return hoVaccine;
	}
	public void setHoVaccine(List<HoVaccine> hoVaccine) {
		this.hoVaccine = hoVaccine;
	}
	
	
	
}
