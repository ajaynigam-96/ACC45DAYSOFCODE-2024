// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int t = 0; t < T; t++) {
            String S = scanner.next();
            int[] count = new int[52]; // 26 for lowercase and 26 for uppercase
            for (int i = 0; i < S.length(); i++) {
                char c = S.charAt(i);
                if (c >= 'a' && c <= 'z') {
                    count[c - 'a']++;
                } else {
                    count[c - 'A' + 26]++;
                }
            }
            int cost = 0;
            for (int i = 0; i < 52; i++) {
                cost += (count[i] + 1) / 2;
            }
            System.out.println(cost);
        }
    }
}