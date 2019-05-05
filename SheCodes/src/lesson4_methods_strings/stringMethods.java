package lesson4_methods_strings;

import java.util.Scanner;

public class stringMethods {
	public static void main (String[] args) {
		String name= "RinatR";
		char c1 = name.charAt(1); //c1="i"
		System.out.println(c1);
		String NAME = name.toUpperCase();
		if (name.startsWith("Ri")) {
			//name.equalsIgnoreCase(anotherString)
			System.out.println(name + " start with "+"Ri");
		}
		System.out.println(name.concat(name));//RinatRinat
		System.out.print(name.indexOf("R"));//0
		System.out.print(name.indexOf("R",3));//5
		System.out.println(name.substring(2, 4));//"na"		
		System.out.println(name.replace("R","L"));//"LinatL"
		String str = "   bla bla bla ";
		System.out.println(str.trim());//"bla bla bla"
		System.out.println(maxString("Rinat","Doron"));
		System.out.println(insertString());
	}
	
	public static String maxString(String str1, String str2) {
		if (str1.length()>str2.length()) {
			return(str1);
		}
		else if (str1.length()<str2.length()) {
			return(str2);
		}
		else {
			return(str1+"="+str2);
		}
	}
	public static String insertString () {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two strings:");
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		return (str1.substring(0,str1.length()/2) + str2 + str1.substring(str1.length()/2, str1.length()));
		
	}
}

//String class- https://docs.oracle.com/javase/7/docs/api/java/lang/String.html