package week4.day1;

import java.util.ArrayList;
import java.util.List;


public class Solution {	
	public static int getFactorial(int num) {

		// Write your code here	
		int fact =1;
		for(int i=num;i>1;i--) {
			fact = fact*i;

		}
		System.out.println(fact);
		return num;

	}
	public static void main(String[] args) {
		getFactorial(6);


	}



}
