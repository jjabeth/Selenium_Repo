package week1.day1_HomeAssignments;

//Create a java class named CheckNumberIsPositive
public class CheckNumberIsPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//Declare a with integer variable as version with value 10
		int version =10;
		// use conditional Statement

		/*
		 * check the number is greater than 0 given number is positive
		 * 
		 * check the number is less than 0 given number is negative
		 * 
		 * 
		 */

		if(version>0) {
			System.out.println("Number is Positive");
		}else if(version<0) {
			System.out.println("Number is negative");
		}else {
			System.out.println("Number is Zero");
		}
	}

}
