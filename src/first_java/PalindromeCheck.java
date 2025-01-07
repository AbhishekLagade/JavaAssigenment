// To find out whether the given String is Palindrome or not


package first_java;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String :");
		String input = scanner.nextLine();
		
		String formattedInput = input.replaceAll("\\s+"," ").toLowerCase();
		String reverse = new StringBuilder(formattedInput).reverse().toString();
		
		if(formattedInput.equals(reverse)) {
			System.out.println("The String is Palindrome ");
			
		}else {
			System.out.println("The String is not Palidrome");
		}
		
		
		scanner.close();
		

	}

}
