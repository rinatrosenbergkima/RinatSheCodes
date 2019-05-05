package lesson2_conditional_variables;

public class ConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 24;
		
		if (number==24) {
			System.out.println("Number is 24");
		}
		else if (number>24) {
			System.out.println("Number is bigger 24");
		}
		else {
			System.out.println("Number is smaller than 24");
		}
		
		
		int day = 3;
		String dayString;
		switch (day) {
			case 1: dayString = "Sunday";
				break;
			case 2: dayString = "Monday";
				break;
			case 3: dayString = "Tuesday";
				break;
			case 4: dayString = "Wednesday";
				break;
			case 5: dayString = "Thursday";
				break;
			default: dayString = "Thant was an invalid day";
		}
	}

}
