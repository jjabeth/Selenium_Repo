package week1.day2_HomeAssignments;

public class InterSection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Intesection 

		//Declare An array for {3,2,11,4,6,7};

		int [] a = {3,2,11,4,6,7};

		// Declare another array for {1,2,8,4,9,7};
		int [] b =  {1,2,8,4,9,7};

		//Declare for loop iterator from 0 to array length

		for(int i =0;i<=a.length-1;i++) {

			//Declare a nested for another array from 0 to array length
			for(int j =0; j<=b.length-1;j++) {

				//Compare both the arrays using a conditional statement.
				if(a[i] == b[j]) {
					//Print the value from first array when there is a match
					System.out.println("Intersection num :" + a[i]);
				}
			}
		}
	}

}
