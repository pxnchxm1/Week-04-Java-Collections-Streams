package com.test;

public class UserRegister {
	public String registerUser(String username , String password, String email) {
		if(!username.matches("^[a-zA-Z0-9_]{6,15}$")) {
			throw new IllegalArgumentException("invalid username ! ");
		}
		if(!password.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)[A-Za-z\\d]{8,}$")) {
			throw new IllegalArgumentException("invalid password ! ");
		}
		if(!email.matches("^[a-zA-Z0-9]{3,}@[a-zA-Z]{3,}\\.[a-z]{2,3}")) {
			throw new IllegalArgumentException("invalid e-mail ! ");
		}
		return "User registered successfully";
	}

}
