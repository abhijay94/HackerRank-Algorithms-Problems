package implementation;

import java.util.Scanner;

public class ViralAdvertising {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = calculateX(n);
        System.out.println(x);

    }

    public static int calculateX(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 2;
        else {
            return (int) (calculateX(n - 1) + Math.floor(calculateM(n) / 2));
        }
    }

    public static int calculateM(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 5;
        else {
            return (int) (Math.floor(calculateM(n - 1) / 2)) * 3;
        }
    }
}
