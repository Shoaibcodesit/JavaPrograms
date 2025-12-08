package Java.Pograms;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
			int n, count=0;
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter a Number");
			n=sc.nextInt();
			for(int i=1 ; i<=n; i++) {
				if(n%i==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println("Its a Prime Number");
			}
			else {
				System.out.println("Its not a Prime Number");
			}
	}

}
