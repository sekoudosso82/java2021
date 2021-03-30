package statements;

import org.w3c.dom.ls.LSOutput;

public class WhileLoop {
//    while (expr)
//        statement; // or block
    public static void main(String[] args) {
        int count = 1 ;
        while(count < 11) {
            System.out.println(count);
            count++;
        }
        System.out.println("We have exited the while loop.");
    }
}
