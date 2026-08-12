import java.util.ArrayList;
public class ArrayList_4 {
    public static void main(String args[]) {

        ArrayList<String> pairs = new ArrayList<>();

        int[] arr = {2, 4, 3, 5, 7};
        int target = 7;

        for(int i =0;i<arr.length;i++) {
            for (int j = i+1; j < arr.length; j++) {
              if(arr[i] + arr[j] == target) {
                  pairs.add(arr[i] + "," + arr[j]);
              }
            }
        }

        System.out.println(pairs);
    }
}
