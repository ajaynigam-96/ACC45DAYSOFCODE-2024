import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a scanner to read input
        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        int T = sc.nextInt();
        
        // Loop through each test case
        for (int t = 0; t < T; t++) {
            // Read the number of people and number of tiles
            int N = sc.nextInt();
            int X = sc.nextInt();
            
            // Check if the tiles can be evenly distributed
            if (X % N == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        // Close the scanner
        sc.close();
    }
}
