package com.primenums.java;

public class Prime {
	public static void main(String[] args) {
		System.out.println("Prime numbers between 1 - 100:");
		int num = 100;
		
		for(int i = 2; i <= num; i++) {
			boolean isPrime = true;
			for(int j = 2; j <= i/2; j++) {
				if(i%j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				System.out.print(i + " ");
			}
		}
	}
}
