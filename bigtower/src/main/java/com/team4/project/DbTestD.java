package com.team4.project;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DbTestD {
	@Autowired
	private SqlSessionTemplate sql;
	
	public List selectMedicineList(){
		System.out.println("Dao");
		return sql.selectList("government.selectMedicineList");
	}
}
