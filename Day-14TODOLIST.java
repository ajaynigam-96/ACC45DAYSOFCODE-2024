import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int T = scanner.nextInt();
        
        // Process each test case
        for (int i = 0; i < T; i++) {
            // Read the number of problems
            int N = scanner.nextInt();
            
            int count = 0; // Count of problems to remove
            // Process the difficulty ratings
            for (int j = 0; j < N; j++) {
                int difficulty = scanner.nextInt();
                // If difficulty is 1000 or more, it should be removed
                if (difficulty >= 1000) {
                    count++;
                }
            }
            
            // Output the result for the current test case
            System.out.println(count);
        }
        
        // Close the scanner
        scanner.close();
    }
}
