import java.util.ArrayList;

public class TwoDArrayList {
    public static void main(String args[]) {

        //creating the arraylist
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //creating rows
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());

        // add elements to row 0
        list.get(0).add(10);
        list.get(0).add(20);
        list.get(0).add(30);

        //add elements to row 1
        list.get(1).add(40);
        list.get(1).add(50);
        list.get(1).add(60);

        //add elements to row 2
        list.get(2).add(70);
        list.get(2).add(80);
        list.get(2).add(90);

        System.out.println(list.get(1).get(2));


        //loop through the list

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.print(list.get(i).get(j) + " ");
            }


            System.out.println();
        }
    }
}
