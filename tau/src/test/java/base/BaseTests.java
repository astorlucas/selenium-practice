package base;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.google.common.io.Files;
import com.selenium.pages.HomePage;
import com.selenium.utils.WindowManager;

public class BaseTests {

    protected WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        homePage = new HomePage(driver);
    }

    @AfterClass
    protected void tearDown() {
        driver.quit();
    }

    @AfterMethod
    protected void takeScreenshot(ITestResult result) {
        var camera = (TakesScreenshot) driver;
        File screenshot = camera.getScreenshotAs(OutputType.FILE);
        System.out.println("Screenshot taken");
        System.out.println(screenshot.getAbsolutePath());
        try {
            File directory = new File("resources/screenshots");
            if (!directory.exists()) {
                directory.mkdirs();
            }
            Files.move(screenshot, new File("resources/screenshots/" + result.getName() + ".png"));
        } catch (IOException e) {
            System.out.println("Failed to move screenshot: " + e.getMessage());
            System.out.println("Source file exists: " + screenshot.exists());
            System.out.println("Source file path: " + screenshot.getAbsolutePath());
            e.printStackTrace();
        }
    }

    @AfterMethod
    protected void recordFailure(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            takeScreenshot(result);
        }
    }

    public WindowManager getWindowManager() {
        return new WindowManager(driver);
    }

}
