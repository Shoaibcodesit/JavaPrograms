package Java.Pograms;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
			int n;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number");
			n=sc.nextInt();
			if(n%2 == 0) {
				System.out.println("Its a Even number");
			}
			else {
				System.out.println("Its a Odd number");
			}
	}

}
