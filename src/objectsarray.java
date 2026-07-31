public class objectsarray {
    public static void main(String [] args){


    class Student {
        int rollno;
        String name;
        int marks;
    }

            Student s1 = new Student();
            s1.rollno = 1;
            s1.name = "Chethan";
            s1.marks = 87;

            Student s2 = new Student();
            s2.rollno = 2;
            s2.name = "Love";
            s2.marks = 88;

            Student s3 = new Student();
            s3.rollno = 3;
            s3.name = "Honey";
            s3.marks = 89;

            Student[] students = new Student[3];

            students[0] = s1;
            students[1] = s2;
            students[2] = s3;

            for (Student s : students) {
                System.out.println(s.rollno + " " + s.name + " " + s.marks);
            }
        }
    }





