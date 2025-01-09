// Perimeter Of Parallelogram

package condition_loops;

import java.util.Scanner;

public class PerimeterOfParallelogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner In = new Scanner(System.in);
		double base =0;
		double side =0;
		
		while(true) {
			System.out.println("Enter the base length of the parallelogram (positive value):");
			base = In.nextDouble();
			System.out.println("Enter the side length of the parallelogram (positive value) :");
			side = In.nextDouble();
			if(base>0 && side >0) {
				break;
			}else {
				System.out.println("The side of length and base must be Positive try again :");
			}
		}
		
		double perimeter = 2*(base+side);
		System.out.println("Perimeter Of Parallelogram : "+perimeter);
	}

}
