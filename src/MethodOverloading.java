class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class MethodOverloading {

    public static void main(String[] args) {

        Calculator obj = new Calculator();

        System.out.println(obj.add(6, 4));      // Output: 10
        System.out.println(obj.add(6, 4, 5));   // Output: 15
    }
}