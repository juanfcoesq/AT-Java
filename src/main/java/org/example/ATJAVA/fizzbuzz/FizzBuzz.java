package org.example.ATJAVA.fizzbuzz;

public class FizzBuzz {

    public static String fizzBuzz(int n) {

        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        }
        if (n % 5 == 0) {
            return "Buzz";
        }
        if (n % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(n);
    }
}
