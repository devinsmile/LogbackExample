package com.example.logbackexample.logbackexample.a;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Foo {
	private static final Logger logger = LoggerFactory.getLogger(Foo.class);

	public Foo() {
		logger.trace("Foo: constructor");
		logger.debug("Foo: constructor");
		logger.info("Foo: constructor");
		logger.warn("Foo: constructor");
		logger.error("Foo: constructor");

	}

	public void printSomething() {
		logger.trace("Foo: printingSomething()");
		logger.debug("Foo: printingSomething()");
		logger.info("Foo: printingSomething()");
		logger.warn("Foo: printingSomething()");
		logger.error("Foo: printingSomething()");

	}
}
