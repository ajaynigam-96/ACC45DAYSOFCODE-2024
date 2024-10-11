import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int T = scanner.nextInt();

        // Process each test case
        for (int i = 0; i < T; i++) {
            // Read the seat number X
            int X = scanner.nextInt();
            
            // Check if the passenger is closer to seat 1 or seat 100
            if (X <= 50) {
                System.out.println("LEFT");
            } else {
                System.out.println("RIGHT");
            }
        }
        
        // Close the scanner
        scanner.close();
    }
}
