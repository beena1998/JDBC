package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
	public static Connection getConnection() {
		Connection con = null;
	
		try {
		String driverName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/employee?autoReconnect=true&useSSL=false";
		Class.forName(driverName);
		con = DriverManager.getConnection(url, "root", "root");
		System.out.println(con != null ? "connection established" : "connection failed");

		} catch (ClassNotFoundException cnfe) {
		System.out.println("There is no respective jars : "
		+ cnfe.getMessage());
		} catch (SQLException se) {// Catching SQL Exception
		System.out.println("SQL Exception :" + se.getMessage());
		} catch (Exception e) {
		System.out.println(e);
		}


		return con;
		}

}
