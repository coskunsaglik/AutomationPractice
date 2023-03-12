package com.cydeo.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p07_LocateElementClassName {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com");

        WebElement className = driver.findElement(By.className("gNO89b"));

        if (className.getText().equals("Google'da Ara")){
            System.out.println("Text appear correctly");
        }else {
            System.out.println("Text does not appear correctly");
        }
    }



}
