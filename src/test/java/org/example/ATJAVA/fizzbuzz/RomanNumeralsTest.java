package org.example.ATJAVA.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumeralsTest {

    @Test
    public void convert_n_to_Roman() {
        assertEquals("I", RomanNumerals.arabicToRoman(1));
        assertEquals("II", RomanNumerals.arabicToRoman(2));
        assertEquals("III", RomanNumerals.arabicToRoman(3));
        assertEquals("IV", RomanNumerals.arabicToRoman(4));
        assertEquals("V", RomanNumerals.arabicToRoman(5));
        assertEquals("IX", RomanNumerals.arabicToRoman(9));
        assertEquals("X", RomanNumerals.arabicToRoman(10));
        assertEquals("XL", RomanNumerals.arabicToRoman(40));
        assertEquals("L", RomanNumerals.arabicToRoman(50));
        assertEquals("XC", RomanNumerals.arabicToRoman(90));
        assertEquals("C", RomanNumerals.arabicToRoman(100));
        assertEquals("CD", RomanNumerals.arabicToRoman(400));
        assertEquals("D", RomanNumerals.arabicToRoman(500));
        assertEquals("CM", RomanNumerals.arabicToRoman(900));
        assertEquals("M", RomanNumerals.arabicToRoman(1000));
        assertEquals("MCMXCIV", RomanNumerals.arabicToRoman(1994));
    }
}