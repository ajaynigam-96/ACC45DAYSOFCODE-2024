import java.util.Scanner;

public class Main {

    // Function to calculate the maximum trace of any square submatrix
    public static int maxTrace(int[][] matrix, int n) {
        int maxTraceVal = Integer.MIN_VALUE;

        // Iterate over all possible submatrix sizes l x l
        for (int l = 1; l <= n; l++) {  // size of the submatrix
            // Iterate over all possible top-left corners (r, c)
            for (int r = 0; r <= n - l; r++) {  // top row index
                for (int c = 0; c <= n - l; c++) {  // left column index
                    int currentTrace = 0;
                    // Calculate the trace of the submatrix starting at (r, c) of size l x l
                    for (int i = 0; i < l; i++) {
                        currentTrace += matrix[r + i][c + i];
                    }
                    // Update maximum trace found
                    maxTraceVal = Math.max(maxTraceVal, currentTrace);
                }
            }
        }
        return maxTraceVal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        int t = sc.nextInt();
        
        // Loop over each test case
        while (t-- > 0) {
            // Read the size of the matrix
            int n = sc.nextInt();
            int[][] matrix = new int[n][n];

            // Read the matrix values
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            // Calculate and print the maximum trace for the current test case
            System.out.println(maxTrace(matrix, n));
        }
        
        sc.close();
    }
}
