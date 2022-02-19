package com.cybertek.tests.d6_TestNG;

import org.testng.annotations.*;

public class BeforeAftertests {
    @Test
    public void test1() {
        System.out.println(" This is first test ");
    }

    @Test
    public void test2() {
        System.out.println(" This is second test ");
    }

    @BeforeMethod
    public void setupMethod() {
        System.out.println(" Before Method ");//comes every time before each test
        System.out.println(" Open Chrome ");
    }

    @AfterMethod
    public void teardownMethod() {
        System.out.println(" After Method ");//comes every time before each test
        System.out.println(" Close Chrome ");
    }

    @BeforeClass
    public void setupClass() {
        System.out.println(" Before Class Runs only one time before everything ");
    }

    @AfterClass
    public void teardownClass() {
        System.out.println(" Before Class Runs only one time after everything ");
    }

}