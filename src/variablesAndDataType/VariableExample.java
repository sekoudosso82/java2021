package variablesAndDataType;

public class VariableExample {
    public static void main(String[] args) {
        boolean myBoolean = false;
        byte  myByte = 2;
        short myShort = 3;
        char myChar = 'b';
        int myInt = 5;
        float myFloat =  0.25f;
        long myLong = 999L;
        double myDouble = 5.99d;
        String myString = new String("This is string object");

        System.out.println("2+3 = "+(myByte+myShort));
        myBoolean = myInt < 6;
        System.out.println("is myInt<6 ? " + myBoolean);
        System.out.println("floating point division (myDouble/myFloat): ");
        System.out.println(myDouble/myFloat);
        System.out.println("what happen when we divide integer? 5/2 = ");
        System.out.println(myInt/myByte);
        System.out.println("there's no decimal and no remainder!");
    }
}
