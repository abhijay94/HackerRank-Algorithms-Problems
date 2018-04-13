package implementation;

import java.util.Scanner;

public class AppleOrange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        int applCount = 0;
        int oranCount = 0;

        for (int apple_i = 0; apple_i < m; apple_i++) {
            apple[apple_i] = in.nextInt();
            if (apple[apple_i] >= s - a && apple[apple_i] <= t - a) {
                applCount++;
            }
        }
        int[] orange = new int[n];
        for (int orange_i = 0; orange_i < n; orange_i++) {
            orange[orange_i] = in.nextInt();
            if (Math.abs(orange[orange_i]) >= b - t && orange[orange_i] < 0
                    && Math.abs(orange[orange_i]) <= b - s) {
                oranCount++;
            }
        }

        System.out.println(applCount + "\n" + oranCount);

    }
}
