package com.dectohex.java;

import java.util.Scanner;

public class DecToHex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Decimal to Hexadecimal");
		System.out.println("Enter a Decimal: ");
		int decimal = sc.nextInt();
		String hex = "";
		char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		
		while(true) {
			
			if(decimal == 0) {
				break;
			}
			else {
				int temp = decimal % 16;
				hex = hexchars[temp] + hex;
				decimal /= 16;
			}
		}

		System.out.println("Hexadecimal number: "+ hex);
		sc.close();

	}

}
