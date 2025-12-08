package Java.Pograms;

import java.util.Scanner;

public class FactorialNo {

	public static void main(String[] args) {

		int n, f=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		n=sc.nextInt();
		for(int i=1; i<=n; i++) {
			f=f*i;
		}
		System.out.println("Factorial is :" + " "+ f);
	}

}
