import java.util.ArrayList;

public class arraylists_2 {

    public static void main(String args[]) {

        ArrayList<String> fruits = new ArrayList<>();

        // Add fruits
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println("Fruits: " + fruits);

        // Access
        System.out.println("First fruit: " + fruits.get(0));

        // Change
        fruits.set(2, "Grapes");

        // Remove
        fruits.remove("Mango");

        System.out.println("After changes: " + fruits);

        // Search
        if (fruits.contains("Apple")) {
            System.out.println("Apple is available!");
        }

        // Loop
        System.out.println("All fruits:");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Size
        System.out.println("Total fruits: " + fruits.size());
    }
}