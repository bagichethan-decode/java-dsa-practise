public class Greetingexample {public class Greetingexample {

    public static void main(String[] args) {

        Greetingexample obj = new Greetingexample();

        obj.greet();
        obj.greet("Chethan");
    }

    public void greet() {
        System.out.println("Hello!");
    }

    public void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
}
}
