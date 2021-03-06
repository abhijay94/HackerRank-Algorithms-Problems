package warmup;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DiagonalDiff {

    /*
     * Complete the diagonalDifference function below.
     */
    static int diagonalDifference(int[][] a, int n) {
        int sumPrimary = 0;
        int sumSecondary = 0;
        for (int i = 0; i < n; i++) {
            sumPrimary += a[i][i];
            sumSecondary += a[(n - 1) - i][i];
        }
        return Math.abs(sumPrimary - sumSecondary);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[][] a = new int[n][n];

        for (int aRowItr = 0; aRowItr < n; aRowItr++) {
            String[] aRowItems = scan.nextLine().split(" ");

            for (int aColumnItr = 0; aColumnItr < n; aColumnItr++) {
                int aItem = Integer.parseInt(aRowItems[aColumnItr].trim());
                a[aRowItr][aColumnItr] = aItem;
            }
        }

        int result = diagonalDifference(a, n);

        bw.write(String.valueOf(result));
        bw.newLine();

        bw.close();
    }
}
