package com.wille.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Value("${something}")
	String something;
	
	public void doSomething(){
		logger.info("Hello, " + something);
	}
}
