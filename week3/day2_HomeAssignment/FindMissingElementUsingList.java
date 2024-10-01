package week3.day2_HomeAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMissingElementUsingList {

	public static void main(String[] args) {
		
		//Declare an array {1, 2, 3, 4, 10, 6, 8}.
		int[] num= {1, 2, 3, 4, 10, 6, 8};

		List<Integer> mElmnt = new ArrayList<Integer>();
		for(int i=0;i<=num.length-1;i++) {
			mElmnt.add(num[i]);
		}
		
		//Arrange the collection in ascending order
		Collections.sort(mElmnt);
		
		//Inside the loop, check the current element + 1 is not equal to the next element.
		for (int i = 0; i <mElmnt.size()-1; i++) {
			int current = mElmnt.get(i);
			int next = mElmnt.get(i + 1);
			if (current + 1 != next) {
				System.out.println("Missing element is :" + (current+1));
			}
		}
	}
}