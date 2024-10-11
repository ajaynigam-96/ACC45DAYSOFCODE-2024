import java.util.Scanner;
import java.util.Arrays;

class UpsAndDowns {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        int T = sc.nextInt();
        
        // Loop over each test case
        while (T-- > 0) {
            // Read the size of the array
            int N = sc.nextInt();
            int[] A = new int[N];
            
            // Read the array elements
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            
            // Sort the array
            Arrays.sort(A);
            
            // Rearrange the array
            int[] result = new int[N];
            int left = 0;
            int right = N - 1;
            
            // Fill elements according to the required condition
            for (int i = 0; i < N; i++) {
                if (i % 2 == 0) {
                    result[i] = A[left++];
                } else {
                    result[i] = A[right--];
                }
            }
            
            // Output the result for the current test case
            for (int i = 0; i < N; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
