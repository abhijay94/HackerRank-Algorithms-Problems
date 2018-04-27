package implementation;

import java.util.Scanner;

public class SequenceEquation {

    static int[] permutationEquation(int[] p) {
        int size = p.length;
        int[] result = new int[size];
        int[] p_inverse = new int[size + 1];
        for (int i = 1; i <= size; i++) {
            p_inverse[p[i - 1]] = i;
        }

        for (int i = 1; i <= size; i++) {
            result[i - 1] = p_inverse[p_inverse[i]];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] p = new int[n];
        for (int p_i = 0; p_i < n; p_i++) {
            p[p_i] = in.nextInt();
        }
        int[] result = permutationEquation(p);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }
}
