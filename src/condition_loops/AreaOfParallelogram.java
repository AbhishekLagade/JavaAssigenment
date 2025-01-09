// Area Of Parallelogram
package condition_loops;

import java.util.Scanner;

public class AreaOfParallelogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner In= new Scanner(System.in);
		System.out.println("Enter the Base  Of Parallelogram : ");
		double Base = In.nextDouble();
		System.out.println("Enter the Height Of Parallelogram : ");
		double heigth = In.nextDouble();
		
		double Area = Base*heigth;
		System.out.println("Area Of Parallelogram : "+Area);

	}

}
