import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashing {
    public static void main(String args[]) {
        //CREATING
        HashSet<Integer> Set = new HashSet<>();

        //Insert
        Set.add(1);
        Set.add(2);
        Set.add(3);
        Set.add(1); //list add(el)

        //Size
        System.out.println("Size of set is : " + Set.size());

        //print all elements
        System.out.println(Set);

        //search - contains
        if (Set.contains(1)) {
            System.out.println("set contains");
        }
        if (!Set.contains(6)) {
            System.out.println("does not contains");
//
//        //delete
            Set.remove(1);
            if (!Set.contains(1)) {
                System.out.println("does not contain 1-we deleted 1");
            }

            //iterator
            Iterator it = Set.iterator();
            while(it.hasNext()){
                System.out.println(it.next());

            }

        }
    }
}

