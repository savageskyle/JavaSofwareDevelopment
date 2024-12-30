import java.util.ArrayList;
import java.util.List;/**
 * Represents a gift consisting of various sweets.
 */
class Gift {
    private List<Sweet> sweets; // List of sweets in the gift

    /**
     * Constructor to initialize an empty gift.
     */
    public Gift() {
        sweets = new ArrayList<>();
    }

    /**
     * Adds a sweet to the gift.
     *
     * @param sweet the sweet to add
     */
    public void addSweet(Sweet sweet) {
        sweets.add(sweet);
    }

    /**
     * Sorts the sweets in the gift by weight.
     */
    public void sortByWeight() {
        sweets.sort((s1, s2) -> Double.compare(s1.getWeight(), s2.getWeight()));
    }

    /**
     * Filters sweets by a range of sugar content.
     *
     * @param minSugar the minimum sugar content
     * @param maxSugar the maximum sugar content
     * @return a list of sweets within the specified range
     */
    public List<Sweet> filterBySugarContent(double minSugar, double maxSugar) {
        List<Sweet> filtered = new ArrayList<>();
        for (Sweet sweet : sweets) {
            if (sweet.getSugarContent() >= minSugar && sweet.getSugarContent() <= maxSugar) {
                filtered.add(sweet);
            }
        }
        return filtered;
    }

    /**
     * Returns a string representation of the Gift object.
     *
     * @return a string containing the details of all sweets in the gift
     */
    @Override
    public String toString() {
        return "Gift{" +
                "sweets=" + sweets +
                '}';
    }
}