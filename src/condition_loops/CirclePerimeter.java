// Perimeter Of Circle 
// formula : 2*.3.14*raduis;


package condition_loops;

import java.util.Scanner;

public class CirclePerimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner In = new Scanner(System.in);
		double raduis =0;
		
		
		while(true) {
			System.out.println("Enter the Raduis of the Circle :");
		 raduis = In.nextDouble();
			
			if(raduis>0) 
			{
				break;
			}else {
				System.out.println("Enter the positive Raduis ");
			}
			
			
		}
		
		double perimeter = 2 * Math.PI*raduis;
		System.out.println("Perimeter of Cricle :"+perimeter);
		
		
	}

}
