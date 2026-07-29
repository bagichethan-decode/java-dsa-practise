public class operatorprecedence2 {
        public static void main(String[] args) {

            int a = 15;
            int b = 6;
            int c = 3;
            int d = 4;

            int answer1 = a + b * c - d;
            int answer2 = (a + b) * c - d;
            int answer3 = a * b / c + d;
            int answer4 = a + (b - c) * d;
            int answer5 = (a + b) / c * d;
            int answer6 = a - b + c * d;
            int answer7 = (a - b + c) * d;
            int answer8 = a + b / c + d * 2;

            System.out.println("Answer 1 = " + answer1);
            System.out.println("Answer 2 = " + answer2);
            System.out.println("Answer 3 = " + answer3);
            System.out.println("Answer 4 = " + answer4);
            System.out.println("Answer 5 = " + answer5);
            System.out.println("Answer 6 = " + answer6);
            System.out.println("Answer 7 = " + answer7);
            System.out.println("Answer 8 = " + answer8);
        }
    }


