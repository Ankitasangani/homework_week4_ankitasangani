package homework_week4;

/**
 * 13. Shared Digit
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
 * within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 * otherwise, the method should return false.
 * EXAMPLE INPUT/OUTPUT:
 * * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
 * * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
 * * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
 * NOTE: The method hasSharedDigit should be defined as public static
 */


public class Programme13_SharedDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23)); // true
        System.out.println(hasSharedDigit(9, 99));  // false
        System.out.println(hasSharedDigit(15, 55)); // true
    }


    // static method to check if a number is within the range of 10 to 99
    public static boolean isValid(int number) {
        if (number >= 10 && number <= 99) {
            return true;
        } else {
            return false;
        }
    }

    //static method to check if two numbers share a digit
    public static boolean hasSharedDigit(int a, int b) {
        // Check if either number is not within the range of 10 to 99
        if (!isValid(a) || !isValid(b)) {
            return false;
        }

        while (a > 0) {
            int digit = a % 10;
            int num = b;


            while (num > 0) {
                if (num % 10 == digit) {
                    return true;
                }
                num = num / 10;
            }
            a = a / 10;
        }
        return false;
    }
}


















































