import java.util.ArrayList;
import java.util.List;

/**
 * Represents a sentence consisting of words and delimiters.
 */
public class Sentence {
    private List<Word> words; // List of words in the sentence
    private List<Character> delimiters; // List of delimiters (e.g., punctuation marks)

    /**
     * Constructor to initialize a Sentence object from a string.
     *
     * @param sentence the string representing the sentence
     */
    public Sentence(String sentence) {
        words = new ArrayList<>();
        delimiters = new ArrayList<>();

        StringBuilder wordBuffer = new StringBuilder();
        for (char c : sentence.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                wordBuffer.append(c);
            } else {
                if (wordBuffer.length() > 0) {
                    words.add(new Word(wordBuffer.toString()));
                    wordBuffer.setLength(0);
                }
                delimiters.add(new Character(c));
            }
        }
        if (wordBuffer.length() > 0) {
            words.add(new Word(wordBuffer.toString()));
        }
    }

    /**
     * Gets the list of words in the sentence.
     *
     * @return the list of words
     */
    public List<Word> getWords() {
        return words;
    }

    /**
     * Gets the list of delimiters in the sentence.
     *
     * @return the list of delimiters
     */
    public List<Character> getDelimiters() {
        return delimiters;
    }

    /**
     * Converts the sentence to a string representation.
     *
     * @return the string representation of the sentence
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        int wordIndex = 0;
        for (Character delimiter : delimiters) {
            if (wordIndex < words.size()) {
                result.append(words.get(wordIndex++));
            }
            result.append(delimiter);
        }
        if (wordIndex < words.size()) {
            result.append(words.get(wordIndex));
        }
        return result.toString();
    }
}
