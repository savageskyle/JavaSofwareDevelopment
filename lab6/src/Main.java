import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create a collection of Sweet items
        TypedCollection<Sweet> collection = new TypedCollection<>();
        collection.add(new Candy("Lollipop", 50, 30, "Cherry"));
        collection.add(new Chocolate("Milk Chocolate", 100, 50, 40));

        System.out.println("Initial collection:");
        for (Sweet sweet : collection) {
            System.out.println(sweet);
        }

        // Demonstrate adding a single element
        collection.add(new Candy("Gummy Bear", 20, 15, "Orange"));
        System.out.println("\nAfter adding a new item:");
        for (Sweet sweet : collection) {
            System.out.println(sweet);
        }
    }
}
