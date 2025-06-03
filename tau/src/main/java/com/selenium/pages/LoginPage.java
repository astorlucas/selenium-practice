package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void setUsername(String username){
        driver.findElement(By.id("username")).sendKeys(username);
    }

    public void setPassword(String password){
        driver.findElement(By.id("password")).sendKeys(password);
    }

    public SecureAreaPage clickLoginButton(){
        driver.findElement(By.cssSelector("#login button")).click();
        return new SecureAreaPage(driver);
    }
}