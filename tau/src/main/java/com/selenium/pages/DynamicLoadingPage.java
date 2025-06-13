package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {

    private WebDriver driver;
    private String linkXpath = "//a[contains(text(),'%s')]";
    private By link = By.xpath(String.format(linkXpath, "Example 1"));

    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }


    public Example1Page clickExample1Link(){
        driver.findElement(link).click();
        return new Example1Page(driver);
    }

}
