package com.service;

import com.appexception.AppException;
import com.model.User;

public interface UserService {
User createUser(User user) throws AppException;
User readUserById(int userId) throws AppException;
User readUserByName(String userName) throws AppException;
User readUserByIdAndPassword(int userId, String password) throws AppException;
User updateUser(User user);
boolean deleteUserById(int userId);




}
