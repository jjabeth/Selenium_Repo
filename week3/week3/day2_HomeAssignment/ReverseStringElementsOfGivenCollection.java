package week3.day2_HomeAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseStringElementsOfGivenCollection {
	/*
	 * Reverse the given collection of String elements
Assignment Requirements:
Declare a String array and add the values as {HCL, Wipro, Aspire Systems, CTS}
Add the collection to a list
Iterate the values in the list
Print the required output as Wipro, HCL, CTS, Aspire Systems
	 */
	public static void main(String[] args) {
		//Declare a String array and add the values as {HCL, Wipro, Aspire Systems, CTS}
		String[] comNames = {"HCL", "Wipro", "Aspire Systems", "CTS"};
		//Adding List
		List<String> com = new ArrayList<String>();
		//Using for loop
		for(int i=0;i<=comNames.length-1;i++) {
			com.add(comNames[i]);
		}
		//Sort the list
		Collections.sort(com);
		//Reverse the given collection of String elements
		for(int i=com.size()-1;i>=0;i--) {
			System.out.print(com.get(i) + " ");
		}
	}

}
