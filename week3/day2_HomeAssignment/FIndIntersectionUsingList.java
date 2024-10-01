package week3.day2_HomeAssignment;

import java.util.ArrayList;
import java.util.List;

public class FIndIntersectionUsingList {

	public static void main(String[] args) {
		//Declare an array for {3, 2, 11, 4, 6, 7}
		int [] num = {3, 2, 11, 4, 6, 7};
		//Declare another array for {1, 2, 8, 4, 9, 7}
		int [] num1 = {1, 2, 8, 4, 9, 7};
		//Add array elements to a list

		List <Integer> list1 = new ArrayList<Integer>();
		for(int i=0;i<=num.length-1;i++) {
			list1.add(num[i]);

		}
		System.out.println(list1);

		List<Integer> list2 = new ArrayList<Integer>();
		for(int i=0;i<=num1.length-1;i++) {
			list2.add(num1[i]);
		}
		System.out.println(list2);
		//Iterate the values through the length of the list
		for(int i=0;i<=list1.size()-1;i++) {
			for(int j=0;j<=list2.size()-1;j++) {
				// Compare both arrays
				if(list1.get(i)==list2.get(j)) {
					//Print the values if they are equal
					System.out.println("Intersection is :" + list1.get(i));
				}
			}
		}


	}
}
