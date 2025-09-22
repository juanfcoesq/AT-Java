package org.example.ATJAVA.util;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest { //Unit test class for StringUtil

    @Test
    public void repeat_string_once() { //Test method for repeat function
        Assert.assertEquals("hello", StringUtil.repeat("hello", 1));
    }
    @Test
    public void repeat_string_multiple() { //Test method for repeat function
        Assert.assertEquals("hellohellohello", StringUtil.repeat("hello", 3));
    }
    @Test
    public void repeat_string_zero() { //Test method for repeat function
        Assert.assertEquals("", StringUtil.repeat("hello", 0));
    }
    @Test(expected = IllegalArgumentException.class) //If the expected result is an exception
    public void repeat_string_negative() { //Test method for repeat function
        StringUtil.repeat("hello", -1);
    }
}