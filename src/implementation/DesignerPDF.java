package implementation;

import java.util.Scanner;

public class DesignerPDF {
    static int designerPdfViewer(int[] h, String word) {
        int area = 0;
        char [] letters = word.toCharArray();
        int maxHeight = 0;
        for(char c : letters) {
            if (h[c - 'a'] > maxHeight) {
                maxHeight = h[c - 'a'];
            }
        }
        return maxHeight * letters.length;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int h_i = 0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        int result = designerPdfViewer(h, word);
        System.out.println(result);
        in.close();
    }
}
