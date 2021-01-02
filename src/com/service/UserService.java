package com.service;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.dao.UserDao;
import com.model.Login;
import com.model.Registration;
import com.utility.HibernateUtility;

public class UserService implements UserDao
{
	//Register a new user
	@Override
	public boolean registration(Registration reg) 
	{
		try 
		{
			Session session = HibernateUtility.getSession();
			Transaction tx = session.beginTransaction();
			session.save(reg);
			tx.commit();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			return false;
		}
		return true;
	}

	//Try to login as an existing user
	@Override
	public boolean login(Login log) 
	{
		String username = log.getUsername();
		String password = log.getPassword();

		try 
		{
			Session session = HibernateUtility.getSession();

			Query qu = session.createSQLQuery("select * from registration i where i.username = :ucode and i.password = :pcode").addEntity(Registration.class).setParameter("ucode", username).setParameter("pcode", password);
			
			List result = qu.list();
			
			if(result.isEmpty())
				return false;
			return true;
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		return false;
	}
}
