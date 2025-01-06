package com.demo;

import java.util.Scanner;

public class Sum_Of_two_Number {
	public static void main(String[] args) {
		
		Scanner In = new Scanner(System.in);
		int num1 = In.nextInt();
		System.out.println("Enter the Number "+num1);
		
		int num2= In.nextInt();
		System.out.println("Enter the Number "+num2);
		
		int sum=num1+num2;
		System.out.println("The sum of Two Numbers "+sum);
		
	}
}
