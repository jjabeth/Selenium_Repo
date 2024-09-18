package week1.day1_HomeAssignments;

// class name IsPrime
public class IsPrime {

	//create main method by using shortcut
	public static void main(String[] args) {
		
		// assign the int value 
		
		int num = 99;
		
		int count =0;
		// prime number is number that can be only divided by itself and 1 without reminders
		
		// using for loop
		// why we didnt start 1 bcz prime is divided by itself and 1 so it needs 2 factor so we start at 2
		for(int i =2;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}if (count >1) {
			System.out.println("Given num is not Prime");
		}else {
			System.out.println("Given num is Prime");
		}
		
	}
	
	
}
