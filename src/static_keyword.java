public class static_keyword {

    //CLASS

        public static void main(String  args[]){      //MAIN METHOD

            mobile obj1 = new mobile();               //OBJECT
            obj1.brand = "apple";
            obj1.price = 1500;
            obj1.name = "smartphone";

            mobile obj2 = new mobile();               //OBJECT
            obj2.brand = "samsung";
            obj2.price = 1700;
            obj2.name = "smartphone";



            obj1.name = "MOBILE PHONE";  //THIS IS THE BEAUTY OF USING THE STATIC


            obj1.show();                      //METHOD CALL
            obj2.show();                      //METHOD CALL

    }

   static class mobile
    {

        static String name;      //STATIC THE BEAUTY
        //VARIABLE
        String brand;
        int price;


        // WE CAN USE SHOW() HERE INSTEAD OF ANY OTHER
        // METHOD

        public void show() {
            System.out.println(brand + " : " + price + ":" + name );
        }
    }

    }
