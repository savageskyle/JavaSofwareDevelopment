import java.util.ArrayList;
import java.util.List;

/**
 * Represents a word consisting of multiple characters.
 */
public class Word {
    private List<Character> characters; // List of characters forming the word

    /**
     * Constructor to initialize a Word object from a string.
     *
     * @param word the string representing the word
     */
    public Word(String word) {
        characters = new ArrayList<>();
        for (char c : word.toCharArray()) {
            characters.add(new Character(c));
        }
    }

    /**
     * Gets the list of characters in the word.
     *
     * @return the list of characters
     */
    public List<Character> getCharacters() {
        return characters;
    }

    /**
     * Converts the word to a string representation.
     *
     * @return the string representation of the word
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Character c : characters) {
            result.append(c);
        }
        return result.toString();
    }
}
