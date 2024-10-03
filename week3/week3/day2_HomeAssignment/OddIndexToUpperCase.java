package week3.day2_HomeAssignment;
/*
Hints to solve:
- Use appropriate method to convert the String into a character array.
- Use the appropriate operator to get the odd index
- Use toUpperCase() method from the Character class to convert the odd index values to uppercase
*/
public class OddIndexToUpperCase {
	public static void main(String[] args) {
		 String test = "changeme";
		 //Convert string to charArray
		 char[] cs = test.toCharArray();
		 //loop through each character
		 for(int i=0;i<=cs.length-1;i++) {
			 //Find the odd index within the loop
			 if(i %2 ==1) {
				 //change the character to uppercase only if the index is odd
				 System.out.print(Character.toUpperCase(cs[i]));
			 }else {
				 System.out.print(cs[i]);
			 }
		 }
	}

}
