package condition_loops;

import java.util.Scanner;

public class Volumeofpyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner In = new Scanner(System.in);
		double basearea =0;
		double height = 0;
		
	while(true) {
		System.out.println("Enter the BaseArea Of Pyramid : ");
		basearea = In.nextDouble();
		System.out.println("Enter the Height of Pyramid : ");
		height = In.nextDouble();
		if(basearea >0 && height >0) {
			break;
		}
		else {
			System.out.println("The BaseArea and Height of Pyramid must be positive : ");
		}
	}
		double volume = (1.0/3)*basearea*height;
		System.out.println("The Volume of Pyramid is : "+volume);

	}

}
