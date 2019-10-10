package Basics;

public class String2 {

	public static void main(java.lang.String[] args) {
		String bookTitle;
		bookTitle = "The Lord of the Rings";
		String wordChoice = "Ring";
		
		if (bookTitle.contains(wordChoice)) {
			System.out.println("The book contains the word " + wordChoice);
		}
		
		String browser = "chrome";
		// (browser == "chrome")
		if (browser.equalsIgnoreCase("Chrome")) {
			System.out.println("The browser is chrome");
		}
		
		String firstName = "Tim";
		String lastName = "Short";
		String SSN = "984162168";
		
		// Print the initials plus last 4 digits of SSN
		System.out.print(firstName.substring(0,1));
		System.out.print(lastName.substring(0,3));
		System.out.println(SSN.substring(5));
		
		System.out.println("the are " + SSN.length() + " digits in your SSN. ");
		
	}

}
