// Area Of Circle Java Program

package condition_loops;

import java.util.Scanner;

public class Area_of_Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		double raduis = scanner.nextDouble();
		System.out.println("Enter the Raduis of the Circle :"+raduis);
		
		double Area= Math.PI*raduis*raduis;
		
		System.out.println("The Area of Circle is:"+Area);
		

	}

}
