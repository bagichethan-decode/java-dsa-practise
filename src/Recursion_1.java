public class Recursion_1 {

    static void printNumbers(int n) {

        // Base case
        if (n == 0) {
            return;
        }

        // Recursive call
        printNumbers(n - 1);

        // Print
        System.out.println(n);
    }

    public static void main(String[] args) {

        printNumbers(5);
    }
}