package Java.Pograms;

import java.util.Scanner;

public class SumOfTwoNo {
		public static void main(String[]args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the first no");
			int n1 = sc.nextInt();
			System.out.println("Enter the second no");
			int n2 = sc.nextInt();
			int c;
			
			c = n1+n2;
			System.out.println("The sum of two no's is" + " " +c);
		}
}
