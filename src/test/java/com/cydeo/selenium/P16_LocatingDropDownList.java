package com.cydeo.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P16_LocatingDropDownList {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cydeo.com/dropdown");

        WebElement dropDown = driver.findElement(By.id("dropdown"));
        Select selectObj = new Select(dropDown);

        selectObj.selectByIndex(2);
        selectObj.selectByValue("2");
        selectObj.selectByVisibleText("Option 2");

       String expectedOpt = "Option 2";
       String actualObt = selectObj.getFirstSelectedOption().getText();

       if (actualObt.equals(expectedOpt)){
           System.out.println("option 2 selection passed");
       }else {
           System.out.println("option 2 selection failed");
       }


    }

}
