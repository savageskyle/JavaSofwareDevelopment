/**
 * Represents a single character.
 */
public class MyCharacter { // Зміна імені класу на MyCharacter
    private char value; // The value of the character

    /**
     * Constructor to initialize a Character object.
     *
     * @param value the character value
     */
    public MyCharacter(char value) {
        this.value = value;
    }

    /**
     * Gets the value of the character.
     *
     * @return the character value
     */
    public char getValue() {
        return value;
    }

    /**
     * Sets the value of the character.
     *
     * @param value the new character value
     */
    public void setValue(char value) {
        this.value = value;
    }

    /**
     * Converts the character to a string representation.
     *
     * @return the string representation of the character
     */
    @Override
    public String toString() {
        return String.valueOf(value); // Використовуємо String.valueOf для уникнення конфліктів
    }
}
