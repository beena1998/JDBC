package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;

public class MySQLConnection {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement preparedStatement=null;
//		Statement stmt = null;
		ResultSet rs = null;
		try {
			String driverName = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/employee?autoReconnect=true&useSSL=false";
			Class.forName(driverName);
			connection = DriverManager.getConnection(url, "root", "root");
			System.out.println(connection != null ? "connection established" : "connection failed");
			String selctQuery = "select * from users where user_id=? and username=?";
//			stmt = connection.createStatement();
			preparedStatement= (PreparedStatement) connection.prepareStatement(selctQuery);
			
			Scanner scan= new Scanner(System.in);
			System.out.println("Enter user id");
			int userId=scan.nextInt();
			
			
			preparedStatement.setInt(1,userId);
			preparedStatement.setString(2,"abhay");
			rs=preparedStatement.executeQuery();
//			rs=stmt.executeQuery(selctQuery);
			
			
			
			while(rs.next()) {
				System.out.println(rs.getInt("user_id"));
			System.out.println(rs.getString("username"));
			System.out.println(rs.getString("password"));
			}
			
			
		} catch (ClassNotFoundException cnfe) {
			System.out.println("There is no respective jars : " + cnfe.getMessage());
		} catch (SQLException se) {// Catching SQL Exception
			System.out.println("SQL Exception :" + se.getMessage());
		} catch (Exception e) {
			System.out.println(e);
		}

		finally {
			try {
				connection.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}

//		return connection;
	}

}
