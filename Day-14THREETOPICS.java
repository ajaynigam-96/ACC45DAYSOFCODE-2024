import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the input values A, B, C, and X
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int X = scanner.nextInt();
        
        // Check if the topic X is one of the topics A, B, or C
        if (X == A || X == B || X == C) {
            System.out.println("Yes"); // Chef can win
        } else {
            System.out.println("No"); // Chef cannot win
        }
        
        scanner.close(); // Close the scanner
    }
}
