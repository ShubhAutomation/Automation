package com.hrms.utility;

import org.testng.log4testng.Logger;

public class Log {
	//Initialize Log4j logs
	
	//private static Logger Log =Logger.getLogger(Log.getClass());
	
	
 public static void info(String message) {
	//we can access static method without creating object
	 
	 Log.info(message);
 }
}
