package com.cydeo.tests;

import com.cydeo.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNg_Selenium extends TestBase {


    @Test
    public void googleTitle(){
        driver.get("https://google.com");
        String expectedtitle= "Googl";
        String actualtitle = driver.getTitle();
        Assert.assertEquals(actualtitle,expectedtitle,"Google title is not matching");
//if actual and expected is not matching, in that case, write the above message

    }
}
