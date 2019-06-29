package com.app.dao;

import com.app.pojos.Cart;
import com.app.pojos.Vendor;

public interface IvendorDao 
{
  Vendor Validation(String Email,String password);
  int Insert(Vendor v);
  Cart total(String name);
}
