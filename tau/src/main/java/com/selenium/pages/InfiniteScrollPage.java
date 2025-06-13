package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage {

    private WebDriver driver;
    private By textBlocks = By.className("jscroll-added");

    public InfiniteScrollPage(WebDriver driver){
        this.driver = driver;
    }

    public void scrollToBottom(int index){
        String script = "window.scrollTo(0, document.body.scrollHeight)";
        var jsExecutor = (JavascriptExecutor) driver;
        while (getNumberOfTextBlocks() < index){
            jsExecutor.executeScript(script);
            try {
                Thread.sleep(100);
            }
        }
    }

    private int getNumberOfTextBlocks(){
        return driver.findElements(textBlocks).size();
    }
}
