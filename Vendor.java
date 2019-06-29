package com.app.pojos;

import javax.persistence.*;

@Entity
@Table(name="vendorFood")
public class Vendor 
{
   private int id;
   private String name;
   private String Email;
   private String password;

   private String city;
   
   public Vendor()
   {
	   System.out.println("in vendor pojo");
   }
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Vendor [id=" + id + ", name=" + name + ", Email=" + Email + ", password=" + password + ", city=" + city
			+ "]";
}
public Vendor(String name, String email, String password, String city) {
	this.name = name;
	Email = email;
	this.password = password;
	this.city = city;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}


}
