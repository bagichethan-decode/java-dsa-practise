import java.util.*;

public class digits_of_a_number {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nod = 0; // (nod) number of digits
        int temp = n;
        while(temp != 0){
            temp = temp / 10;
            nod++;
        }
        int div = (int)Math.pow(10, nod - 1);
        while(n != 0){
            System.out.println('q');

            n =  n % div;
            div = div / 10;

        }
    }
}
