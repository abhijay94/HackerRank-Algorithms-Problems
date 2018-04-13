package implementation;

import java.util.Scanner;

public class PickingNumbers {

    static int pickingNumbers(int[] a) {
        int[] numbersCount = new int[100];
        for (int i : a) {
            numbersCount[i]++;
        }
        int maxPair = 0;
        for (int i = 0; i < 99; i++) {
            int sum = numbersCount[i] + numbersCount[i + 1];
            if (sum > maxPair) {
                maxPair = sum;
            }
        }
        return maxPair;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        int result = pickingNumbers(a);
        System.out.println(result);
        in.close();
    }
}
