package homework_week4;

/**
 * 6. Write a program in Java to display the pattern like a triangle with a number.
 * For eg.
 * Input number of rows: 10
 * Expected Output:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 123456
 * 1234567
 * 12345678
 * 123456789
 * 12345678910
 */


public class Programme6_TriangleWithNumber {

    public static void main(String[] args) {
        printTriangle(10);
    }

    //Static method
    public static void printTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            System.out.println();
            for (int k = 1; k <= i; k++) {
                System.out.print(k); //Printing number in a rows
            }
        }
    }
}















