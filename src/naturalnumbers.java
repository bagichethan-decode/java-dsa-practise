import java.util.Scanner;
public class naturalnumbers {
    static int sum(int n) {

        //take this like an a base class
        if (n == 0) {
            return 0;
        }

        //recursion case
        return n + sum(n - 1);  //VERY IMPORTANT LINE
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("Sum =" + sum(num));

        sc.close();
    }
}

