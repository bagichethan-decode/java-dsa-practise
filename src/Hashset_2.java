import java.util.HashSet;

public class Hashset_2 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 1};

        HashSet<Integer> set = new HashSet<>();

        boolean duplicate = false;

        for (int num : arr) {

            if (set.contains(num)) {
                duplicate = true;
                break;
            }

            set.add(num);
        }

        System.out.println(duplicate);
    }
}