package org.example.ATJAVA.util;

public class StringUtil {

    public static String repeat(String str, int count) {

        if (count < 0) {
            throw new IllegalArgumentException("Count cannot be negative");
        }

        String result = "";

        for (int i = 0; i < count; i++) {
            result += str;
        }
        return result;
    }
}
