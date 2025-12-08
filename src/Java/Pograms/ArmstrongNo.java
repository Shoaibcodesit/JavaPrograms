package Java.Pograms;

import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		int n,num,arm=0,r;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		n=sc.nextInt();
		num=n;
		while(n>0) {
			r=n%10;
			arm=arm+r*r*r*r;
			n=n/10;
		}
		if(num==arm) {
			System.out.println("Its a Armstrong Number");
		}
		else {
			System.out.println("Its not a Armstrong Number");
		}
	}

}
