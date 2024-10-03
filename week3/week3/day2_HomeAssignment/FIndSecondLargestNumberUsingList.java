package week3.day2_HomeAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FIndSecondLargestNumberUsingList {

	public static void main(String[] args) {

		//Declare an array {3, 2, 11, 4, 6, 7}
		int[] num = {3, 2, 11, 4, 6, 7};
		// Add to list
		List<Integer> secLargestNo = new ArrayList<Integer>();
		for(int i=0;i<=num.length-1;i++) {
			secLargestNo.add(num[i]);
		}

		//Arrange the collection in ascending order
		Collections.sort(secLargestNo);
		// Print second largest no
		System.out.println("Second largest no is: " + (secLargestNo.get(secLargestNo.size()-2)));

	}

}
