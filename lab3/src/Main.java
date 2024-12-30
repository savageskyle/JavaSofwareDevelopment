import java.util.Arrays;
import java.util.Comparator;

/**
 * This class contains the main method to manage and process an array of submarines.
 * It demonstrates sorting by multiple fields and searching for a specific submarine.
 */
public class Main {

    public static void main(String[] args) {
        // Create an array of Submarine objects
        Submarine[] submarines = {
                new Submarine("Titan", 5000, 30, 100, 2010), // Submarine 1
                new Submarine("Nautilus", 3000, 25, 80, 2000), // Submarine 2
                new Submarine("Poseidon", 4500, 28, 90, 2005), // Submarine 3
                new Submarine("Leviathan", 6000, 35, 120, 2015), // Submarine 4
                new Submarine("Kraken", 4000, 22, 70, 1995) // Submarine 5
        };

        // Sort submarines by displacement (ascending) and speed (descending)
        Arrays.sort(submarines, Comparator.comparingInt(Submarine::getDisplacement)
                .thenComparing(Comparator.comparingInt(Submarine::getSpeed).reversed()));

        // Display the sorted submarines
        System.out.println("Sorted submarines:");
        for (Submarine submarine : submarines) {
            System.out.println(submarine);
        }

        // Define a target submarine to search for
        Submarine target = new Submarine("Poseidon", 4500, 28, 90, 2005);

        // Search for the target submarine
        boolean found = Arrays.stream(submarines).anyMatch(submarine -> submarine.equals(target));

        // Output whether the target submarine was found
        System.out.println("\nTarget submarine " + (found ? "found" : "not found") + ": " + target);
    }
}
