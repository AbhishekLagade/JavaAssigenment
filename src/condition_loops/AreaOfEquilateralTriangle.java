// Area Of Equilateral Triangle

package condition_loops;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner In = new Scanner(System.in);
		double side = 0;
		
		while(true) {
			
			System.out.println("Enter the length of a side of the equilateral triangle (positive value): ");
			
			side = In.nextDouble();
		if(side > 0) {
			
			break;
		}else {
			System.out.println("The side length must be positive. Please try again.");
		}
	}
		double Area = (Math.sqrt(3)*Math.pow(side,2))/4; 
		// double Area = (Math.sqrt(3)*side*side)/4
		System.out.println(" Area Of Equilateral Triangle : "+Area);

}
}