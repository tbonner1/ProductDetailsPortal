package com.model;

//Used as an object that will be used to search the database
public class Login 
{
	private String username;
	private String password;
	
	public Login(String username, String password) 
	{
		super();
		this.username = username;
		this.password = password;
	}
	
	public String getUsername() 
	{
		return username;
	}
	public void setUsername(String username) 
	{
		this.username = username;
	}
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}
}
