package com.tnsif.polymorphism;

public class child extends parent{
	@Override
	void drinking()
	{
		System.out.println("cofee");
	}
 public static void main (String[] args){
	 child a = new child();
	 a.drinking();
	 
	}
}
