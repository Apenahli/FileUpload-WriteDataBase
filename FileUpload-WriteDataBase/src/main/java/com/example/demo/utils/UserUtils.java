package com.example.demo.utils;


import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public class UserUtils {

	// ayselp ni goturur // username goturur

	public String getUserName() {

		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

		String currentPrincipalName = authentication.getName();
		
		//System.out.println(currentPrincipalName);

		return currentPrincipalName;
	}

}
