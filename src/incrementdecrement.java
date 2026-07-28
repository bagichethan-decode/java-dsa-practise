public class incrementdecrement {
        public static void main(String[] args) {

            int attendance = 30;

            System.out.println("Initial Attendance : " + attendance);

            attendance++;
            System.out.println("After attendance++ : " + attendance);

            ++attendance;
            System.out.println("After ++attendance : " + attendance);

            attendance--;
            System.out.println("After attendance-- : " + attendance);

            --attendance;
            System.out.println("After --attendance : " + attendance);

            int a = 10;

            System.out.println("\nPost Increment : " + a++);
            System.out.println("Value after Post Increment : " + a);

            System.out.println("\nPre Increment : " + ++a);

            System.out.println("\nPost Decrement : " + a--);
            System.out.println("Value after Post Decrement : " + a);

            System.out.println("\nPre Decrement : " + --a);
        }
    }

