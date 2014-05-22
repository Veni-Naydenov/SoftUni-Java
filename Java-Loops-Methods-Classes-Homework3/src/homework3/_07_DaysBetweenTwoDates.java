/*
 Problem 7.	Days between Two Dates
 Write a program to calculate the difference between two dates in number of days.
 The dates are entered at two consecutive lines in format day-month-year.
 Days are in range [1…31]. Months are in range [1…12]. Years are in range [1900…2100].

 */
package homework3;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class _07_DaysBetweenTwoDates {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        String startDate = inputScanner.next();
        String endDate = inputScanner.next();

        String[] startArr = startDate.split("-");
        int dayStart = Integer.parseInt(startArr[0]);
        int monthStart = Integer.parseInt(startArr[1]);
        int yearStart = Integer.parseInt(startArr[2]);

        String[] endArr = endDate.split("-");
        int dayEnd = Integer.parseInt(endArr[0]);
        int monthEnd = Integer.parseInt(endArr[1]);
        int yearEnd = Integer.parseInt(endArr[2]);

        Calendar c1 = Calendar.getInstance();
        c1.set(yearStart, monthStart, dayStart);
        Calendar c2 = Calendar.getInstance();
        c2.set(yearEnd, monthEnd, dayEnd);

        Date d1 = c1.getTime();
        Date d2 = c2.getTime();

        long diff = d2.getTime() - d1.getTime();
        long noofdays = (long) (diff / (1000 * 24 * 60 * 60));
        System.out.println(noofdays);
    }
}
