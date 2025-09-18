package com.tnsif.constructor;

public class Customer {
	 private String Name;
	 private String customeradress;
	 private String customerid;
	 public Customer() {
		    // default constructor
		}

	 public Customer(String name, String customeradress, String customerid) {
		super();
		Name = name;
		this.customeradress = customeradress;
		this.customerid = customerid;
	 }
	 public String getName() {
		 return Name;
	 }
	 public void setName(String name) {
		 Name = name;
	 }
	 public String getCustomeradress() {
		 return customeradress;
	 }
	 public void setCustomeradress(String customeradress) {
		 this.customeradress = customeradress;
	 }
	 public String getCustomerid() {
		 return customerid;
	 }
	 public void setCustomerid(String customerid) {
		 this.customerid = customerid;
	 }
	 @Override
	 public String toString() {
		return "Customer [Name=" + Name + ", customeradress=" + customeradress + ", customerid=" + customerid
				+ ", getName()=" + getName() + ", getCustomeradress()=" + getCustomeradress() + ", getCustomerid()="
				+ getCustomerid() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	 }
	 

}
