package lesson6_2Darray_scanner;

public class twoD_Arrays {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [][] my_array = {{"a","d"},{"b","g"}};
		String name = my_array[0][1];
		System.out.println(name);
	    printArray(my_array);
	}
	
	public static void printArray(String [][] my_array) {
		for (int i=0; i<my_array.length; i++) {
			for (int j=0; j<my_array[i].length; j++) {
				System.out.print(my_array[i][j]+" ");
			}
			System.out.println();
		}
	}
}
