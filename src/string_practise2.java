public class string_practise2 {
    public static void main(String[] args){

        String s = "GOOGLE";
        String reverse  = "";

        for(int i =s.length()-1; i>=0; i--) {
            reverse = reverse + s.charAt(i);
        }
            System.out.println(reverse);





    }
}
