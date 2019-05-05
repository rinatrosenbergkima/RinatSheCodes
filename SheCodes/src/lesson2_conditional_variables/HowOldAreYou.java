/*
How Old Are You?
Make a program which displays a different message depending on the age given. Here are the possible responses:

age is less than 16, say "You can't drive."
age is less than 18, say "You can't vote."
age is less than 25, say "You can't rent a car."
age is 25 or over, say "You can do anything that's legal." 
 */
package lesson2_conditional_variables;
import java.util.Scanner;
public class HowOldAreYou {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter you age:");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if (age<16) {
			System.out.println("You can't drive");
		}
		else if (age<18) {
			System.out.println("You can't vote");
		}
		else if (age<25) {
			System.out.println("You can't rent a car");
		}
		else {
			System.out.println("You can do anything that's legal");
		}
		
	}

}
