package com.java.learning.controlFlow;

public class BreakExample {

	public static void main(String[] args) {
	/*	for (int i = 1; i <= 10; i++) {
			if (i == 4) {
				System.out.println("Found the pen at item #" + i);
				break; // Stop searching
			}
			System.out.println("Checking item #" + i);
		}*/

		for (int j = 1; j <= 10; j++) {

			String Name = "Kanna";

			if (Name.equalsIgnoreCase("Kanna")) {

				if (j == 5) {
					System.out.println("Hello");
					break;
				}
				System.out.println("You are not Kanna");
			}

		}}}
