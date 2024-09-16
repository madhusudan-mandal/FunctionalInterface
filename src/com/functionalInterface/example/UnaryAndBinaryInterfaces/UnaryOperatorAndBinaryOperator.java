package com.functionalInterface.example.UnaryAndBinaryInterfaces;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

/*
 * Use UnaryOperator<Integer> to implement a function that increments a number by 1. 
 * Then, use BinaryOperator<Integer> to find the product of two numbers.
 * 
 * UnaryOperator and BinaryOperator are functional interfaces defined in the java.util.function package. 
 * They are specialized versions of the Function and BiFunction interfaces, respectively, designed to handle operations on data.
 * 
 * 
 */


public class UnaryOperatorAndBinaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer number=12;
		Integer number2=15;
		
		UnaryOperator<Integer> uo = (num)-> num+1;
		
		BinaryOperator<Integer> bo = (num,num1)-> num*num1;
		
		System.out.println(uo.apply(number));
		System.out.println(bo.apply(number, number2));
		
	}

}
