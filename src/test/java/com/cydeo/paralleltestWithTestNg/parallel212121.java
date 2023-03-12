package com.cydeo.paralleltestWithTestNg;

import com.cydeo.base.TestBase;
import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class parallel212121 extends TestBase {


    @Test()
    public void testOnChromeWithBrowserStackUrl()
    {
        System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");

        driver.get("https://www.browserstack.com/");
        System.out.println("this is the test related to chrome browserstack homepage"+ " " +Thread.currentThread().getId());

    }

    @Test()
    public void testOnChromeWithBrowserStackSignUp ()
    {

        System.setProperty("webdriver.firefox.driver", ".\\Driver\\firefoxdriver.exe");

        driver.get("https://www.browserstack.com/users/sign_up");
        driver.findElement(By.id("user_full_name")).sendKeys("<name>");
        driver.findElement(By.id("user_email_login")).sendKeys("<login email id>");
        driver.findElement(By.id("user_password")).sendKeys("<password>");
        System.out.println("this is the test related to chrome browserstack login"+ " " +Thread.currentThread().getId());

    }

    @AfterClass
    public void close()
    {
        driver.quit();
    }
}
