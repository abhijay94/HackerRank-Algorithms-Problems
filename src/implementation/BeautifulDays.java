package implementation;

import java.util.Scanner;

public class BeautifulDays {

    static int beautifulDays(int i, int j, int k) {
        int dayCount = 0;
        for (int m = i; m <= j; m++) {
            if (Math.abs(m - reverse(m)) % k == 0) {
                dayCount++;
            }
        }
        return dayCount;
    }

    static int reverse(int n) {
        int reverse = n;
        StringBuilder num = new StringBuilder();
        num.append(n);
        num.reverse();
        return Integer.parseInt(num.toString());
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int j = in.nextInt();
        int k = in.nextInt();
        int result = beautifulDays(i, j, k);
        System.out.println(result);
        in.close();
    }
}
