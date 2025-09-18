package com.tnsif.exceptionhandling;

public class test {
	public static void main(String[] args) {
		try {
			System.out.println(100/0);
		}
		catch(ArrayIndexOutOfBoundsException r) {
			System.out.println(r.getMessage());
		}
		finally {
			System.out.println("hello world");
		
	}
}
