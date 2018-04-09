package warmup;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxSum {

    /*
     * Complete the miniMaxSum function below.
     */
    static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        long sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println((sum - arr[4]) + " " + (sum - arr[0]));
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scan.nextLine().split(" ");

        for (int arrItr = 0; arrItr < 5; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
            arr[arrItr] = arrItem;
        }

        miniMaxSum(arr);
    }
}
