package homework_week4;

/**
 * 8. Display right angle triangle of @ using nested for loops
 *
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */

public class Programme8_RightTriangle {

    public static void main(String[] args) {
        printTriangle(5);
    }

    //Static method with nested for loops
    public static void printTriangle(int a) {
        for (int i = 0; i < a + 1; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print("@"); //Printing @ in a rows
            }
            System.out.println("");
        }
    }
}
