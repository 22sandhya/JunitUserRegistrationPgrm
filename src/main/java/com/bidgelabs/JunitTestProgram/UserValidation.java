package com.bidgelabs.JunitTestProgram;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserValidation {

	public static final String NAME_VALIDATOR = "^[a-z A-Z]{4,}$";

	Scanner sc = new Scanner(System.in);

	public static boolean firstNameValidator() {
		UserValidation uservalidate = new UserValidation();
		System.out.println("Enter the first name: ");
		String fName = uservalidate.sc.nextLine();
		return Pattern.matches(uservalidate.NAME_VALIDATOR, fName);
	}

}
