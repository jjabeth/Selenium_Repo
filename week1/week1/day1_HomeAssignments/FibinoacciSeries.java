package week1.day1_HomeAssignments;

public class FibinoacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Fibnoacci series
		/*
		 * Fibonacci sequence is a sequence in which each number is the sum of the two preceding ones
		 *  i will take 0 and 1 then 0 +1 = 1 so 0 1 1 then 1+1 = 2 so 0 1 1 2 like up to range is 8 
		 * 0 1 1 2 3 5 8 13
		 */


		// assigning the variables like startingNumber =0 and nextNumber =1 and assigning the sum

		int startingNumber = 0;
		int nextNumber =1;

		// Assigning the sum value is 0
		int sum =0;

		//using the loop 
		/*if I initiliaze the value is 1 then loop through is 0 to 7 output is 1 2 3 5 8 13 21 34 but we need the output value is up to 13 only so i start the initilizing is 3 to 8 
		now i get the output is 1 2 3 5 8 13. my expect output is 0 1 1 2 3 5 8 13 so before getting output i  print for startingNumber and next number 

		 *
		 */

		System.out.print(startingNumber + " ");

		System.out.print(nextNumber + " ");

		for(int i = 3;i<=8;i++) {

			// sum of two numbers and swapping the values

			sum = startingNumber+nextNumber;

			startingNumber = nextNumber;
			nextNumber = sum;
			System.out.print(sum +" ");
		}

	}

}
