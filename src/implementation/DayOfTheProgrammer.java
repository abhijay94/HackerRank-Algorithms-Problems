package implementation;

import java.util.Scanner;

public class DayOfTheProgrammer {

    static String solve(int year) {
        String leap = "12.09.";
        String nonleap = "13.09.";
        String date = "";
        if (year < 1918) {
            if (year % 4 == 0) {
                date = leap;
            } else {
                date = nonleap;
            }
        } else if (year == 1918) {
            date = "26.09.";
        } else if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            date = leap;
        } else {
            date = nonleap;
        }
        return date + year;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }
}
