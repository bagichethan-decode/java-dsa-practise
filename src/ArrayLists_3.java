import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists_3 {
    public static void main(String args[]) {

        ArrayList<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            list.add(num);
        }

        int largest = list.get(0);
        int secondlargest = list.get(0);

        for (int i = 1; i < list.size(); i++) {

            if (list.get(i) > largest) {
                secondlargest = largest;
                largest = list.get(i);
            } else if (list.get(i) > secondlargest && list.get(i) != largest) {
                secondlargest = list.get(i);
            }

        }
        System.out.println("second largest:" + secondlargest);
    }
}