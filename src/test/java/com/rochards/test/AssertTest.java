package com.rochards.test;

import org.junit.Assert;
import org.junit.Test;

public class AssertTest {

    @Test
    public void testAssertArrayEquals() {
        byte[] expected = "test".getBytes();
        byte[] actual = "test".getBytes();
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAssertEquals() {
        String expected = "test";
        String actual = "test";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAssertFalse() {
        Assert.assertFalse(false);
    }

    @Test
    public void testAssertNotNull() {
        Assert.assertNotNull(new Object());
    }

    @Test
    public void testAssertSame() {
        Integer number = 756;
        Assert.assertSame(number, number);
    }

    @Test
    public void testAssertNotSame() {
        Assert.assertNotSame(new Object(), new Object());
    }

    @Test
    public void testAssertNull() {
        Assert.assertNull(null);
    }
}
