package com.app.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Cart;
import com.app.pojos.Vendor;


@Repository
public class VendorDao implements IvendorDao
{
    @Autowired
    private SessionFactory sf;
    public VendorDao()
    {
    	System.out.println("in dao con");
    }
	@Override
	public Vendor Validation(String Email, String password) 
	{
		System.out.println("in servImp");
		System.out.println(Email);
		System.out.println(password);
		// TODO Auto-generated method stub
		String jpql="select v from Vendor v where v.email=:em and v.password=:pass";
		  Vendor v=sf.getCurrentSession().createQuery(jpql,Vendor.class).setParameter("em",Email).setParameter("pass",password).getSingleResult();
		  if(v==null)
		  {
			  return null;
		  }
		  return v;
	}
	@Override
	public int Insert(Vendor v) {
		// TODO Auto-generated method stub
		return (int) sf.getCurrentSession().save(v);
	}
	@Override
	public Cart total(String name) {
		// TODO Auto-generated method stub
		String jpql="select v.price from Cart v where v.name=:name";
		  Cart price=sf.getCurrentSession().createQuery(jpql,Cart.class).setParameter("name",name).getSingleResult();
		  if(price==null)
		  {
			  return null;
		  }
		return price;
	}
	
}
