package com.automation.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCSQLStatement {
	private static String URL = "jdbc:mysql://localhost:3306/hr";
	public static String DbUserName = "root";
	private static String DbPassword = "12345";

	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultset = null;
		try {
			connection = DriverManager.getConnection(URL, DbUserName, DbPassword);
			System.out.println("Connected to MySql database..");
			statement = connection.createStatement();
			resultset = statement.executeQuery("Select * from countries");
			while (resultset.next()) {
				System.out
						.println(resultset.getString("country_name") + "'s ID is " + resultset.getString("country_id"));
			}
			System.out.println(
					"####################################Query 2 on the way #################################");
			resultset.previous();
			resultset.previous();
			resultset.close();
			resultset = statement.executeQuery("SELECT last_name, department_name"
					+ " FROM employees e join departments d" + " ON e.department_id=d.department_id");
			while (resultset.next()) {
				System.out.println(
						resultset.getString("last_name") + " works in " + resultset.getString("department_name"));
			}

		} catch (SQLException e) {
			System.out.println("Something went wrong");
			System.out.println();
			e.printStackTrace();

		} finally {
			if (resultset != null) {
				resultset.close();

			}
			if (statement != null) {
				statement.close();
			}
			if (connection != null) {
				connection.close();

			}

		}
	}
}
