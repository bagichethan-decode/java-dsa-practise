public class methods {
    public static void main(String args[]) {
                String name = "Chethan";
                int[] marks = {85, 90, 78, 95, 88};

                printName(name);
                printMarks(marks);
                findTotal(marks);
                findAverage(marks);
                findHighest(marks);

            }

            public static void printName(String name) {
                System.out.println("Student Name: " + name);
            }

            public static void printMarks(int[] marks) {
                System.out.println("Marks:");
                for (int i = 0; i < marks.length; i++) {
                    System.out.println(marks[i]);
                }
            }

            public static void findTotal(int[] marks) {
                int total = 0;

                for (int i = 0; i < marks.length; i++) {
                    total += marks[i];
                }

                System.out.println("Total = " + total);
            }

            public static void findAverage(int[] marks) {

                int total = 0;

                for (int i = 0; i < marks.length; i++) {
                    total += marks[i];
                }

                double average = (double) total / marks.length;

                System.out.println("Average = " + average);
            }

            public static void findHighest(int[] marks) {

                int max = marks[0];

                for (int i = 0; i < marks.length; i++) {

                    if (marks[i] > max) {
                        max = marks[i];
                    }

                }

                System.out.println("Highest = " + max);
            }

        }



