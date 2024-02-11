package com.selenium.first;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGMethods {
    @BeforeSuite
    public void beforeSuiteDemo() {
        System.out.println("before suite");
    }

    @BeforeTest
    public void beforeTestDemo() {
        System.out.println("before test");
    }

    @BeforeClass
    public void beforeClassDemo() {
        System.out.println("before Class");
    }

    @BeforeMethod
    public void beforeMethodDemo() {
        System.out.println("before Method");
    }

    @Test(enabled = true, groups = {"smoketest"} /*dependsOnMethods = {"test2"}*/)
    public void test1() {
        System.out.println("Test 1 ");
        Assert.assertEquals(1, 1);
        System.out.println("hello");
        Assert.assertTrue(false


        );

    }

    @Test(enabled = true, groups = {"regressionTest"})
    public void test2() {
        System.out.println("Test 2 ");
        Assert.assertEquals(1,1);
    }

    @DataProvider(name = "data-provider")
    public Object[][] dpMethod() {
        return new Object[][]{{"First-Value", "Achutha"}, {"Second-Value", "jfkj"}};
    }

    @Test(dataProvider = "data-provider")
    public void myTest(String val, String a) {
        System.out.println("Passed Parameter Is : " + val + a);
    }

    @AfterMethod
    public void Aftermethoddemo() {
        System.out.println("after method");
    }

    @AfterClass
    public void AfterClassDemo() {
        System.out.println("After class");
    }

    @AfterTest
    public void AftertestDemo() {
        System.out.println("After test");
    }

    @AfterSuite
    public void AfterSuiteDemo() {
        System.out.println("after suite");
    }
}
