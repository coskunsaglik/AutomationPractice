package com.cydeo.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P05_LocateElementsById {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://google.com");
        WebElement luckyText = driver.findElement(By.className("RNmpXc"));
        String text = luckyText.getAttribute("value");
        if (text.equals("Kendimi Şanslı Hissediyorum")){
            System.out.println("Test passed");
        }else{
            System.out.println("Test failed");
        }


    }
}
