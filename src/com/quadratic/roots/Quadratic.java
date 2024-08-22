package com.quadratic.roots;

import java.util.Scanner;

public class Quadratic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("the roots of the equation a*x*x + b*x + c.");
		System.out.println("Enter a: ");
		int a = sc.nextInt();
		System.out.println("Enter b: ");
		int b = sc.nextInt();
		System.out.println("Enter c: ");
		int c = sc.nextInt();
		System.out.println("Roots of the equations are: ");
		
		int delta = b*b - 4*a*c;
		double sqrt = Math.sqrt(delta);
		
		double x1 = (-b + sqrt)/(2*a);
		System.out.println("x1: "+x1);
		
		double x2 = (-b - sqrt)/(2*a);
		System.out.println("x2: "+x2);
		
		sc.close();
	}
}
