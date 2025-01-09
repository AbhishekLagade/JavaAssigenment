// Area Of Rhombus


package condition_loops;

import java.util.Scanner;

public class AreaOfRhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner In = new Scanner(System.in);
	
		double diagonal1 =0;
		double diagonal2 =0;
		
		while(true) {
			
			System.out.println("Enter the length of first diagonal(diagonal1) :");
			diagonal1 = In.nextDouble();
			System.out.println("Enter the length of second diagonal(diagonal2)");
			diagonal2 = In.nextDouble();
		
		if(diagonal1 > 0 && diagonal2 > 0){
			break;
			
		}
		else {
			System.out.println("Both diagonals must be positive values. Please try again");
		}
	}
		double Area = (diagonal1*diagonal2)/2;
		System.out.println("The Area of Rhombus is : "+Area);

}
}
