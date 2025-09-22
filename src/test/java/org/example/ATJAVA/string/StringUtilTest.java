package org.example.ATJAVA.string;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilTest {

    @Test
    public void is_empty() {
        assertTrue(StringUtil.isEmpty(""));
    }
    @Test
    public void is_not_empty() {
        assertFalse(StringUtil.isEmpty("abc"));
    }
    @Test
    public void is_null() {
        assertTrue(StringUtil.isEmpty(null));
    }
    @Test
    public void espaces() {
        assertFalse(StringUtil.isEmpty("      "));
    }
}