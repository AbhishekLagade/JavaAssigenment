// Area Of Rectangle Program
// Area Calculation: Formula : Area=Length×Width.


package condition_loops;

import java.util.Scanner;

public class AreaofRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner In = new Scanner(System.in);
		System.out.println("Enter the length Of Rectangle :");
		double length = In.nextDouble();
		System.out.println("Enter the Width of Rectangle :");
		double width = In.nextDouble();
		
		double Area = length*width;
		System.out.println("Area of Rectangle : "+Area);
		

	}

}
