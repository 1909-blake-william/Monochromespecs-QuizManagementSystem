package com.revature.util;

import java.io.IOException;
import java.sql.SQLException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Exceptions {
	
	//Creates singleton
	private static Logger logger = LogManager.getLogger(Exceptions.class);
	
	//Restricts instantiation
	private Exceptions() {}

	public static void logSQLException(SQLException e) {
		logger.warn("SQL Message: {}", e.getMessage());
		logger.warn("Error Code: {}", e.getErrorCode());
		logger.warn("SQL State: {}", e.getSQLState());
		logger.warn("Stacktrace: ", e);
	}
	
	public static void logJsonMarshalException(IOException e, Class<?> clazz) {
		logger.warn("Failed to marshal object of type {}", clazz.getName());
		logger.warn("Stacktrace: {}", e);
	}
	
	public static void logJsonUnMarshalException(IOException e, Class<?> clazz) {
		logger.warn("Failed to unmarshal object of type {}", clazz.getName());
		logger.warn("Stacktrace: ", e);
	}
}
