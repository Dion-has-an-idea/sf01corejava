package com.tnsif.Scannerprogram;
import java.util.Scanner;
public class Maindemo {




	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the name");
		String name=sc.nextLine();
		System.out.println("enter the income");
		int income=sc.nextInt();
		
		person pp=new person();
		pp.setName(name);
		pp.setIncome(income);
		
		Taxcalculation t=new Taxcalculation ();
		t.calucatetax(pp);
		
		System.out.println("after tax calucation");
		System.out.println(pp);
		
	

}}
