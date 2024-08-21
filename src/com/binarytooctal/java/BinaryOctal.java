package com.binarytooctal.java;

import java.util.Scanner;

public class BinaryOctal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Binary to Octal");
		System.out.println("Enter a Binay: ");
		int binary = sc.nextInt();
		int octal = 0;
		int n = 0;
		
		while(true) {
			if(binary == 0) {
				break;
			}
			else {
				int temp = binary % 10;
				octal += temp*Math.pow(8, n) ;
				binary /= 10;
				n++;
			}
		}

		System.out.println("Octal number: "+ octal);
		sc.close();
	}
}
