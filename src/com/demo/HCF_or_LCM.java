package com.demo;

import java.util.Scanner;

public class HCF_or_LCM {
	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		
		int num1=In.nextInt();
		System.out.println("Enter the NUmber "+num1);
		int num2 = In.nextInt();
		System.out.println("Enter the NUmber "+num2);
		int temp =0;
		for(int i=1;i<=num1;i++) {
			
			if(num1%i==0 && num2%i==0) 
				temp =i;
				
		}
			System.out.println(temp);
			int lcm = num1*num2/temp;
			System.out.println(lcm);
			In.close();
		}
		
	}

	