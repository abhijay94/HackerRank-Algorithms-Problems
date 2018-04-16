package implementation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static java.util.stream.IntStream.of;

public class ClimbingTheLeaderboard {
    /*
     * Complete the climbingLeaderboard function below.
     */
    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int[] array = of(scores).distinct().toArray();
        int[] ranks = new int[alice.length];
        int i = array.length - 1;
        int j = 0;
        for (int score : alice) {
            while (i >= 0) {
                if (score >= array[i]) i--;
                else {
                    ranks[j] = i + 2;
                    break;
                }
            }
            if (i < 0) ranks[j] = 1;
            j++;
        }
        return ranks;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\HackerRank\\Algorithms\\HackerRank-Algorithms-Problems\\src\\output\\output.txt"));

        int scoresCount = Integer.parseInt(scanner.nextLine().trim());

        int[] scores = new int[scoresCount];

        String[] scoresItems = scanner.nextLine().split(" ");

        for (int scoresItr = 0; scoresItr < scoresCount; scoresItr++) {
            int scoresItem = Integer.parseInt(scoresItems[scoresItr].trim());
            scores[scoresItr] = scoresItem;
        }

        int aliceCount = Integer.parseInt(scanner.nextLine().trim());

        int[] alice = new int[aliceCount];

        String[] aliceItems = scanner.nextLine().split(" ");

        for (int aliceItr = 0; aliceItr < aliceCount; aliceItr++) {
            int aliceItem = Integer.parseInt(aliceItems[aliceItr].trim());
            alice[aliceItr] = aliceItem;
        }

        int[] result = climbingLeaderboard(scores, alice);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bufferedWriter.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();
    }

}
