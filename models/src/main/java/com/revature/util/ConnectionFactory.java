package com.revature.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class ConnectionFactory {
	
	private static Logger logger = LogManager.getLogger(ConnectionFactory.class);
	private static Properties props = getJdbcProperties();
	
	private static final String URL = props.getProperty("jdbc.url");
	private static final String USERNAME = props.getProperty("jdbc.username");
	private static final String PASSWORD = props.getProperty("jdbc.password");
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			logger.error("Failed to load JDBC driver: {}", e);
			System.exit(1);
		}
	}
	
	private ConnectionFactory() {}
	
	public static Connection getConnection() {
		try {
			return DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (SQLException e) {
			Exceptions.logSQLException(e);
			return null;
		}
	}
	
	private static Properties getJdbcProperties() {
		try {
			Properties props = new Properties();
			props.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("application.properties"));
			return props;
		} catch (IOException | NullPointerException e) {
			logger.error("Unable to locate JDBC Properties at src/main/resources/application.properties");
			logger.error("Stacktrace: ", e);
			throw new RuntimeException("Check logs; Failed to get connection properties");
		}
	}
}
