package com.java.learning.controlFlow;

public class WhileLoopExample {

	public static void main(String[] args) {

	/*	while (condition) {
			// Code block to be executed repeatedly
		}
*/
		int timer = 5;

		while (timer >= 0) {
			System.out.println("Brushing... Seconds left: " + timer);
			timer--;
		}

	}
}
/*

int chocolates = 0;

do {
		System.out.println("Rahul eats a chocolate 🍫");
chocolates--;
		} while (chocolates > 0);
*/
