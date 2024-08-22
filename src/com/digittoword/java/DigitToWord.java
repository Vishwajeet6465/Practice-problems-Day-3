package com.digittoword.java;

import java.util.Scanner;

public class DigitToWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Finding Number of Digits in Number:");
		System.out.println("Enter Number: ");
		String n = sc.next();
		
		String[] unit =new String[] {"zero ","one ", "two ","three ","four ", "five ","six ","seven ", "eight ","nine "};
		String[] decimal =new String[] {"","ten ","eleven ", "twelve ","thirteen ","fourteen", "fifteen ","sixteen ","seventeen ", "eighteen ","nineteen "};
		String[] tenmultiple =new String[] {" "," ", "twenty ","threety ","fourty ", "fifty ","sixty ","seventy ", "eighty ","ninety "};
		String[] poweroften =new String[] {"Hundred ","Thousand "};
		
		int len = n.length();
		String word = "";
		char[] num = n.toCharArray();
		
		System.out.println("Number to word: ");
		if(len == 1) {
			word = unit[num[0] - '0'];
			System.out.println(word);
		}
		else if(len == 2) {
			
			if(num[0] - '0' == 1) {
				int sum = (num[0]-'0') + (num[1]-'0');
				word = decimal[sum];
				System.out.println(word);
			}else {
				word = tenmultiple[num[0]-'0'];
				word = word + unit[num[1]-'0'];
				System.out.println(word);
			}
		}
		else if(len == 3){
			word += unit[num[0]-'0'];
			word += poweroften[0];
			
			if(num[1] - '0' == 1) {
				int sum = (num[1]-'0') + (num[2]-'0');
				word += decimal[sum];
				System.out.println(word);
			}else {
				word += tenmultiple[num[1]-'0'];
				word = word + unit[num[2]-'0'];
				System.out.println(word);
			}
		}
		else if(len == 4){
			word += unit[num[0]-'0'];
			word += poweroften[1];
			
			word += unit[num[1]-'0'];
			word += poweroften[0];
			
			if(num[2] - '0' == 1) {
				int sum = (num[2]-'0') + (num[3]-'0');
				word += decimal[sum];
				System.out.println(word);
			}else {
				word += tenmultiple[num[2]-'0'];
				word = word + unit[num[3]-'0'];
				System.out.println(word);
			}
		}
		else if(len == 5){
			if(num[0] - '0' == 1) {
				int sum = (num[0]-'0') + (num[1]-'0');
				word += decimal[sum];
				
			}else {
				word += tenmultiple[num[0]-'0'];
				word += unit[num[1]-'0'];
				
			}

			word += poweroften[1];
			
			word += unit[num[2]-'0'];
			word += poweroften[0];
			
			if(num[3] - '0' == 1) {
				int sum = (num[3]-'0') + (num[4]-'0');
				word += decimal[sum];
				System.out.println(word);
			}else {
				word += tenmultiple[num[3]-'0'];
				word = word + unit[num[4]-'0'];
				System.out.println(word);
			}
		}
		

		
		sc.close();
	}
}
