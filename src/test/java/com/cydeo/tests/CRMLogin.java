package com.cydeo.tests;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CRMLogin {

    @Test
    public void crmLogin(){
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));

        WebElement inputUserName = Driver.getDriver().findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUserName.sendKeys(ConfigurationReader.getProperty("username"));

        WebElement inputPassWord = Driver.getDriver().findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassWord.sendKeys(ConfigurationReader.getProperty("password"));

        WebElement loginBtn = Driver.getDriver().findElement(By.xpath("//input[@value='Log In']"));
        loginBtn.click();

    }



}
