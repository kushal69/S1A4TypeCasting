package com;

import java.util.Scanner;

public class TypeCasting {

	// Main Function
	public static void main(String[] args) {
		
		// Variable declaration
		byte byteValue;
		short shortValue;
		int intValue;
		long longValue;
		float floatValue;
		double doubleValue;
		
		Scanner in = new Scanner(System.in); // Taking input from the user through console
		
		System.out.println("Enter the BYTE variable");
		byteValue = in.nextByte();
		
		System.out.println("Enter the SHORT variable");
		shortValue = in.nextShort();
		
		intValue = byteValue + shortValue;
		System.out.println("The sum of " + byteValue + " and " + shortValue + " is: " + intValue); // Displays INT value
		
		longValue = shortValue + intValue;
		System.out.println("The sum of " + shortValue + " and " + intValue + " is: " + longValue); // Displays LONG value
		
		floatValue = intValue + longValue;
		System.out.println("The sum of " + intValue + " and " + longValue + " is: " + floatValue); // Displays FLOAT value
		
		doubleValue = longValue + floatValue;
		System.out.println("The sum of " + longValue + " and " + floatValue + " is: " + doubleValue); // Displays Double value
		
		in.close();
	}
}