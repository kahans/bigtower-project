package com.team4.project.hospital.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.project.hospital.test.domain.HoMediaTest;

@Service
public class HoTestService {

	@Autowired
	private HoTestDao hoTD;

	public List<HoMediaTest> mediaTest(HoMediaTest hmt) {
		// TODO Auto-generated method stub
		return hoTD.mediaList(hmt);
	}
}
