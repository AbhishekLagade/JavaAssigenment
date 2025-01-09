package condition_loops;

import java.util.Scanner;

public class VolumeOfPrism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner In = new Scanner(System.in);
		double baseArea = 0;
		double height = 0;
		
		while(true) {
			
			System.out.println("Enter the BaseArea of Prism : ");
			baseArea = In.nextDouble();
			if(baseArea>0) {
				break;
			}else {
				System.out.println("Please Enter the Positive BaseArea of prism  : Try Again ");
			}
		}
		while(true) {
			System.out.println("Enter the Height of Prism :");
			height = In.nextDouble();
			
		if(height>0) {
			break;
		}else {
			System.out.println("Please Enter the Positive Height of prism : try Again : ");
		}
			
		}
		
		double volume = baseArea*height;
		System.out.println("The volume of Prism :"+volume);
		

	}

}
