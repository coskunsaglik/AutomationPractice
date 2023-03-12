package com.cydeo.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P02_CloseAndQuitBrowser {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // navigate to a practice page that open new tab
        // this practice url will open and wait 3 seconds and open new tab
        driver.get("https://practice.cydeo.com/open_new_tab");

        Thread.sleep(5000);// wait 5 sec.

        driver.close();//closing any current tab

        driver.quit();//close all browser window opened driver


    }
}
