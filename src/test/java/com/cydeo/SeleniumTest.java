package com.cydeo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {

        // 1- setting up the web driver manager

        WebDriverManager.chromedriver().setup();
        //manuel:  System.setProperty("webdriver.chrome.driver", "/Users/cybertek/Desktop/chromedriver");

        // 2- create instance of the chrome driver
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");


    }


}
