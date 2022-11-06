package com.quiz.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/quiz?characterEncoding=latin1";
			con = DriverManager.getConnection(url, "root", "root");
		} catch (ClassNotFoundException e) {
			System.out.println("Exception occured while Loading the Driver Class in JDBCConnection class");
		}catch (SQLException e) {
			System.out.println("Exception occured while Connecting to Database in JDBCConnection class");
		}
		return con;
	}
	
}
