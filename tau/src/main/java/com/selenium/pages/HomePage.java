package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private By formAuthenticationLink = By.linkText("Form Authentication");

    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }


    public LoginPage clickFormAuthenticationLink(){
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
    }

    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

    public DropdownPage clickDropdownLink(){
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }

    public HoversPage clickHoversLink(){
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    public AlertsPage clickAlertsLink(){
        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }

    public KeyPressesPage clickKeyPressesLink(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    public FileUploadPage clickFileUploadLink(){
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }

    public WysiwygEditorPage clickWysiwygEditorLink(){
        clickLink("WYSIWYG Editor");
        return new WysiwygEditorPage(driver);
    }   

    public DynamicLoadingPage clickDynamicLoadingLink(){
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }

    public LargeAndDeepDomPage clickLargeAndDeepDomLink(){
        clickLink("Large & Deep DOM");
        return new LargeAndDeepDomPage(driver);
    }

    public InfiniteScrollPage clickInfiniteScrollLink(){
        clickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }

    public MultipleWindowsPage clickMultipleWindowsLink(){
        clickLink("Multiple Windows");
        return new MultipleWindowsPage(driver);
    }

}
