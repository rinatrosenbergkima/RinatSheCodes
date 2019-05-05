package lesson5_arrays_random;
import java.util.Random;

public class MyRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//using class Random
		Random rand = new Random();
		//n is a number between 1 and 50
		int n = rand.nextInt(50) + 1;
		System.out.println(n);
		
		//Using class Math:
		int random = (int)(Math.random() * 50 + 1);
		System.out.println(random);
	}

}
