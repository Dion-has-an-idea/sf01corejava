package com.tnsif.constructor;
import java.util.Scanner ;

public class customermain {
	
	
		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("enter the customer name");
			String name=sc.next();
			
			System.out.println("enter the customer address");
			String address=sc.next();
			
			System.out.println("enter the customer id");
			String  id=sc.next();
			
			Customer c = new Customer(); 
			
			c.setName(name);
			c.setCustomeradress(address);
			c.setCustomerid(id);
			
			System.out.println(c);
			
			boolean b=c instanceof Customer;
			
			System.out.println(b);
	
}}


