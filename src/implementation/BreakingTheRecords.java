package implementation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class BreakingTheRecords {

    static int[] breakingRecords(int[] score) {
        int maxScore = -1; //Min possible value of score is 0
        int minScore = 100000001; //Max possible value of score is 10000000 as per the problem
        int[] scoreBreak = new int[2]; //Array of max and min scores
        Arrays.fill(scoreBreak, -1);
        for (int s : score) {
            if (s > maxScore) {
                maxScore = s;
                scoreBreak[0]++;
            }
            if (s < minScore) {
                minScore = s;
                scoreBreak[1]++;
            }
        }
        return scoreBreak;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] score = new int[n];

        String[] scoreItems = scan.nextLine().split(" ");

        for (int scoreItr = 0; scoreItr < n; scoreItr++) {
            int scoreItem = Integer.parseInt(scoreItems[scoreItr].trim());
            score[scoreItr] = scoreItem;
        }

        int[] result = breakingRecords(score);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bw.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bw.write(" ");
            }
        }

        bw.newLine();

        bw.close();
    }
}
