import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int T = scanner.nextInt();
        
        for (int i = 0; i < T; i++) {
            // Read profits for companies A, B, C, and D
            int P = scanner.nextInt();
            int Q = scanner.nextInt();
            int R = scanner.nextInt();
            int S = scanner.nextInt();
            
            // Calculate the total profit
            int totalProfit = P + Q + R + S;
            
            // Check for monopoly condition
            if (P > totalProfit - P || Q > totalProfit - Q || R > totalProfit - R || S > totalProfit - S) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        scanner.close(); // Close the scanner
    }
}
