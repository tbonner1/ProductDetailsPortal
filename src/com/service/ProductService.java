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
		Session session = HibernateUtility.getSession();
		try 
		{
			Transaction tx = session.beginTransaction();
			session.update(pro);
			tx.commit();
		} 
		catch (Exception e) 
		{
			try 
			{
				e.printStackTrace();
				Transaction tx = session.beginTransaction();
				session.save(pro);
				tx.commit();
			}
			catch(Exception f)
			{
				f.printStackTrace();
				return -1;
			}
			return 1;
		}
		return 0;
	}
}
