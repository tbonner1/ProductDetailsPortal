package com.service;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.dao.ProductDao;
import com.model.Product;
import com.utility.HibernateUtility;

public class ProductService implements ProductDao
{
	//Will attempt to update, then add, if both fail -1 is returned
	@Override
	public int product(Product pro) 
	{
		boolean add = false;
		
		try 
		{
			Session session = HibernateUtility.getSession();
			Transaction tx = session.beginTransaction();
			session.update(pro);
			tx.commit();
		} 
		catch (Exception e) 
		{
			try 
			{
				Session session = HibernateUtility.getSession();
				Transaction tx = session.beginTransaction();
				session.save(pro);
				tx.commit();
			} 
			catch(Exception f)
			{
				return -1;
			}
			add=true;
		}
		if(!add)
			return 0;
		return 1;
	}
}
