package com.aravind.login;

public class LoginService {
	
	public boolean isUserValid(String user, String password) {
		return user.equalsIgnoreCase("aravind") && password.equals("dummy");
	}

}
