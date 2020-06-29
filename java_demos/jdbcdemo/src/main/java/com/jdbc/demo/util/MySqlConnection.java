package com.jdbc.demo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnection {

	private MySqlConnection() {
		// TODO Auto-generated constructor stub
	}
	
	private static Connection connection;
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/bnp";
		String username="root";
		String password="root";
		connection=DriverManager.getConnection(url, username, password);
		return connection;
	}
}
//SingleTon Java Class