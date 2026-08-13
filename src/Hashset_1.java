import java.util.HashSet;

public class Hashset_1 {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        // Add elements
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20);

        System.out.println(set);

        // Check if element exists
        System.out.println(set.contains(20));

        // Remove element
        set.remove(10);

        System.out.println(set);

        // Size
        System.out.println(set.size());

        // Loop
        for (int num : set) {
            System.out.println(num);
        }
    }
}