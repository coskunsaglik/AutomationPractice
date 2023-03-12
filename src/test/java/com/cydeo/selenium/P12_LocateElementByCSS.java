package com.cydeo.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P12_LocateElementByCSS {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com");

        //search for cyde
        WebElement searchBox = driver.findElement(By.cssSelector("input[name='q']"));
        searchBox.sendKeys("Cydeo"+ Keys.ENTER);


        //verify Cydeo LİNK TEXT is appeared in the results
        WebElement cydeoText = driver.findElement(By.cssSelector("a[href= 'https://cydeo.com/']>h3"));

        if (cydeoText.getText().equals("Cydeo")){
            System.out.println("Text is passed");
        }else {
            System.out.println("Text is failed");
        }

        driver.quit();


    }

}
