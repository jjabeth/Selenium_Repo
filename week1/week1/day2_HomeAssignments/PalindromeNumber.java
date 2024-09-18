package week1.day2_HomeAssignments;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int givNum = 121;
		
		int orgNum =givNum;
		
		int rev =0;
		
		while(givNum !=0) {
			
			rev = rev *10; // 0 = 0*10 = 0; now rev is 1 so 1*10=10;    12*10 =120;
			
			rev = rev +(givNum % 10);// 0 = 0+ 121 % 10 so rev =1; 10+12%10 = 12; 120+1%10 =121
			
			givNum = givNum / 10; //121 = 121/10= 12 
		}
		if(orgNum == rev) {
			System.out.println("Input 121 is Palindrome");
		}else {
			System.out.println(" Input 121 is not Palindrome");
		}
		
		
		///// input 12345 ====
		
		int num = 12345;
		int assignNum = num;
		
		int revNo = 0;
		while(num>0) {
			revNo = revNo*10;
			revNo = revNo +(num%10);
			num = num/10;
			
		}
		
		if(assignNum==revNo) {
			System.out.println("Input 12345 is Palindrome");
		}else {
			System.out.println("Input 12345 is not Palindrome");
		}
		
	}

}
