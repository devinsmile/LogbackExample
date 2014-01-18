package com.example.logbackexample.logbackexample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.logbackexample.logbackexample.a.Foo;
import com.example.logbackexample.logbackexample.b.Bar;

/**
 * Hello logback!
 * 
 */
public class App {
	private static final Logger logger = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		logger.trace("main: constructor");
		logger.debug("main: constructor");
		logger.info("main: constructor");
		logger.warn("main: constructor");
		logger.error("main: constructor");

		Foo foo = new Foo();
		Bar bar = new Bar();
		foo.printSomething();
		bar.printSomething();
	}
}
