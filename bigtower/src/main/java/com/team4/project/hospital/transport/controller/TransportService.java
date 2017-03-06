package com.team4.project.hospital.transport.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransportService {
	private static final Logger logger = LoggerFactory.getLogger(TransportService.class);
	@Autowired
	private TransportDao dbInsertDao;
}
