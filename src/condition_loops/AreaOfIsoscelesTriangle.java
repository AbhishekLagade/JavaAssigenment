// Area Of Isosceles Triangle
// Formula for Area: The area of any triangle can be calculated using the formula: Area= 1/2*Base*Height


package condition_loops;

import java.util.Scanner;

public class AreaOfIsoscelesTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner In= new Scanner(System.in);
		System.out.println("Enter The Base of Isosceles Traingle :");
		double base = In.nextDouble();
		System.out.println("Enter The Length of Isosceles Traingle :");
		double length = In.nextDouble();
		
		double Area = 0.5*base*length;
		System.out.println("Area of Isosceles Traingle :"+Area);

	}

}
