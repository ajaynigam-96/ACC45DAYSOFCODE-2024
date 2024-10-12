import java.util.Scanner;

public class Main { // Changed class name to Main

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);
        
        // Input the number of test cases
        int T = sc.nextInt();
        
        // Process each test case
        for (int i = 0; i < T; i++) {
            // Read N (number of people) and X (minimum age to vote)
            int N = sc.nextInt();
            int X = sc.nextInt();
            
            // Initialize the count of eligible voters
            int eligibleCount = 0;
            
            // Read ages of people and count eligible voters
            for (int j = 0; j < N; j++) {
                int age = sc.nextInt(); // Read age of the j-th person
                if (age >= X) {
                    eligibleCount++; // Increment count if age is greater than or equal to X
                }
            }
            
            // Print the number of eligible voters for this test case
            System.out.println(eligibleCount);
        }
        
        // Close the scanner
        sc.close();
    }
}
