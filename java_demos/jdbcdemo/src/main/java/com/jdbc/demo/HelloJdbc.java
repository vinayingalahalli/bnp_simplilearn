package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HelloJdbc {

	public static void main(String[] args) {
		
		Connection connection=null;
		
		try {
			//Step 1
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded");
			//Step 2
			String url="jdbc:mysql://localhost:3306/bnp";
			String username="root";
			String password="root";
			connection=DriverManager.getConnection(url, username, password);
			System.out.println("Connection Successful");
			//Step 3
			Statement statement=connection.createStatement();
			String sql="select id,name,age,gender,teamName from player";
			//Step 4
			ResultSet resultSet=statement.executeQuery(sql);
			System.out.println("Query Executed");
			//Step 5
			System.out.println("Printing Player Details");
			System.out.println("--------------------------");
			while(resultSet.next()) {
				System.out.print("Id "+resultSet.getInt("id"));
				System.out.print(" Name "+resultSet.getString("name"));
				System.out.print("  Age "+resultSet.getInt("age"));
				System.out.print("  Gender "+resultSet.getString("gender"));
				System.out.println("  TeamName "+resultSet.getString("teamName"));
			}
			System.out.println("Results Processed");
		} catch (ClassNotFoundException e) {
			System.out.println("Unable to load driver "+e.getMessage());
		} catch (SQLException e) {
			System.out.println(e);
		}finally {
			try {
				//Step6
				connection.close();
				System.out.println("Connection closed");
			} catch (SQLException e) {
				System.out.println(e);
			}
		}

	}

}
