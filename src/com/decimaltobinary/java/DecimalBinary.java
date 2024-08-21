package com.decimaltobinary.java;

import java.util.Scanner;

public class DecimalBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Decimal to Binary");
		System.out.println("Enter a Decimal: ");
		int decimal = sc.nextInt();
		String bin = "";
		
		while(true) {
			if(decimal == 0) {
				break;
			}
			else {
				int temp = decimal % 2;
				bin = temp + bin;
				decimal /= 2;
			}
		}

		System.out.println("Binary number: "+ bin);
		sc.close();
	}

}
