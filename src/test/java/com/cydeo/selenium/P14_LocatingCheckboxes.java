package com.cydeo.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P14_LocatingCheckboxes {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cydeo.com/checkboxes");

        WebElement checkbox1 = driver.findElement(By.id("box1"));
        System.out.println("Before checkbox1.isSelected() = " + checkbox1.isSelected());
        checkbox1.click();
        System.out.println("After checkbox1.isSelected() = " + checkbox1.isSelected());

        WebElement checkbox2 = driver.findElement(By.id("box2"));
        System.out.println("Before checkbox2.getAttribute() = " + checkbox2.getAttribute("checked"));
        checkbox2.click();
        System.out.println("After checkbox2.getAttribute() = " + checkbox2.getAttribute("checked"));

        if (checkbox1.isSelected()){
            System.out.println("checkbox is already selected");
        } else {
            checkbox1.click();
        }

       //driver.quit();

    }
}
