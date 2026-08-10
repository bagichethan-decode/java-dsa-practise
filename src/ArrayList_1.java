import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        int n = sc.nextInt();

        for (int i=0;i<n;i++) {
            int num = sc.nextInt();
            list.add(num);
        }
            for (int i = list.size()-1;i>=0;i--) {
                System.out.print(list.get(i) + " ");
            }

        System.out.println(list);

    }
}
