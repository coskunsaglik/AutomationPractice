package com.cydeo.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P13_LocateElementByXPATH {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com");

        WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
        searchBox.sendKeys("cydeo"+ Keys.ENTER);

        WebElement cydeoText = driver.findElement(By.xpath("h3[.='Cydeo']"));
        if (cydeoText.getText().equals("Cydeo")){
            System.out.println("Text is appeared");
        }else {
            System.out.println("Text did not appeared");
        }
driver.quit();


    }


}
