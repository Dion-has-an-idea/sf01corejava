package com.tnsif.multhithreading;

public class T extends Thread{
	example e;
	T(example e){
		this.e=e;
		
	}
	public void run() {
		e.display();
	}

}
