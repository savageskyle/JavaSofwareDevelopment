import java.util.StringTokenizer;

/**
 * The Main class provides a demonstration of processing text to remove repeated occurrences of the first letter in each word.
 */
public class Main {
    public static void main(String[] args) {
        try {
            StringBuffer inputText = new StringBuffer("Це    спосіб\tтестування   відпрацювання програми!");
            System.out.println("Original: " + inputText);

            // Process the text to remove repeated letters
            String processedText = processText(inputText.toString());
            System.out.println("Processed: " + processedText);
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }

    /**
     * Processes the input text by removing repeated occurrences of the first letter in each word.
     *
     * @param text the input text to process
     * @return the processed text
     */
    private static String processText(String text) {
        StringTokenizer tokenizer = new StringTokenizer(text);
        StringBuilder result = new StringBuilder();

        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            if (word.length() > 0) {
                char firstChar = word.charAt(0);
                StringBuilder newWord = new StringBuilder();

                for (char c : word.toCharArray()) {
                    if (c != firstChar || newWord.length() == 0) {
                        newWord.append(c);
                    }
                }

                result.append(newWord).append(" ");
            }
        }

        return result.toString().trim();
    }
}
