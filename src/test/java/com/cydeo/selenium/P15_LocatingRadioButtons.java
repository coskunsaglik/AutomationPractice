package com.cydeo.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class P15_LocatingRadioButtons {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cydeo.com/radio_buttons");

        WebElement blueradio = driver.findElement(By.id("blue"));
        System.out.println("before blueradio.isSelected() = " + blueradio.isSelected());
        blueradio.click();

        System.out.println("after blueradio.isSelected() = " + blueradio.isSelected());
        WebElement redradio = driver.findElement(By.id("red"));
        System.out.println("before redradio.isSelected() = " + redradio.isSelected());
        redradio.click();
        System.out.println("after redradio.isSelected() = " + redradio.isSelected());

        System.out.println("after blueradio.isSelected() = " + blueradio.isSelected());

        WebElement greenradio = driver.findElement(By.id("green"));
        greenradio.click();
        System.out.println("greenradio.isSelected() = " + greenradio.isSelected());
        System.out.println("greenradio.isEnabled() = " + greenradio.isEnabled());

        System.out.println("-------------------------");

        List<WebElement> allcolors = driver.findElements(By.name("color"));
        System.out.println("allcolors.size() = " + allcolors.size());

        for (WebElement eachColor : allcolors){
            System.out.println("eachColor.getAttribute(\"id\") = " + eachColor.getAttribute("id"));
            System.out.println("eachColor.isEnabled() = " + eachColor.isEnabled());
            System.out.println("eachColor.isSelected() = " + eachColor.isSelected());

        }


    }
}
