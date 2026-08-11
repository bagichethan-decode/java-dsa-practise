import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists_02 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        int n = sc.nextInt();


        //ADD EVERYTHING TO ARRAY LIST
        for (int i=0;i<n;i++) {
            int num = sc.nextInt();
            list.add(num);
        }
            for (int i = list.size() - 1; i >= 0; i--)
                if (list.get(i) % 2 == 0) {
                    list.remove(i);
                }

            System.out.println(list);

        }

    }
