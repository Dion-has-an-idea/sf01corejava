package com.tnsif.multhithreading;

public class extendingthread extends Thread {
	public void run() {
		System.out.println("hello");  // running state
	}
	public static void main(String[] args) {
		
		extendingthread e=new extendingthread ();// new state
		e.start();  // runnable state
		
		
	}


}
