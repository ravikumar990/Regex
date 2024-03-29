package com.regex;

import java.util.Scanner;

public class UserInfo {
	Scanner sc = new Scanner(System.in);
	ValidateUserInfo validateInfo = new ValidateUserInfo();

	public void userFirstName() {
		// taking user input
		System.out.println("Enter Your First Name : ");
		String firstName = sc.next();

		// call firstName method in Validate class
		validateInfo.firstName(firstName);
	}

	public void userLastName() {
		// taking user input
		System.out.println("Enter Your Last Name : ");
		String lastName = sc.next();

		// call firstName method in Validate class
		validateInfo.lastName(lastName);
	}

	public void userEmailId() {
		// taking user input
		System.out.println("Enter Your Email : ");
		String emailID = sc.next();

		// call firstName method in Validate class
		validateInfo.emailId(emailID);
	}

	public void userMobNum() {
		// taking user input
		System.out.println("Enter Your Mobile Number : ");
		String mobileNum = sc.next();

		// call firstName method in Validate class
		validateInfo.mobNum(mobileNum);
	}

	public void userPassword() {
		// taking user input
		System.out.println("Enter Your Password : ");
		String passWord = sc.next();

		// call firstName method in Validate class
		validateInfo.password(passWord);
	 }
}
