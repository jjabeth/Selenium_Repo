package week3.day2_HomeAssignment.String_Assignments;

public class RemoveDuplicatesWordsInString {
	
	public static void main(String[] args) {
		////Declare String value
		String text ="We learn Java basics as part of java sessions in java week1";
		//Initialize a variable ‘count’ to keep track of the number of duplicate words found
		int count =0;
		//Split the text into an array of words using space as the delimiter
		String[] splitWord = text.split(" ");
		// loop through every String of array
		//Create two nested for loops to compare each word with every other word in the String array.
		for(int i=0;i<=splitWord.length-1;i++) {
			for(int j=0;j<=splitWord.length-1;j++) {
				//If a duplicate word is found and the count is incremented.
				if(splitWord[i].equals(splitWord[j])) {
					count++;
				}
			}
			/*After comparing all words, if the count is greater than 1 (indicating at least one duplicate was found), it prints
			the modified words array where duplicates have been replaced with empty strings.*/
			if(count>1) {
				text=text.replace(splitWord[i],"");
			}
			count=0;
		}
		System.out.println(text);
	}



}
