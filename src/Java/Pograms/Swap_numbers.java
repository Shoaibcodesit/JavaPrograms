package Java.Pograms;

import java.util.Scanner;

public class Swap_numbers {
	public static void main(String[]args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first no");
		a=sc.nextInt();
		System.out.println("Enter the second no");
		b= sc.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a=" +a +" b="+b);
		
	}

}
