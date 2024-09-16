package com.functionalInterface.example.Supplier;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

/* 
 * Create a Supplier<String> that returns the current system date and time in a formatted string. 
 * Use this supplier in a method that prints the result.
 * 
 */

public class CurrentDateAndTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Supplier<String> supplier= ()-> {LocalDateTime date = LocalDateTime.now();
					DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
					return date.format(formatter);};
		
		System.out.println(supplier.get());
	}

}
