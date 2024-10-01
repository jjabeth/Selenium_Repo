package week3.day2;

public class StringMethod {

	public static void main(String[] args) {
		String value ="Selenium Java";
		//replace (e, E)
		String replace = value.replace('e', 'E');
		System.out.println(replace);
		String replaceAll = value.replaceAll("[a-z]", "0");
		System.out.println(replaceAll);
		
		System.out.println("=============================");
		
		String amt = "5645";
		// convert string to int
		int convertInt = Integer.parseInt(amt);
		System.out.println(convertInt);
	}
}
