package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.appexception.AppException;
import com.model.User;
import com.mysql.jdbc.PreparedStatement;

public class UserDaoImp implements UserDao {

	@Override
	public User createUser(User user) throws AppException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User readUserById(int userId) throws AppException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User readUserByName(String userName) throws AppException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User readUserByIdAndPassword(int userId, String password) throws AppException {
		
		Connection connection= MyConnection.getConnection();
		ResultSet resultSet= null;
		User user=null;
		String  query="select * from users where user_id=? and password=?";
	try {
		System.out.println("In UserDaoImp");
		PreparedStatement preparedStatement=(PreparedStatement) connection.prepareStatement(query);
		preparedStatement.setInt(1,userId);
		preparedStatement.setString(2,password);
		resultSet= preparedStatement.executeQuery();
		user= new User();
		while(resultSet.next()) {
			user.setUserId(resultSet.getInt("user_id"));
			user.setPassword(resultSet.getString("password"));
			user.setUserName(resultSet.getString("username"));
			
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
		
		return user;
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteUserById(int userId) {
		// TODO Auto-generated method stub
		return false;
	}

}
