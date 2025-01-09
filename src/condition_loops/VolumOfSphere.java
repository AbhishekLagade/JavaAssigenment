// Volume Of Sphere

package condition_loops;

import java.util.Scanner;

public class VolumOfSphere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner In = new Scanner(System.in);
		double raduis =0;
		
		while(true) {
			System.out.println(" Enter the Raduis of Sphere : ");
			raduis = In.nextDouble();
			if(raduis>0) {
				break;
			}else {
				System.out.println("The Raduis of Height must be Postive : Pleaese Try Again ");
			}
		}
		
		double volume = (4.0/3)*Math.PI*Math.pow(raduis, 3);
		
		System.out.println("The Volume of Sphere is : "+volume);
		

	}

}
