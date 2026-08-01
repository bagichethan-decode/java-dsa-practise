public class passingarray {
    public static void main(String [] args) {
        int[] marks1 = {80, 90, 70};
        int[] marks2 = {65, 75, 85};
        int[] marks3 = {95, 88, 91};

        findmin(marks1);
        findmin(marks2);
        findmin(marks3);
    }

//    findMax, here's my array Find the maximum.

    public static void findmin(int[] arr) {

        int min = arr[0];

        for(int i =0; i > arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
    }

        System.out.println(min);
   }
        }

