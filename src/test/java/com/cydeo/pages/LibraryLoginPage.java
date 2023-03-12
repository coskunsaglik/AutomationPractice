package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {
    public LibraryLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy (id="inputEmail")
    public WebElement email;

    @FindBy (id="inputPassword")
    public WebElement password;

    @FindBy (xpath = "//*[@id=\"login-form\"]/button")
    public WebElement signInBtn;

    @FindBy ( xpath = "//*[@id=\"login-form\"]/div[2]/div")
    public WebElement errorMsg;

    public void login(String userName, String passWord){
        email.sendKeys(userName);
        password.sendKeys(passWord);
        signInBtn.click();
    }

}
