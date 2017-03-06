package com.team4.project.government.dbInsert.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DbInsertController {
	private static final Logger logger = LoggerFactory.getLogger(DbInsertController.class);
	@Autowired
	private DbInsertService dbInsertService;
	
}
