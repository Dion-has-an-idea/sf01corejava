package com.tnsif.lambda;
interface lambdaexpressionexample{
	public String say();
}
public class sayable {
	public static void main (String[] args)
	{
		lambdaexpressionexample s=()->{
			return "i have nothing to say";
		};
		System.out.println(s.say());
	
	}

}
