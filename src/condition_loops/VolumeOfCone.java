// Formula for Volume of a Cone:  Volume= (3*3.14*r*r*h)/3



package condition_loops;

import java.util.Scanner;

public class VolumeOfCone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner In = new Scanner(System.in);
		double raduis = 0;
		double height = 0;
		
		while(true) {
			System.out.println("Enter the Raduis of cone : ");
			raduis = In.nextDouble();
			
			if(raduis>0 ) {
				break;
			}else {
				System.out.println("Please enter the postive Raduis of cone please try Again : ");
			}
		}
		while(true) {
			System.out.println("Enter the Height of cone :");
			height = In.nextDouble();
			if(height>0) {
				break;
			}else {
				System.out.println("Please Enter the postive Height of Cone Please try Again :");
			}
			
		}
		double volume = (3*Math.PI*Math.pow(raduis, 2)*height/3);
		
		System.out.println("The Volume of the Cone : "+volume);
		
		

	}

}
