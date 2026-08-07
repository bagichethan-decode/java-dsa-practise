public class NumberList {
    //VARIABLE
    int Size;

    //CONSTRUCTOR

    NumberList(int Size) {
        this.Size = Size;
    }

    //MAIN

    public static void main(String args[]) {
        NumberList n1 = new NumberList(5);

        n1.displaySize();
    }

     //METHOD
    void displaySize(){
        System.out.println("array size:" + Size);
    }

}

