package area.circle.java;
import java.util.Scanner;

public class Area {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Finding Area of Circle:");
		System.out.println("Enter radius: ");
		int r = sc.nextInt();
		double pi = 3.14;
		
		double area = pi * Math.pow(r, 2);
		System.out.println("Area of Circle is "+ area);
		sc.close();
	}
}
