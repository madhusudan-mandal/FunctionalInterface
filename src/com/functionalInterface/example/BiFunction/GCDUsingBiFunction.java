package com.functionalInterface.example.BiFunction;

import java.util.function.BiFunction;

/*
 *  Use the BiFunction interface to take two integers as inputs and return their greatest common divisor (GCD).
 *  Implement this using a lambda expression.
 * 
 */

public class GCDUsingBiFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer input1 = 115;
		Integer input2 = 300;
		
		BiFunction<Integer, Integer, Integer> gcd = (a,b)->{
			int max=0,min=0;
			if(a>b)
			{
				max=a;
				min=b;
			}
			else
			{
				min=a;
				max=b;
			}
			while(min!=0)
			{
				int temp=min;
				min=max%min;
				max=temp;
			}
			return max;
			};
			
			System.out.println(gcd.apply(input1, input2));
	}

}
