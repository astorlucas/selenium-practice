package com.selenium.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {

    private WebDriver driver;

    public HoversPage(WebDriver driver){
        this.driver = driver;
    }

    public void hoverOverFigure(int index){
        List<WebElement> figures = driver.findElements(By.className("figure"));
        WebElement figure = figures.get(index);
        Actions actions = new Actions(driver);
        actions.moveToElement(figure).perform();
    }

    public class FigureCaption{
        private WebElement header;
        private WebElement link;

        public FigureCaption(WebElement header, WebElement link){
            this.header = header;
            this.link = link;
        }

        public boolean isCaptionDisplayed(){
            return header.isDisplayed() && link.isDisplayed();
        }

        public String getTitle(){
            return header.getText();
        }

        public String getLinkUrl(){
            return link.getAttribute("href");
        }

        public void clickLink(){
            link.click();
        }
    }
}
