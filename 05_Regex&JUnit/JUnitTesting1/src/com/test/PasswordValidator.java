package com.test;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class PasswordValidator {
	
	public boolean isValidPassword(String password) {
		Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)[A-Za-z\\d]{8,}$");
		Matcher matcher = pattern.matcher(password);
		return matcher.find();
	}

}
