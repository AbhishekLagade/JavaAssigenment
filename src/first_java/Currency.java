// Input currency in rupees and output in USD.

package first_java;

import java.util.Scanner;

public class Currency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner In = new Scanner(System.in);
		float Ruppes = In.nextFloat();
		
		System.out.println("Enter the Ruppes : " + Ruppes);
		
		final float ConversationRate = 0.12f;
		float dollar=Ruppes*ConversationRate;
		System.out.printf("The equivalent amount in Dollars: %.2f USD\n", dollar);
	}

}
