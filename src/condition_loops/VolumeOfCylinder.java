// Volume Of Cylinder

package condition_loops;

import java.util.Scanner;

public class VolumeOfCylinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner In = new Scanner(System.in);
		double raduis = 0;
		double height = 0;
		
		while(true) {
			System.out.println("Enter  the raduis of the Cylinder : ");
			raduis = In.nextDouble();
		if(raduis>0) {
			break;
		}else {
			System.out.println("The Raduis must be Positive Try again : ");
		}
		
	}
		while(true) {
			System.out.println("Enter the Height of Cylinder : ");
			height = In.nextDouble();
			if(height>0) {
				break;
			}else {
				System.out.println("The Height of Cylinder must be postive Try again");
			}
			
		}
		double volume = Math.PI*Math.pow(raduis, 2)*height;
		System.out.println("The Volume of Cylinder is :"+volume);
	}

}
