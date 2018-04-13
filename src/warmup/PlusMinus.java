package warmup;

import java.util.Scanner;

public class PlusMinus {

    /*
     * Complete the plusMinus function below.
     */
    static void plusMinus(int[] arr) {
        float[] count = new float[3];
        for (int i : arr) {
            if (i > 0) {
                count[0]++;
            } else if (i < 0) {
                count[1]++;
            } else {
                count[2]++;
            }
        }
        int size = arr.length;
        for (float i : count) {
            System.out.println(i / size);
        }
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine().trim());

        int[] arr = new int[n];

        String[] arrItems = scan.nextLine().split(" ");

        for (int arrItr = 0; arrItr < n; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
            arr[arrItr] = arrItem;
        }

        plusMinus(arr);
    }
}
