package com.logger_demo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Property_Configuration {
public static Logger log = Logger.getLogger(Property_Configuration.class);
public static void main(String[] args) {
	
	PropertyConfigurator.configure("log4j.properties");
	
	log.debug("Debugging");
	
	log.info("Information");
	
	log.warn("Warning");
	
	log.error("Error");
	
	log.fatal("Fatal");	
}

}
