package implementation;

import java.util.Scanner;

public class BirthdayChocolate {

    static int solve(int n, int[] s, int d, int m) {
        int sumCount = 0;
        for (int i = 0; i < n - m + 1; i++) {
            int sum = s[i];
            for (int j = i + 1; j < i + m; j++) {
                sum += s[j];
            }
            if (sum == d) {
                sumCount++;
            }
        }
        return sumCount;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for (int s_i = 0; s_i < n; s_i++) {
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(n, s, d, m);
        System.out.println(result);
    }
}
