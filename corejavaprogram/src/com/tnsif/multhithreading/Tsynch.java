package com.tnsif.multhithreading;

public class Tsynch {
	public static void main(String[] args) {
		example ex=new example();
		
		T t1=new T(ex);
		T t2=new T(ex);
		T t3=new T(ex);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
