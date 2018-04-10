package implementation;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class SockMerchant {

    static int sockMerchant(int n, int[] ar) {
        HashMap<Integer, Integer> socksCount = new HashMap<>();
        for (int s : ar) {
            if (socksCount.containsKey(s)) {
                socksCount.put(s, socksCount.get(s) + 1);
            } else {
                socksCount.put(s, 1);
            }
        }

        int pairCount = 0;

        Collection c = socksCount.values();
        Iterator itr = c.iterator();
        while (itr.hasNext()) {
            int pair = (int) itr.next();
            pairCount += (pair / 2);
        }

        return pairCount;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
