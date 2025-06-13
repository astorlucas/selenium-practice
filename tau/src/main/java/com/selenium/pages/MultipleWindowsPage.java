package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleWindowsPage {

    private WebDriver driver;
    private By link = By.linkText("Click Here");

    public MultipleWindowsPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickHereLink(){
        driver.findElement(link).click();
    }
}
