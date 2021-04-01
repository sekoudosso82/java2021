package hashMapPackage;

import java.util.Collection;
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<Integer, String> myHashMap = new HashMap<>();
        myHashMap.put(1, "James");
        myHashMap.put(2, "Sekou");
        myHashMap.put(3, "Bilal");

        System.out.println("The string stored under key 3 is: " + myHashMap.get(3));
        System.out.println("The string stored under key 2 is: " + myHashMap.get(2));

        // replace a key value
            myHashMap.replace(2, "malika");
            System.out.println("The string stored under key 2 is: " + myHashMap.get(2));

        // ALL KEYS keySet return an array of keys
            System.out.println("array of keys : " + myHashMap.keySet());

        // ALL VALUES Object.values() return an array of values

            // Collection<String> values = myHashMap.values();
            // System.out.println("array of values : " + values );
            //        OR
            System.out.println("array of values : " + myHashMap.values() );

    }
}
