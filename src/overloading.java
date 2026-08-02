public class overloading {

    public static void main(String[] args) {

        Engineer obj = new Engineer();

        obj.sleep();
        obj.sleep(5);
        obj.sleep(12, "Java debugging defeated me.");
    }

    static class Engineer {

        public void sleep() {
            System.out.println("Sleeping...");
        }

        public void sleep(int hours) {
            System.out.println("Sleeping for " + hours + " hours after one assignment.");
        }

        public void sleep(int hours, String reason) {
            System.out.println("Sleeping for " + hours + " hours because " + reason);
        }
    }
}