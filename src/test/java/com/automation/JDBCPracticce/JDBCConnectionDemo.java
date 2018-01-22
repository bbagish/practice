package com.automation.JDBCPracticce;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnectionDemo {
	private static final String URL = "jdbc:mysql://localhost:3306/hr";
	private static final String DB_USERNAME = "root";
	private static final String DB_PASSWORD = "root";

	public static void main(String[] args) {
		try {
			//Creating connection to the database
			Connection connection = DriverManager.getConnection(URL, DB_USERNAME, DB_PASSWORD);
			System.out.println("MySQL database connection successful");
			
			//creating statement
			
			Statement statement = connection.createStatement();
			
			ResultSet resultSet=statement.executeQuery("Select * from countries");
			System.out.println(resultSet.getString("country_name"));
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			System.out.println("Something went wrong!");
			e.printStackTrace();
		}

	}
}
