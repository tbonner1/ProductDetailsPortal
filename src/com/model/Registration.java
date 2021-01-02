package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

//Used to create the registration table 
@Entity
public class Registration 
{
	@Id
	private String username;
	private String email;
	private String password;
	
	Registration()
	{
		
	}
	public Registration(String username, String email, String password) 
	{
		super();
		this.username = username;
		this.email = email;
		this.password = password;
	}

	@Override
	public String toString() 
	{
		return "Registration [username=" + username + ", email=" + email + ", password=" + password + "]";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
