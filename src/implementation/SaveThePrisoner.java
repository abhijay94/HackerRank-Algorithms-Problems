package implementation;

import java.util.Scanner;

public class SaveThePrisoner {
    static int saveThePrisoner(int n, int m, int s) {
        int a = s + m - 1;
        if (a < n) {
            return a;
        } else {
            if (a % n == 0) {
                return n;
            }
            return a % n;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            int m = in.nextInt();
            int s = in.nextInt();
            int result = saveThePrisoner(n, m, s);
            System.out.println(result);
        }
    }

}
