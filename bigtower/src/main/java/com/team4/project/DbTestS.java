package com.team4.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DbTestS {
	@Autowired
	private DbTestD dbTestD;

	public List selectMedicineList(){
		System.out.println("Service");
		return dbTestD.selectMedicineList();
	}
}
