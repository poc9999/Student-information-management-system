package com.langxikeji.JDBC;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class Connections {

	private static Connection connection;

	private static String DRIVER;

	private static String URL;

	private static String USER;

	private static String PASS;

	private static String ROUTE = "/com/langxikeji/JDBC/jdbc.properties";

	private static InputStream is = Properties.class.getResourceAsStream(ROUTE);

	private static Properties prop = new Properties();

	static {

		try {

			prop.load(is);

			DRIVER = prop.getProperty("jdbc_driver");

			URL = prop.getProperty("jdbc_url");

			USER = prop.getProperty("jdbc_user");

			PASS = prop.getProperty("jdbc_pass");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static Connection getConnection() { 
		try {
			Class.forName(DRIVER);

			connection = DriverManager.getConnection(URL, USER, PASS);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return connection;

	}

	public static void main(String[] args) {

		System.out.println(Connections.getConnection());

	}
}
