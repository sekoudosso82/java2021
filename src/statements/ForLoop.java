package statements;

public class ForLoop {
//    for (initialization; termination; increment )
//        statement; // or a block
    public static void main(String[] args) {
        for(int counter = 1; counter <= 10; counter++){
            System.out.println(counter);
        }
        System.out.println(" We have exited the loop.");
    }
}
