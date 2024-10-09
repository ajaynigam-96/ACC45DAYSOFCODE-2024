import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            int X = scanner.nextInt();

            int remainingCandies = N - X;
            if (remainingCandies <= 0) {
                System.out.println(0);
            } else {
                int packetsNeeded = (int) Math.ceil((double) remainingCandies / 4);
                System.out.println(packetsNeeded);
            }
        }
    }
}