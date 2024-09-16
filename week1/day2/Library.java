package week1.day2;
//Create a Java class named Library:
public class Library {
	//Define a method addBook(String bookTitle) with one input argument.

	public String addBook(String blessings) {
		//Print the statement "Book added successfully"
		System.out.println("Book added successfully");
		//Add a return statement to return the bookTitle.
		return blessings;
	}

	//Define a method issueBook().
	public void issueBook() {
		//Print the statement "Book issued successfully".

		System.out.println("Book issued successfully");

	}

	public static void main(String[] args) {
		//Create an object for the Library class in the main method:
		Library bDetails = new Library();
		//Call both methods using the object.
		bDetails.addBook("Blessings");
		bDetails.issueBook();
		//Run the code to confirm the methods are executed.

	}


}
