package week3.day2;

public class Amazon extends CanaraBank {
	public void cashOnDelivery() {
		System.out.println("This method implemented for cash on delivery");
		
	}

	public void upiPayments() {
		System.out.println("This method implemented for upi payment method");
		
	}

	public void cardPayments() {
		System.out.println("This method implemented for card payments");
		
	}

	public void internetBanking() {
		System.out.println("This method implemented for Internet Banking");
		
	}

	@Override
	public void recordPaymentDetails() {
		System.out.println("This method implemented for record payment details");
		
	}
	
	public static void main(String[] args) {
		Amazon obj = new Amazon();
		obj.cardPayments();
		obj.cashOnDelivery();
		obj.internetBanking();
		obj.upiPayments();
		obj.recordPaymentDetails();

	}

	

}
