package week3.day2_HomeAssignment.String_Assignments;


public class ReverseOddWordsInString {

	public static void main(String[] args) {
		// Declare a string value
		String test = "I am a software tester";
		//Assigning the values empty string
		String rev ="";
		String rev1="";
		// Split the string and store in string array
		String[] split = test.split(" ");
		char[] cs2 = split[1].toCharArray();
		char[] cs3 = split[3].toCharArray();

		for(int i=cs2.length-1;i>=0;i--) {
			rev=rev+cs2[i];
		}
		for(int j=cs3.length-1;j>=0;j--) {
			rev1=rev1+cs3[j];
		}
		System.out.println(split[0]+ " " + rev+" " + split[2] + " "+ rev1 + " " + split[4]);
		//============ Approach 2==================


		String test1 ="I am a software tester";
		//Split the string using delimiter
		String[] split2 = test1.split(" ");

		for(int i=0;i<=split2.length-1;i++) {
			if(i%2==1) {
				StringBuilder sb = new StringBuilder(split[i]);
				System.out.print(sb.reverse()+ " ");
			}

			else {
				System.out.print(split2[i] + " ");
			}


		}


	}

}


