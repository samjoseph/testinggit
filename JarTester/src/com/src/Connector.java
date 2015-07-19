package com.src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Connector {

	public static void makeConnection(String url, String user, String password)
			throws SQLException {
		Properties props = new Properties();
		props.setProperty("user", user);
		props.setProperty("password", password);
		Connection connection = DriverManager.getConnection(url, props);
		if (connection != null) {
			System.out.println("You made it, take control your database now!");
		} else {
			System.out.println("Failed to make connection!");
		}
		connection.close();
	}

}
