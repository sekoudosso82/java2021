package genericPackage;

public class KVPairUtilities {

    public static <K, V> boolean equality(KVPairClass<K,V> p1, KVPairClass<K,V> p2){
        return  p1.getKey().equals(p2.getKey()) &&
                p1.getValue().equals(p2.getValue());
    }
}
