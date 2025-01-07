// To calculate Fibonacci Series up to n numbers.
package first_java;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n<=0) {
			System.out.println("Please Enter the positive Number:");
		}else {
			System.out.println("Fibonacci Series :");
			int first = 0, second=1;
			for(int i=1;i<=n;i++) {
				System.out.println(first+" ");
				int next = first+second;
				first=second;
				second=next;
			}
		}
		sc.close();
	}

}
