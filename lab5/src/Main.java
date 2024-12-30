import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        try {
            // Create a new gift
            Gift gift = new Gift();

            // Add various sweets to the gift
            gift.addSweet(new Candy("Lollipop", 50, 30, "Cherry"));
            gift.addSweet(new Candy("Gummy Bear", 20, 15, "Orange"));
            gift.addSweet(new Chocolate("Milk Chocolate", 100, 50, 40));
            gift.addSweet(new Chocolate("Dark Chocolate", 150, 30, 70));

            // Display the gift before sorting
            System.out.println("Gift contents before sorting by weight:");
            System.out.println(gift);

            // Sort the sweets by weight
            gift.sortByWeight();

            // Display the gift after sorting
            System.out.println("\nGift contents after sorting by weight:");
            System.out.println(gift);

            // Filter sweets by sugar content
            double minSugar = 20;
            double maxSugar = 50;
            System.out.println("\nSweets with sugar content between " + minSugar + " and " + maxSugar + " grams:");
            for (Sweet sweet : gift.filterBySugarContent(minSugar, maxSugar)) {
                System.out.println(sweet);
            }
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
