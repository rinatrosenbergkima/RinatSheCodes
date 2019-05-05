package lesson6_2Darray_scanner;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		/*System.out.println("Enter int");
		System.out.println(input.hasNextInt());
		int age=input.nextInt();
		System.out.println(age);
		if (input.nextInt()>5 && input.nextInt()<10) {
			System.out.println("both");
		}
		System.out.println(input.hasNextInt());
		System.out.println(input.hasNextInt());
		System.out.println("please enter a number");
		System.out.println("?"+input.hasNextInt());
		System.out.println("?"+input.hasNextInt());
		String age=input.nextLine();
		System.out.println("?"+input.hasNextInt());
		
		*/
		System.out.println(input.hasNextInt());
		System.out.println(input.hasNextInt());
		while (input.hasNextInt() == false) {
			System.out.println("please enter a number");
			input.nextLine();
		}
		System.out.println("the end");
	}

}
