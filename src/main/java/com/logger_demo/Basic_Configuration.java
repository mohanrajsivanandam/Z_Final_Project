package com.logger_demo;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Basic_Configuration {
	
	public static Logger log = Logger.getLogger(Basic_Configuration.class); //created an object without using the new keyword - using down casting
	
	public static void main(String[] args) {
	
	BasicConfigurator.configure();	
		//factory design pattern - Without using the new keyword, we can invoke an object using down casting.
	log.debug("Debugging");
	
	log.info("Information");
	
	log.warn("Warning");
	
	log.error("Error");
	
	log.fatal("Fatal");
	
}
}
