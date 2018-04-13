package implementation;

import java.util.Scanner;

public class MagicSquares {

    static final int[][] MAGIC_SQUARES = {{8, 1, 6, 3, 5, 7, 4, 9, 2},
            {6, 1, 8, 7, 5, 3, 2, 9, 4}, {4, 9, 2, 3, 5, 7, 8, 1, 6},
            {2, 9, 4, 7, 5, 3, 6, 1, 8}, {8, 3, 4, 1, 5, 9, 6, 7, 2},
            {4, 3, 8, 9, 5, 1, 2, 7, 6}, {6, 7, 2, 1, 5, 9, 8, 3, 4},
            {2, 7, 6, 9, 5, 1, 4, 3, 8}};

    static int formingMagicSquare(int[] s) {
        int[] cost = new int[8];
        int minCost = 46;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 9; j++) {
                if (MAGIC_SQUARES[i][j] != s[j]) {
                    cost[i] += Math.abs(MAGIC_SQUARES[i][j] - s[j]);
                }
            }
        }

        for (int c : cost) {
            if (c < minCost) {
                minCost = c;
            }
        }
        return minCost;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] s = new int[9];
        for (int s_i = 0; s_i < 9; s_i++) {
            s[s_i] = in.nextInt();
        }
        int result = formingMagicSquare(s);
        System.out.println(result);
        in.close();
    }
}
