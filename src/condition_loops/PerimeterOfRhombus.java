package condition_loops;

import java.util.Scanner;

public class PerimeterOfRhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner In = new Scanner(System.in);
		double side =0;
		
		while(true) {
			
			System.out.println("Enter the side of Rhombus :");
			side=In.nextDouble();
			
			if(side>0) {
				break;
			}else {
				System.out.println("the Side of length must be Positive Try again "+side);
			
			}
		}
		
		double perimeter = 4*side;
		System.out.println("The Perimeter of Rhombus is : "+perimeter);
	}

}
