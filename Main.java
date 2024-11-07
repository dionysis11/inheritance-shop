import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Create a list of items
        List<Item> items = new ArrayList<>();

        // Create a list of names
        List<String> names = new ArrayList<>();
        names.add("Dionysis");

        // Create maps to track borrowing stats
        Map<String, Integer> itemBorrowCount = new HashMap<>();
        Map<String, Integer> personBorrowCount = new HashMap<>();

        // Initialize the item borrow count
        for (Item item : items) {
            itemBorrowCount.put(item.getTitle(), 0);  // Initialize count for each item
        }

        // Run 50 iterations to simulate borrowing
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            // Create a new list of available names for each iteration
            List<String> availableNames = new ArrayList<>(names);
            
            for (Item item : items) {
                if (item instanceof Borrowable) {
                    // Randomly decide if an item can be borrowed
                    if (random.nextBoolean() && !availableNames.isEmpty()) {
                        String randomName = availableNames.get(random.nextInt(availableNames.size()));
                        availableNames.remove(randomName);  // Remove name after borrowing

                        // Borrow the item
                        ((Borrowable) item).borrowItem(randomName);

                        // Update the counters
                        itemBorrowCount.put(item.getTitle(), itemBorrowCount.get(item.getTitle()) + 1);
                        personBorrowCount.put(randomName, personBorrowCount.getOrDefault(randomName, 0) + 1);
                    }
                }
            }
        }

        // Display the results
        System.out.println("Item Borrow Count:");
        for (Map.Entry<String, Integer> entry : itemBorrowCount.entrySet()) {
            System.out.println(entry.getKey() + " was borrowed " + entry.getValue() + " times.");
        }

        System.out.println("\nPerson Borrow Count:");
        for (Map.Entry<String, Integer> entry : personBorrowCount.entrySet()) {
            System.out.println(entry.getKey() + " borrowed " + entry.getValue() + " items.");
        }
    }
}
