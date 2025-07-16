package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class EntryAdPage {
 
    private WebDriver driver;
 
    private By modalFooter = By.className("modal-footer");
    private By closeButton = By.xpath("//p[text()='Close']");
   
 
    public EntryAdPage(WebDriver driver) {
        this.driver = driver;
    }
 
    public void closeModal() {
        WebElement footer = driver.findElement(modalFooter);
        footer.findElement(closeButton).click();
    }
}
