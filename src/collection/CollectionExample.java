package collection;

import java.util.ArrayList;

public class CollectionExample {
    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();
        arr.add("Hello ");
        arr.add("World" );
        arr.add("!");

        System.out.println(arr);
        System.out.println("element at index 2 is: "+ arr.get(2));
    }
}
