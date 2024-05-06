package homework_week4;

import java.util.Scanner;

/**
 * 12. Write a programme to input any number and check if it is prime or not.
 * (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
 * prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
 * 17.... are the prime numbers.)
 */
public class Programme12_PrimeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        if (prime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        scanner.close();
    }

    public static boolean prime(int number) {
        // If the number is less than or equal to 1, it's not prime
        if (number <= 1) {
            return false;
        } else if (number <= 3) {     // If the number is 2 or 3, it's prime
            return true;
        } else if (number % 2 == 0 || number % 3 == 0) {   // If the number is divisible by 2 or 3, it's not prime
            return false;
        }

        // Check divisibility by numbers of the form 6k ± 1 up to the square root of the number
        int i = 5;
        while (i * i <= number) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
            i = i + 6;
        }
        return true;

    }
}
