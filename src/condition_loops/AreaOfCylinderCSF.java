// Curved Surface Area Of Cylinder
// CSA=2πrh


package condition_loops;

import java.util.Scanner;

public class AreaOfCylinderCSF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner In = new Scanner(System.in);
		double raduis =0;
		double height = 0;
		/*raduis = In.nextDouble();
		System.out.println(" Enter the Raduis of Cylinder :");
		
		height = In.nextDouble();
		System.out.println("Enter the Heigth of Cylinder : ");
		
*/
		while(true) {
			System.out.println(" Enter the Raduis of Cylinder :");
			raduis =In.nextDouble();
			System.out.println(" Enter the height of Cylinder :");
			height = In.nextDouble();
		if(raduis>0 && height >0) {
			break;
		}else {
			System.out.println("The Raduis and Height of Cylinder must be Positive : ");
		}
			
		}
		double Area = 2*Math.PI*raduis*height;
		System.out.println(" Curved Surface Area Of Cylinder is : "+Area );
	}
}

