package com.binarytodecimal.java;

import java.util.Scanner;

public class BinaryDecimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Binary to Decimal Conversion: ");
		System.out.println("Enter the number:");
		int binary = sc.nextInt();
		int n = 0;
		int decimal = 0;
		
		while(true) {
			if(binary == 0) {
				break;
			}else {
				int rem = binary % 10;
				decimal += rem*Math.pow(2, n);
				binary /= 10;
				n++;
			}
		}
		
		System.out.println("Decimal Number is: "+ decimal);
		sc.close();
	}
}
