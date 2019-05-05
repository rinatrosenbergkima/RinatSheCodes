package lesson5_arrays_random;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] my_arr = {4,5,6,3,2,4,5,12,3};
		int [] numbers = new int [10]; //zeros array
		numbers[0] = 500;
		int length = numbers.length;
		int lastIndex = length - 1;
		printArray(my_arr);
		printArray(numbers);
		System.out.println(my_arr[2]);
		System.out.println(numbers[0]);
		
		
	}
	
	public static void printArray(int[] my_array) {
		System.out.print("[");
		for (int i=0; i<my_array.length; i++) {
			System.out.print(my_array[i]);
			if (i<my_array.length-1) {
				System.out.print(",");
			}
		}
		System.out.println("]");
				
	}

}
