package implementation;

import java.io.IOException;
import java.util.Scanner;

public class DrawingBook {

    /*
     * Complete the pageCount function below.
     */
    static int pageCount(int n, int p) {
        int turnsFront = Math.abs((p) / 2);
        if (n % 2 == 0) {
            n++;
        }
        int turnsBack = Math.abs((p - (n)) / 2);
        return turnsFront < turnsBack ? turnsFront : turnsBack;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int result = pageCount(n, p);

        System.out.println(result);

        scanner.close();
    }
}
