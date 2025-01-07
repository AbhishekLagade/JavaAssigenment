// To find Armstrong Number between two given number.


package first_java;

import java.util.Scanner;

public class ArmstrongNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input: two numbers
		System.out.print("Enter the starting number: ");
		int start = scanner.nextInt();

		System.out.print("Enter the ending number: ");
		int end = scanner.nextInt();

		System.out.println("Armstrong numbers between " + start + " and " + end + " are:");
		for (int num = start; num <= end; num++) {
			if (isArmstrong(num)) {
				System.out.println(num);
			}
		}

		scanner.close();
	}

	// Function to check if a number is an Armstrong number
	private static boolean isArmstrong(int number) {
		int originalNumber = number;
		int sum = 0;
		int digits = String.valueOf(number).length();

		while (number > 0) {
			int digit = number % 10;
			sum += Math.pow(digit, digits);
			number /= 10;
		}

		return sum == originalNumber;
	}
}
