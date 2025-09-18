package com.tnsif.lambda;
import java.util.function.*;
public class spcdemo {
	public static void main (String[] args)
	{
		Supplier<String> s=()->"hello";
		String svalue=s.get();
		System.out.println(svalue);
	}

}
