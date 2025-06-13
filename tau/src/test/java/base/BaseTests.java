package base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.selenium.pages.HomePage;
import com.selenium.utils.WindowManager;

public class BaseTests {

    protected WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    protected void setUp(){
        //System.setProperty("webdriver.chrome.driver","resources/chrome.exe");
        driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");

        homePage = new HomePage(driver);

        // WebElement inputsLink = driver.findElement(By.linkText("Inputs"));
        // inputsLink.click();

        List<WebElement> links = driver.findElements(By.tagName("a"));


        for (WebElement link : links) {
            System.out.println(link.getText());
        }


        System.out.println(driver.getTitle());
        //driver.quit();
    }

    @AfterClass
    protected void tearDown(){
        driver.quit();
    }

    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }

}
