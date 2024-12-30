/**
 * Represents a specific type of sweet: Candy.
 */
class Candy extends Sweet {
    private String flavor; // Flavor of the candy

    /**
     * Constructor for creating a Candy object.
     *
     * @param name         the name of the candy
     * @param weight       the weight of the candy in grams
     * @param sugarContent the sugar content of the candy in grams
     * @param flavor       the flavor of the candy
     */
    public Candy(String name, double weight, double sugarContent, String flavor) {
        super(name, weight, sugarContent);
        this.flavor = flavor;
    }

    /**
     * Gets the flavor of the candy.
     *
     * @return the flavor of the candy
     */
    public String getFlavor() {
        return flavor;
    }

    /**
     * Sets the flavor of the candy.
     *
     * @param flavor the flavor to set
     */
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    /**
     * Returns a string representation of the Candy object.
     *
     * @return a string containing the candy's details
     */
    @Override
    public String toString() {
        return "Candy{" +
                "name='" + getName() + '\'' +
                ", weight=" + getWeight() +
                ", sugarContent=" + getSugarContent() +
                ", flavor='" + flavor + '\'' +
                '}';
    }
}