package com.demo;

import java.util.Scanner;

public class Multification_Table {
 public static void main(String[] args) {
	Scanner In =  new Scanner(System.in);
	int num = In.nextInt();
	
	System.out.println("Enter the number "+num);
	
	for(int i=1;i<=10;i++) {
		System.out.println(num+"*"+i+"="+(num*i));
	}
	 
}
}
