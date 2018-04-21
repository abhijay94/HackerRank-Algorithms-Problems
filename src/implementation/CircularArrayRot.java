package implementation;

import java.util.Scanner;

public class CircularArrayRot {

    static int[] circularArrayRotation(int[] a, int[] m, int k) {
        int n = a.length;
        int [] result = new int[m.length];
        for (int i =0; i < m.length; i++) {
            result[i] = a[(n - (k % n)+ m[i]) % n];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] m = new int[q];
        for(int m_i = 0; m_i < q; m_i++){
            m[m_i] = in.nextInt();
        }
        int[] result = circularArrayRotation(a, m, k);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
        in.close();
    }
}
