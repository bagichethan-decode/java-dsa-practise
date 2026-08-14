import java.util.*;
public class hashmap {
    public static void main(String args[]) {
        HashMap<String, Integer> map = new HashMap<>();

        //insertion
        map.put("india", 120);
        map.put("china", 150);
        map.put("usa", 30);
        System.out.println(map);

//change of value directly
        map.put("usa", 20);
        System.out.println(map);

        //search
        if (map.containsKey("china")) {
            System.out.println("key is present in the map");
        } else {
            System.out.println("key is not present in the map");
        }

        System.out.println(map.get("china"));
        System.out.println(map.get("indonesia"));

        int arr[] = {12, 15, 18};
        for (int i = 0; i < 3; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
