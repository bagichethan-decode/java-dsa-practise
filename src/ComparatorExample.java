import java.util.*;

class Student {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ComparatorExample {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Chethan", 20));
        students.add(new Student("Rahul", 18));
        students.add(new Student("Arjun", 22));

        Comparator<Student> byName = (s1, s2) ->
                s1.name.compareTo(s2.name);

        Collections.sort(students, byName);

        for (Student s : students) {
            System.out.println(s.name + " - " + s.age);
        }
    }
}