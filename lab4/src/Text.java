import java.util.ArrayList;
import java.util.List;

/**
 * Represents a text consisting of sentences.
 */
public class Text {
    private List<Sentence> sentences; // List of sentences in the text

    /**
     * Constructor to initialize a Text object from a string.
     *
     * @param text the string representing the text
     */
    public Text(String text) {
        sentences = new ArrayList<>();
        for (String sentence : text.split("(?<=[.!?])\\s*")) {
            sentences.add(new Sentence(sentence));
        }
    }

    /**
     * Gets the list of sentences in the text.
     *
     * @return the list of sentences
     */
    public List<Sentence> getSentences() {
        return sentences;
    }

    /**
     * Converts the text to a string representation.
     *
     * @return the string representation of the text
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Sentence sentence : sentences) {
            result.append(sentence).append(" ");
        }
        return result.toString().trim();
    }

    /**
     * Cleans up the text by replacing tabs and multiple spaces with a single space.
     */
    public void cleanUp() {
        for (int i = 0; i < sentences.size(); i++) {
            String cleaned = sentences.get(i).toString().replaceAll("\\s+", " ").replaceAll("\\t", " ");
            sentences.set(i, new Sentence(cleaned));
        }
    }
}
