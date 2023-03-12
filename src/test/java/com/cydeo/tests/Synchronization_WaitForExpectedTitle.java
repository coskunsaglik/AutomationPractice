package com.cydeo.tests;

import com.cydeo.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;
import static org.testng.AssertJUnit.assertTrue;

public class Synchronization_WaitForExpectedTitle extends TestBase {
    @Test
    public void test_WaitForExpectedTitle(){
        driver.get("https://practice.cydeo.com/dynamic_loading");
        driver.findElement(By.partialLinkText("Example 7")).click();
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(titleIs("Dynamic title"));

        WebElement doneMsj = driver.findElement(By.id("alert"));
        assertTrue(doneMsj.isDisplayed());
    }
}
