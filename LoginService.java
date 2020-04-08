package com.practice.springboot.web.service;

import org.springframework.stereotype.Component;

@Component
public class LoginService 
{
	public boolean isValid(String name,String password)
	{
		return name.equalsIgnoreCase("Abhinaba") && password.equalsIgnoreCase("abc123");
	}
}
