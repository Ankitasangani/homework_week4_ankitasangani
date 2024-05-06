package homework_week4;

/**
 * 14. Write a program in Java to display the pattern like a diamond.
 * While loop
 *            *
 *           ***
 *          *****
 *         *******
 *        *********
 *       ***********
 *      *************
 *       ***********
 *        *********
 *         *******
 *          *****
 *           ***
 *            *
 */
public class Programme14_Diamond {
    public static void main(String[] args) {
        printDiamond(13);
    }

    //Static method using while loop
    public static void printDiamond(int rows) {

        int spaces = rows / 2;
        int stars = 1;

        // upper part of the diamond
        int i = 1;
        while (i <= rows) {
            int a = 0;
            while (a++ < spaces) {
                System.out.print(" ");
            }
            a = 0;
            while (a++ < stars) {
                System.out.print("*");
            }
            System.out.println();
            if (i < rows / 2 + 1) {
                spaces--;
                stars = stars + 2;
            } else {
                spaces++;
                stars = stars - 2;
            }
            i++;
        }
    }
}
