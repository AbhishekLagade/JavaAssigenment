// Write a program to print whether a number is even or odd, also take input from the user.


package first_java;

import java.util.Scanner;

public class Ever_Or_Odd {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int Number = Sc.nextInt();
		System.out.println("Ente The number "+Number);
		
		if(Number % 2== 0) {
			System.out.println(Number+" Is a Even Number");
			
		}else {
			System.out.println(Number+" Is a Odd Number");
		}
		
		
	}

}
