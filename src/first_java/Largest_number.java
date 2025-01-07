// Take 2 numbers as input and print the largest number.
package first_java;

import java.util.Scanner;

public class Largest_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner In = new Scanner(System.in);
		float num1 = In.nextFloat();
		System.out.println("Enter the Number 1 : " +num1);
		float num2 = In.nextFloat();
		System.out.println("Enter the Number 2 :" +num2);
		
		if(num1>num2) {
			System.out.println("The largest Number is: "+num1);
		}
		if(num1<num2) {
			System.out.println("The largest Number is: "+num2);
		}
		else {
			System.out.println("Both numbers are Equals");
		}
		

	}

}
