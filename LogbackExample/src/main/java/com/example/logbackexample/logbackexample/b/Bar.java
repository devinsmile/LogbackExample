package com.example.logbackexample.logbackexample.b;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bar {
	private static final Logger logger = LoggerFactory.getLogger(Bar.class);

	public Bar() {
		logger.trace("Bar: constructor");
		logger.debug("Bar: constructor");
		logger.info("Bar: constructor");
		logger.warn("Bar: constructor");
		logger.error("Bar: constructor");

	}

	public void printSomething() {
		logger.trace("Bar: printingSomething()");
		logger.debug("Bar: printingSomething()");
		logger.info("Bar: printingSomething()");
		logger.warn("Bar: printingSomething()");
		logger.error("Bar: printingSomething()");

	}
}
