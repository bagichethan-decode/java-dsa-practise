import java.util.*;

//CLASS
class Student implements Comparable<Student> {

//VARIABLE
    String name;
    int age;

//CONSTRUCTOR
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // METHOD - Sort by age
    public int compareTo(Student other) {
        return Integer.compare(this.age, other.age);
    }
}

public class ComparableExample {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Chethan", 20));
        students.add(new Student("Rahul", 18));
        students.add(new Student("Arjun", 22));

        Collections.sort(students);

        for (Student s : students) {
            System.out.println(s.name + " - " + s.age);
        }
    }
}