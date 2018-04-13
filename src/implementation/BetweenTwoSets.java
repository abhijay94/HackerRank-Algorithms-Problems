package implementation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BetweenTwoSets {

    /*
     * Complete the getTotalX function below.
     */
    static int getTotalX(int[] a, int[] b) {
        int lcm_a = lcm(a);
        int gcd_b = gcd(b);
        int count = 0;
        for (int i = 1; lcm_a * i <= gcd_b; i++) {
            if (gcd_b % (lcm_a * i) == 0) count++;
        }
        return count;
    }

    //Function to return gcd of array
    static int lcm(int[] element_array) {
        int lcm = 1;
        int divisor = 2;

        while (true) {
            int counter = 0;
            boolean divisible = false;

            for (int i = 0; i < element_array.length; i++) {

                if (element_array[i] == 0) {
                    return 0;
                } else if (element_array[i] < 0) {
                    element_array[i] = element_array[i] * (-1);
                }
                if (element_array[i] == 1) {
                    counter++;
                }

                if (element_array[i] % divisor == 0) {
                    divisible = true;
                    element_array[i] = element_array[i] / divisor;
                }
            }

            if (divisible) {
                lcm = lcm * divisor;
            } else {
                divisor++;
            }

            if (counter == element_array.length) {
                return lcm;
            }
        }
    }

    // Function to return gcd of a and b
    static int gcdTwo(int a, int b) {
        if (a == 0)
            return b;
        return gcdTwo(b % a, a);
    }

    static int gcd(int arr[]) {
        int size = arr.length;
        int result = arr[0];
        for (int i = 1; i < size; i++)
            result = gcdTwo(arr[i], result);

        return result;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scan.nextLine().split(" ");

        int n = Integer.parseInt(nm[0].trim());

        int m = Integer.parseInt(nm[1].trim());

        int[] a = new int[n];

        String[] aItems = scan.nextLine().split(" ");

        for (int aItr = 0; aItr < n; aItr++) {
            int aItem = Integer.parseInt(aItems[aItr].trim());
            a[aItr] = aItem;
        }

        int[] b = new int[m];

        String[] bItems = scan.nextLine().split(" ");

        for (int bItr = 0; bItr < m; bItr++) {
            int bItem = Integer.parseInt(bItems[bItr].trim());
            b[bItr] = bItem;
        }

        int total = getTotalX(a, b);

        bw.write(String.valueOf(total));
        bw.newLine();

        bw.close();
    }
}
