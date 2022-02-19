package com.cybertek.tests.d6_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertions {

    @Test
    public void test1() {
        Assert.assertEquals("one", "one");
    }

    @Test
    public void test2() {
        Assert.assertEquals(1, 1);
    }

    @Test
    public void test4() {
        Assert.assertTrue(1==1);
    }
    @Test
    public void test3() {
        Assert.assertFalse(1>1);
    }
    @Test
    public void test5() {
        Assert.assertTrue(1==1);
    }

}

