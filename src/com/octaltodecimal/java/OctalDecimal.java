package com.octaltodecimal.java;

import java.util.Scanner;

public class OctalDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("--------Octal to decimal conversion--------");
		System.out.println("Enter the octal number: ");
		int octal = sc.nextInt();
		int decimal = 0;
		int n = 0;
		sc.close();
		
		while(true) {
			if(octal == 0) {
				break;
			}
			else {
				int temp = octal % 10;
				decimal += temp*Math.pow(8, n);
				n++;
				octal /= 10;
			}
		}
		
		System.out.println("Octal to decimal is: "+ decimal);
		

	}

}
