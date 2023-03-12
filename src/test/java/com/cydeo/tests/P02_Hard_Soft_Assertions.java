package com.cydeo.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class P02_Hard_Soft_Assertions {

    @Test
    public void hardAssertion(){
        Assert.assertEquals("apple", "app");
        System.out.println("after assertion failed");
       Assert.assertTrue("orange".equals("oranger"));
        System.out.println("after assertion failed");

    }



    @Test
    public void softAssertion(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("apple", "app");
        System.out.println("after assertion failed");
        softAssert.assertTrue("orange".equals("oranger"));
        System.out.println("after assertion failed");

        softAssert.assertAll();
    }


}
