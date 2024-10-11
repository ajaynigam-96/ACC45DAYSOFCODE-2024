import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int T = scanner.nextInt();
        
        // Process each test case
        for (int i = 0; i < T; i++) {
            // Read Alice's, Bob's, and Charlie's demands
            int A = scanner.nextInt(); // Alice's minimum temperature
            int B = scanner.nextInt(); // Bob's maximum temperature
            int C = scanner.nextInt(); // Charlie's minimum temperature
            
            // Check if there is any temperature that satisfies all demands
            if (Math.max(A, C) <= B) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        
        // Close the scanner
        scanner.close();
    }
}
