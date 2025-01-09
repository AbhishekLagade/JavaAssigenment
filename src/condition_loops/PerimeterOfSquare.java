package condition_loops;

import java.util.Scanner;

public class PerimeterOfSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner In = new Scanner(System.in);
		
		double side =0;
		
		while(true) {
			System.out.println("Enter the Side of Square : ");
			side= In.nextDouble();
			
			if(side>0) {
				break;
			}else {
				System.out.println("The side of perimetr of Square must be Positive value :");
			}
		}
		
		double perimeter = 4*side;
		System.out.println("The Perimeter of the Square is : "+perimeter);

	}

}
