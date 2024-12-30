import java.util.ArrayList;
import java.util.List;

/**
 * Represents a generic Sweet item.
 */
public class Sweet {
    private String name;
    private double weight; // Weight in grams
    private double sugarContent; // Sugar content in grams

    /**
     * Constructor for creating a Sweet object.
     *
     * @param name         the name of the sweet
     * @param weight       the weight of the sweet in grams
     * @param sugarContent the sugar content of the sweet in grams
     */
    public Sweet(String name, double weight, double sugarContent) {
        this.name = name;
        this.weight = weight;
        this.sugarContent = sugarContent;
    }

    /**
     * Gets the name of the sweet.
     *
     * @return the name of the sweet
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the sweet.
     *
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the weight of the sweet.
     *
     * @return the weight of the sweet in grams
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Sets the weight of the sweet.
     *
     * @param weight the weight to set in grams
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Gets the sugar content of the sweet.
     *
     * @return the sugar content of the sweet in grams
     */
    public double getSugarContent() {
        return sugarContent;
    }

    /**
     * Sets the sugar content of the sweet.
     *
     * @param sugarContent the sugar content to set in grams
     */
    public void setSugarContent(double sugarContent) {
        this.sugarContent = sugarContent;
    }

    /**
     * Returns a string representation of the Sweet object.
     *
     * @return a string containing the sweet's details
     */
    @Override
    public String toString() {
        return "Sweet{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", sugarContent=" + sugarContent +
                '}';
    }
}