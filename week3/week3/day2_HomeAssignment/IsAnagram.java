package week3.day2_HomeAssignment;

import java.util.Arrays;

public class IsAnagram {

	public static void main(String[] args) {

		/*An anagram is a word or phrase formed by rearranging the letters of another word or phrase, typically using all
		the original letters exactly once.*/

		// Declare a text1 string value as "stops"
		String text1 = "stops";
		//Declare text2 string values as "potss"
		String text2 ="potss";
		//Assume given string is anagram
		boolean bAnagram =true;
		//Convert string to char array for both text1 and text2
		char[] cs = text1.toCharArray();
		char[] cs2 = text2.toCharArray();
		//Sort both cs and cs2 char arrays
		Arrays.sort(cs);
		Arrays.sort(cs2);
		//loop through cs
		for(int i=0;i<=cs.length-1;i++) {
			//compare both arrays. if equal given string is anagram otherwise not anagram
			if(cs[i]!=cs2[i]) {
				System.out.println("The given string is not anagram");
				bAnagram = false;
				break;
			}

		}
		if(bAnagram==true) {
			System.out.println("The given String is anagram");
		}

	}

}
