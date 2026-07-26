import java.util.Scanner;

public class ariithmeticpractise3 {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = obj.nextInt();

        System.out.println("Enter the second number:");
        int num2 = obj.nextInt();

        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
        System.out.println("Modulus: " + (num1 % num2));

        obj.close();
    }
}