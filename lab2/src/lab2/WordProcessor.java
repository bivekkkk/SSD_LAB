package lab2;

public class WordProcessor implements Counter {
	private String text;  // Attribute to hold fallback text

    /**
     * Gets the value of the 'text' attribute.
     * @return The text attribute.
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the 'text' attribute.
     * @param text The input text to set.
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Counts the number of words in a sentence. Words are separated by spaces.
     * @param sentence The input sentence.
     * @return The number of words in the sentence.
     */
    @Override
    public int countWords(String sentence) {
        if (sentence == null) {
            sentence = text;
        }
        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }
        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }

    /**
     * Counts the number of letters in a sentence.
     * @param sentence The input sentence.
     * @return The number of alphabetic letters in the sentence.
     */
    @Override
    public int countLetters(String sentence) {
        if (sentence == null) {
            sentence = text;
        }
        if (sentence == null) {
            return 0;
        }
        int letters = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isLetter(sentence.charAt(i))) {
                letters++;
            }
        }
        return letters;
    }

    /**
     * Gets the length of the sentence, including spaces.
     * @param sentence The input sentence.
     * @return The length of the sentence, including spaces.
     */
    @Override
    public int getLength(String sentence) {
        if (sentence == null) {
            sentence = text;
        }
        return (sentence != null) ? sentence.length() : 0;
    }
}


