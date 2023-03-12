package com.cydeo.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P01_BasicNavigation {

    public static void main(String[] args) {
        //set up chrome and create Webdriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //navigate.to(url)
        driver.navigate().to("https://www.google.com");
        //driver.get(url)
       // driver.get("https://www.google.com");
        //navigate.back()
        driver.navigate().back(); // back to previously browser tab
        //navigate.forward()
        driver.navigate().forward(); // and again go to the google page

        //navigate.refresh()
        driver.navigate().refresh();
    }
}
