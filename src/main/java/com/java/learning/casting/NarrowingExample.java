package com.java.learning.casting;

public class NarrowingExample {

	public static void main(String[] args) {
		
		double price = 10.0;
		
		int roundedPrice = (int) price; // double to int
		
		System.out.println("Rounded price: " + roundedPrice);

	}

}
