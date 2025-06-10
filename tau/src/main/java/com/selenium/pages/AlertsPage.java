package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {

    private WebDriver driver;
    private By triggerAlertButton = By.xpath("//button[text()='Click for JS Alert']");
    private By triggerConfirmButton = By.xpath("//button[text()='Click for JS Confirm']");
    private By triggerPromptButton = By.xpath("//button[text()='Click for JS Prompt']");
    private By resultText = By.id("result");

    public AlertsPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickTriggerAlertButton(){
        driver.findElement(triggerAlertButton).click();
    }

    public void acceptAlertButton(){
        driver.switchTo().alert().accept();
    }

    public String getResult() {
        return driver.findElement(resultText).getText();
    }

    public void clickTriggerConfirmButton(){
        driver.findElement(triggerConfirmButton).click();
    }

    public void clickDismissAlertButton(){
        driver.switchTo().alert().dismiss();
    }

    public String getConfirmText(){
        return driver.switchTo().alert().getText();
    }

}
