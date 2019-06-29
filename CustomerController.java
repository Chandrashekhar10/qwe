package com.app.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.pojos.Cart;
import com.app.service.IVendorService;

@Controller
@RequestMapping("/customer")
public class CustomerController 
{
	@Autowired
	IVendorService ser;
	public CustomerController()
	{
		System.out.println("in CustomerController");
	}
	
	@GetMapping("/operation")
	
		public String showRegi()
		{
			System.out.println("in operation");
			return "/customer/operation";
		}
	
	@GetMapping("/buyfood")
	
	public String showfood()
	{
		System.out.println("in buyfood");
		return "/customer/buyfood";
	}
	
	
	@PostMapping("/buyfood")
	
	public String showfood(@RequestParam String name)
	{
		System.out.println(name);
		Cart c=ser.total(name);
		System.out.println(c);
		System.out.println("in buyfood");
		return "/customer/buyfood";
	}
	
	
	
}
