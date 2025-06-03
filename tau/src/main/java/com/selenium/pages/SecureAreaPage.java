package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {

    private WebDriver driver;

    public SecureAreaPage(WebDriver driver){
        this.driver = driver;
    }


    public String getAlertText(){
        return driver.findElement(By.id("flash")).getText();
    }
}
