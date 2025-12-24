package com.java.learning.controlFlow;

public class SwitchExample {

	/*switch (expression) {
		case value1:
			// Code to be executed if expression matches value1
			break; // Optional: Exits the switch block
		case value2:
			// Code to be executed if expression matches value2
			break; // Optional: Exits the switch block
		// ... more cases
		default:
			// Code to be executed if expression doesn't match any case
			// Optional: The default case can appear anywhere within the switch
	}*/
	public static void main(String[] args) {

				int day = 3;

				switch (day) {
					case 1:
						System.out.println("Monday");
						break;

					case 2:
						System.out.println("Tuesday");
						break;

					case 3:
						System.out.println("Wednesday");
						break;

					case 4:
						System.out.println("Thursday");
						break;

					case 5:
						System.out.println("Friday");
						break;

					case 6:
						System.out.println("Saturday");
						break;

					case 7:
						System.out.println("Sunday");
						break;

					default:
						System.out.println("Invalid day number");
				}
			}
		}
