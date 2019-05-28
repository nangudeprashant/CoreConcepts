package com.javalive.CoreConcepts;
//import org.apache.log4j.Logger;   // Log4J
import org.slf4j.Logger;			// SLF4J
import org.slf4j.LoggerFactory; 	// SLF4J


public class LoggingDemo {
   // static Logger logger = Logger.getLogger(LoggingDemo.class);// Log4J
    
    private static final Logger logger = LoggerFactory.getLogger(LoggingDemo.class);  // SLF4J
    
    public static void main(String[] args) {        
        logger.debug("This is debug message");
        logger.info("This is info message");
        logger.warn("This is warn message");
        logger.info("Testing 1234");
        //logger.fatal("This is fatal message");
        //logger.error("This is error message");
        System.out.println("\nLogic executed successfully....");
    }
}


