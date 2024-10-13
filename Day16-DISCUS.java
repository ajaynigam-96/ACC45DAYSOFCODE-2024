import java.util.Scanner;

class Main { // Remove public and rename class to Main
    public static void main(String[] args) {
        // Initialize Scanner to read input
        Scanner sc = new Scanner(System.in);
        
        // Read number of test cases
        int T = sc.nextInt();
        
        // Iterate over each test case
        for (int i = 0; i < T; i++) {
            // Read three integers A, B, and C (distances of throws)
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            
            // Find the maximum of A, B, and C
            int maxDistance = Math.max(A, Math.max(B, C));
            
            // Output the maximum distance
            System.out.println(maxDistance);
        }
        
        // Close the scanner
        sc.close();
    }
}
