package condition_loops;

import java.util.Scanner;

public class PerimeterOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			// TODO Auto-generated method stub
			Scanner In = new Scanner(System.in);
			double width =0;
			double length =0;
			
			while(true) {
				System.out.println("Enter the width of  the Perimeter  (positive value):");
				width = In.nextDouble();
				System.out.println("Enter the length of perimetr  (positive value) :");
				length = In.nextDouble();
				if(width>0 && length >0) {
					break;
				}else {
					System.out.println("The side of length and base must be Positive try again :");
				}
			}
			
			double perimeter = 2*(width+length);
			System.out.println("Perimeter Of Rectangle : "+perimeter);

	}

}
