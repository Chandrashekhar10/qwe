package com.app.service;

import com.app.pojos.Cart;
import com.app.pojos.Vendor;

public interface IVendorService {
	  Vendor Validation(String Email,String password);
	  int Insert(Vendor v);

	  Cart total(String name);

}
