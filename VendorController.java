package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.pojos.Vendor;
import com.app.service.IVendorService;

@Controller
@RequestMapping("/user")
public class VendorController 
{
	@Autowired
	IVendorService ser;
	public VendorController()
	{
		System.out.println("in controller");
	}
	
	@GetMapping("/login")
	
		public String showlogin()
		{
			System.out.println("in regifor");
			return "/user/login";
		}
	
	@GetMapping("/register")
	
	public String showRegi()
	{
		System.out.println("in regifor");
		return "/user/register";
	}
	
	
   @PostMapping("/register")
	
	public String showRegi(@RequestParam String Email,@RequestParam String password,@RequestParam String name,@RequestParam String city)
	{
		System.out.println("in regifor");
		Vendor v=new Vendor(Email,password,name,city);
		ser.Insert(v);
		return "redirect:/customer/operation";
	}
	
	@PostMapping("/login")
	
	public String showlogin(@RequestParam String Email,@RequestParam String password)
	{
		System.out.println("in regifor");
		Vendor detail=ser.Validation(Email, password);
		if(detail==null)
		{
			return "redirect:/user/register";
		}
		return "redirect:/customer/operation";
	}
	
}
