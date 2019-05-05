package lesson4_methods_strings;


public class methods {
	public static void main(String[] args) {
		System.out.println("Bait 1");
		printChorus();
		System.out.println("Bait 2");
		sayHelloTo("Charlie");
		System.out.println(isPositive(0));
		yearByAge("Noam",12);
	}
	
	public static void printChorus() {
		System.out.println("this is the chorus");
	}
	static void sayHelloTo(String name) {
		System.out.println("Hello, "+name);
	}
	
	//The two functions below have different signatures so it is ok that they have the same name
	//If the signature is exactly the same then we will get an error.
	public static void func(String s, int i) {
		//this function has a signature func(s,i)
	}
	public static void func(int i, String s) {
		//this function has a signature func(i,s) 
	}
	
	public static boolean isPositive(double num) {
		return num>=0;
	}
	public static void yearByAge(String name, int age) {
		int year = 2018-age;
		System.out.println(name+", "+year);
	}
}
