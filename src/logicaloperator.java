public class logicaloperator {
    public class Logical1 {
        public static void main(String[] args) {

            int age = 20;
            boolean citizen = true;

            System.out.println(age >= 18 && citizen);
            System.out.println(age >= 18 || citizen);
            System.out.println(!citizen);
        }
    }
}
