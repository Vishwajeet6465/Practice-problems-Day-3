package com.count.digit;

import java.util.Scanner;

public class Digits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Finding Number of Digits in Number:");
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		int count = 0;
		
		
		while(num >0) {
			num = num / 10;
			count++;
			
		}
		System.out.println("Number of digits are: "+ count);
		sc.close();
	}
}
