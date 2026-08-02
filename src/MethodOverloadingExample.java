public class MethodOverloadingExample {

    public static void main(String[] args) {

        MethodOverloadingExample obj = new MethodOverloadingExample();

        obj.joke();
        obj.joke("Chethan");
        obj.joke("Chethan", 100);
    }

    public void joke() {
        System.out.println("Java and JavaScript are like Car and Carpet.");
    }

    public void joke(String name) {
        System.out.println("Hello " + name + ", your code compiles... until the viva starts!");
    }

    public void joke(String name, int marks) {
        System.out.println(name + " scored " + marks + " marks, but still says 'It works on my laptop!'");
    }
}