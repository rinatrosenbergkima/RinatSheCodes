package lesson3_debugger_loops;
import java.util.Scanner;

public class loops {
	public static void main(String[] args) {
		int n=0;
		while (n<10) {
			System.out.println(n);
			n++;
		}
		
		for (int b=0; b<10; b++) {
			System.out.println(b);
		}
		
		
		int c=10;
		do {
			System.out.println("do at least one time");
			c+=1;
		} while (c<10);
		
		
		
		//2. Change the following Java code from a while loop to a for loop:
		int x;
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		while(x!=10){ 
			System.out.println(x+"\t");
			x=sc.nextInt();
		}
		
		x=sc.nextInt();
		for(;x!=10;){ 
			System.out.println(x+"\t");
			x=sc.nextInt();
		}
		
		//3. What would be the output from the following Java code segment?
		x=10;
		while(x>5){
			System.out.println(x);
			x--;
		}
		int i;
		//4. Change the following Java code from a for loop to a while loop:
		for(i=1;i<50;i++)
			System.out.print(i+"\t");
		
		
		//5. What would be printed from the following Java code segment?
		for(i=20;i>0;i-=2)
			System.out.println(i);
		
	}
}