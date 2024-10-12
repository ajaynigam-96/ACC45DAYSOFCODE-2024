import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        int T = sc.nextInt();
        
        // Process each test case
        for (int i = 0; i < T; i++) {
            // Read the number of bits
            int N = sc.nextInt();
            
            // Check if the number of bits is divisible by 4
            if (N % 4 == 0) {
                System.out.println("Good");
            } else {
                System.out.println("Not Good");
            }
        }
        
        sc.close(); // Close the scanner
    }
}
