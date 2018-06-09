package Days;

import java.util.Scanner;

public class DaysOfWeek {

	public static void main(String[] args) {
		
	int numberOfDays;
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Enter the number from 1 to 7. ");
	numberOfDays = keyboard.nextInt();
	switch (numberOfDays) {
	case 1:
		System.out.println("Monday ");
		break;
	case 2:
		System.out.println("Tuesday ");
		break;
	case 3:
		System.out.println("Wednesday ");
		break;
	case 4:
		System.out.println("Thursday ");
		break;
	case 5: 
		System.out.println("Friday ");
	    break;
	case 6:
		System.out.println("Saturday");
		break;
	default:
		System.out.println("Sunday");
	}
	
	

	}

}
