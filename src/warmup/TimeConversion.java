package warmup;

import java.util.Scanner;

public class TimeConversion {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        int h = Integer.parseInt(s.substring(0, 2));
        String ms = s.substring(2, 8);
        String z = s.substring(8, 10);
        String convertDate = "";

        if (z.equals("PM") && h != 12) {
            convertDate = (h + 12) + ms;
        } else if (z.equals("AM") && h == 12) {
            convertDate = "00" + ms;
        } else {
            convertDate = s.substring(0, 8);
        }
        return convertDate;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String time = "12:05:39AM";
        System.out.println(timeConversion(time));
    }
}
