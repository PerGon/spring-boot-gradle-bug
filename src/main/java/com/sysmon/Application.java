package com.sysmon;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;

public class Application {

	/**
	 * Application bootstrap
	 *
	 * For more information visit -> http://projects.spring.io/spring-boot/
	 */

	public static void main(String[] args) {
		Logger root = (Logger) LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);
		root.setLevel(Level.INFO);
		SpringApplication.run(ApplicationBootstrap.class, args);
	}
}