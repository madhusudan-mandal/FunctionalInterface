package com.functionalInterface.example.CustomFI;

public class MathOperations {

	static Integer add(Integer input1, Integer input2)
	{
		MathOperation<Integer> mo = (a,b)-> a+b;
		return mo.operation(input1, input2);
	}
	static Integer sub(Integer input1, Integer input2)
	{
		MathOperation<Integer> mo = (a,b)-> a-b;
		return mo.operation(input1, input2);
	}
	static Integer mul(Integer input1, Integer input2)
	{
		MathOperation<Integer> mo = (a,b)-> a*b;
		return mo.operation(input1, input2);
	}
	static Integer div(Integer input1, Integer input2)
	{
		MathOperation<Integer> mo = (a,b)-> a/b;
		return mo.operation(input1, input2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer input1 = 8;
		Integer input2 = 6;
		System.out.println("Addition : " + add(input1, input2));
		System.out.println("Subtraction : " + sub(input1, input2));
		System.out.println("Multiplication : " + mul(input1, input2));
		System.out.println("Division : " + div(input1, input2));
		
	}

}
