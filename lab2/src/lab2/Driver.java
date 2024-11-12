package lab2;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Step 1: Ask user for input text
	        System.out.println("Enter a sentence:");
	        String userInput = scanner.nextLine();

	        // Step 2: Create an instance of WordProcessor
	        Counter processor = new WordProcessor();

	        // Step 3: Test methods with user input
	        System.out.println("Number of words: " + processor.countWords(userInput));
	        System.out.println("Number of letters: " + processor.countLetters(userInput));
	        System.out.println("Length of sentence: " + processor.getLength(userInput));

	        // Step 4: Change DataType of WordProcessor instance to Counter
	        // This is allowed because WordProcessor implements the Counter interface.

	        // Step 5: Test methods with null value (use fallback text)
	        WordProcessor wp = new WordProcessor();
	        wp.setText("Fallback text here");
	        
	        System.out.println("Using fallback text:");
	        System.out.println("Number of words: " + wp.countWords(null));  // Fallback text will be used
	        System.out.println("Number of letters: " + wp.countLetters(null));  // Fallback text
	        System.out.println("Length of sentence: " + wp.getLength(null));  // Fallback text
	    }
	}


