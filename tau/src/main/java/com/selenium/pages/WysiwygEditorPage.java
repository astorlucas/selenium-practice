package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class WysiwygEditorPage {

    private WebDriver driver;
    private String editorFrame = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By decreaseIndentButton = By.cssSelector("[aria-label='Decrease indent']");

    public WysiwygEditorPage(WebDriver driver) {
        this.driver = driver;
    }

    public void switchToEditorFrame() {
        driver.switchTo().frame(editorFrame);
    }

    public void switchToMainArea() {
        driver.switchTo().parentFrame();
    }

    public void switchToDefaultFrame() {
        driver.switchTo().defaultContent();
    }

    public void clearTextArea() {
        switchToEditorFrame();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement textAreaElement = wait.until(ExpectedConditions.presenceOfElementLocated(textArea));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].innerHTML = '';", textAreaElement);
        switchToDefaultFrame();
    }

    public void setTextArea(String text) {
        switchToEditorFrame();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement textAreaElement = wait.until(ExpectedConditions.presenceOfElementLocated(textArea));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String currentText = (String) js.executeScript("return arguments[0].innerHTML;", textAreaElement);
        js.executeScript("arguments[0].innerHTML = arguments[1] + arguments[2];", 
            textAreaElement, currentText, text);
        switchToMainArea();
    }

    public String getTextArea() {
        switchToEditorFrame();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement textAreaElement = wait.until(ExpectedConditions.presenceOfElementLocated(textArea));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String text = (String) js.executeScript("return arguments[0].innerHTML;", textAreaElement);
        switchToMainArea();
        return text;
    }

    public void clickDecreaseIndentButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(decreaseIndentButton));
        button.click();
    }
}
