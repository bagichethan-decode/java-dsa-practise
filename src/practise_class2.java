public class practise_class2 {
    String type;
    String size;
    int sugar;
    double price;

    public static void main(String args[]){

        practise_class2 c1 = new practise_class2();

        c1.type = "Latte";
        c1.size ="Large";
        c1.sugar =2;
        c1.price = 100;

        c1.displayDetails();
        c1.makecofee();
        c1.drinkcofee();
    }

    public void makecofee() {
        System.out.println("preparing " +type +"cofee....");
    }

    public void drinkcofee() {
        System.out.println("drinking " +type +"cofee....");
    }

    public void displayDetails(){
        System.out.println("\n cofee details");
        System.out.println("type:" + type);
        System.out.println("size:"+size);
        System.out.println("sugar:"+sugar+"spoon(s)");
        System.out.println("price : $" +price);
    }

}
