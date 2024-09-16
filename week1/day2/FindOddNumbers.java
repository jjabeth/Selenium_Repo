package week1.day2;

public class FindOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// to print odd numbers from 1 to 10
		
		// assign the int value is 10 varibalename as maxRange
		
		int maxRange =10;
		
		// loop through the value
		
		for(int i =0; i<=maxRange;i++) {
			// check the condition
			if(i%2==1) {
				System.out.println("Odd Numbers :" + i);
			}
		}
System.out.println("===============================");

for(int i =0;i<=maxRange;i++) {
	if(i%2==0) {
		System.out.println(i + " "+ "even");
	}else {
		System.out.println(i + " " + "odd");
	}
}
	}

}
