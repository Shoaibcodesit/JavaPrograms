package Java.Pograms;

import java.util.Scanner;

public class NthEvenOdd {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
		for(int i=1; i<=n; i++) {
			if(i%2==0) {
				System.out.println( i + " " + "Its a Even Number");
			}
			else {
				System.out.println( i +" " +  "Its a Odd Number");
			}
		}

	}

}
