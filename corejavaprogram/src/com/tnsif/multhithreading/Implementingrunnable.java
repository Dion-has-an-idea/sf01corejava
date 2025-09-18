package com.tnsif.multhithreading;

public class Implementingrunnable implements Runnable {
	@Override
	public void run() {
		System.out.println("implementing runnable interface");
	}
	
	public static void main(String[] args) {
		Implementingrunnable t=new Implementingrunnable();
		
		Thread t1=new Thread(t);
		t1.start();
	}

}
