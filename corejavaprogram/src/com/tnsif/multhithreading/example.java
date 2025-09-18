package com.tnsif.multhithreading;

public class example {
	  void display() {
		Thread g=Thread.currentThread();
		for(int i=0;i<=3;i++) {
			try {
				Thread.sleep(3000);
				System.out.println(g.getName()+" "+i);
			}
			catch(Exception e) {
				
			}
		

}}}
