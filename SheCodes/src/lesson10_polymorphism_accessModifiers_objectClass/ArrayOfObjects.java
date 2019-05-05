package lesson10_polymorphism_accessModifiers_objectClass;
import java.util.Scanner;
public class ArrayOfObjects {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String temp;
		// TODO Auto-generated method stub
		Athlete [] athletes = new Athlete[10];
		for (int i=0; i<=athletes.length; i++) {
			System.out.println("Enter the athlete name please:");
			athletes[i] = new Athlete();
			temp = input.next();
			athletes[i].setName(temp);
		}
	}

}
