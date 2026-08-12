import java.util.ArrayList;
import java.util.HashSet;

public class ArrayList_5 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(5);
        list.add(8);
        list.add(2);

        HashSet<Integer> seen = new HashSet<>();
        ArrayList<Integer> duplicates = new ArrayList<>();

        for (int num : list) {

            if (seen.contains(num)) {

                if (!duplicates.contains(num)) {
                    duplicates.add(num);
                }

            } else {
                seen.add(num);
            }
        }

        System.out.println("Original: " + list);
        System.out.println("Duplicates: " + duplicates);
    }
}