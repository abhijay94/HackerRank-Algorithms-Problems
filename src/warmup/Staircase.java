package warmup;

import java.util.Scanner;

public class Staircase {

    /*
     * Complete the staircase function below.
     */
    static void staircase(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= n - i; k++) {
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine().trim());

        staircase(n);
    }
}
