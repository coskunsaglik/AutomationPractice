package com.cydeo.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P17_LocatingMultipleDropDown {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cydeo.com/dropdown");

        WebElement multiİtemDrop = driver.findElement(By.name("Languages"));

        Select multiİtemSelect = new Select(multiİtemDrop);

        System.out.println("multiİtemSelect.isMultiple() = " + multiİtemSelect.isMultiple());

        multiİtemSelect.selectByIndex(2);
        multiİtemSelect.selectByValue("ruby");
        multiİtemSelect.selectByVisibleText("Python");

        multiİtemSelect.deselectByIndex(2);
        multiİtemSelect.deselectByValue("ruby");
       // multiİtemSelect.deselectAll(); remove the all select option


    }
}
