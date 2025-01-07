// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)


package first_java;

import java.util.Scanner;

public class Calculater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner In = new Scanner(System.in);
		System.out.print("  Enter the Operator:");

		char op = In.next().trim().charAt(0);
		if(op=='+'||op=='-'||op=='*'||op=='/') {

			System.out.println("Enter the Two numbers :");
			int num1 = In.nextInt();
			int num2 = In.nextInt();
			int ans =0;

			if(op=='+') {

				ans=num1+num2;
			}
			if(op=='-') {

				ans=num1-num2;
			}
			if(op=='*') {

				ans=num1*num2;
			}
			if(op=='/') {

				ans=num1/num2;
			}
			System.out.println("The ans is :"+ans);

		}

	}

}
