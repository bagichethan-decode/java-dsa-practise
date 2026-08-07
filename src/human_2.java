public class human_2 {

    // PRIVATE DATA
    private String name;
    private int age;

    public static void main(String args[]) {

        human_2 h2 = new human_2();

        // SETTER
        h2.setName("chethan");
        h2.setAge(20);

        // GETTER
        System.out.println("Name:" + h2.getName());
        System.out.println("Age:" + h2.getAge());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}