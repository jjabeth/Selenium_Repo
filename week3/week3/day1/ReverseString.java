package week3.day1;

public class ReverseString {

	public static void main(String[] args) {
		// declare the string value as Joshva
		String s ="Joshva";
		//Convert string to character
		char[] cs = s.toCharArray();
		//loop through every character
		for(int i=cs.length-1;i>=0;i--) {
			System.out.print(cs[i]);
		}
		

	}

}
