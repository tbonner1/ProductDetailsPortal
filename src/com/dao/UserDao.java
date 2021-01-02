package com.dao;

import com.model.Registration;
import com.model.Login;
//Implemented by UserService.java
public interface UserDao 
{
	public boolean registration(Registration reg);
	public boolean login(Login log);
}