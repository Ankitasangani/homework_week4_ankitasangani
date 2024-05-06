package homework_week4;

/**
 * 9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class Programme9_FibonacciNumber {

    public static void main(String[] args) {
        int number = 20;
        System.out.println("Fibonacci sequence of " + number + " terms: ");
        printFibonacci(number);
    }


    // Static method with params
    public static void printFibonacci(int number) {
        int a = 1;
        int b = 1;

        for (int i = 0; i < number; i++) {
            System.out.println(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }

    }
}
