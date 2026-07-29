public class operatorprecedence {
    public static void main(String[] args) {

                int a = 20;
                int b = 10;
                int c = 5;
                int d = 2;

                int result1 = a + b * c;
                int result2 = (a + b) * c;
                int result3 = a - b / d;
                int result4 = (a - b) / d;
                int result5 = a + b * c - d;
                int result6 = (a + b) * (c - d);
                int result7 = a / c + b * d;
                int result8 = (a / c + b) * d;

                System.out.println("Result 1 = " + result1);
                System.out.println("Result 2 = " + result2);
                System.out.println("Result 3 = " + result3);
                System.out.println("Result 4 = " + result4);
                System.out.println("Result 5 = " + result5);
                System.out.println("Result 6 = " + result6);
                System.out.println("Result 7 = " + result7);
                System.out.println("Result 8 = " + result8);
            }
        }




