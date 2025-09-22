package org.example.ATJAVA.util;

public class DateUtil {

    public static boolean isLeapYear(int year) {

        // Condition to calculate leap year
        return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
    }
}
