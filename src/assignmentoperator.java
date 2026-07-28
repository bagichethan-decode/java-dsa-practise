 import java.util.Scanner;

    public class assignmentoperator{
        public static void main(String[] args) {

            Scanner obj = new Scanner(System.in);

            System.out.print("Enter Employee Name: ");
            String name = obj.nextLine();

            System.out.print("Enter Basic Salary: ");
            double salary = obj.nextDouble();

            System.out.println("\nEmployee Name : " + name);
            System.out.println("Basic Salary  : " + salary);

            // Bonus
            salary += 5000;
            System.out.println("After Bonus (+5000)      : " + salary);

            // Tax
            salary -= 2000;
            System.out.println("After Tax (-2000)        : " + salary);

            // Double Salary
            salary *= 2;
            System.out.println("After Double (*2)        : " + salary);

            // Half Salary
            salary /= 2;
            System.out.println("After Half (/2)          : " + salary);

            // Remainder
            salary %= 1000;
            System.out.println("Remainder (%1000)        : " + salary);
        }
    }

