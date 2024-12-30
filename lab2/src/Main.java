import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        try {
            // Input text
            StringBuffer text = new StringBuffer("Це спосіб тестування відпрацювання програми ");

            System.out.println("Original text: " + text);

            // Process text according to C17 = 14
            String processedText = processText(text.toString());

            System.out.println("Processed text: " + processedText);
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }

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
