package com.tnsif.constructor;
import java.util.Scanner;

public class Constructordemo {

	Constructordemo()
	{
		System.out.println("welcome");
	}
	Constructordemo(int a)
	{
		System.out.println("to ");
	}
	Constructordemo(String b)
	{
		System.out.println("REVA UNIVERSITY");
	}
	
	public static void main(String[] args)
	{
		Constructordemo d1= new Constructordemo();
		Constructordemo d2= new Constructordemo(1);
		Constructordemo d3= new Constructordemo("a");
	}
}
