package com.cydeo.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P11_LocaterPractice1 {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://app.vytrack.com/user/login");

        //enter your username: "abcd"
        WebElement username = driver.findElement(By.id("prependedInput"));
        username.sendKeys("abcd");

        WebElement password = driver.findElement(By.id("prependedInput2"));
        password.sendKeys("abcd");

        WebElement loginBtn = driver.findElement(By.id("_submit"));
        loginBtn.click();

        //verify the massage "ınvalid username or password
        WebElement alert = driver.findElement(By.className("alert"));
        if (alert.getText().equals("Invalid user name or password.")){
            System.out.println("massage is passed");
        }else {
            System.out.println( "massage is failed");
        }

        //verify URL contains "vytrack"
        String actualURL = driver.getCurrentUrl();
        if (actualURL.contains("vytrack")){
            System.out.println("URL is passed");
        }else{
            System.out.println("URL is failed");
        }

        driver.findElement(By.partialLinkText("Forgot")).click();

        //verify title is "forgot password"
        if (driver.getTitle().equals("Forgot your password?")) {
            System.out.println("Title is correct");

        }else{
            System.out.println("Title is not correct");
        }
    }


}
