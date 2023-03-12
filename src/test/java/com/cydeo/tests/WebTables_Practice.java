package com.cydeo.tests;

import com.cydeo.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class WebTables_Practice extends TestBase {

    @Test
    public void webTablesTest(){
        driver.get("https://practice.cydeo.com/tables");

        WebElement row3Cell2= driver.findElement(By.xpath("//table[@id='table1']//tbody//tr[3]//td[2]"));
        System.out.println("Before clicking row3Cell2.getText() = " + row3Cell2.getText());

        WebElement firstName = driver.findElement(By.xpath("(//span[.='First Name'])[1]"));
        firstName.click();

       row3Cell2= driver.findElement(By.xpath("//table[@id='table1']//tbody//tr[3]//td[2]"));
        System.out.println("After clicking row3Cell2.getText() = " + row3Cell2.getText());


        WebElement jasonCell = driver.findElement(By.xpath("//table[@id='table1']//td[.='Jason']"));
        System.out.println("jasonCell.getText() = " + jasonCell.getText());

        List<WebElement> allRow3Cell = (List<WebElement>) driver.findElement(By.xpath("//table[@id='table1']//tbody//tr[3]//td"));
        for (WebElement eachCell : allRow3Cell){
            System.out.println("eachCell.getText() = " + eachCell.getText());
        }


    }
}
