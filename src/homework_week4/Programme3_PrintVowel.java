package homework_week4;

import java.util.Scanner;

/**
 * 3. Write a Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */
public class Programme3_PrintVowel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a alphabet: ");
        String input = scanner.nextLine();
        alphabet(input);
        scanner.close();
    }

    // Static method with params, if else condition to check vowel and consonant
    public static void alphabet(String input) {
        if (input.length() == 1 && !Character.isLetter(input.charAt(0))) {
            System.out.println("Error: Input should be a single letter from the alphabet.");
        } else {
            char letter = Character.toLowerCase(input.charAt(0));
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                System.out.println("Input letter is Vowel");
            } else {
                System.out.println("Input letter is Consonant");
            }
        }
    }
}




























