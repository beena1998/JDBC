package com.service;

import com.appexception.AppException;
import com.dao.UserDao;
import com.dao.UserDaoImp;
import com.model.User;

public class UserServiceImp implements UserService {

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
		User user=null;
		if(Integer.toString(userId).length()>=3 && password!=null && password.length()>3) {
			System.out.println("In UserServiceImp");
			UserDao userdao = new UserDaoImp();
			user= userdao.readUserByIdAndPassword(userId, password);
		}
		else {
			throw new AppException("Validation Fail!!");
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
