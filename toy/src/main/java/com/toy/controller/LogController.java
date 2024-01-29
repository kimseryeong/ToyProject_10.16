package com.toy.controller;


import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;

import ch.qos.logback.classic.Logger;

public class LogController {

	private final Logger log = (Logger) LoggerFactory.getLogger(this.getClass().getSimpleName());
	
	@GetMapping("/")
	public void log() {
		log.trace("trace message");
		log.debug("trace debug");
		log.info("trace info"); //default
		log.warn("trace warn");
		log.error("trace error");
	}
	
	
	
}
