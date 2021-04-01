package genericPackage;

public class FancyBoxTester {

    public static void main(String[] args) {

        FancyBox<String> myBoxString = new FancyBox<>();
        myBoxString.put("This string is my fancyBox!");
        System.out.println("fancyBox integer type is : " + myBoxString.get());
        // trying to put an integer in myBox will fail
        //            myBoxString.put(1);
        // but we can create a new fancybox of integer type and use it

        FancyBox<Integer> myBoxInteger = new FancyBox<>();
        myBoxInteger.put(1);
        System.out.println("fancyBox integer type is : " + myBoxInteger.get());


    }
}
