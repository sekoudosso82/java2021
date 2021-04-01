package genericPackage;

public class KVPairTester {

    public static void main(String[] args) {

        KVPairClass<Integer, String> pairOne = new KVPairClass<>();
        KVPairClass<Integer, String > pairTwo = new KVPairClass<>();

        pairOne.put(1, "James");
        pairTwo.put(2, "Mary");

        System.out.println("Are pairOne and pairTwo the same? " + KVPairUtilities.equality(pairOne ,pairTwo));

        pairOne.put(2, "Mary");

        System.out.println("How about now? " + KVPairUtilities.equality(pairOne ,pairTwo));

    }
}
