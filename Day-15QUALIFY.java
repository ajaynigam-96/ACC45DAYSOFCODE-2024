import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);
        
        // Input the number of test cases
        int T = sc.nextInt();
        
        // Process each test case
        for (int i = 0; i < T; i++) {
            // Read X (required score), A (number of easy problems solved), B (number of hard problems solved)
            int X = sc.nextInt();  // Required score to qualify
            int A = sc.nextInt();  // Number of easy problems solved
            int B = sc.nextInt();  // Number of hard problems solved
            
            // Calculate total score
            int totalScore = A * 1 + B * 2;
            
            // Determine if Chef qualifies
            if (totalScore >= X) {
                System.out.println("Qualify");
            } else {
                System.out.println("NotQualify");
            }
        }
        
        // Close the scanner
        sc.close();
    }
}
