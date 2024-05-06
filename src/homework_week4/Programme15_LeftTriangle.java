package homework_week4;

/**
 * 15. Display left angle triangle of * using nested for loops
 *          *
 *        * *
 *      * * *
 *    * * * *
 *  * * * * *
 */

public class Programme15_LeftTriangle {

    public static void main(String[] args) {
        leftTriangle(5);
    }

    //Static method with nested for loops
    public static void leftTriangle(int a) {

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*"); //Printing * in a rows
            }
            System.out.println();
        }
    }
}
































