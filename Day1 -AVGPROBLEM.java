import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            double average = (a + b) / 2.0;

            if (average > c) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}