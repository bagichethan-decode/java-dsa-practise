import java.util.Scanner;
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int a = obj.nextInt();

        System.out.println("Enter the second number:");
        int b = obj.nextInt();

        System.out.println("Enter the third number:");
        int c = obj.nextInt();

        System.out.println("Addition: " + (a + b + c));
        System.out.println("Subtraction: " + (a - b - c));
        System.out.println("Multiplication: " + (a * b * c));
        System.out.println("Division: " + (a / b / c));
        System.out.println("Modulus: " + (a % b % c));

        obj.close();
    }
