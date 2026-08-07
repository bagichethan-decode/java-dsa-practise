public class Student {

//          VARIABLE
       String name;
       int age;
       double cgpa;

         //CONSTRUCTOR

            Student(String name,int age,double cgpa){
                this.name = name;
                this.age = age;
                this.cgpa = cgpa;
            }

            //METHOD

        public static void main(String args[]) {

            Student s1 = new Student("Chethan", 20, 8.5);

            s1.displayDetails();

        }

            void displayDetails(){
                System.out.println("Name : " + name);
                System.out.println("age : " + age);
                System.out.println("cgpa : " + cgpa);
        }
    }

