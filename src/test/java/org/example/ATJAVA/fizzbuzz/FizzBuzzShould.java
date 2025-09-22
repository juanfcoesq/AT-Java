package org.example.ATJAVA.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzShould {

    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void if_is_divisible_by_3() {
        assertEquals("Fizz", fizzBuzz.fizzBuzz(3));
    }
    @Test
    public void if_is_divisible_by_5() {
        assertEquals("Buzz", fizzBuzz.fizzBuzz(5));
    }
    @Test
    public void if_is_divisible_by_3_and_5() {
        assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(15));
    }
}