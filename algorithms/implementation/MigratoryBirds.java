package implementation;

import java.util.Scanner;

public class MigratoryBirds {

    static int migratoryBirds(int n, int[] ar) {
        int[] birdCount = new int[5];
        for (int i = 0; i < n; i++) {
            birdCount[ar[i] - 1]++;
        }
        int max = 0;
        int commonBird = 1;
        for (int i = 0; i < 5; i++) {
            if (birdCount[i] > max) {
                max = birdCount[i];
                commonBird = i + 1;
            }
        }
        return commonBird;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
