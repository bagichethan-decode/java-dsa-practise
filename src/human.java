public class human {

    public static void main(String args[]) {

        human h1 = new human();

        h1.introduce("chethan",20);
        h1.showdetails();
    }

    //CONSIDER IT AS A PRIVATE DATA (PRIVACY)
    private String name;
    private int age;

    
    //METHOD TO SET OR GET
    public void introduce(String n,int a) {
        name = n;
        age = a;
    }
    //METHOD :- SO THAT YOU CAN ACCESS THE DATA
    public void showdetails(){
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        }
    }



