package lesson8_references_constructor_this;

import java.util.Scanner;

public class PrintNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		int num = input.nextInt();
		printThreeDigits (num);
	}
	
	public static void printThreeDigits(int number) {
		int hundreds = number/100;
		int tens = (number % 100)/10;
		int ones = (number % 10);
		printDigit(hundreds);
		System.out.print(" hundreds and ");
		printTens(tens);
		printDigit(ones);
	}
	
	public static void printDigit(int digit) {
		String strDigit="";
		//strDigit = Integer.toString(digit);
		switch (digit) {
			case 0:
				strDigit = "zero";
				break;
			case 1:
				strDigit = "one";
				break;
			case 2:
				strDigit = "two";
				break;
			case 3:
				strDigit = "three";
				break;
			case 4:
				strDigit = "four";
				break;
			case 5:
				strDigit = "five";
				break;
			case 6:
				strDigit = "six";
				break;
			case 7:
				strDigit = "seven";
				break;
			case 8: 
				strDigit = "eight";
				break;
			case 9:
				strDigit = "nine";
				break;
		}
		System.out.print(strDigit);
	}
	public static void printTens(int digit) {
		String strTens="";
		//strDigit = Integer.toString(digit);
		switch (digit) {
			case 0:
				strTens = "";
				break;
			case 1:
				strTens = "one";
				break;
			case 2:
				strTens = "twenty";
				break;
			case 3:
				strTens = "thirty";
				break;
			case 4:
				strTens = "fourty";
				break;
			case 5:
				strTens = "fifty";
				break;
			case 6:
				strTens = "sixty";
				break;
			case 7:
				strTens = "seventy";
				break;
			case 8: 
				strTens = "eighty";
				break;
			case 9:
				strTens = "ninty";
				break;
		}
		System.out.print(strTens + " ");
	}

}
