package com.decimltooctal.java;
import java.util.Scanner;

public class Decimaloctal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Decimal to Octal");
		System.out.println("Enter a Decimal: ");
		int decimal = sc.nextInt();
		String octal = "";
		
		while(true) {
			if(decimal == 0) {
				break;
			}
			else {
				int temp = decimal % 8;
				octal = temp + octal;
				decimal /= 8;
			}
		}

		System.out.println("Octal Number: "+ octal);
		sc.close();
	}

}
