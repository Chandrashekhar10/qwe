package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IvendorDao;
import com.app.pojos.Cart;
import com.app.pojos.Vendor;

@Service
@Transactional
public class VendorServiceImpl implements IVendorService
{
	@Autowired
	IvendorDao dao;
	public VendorServiceImpl()
	{
		System.out.println("in service");
	}

	@Override
	public Vendor Validation(String Email, String password) 
	{
		System.out.println("in servImp");
		System.out.println(Email);
		System.out.println(password);
		// TODO Auto-generated method stub
		return dao.Validation(Email, password);
	}

	@Override
	public int Insert(Vendor v) {
		// TODO Auto-generated method stub
		return dao.Insert(v);
	}

	@Override
	public Cart total(String name) {
		// TODO Auto-generated method stub
		return dao.total(name);
	}

}
