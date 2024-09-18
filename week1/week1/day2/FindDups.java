package week1.day2;

import java.util.Arrays;

public class FindDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create int[] with duplicate data
		int []num = {2,5,7,7,5,9,2,3};
		
		// Sorting the array
		Arrays.sort(num);
		
		// through the loop in array valus
		// outer loop
		
		for(int i =0;i<=num.length-1;i++) {
			
			// inner for loop
			for(int j =i+1; j<=num.length-1;j++) {
				if(num[i] == num[j]) {
					System.out.println("Duplicate values : " + num[i]);
				}
			}
		}
		///// second approach for single for loop
		
		for(int k=0;k<num.length-1;k++) {
			if(num[k] == num[k+1]) {
				System.out.println("Duplicate values by using single for loop : " +num[k+1]);
			}
		}
	}

}
