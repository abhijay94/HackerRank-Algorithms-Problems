package implementation;

import java.util.Scanner;

public class UtopianTree {
    static int utopianTree(int n) {
        if (n == 0) return 1;
        else if (n % 2 == 0) {
            return utopianTree(n - 1) + 1;
        } else {
            return utopianTree(n - 1) * 2;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            int result = utopianTree(n);
            System.out.println(result);
        }
        in.close();
    }
}
