package condition_loops;

import java.util.Scanner;

public class TotalSurfaceAreaOfCube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner In = new Scanner(System.in);
		
		double side =0;
		while(true) {
			System.out.println("Enter the Side of Cube :");
			side = In.nextDouble();
			if(side>0) {
				break;
			}else {
				System.out.println("The side of cube must be Positive : ");
			}
		}
		
		double Area = 6*Math.pow(side, 2);
		System.out.println(" Total Surface Area Of Cube :"+Area );
		

	}

}
