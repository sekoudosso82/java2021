package variablesAndDataType;

public class ArrayExample {
    public static void main(String[] args) {

        int[] secondArr = {1,2,3};
        System.out.println("secondArr[0]: "+ secondArr[0]);
        System.out.println("secondArr[1]: "+ secondArr[1]);
        System.out.println("secondArr[2]: "+ secondArr[2]);

        int[] firstArr = new int[3];
        firstArr[0] = 4;
        firstArr[1] =  5;
        firstArr[2] = 6;
        System.out.println("firstArr[0]: "+ secondArr[0]);
        System.out.println("firstArr[1]: "+ secondArr[1]);
        System.out.println("firstArr[2]: "+ secondArr[2]);

        int[][] firstArr2D = new int[3][2];
        firstArr2D[0][0] = 7;
        firstArr2D[0][1] =  8;
        firstArr2D[1][0] = 9;
        firstArr2D[1][1] =  10;
        firstArr2D[2][0] = 11;
        firstArr2D[2][1] =  12;
        System.out.println("firstArr2D[0][0]: "+ firstArr2D[0][0]);
        System.out.println("firstArr2D[0][1]: "+ firstArr2D[0][1]);
        System.out.println("firstArr2D[1][0]: "+ firstArr2D[1][0]);

        int[][] secondArr2D = {{13,14},{14,15},{16,17}};
        System.out.println("secondArr2D[0][0]: "+ secondArr2D[0][0]);
        System.out.println("secondArr2D[0][1]: "+ secondArr2D[0][1]);
        System.out.println("secondArr2D[1][0]: "+ secondArr2D[1][0]);
    }
}
