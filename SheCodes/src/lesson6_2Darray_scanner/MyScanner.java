package lesson6_2Darray_scanner;

import java.util.Scanner;

public class MyScanner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("Enter your name");
		String name = input.next();
		
		System.out.println("Enter your age");
		int age = input.nextInt();
		
		System.out.println("Hello "+name+", you are "+age+" years old");
	}
}
