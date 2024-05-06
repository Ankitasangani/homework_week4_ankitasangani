package homework_week4;

import java.util.Scanner;

/**
 * 2. -Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */


public class MinAndMaxInputChallenge {

    public static void main(String[] args) {
        minMaxNumber();
    }


    public static void minMaxNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers or -10 to stop: ");
        int number = scanner.nextInt();
        int min = number;
        int max = number;

        // Endless while loop
        while (number != 10) {

            // Update the maximum number if the input is greater than the current maximum
            if (number > max) {
                max = number;
            }
            // Update the minimum number if the input is less than the current minimum
            if (number < min) {
                min = number;
            }
            System.out.println("Enter numbers or -10 to stop:  ");
            number = scanner.nextInt();
        }

        if (max != -10 && min != -10) {
            // Print the minimum and maximum numbers entered by the use
            System.out.println("Minimum number entered: " + min);
            System.out.println("Maximum number entered: " + max);
        }
        scanner.close();
    }
}




















