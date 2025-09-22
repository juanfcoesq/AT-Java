package org.example.ATJAVA.util;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class DateUtilLeapYearShould {

    /*
    All years divisible by 400 are leap years (e.g., 1600 and 2000).
    All years divisible by 100 but not by 400 are not leap years (e.g., 1700, 1800, and 1900).
    All years divisible by 4 but not by 100 are leap years (e.g., 1996 and 2004).
    All years not divisible by 4 are NOT leap years (e.g., 2017 and 2018).
     */

    @Test
    public void return_true_when_is_divisible_by_400() {
        assertThat(DateUtil.isLeapYear(1600), is(true));
        assertThat(DateUtil.isLeapYear(2000), is(true));
        assertThat(DateUtil.isLeapYear(2400), is(true));
    }
    @Test
    public void return_false_when_is_divisible_by_100_not_by_400(){
        assertThat(DateUtil.isLeapYear(1700), is(false));
        assertThat(DateUtil.isLeapYear(1800), is(false));
        assertThat(DateUtil.isLeapYear(1900), is(false));
    }
    @Test
    public void return_true_when_is_divisible_by_4_not_by_100(){
        assertThat(DateUtil.isLeapYear(1996), is(true));
        assertThat(DateUtil.isLeapYear(2004), is(true));
        assertThat(DateUtil.isLeapYear(2020), is(true));
    }
    @Test
    public void return_false_when_not_divisible_by_4(){
        assertThat(DateUtil.isLeapYear(2017), is(false));
        assertThat(DateUtil.isLeapYear(2018), is(false));
        assertThat(DateUtil.isLeapYear(2019), is(false));
    }
}