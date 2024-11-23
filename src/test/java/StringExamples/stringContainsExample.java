package StringExamples;

public class stringContainsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String title = "Welcome to ABC Bank!";
		String expectedWord = "welcome";
		expectedWord = expectedWord.toUpperCase();
		boolean success = title.toUpperCase().contains(expectedWord);
		
		System.out.println(success);
		
		
		
		//compareToIgnoreCase()
		
		title = "WELCOME";
		
		System.out.println(title.equalsIgnoreCase("Welcome"));
		
		
	}

}
