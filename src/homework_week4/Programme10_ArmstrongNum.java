package homework_week4;

import java.util.Scanner;

/**
 * 10. Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */
public class Programme10_ArmstrongNum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        if (armstrongNumber(number)) {
            System.out.println(number + " is an armstrong number.");
        } else {
            System.out.println(number + " is not an armstrong number");
        }
        scanner.close();
    }


    // Static method with return type boolean and with 1 params to check a number is Armstrong or not
    public static boolean armstrongNumber(int number) {
        int number1 = number;
        int sum = 0;

        // Calculate sum of cubes of each digit
        while (number1 != 0) {
            int digit = number1 % 10;
            sum = (digit * digit * digit) + sum;
            number1 = number1 / 10;
        }

        // Checking if number is Armstrong or not
        if (sum == number) {
            return true;
        } else {
            return false;
        }

    }
}







