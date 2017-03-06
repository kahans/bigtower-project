package com.team4.project.hospital.transport.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransportController {
	private static final Logger logger = LoggerFactory.getLogger(TransportController.class);
	@Autowired
	private TransportService dbInsertService;
	
}
