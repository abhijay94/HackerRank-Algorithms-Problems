package implementation;

import java.util.Scanner;

public class CountingValleys {

    static int countingValleys(int n, String s) {
        int height = 0;
        int valleyCount = 0;
        char[] steps = s.toCharArray();
        for (char c : steps) {
            int temp = height;
            if (c == 'U') {
                height++;
            } else {
                height--;
            }
            if (height == 0 && temp == -1) {
                valleyCount++;
            }
        }
        return valleyCount;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int result = countingValleys(n, s);
        System.out.println(result);
        in.close();
    }
}
