package com.cydeo.tests;

import com.cydeo.base.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FileUpload extends TestBase {


    @Test
    public void testFileUpload() throws InterruptedException {
        driver.get("https://practice.cydeo.com/upload");
        String filePath = "C:\\Users\\LENOVO\\Desktop/aaa.docx";
        driver.findElement(By.id("file-upload")).sendKeys(filePath);

        Thread.sleep(3000);
        driver.findElement(By.id("file-submit")).click();
        Thread.sleep(3000);
    }
}
