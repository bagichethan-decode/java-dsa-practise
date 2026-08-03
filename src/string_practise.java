public class string_practise {
    public static void main(String[] args) {

        String s = "hello";

        String reverse = " ";

        for (int i = s.length()-1;i>=0;i--){
            reverse = reverse +s.charAt(i);
        }
        System.out.println(reverse);

    }
}

