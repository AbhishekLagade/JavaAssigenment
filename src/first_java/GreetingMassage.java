// Take name as input and print a greeting message for that particular name.

package first_java;

import java.util.Scanner;

public class GreetingMassage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String Name = sc.nextLine();
		System.out.println("Enter the Name :"+Name);
		
		System.out.println("Hello "+Name+" ! Keep coding and building amazing things!");

	}

}
