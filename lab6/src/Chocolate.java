/**
 * Represents a specific type of sweet: Chocolate.
 */
class Chocolate extends Sweet {
    private double cocoaContent; // Cocoa content in percentage

    /**
     * Constructor for creating a Chocolate object.
     *
     * @param name         the name of the chocolate
     * @param weight       the weight of the chocolate in grams
     * @param sugarContent the sugar content of the chocolate in grams
     * @param cocoaContent the cocoa content in percentage
     */
    public Chocolate(String name, double weight, double sugarContent, double cocoaContent) {
        super(name, weight, sugarContent);
        this.cocoaContent = cocoaContent;
    }

    /**
     * Gets the cocoa content of the chocolate.
     *
     * @return the cocoa content in percentage
     */
    public double getCocoaContent() {
        return cocoaContent;
    }

    /**
     * Sets the cocoa content of the chocolate.
     *
     * @param cocoaContent the cocoa content to set in percentage
     */
    public void setCocoaContent(double cocoaContent) {
        this.cocoaContent = cocoaContent;
    }

    /**
     * Returns a string representation of the Chocolate object.
     *
     * @return a string containing the chocolate's details
     */
    @Override
    public String toString() {
        return "Chocolate{" +
                "name='" + getName() + '\'' +
                ", weight=" + getWeight() +
                ", sugarContent=" + getSugarContent() +
                ", cocoaContent=" + cocoaContent +
                '}';
    }
}