import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int T = scanner.nextInt();

        // Process each test case
        for (int i = 0; i < T; i++) {
            // Read the integer N
            int N = scanner.nextInt();

            // Reverse the integer using string manipulation
            int reversedNumber = reverseNumber(N);

            // Output the reversed number
            System.out.println(reversedNumber);
        }

        // Close the scanner
        scanner.close();
    }

    // Function to reverse the digits of a number
    public static int reverseNumber(int N) {
        int reversed = 0;

        // Keep extracting the last digit and constructing the reversed number
        while (N > 0) {
            int lastDigit = N % 10;
            reversed = reversed * 10 + lastDigit;
            N = N / 10;
        }

        return reversed;
    }
}
