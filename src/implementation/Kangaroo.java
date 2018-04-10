package implementation;

import java.util.Scanner;

public class Kangaroo {
    static String kangaroo(int x1, int v1, int x2, int v2) {
        String result = "NO";
        int xRel = x1 - x2;
        int vRel = v2 - v1;
        if (vRel != 0 && (xRel % vRel == 0) && (xRel * vRel > 0)) {
            result = "YES";
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}
