package com.employee.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EmployeeSecurity {
	
	public static void main (String args []) {
		String password = "anuragvalinda";
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String hashedPassword = passwordEncoder.encode(password);
	    
		System.out.println(hashedPassword);
		
		password = "valindaanurag";
		hashedPassword = passwordEncoder.encode(password);
		System.out.println(hashedPassword);
	}

}
