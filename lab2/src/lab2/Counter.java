package lab2;

public interface Counter {
	    /**
	     * Counts the number of words in a sentence.
	     * A word is defined as a sequence of characters separated by spaces.
	     * @param sentence The input sentence as a String.
	     * @return The number of words in the sentence.
	     */
	    int countWords(String sentence);

	    /**
	     * Counts the number of letters in a sentence.
	     * Letters are considered as alphabetic characters.
	     * @param sentence The input sentence as a String.
	     * @return The number of letters in the sentence.
	     */
	    int countLetters(String sentence);

	    /**
	     * Gets the length of the sentence, including spaces.
	     * @param sentence The input sentence as a String.
	     * @return The total length of the sentence, including spaces.
	     */
	    int getLength(String sentence);
	}



