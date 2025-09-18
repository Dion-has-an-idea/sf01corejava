package com.tnsif.accessmod;

public class publicdemo {

public int a=9;   // data memebr
	
	private String name="reva";
	
	protected float s=9.5f;
	
	int u=9;
	
	public void display() {  // method
		System.out.println("welcome");

}
	public static void main(String[] args) {
		publicdemo p=new publicdemo();
		
		System.out.println(p.name);
		
		System.out.println(p.a);
		
		System.out.println(p.s);
		
		System.out.println(p.u);
		
		p.display();
	}
	}
