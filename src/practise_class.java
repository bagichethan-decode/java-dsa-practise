public class practise_class {

    String name;
    int age;
    String branch;
    double cgpa;

    public static void main(String[] args) {

        practise_class student = new practise_class();

        student.name = "Chethan";
        student.age = 20;
        student.branch = "ISE";
        student.cgpa = 7.35;

        student.displayDetails();
        student.study();

        student.updateCGPA(8.0);

        System.out.println("\nAfter updating CGPA:");
        student.displayDetails();
    }

    public void study() {
        System.out.println(name + " is studying.");
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Branch: " + branch);
        System.out.println("CGPA: " + cgpa);
    }

    public void updateCGPA(double newCGPA) {
        cgpa = newCGPA;
    }
}