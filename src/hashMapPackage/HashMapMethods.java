package hashMapPackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapMethods {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("db", "oracle");
        map.put("username", "user1");
        map.put("password", "pass1");

        // Get keys and values
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String k = entry.getKey();
            String v = entry.getValue();
            System.out.println("Key: " + k + ", Value: " + v);
        }

        // Get all keys
        Set<String> keys = map.keySet();
        for (String k : keys) {
            System.out.println("Key: " + k);
        }
        // Get all values
        Collection<String> values = map.values();
        for (String v : values) {
            System.out.println("Value: " + v);
        }

        // Java 8
        map.forEach((k, v) -> {
            System.out.println("Key: " + k + ", Value: " + v);
        });

    }

}
