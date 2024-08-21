package com.hextodecimal.java;
import java.util.Scanner; 

class HextoDec { 

	static int hexadecimalToDecimal(String hexVal) 
	{ 
		int len = hexVal.length(); 	
		int base = 1; 
		int dec_val = 0; 


		for (int i = len - 1; i >= 0; i--) { 
			// If character lies in '0'-'9', converting 
			// it to integral 0-9 by subtracting 48 from 
			// ASCII value 
			if (hexVal.charAt(i) >= '0'
				&& hexVal.charAt(i) <= '9') { 
				dec_val += (hexVal.charAt(i) - 48) * base; 

				// Incrementing base by power 
				base = base * 16; 
			} 

			// Now, if character lies in 'A'-'F' , 
			// converting it to integral 10 - 15 by 
			// subtracting 55 from ASCII value 
			else if (hexVal.charAt(i) >= 'A'
					&& hexVal.charAt(i) <= 'F') { 
				dec_val += (hexVal.charAt(i) - 55) * base; 

				// Incrementing base by power 
				base = base * 16; 
			} 
		} 

		// Returning the decimal value 
		return dec_val; 
	} 

	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Hexadecimal value that you have to convert it to Decimal: ");
		String hexNum = sc.next(); 
		sc.close();
		// Calling the above method to convert and 
		// alongside printing the hexadecimal number 
		System.out.println(hexadecimalToDecimal("Decimal Value: "+hexNum)); 
	} 
}

