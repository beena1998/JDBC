package com.main;

import java.util.Scanner;
import com.appexception.AppException;
import com.model.User;
import com.service.UserService;
import com.service.UserServiceImp;

public class AppMain {

	public static void main(String[] args) throws AppException {
		// UserDao dao=new UserDaoImp();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter user id :");
		int userid = scan.nextInt();
		System.out.println("Enter user password : ");
		String pswd = scan.next();
		UserService service = new UserServiceImp();
		try {

			User objService = service.readUserByIdAndPassword(userid, pswd);
			System.out.println("Welcome : " + objService.getUserName());
		} catch (AppException e) {
			System.err.println(e.getMessage());
		}
		// System.out.println("Welcome : "+ obj.getUserName());

	}

}
