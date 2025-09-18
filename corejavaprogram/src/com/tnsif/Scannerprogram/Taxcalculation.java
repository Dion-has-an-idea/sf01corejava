package com.tnsif.Scannerprogram;

public class Taxcalculation {
	public void calucatetax(person p) {
		if(p.getIncome()<=15000) {
			p.setTax(0);
		}
		else if(p.getIncome()>16000 && p.getIncome()<=20000) {
			p.setTax(5);
		}
		else {
			p.setTax(10);
		}
	}


}
