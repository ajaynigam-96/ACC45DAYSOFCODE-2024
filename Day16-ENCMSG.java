import java.util.Scanner;

class Main { // Changed public class EncodingMessage to class Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        int T = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        
        // Process each test case
        for (int t = 0; t < T; t++) {
            // Read the length of the string (not used directly)
            int N = sc.nextInt();
            sc.nextLine(); // Consume the newline character
            
            // Read the message string
            String S = sc.nextLine();
            
            // Step 1: Swap characters
            StringBuilder swapped = new StringBuilder(S);
            for (int i = 0; i < N - 1; i += 2) {
                char temp = swapped.charAt(i);
                swapped.setCharAt(i, swapped.charAt(i + 1));
                swapped.setCharAt(i + 1, temp);
            }
            
            // Step 2: Replace each character
            StringBuilder encoded = new StringBuilder();
            for (int i = 0; i < swapped.length(); i++) {
                char ch = swapped.charAt(i);
                // Perform the transformation (a <-> z, b <-> y, etc.)
                char transformed = (char) ('a' + ('z' - ch));
                encoded.append(transformed);
            }
            
            // Output the encoded message
            System.out.println(encoded.toString());
        }
        
        // Close the scanner
        sc.close();
    }
}
