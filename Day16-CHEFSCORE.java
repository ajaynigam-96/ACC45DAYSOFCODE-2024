import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a scanner to read input
        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        int T = sc.nextInt();
        
        // Loop through each test case
        for (int t = 0; t < T; t++) {
            // Read values for N, X, and Y
            int N = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            
            // Check if Y is divisible by X and if the quotient is within range [0, N]
            if (Y % X == 0 && Y / X <= N) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        // Close the scanner
        sc.close();
    }
}
