package week1.day2;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ================== Approach 1 =====================


		// declare an array value
		int [] num = {1, 4,3,2,8, 6, 7};

		// assinging the variable is miss no
		int missNo = 0;

		// sort the array
		Arrays.sort(num);
		// find max number and store it a variable
		int max = num[num.length-1];

		// sum of all numbers so we need to assin sum variable with value is 0
		int sum = 0;
		// loop through from 0 to array length

		for(int i=0;i<=num.length-1;i++) {
			// sum the all numbers
			sum = sum+num[i];
			// using formula  missNo = (max*(max+1)/2)-sum

			missNo = (max*(max+1)/2) - sum;

		}

		System.out.println("Find missing No : " + missNo);

		//================== Approach 2   ==================

		/*
		 * array should be sequential order 
		 */

		// declare an array value
		int [] num1 = {1, 4,3,2,8, 6, 7};

		// sum the array 
		int sum1=0;

		// loop through

		for(int i =0;i<=num1.length-1;i++) {

			sum1 = sum1+num1[i];
		}
		//  assigning the variable sum2 is 0
		int sum2 =0;

		// assume according to num1 array length is 8 bcz that max no is 8

		// using another for loop 
		for(int j =1;j<=8;j++) {
			// sum the values
			sum2=sum2+j;
		}
		System.out.println("Sum2 value is : " +sum2);
		System.out.println("Sum1 value is : " +sum1);

		// find the missing  element 

		System.out.println("Find the missing element is :" + (sum2-sum1));

	}

}

/*Alternative Ways to Complete the Assignment:
- Find the max number from the array and calculate sum of all the numbers. Then use the formula “(max*(max+1)/2) – sum” to find the missing number
Best Practices:
 Use meaningful variable names: Choose descriptive names for variables like array1 and array2 to improve code readability.
 Comment your code: Add comments to explain the purpose of your code and any complex logic.
 Avoid redundant comparisons: If you find a match, you can break out of the inner loop to improve efficiency.
 Test with different inputs: Ensure your code works correctly for various input scenarios to validate its functionality.
 * 
 */
