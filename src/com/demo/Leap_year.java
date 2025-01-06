package com.demo;

import java.util.Scanner;

public class Leap_year {
	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		int year = In.nextInt();
		System.out.println("Enter the Year :"+year);
		// (year % 4 == 0 && year % 100 != 0) checks for divisibility by 4 but excludes century years not divisible by 400.
		// (year % 400 == 0) explicitly allows years divisible by 400 as leap years.
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)  {
			System.out.println(year + " is a leap year.");
		}else {
			System.out.println(year + " is not a leap year.");
		}
		
	}
}
