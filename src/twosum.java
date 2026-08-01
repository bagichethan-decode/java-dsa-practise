public class twosum {
    public static void main(String [] args){
        int []arr = {3,2,9,5};
        int max = arr[0];
        int min = arr[0];


        //i < arr.length
        //arr.length tells how many elements are in the array.

        for (int i=0;i<arr.length;i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
            System.out.println("max="+max);
            System.out.println("min="+min);

        }

    }
