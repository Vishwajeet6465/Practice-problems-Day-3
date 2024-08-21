package com.lcm;
import java.util.Scanner;

public class Lcm {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Highest Common Factor(HCF)");
		System.out.println("Enter the first number:");
		int a = sc.nextInt();
		System.out.println("Enter the second number:");
		int b = sc.nextInt();
		int gcd = 0;
		
		for(int i = 1; i <= a || i <= b; i++) {
			if(a%i == 0 && b%i == 0) {
				gcd = i;
			}
		}
		
		int lcm = (a*b)/gcd;
		System.out.println("LCM is: "+ lcm);
		System.out.println("GCD is: "+ gcd);
		sc.close();
	}
}
