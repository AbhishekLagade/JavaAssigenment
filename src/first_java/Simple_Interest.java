// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest

package first_java;

import java.util.Scanner;

public class Simple_Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner In = new Scanner(System.in);
		System.out.print("Enter The Principal Amount : ");
		double principal = In.nextDouble();
		System.out.print("Enter the Time of Peroid In Years : ");
		double Time = In.nextDouble();
		System.out.print("Enter the rate of interest : ");
		double Rate = In.nextDouble();
		
		double SimpleInterset = (principal*Time*Rate)/100;
		System.out.println("The Simple Interest is : "+SimpleInterset );
		
		

	}

}
